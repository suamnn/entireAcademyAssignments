# Methods

A method is a block of code that performs a specific task. It is like a subprogram that can be called from anywhere in the program. Methods are used to perform a particular action, and they are also known as functions or procedures in other programming languages.

## Java Methods
A method in Java has a name, a return type, and a list of parameters. The name of the method should be a descriptive word or phrase that explains what the method does. The return type is the type of value that the method will return after performing its task. The list of parameters specifies the data types and names of the input values that the method needs to perform its task.

To define a method in Java, we use the following syntax:
```
accessModifier returnType methodName(parameterList){
    // code to perform the task
    return value;
}
```

Here, accessModifier is an optional keyword that specifies the access level of the method. The most commonly used access modifiers are `public`, `private`, and `protected`.

`returnType` specifies the data type of the value that the method will return. If the method doesn't return any value, we use the keyword void.

`methodName` is the name of the method, which should be a descriptive word or phrase.

`parameterList` is a list of parameters that the method needs to perform its task. Each parameter is specified by its data type and name.

Examples of Java Methods
Let's look at some examples of Java methods:

1. A method that returns the sum of two numbers:
```
public int sum(int a, int b){
    int result = a + b;
    return result;
}
```
Here, public is the access modifier, int is the return type, sum is the name of the method, and (int a, int b) is the parameter list.

2. A method that prints the given message:
```
public void printMessage(String message){
    System.out.println(message);
}
```
Here, public is the access modifier, void is the return type, printMessage is the name of the method, and (String message) is the parameter list.

3. A method that returns the maximum of two numbers:
```
public int max(int a, int b){
    if(a > b){
        return a;
    }
    else{
        return b;
    }
}
```
Here, public is the access modifier, int is the return type, max is the name of the method, and `(int a, int b)` is the parameter list.

4. A method that checks whether a number is even or odd:
```
public boolean isEven(int number){
    if(number % 2 == 0){
        return true;
    }
    else{
        return false;
    }
}
```

Here, public is the access modifier, boolean is the return type, isEven is the name of the method, and (int number) is the parameter list.

5. A method that returns the factorial of a number:
```
public int factorial(int number){
    int result = 1;
    for(int i = 1; i &lt;= number; i++){
        result *= i;
    }
    return result;
}
```
Here, public is the access modifier, int is the return type, factorial is the name of the method, and (int number) is the parameter list.

6. A method that concatenates two strings:
```
public String concatenate(String str1, String str2){
    String result = str1 + str2;
    return result;
}
```

## What is Command Line Input/Output?

Command line input/output (I/O) refers to the ability of a program to interact with the user through the command line interface. In simple terms, it means that a program can read input from the user through the keyboard and display output on the screen.

The most common way to read input from the user is by using the Scanner class in Java. This class provides methods to read different types of data from the keyboard, such as integers, floating-point numbers, and strings.


# How to use Scanner in Java
To use the Scanner class in Java, you need to import it first. You can do this by adding the following line at the beginning of your program:

`import java.util.Scanner;`

Once you have imported the Scanner class, you can create an instance of it in your program using the following code:

`Scanner scanner = new Scanner(System.in);`

This code creates a new Scanner object that reads input from the keyboard `(System.in)`.

# Reading Integers

To read an integer from the user using the Scanner class, you can use the `nextInt()` method. Here's an example:

```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
System.out.println("You entered " + num);
```
In this example, the program prompts the user to enter an integer, reads the input using the `nextInt()` method, and then displays the input back to the user.


## Reading Floating-Point Numbers

To read a floating-point number (a number with a decimal point) from the user using the Scanner class, you can use the `nextDouble()` method. Here's an example:
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a floating-point number: ");
double num = scanner.nextDouble();
System.out.println("You entered " + num);
```
In this example, the program prompts the user to enter a floating-point number, reads the input using the nextDouble() method, and then displays the input back to the user.

# Reading Strings

To read a string from the user using the Scanner class, you can use the `nextLine()` method. Here's an example:
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
System.out.println("You entered " + str);
```
In this example, the program prompts the user to enter a string, reads the input using the `nextLine()` method, and then displays the input back to the user.

## Reading Booleans

To read a boolean value (true or false) from the user using the Scanner class, you can use the `nextBoolean()` method. Here's an example:
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a boolean value (true or false): ");
boolean bool = scanner.nextBoolean();
System.out.println("You entered " + bool);
```
In this example, the program prompts the user to enter a boolean value, reads the input using the nextBoolean() method, and then displays the input back to the user.


### More Example
Here are a few more examples to help you understand how to use Scanner in Java:
Example 1: Reading two integers from the user and displaying their sum.
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second integer: ");
int num2 = scanner.nextInt();
int sum = num1 + num2;
System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
```

Example 2: Reading a string and displaying its length.
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
int length = str.length();
System.out.println("The length of the string is " + length);
```

Example 3: Reading a floating-point number and displaying its square root.
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a floating-point number: ");
double num = scanner.nextDouble();
double sqrt = Math.sqrt(num);
System.out.println("The square root of " + num + " is " + sqrt);
```

Example 4: Reading a boolean value and displaying its opposite.
```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a boolean value (true or false): ");
boolean bool = scanner.nextBoolean();
boolean opposite = !bool;
System.out.println("The opposite of " + bool + " is " + opposite);
```