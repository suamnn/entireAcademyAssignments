
# Java Logical Expression - Introduction
- Java Expressions, Code Blocks, and Logical Branching
- We will cover the basics of Java expressions, code blocks, and logical branching
- Explore some examples to help you better understand these concepts

## Java Expressions
- Java expressions are statements that are made up of one or more operands and operators
- An operand is a variable, constant, or value that an operator works on
- An operator is a symbol that performs a specific operation on one or more operands
- Examples of operators include + (addition), - (subtraction), \* (multiplication), / (division), and % (modulus)

### Examples of Java Expressions
- Example 1: `int a = 5 + 3;`
- Example 2: `double b = 10.0 / 3.0;`
- Example 3: `boolean c = true && false;`
- Example 4: `String d = "Hello" + " World";`

## Code Blocks
- A code block is a group of statements enclosed in curly braces `{}`
- Code blocks can be used to group statements together and make the code easier to read and maintain
- Code blocks are also used with control statements such as if, for, and while loops

# Examples of Code Blocks
Example 1:
```
if (x > 0) {
System.out.println("x is positive");
}
```

Example 2:
```
for (int i = 0; i > 10; i++) {
    System.out.println(i);
}
```

Example 3:
```
while (x < 100) {
x = x * 2;
}
```

## Conditional Statements: Comparison Operators
- The following operators allow you to compare numbers:
- `==`: Are 2 values equal to each other
- `!=`: Are 2 values NOT equal to each other
- `>`: Is a value greater than another value
- `<`: Is a value less than another value
- `>=`: Is a value greater or equal to another value
- `<=`: Is a value less than or equal to another value

## Logical Branching
- Logical branching is the process of making decisions in code based on a certain condition
- Logical branching is done using control statements such as `if`, `else-if`, and `switch`
- Logical expressions are used to determine whether a certain condition is `true` or `false`
- Logical expressions are often used in control statements to determine the flow of the program
- Examples of logical expressions include `x > y`, `age >= 18`, and `name.equals("John")`

## Logical Operators
- Logical operators are used to combine logical expressions together
- The three logical operators in Java are `&&` (AND), `||` (OR), and `!` (NOT)
- The `&&` operator returns `true` if both expressions are `true`
- The `||` operator returns `true` if at least one expression is `true`
- The `!` operator returns the opposite of the expression

![](https://lh5.googleusercontent.com/CU4WxZmyd8Ti8OvgT00MWE-8NcAhVtkouPdsIStyAvsJY7NxHJbnOdU3D8VAcGyaMK69EZB3BUZO9hdWKh9ZxOIh_PRKZiYl6nAMve_F27ksio-Gwf_ceZOUCqXMB9sau7Qk3aFjtwoIy6gvNUaRJfc)

`XOR = ^`

There is a third case called an “Exclusive Or” or `XOR` for short. The operator is the
carrot symbol ( `^` ).

- For XOR statements:
- True XOR True is False
- True XOR False is True
- False XOR True is True
- False XOR False is False

***In most day to day programming, XOR is not used very often.***

## Examples of Logical Operators
Example 1:
```
if (x > 0 && y &lt; 10) {
System.out.println("x is positive and y is less than 10");
}
```

Example 2:
```
if (age >= 18 || hasDriverLicense) {
  System.out.println("You can drive");
}
```

Example 3:
```
if (!name.equals("John")) {
  System.out.println("Your name is not John");
}
```

## If Statement (0,1)
- The if statement is used to execute a block of code if a certain condition is true
- If the condition is false, the code block is not executed
- The if statement can also be used with else and else-if to provide alternative code paths

### Examples of If Statements
Example 1:
```
if (x > 0) {
   System.out.println("x is positive");
}
```

Example 2:
```
if(age >= 18) {
   System.out.println("You are an adult");
} else {
   System.out.println("You are not an adult");
}
```

Example 3:
```
if (x > 0) {
   System.out.println("x is positive");
} else if (x < 0) {
   System.out.println("x is negative");
} else {
   System.out.println("x is zero");
}
```

## Switch Statement
- The switch statement is used to execute different code blocks based on different values of a variable or expression
- The switch statement can be used as an alternative to if-else statements when there are many possible values to check

### Examples of Switch Statements
Example 1:
```
int dayOfWeek = 3;
switch (dayOfWeek) {
    case 1:
        System.out.println("Monday");
        Break;
    case 2:
        System.out.println("Tuesday");
        Break;
    case 3:
        System.out.println("Wednesday");
        Break;
    default:
        System.out.println("Other day");
}
```
Example 2:
```
String fruit = "apple";
switch (fruit) {
    case "apple":
    case "pear":
    case "banana":
        System.out.println("This is a fruit");
        Break;
    default:
        System.out.println("This is not a fruit");
}
```

## Ternary Operator
Example:
```
int i = 10
boolean isLess = i < 5 ? true : false;
```

## Conclusion
- Went over Java Expressions, Code Blocks, and Logical Branching
- We hope that you have gained a better understanding of these concepts and how they are used in Java programming
- If you have any questions, please leave a comment.
