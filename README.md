# Multi-Threaded Web Server 🚀

This project implements a simple multi-threaded web server in Java. The server handles HTTP GET requests and serves static resources such as HTML files and images (JPEG and GIF).
Each incoming client connection is processed on its own thread, allowing the server to handle multiple requests simultaneously. 💻🌐

## How to Run the Server ⚙️

1. **Compile the source code**  
   Open a command prompt or terminal in the project directory and run:  
   javac ServidorWeb.java SolicitudHttp.java

2. **Run the server**  
   Ensure that the resources (HTML files, images, etc.) are accessible via the classpath, then run:  
   java -cp .:resources ServidorWeb  
   

## How to Test the Server 🔍

- Open your web browser and navigate to:  
  http://localhost:6789/index.html  
  This should display the home page. 🏠

- To test image delivery, open:  
  http://localhost:6789/imagen.jpg  
  or  
  http://localhost:6789/imagen.gif  
  You should see the images correctly displayed. 🖼️

- To verify error handling, request a non-existent file such as:  
  http://localhost:6789/nonexistent.html  
  You should see a 404 error response. ❌
