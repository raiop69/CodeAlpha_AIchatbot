import java.util.HashMap;
import java.util.Map;

public class FAQData {

    public static Map<String, String> getFAQs() {

        Map<String, String> faq = new HashMap<>();

        faq.put("hello", "Hello! How can I help you?");
        faq.put("hi", "Hi there! How can I assist you today?");
        faq.put("hey", "Hey! What can I do for you?");
        faq.put("how are you", "I'm just a program, but I'm functioning perfectly!");
        faq.put("what is your name", "I am your AI Chatbot assistant.");
        faq.put("who made you", "I was created as part of a Java AI Chatbot project.");
        faq.put("what can you do", "I can answer FAQs and assist with basic queries.");
        faq.put("help", "Sure! Tell me what you need help with.");
        faq.put("bye", "Goodbye! Have a great day!");
        faq.put("good morning", "Good morning! How can I assist you?");
        faq.put("good night", "Good night! See you soon!");

        faq.put("what is codealpha", "CodeAlpha is a platform for coding projects and learning development skills.");
        faq.put("codealpha project", "This chatbot is part of a CodeAlpha Java project.");
        faq.put("codealpha chatbot", "This chatbot was developed under CodeAlpha assignment guidelines.");
        faq.put("codealpha java", "Java is used to build this CodeAlpha chatbot system.");

        faq.put("java", "Java is a high-level, object-oriented programming language.");
        faq.put("what is javafx", "JavaFX is used for building modern GUI applications in Java.");
        faq.put("what is oop", "OOP stands for Object-Oriented Programming.");
        faq.put("what is mvc", "MVC stands for Model-View-Controller architecture.");
        faq.put("what is maven", "Maven is a build automation tool used in Java projects.");

        faq.put("who are you", "I am an AI-powered chatbot built in Java.");
        faq.put("are you human", "No, I am a virtual assistant.");
        faq.put("are you ai", "Yes, I am a rule-based AI chatbot.");
        faq.put("do you learn", "I don't learn automatically, but I respond based on predefined rules.");
        faq.put("are you smart", "I try my best to assist you efficiently!");

        faq.put("what is programming", "Programming is the process of writing instructions for computers.");
        faq.put("best language", "Java, Python, and C++ are popular programming languages.");
        faq.put("what is database", "A database is used to store and manage data.");
        faq.put("what is sql", "SQL is used to manage and query databases.");
        faq.put("what is api", "API allows different software systems to communicate.");

        faq.put("error", "Please describe the error so I can help you.");
        faq.put("bug", "Try checking your logic or syntax.");
        faq.put("debug", "Use debugging tools or print statements.");
        faq.put("compile error", "Check your code syntax and imports.");
        faq.put("runtime error", "Check logic and input values.");

        faq.put("what is project", "A project is a structured piece of software built to solve a problem.");
        faq.put("chatbot project", "This is a Java-based AI chatbot project.");
        faq.put("ai chatbot", "An AI chatbot responds to user queries intelligently.");
        faq.put("frontend", "Frontend is the user interface of an application.");
        faq.put("backend", "Backend handles the logic and data processing.");

        faq.put("thank you", "You're welcome!");
        faq.put("thanks", "Happy to help!");
        faq.put("ok", "Alright!");
        faq.put("okay", "Got it!");
        faq.put("fine", "Great! Let me know if you need anything else.");

        faq.put("exit", "Exiting chatbot. Goodbye!");
        faq.put("stop", "Chatbot session stopped.");
        faq.put("restart", "Restarting chatbot system...");
        faq.put("clear", "Clearing conversation...");
        faq.put("what is class", "A class is a blueprint for creating objects in Java.");
        faq.put("what is object", "An object is an instance of a class.");
        faq.put("what is inheritance", "Inheritance allows one class to acquire properties of another class.");
        faq.put("what is polymorphism", "Polymorphism allows methods to behave differently based on object.");
        faq.put("what is encapsulation", "Encapsulation is wrapping data and methods into a single unit.");
        faq.put("what is abstraction", "Abstraction hides implementation details and shows only functionality.");

        faq.put("what is constructor", "A constructor is used to initialize objects.");
        faq.put("what is method overloading", "Method overloading means same method name with different parameters.");
        faq.put("what is method overriding", "Method overriding means redefining parent class method in child class.");
        faq.put("what is interface", "An interface is a blueprint of a class with abstract methods.");
        faq.put("what is abstract class", "An abstract class cannot be instantiated and may contain abstract methods.");

        faq.put("what is jvm", "JVM stands for Java Virtual Machine which runs Java bytecode.");
        faq.put("what is jre", "JRE stands for Java Runtime Environment used to run Java programs.");
        faq.put("what is jdk", "JDK stands for Java Development Kit used for Java development.");

        faq.put("what is static keyword", "Static keyword is used for memory management at class level.");
        faq.put("what is final keyword", "Final keyword is used to make variable, method or class constant.");
        faq.put("what is this keyword", "This keyword refers to current object.");
        faq.put("what is super keyword", "Super keyword refers to parent class object.");

        faq.put("what is exception", "An exception is an error that occurs during program execution.");
        faq.put("what is try catch", "Try-catch is used for exception handling in Java.");
        faq.put("what is finally block", "Finally block always executes whether exception occurs or not.");
        faq.put("what is throw keyword", "Throw keyword is used to explicitly throw an exception.");
        faq.put("what is throws keyword", "Throws keyword declares exceptions in method signature.");

        faq.put("what is array", "An array is a collection of similar type elements.");
        faq.put("what is string", "String is a sequence of characters.");
        faq.put("what is string builder", "StringBuilder is used for mutable string operations.");
        faq.put("what is string buffer", "StringBuffer is thread-safe version of StringBuilder.");

        faq.put("what is loop", "Loop is used to execute a block of code repeatedly.");
        faq.put("what is for loop", "For loop is used when number of iterations is known.");
        faq.put("what is while loop", "While loop executes until condition becomes false.");
        faq.put("what is do while loop", "Do-while loop executes at least once.");

        faq.put("what is recursion", "Recursion is when a method calls itself.");
        faq.put("what is stack", "Stack is a LIFO data structure.");
        faq.put("what is queue", "Queue is a FIFO data structure.");
        faq.put("what is linked list", "Linked list is a linear data structure of nodes.");
        faq.put("what is arraylist", "ArrayList is a dynamic array in Java.");

        faq.put("what is hashmap", "HashMap stores key-value pairs.");
        faq.put("what is collection framework",
                "Collection framework provides classes and interfaces for data structures.");
        faq.put("what is iterator", "Iterator is used to traverse collections.");

        faq.put("what is access modifier", "Access modifiers define visibility of classes and members.");
        faq.put("what is public", "Public means accessible everywhere.");
        faq.put("what is private", "Private means accessible only within class.");
        faq.put("what is protected", "Protected means accessible in same package and subclasses.");
        faq.put("what is default access", "Default means accessible only within same package.");

        faq.put("what is package", "Package is a namespace used to organize classes.");
        faq.put("what is thread", "Thread is a lightweight subprocess.");
        faq.put("what is multithreading", "Multithreading is executing multiple threads simultaneously.");
        faq.put("what is synchronization", "Synchronization controls access to shared resources.");

        faq.put("what is oops in java", "OOP is Object-Oriented Programming based on objects and classes.");
        faq.put("why use oops", "It helps in code reusability, scalability, and organization.");
        faq.put("difference between class and object", "Class is blueprint, object is instance of class.");

        faq.put("what is inheritance in real life", "It allows child class to reuse parent class properties.");
        faq.put("why inheritance is used", "To reduce code duplication and improve reusability.");
        faq.put("can java support multiple inheritance", "Not with classes, but possible using interfaces.");

        faq.put("what is polymorphism in simple words", "One method behaving in different ways.");
        faq.put("what is runtime polymorphism", "Method overriding is runtime polymorphism.");
        faq.put("what is compile time polymorphism", "Method overloading is compile time polymorphism.");

        faq.put("what is encapsulation used for", "To protect data using private variables and getters/setters.");
        faq.put("why encapsulation is important", "It improves security and data hiding.");
        faq.put("what is abstraction in java", "Hiding implementation and showing only functionality.");

        faq.put("difference between abstraction and encapsulation",
                "Abstraction hides logic, encapsulation hides data.");
        faq.put("what is interface in java", "Interface is a contract with abstract methods.");
        faq.put("why use interface", "To achieve abstraction and multiple inheritance.");

        faq.put("what is abstract class", "A class that cannot be instantiated and may have abstract methods.");
        faq.put("difference between interface and abstract class",
                "Interface has only abstract methods (mostly), abstract class can have implementation.");

        faq.put("what is constructor", "Special method used to initialize objects.");
        faq.put("types of constructor", "Default and parameterized constructors.");
        faq.put("can constructor be overloaded", "Yes, constructors can be overloaded.");

        faq.put("what is method overloading", "Same method name with different parameters.");
        faq.put("what is method overriding", "Child class redefining parent class method.");

        faq.put("what is static keyword", "Static belongs to class rather than object.");
        faq.put("why main method is static", "So JVM can call it without creating object.");
        faq.put("what is final keyword", "Used to make variable, method, or class constant.");

        faq.put("what is this keyword", "Refers to current class object.");
        faq.put("what is super keyword", "Refers to parent class object.");

        faq.put("what is jvm", "JVM runs Java bytecode on any system.");
        faq.put("what is jre", "JRE provides runtime environment for Java programs.");
        faq.put("what is jdk", "JDK is used to develop Java applications.");

        faq.put("difference between jdk jre jvm", "JDK = development, JRE = runtime, JVM = execution engine.");

        faq.put("what is exception in java", "An error that occurs during program execution.");
        faq.put("why exception handling is needed", "To prevent program crash.");
        faq.put("what is try catch", "Used to handle exceptions safely.");
        faq.put("what is finally block", "Always executes whether exception occurs or not.");
        faq.put("difference between throw and throws", "Throw is used to generate exception, throws declares it.");

        faq.put("what is array in java", "A container for storing multiple values of same type.");
        faq.put("why use arraylist", "It is dynamic and resizable.");
        faq.put("difference between array and arraylist", "Array size is fixed, ArrayList is dynamic.");

        faq.put("what is string in java", "String is a sequence of characters.");
        faq.put("why string is immutable", "For security, caching, and performance.");
        faq.put("difference between string and stringbuilder", "String is immutable, StringBuilder is mutable.");

        faq.put("what is loop in programming", "Used to execute code repeatedly.");
        faq.put("difference between for and while loop", "For loop is fixed iteration, while is condition-based.");

        faq.put("what is recursion", "Function calling itself.");
        faq.put("why recursion is used", "To solve problems like tree, factorial, etc.");

        faq.put("what is data structure", "Way to organize and store data efficiently.");
        faq.put("what is stack", "LIFO data structure.");
        faq.put("what is queue", "FIFO data structure.");

        faq.put("what is hashmap", "Stores key-value pairs.");
        faq.put("why hashmap is used", "Fast retrieval using keys.");

        faq.put("what is mvc architecture", "Model-View-Controller design pattern.");
        faq.put("why mvc is used", "To separate logic, UI, and data.");
        faq.put("what is oop advantage", "Better structure, reusability, and maintenance.");
        faq.put("what is software engineering", "Process of designing and building software systems.");
        return faq;
    }
}