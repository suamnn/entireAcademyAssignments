# Java Object-oriented Programming - Abstract

Today, we will be diving into the world of Java, exploring the concept of Abstract in object-oriented programming. Don't worry if you've never coded before, because we will go through each concept step by step, with simple explanations and lots of examples to help you understand better.

## What is Object-oriented Programming (OOP) - Recap?

As we learn in previous section, Object-oriented Programming (OOP) is a programming approach that helps developers build applications using real-world concepts, like objects, instead of focusing on the code itself. In the real world, objects have properties (like color, shape, or size) and can also perform actions (like move, eat, or sleep). With OOP, we can model computer programs the same way – making our code easier to understand and write!

Now, let's move on to discuss the main topic of our post: Abstract.

## Abstract Classes and Methods

In Java, when we talk about Abstract classes and methods, we refer to a feature that allows us to create general classes and methods which can't be instantiated or called directly. Instead, they serve as a template or a blueprint for other classes and methods to extend or implement.

An abstract class is like a partially-built house where the design is in place, but it still needs some finishing touches. You can't live in it yet, but you can use it as a starting point to build other houses.

Similarly, an abstract method is like a missing piece in a jigsaw puzzle. You need to find the right piece (i.e., define the method in a concrete class) before you can complete the puzzle.

Enough with the analogies, let's break down abstract classes and methods more thoroughly!

### Abstract Classes

An abstract class is designed to be a superclass (a parent class) that can't be instantiated. It can only be extended by other classes, known as subclasses or child classes.

To define an abstract class, we use the `abstract` keyword before the `class` keyword:

```java
abstract class Shape {
  // Class members and methods go here
}
```

### Abstract Methods

An abstract method has no body (implementation). It serves as a blueprint for child classes to implement the-method logic uniquely for each class.

To define an abstract method, use the `abstract` keyword before the method signature, and end it with a semicolon instead of curly braces:

```java
abstract void draw();
```

An abstract method can only exist within an abstract class. In the following example, we define an abstract class `Shape` with two abstract methods, `getArea()` and `printShape()`:

```java
abstract class Shape {
  abstract double getArea();
  abstract void printShape();
}
```

When a concrete (non-abstract) class extends an abstract class, it must provide an implementation for all abstract methods; otherwise, a compiler error will occur.

## Examples

Now, let's look at some examples of abstract classes and methods:

### Example 1: Shapes

We will start by defining an abstract class, `Shape`, which has two abstract methods, `getArea()` and `getName()`. After that, we will create two concrete classes, `Circle` and `Rectangle`, that extend the `Shape` class and provide the specific implementation for the abstract methods.

```java
// Define the abstract class Shape
abstract class Shape {
  abstract double getArea();
  abstract String getName();
}

// Define the Circle class that extends Shape
class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double getArea() {
    return 3.14 * radius * radius;
  }

  @Override
  String getName() {
    return "Circle";
  }
}

// Define the Rectangle class that extends Shape
class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  double getArea() {
    return length * width;
  }

  @Override
  String getName() {
    return "Rectangle";
  }
}
```

### Example 2: Animals

Consider an abstract class `Animal` with two abstract methods, `sound()` and `eats()`. We will create two concrete classes, `Dog` and `Cat`, which provide the specific implementation of these abstract methods for each animal.

```java
// Define the abstract class Animal
abstract class Animal {
  abstract void sound();
  abstract void eats();
}

// Define the Dog class that extends Animal
class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("The dog barks");
  }

  @Override
  void eats() {
    System.out.println("The dog eats bones");
  }
}

// Define the Cat class that extends Animal
class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("The cat meows");
  }

  @Override
  void eats() {
    System.out.println("The cat eats fish");
  }
}
```

That's it! You've learned about abstract classes and methods in Java object-oriented programming! Remember that while abstract concepts might seem a bit confusing at first, they're essential for creating more flexible and reusable code in bigger projects.

Keep practicing and exploring different examples to build a strong foundation, and soon you will become a pro in Java programming! Good luck!