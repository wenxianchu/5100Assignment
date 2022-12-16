class Chair {
    // Properties
    private String color;
    private String material;
    private int height;
    private int width;
    private int depth;
    private int seatHeight;
    private int seatWidth;
    private int seatDepth;
    private Leg[] legs;
    private Backrest backrest;

    // Constructor
    public Chair(String color, String material, int height, int width, int depth, int seatHeight, int seatWidth, int seatDepth) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.seatHeight = seatHeight;
        this.seatWidth = seatWidth;
        this.seatDepth = seatDepth;
        System.out.println("Creating chair instance with unique id: " + this.hashCode());
    }

    // Methods
    public void sit() {
        // Sit on chair
    }

    public void move(int x, int y) {
        // Move chair to new location
    }

    public void adjustHeight(int height) {
        // Adjust chair height
    }

    // Nested classes
    class Leg {
        // Leg properties and methods
    }

    class Backrest {
        // Backrest properties and methods
    }
}

class Circle {
    // Properties
    private int radius;
    private Center center;
    private int circumference;
    private int area;
    private String color;
    private boolean fill;
    private int outlineWidth;
    private String outlineColor;
    private int startAngle;
    private int endAngle;

    // Constructor
    public Circle(int radius, int centerX, int centerY, String color, boolean fill, int outlineWidth) {
        this.radius = radius;
        this.center = new Center(centerX, centerY);
        this.color = color;
        this.fill = fill;
        this.outlineWidth = outlineWidth;
        System.out.println("Creating circle instance with unique id: " + this.hashCode());
    }

    // Methods
    public void draw() {
        // Draw the circle
    }

    public void resize(int radius) {
        // Resize the circle
    }

    public void rotate(int angle) {
        // Rotate the circle
    }

    // Nested classes
    class Center {
        // Center properties and methods
        int centerX;
        int centerY;

        public Center(int centerX, int centerY) {
            this.centerX = centerX;
            this.centerY = centerY;
        }
    }

    class Outline {
        // Outline properties and methods
    }
}

class Car {
    // Properties
    private String make;
    private String model;
    private int year;
    private String color;
    private int numDoors;
    private int numSeats;
    private double engineSize;
    private double fuelCapacity;

    // Nested classes
    public static class Wheel {
        // Properties
        private int diameter;
        private String material;
        private double pressure;

        // Constructor
        public Wheel(int diameter, String material, double pressure) {
            this.diameter = diameter;
            this.material = material;
            this.pressure = pressure;
        }

        // Methods
        public void inflate() {
            System.out.println("Inflating wheel");
        }

        public void deflate() {
            System.out.println("Deflating wheel");
        }

        public void rotate() {
            System.out.println("Rotating wheel");
        }
    }

    public static class Door {
        // Properties
        private boolean isOpen;
        private String material;
        private Window window;

        // Nested class
        public static class Window {
            // Properties
            private boolean isOpen;
            private double tintLevel;

            // Constructor
            public Window(double tintLevel) {
                this.tintLevel = tintLevel;
            }

            // Methods
            public void open() {
                System.out.println("Opening window");
            }

            public void close() {
                System.out.println("Closing window");
            }

            public void tint() {
                System.out.println("Tinting window");
            }
        }

        // Constructor
        public Door(String material, Window window) {
            this.material = material;
            this.window = window;
        }

        // Methods
        public void open() {
            System.out.println("Opening door");
        }

        public void close() {
            System.out.println("Closing door");
        }

        public void lock() {
            System.out.println("Locking door");
        }
    }

    // Constructor
    public Car(String make, String model, int year, String color, int numDoors, int numSeats, double engineSize, double fuelCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.numDoors = numDoors;
        this.numSeats = numSeats;
        this.engineSize = engineSize;
        this.fuelCapacity = fuelCapacity;

        System.out.println("Creating new car: " + make + " " + model + " (" + year + ")");
    }

    // Methods
    public void start() {
        System.out.println("Starting car");
    }

    public void drive() {
        System.out.println("Driving car");
    }

    public void stop() {
        System.out.println("Stopping car");
    }
}

class Desk {
    // Properties
    private String material;
    private double width;
    private double depth;
    private double height;
    private int numDrawers;
    private boolean hasHutch;
    private boolean hasKeyboardTray;
    private boolean isAssembled;

