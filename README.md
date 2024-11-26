# Localbuzz
This project creates an interactive buzzer system using Java Swing and key events. The program displays a graphical interface where pressing specific keys triggers corresponding actions. Each keypress activates a buzzer sound, changes the display label to a designated house name, and updates the label color. This setup is ideal for use cases like quiz systems, where participants' keypresses signal their responses.
# Java Swing-Based Interactive Buzzer System  

This project is a Java-based buzzer system built using Swing and KeyListener. It simulates a quiz buzzer, where specific keypresses trigger sound effects and visual updates, such as house names and colors. The system is designed for interactive use cases like quiz events, making it an engaging and functional tool for competitive environments.  

---

## Table of Contents  
- [Features](#features)  
- [Requirements](#requirements)  
- [Setup and Execution](#setup-and-execution)  
- [How It Works](#how-it-works)  
- [Applications](#applications)  
- [Contributing](#contributing)  
- [License](#license)  

---

## Features  
- **Interactive Key Input**: Responds to specific keys (`1`, `2`, `3`, `o`) for distinct actions.  
- **Visual Feedback**: Displays house names ("St. George's House," "St. Andrew's House," etc.) and changes text color for each key.  
- **Sound Integration**: Plays unique buzzer sounds for each house (via the `Audio` class).  
- **Prevention of Double Input**: Ensures no repetitive triggers with a `canPress` flag.  

---

## Requirements  
1. **Java Development Kit (JDK)** version 8 or higher.  
2. **Swing** library (included in JDK).  
3. Custom `Audio` class (for buzzer sounds and house-specific effects).  

---

## Setup and Execution  
1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/yourusername/java-buzzer-system.git
