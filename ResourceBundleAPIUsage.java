package com.programming.class_10;

 

import java.util.Locale;

import java.util.ResourceBundle;

 

public class ResourceBundleAPIUsage {

 

    public static void main(String[] args) {

        ResourceBundle rs = ResourceBundle.getBundle("com.programming.class_10.TestBundle");

        displayValues(rs);

        

        Locale italianLocale = new Locale("sv","SE");

        ResourceBundle rs2 = ResourceBundle.getBundle("com.programming.Class_10.TestBundle",italianLocale );

        displayValues(rs2);

        

    }

    

    static void displayValues(ResourceBundle bundle) {

        System.out.println("Hello Message : "+ bundle.getString("my.hello"));

        System.out.println("Hello Message : " + bundle.getString("my.bye"));

        System.out.println("Hello Message : " + bundle.getString("my.question"));

    }

}

 