    // Nested classes
    public static class Drawer {
        // Properties
        private String material;
        private double width;
        private double depth;
        private double height;
        private boolean isLocked;

        // Constructor
        public Drawer(String material, double width, double depth, double height, boolean isLocked) {
            this.material = material;
            this.width = width;
            this.depth = depth;
            this.height = height;
            this.isLocked = isLocked;
            System.out.println("Drawer ctor");
        }

        // Methods
        public void open() {
            System.out.println("Opening drawer");
        }

        public void close() {
            System.out.println("Closing drawer");
        }

        public void lock() {
            System.out.println("Locking drawer");
        }
    }

    public static class Leg {
        // Properties
        private String material;
        private double diameter;
        private double height;

        // Constructor
        public Leg(String material, double diameter, double height) {
            this.material = material;
            this.diameter = diameter;
            this.height = height;
        }

        // Methods
        public void level() {
            System.out.println("Leveling leg");
        }

        public void replace() {
            System.out.println("Replacing leg");
        }

        public void adjustHeight() {
            System.out.println("Adjusting height of leg");
        }
    }

    // Constructor
    public Desk(String material, double width, double depth, double height, int numDrawers, boolean hasHutch, boolean hasKeyboardTray, boolean isAssembled) {
        this.material = material;
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.numDrawers = numDrawers;
        this.hasHutch = hasHutch;
        this.hasKeyboardTray = hasKeyboardTray;
        this.isAssembled = isAssembled;

        System.out.println("Creating new desk with " + numDrawers + " drawers and " + (hasHutch ? "" : "no") + " hutch");
    }

    // Methods
    public void assemble() {
        System.out.println("Assembling desk");
    }

    public void disassemble() {
        System.out.println("Disassembling desk");
    }

    public void move() {
        System.out.println("Moving desk");
    }
}

class Table {
    // Properties
    public double height;
    public double length;
    public double width;
    public String color;
    public int numLegs;
    public String material;
    public String shape;
    public double weight;

    // Methods
    public void move() {
    }

    public void rotate() {
    }

    public void clean() {
    }

    // Constructor
    public Table(double height, double length, double width, String color, int numLegs, String material, String shape, double weight) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.color = color;
        this.numLegs = numLegs;
        this.material = material;
        this.shape = shape;
        this.weight = weight;
        System.out.println("Table instance created with ID: " + this.hashCode());
    }

    // Nested classes
    public class Leg {
        // Properties
        public double height;
        public double diameter;
        public String material;

        // Methods
        public void move() {
        }

        public void rotate() {
        }

        public void clean() {
        }

        // Constructor
        public Leg(double height, double diameter, String material) {
            this.height = height;
            this.diameter = diameter;
            this.material = material;
            System.out.println("Leg instance created with ID: " + this.hashCode());
        }
    }

    public class TableTop {
        // Properties
        public double length;
        public double width;
        public String material;
        public String shape;

        // Methods
        public void move() {
        }

        public void rotate() {
        }

        public void clean() {
        }

        // Constructor
        public TableTop(double length, double width, String material, String shape) {
            this.length = length;
            this.width = width;
            this.material = material;
            this.shape = shape;
            System.out.println("TableTop instance created with ID: " + this.hashCode());
        }
    }
}

class Lamp {
    private String color;
    private int height;
    private boolean isOn;
    private String type;
    private double wattage;
    private String manufacturer;
    private int yearManufactured;
    private String serialNumber;
    private boolean isDimmable;

    private class Bulb {
        private double wattage;
        private boolean isLED;
        private String color;
        private int lifespan;

        public Bulb(double wattage, boolean isLED, String color, int lifespan) {
            this.wattage = wattage;
            this.isLED = isLED;
            this.color = color;
            this.lifespan = lifespan;

            System.out.println("A new bulb has been created.");
        }

        public void setWattage(double wattage) {
            this.wattage = wattage;
        }

        public void setIsLED(boolean isLED) {
            this.isLED = isLED;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setLifespan(int lifespan) {
            this.lifespan = lifespan;
        }
    }

    private class LampShade {
        private String color;
        private String material;
        private String shape;
        private double height;

        public LampShade(String color, String material, String shape, double height) {
            this.color = color;
            this.material = material;
            this.shape = shape;
            this.height = height;

            System.out.println("A new lamp shade has been created.");
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }

