package lk.ijse;

import java.io.*;


public class SerializationTest {
    public static void main(String[] args) {
        try {
            // Serialization
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            MyObject myObj = new MyObject("example", 123);
            out.writeObject(myObj);
            out.close();
            fileOut.close();

            // Deserialization
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyObject deserializedObj = (MyObject) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Object: " + deserializedObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
