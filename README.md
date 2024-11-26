# Localbuzz
This project creates an interactive buzzer system using Java Swing and key events. The program displays a graphical interface where pressing specific keys triggers corresponding actions. Each keypress activates a buzzer sound, changes the display label to a designated house name, and updates the label colour. This setup is ideal for use cases like quiz systems, where participants' keypresses signal their responses.
# LocalBuzz - Java Swing-Based Interactive Buzzer System  

LocalBuzz is a Java-based interactive buzzer system designed for quiz events and competitive environments. This project leverages Swing for its graphical interface and keyboard input to trigger sounds, display house names, and change text colours dynamically.  

---

## Table of Contents  
- [Overview](#overview)  
- [Features](#features)  
- [Requirements](#requirements)  
- [Setup and Usage](#setup-and-usage)  
- [How It Works](#how-it-works)  
- [Applications](#applications)  
- [Future Enhancements](#future-enhancements)  
- [Contributing](#contributing)  
- [License](#license)  

---

## Overview  
LocalBuzz simulates a real-world buzzer system with keypress-driven events. Each house is mapped to a specific key:  
- **1**: St. Andrew's House (Blue)  
- **2**: St. Patrick's House (Green)  
- **3**: St. Peter's House (Yellow)  
- **o**: St. George's House (Red)  

Upon pressing a valid key, the system triggers a sound, displays the house name, and changes the label colour for a specified duration.  

---

## Features  
- **Keyboard Integration**: Use specific keys to trigger unique responses.  
- **Dynamic GUI Updates**: Displays house names and changes text colour dynamically.  
- **Sound Effects**: Plays buzzer sounds using the `Audio` class (implementations needed).  
- **Error Handling**: Resets the display for invalid inputs.  

---

## Requirements  
- **Java Development Kit (JDK)** version 8 or higher.  
- **Swing Library** (included in JDK).  
- **Custom `Audio` Class** for sound effects (methods: `buzz()`, `red()`, `blue()`, `green()`, `yellow()`).  

---

## Setup and Usage  

1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/CrystalFire1o8/LocalBuzz.git
   cd LocalBuzz

