
## What is a Java Stack?

In Java, a Stack is a collection of elements where you can only access the last element added to the Stack. A Stack follows the Last-In-First-Out (LIFO) principle, which means that the last element added to the Stack is the first one to be removed.

Think of a stack of books where you can only add or remove a book from the top. You can't just grab a book from the middle - that would break the rules!

Java provides a class called `Stack` which allows us to create and manage stacks easily.

Now, let's explore some examples to understand how to use a Stack in Java.

## Creating a Stack

First, let's learn how to create a Stack in Java. To create a Stack, you need to import the Stack class from the `java.util` package and declare a variable of the Stack type. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
  }
}
```

In this example, we created an empty Stack called `myStack` that can store String elements.

## Adding Elements to a Stack

Now that you know how to create a Stack, let's learn how to add elements to it. To add an element to a Stack, you can use the `push()` method. This method adds an element to the top of the Stack. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
    myStack.push("Book 1");
    myStack.push("Book 2");
    myStack.push("Book 3");
    System.out.println(myStack); // Output: [Book 1, Book 2, Book 3]
  }
}
```

## Removing Elements from a Stack

To remove an element from the top of the Stack, you can use the `pop()` method. This method removes the element and returns its value. Remember that it follows the LIFO principle. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
    myStack.push("Book 1");
    myStack.push("Book 2");
    myStack.push("Book 3");

    String removedBook = myStack.pop();
    System.out.println("Removed: " + removedBook); // Output: Removed: Book 3
    System.out.println(myStack); // Output: [Book 1, Book 2]
  }
}
```

## Checking the Element at the Top

To see the element at the top of the Stack without removing it, you can use the `peek()` method. This method returns the value of the top element without removing it. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
    myStack.push("Book 1");
    myStack.push("Book 2");
    myStack.push("Book 3");

    String topBook = myStack.peek();
    System.out.println("Top: " + topBook); // Output: Top: Book 3
  }
}
```

## Checking if a Stack is Empty

To check if a Stack is empty, you can use the `isEmpty()` method. This method returns `true` if the Stack is empty and `false` otherwise. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
    System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: Is stack empty? true

    myStack.push("Book 1");
    System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: Is stack empty? false
  }
}
```

## Iterating Over a Stack

To loop through a Stack and access each element, you can use a for-each loop. Keep in mind that this traversal might not be in the order you added the elements to the Stack. Here's an example:

```java
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();
    myStack.push("Book 1");
    myStack.push("Book 2");
    myStack.push("Book 3");

    for (String book : myStack) {
      System.out.println(book);
    }
  }
}
```
## Java Map:
## What is a Java Map?

In Java, a Map is a collection that stores pairs of elements called "keys" and "values." The keys are unique, meaning each key can only appear once in the Map. The values can be anything you want — numbers, text, or even other collections!

Java Maps are super helpful when you want to associate one piece of data with another piece of data. For example, you could create a Map to store the names of students in a class and their corresponding grades.

Java provides several implementations of the Map interface, such as HashMap, TreeMap, and LinkedHashMap. Each of these implementations has its own unique features and is used in different situations.

Now, let's take a look at some examples to understand how to use a Map in Java.

## Creating a Map

First, let's learn how to create a Map in Java. To create a Map, you need to import the Map class from the `java.util` package and declare a variable of the Map type. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
  }
}
```

In this example, we created an empty Map called `myMap`. The keys in this map are of type String, and the values are of type Integer. We used the HashMap implementation to create the Map.

## Adding Elements to a Map

Now that you know how to create a Map, let's learn how to add elements to it. To add an element to the Map, you can use the `put()` method. This method takes two arguments — the key and the value. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    myMap.put("Alice", 90);
    myMap.put("Bob", 85);
    myMap.put("Carol", 92);
    System.out.println(myMap); // Output: {Alice=90, Bob=85, Carol=92}
  }
}
```

In this example, we added three key-value pairs to the Map, representing the names of students and their corresponding grades.

## Accessing Values in a Map

To get the value associated with a specific key in the Map, you can use the `get()` method. This method takes the key as an argument and returns the corresponding value. If the key is not in the Map, it returns `null`. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    myMap.put("Alice", 90);
    myMap.put("Bob", 85);
    myMap.put("Carol", 92);

    int aliceGrade = myMap.get("Alice"); // 90
    int carolGrade = myMap.get("Carol"); // 92
    int davidGrade = myMap.get("David"); // null

    System.out.println("Alice's grade: " + aliceGrade);
    System.out.println("Carol's grade: " + carolGrade);
    System.out.println("David's grade: " + davidGrade);
  }
}
```

