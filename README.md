# Java Currency Converter

## Overview of the Project
The Java Currency Converter is a lightweight, console-based software application designed to provide real-time currency conversion functionality. By integrating with a live web API, the application allows users to convert monetary amounts between global currencies accurately, taking into account current market rates. It features an interactive text menu displaying standard currency codes and utilizes native Java features for local formatting.

## Features
* **Live Exchange Rates:** Fetches up-to-date conversion rates dynamically through an external web service API.
* **Interactive Menu:** Provides a structured information chart containing top global currency options and their ISO codes for easy user selection.
* **Standardized Symbol Formatting:** Leverages Java's built-in utility classes to automatically retrieve and display official symbols (such as $, €, £, and ₹) for target currencies.
* **Lightweight String Parsing:** Employs standard string splitting techniques to read JSON responses directly without requiring bulky external library dependencies like Gson or Jackson.

## Technologies/Tools Used
* **Programming Language:** Java (JDK 11 or higher)
* **Core Libraries & Packages:** `java.util.Scanner`, `java.net.http.HttpClient`, `java.util.Currency`
* **External API:** ExchangeRate-API for live currency conversion data pairs

## Steps to Install & Run the Project
1. Clone or download the repository containing the project files to your local machine.
2. Open the project folder in your preferred Java Integrated Development Environment (such as IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure that the source code file `currencyConverter.java` is located correctly in your working directory.
4. Compile the Java program using the terminal or command prompt:
   ```bash
   javac currencyConverter.java

## Instructions for Testing

1. **Launch the Application:** Run the program; a text-based menu listing currency codes (e.g., `USD`, `EUR`, `INR`, `GBP`) will appear in your console.
2. **Enter Base Currency:** When prompted, type the 3-letter currency code for the base currency you wish to convert from (e.g., `USD`) and press **Enter**.
3. **Enter Target Currency:** Type the 3-letter currency code for the target currency you wish to convert to (e.g., `INR`) and press **Enter**.
4. **Input Amount:** Enter the numerical monetary amount you want to evaluate when prompted.
5. **Verify Results:** Check that the console outputs the correct converted value accompanied by the appropriate target currency symbol. 
6. **Edge Case Testing:** Test with multiple currency pairs and edge cases (such as invalid currency codes or simulated network disruptions) to ensure that error messages trigger properly.

## Screenshots 
* **Code:**
<img width="692" height="762" alt="Screenshot 2026-09-16 231640" src="https://github.com/user-attachments/assets/71e5006d-ae3d-430a-8b20-3901fbf30534" />
<img width="842" height="557" alt="Screenshot 2026-09-16 231656" src="https://github.com/user-attachments/assets/bb822680-1637-4f51-a44e-5085fd84cc27" />
* **Output:**
<img width="492" height="337" alt="Screenshot 2026-09-16 231716" src="https://github.com/user-attachments/assets/5938104b-9430-43d3-a42f-b4bd4e8d03b8" />


