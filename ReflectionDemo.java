import java.lang.reflect.*;

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            // Load the class
            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: " + cls.getName());

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();

            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName());
            }

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}