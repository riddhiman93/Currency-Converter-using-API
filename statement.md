# Project Statement: Java Currency Converter

## Problem Statement
In an increasingly interconnected global economy, individuals, travelers, and online shoppers frequently need to calculate monetary values across different international currencies. Manually tracking fluctuating daily exchange rates or relying on heavy, complex software tools is inefficient. There is a need for a lightweight, fast, and accessible utility that can fetch live market rates instantly and handle currency formatting correctly without requiring complicated installation steps.

## Scope of the Project
The scope of this project includes the design, development, and testing of a console-based Java application that:
* Connects dynamically with an external web API (ExchangeRate-API) to fetch live conversion rates.
* Processes user inputs for base currency, target currency, and numerical values via a text menu.
* Safely parses JSON responses using lightweight string-processing methods without bulky external libraries.
* Automatically incorporates Java's native international utility classes (`java.util.Currency`) for accurate currency symbol representation.
* Runs efficiently in any standard command-line environment with Java SE 11 or higher installed.

## Target Users
* **Travelers & Shoppers:** Individuals looking for quick, on-the-fly currency calculations before making international purchases or trips.
* **Students & Beginners:** Programming students learning Java fundamentals, networking (`HttpClient`), and basic API integration.
* **Developers:** Anyone seeking a clean, dependency-free reference project for console-based utility tools.

## High-Level Features
* **Real-Time Data Integration:** Secure HTTP requests fetching up-to-date foreign exchange rates.
* **Interactive Currency Menu:** Built-in code directory listing top global currencies (USD, EUR, INR, GBP, JPY, etc.) for quick user guidance.
* **Automated Symbol Formatting:** Dynamic detection and rendering of official currency symbols (e.g., `₹`, `$`, `€`).
* **Lightweight & Standalone Architecture:** Streamlined codebase requiring zero third-party dependencies or external package managers.
