public class UC3_HelloApp {

    public static void main(String[] args) {

        String name;

        // Check if argument is passed
        if (args.length > 0) {
            name = args[0];
        } 
        else {
            // Default value
            name = "World";
        }

        // Display greeting
        System.out.println("Hello " + name);
    }
}