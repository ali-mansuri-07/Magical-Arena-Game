# Magical Arena Game

This is a simple console-based game where two players fight each other until one wins. The players have health, strength, and attack attributes, and the outcome of the fight is determined by rolling a die.

## Project Structure

The project is divided into 4 main files:

1. **Player.java**: Contains the `Player` class that defines the attributes and methods for a player.
2. **MagicalArenaService.java**: Contains the `MagicalArenaService` class with the game logic for rolling dice and conducting fights.
3. **MagicalArenaApp.java**: Contains the `MagicalArenaApp` class with the main method to run the game.
4. **MagicalArenaAppTests.java**: Contains the test cases for the Magical Arena app with the main method to run the game along with tests.

## How to Run the Code

1. **Compile the Java Files**: Open a terminal and navigate to the `src` directory, then run:
    ```sh
    javac Player.java MagicalArenaService.java MagicalArenaApp.java
    ```
2. **Run the Application**: In the same terminal, run:
    ```sh
    java MagicalArenaApp
    ```

This will start the game, and you will see the players' fight details and the winner displayed in the console.

## Running the Tests

You can compile and run the `MagicalArenaAppTest` class to ensure the functionality of your application. Here's how to do it from the command line:
```sh
javac Player.java MagicalArenaService.java MagicalArenaApp.java MagicalArenaAppTest.java
java MagicalArenaAppTest
```
## Requirements
1. Java Development Kit (JDK) installed on your machine.
2. A terminal or command prompt to compile and run the Java files.

## Additional Information
1. The game logic involves players taking turns to attack each other, with their attack and defense determined by rolling a six-sided die.
2. The player with health reduced to zero first loses the game.
3. The code is kept simple for educational purposes and can be extended with more features like user input, graphical interface, etc.
