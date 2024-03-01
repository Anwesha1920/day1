//// Create an exception named TypeException
//package car;
//
//class TypeException extends Exception {
//    @Override
//    public String toString() {
//        return "Vehicle Type Not Set";
//    }
//}
//
//// Base class Vehicles
//class Vehicles {
//    // Data members
//     String type;
//     String model_no;
//     String model_name;
//     String owner_name;
//     String owner_details;
//
//    // Constructor with parameters
//    public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
//        this.model_no = model_no;
//        this.model_name = model_name;
//        this.owner_name = owner_name;
//        this.owner_details = owner_details;
//    }
//
//    // Default constructor
//    public Vehicles() {
//        // Initialize default values if needed
//    }




//
//    // Getter for type
//    public String get_type() {
//        return type;
//    }
//
//    // Retrieve method (returns "null" as a placeholder)
//    public String retrieve() {
//        return "null";
//    }
//}// Subclass Car (inherits from Vehicles)
//class Car extends Vehicles {
//    // Constructor with parameters
//    public Car(String model_no, String model_name, String owner_name, String owner_details) {
//        // Call the superclass constructor
//        super(model_no, model_name, owner_name, owner_details);
//    }
//
//    // Getter for type
//    public String get_type() {
//        return type;
//    }
//
//    // Setter for type
//    public void set_type(String type) {
//        this.type = type;
//    }
//
//    // Override the retrieve method
//    @Override
//    public String retrieve() {
//        try {
//            if (type == null) {
//                throw new TypeException();
//            }
//            // Concatenate relevant information
//            return model_no + ", " + model_name + ", " + owner_details + ", " + owner_name;
//        } catch (TypeException e) {
//            return e.toString();
//        }
//    }
//}
//
//// Example usage
//public class Main {
//    public static void main(String[] args) {
//        Car myCar = new Car("123", "Toyota Camry", "John Doe", "License Plate: ABC123");
//        myCar.set_type("Sedan"); // Set the type
//        System.out.println("Car details: " + myCar.retrieve());
//    }
//}
