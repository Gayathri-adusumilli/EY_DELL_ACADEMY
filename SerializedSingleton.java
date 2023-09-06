package com.programming.class_9;

import java.io.*;

class SerializedSingleton1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private static class SingletonHelper {
		private static final SerializedSingleton1 instance = new SerializedSingleton1();
	}

	public static SerializedSingleton1 getInstance() {
		return SingletonHelper.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}

public class SerializedSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton1 instance1 = SerializedSingleton1.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC.txt"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("C:/Files/ABC.txt"));
		SerializedSingleton1 instance2 = (SerializedSingleton1) in.readObject();
		in.close();

		System.out.println("Instance1 - Hashcodevalue" + instance1.hashCode());
		System.out.println("Instance2 - Hashcodevalue" + instance2.hashCode());

	}

}
