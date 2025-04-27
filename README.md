# Coffee Machine Simulator

Welcome to the Coffee Machine Simulator! This project is a simple yet powerful simulation of a coffee machine that allows you to brew coffee, manage resources, and handle money. It was built as part of the Hyperskill Java course to practice object-oriented programming (OOP) concepts and Java basics.

## Features

- Brew three types of coffee: **Espresso**, **Latte**, and **Cappuccino**.
- Manage resources like water, milk, coffee beans, and disposable cups.
- Collect money from coffee sales.
- Refill the machine with supplies.
- Clean the machine after making several coffees.
- Display the current state of the machine.
- Exit the program gracefully.

## How to Use

1. Run the program.
2. Choose an action from the menu:
   - `buy`: Purchase a coffee.
   - `fill`: Refill the machine with resources.
   - `take`: Collect the money from the machine.
   - `clean`: Clean the machine.
   - `remaining`: View the current state of the machine.
   - `exit`: Exit the program.
3. Follow the prompts to interact with the coffee machine.

## Project Highlights

- **Object-Oriented Design**: The project uses classes like `CoffeeMachine` and `Coffee` to encapsulate functionality and data.
- **User Interaction**: The program uses a menu-driven interface for user input.
- **Resource Management**: Tracks and updates resources dynamically based on user actions.
- **Error Handling**: Notifies the user when resources are insufficient to make coffee.

## Learning Outcomes

This project helped reinforce the following concepts:
- Basic Java syntax and structure.
- Object-oriented programming principles.
- Working with loops, conditions, and methods.
- Managing user input and program flow.

## How to Run

1. Clone the repository.
2. Compile the Java files:
   ```bash
   javac -d bin src/*.java
   ```
3. Run the program:
   ```bash
   java -cp bin App
   ```

## About the Project

This project was developed as part of the Hyperskill Java course. It serves as a graduate project, showcasing the application of core Java concepts and OOP principles.
