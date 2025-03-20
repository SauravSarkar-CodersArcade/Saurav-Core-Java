Exception handling in Java is primarily managed through five keywords: `try`, `catch`, `finally`, `throw`, and `throws`. Below are detailed examples of how to use these effectively, along with explanations.

### 1. **Basic Example: Try-Catch Block**

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may raise an exception
            int data = 100 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Exception handling code
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues after exception handling.");
    }
}
```

**Explanation**:  
In this example, we deliberately create an exception by dividing by zero. The `catch` block catches the `ArithmeticException` and handles it, allowing the program to continue executing the remaining code.

---

### 2. **Multiple Catch Blocks**

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
        System.out.println("Program continues.");
    }
}
```

**Explanation**:  
Here, multiple exceptions are handled using multiple `catch` blocks. The `ArrayIndexOutOfBoundsException` is caught, but if another exception had occurred, the relevant `catch` block would have handled it.

---

### 3. **Finally Block Example**

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues.");
    }
}
```

**Explanation**:  
The `finally` block is always executed, regardless of whether an exception is thrown or not. This is typically used for cleaning up resources like closing files or database connections.

---

### 4. **Throwing Exceptions Manually (throw)**

```java
public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

**Explanation**:  
In this example, the `throw` keyword is used to manually throw an exception. The method `validateAge()` throws an `ArithmeticException` if the age is less than 18, and it's caught in the `catch` block.

---

### 5. **Using Throws Keyword**

```java
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            checkNumber(1);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Negative number not allowed");
        } else {
            System.out.println("Number is positive");
        }
    }
}
```

**Explanation**:  
The `throws` keyword in the method declaration specifies that the method can throw an exception, which the calling code must handle. In this case, the method `checkNumber()` throws an exception if the number is negative.

---

### 6. **Custom Exception**

```java
// Defining a custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Will throw a custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

**Explanation**:  
This example demonstrates how to create a custom exception class by extending `Exception`. The `checkAge()` method throws this custom exception when the age is invalid, and it’s handled in the `catch` block.

---

### 7. **Nested Try-Catch Block**

```java
public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int data = 100 / 0; // Will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            int[] arr = new int[5];
            arr[5] = 10; // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
        System.out.println("Program continues.");
    }
}
```

**Explanation**:  
This shows how `try-catch` blocks can be nested. If an exception occurs in the inner `try` block, it’s caught by the inner `catch`. If an exception occurs in the outer `try` block, the outer `catch` handles it.

---

### 8. **Handling Multiple Exceptions in Single Catch Block (Java 7+)**

```java
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // Throws ArithmeticException
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues.");
    }
}
```

**Explanation**:  
Java 7 introduced the ability to catch multiple exceptions in a single `catch` block using the `|` operator. This reduces redundancy when handling multiple exceptions similarly.

---

These examples showcase a variety of ways to handle exceptions in Java, ranging from basic to advanced techniques. Each example is designed to highlight a specific aspect of exception handling.