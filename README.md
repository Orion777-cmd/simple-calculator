# Simple Calculator Java Servlet App

This is a basic Java servlet web application that serves as a simple calculator. It performs addition and multiplication operations based on user input.

## Features

- Addition Operation: Allows users to add two numbers.
- Multiplication Operation: Allows users to multiply two numbers.

## Technologies Used

- Java Servlet
- HTML
- Bootstrap (for styling)

## Setup and Deployment

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/simple-calculator-servlet.git

Usage
Choose Operation:

Select the operation (addition or multiplication) from the dropdown menu.
Enter Numbers:

Enter the first and second numbers in the input fields.
Calculate:

Click the "Calculate" button to perform the selected operation.
View Result:

The result will be displayed on the screen.
Request Dispatcher
The application uses the Request Dispatcher to forward the request to different servlets based on the selected operation.

OperationsServlet:

This servlet receives the initial request and extracts the selected operation. It then uses the Request Dispatcher to forward the request to either the AdditionServlet or MultiplicationServlet.
AdditionServlet and MultiplicationServlet:

These servlets perform the addition and multiplication operations, respectively. They send an HTML response containing the result.
The Request Dispatcher helps in maintaining a clean and modular structure, separating the concerns of different operations into distinct servlets.
