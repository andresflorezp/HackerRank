import java.util.*;
//Este archivo necesita Instalr un paquete pero en hackerRank ya esta instalado
import com.sun.java.util.jar.pack.Package.Class.Method;
public class Solution {
    public static void main(String[] args) {
        Class student = Student.class; 
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        

        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}