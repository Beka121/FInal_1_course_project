
# Complaint Resolution System

## Overview

**Title:** Complaint Resolution System  
**Student:** Эмилев Бектур

### Description:
This program allows users to manage complaints by adding, listing, resolving, and categorizing them. The system automatically categorizes complaints based on their descriptions using AI and saves them to a CSV file. The program also provides functionalities to resolve complaints and view details about the complaints in a user-friendly interface.

---

## Objectives:
- **Add Complaints:** Users can enter a complaint with a description, and the system will categorize it automatically.
- **List Complaints:** The program will display all stored complaints in a readable format.
- **Resolve Complaints:** Users can resolve a complaint by providing a resolution, which updates the complaint status.
- **Categorize Complaints Automatically:** Complaints are categorized based on keywords in the description using an AI algorithm.
- **Save to CSV:** Resolved complaints are saved to a CSV file for record-keeping.
- **Validate Input:** The program ensures that user inputs are valid and properly formatted.

---

## Project Requirements List:
1. **Add Complaint:** Users must be able to add a complaint by providing a description and their name.
2. **Categorize Complaints:** Complaints must be categorized based on their description using an AI-based categorization system.
3. **List Complaints:** The program should display a list of all complaints with their details.
4. **Resolve Complaints:** Users must be able to resolve complaints by providing a resolution.
5. **Save Complaints to CSV:** Resolved complaints should be saved in a CSV file for record-keeping.
6. **Validate Input:** Ensure that the user inputs valid complaint descriptions and resolutions.
7. **Handle Errors:** The program should handle errors gracefully, including invalid complaint numbers and failed file writes.
8. **AI Categorization:** Complaints should be automatically categorized based on keywords from a predefined list loaded from a file.
9. **Display Complaint Details:** Complaints should be displayed with all relevant information, including name, description, category, and resolution.
10. **Exit Program:** The program should allow users to exit the program when desired.

---

## Documentation

### Algorithms and Functions:
- **AI Categorization:** The AI categorizes complaints by comparing the complaint description with predefined categories and their associated keywords. If a keyword from the complaint is found in the list of keywords for a category, the complaint is assigned to that category.
- **Complaint Resolution:** When a user resolves a complaint, the system updates the complaint’s status and stores the resolution.
- **CSV Saving:** Resolved complaints are saved to a CSV file using `CSVWriter`. Each complaint’s name, description, category, and resolution are saved in a new line of the file.
- **Complaint Listing:** All stored complaints are displayed in a user-friendly format showing their details.

### Data Structures:
- **ArrayList<Complaint>:** Stores all complaints entered by the user.
- **Map<String, List<String>> categories:** Stores the categories and their associated keywords for AI-based categorization.
- **Scanner:** Used for reading user input.
- **BufferedReader:** Reads category data from a file.
- **CSVWriter:** Writes resolved complaints to a CSV file.

### Challenges:
- **Keyword Matching:** The AI categorization requires accurate keyword matching, which can sometimes result in false positives or miscategorization.
- **Handling Errors:** Ensuring that errors such as invalid inputs or file write issues are handled gracefully and don’t crash the program.
- **File Management:** Properly saving and reading complaint data from CSV files while ensuring no data loss.

---

## Test Cases and Outputs

### Sample User Inputs and Expected Outputs:

#### Test Case 1: Add Complaint
```plaintext
Enter your name: Arsen
Enter complaint: The service was very slow.
Complaint added with category: Service Issues

Enter your name: Bektur
Enter complaint: The product is defective.
Complaint added with category: Product Issues
```

#### Test Case 2: List Complaints
```plaintext
1. Complaint #1
Name: Arsen
Complaint: The service was very slow.
Category: Service Issues
Resolution: Not resolved
--------------------
2. Complaint #2
Name: Bektur
Complaint: The product is defective.
Category: Product Issues
Resolution: Not resolved
--------------------
```

#### Test Case 3: Resolve Complaint
```plaintext
Enter complaint number to resolve: 1
Enter resolution: Apologized and offered a discount.
Complaint resolved.
```

#### Test Case 4: Save to CSV (After Resolution)
```plaintext
The CSV file "complaints.csv" is updated with the resolved complaint.
```

---

## Code

The code for the complaint resolution system is implemented in multiple classes:

1. **Complaint:** Defines the structure of a complaint with attributes such as name, description, category, and resolution.
2. **ComplaintManager:** Manages complaints by allowing the user to add, list, and resolve complaints.
3. **AI:** Contains the logic for categorizing complaints based on keywords.
4. **CSVWriter:** Handles saving the resolved complaints to a CSV file.
5. **Main:** The main class that provides the user interface to interact with the system.

---

## Files Used:
- **categories.txt:** A file that contains categories and their associated keywords. This file is loaded at runtime to assist in categorizing complaints.
- **complaints.csv:** A CSV file where resolved complaints are saved for record-keeping.

---

## Screenshots and Outputs:

(Include screenshots or any sample outputs showing how the program behaves for the user. These should demonstrate adding complaints, resolving them, and saving them to a CSV file.)

---

## Thank You!

If you have any questions or suggestions, feel free to reach out!
