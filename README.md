# SDAT_QAP2

* Project: QAP2  SpringBoot REST API Resource Pattern and Containerization
* Course Name: Software Design, Architecture and Testing
* Written by: David Turner
* Due Date: April 5, 2023

- This is a REST API for the SDAT QAP2 project.
- The idea is to have a REST API that can be used to query the database and return the results in JSON format.
- This is one simple resource following the RepositoryRestResource pattern and testing it in a running Docker container locally using the Dockerfile and docker-compose.yml files.

- Note: Prior to creating the image and running the docker container locally, the database must be created and populated with data and this was done using MySQL Workbench and postman to test the REST API.
After the database was populated and tested using postman, the Docker image was created and the container was run locally and again tested using postman.

- The steps to build and run the project were as follows:
1. Create a new package under the java folder.
2. Create the necessary classes for the resource, in this case Hockey.java this file contains the entity class for the database table.
3. The HockeyAPIService is an interface that extends JpaRepository and contains the necessary methods to query the database, it is implemented by HockeyAPIServiceImpl.
4. RestServiceApplication.java is the main class that contains the @SpringBootApplication annotation and is used to run the application.
5. Application.properties contains the database connection details to MySQL Desktop and the port number for the REST API.
6. Within edit configurations the clean package configuration was added to build the project, this is used to clean the project of any previous builds and build the jar file.
7. The jar file is then used to build the Docker image using the Dockerfile.
8. Two other files are created Dockerfile and docker-compose.yml, these are used to build the Docker image and run the container locally.
9. The Dockerfile contains the instructions to build the Docker image.
10. The docker-compose.yml file contains the instructions to run the container locally.
11. Once completed run the command in the terminal "docker build -t david_turner_sdat_qap2 ." to build the Docker image.
12. In the terminal command "docker-compose up" to run the container locally.
13. Once the container is running and no errors are displayed.
14. Open postman and test the REST API one last time.
