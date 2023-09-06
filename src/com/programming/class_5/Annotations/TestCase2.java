

package com.class5.Annotation;

 

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import java.util.Objects;

 

public class ObjectToJSONConverter {


    public String convertToJSON(Object obj) {

        try {

            CheckIfSerializable(obj);

            initializeObject(obj);

            return getJsonString(obj);

        }

        catch(Exception e) {

            System.out.println(e.getMessage());

        }

    }


    private void CheckIfSerializable(Object obj) throws JsonSerializableException {

        if(Objects.isNull(obj)) {

            throw new JsonSerializableException("Can't serialize null object");

        }


        Class<?> clazz = obj.getClass();

        if(!clazz.isAnnotationPresent(JsonSerializable.class)) {

            throw new JsonSerializableException("This class " + clazz.getSimpleName() + " is not annotated with " + " JSON Serializable annotation");

        }

    }


    private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {

        Class<?> clazz = object.getClass();

        for(Method method: clazz.getDeclaredMethods()) {

            method.setAccessible(true);

            method.invoke(object);

        }

    }

}


[Yesterday 17:55] Shubham Garg

Person Class

[Yesterday 17:55] Shubham Garg

package com.class5.Annotation;

 

@JsonSerializable

public class Person {

    @JsonElement

    private String firstName;

    @JsonElement

    private String lastName;

    @JsonElement(key = "personAge")

    private String age;

    private String address;

    

    public Person(String firstName, String lastName) {

        super();

        this.firstName = firstName;

        this.lastName = lastName;

    }

    

    public Person(String firstName, String lastName, String age) {

        

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;

    }

    

    @Init

    private void initNames() {

        this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);

        this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1);

    }

    

    public String getFirstName() {

        return firstName;

    }

 

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

 

    public String getLastName() {

        return lastName;

    }

 

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

 

    public String getAge() {

        return age;

    }

 

    public void setAge(String age) {

        this.age = age;

    }

 

    public String getAddress() {

        return address;

    }

 

    public void setAddress(String address) {

        this.address = address;

    }

    

}

 

[17:54] Divya Vanam

@Test

public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {

Person person = new Person("core", "java","28");

ObjectToJSONConverter serializer = new ObjectToJSONConverter();

String jsonString = serializer.convertToJSON(person);

assertEquals("{\"personAge\":\"28\",\"firstName\":\"Core\","

+ "\"lastName\":\"Java\"}", jsonString);

 

}

[18:05] Shubham Garg

package com.class5.Annotation;

 

import static org.junit.Assert.*;

 

import org.junit.Test;

 

public class TestCase {

 

    @Test

    public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {

        Person person = new Person("core" , "java","28");

        ObjectToJSONConverter serializer = new ObjectToJSONConverter();

        String jsonString = serializer.convertToJSON(person);

        assertEquals("(\"personAge\":\"28\",\"firstName\":\"Core\"," + "\"lastName\":\"Java\")", jsonString);


        }

 

}


[18:07] Shubham Garg

package com.class5.Annotation;

 

import java.lang.reflect.Field;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import java.util.HashMap;

import java.util.Map;

import java.util.Objects;

import java.util.stream.Collectors;

 

public class ObjectToJSONConverter {


    public String convertToJSON(Object obj) throws IllegalArgumentException, IllegalAccessException {

        try {

            CheckIfSerializable(obj);

            initializeObject(obj);


        }

        catch(Exception e) {

            System.out.println(e.getMessage());


        }

        return getJsonString(obj);


    }


    private void CheckIfSerializable(Object obj) throws JsonSerializableException {

        if(Objects.isNull(obj)) {

            throw new JsonSerializableException("Can't serialize null object");

        }


        Class<?> clazz = obj.getClass();

        if(!clazz.isAnnotationPresent(JsonSerializable.class)) {

            throw new JsonSerializableException("This class " + clazz.getSimpleName() + " is not annotated with " + " JSON Serializable annotation");

        }

    }


    private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {

        Class<?> clazz = object.getClass();

        for(Method method: clazz.getDeclaredMethods()) {

            method.setAccessible(true);

            method.invoke(object);

        }

    }


    private String getJsonString(Object object) throws IllegalArgumentException, IllegalAccessException {

        Class<?> clazz = object.getClass();

        Map<String, String> jsonElementMap = new HashMap<>();

        for(Field field : clazz.getDeclaredFields()) {

            field.setAccessible(true);

            if(field.isAnnotationPresent(JsonElement.class)) {

                jsonElementMap.put(getKey(field), (String)field.get(object));

            }

        }


        String jsonString = jsonElementMap.entrySet()

                .stream()

                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")

                .collect(Collectors.joining(","));

        return "(" + jsonString + ")";

    }

    private String getKey(Field field) {

        String value = field.getAnnotation(JsonElement.class).key();

        return value.isEmpty() ? field.getName() : value;

    }

}