    public Lamp(String color, int height, boolean isOn, String type, double wattage, String manufacturer, int yearManufactured, String serialNumber, boolean isDimmable) {
        this.color = color;
        this.height = height;
        this.isOn = isOn;
        this.type = type;
        this.wattage = wattage;
        this.manufacturer = manufacturer;
        this.yearManufactured = yearManufactured;
        this.serialNumber = serialNumber;
        this.isDimmable = isDimmable;

        System.out.println("A new lamp has been created.");
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

class DeskLamp {
    // Properties of a desk lamp
    private String color;
    private int numberOfBulbs;
    private boolean isOn;
    private int brightnessLevel;
    private String brand;
    private String material;
    private double height;
    private double width;

    // Nested class representing the bulb of a desk lamp
    public static class Bulb {
        // Properties of a bulb
        private String type;
        private int wattage;
        private boolean isDimmable;

        // Constructor for a bulb
        public Bulb(String type, int wattage, boolean isDimmable) {
            this.type = type;
            this.wattage = wattage;
            this.isDimmable = isDimmable;

            System.out.println("Created a new bulb with type: " + type + ", wattage: " + wattage + ", and isDimmable: " + isDimmable);
        }

        // Method for turning on a bulb
        public void turnOn() {
            System.out.println("Turning on the bulb");
        }

        // Method for turning off a bulb
        public void turnOff() {
            System.out.println("Turning off the bulb");
        }

        // Method for dimming a bulb
        public void dim(int level) {
            System.out.println("Dimming the bulb to level: " + level);
        }
    }

    // Constructor for a desk lamp
    public DeskLamp(String color, int numberOfBulbs, boolean isOn, int brightnessLevel, String brand, String material, double height, double width) {
        this.color = color;
        this.numberOfBulbs = numberOfBulbs;
        this.isOn = isOn;
        this.brightnessLevel = brightnessLevel;
        this.brand = brand;
        this.material = material;
        this.height = height;
        this.width = width;

        System.out.println("Created a new desk lamp with color: " + color + ", numberOfBulbs: " + numberOfBulbs + ", isOn: " + isOn + ", brightnessLevel: " + brightnessLevel + ", brand: " + brand + ", material: " + material + ", height: " + height + ", and width: " + width);
    }

    // Method for turning on a desk lamp
    public void turnOn() {
        System.out.println("Turning on the desk lamp");
    }

    // Method for turning off a desk lamp
    public void turnOff() {
        System.out.println("Turning off the desk lamp");
    }

    // Method for adjusting the brightness of a desk lamp
    public void adjustBrightness(int level) {
        System.out.println("Adjusting the brightness of the desk lamp to level: " + level);
    }
}

class House {
    // Properties of the House class
    private String address;
    private int numRooms;
    private String color;
    private int numWindows;
    private int numDoors;
    private boolean isFurnished;
    private double size;
    private String type;

    // Constructor for the House class
    public House(String address, int numRooms, String color, int numWindows, int numDoors, boolean isFurnished, double size, String type) {
        this.address = address;
        this.numRooms = numRooms;
        this.color = color;
        this.numWindows = numWindows;
        this.numDoors = numDoors;
        this.isFurnished = isFurnished;
        this.size = size;
        this.type = type;
        System.out.println("A new House instance has been created with address " + address);
    }

    // Method to get the address of the house
    public String getAddress() {
        return address;
    }

    // Method to set the address of the house
    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get the number of rooms in the house
    public int getNumRooms() {
        return numRooms;
    }

    // Nested class for the Window
    public static class Window {
        // Properties of the Window class
        private String material;
        private String color;
        private double width;
        private double height;
        private boolean isOpen;

        // Constructor for the Window class
        public Window(String material, String color, double width, double height, boolean isOpen) {
            this.material = material;
            this.color = color;
            this.width = width;
            this.height = height;
            this.isOpen = isOpen;
            System.out.println("A new Window instance has been created");
        }

        // Method to get the material of the window
        public String getMaterial() {
            return material;
        }

        // Method to set the material of the window
        public void setMaterial(String material) {
            this.material = material;
        }

        // Method to get the color of the window
        public String getColor() {
            return color;
        }
    }

    // Nested class for the Door
    public static class Door {
        // Properties of the Door class
        private String material;
        private String color;
        private double width;
        private double height;
        private boolean isOpen;

        // Constructor for the Door class
        public Door(String material, String color, double width, double height, boolean isOpen) {
            this.material = material;
            this.color = color;
            this.width = width;
            this.height = height;
            this.isOpen = isOpen;
            System.out.println("A new Door instance has been created");
        }

// Method to get the material of the door
    }
}

class Road {
    // Properties of the Road class
    private String name;
    private String type;
    private String surface;
    private double length;
    private int numLanes;
    private double speedLimit;
    private int numStreetLights;
    private int numTrafficSigns;

    // Constructor for the Road class
    public Road(String name, String type, String surface, double length, int numLanes, double speedLimit, int numStreetLights, int numTrafficSigns) {
        this.name = name;
        this.type = type;
        this.surface = surface;
        this.length = length;
        this.numLanes = numLanes;
        this.speedLimit = speedLimit;
        this.numStreetLights = numStreetLights;
        this.numTrafficSigns = numTrafficSigns;
        System.out.println("A new Road instance has been created with name " + name);
    }

    // Method to get the name of the road
    public String getName() {
        return name;
    }

    // Method to set the name of the road
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the type of the road
    public String getType() {
        return type;
    }

    // Nested class for the StreetLight
    public static class StreetLight {
        // Properties of the StreetLight class
        private String type;
        private String color;
        private double height;
        private boolean isOn;

        // Constructor for the StreetLight class
        public StreetLight(String type, String color, double height, boolean isOn) {
            this.type = type;
            this.color = color;
            this.height = height;
            this.isOn = isOn;
            System.out.println("A new StreetLight instance has been created");
        }

        // Method to get the type of the street light
        public String getType() {
            return type;
        }

        // Method to set the type of the street light
        public void setType(String type) {
            this.type = type;
        }

        // Method to get the color of the street light
        public String getColor() {
            return color;
        }
    }

    // Nested class for the TrafficSign
    public static class TrafficSign {
        // Properties of the TrafficSign class
        private String type;
        private String message;
        private String color;
        private double height;
        private double width;

        // Constructor for the TrafficSign class
        public TrafficSign(String type, String message, String color, double height, double width) {
            this.type = type;
            this.message = message;
            this.color = color;
            this.height = height;
            this.width = width;
            System.out.println("A new TrafficSign instance has been created");
        }

    }
}

class Shop {
    // Properties of a shop
    private String name;
    private String address;
    private int numberOfEmployees;
    private double revenue;
    private boolean isOpen;
    private String type;
    private int numberOfCustomers;
    private double profit;

    // Nested class representing a product sold in the shop
    public static class Product {
        // Properties of a product
        private String name;
        private double price;
        private int quantity;

        // Constructor for a product
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;

            System.out.println("Created a new product with name: " + name + ", price: " + price + ", and quantity: " + quantity);
        }

        // Method for increasing the quantity of a product
        public void increaseQuantity(int amount) {
            System.out.println("Increasing the quantity of the product by: " + amount);
        }

        // Method for decreasing the quantity of a product
        public void decreaseQuantity(int amount) {
            System.out.println("Decreasing the quantity of the product by: " + amount);
        }

        // Method for checking the availability of a product
        public void checkAvailability() {
            System.out.println("Checking the availability of the product");
        }
    }

    // Nested class representing an employee of the shop
    public static class Employee {
        // Properties of an employee
        private String name;
        private int age;
        private double salary;

        // Constructor for an employee
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;

            System.out.println("Created a new employee with name: " + name + ", age: " + age + ", and salary: " + salary);
        }

        // Method for promoting an employee
        public void promote() {
            System.out.println("Promoting the employee");
        }

        // Method for demoting an employee
        public void demote() {
            System.out.println("Demoting the employee");
        }

        // Method for calculating the salary of an employee
        public void calculateSalary() {
            System.out.println("Calculating the salary of the employee");
        }
    }

    // Constructor for a shop
    public Shop(String name, String address, int numberOfEmployees, double revenue, boolean isOpen, String type, int numberOfCustomers, double profit) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.revenue = revenue;
        this.isOpen = isOpen;
        this.type = type;
        this.numberOfCustomers = numberOfCustomers;
        this.profit = profit;
        System.out.println("shop ctor");
    }
}
