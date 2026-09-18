# Currency Converter

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
1. **Launch the Application:** Compile and run `currencyConverter_2.java`. A numeric menu will appear in your console listing the available conversion pairs.
2. **Choose an Option:** When prompted with `Choose an option (1-6):`, type the number corresponding to your desired currency conversion and press **Enter**.
3. **Input Amount:** When prompted with `Enter amount to convert:`, type the numerical monetary amount you want to evaluate and press **Enter**.
4. **Verify Results:** Check that the console outputs the newly converted value formatted with two decimal places and the correct target currency symbol (`$`, `€`, `£`, or `₹`).
5. **Edge Case Testing:** Test with invalid menu choices (such as entering a number outside of 1-6) to ensure the `Invalid choice!` message triggers properly.
   
## Screenshots 
<img width="337" height="242" alt="Screenshot 2026-09-18 193901" src="https://github.com/user-attachments/assets/cac4dd36-0d38-442d-af81-eb4657496d72" />
<img width="803" height="860" alt="Screenshot 2026-09-18 193755" src="https://github.com/user-attachments/assets/a8aae20c-e55f-4eed-b6f2-382309e64f45" />
<img width="996" height="866" alt="Screenshot 2026-09-18 193742" src="https://github.com/user-attachments/assets/ad5c82c4-5b63-4962-971f-d564876cb419" />
<img width="633" height="860" alt="Screenshot 2026-09-18 193730" src="https://github.com/user-attachments/assets/85136c2f-b109-49dc-aba8-eb732d1a421f" />



