
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Paridhi Talwar             |
| Date         | 12/09/2024                 |
| Course       | Fall 2024                  |

# Project Overview
This project, "Dynamic Workout Plan Generator", utilizes the Strategy design pattern to create personalized workout plans based on user preferences, including intensity level (beginner, intermediate, or rigorous) and equipment availability. The system generates customized routines for various fitness goals such as Cardio, Muscle Building, and Weight Loss, with exercises tailored to each level and goal. The design allows flexibility in choosing between bodyweight exercises or those requiring equipment, providing users with a diverse and adaptable fitness experience that can be easily modified based on individual needs.
# GitHub Repository Link:
https://github.com/{YOUR_USERNAME}/SDP_Project

# Key Features:
**Workout Type Interpretation**: Handles different workout types like cardio and muscle building and maps them to appropriate workout strategies.

**Intensity Level Interpretation**: Supports various intensity levels (e.g., beginner, intermediate, extreme) and provides descriptions for each.

**Equipment Requirement Check**: Determines if a workout type requires specific equipment (e.g., cardio typically doesn't, but muscle building does).

**Error Handling**: Throws an exception for invalid workout types to ensure robust input validation.

**JUnit Test Cases**: Includes comprehensive test cases to verify the correctness of workout type and intensity interpretations, as well as equipment checks.

# Workflow:
**Initialize Input**: Provide a workout type (e.g., cardio) and intensity level (e.g., beginner).

**Interpret Workout Type**: The WorkoutPlanInterpreter determines the appropriate workout strategy based on the type.

**Interpret Intensity**: The intensity level is mapped to a description (e.g., "Low intensity, easy exercises" for beginner).

**Check Equipment Requirement**: Determine whether the workout type requires equipment or not.

**Run Tests**: Use JUnit to validate the functionality, including correct strategy assignment and exception handling for invalid input.

# Implementation Description 


## Flexibility of Implementation:
The implementation is highly flexible and allows easy addition or removal of new object types. New workout types, such as "yoga" or "pilates," can be added simply by creating new strategy classes (e.g., `YogaStrategy`, `PilatesStrategy`) and updating the `WorkoutPlanInterpreter` to include the new types. Similarly, removing a workout type is as simple as deleting the corresponding strategy class and updating the interpreter. This flexibility is achieved by adhering to a Strategy Pattern, where each workout type corresponds to a specific strategy class, making it easy to extend the system without modifying the existing codebase significantly.

## Simplicity and Understandability:
The implementation follows clear, simple logic that is easy to understand and maintain. The class `WorkoutPlanInterpreter` serves as the main hub for interpreting workout types and intensities, while the strategy classes encapsulate the details of each workout type. This separation of concerns ensures that the code is modular and logically organized. The method names and variable names are descriptive, making the code easy to read and follow for others who might be maintaining or extending it in the future.

## Avoiding Duplicated Code:
To avoid duplicated code, the `WorkoutPlanInterpreter` uses a central method for handling the interpretation of workout types and intensities, delegating specific logic to strategy classes when needed. This ensures that common logic (such as checking the intensity level or equipment requirement) is only implemented once, promoting reuse and making the code more maintainable. Avoiding code duplication reduces the likelihood of errors and inconsistencies, which is important in keeping the system robust and easy to modify.

## Design Patterns:
In addition to the Strategy Pattern, the implementation also leverages the Builder and Interpreter patterns.

* **Strategy Pattern**: This pattern is used to encapsulate different workout strategies (e.g., CardioStrategy, MuscleBuildingStrategy). By defining a family of algorithms (workout types) and making them interchangeable, the WorkoutPlanInterpreter can easily delegate the logic to the appropriate strategy. This approach allows new workout types to be added without changing the core functionality, ensuring flexibility and scalability.

* **Builder Pattern**: The Builder Pattern is utilized to create complex workout plans step by step, focusing on constructing the workout details such as type, intensity, and required equipment. This pattern helps separate the construction of the workout plan from its representation, allowing for easier creation and modification of different workout plans. It also makes the system more flexible, as different plans can be built by specifying different combinations of attributes.

* **Factory Method Pattern:**: The Factory Method Pattern is used for dynamically creating workout strategies based on the workout type. The `WorkoutPlanInterpreter` class acts as the factory, interpreting input strings (e.g., `"cardio"`, `"muscle"`, `"weightloss"`) and returning the appropriate `WorkoutStrategy` instance. This ensures loose coupling by delegating the responsibility of instantiating specific strategies to the factory method, making the system more extensible and maintainable.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




