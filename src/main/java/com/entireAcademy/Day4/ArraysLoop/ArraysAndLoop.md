# Arrays and Loops
## Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.

## Creating an Array

To create an array in Java, you first need to declare it. The declaration tells the compiler what type of data the array will hold and how many elements it will contain. Here is an example:

`int[] myArray = new int[5]`;


In this example, we declare an integer array named myArray that can hold 5 elements. The new keyword is used to create the array object, and the int keyword indicates that the array will hold integer values.


## Accessing Array Elements

Once you have created an array, you can access its elements using their index. Array indices start at 0, so the first element of an array is at index 0, the second element is at index 1, and so on. Here is an example:

```
int[] myArray = new int[5];
myArray[0] = 1;
myArray[1] = 2;
myArray[2] = 3;
myArray[3] = 4;
myArray[4] = 5;
System.out.println(myArray[2]); // Output: 3
```


## **Initializing an Array**

You can also initialize an array with values when you create it. Here is an example:

`int[] myArray = {1, 2, 3, 4, 5};`


## Looping Through an Array

To process all the elements of an array, you can use a loop. A common loop used to iterate through an array is the for loop. Here is an example:
```
int[] myArray = {1, 2, 3, 4, 5};

for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```


## Multidimensional Arrays
Java also supports multidimensional arrays, which are arrays of arrays. Multidimensional arrays can be used to represent tables, matrices, or other structures that require more than one dimension. Here is an example:

`int[][] myArray = {{1, 2}, {3, 4}, {5, 6}};`

In this example, we declare and initialize a two-dimensional integer array named myArray. The array has three rows and two columns. The first row contains the values 1 and 2, the second row contains the values 3 and 4, and the third row contains the values 5 and 6.


## Sorting an Array
You can sort the elements of an array using the sort() method. Here is an example:
```
int[] myArray = {5, 3, 1, 2, 4};
Arrays.sort(myArray);
System.out.println(Arrays.toString(myArray)); // Output: \[1, 2, 3, 4, 5]
```

## For Loops:
What is a for loop?
A for loop is a type of loop that allows you to execute a block of code repeatedly based on a specified condition. The condition is usually based on a counter variable that is initialized before the loop begins and updated after each iteration of the loop.

Here's the basic syntax for a for loop in Java:
```
for (initialization; condition; update) {
    // code to be executed
}
```

![](https://lh3.googleusercontent.com/MukO5RWhvmgnBCTJGASHCdttadSnwtQKLQZiynAEg2OuMz74gYvXxGTGHsl5Fwbg8mcCAwxIrjgrBdatATjLhwHPqViCHWbMbAe_xpF1QryBi7ah4IUy_cJsFYGXsYO6KXliQ7uPWtf-jNEmUw0JfnU)

The initialization step sets the initial value of the counter variable. The condition step specifies the condition that must be true for the loop to continue. The update step specifies how the counter variable should be updated after each iteration of the loop. The code inside the curly braces is the block of code that will be executed repeatedly as long as the condition is true.

Example 1: Printing numbers from 1 to 10
```
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

In this example, the initialization step sets the value of i to 1. The condition step specifies that the loop should continue as long as i is less than or equal to 10. The update step increments i by 1 after each iteration of the loop. The code inside the curly braces simply prints the value of i to the console.

Example 2: Calculating the sum of the first 10 numbers

```
int sum = 0;
for (int i = 1; i &lt;= 10; i++) {
    sum += i;
}
System.out.println(sum);
```

In this example, we're using a for loop to calculate the sum of the first 10 numbers. The initialization step sets the value of i to 1. The condition step specifies that the loop should continue as long as i is less than or equal to 10. The update step increments i by 1 after each iteration of the loop. The code inside the curly braces adds the value of i to the variable sum.

Example 3: Printing even numbers from 1 to 10
```
for (int i = 2; i <= 10; i +=2) {
    System.out.println(i);
}
```

In this example, we're using a for loop to print even numbers from 1 to 10. The initialization step sets the value of i to 2. The condition step specifies that the loop should continue as long as i is less than or equal to 10. The update step increments i by 2 after each iteration of the loop.

Example 4: Printing numbers in reverse order
```
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

In this example, we're using a for loop to print numbers in reverse order. The initialization step sets the value of i to 10. The condition step specifies that the loop should continue as long as i is greater than or equal to 1. The update step decrements i by 1 after each iteration of the loop.


## What is a while loop?
A while loop is a type of loop that allows you to execute a block of code repeatedly based on a specified condition. The difference between a while loop and a for loop is that a while loop does not require an initialization or update step. Instead, the condition is checked at the beginning of each iteration of the loop.

Here's the basic syntax for a while loop in Java:
```
while (condition) {
    // code to be executed
}
```

The condition specifies the condition that must be true for the loop to continue. The code inside the curly braces is the block of code that will be executed repeatedly as long as the condition is true.

Example 1: Printing numbers from 1 to 10
```
int i = 1;
while (i &lt;= 10) {
    System.out.println(i);
    i++;
}
```

In this example, we're using a while loop to print numbers from 1 to 10. The condition specifies that the loop should continue as long as i is less than or equal to 10. The code inside the curly braces prints the value of i to the console and increments i by 1.

Example 2: Calculating the sum of the first 10 numbers
```
int sum = 0;
int i = 1;
while (i &lt;= 10) {
    sum += i;
    i++;
}
System.out.println(sum);
```

In this example, we're using a while loop to calculate the sum of the first 10 numbers. The condition specifies that the loop should continue as long as i is less than or equal to 10. The code inside the curly braces adds the value of i to the variable sum and increments i by 1.

Example 3: Printing even numbers from 1 to 10
```
int i = 2;
while (i &lt;= 10) {
    System.out.println(i);
    i += 2;
}
```

In this example, we're using a while loop to print even numbers from 1 to 10. The condition specifies that the loop should continue as long as i is less than or equal to 10. The code inside the curly braces prints the value of i to the console and increments i by 2.


## What is a do-while loop?
A do-while loop is similar to a while loop, except that the condition is checked at the end of each iteration of the loop instead of the beginning. This means that the code inside the loop will always execute at least once, even if the condition is initially false.

Here's the basic syntax for a do-while loop in Java:
```
do {
    // code to be executed
} while (condition);
```

The code inside the curly braces is the block of code that will be executed repeatedly. The condition specifies the condition that must be true for the loop to continue.

Example 1: Printing numbers from 1 to 10
```
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

In this example, we're using a do-while loop to print numbers from 1 to 10. The code inside the curly braces prints the value of i to the console and increments i by 1. The condition specifies that the loop should continue as long as i is less than or equal to 10.

Example 2: Calculating the sum of the first 10 numbers
```
int sum = 0;
int i = 1;
do {
    sum += i;
    i++;
} while (i <= 10);
System.out.println(sum);
```