## Removing Elements from a Map

To remove an element from the Map, you can use the `remove()` method. This method takes the key as an argument and removes the key-value pair from the Map. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    myMap.put("Alice", 90);
    myMap.put("Bob", 85);
    myMap.put("Carol", 92);

    myMap.remove("Bob");
    System.out.println(myMap); // Output: {Alice=90, Carol=92}
  }
}
```

In this example, we removed the key-value pair with the key "Bob" from the Map using the `remove()` method.

## Checking if a Map Contains a Key

To check if a Map contains a specific key, you can use the `containsKey()` method. This method returns `true` if the Map contains the key, and `false` otherwise. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    myMap.put("Alice", 90);
    myMap.put("Bob", 85);
    myMap.put("Carol", 92);

    boolean containsAlice = myMap.containsKey("Alice"); // true
    boolean containsDavid = myMap.containsKey("David"); // false

    System.out.println("Contains Alice? " + containsAlice);
    System.out.println("Contains David? " + containsDavid);
  }
}
```

## Iterating Over a Map

Finally, let's learn how to loop through a Map and access each key-value pair. You can use a for-each loop with the `entrySet()` method to iterate over the pairs in the Map. Here's an example:

```java
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    myMap.put("Alice", 90);
    myMap.put("Bob", 85);
    myMap.put("Carol", 92);

    for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
      System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
    }
  }
}
```
In this example, we used a for-each loop to print the names and grades stored in the Map.

## What is a Java Set?

In Java, a Set is a collection of elements that cannot have duplicates, which means that each element can appear only once in the set. A Set is useful when you want to store a unique list of items, like a list of student names in a class where each name appears only once.

Java provides several implementations of the Set interface, such as HashSet, TreeSet, and LinkedHashSet. Each of these implementations has its own unique features and is used in different scenarios.

Now, let's take a look at some examples to understand how to use the Set in Java.

## Creating a Set

First, let's learn how to create a Set in Java. To create a Set, you need to import the Set class from the java.util package and declare a variable of the Set type. Here's an example:

```java
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
  }
}
```

In this example, we created an empty Set called `mySet` that can store String elements. We used the HashSet implementation to create the Set.

## Adding Elements to a Set

Now that you know how to create a Set, let's learn how to add elements to it. To add an element to a Set, you can use the `add()` method. Here's an example:

```java
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("Alice");
    mySet.add("Bob");
    mySet.add("Carol");
    System.out.println(mySet); // Output: [Alice, Bob, Carol]
  }
}
```

In this example, we added three names to the Set. Since Sets do not allow duplicate elements, if we try to add the same name again, it will not be added to the Set.

```java
mySet.add("Alice"); // This will not add "Alice" again, as it's already in the Set.
```

## Removing Elements from a Set

To remove an element from a Set, you can use the `remove()` method. Here's an example:

```java
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("Alice");
    mySet.add("Bob");
    mySet.add("Carol");
    mySet.remove("Bob");
    System.out.println(mySet); // Output: [Alice, Carol]
  }
}
```

In this example, we removed "Bob" from the Set using the `remove()` method.

## Checking if a Set Contains an Element

To check if a Set contains a specific element, you can use the `contains()` method. This method returns `true` if the Set contains the element, and `false` otherwise. Here's an example:

```java
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("Alice");
    mySet.add("Bob");
    mySet.add("Carol");

    boolean containsAlice = mySet.contains("Alice"); // true
    boolean containsDavid = mySet.contains("David"); // false

    System.out.println("Contains Alice? " + containsAlice);
    System.out.println("Contains David? " + containsDavid);
  }
}
```

## Iterating Over a Set

Finally, let's learn how to loop through a Set and access each element. You can use a for-each loop to iterate over the elements in a Set. Here's an example:

```java
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("Alice");
    mySet.add("Bob");
    mySet.add("Carol");

    for (String name : mySet) {
      System.out.println(name);
    }
  }
}
```

In this example, we used a for-each loop to print the names stored in the Set.

That's it! Now you know how to create a Set in Java, add and remove elements, check if a Set contains an element, and iterate over a Set. Keep practicing and exploring more about Sets and other Java concepts. Happy coding!