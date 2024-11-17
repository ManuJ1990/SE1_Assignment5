# Design Patterns Exercises

This repository contains Java implementations of various design patterns, each exercise focusing on a specific problem and showcasing how an appropriate pattern can be used effectively.

## Overview

The repository includes multiple exercises, each demonstrating a different design pattern. Below is an overview of the exercises and the corresponding design patterns used.

### Exercise 1: News Agency Observer

- **Pattern Used**: **Observer Pattern**
- **Description**: The `NewsAgency` class maintains a list of observers (`NewsOutlet`), which are registered to receive updates whenever a new piece of news is added. This pattern is used to model the relationship between the news agency and various news outlets (e.g., `LocalNewspaper`, `Website`, `TVStation`). Each time a news update occurs, all registered observers are notified automatically.

### Exercise 2: Sorting Strategies

- **Pattern Used**: **Strategy Pattern**
- **Description**: The `SortingContext` class uses different sorting algorithms such as `BubbleSort`, `InsertionSort`, and `SelectionSort` through a common interface (`SortingStrategy`). This pattern allows us to switch between different sorting strategies at runtime, providing flexibility for the type of sorting that should be applied based on the specific context.

### Exercise 3: House Construction Simulation

- **Pattern Used**: **Template Method Pattern**
- **Description**: The `HouseTemplate` abstract class defines the steps required to build a house (laying the foundation, building walls, placing the roof, installing doors and windows). The subclasses (`WoodenHouse`, `GlassHouse`, `BrickHouse`) provide specific implementations for the building steps. The Template Method Pattern ensures that all houses follow the exact sequence of construction steps while allowing variations in implementation.

## Running the Exercises

1. Clone the repository:
   ```
   git clone <repository_url>
   ```
2. Navigate to the exercise you'd like to run.
3. Compile and run the respective `Main` class to see the output of the different design patterns in action.

## Patterns Summary

- **Observer Pattern**: Used to maintain a one-to-many dependency between objects. When the subject changes state, all its dependents are notified.
- **Strategy Pattern**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to be selected at runtime.
- **Template Method Pattern**: Defines the skeleton of an algorithm in a base class and allows subclasses to fill in specific steps without altering the overall algorithm structure.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests to add new exercises, improve code quality, or expand on the documentation.

## License

This repository is licensed under the MIT License.

