## 1. Java Basics & Fundamentals

1. [What is Java?](#java_01)

2. [Why is Java platform independent?](#java_02)

3. [What are the features of Java?](#java_03)

4. [What is JDK?](#java_04)

5. [What is JRE?](#java_05)

6. [What is JVM?](#java_06)

7. [What is bytecode?](#java_07)

8. [Why Java is called a compiled and interpreted language?](#java_08)

9. [What is the main method in Java?](#java_09) 

10. [Why is the main method static?](#java_10)

11. [What happens if the main method is not static?](#java_11)

12. [What is class and object in Java?](#java_12)

13. [What is the difference between C++ and Java?](#java_13)

14. [Is Java 100% object-oriented? Why?](#java_14)

15. [](#java_0)

16. [](#java_0)

17. [](#java_0)

## 2. Data Types & Variables

1. [](#java_D1)

2. [](#java_D2)

3. [](#java_D3)

4. [](#java_D4)

5. [](#java_D5)

6. [](#java_D6)

7. [](#java_D7)

8. [](#java_D8)

9. [](#java_D9)

10. [](#java_D10)

11. [](#java_D11)

12. [](#java_D12)

13. [](#java_D13)

14. [](#java_D14)









[](#java_0)
<h3 id="java_0"></h3>

## 1. Java Basics & Fundamentals

<h3 id="java_01">☕ What is Java?</h3>

<img  alt="Image" src="https://github.com/user-attachments/assets/ff257a2e-b797-4eff-9143-5085badf9472" />

**Java** is a **programming language** used to create software like **apps, games, and websites**.

* 🖥️ It helps computers understand **what to do**
* 📱 Used in mobile apps (especially Android)
* 🌍 Works on many devices using the same code
  *(“Write once, run anywhere”)*

**In simple words:**
👉 Java tells computers how to work, just like giving them instructions.

---

<h3 id="java_02">🌍 Why is Java platform independent?</h3>

<img  alt="Image" src="https://github.com/user-attachments/assets/410b4660-7587-4ff5-8b76-5424ec1a26a8" />

**Java is a platform-independent language**, which means it can be used to develop **end-to-end mobile or desktop applications** that run on **different servers and operating systems**.

* 🧩 Java code is first changed into **bytecode**
* ⚙️ This bytecode runs on the **Java Virtual Machine (JVM)**
* 💻📱 Each device has its own JVM, so the **same Java program works everywhere**
* ☕ Java Programming Language is popular due to its “write once, run anywhere” functionality.
* In real-world applications, JVM is installed on the server or bundled with the application, so end users do not need JVM.
This allows Java applications to run on different operating systems without changing the code.

**Simple explanation:**
👉 Java runs on any system because it uses **JVM as a helper**, so you don’t need to rewrite the program for different computers.

### ☕ Java – “Write Once, Run Anywhere” (How it Works)

<img  alt="Image" src="https://github.com/user-attachments/assets/b20f2cfc-2768-4d87-b57d-bed57bffebdd" />

✍️ WRITE - Write Java source code in **`.java` files**

⚙️ COMPILE - The **Java Compiler (javac)** converts source code into **platform-independent bytecode (`.class`)**

📦 DISTRIBUTE - The **same bytecode** is shared and used on **all operating systems**

📥 LOAD - The **JVM** loads the bytecode on the target machine

🛡️ VERIFY - The JVM **verifies bytecode** for security and correctness

🔄 CONVERT - The JVM converts bytecode into **machine code** using:
  * Interpreter
  * JIT (Just-In-Time Compiler)

🚀 EXECUTE - The **CPU executes** the native machine instructions

Java achieves portability because the **same bytecode runs on any system that has a JVM**.

---

<h3 id="java_03">3. What are the features of Java?</h3>

1️⃣  **Platform Independent** 🖥️

➡️ Java programs can Compiles to bytecode, runnable on any device with a Java Virtual Machine (JVM).
👉 fulfilling *Write once, run anywhere - (WORA) principle* via the JVM

2️⃣ **Object-Oriented** 🧩

➡️ Java is based on objects and classes, which makes programs easy to manage and reuse. Organizes code around objects and classes, promoting reusability and modularity (Inheritance, Encapsulation, Polymorphism).

3️⃣ **Simple** ✨

➡️ Java has Clean syntax, similar to C++, but it removes complex features like explicit pointers, making it easier to learn.

4️⃣ **Secure** 🔐 (no direct pointers, bytecode verification)

➡️ Java protects your system from viruses and unauthorized access using JVM security. Built-in security features like bytecode verification and restricted memory access protect against malicious code.

5️⃣ **Robust** 💪 (strong memory management, exception handling)

➡️ Java is strong and reliable. It handles errors and memory automatically. Features automatic memory management (Garbage Collection) and strong exception handling, preventing crashes and memory leaks.

6️⃣ **Portable** 🎒

➡️ Java programs can be moved from one system to another without changes.

7️⃣ **Multithreaded** 🔄

➡️ Allows multiple tasks (threads) to run concurrently at the same time (faster execution), improving application performance and responsiveness.

8️⃣ **High Performance** ⚡

➡️ Java uses JIT (Just-In-Time) compiler to convert bytecode to native machine code for faster execution.

9️⃣ **Distributed** 🌐

➡️ Java supports building applications that work over networks (web & cloud apps). 

🔟 **Dynamic** 🔁

➡️ Java can load classes and libraries at runtime without restarting the program. 

----

<h3 id="java_04">4. What is JDK?</h3>

### JDK (Java Development Kit) 🛠️

JDK is a software kit that provides an environment to **develop and run Java programs**.
It is mainly used by **Java developers**.

JDK includes:

* **Development Tools** (like compiler `javac`) to write and compile Java programs
* **JRE** to execute (run) Java programs

👉 JDK = Development + Execution

---

<h3 id="java_05">5. What is JRE?</h3>

### JRE (Java Runtime Environment) 📦

JRE is an installation package that provides an environment to **only run Java programs**, not to develop them.
It is mainly used by **end users** who want to run Java applications on their system.

JRE includes:

* **JVM**
* **Java class libraries (core libraries)**

👉 JRE is used when you want to **run** Java programs only.

---

<h3 id="java_06">6. What is JVM?</h3>

### JVM (Java Virtual Machine) 🖥️

JVM is a virtual machine that **runs Java bytecode** and converts it into machine code.
JVM is the **core component** of both JDK and JRE. It makes Java **platform independent**.

JVM is responsible for:

* Loading Java bytecode
* Interpreting and executing the program **line by line**
* Converting bytecode into machine-specific instructions

👉 JVM makes Java **platform independent**, so it is also known as an **interpreter**.

> JRE provides the runtime environment, JDK provides tools to develop Java applications and JVM executes Java bytecode.

---
<h3 id="java_07">7. What is bytecode?</h3>

🧾 **Bytecode** is an **intermediate code** generated when a Java program is compiled.

➡️ Bytecode is **not machine code**
➡️ It is **understood by JVM**, not by the operating system directly
➡️ The same bytecode can run on **any OS** with a JVM

> **Bytecode(`.class`)** is an intermediate code generated by the Java compiler that is executed by the JVM.

> **Machine code** is a low-level language made of binary instructions(0s and 1s) that are directly executed by the computer’s CPU.

### 🔁 Java Comparison (Easy to Remember):

| Language Type     | Executed By |
| ---------------   | ----------- |
| Java Bytecode ☕ | JVM         |
| Machine Code ⚙️  | CPU         |

<img  alt="Image" src="https://github.com/user-attachments/assets/ddf81f78-03ba-4161-be0c-bef8bfc71e91" />

---

<h3 id="java_08">8. Why Java is called a compiled and interpreted language?</h3>

Java is called **both compiled and interpreted** because its program is **compiled first** and then **interpreted by the JVM at runtime**.

### 🔹 Compiled ✔️

📄 Java source code (`.java`) is **compiled** by the Java compiler (`javac`).
➡️ It is converted into **bytecode** (`.class`).
➡️ This bytecode is **platform independent**.

🛠️ That’s why Java is called a **compiled language**.

### 🔹  Interpreted ✔️

🖥️ The **JVM interprets** the bytecode **line by line** at runtime.
➡️ JVM converts bytecode into **machine code** for the operating system.
➡️ Execution happens on the user’s machine.

🧠 That’s why Java is also called an **interpreted language**.

---

<h3 id="java_09">9. What is the main method in Java? 🚀</h3>

🧩 **Main method** is the **entry point** of a Java program. Execution of a Java program **starts from the main method**.

### 🧾 Syntax:

```
public static void main(String[] args)
```

* **public** 
  ➡️ Makes the method accessible to JVM from anywhere.

* **static** 
  ➡️ Allows JVM to call the method **without creating an object**.

* **void** 
  ➡️ The method **does not return any value**.

* **main** 
  ➡️ The fixed method name where program execution begins.

* **String[] args** 
  ➡️ Used to accept **command-line arguments**.

<img  alt="Image" src="https://github.com/user-attachments/assets/ced76123-8eee-4f4e-9481-aeb4bfbb1e59" />

> The main method is the starting point of execution for any Java program.

---

<h3 id="java_10">10. Why is the main method static? ❓</h3>

➡️ The main() method is static in Java, so the JVM can directly invoke it without instantiating the class’s object.

## 🔹 How does JVM call `main()` using the class name?

1️) JVM starts the program

When you run a Java program:

```bash
java Test
```

➡️ JVM loads the class **Test** into memory.

2️) JVM looks for `main()` method

JVM specifically searches for this method signature:

```java
public static void main(String[] args)
```

3️) Why `static` matters here 🔑

* **Static methods belong to the class**, not to objects
* JVM can call a static method **directly using the class name**
* No object creation is required

Internally, JVM does something like:

```java
Test.main(args);
```

👉 This is possible **only because `main()` is static**

4️) What if `main()` was NOT static? ❌

* JVM would need to create an object first, but object creation needs a Constructor. It may need parameters but JVM doesn’t know which constructor to use
➡️ So execution fails

```java
Test obj = new Test();
obj.main(args);
```

🔁 Simple Flow Diagram (in words)

```
java Test
   ↓
JVM loads Test class
   ↓
Calls Test.main(args)   ← (static method)
   ↓
Program starts
```

> Declaring `main()` as static allows the JVM to call it directly using the class name without creating an object.

---

<h3 id="java_11">11. What happens if the main method is not static?</h3>

If the `main()` method is **non-static**, the JVM would need to **create an object of the class** in order to call it.
However, creating an object requires calling a **constructor**.

If the class has **multiple constructors** or a constructor that **takes parameters**, the JVM would face a problem:

* Which constructor should be called?
* What arguments should be passed to the constructor?

Since the JVM **cannot instantiate a class without calling a constructor**, and there is **no rule to decide which constructor and parameters to use**, this leads to **ambiguity**.

Therefore, to avoid this ambiguity and to allow the JVM to start execution **without creating an object**, the `main()` method is declared **static**.

---

<h3 id="java_12">12. What is class and object in Java?</h3>

<img  alt="Image" src="https://github.com/user-attachments/assets/030fec84-a667-4b53-ac57-fa94d949c12d" />

### 🎓 **Class and Object in Java**

In Java, a **class** is a **blueprint or template** that defines the structure and behavior of objects. It specifies **what data members (variables)** and **methods** an object will have, but it does not represent a real entity by itself.

An **object** is a **real instance of a class**. It represents a real-world entity and occupies memory. Multiple objects can be created from the same class, and each object can have **its own state (data values)** while sharing the same behavior.

```java
class Student {
    String name;
    void study() {
        System.out.println("Student is studying");
    }
}

Student s1 = new Student();
Student s2 = new Student();
```

Here:

* `Student` → **Class**
* `s1`, `s2` → **Objects**

<img  alt="Image" src="https://github.com/user-attachments/assets/2bd2b8ec-60f1-421b-b117-c4a8a470866d" />

### 🔑 Key Points:

* A **class** is logical and does not occupy memory
* An **object** is physical and occupies memory
* One class can create **many objects**
* Objects store data, classes define structure

> A class is a blueprint that defines properties and behavior, while an object is an instance of that class that represents a real-world entity.

---

<h3 id="java_13">13. What is the difference between C++ and Java?</h3>

<img  alt="Image" src="https://github.com/user-attachments/assets/659ac20a-9899-4cc8-9271-e4015b146364" />

| Feature                    | **C++**                                     | **Java**                                              |
| -------------------------- | ------------------------------------------- | ----------------------------------------------------- |
| **Platform Dependency** 🌍 | Platform dependent                          | Platform independent (uses JVM)                       |
| **Compilation** ⚙️         | Compiled directly to machine code           | Compiled to bytecode and run on JVM                   |
| **Memory Management** 🧠   | Manual (using pointers, `new`, `delete`)    | Automatic (Garbage Collection)                        |
| **Pointers** 👉            | Supports pointers                           | No explicit pointers                                  |
| **Object-Oriented** 🧩     | Partially object-oriented                   | Fully object-oriented                                 |
| **Inheritance** 🧬         | Supports multiple inheritance (via classes) | No multiple inheritance via classes (uses interfaces) |
| **Security** 🔐            | Less secure                                 | More secure (JVM, bytecode verification)              |
| **Portability** 🎒         | Low portability                             | High portability                                      |
| **Execution Speed** ⚡     | Faster (direct machine code)                | Slightly slower (JVM involved)                        |
| **Use Case** 🏭            | System software, games, OS                  | Web apps, enterprise apps, Android                    |

### 🧠 Simple Explanation:

* **C++** works closer to hardware and gives more control to the programmer.
* **Java** focuses on security, portability, and ease of development.

> C++ is a platform-dependent language with manual memory management, while Java is platform-independent and uses automatic memory management through JVM.

---

<h3 id="java_14">14. Is Java 100% object-oriented? Why?</h3>

➡️ **No, Java is NOT 100% object-oriented.**

Although Java is **mostly object-oriented**, it has a few features that prevent it from being purely object-oriented.

1. **Primitive Data Types**

   * Java supports primitives like `int`, `char`, `float`, `boolean`
   * These are **not objects**

2. **Static Methods and Variables**

   * The `main()` method is `static`
   * Static members belong to the **class**, not to objects

3. **Wrapper Classes Exist**

   * Primitives need wrapper classes (`Integer`, `Character`, etc.) to behave like objects
   * This proves primitives are not objects by default

✅ Why Java is still called Object-Oriented:

Everything is written **inside a class** that supports core OOP concepts:

  * Encapsulation
  * Inheritance
  * Polymorphism
  * Abstraction
 
---

## 2. Data Types & Variables

<h3 id="java_D1">1. What are data types in Java?</h3>

### 🧩 What are Data Types in Java? (Simple Explanation)

**Data types in Java** are used to **tell the compiler what kind of value a variable can store**.
They help Java **use memory efficiently** and **prevent errors**.

Java data types are divided into **two groups**:

## 🔑 Short to Remember

| Type                                    | Stores              | Category      |
| --------------------------------------- | ------------------- | ------------- |
| `int`, `char`, `boolean`                | Actual value        | Primitive     |
| `Class`, `Interface`, `Array`, `String` | Reference to object | Non-Primitive |

> **Data types in Java define the type of value a variable can store and the operations that can be performed on it.**

---

<h3 id="java_D2">2. What are primitive data types?</h3>

### Primitive Data Types 🔢 - 📌 Java has **8 primitive data types** in total.

* `int` – stores whole numbers
* `float` – stores decimal numbers
* `char` – stores a single character
* `boolean` – stores `true` or `false`
* `byte` stores small integer values
* `short` stores short-range integers
* `long` stores large whole numbers
* `double` stores high-precision decimal values

![Image](https://github.com/user-attachments/assets/a993f1c1-575a-450d-a032-f2512d8644f8)

![Image](https://github.com/user-attachments/assets/6e4a9029-fe66-4731-833f-5849b69857e7)

---

<h3 id="java_D3">3. What are non-primitive data types?</h3>

### Non-Primitive Data Types (reference data types)📦

These store **objects and collections of data**. **Non-primitive data types store references (addresses) to objects**, not the actual value.

* `String` – stores text
* `Array` – stores multiple values of same type
* `Class` – user-defined data type
* `Interface` – blueprint of a class

## ⭐ Example

```java
int age = 20;          // primitive
String name = "Java"; // non-primitive
```

## Class – *User-defined data type* 🧩 When you create a **class**, you are defining a **new data type**.

### Example:

```java
class Student {
    int id;
    String name;
}
```

Here, `Student` becomes a **new data type**. Now create an object:

```java
Student s = new Student();
```

🔹 `s` does **not store the actual data**
🔹 `s` stores a **reference (memory address)** of the `Student` object

✅ Because it stores a **reference**, `Student` is a **non-primitive data type**.

Interface – *Blueprint of a class* 🧱 An **interface** defines **what a class should do**, not how.

### Example:

```java
interface Vehicle {
    void run();
}
```

You cannot create an object directly:

```java
Vehicle v = new Car();  // Car implements Vehicle
```

🔹 `v` holds a **reference** to an object of a class that implements `Vehicle`
🔹 It does **not store a value like int or char**

✅ Hence, `Interface` is also a **non-primitive (reference) data type**.

![Image](https://github.com/user-attachments/assets/c2381f7e-46c8-474b-b548-67f269d7a637)

---

<h3 id="java_D4">4. What is the default value of primitive data types?</h3>

📌In Java, **default values are automatically assigned only to instance variables and static variables**.
(Local variables do **not** get default values.)

| Data Type | Default Value               |
| --------- | --------------------------- |
| `byte`    | `0`                         |
| `short`   | `0`                         |
| `int`     | `0`                         |
| `long`    | `0L`                        |
| `float`   | `0.0f`                      |
| `double`  | `0.0`                       |
| `char`    | `'\u0000'` (null character) |
| `boolean` | `false`                     |

> **Primitive data types in Java have predefined default values when declared as instance or static variables.**

## 🔑 Example

```java
class DefaultValueExample {
    int a;
    boolean flag;

    public static void main(String[] args) {
        DefaultValueExample obj = new DefaultValueExample();
        System.out.println(obj.a);     // 0
        System.out.println(obj.flag);  // false
    }
}
```

---

<h3 id="java_D5">5. What is type casting?</h3>

<img  alt="Image" src="https://github.com/user-attachments/assets/bf6b396d-e511-41d3-9acc-6c30b0be58df" />

**Type casting** in Java refers to **converting a variable from one data type to another** to ensure type compatibility during assignments or operations.

## 🔹 Why is Type Casting Needed?

* To **assign values** between different data types
* To **avoid compile-time errors**
* To **control data conversion** in calculations

## 🔑 Key Points

* Widening is **safe and automatic**
* Narrowing requires **explicit casting**
* **boolean cannot be cast** to or from any other type
* Casting applies mainly to **primitive data types**

> **Type casting in Java is the conversion of one data type into another, either implicitly by the compiler or explicitly by the programmer.**

---

<h3 id="java_D6">6. What is implicit type casting?</h3>

### Widening Type Casting (Implicit)

* Performed **automatically by the compiler**
* Converts **lower data type → higher data type**
* **No data loss**

📌 Example:

```java
int a = 10;
double b = a;
```

---

<h3 id="java_D7">7. What is explicit type casting?</h3>

### Narrowing Type Casting (Explicit)

* Performed **manually by the programmer**
* Converts **higher data type → lower data type**
* **Possible data loss**

📌 Example:

```java
double x = 12.5;
int y = (int) x;
```

---

<h3 id="java_D8">8. What is a variable?</h3>

📌 A **variable in Java** is a **container that holds a data value during the execution of a program**.
It acts as a **name for a specific memory location**, allowing data to be **stored, accessed, and modified**.

Each variable must be **declared with a data type**, which determines:

* The **type of value** it can store (such as integer, decimal, or text)
* The **amount of memory** allocated for it

> **A variable is a named memory location used to store data values that can change during program execution.**

---

<h3 id="java_D9">9. What are local variables?</h3>



---

<h3 id="java_D10">10. What are instance variables?</h3>

---

<h3 id="java_D11">11. What are static variables?</h3>

---

<h3 id="java_D12">12. What is the difference between local, instance, and static variables?</h3>

---

<h3 id="java_D13">13. What is final variable?</h3>

---







