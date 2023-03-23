# Java Object-oriented Programming (OOP)

Today, we're going to learn about Java Object-oriented Programming (OOP). Java is a popular programming language, and it supports the OOP concept, which makes it easier for us to understand complex programming tasks. Don't worry if you haven't coded before - we'll go through this topic step by step with examples so you can fully understand and enjoy the journey.

## What is Object-oriented Programming (OOP)?

Object-oriented Programming, or OOP for short, is a way of coding that focuses on creating objects that can interact with one another. These objects contain both data and functions that operate on that data. The key concept in OOP is that it allows us to model real-world things like people, animals, and cars, in our code. It also helps us to structure our code into more manageable, reusable pieces.

## Why Java for OOP?

Java, one of the most popular programming languages, was designed to support OOP from the beginning. This makes it a great choice for learning the concepts and practices behind OOP, as well as experiencing many real-world programming scenarios.

## Getting Started: Classes and Objects

### Classes

A class is a blueprint or template for creating objects in Java. You can think of a class like a mold for making different objects with similar properties and functions. For example, consider a real-world scenario where we want to create a program that describes various types of cars.

We'll start by creating a `Car` class:

```java
public class Car {
    // The properties of a car
    int speed;
    String color;
    String make;
    String model;
}
```

Here, we define a class called `Car`, with some properties like speed, color, make, and model. Notice how we've used different data types such as `int` for speed and `String` for color, make, and model.

### Objects

Now that we have a class, we can create objects from it. Think of an object as an instance of a class, kind of like using the blueprint (class) to build a real car (object). Let's create a few `Car` objects:

```java
public class Main {
    public static void main(String[] args) {
        // Create a new Car object
        Car car1 = new Car();
        car1.speed = 100;
        car1.color = "Red";
        car1.make = "Toyota";
        car1.model = "Camry";

        // Create another Car object
        Car car2 = new Car();
        car2.speed = 80;
        car2.color = "Blue";
        car2.make = "Honda";
        car2.model = "Civic";
    }
}
```

Here, we have created two `Car` objects named `car1` and `car2`. We used the `new` keyword to create new instances of the `Car` class, and then we set the properties for each car.

## Encapsulation: Using Methods and Access Modifiers

Now that we have a basic understanding of classes and objects, let's improve our `Car` class with the help of methods and access modifiers.

### Methods

Methods are functions that belong to a class and can perform actions on the object. Let's add a method called `drive` that increases the speed of the car:

```java
public class Car {
    // Properties
    int speed;
    String color;
    String make;
    String model;

    // Method
    void drive(int increaseSpeed) {
        speed = speed + increaseSpeed;
    }
}
```

Now let's use the `drive` method in our `Main` class:

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.color = "Red";
        car1.make = "Toyota";
        car1.model = "Camry";

        // Drive car1
        car1.drive(20);
        System.out.println("The new speed of car1 is " + car1.speed); // 120
    }
}
```

### Access Modifiers

Access modifiers control the visibility of class properties and methods. They help us to encapsulate, or hide, the internal data and functionality of the object, making it safer and more stable. There are four access modifiers in Java:

1. `private`: The property or method is only visible within the class.
2. `(default)`: The property or method is visible within the same package.
3. `protected`: The property or method is visible within the same package and in subclasses.
4. `public`: The property or method is visible everywhere.

Let's see an example of using access modifiers in our `Car` class:

```java
public class Car {
    // Change properties to private
    private int speed;
    private String color;
    private String make;
    private String model;

    // Add public methods to access the private fields
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive(int increaseSpeed) {
        speed = speed + increaseSpeed;
    }
    // Similarly, you can add getters and setters for other fields as well.
}
```

Now, we use the new `Car` class with getters and setters in our `Main` class:

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setSpeed(100);
        car1.drive(20);
        System.out.println("The new speed of car1 is " + car1.getSpeed());
    }
}
```

## Inheritance: Extending Classes

Inheritance is a concept in OOP where a class can inherit the properties and methods of another class. This makes it possible to reuse and extend code, making it more modular and maintainable.

To demonstrate inheritance, let's create a new class `SportsCar`, which extends our `Car` class:

```java
public class SportsCar extends Car {
    String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
```

Now, the `SportsCar` class inherits all the properties and methods from the `Car` class, but we can also add new properties like `carType`.

Let's create a `SportsCar` object in our `Main` class:

```java
public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar1 = new SportsCar();
        sportsCar1.setSpeed(200);
        sportsCar1.setCarType("Convertible");
        System.out.println("The sports car type is " + sportsCar1.getCarType());
        System.out.println("Its speed is  " + sportsCar1.getSpeed());
    }
}
```

## Polymorphism: Overriding and Overloading

Polymorphism is a concept in OOP where a method can have multiple implementations, depending on the context it is used in. There are two types of polymorphism - method overriding and method overloading.

### Method Overriding

Method overriding occurs when a subclass provides a new implementation for a method that already exists in its superclass. Here's an example of method overriding in our `SportsCar` class:

```java
public class SportsCar extends Car {
    // Override the drive method for sports cars
    @Override
    void drive(int increaseSpeed) {
        speed = speed + (2 * increaseSpeed);
    }
    // Other properties and methods...
}
```

In this example, we have overridden the `drive` method in the `SportsCar` class to reflect appropriately for sports cars. They usually accelerate more quickly, hence we multiply the increase in speed by 2.

### Method Overloading

Method overloading occurs when a class has multiple methods with the same name, but with different parameters. Here's an example of method overloading in our `Car` class:

```java
public class Car {
    // Other properties and methods...

    // Method overloading with different parameters
    void drive() {
        speed = speed + 5;
    }

    void drive(int increaseSpeed) {
        speed = speed + increaseSpeed;
    }
}
```

In this example, we've added two `drive` methods in the `Car` class. One takes no parameters and always increases the speed by 5, while the other takes a parameter `increaseSpeed` to specify how much speed to add.

## Wrapping Up

Congratulations! Now you have a basic understanding of Java Object-oriented Programming concepts like classes, objects, encapsulation, inheritance, and polymorphism. With this knowledge, you can start building more complex and real-world applications using Java OOP.

Keep practicing and experimenting with different OOP concepts in Java, and soon you'll be an expert programmer! Happy coding!