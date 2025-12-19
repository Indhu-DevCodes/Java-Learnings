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

### 📌 Example:

```
class Test {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

> The main method is the starting point of execution for any Java program.

---

<h3 id="java_10">10. Why is the main method static?</h3>

---

<h3 id="java_11">11. What happens if the main method is not static?</h3>

---

<h3 id="java_12">12. What is class and object in Java?</h3>

---

<h3 id="java_13">13. What is the difference between C++ and Java?</h3>

---

<h3 id="java_14">14. Is Java 100% object-oriented? Why?</h3>

---

<h3 id="java_D1">1. What are data types in Java?</h3>

---

<h3 id="java_D2">2. What are primitive data types?</h3>

---

<h3 id="java_D3">3. What are non-primitive data types?</h3>

---

<h3 id="java_D4">4. What is the default value of primitive data types?</h3>

---

<h3 id="java_D5">5. What is type casting?</h3>

---

<h3 id="java_D6">6. What is implicit type casting?</h3>

---

<h3 id="java_D7">7. What is explicit type casting?</h3>

---

<h3 id="java_D8">8. What is a variable?</h3>

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







