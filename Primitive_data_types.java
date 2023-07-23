package closed_lab_book;

public class Primitive_data_types {

	    public static void main(String[] args) {
	        // Declaration and initialization of primitive data types
	        byte byteVar = 10;
	        short shortVar = 100;
	        int intVar = 1000;
	        long longVar = 10000L;
	        float floatVar = 3.14f;
	        double doubleVar = 3.14159;
	        char charVar = 'A';
	        boolean booleanVar = true;

	        // Implicit type casting (Widening Conversion)
	        intVar = byteVar; // byte can be implicitly cast to int
	        longVar = intVar; // int can be implicitly cast to long
	        doubleVar = floatVar; // float can be implicitly cast to double

	        // Explicit type casting (Narrowing Conversion)
	        byteVar = (byte) intVar; // int needs to be explicitly cast to byte
	        shortVar = (short) longVar; // long needs to be explicitly cast to short
	        floatVar = (float) doubleVar; // double needs to be explicitly cast to float

	        // Displaying the values after type casting
	        System.out.println("byteVar: " + byteVar);
	        System.out.println("shortVar: " + shortVar);
	        System.out.println("intVar: " + intVar);
	        System.out.println("longVar: " + longVar);
	        System.out.println("floatVar: " + floatVar);
	        System.out.println("doubleVar: " + doubleVar);
	        System.out.println("charVar: " + charVar);
	        System.out.println("booleanVar: " + booleanVar);
	    }
	}





