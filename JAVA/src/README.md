# Topics Covered

## 1. Variables, Data Types and Operators

Variables are used to store data in a program. Java provides several data types such as:

* int
* float
* double
* char
* boolean
* String

Operators are used to perform operations on variables.

Types of operators:

* Arithmetic operators (`+`, `-`, `*`, `/`)
* Relational operators (`>`, `<`, `==`)
* Logical operators (`&&`, `||`)
* Assignment operators (`=`)

Example:

```java
int a = 10;
int b = 20;
int sum = a + b;
```

---

## 2. Loops and Conditional Statements

Loops allow repeating a block of code multiple times.

Types of loops:

* for loop
* while loop
* do-while loop

Conditional statements help in decision making.

Types:

* if
* if-else
* else-if
* switch

Example:

```java
if(a > b){
    System.out.println("A is greater");
}
```

---

## 3. Methods and Constructors

### Methods

Methods are reusable blocks of code that perform specific tasks.

Example:

```java
void display(){
    System.out.println("Hello");
}
```

### Constructors

Constructors are special methods used to initialize objects when they are created.

Example:

```java
Student(){
    System.out.println("Object Created");
}
```

---

## 4. Access Modifiers

Access modifiers control the visibility of classes, variables, and methods.

Types of access modifiers:

* **public** → accessible everywhere
* **private** → accessible only inside the class
* **protected** → accessible within package and subclasses
* **default** → accessible within the same package

Example:

```java
private int age;
```

---

## 5. Static vs Non-Static

### Static

Static members belong to the class and are shared by all objects.

Example:

```java
static int count = 0;
```

### Non-Static

Non-static members belong to individual objects and require object creation.

Example:

```java
Student s = new Student();
```

---

# Object Oriented Programming Concepts

## 6. Classes and Objects

A **class** is a blueprint for creating objects.

An **object** is an instance of a class that represents a real-world entity.

Example:

```java
class Car{
    String brand;
}
```


## 7. Inheritance

Inheritance allows one class to acquire properties and methods of another class.

It helps in **code reusability**.

Example:

```java
class Car extends Vehicle
```

---

## 8. Polymorphism

Polymorphism means **one method having multiple forms**.

Types:

* Method Overloading
* Method Overriding

---

## 9. Abstraction

Abstraction hides implementation details and shows only essential features.

It can be achieved using:

* Abstract Classes
* Interfaces

---

## 10. Interfaces

Interfaces define a contract of methods that a class must implement.

Example:

```java
interface Shape{
    void draw();
}
```

---

# Collections Framework

The Java Collections Framework provides classes to store and manage groups of objects.

## List

* Allows duplicates
* Maintains insertion order

Example:

```java
ArrayList<String> list = new ArrayList<>();
```

## Set

* Stores unique elements
* Does not allow duplicates

Example:

```java
HashSet<String> set = new HashSet<>();
```

## Map

* Stores key-value pairs

Example:

```java
HashMap<Integer,String> map = new HashMap<>();
```

---

## Iteration and Sorting

Collections can be traversed using:

* for loop
* enhanced for loop
* Iterator

Sorting can be done using:

```java
Collections.sort(list);
```

---

# Exception Handling

Exception handling is used to manage runtime errors and prevent program crashes.

### try-catch

Handles exceptions.

Example:

```java
try{
    int a = 10/0;
}
catch(Exception e){
    System.out.println("Error occurred");
}
```

### throw and throws

* `throw` is used to explicitly throw an exception.
* `throws` is used in method declaration.

### Custom Exception

User-defined exceptions created by extending the `Exception` class.

---

# Strings and Regular Expressions

## String Manipulation

Common methods:

* toUpperCase()
* toLowerCase()
* trim()

## Split

Splits a string into multiple parts.

Example:

```java
String[] parts = text.split(",");
```

## Replace

Replaces characters or words.

Example:

```java
text.replace("bad","***");
```

## Substring

Extracts part of a string.

Example:

```java
text.substring(0,4);
```

## Regular Expressions (Regex)

Regex is used for pattern matching and validation.

Example uses:

* Email validation
* Password validation
* Phone number validation

---

# Conclusion

Through this learning process, I implemented multiple Java programs using fundamental programming concepts, OOP principles, collections, exception handling, and string manipulation.

These concepts provide a strong foundation for developing Java applications and learning advanced technologies such as Spring, Hibernate, and backend development.
