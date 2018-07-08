Spring Boot Application to retrieve the list of destination cities corresponding to a given source city 
===============================
Template for a SpringBoot application using REST Web services.

###1. Technologies used
* Maven 3.0
* Spring Boot v1.2.0.RELEASE
* 

### 2. Local file
* It  needs one local file as the source of input 
 

### 3 Application url
* The application once up, can  be accessed by http://localhost:8085/{cityName}
* This is a Full Stack Microservice that retrieves the list of destination cities corresponding to  a given city.
* {cityName} is a source city. Since currently we are using the local settings (no embedded database like HSQL or Apache Derby )
* {cityName} can be madrid or rome (and few others) etc. madrid has more data than others 
* This does not require any explicit Servlet container because the same will be provided by Spring Boot
* The port number mentioned above has to be replaced by port number used in the system in which it is run by changing *application.properties file
* Local file paths have been hardcoded in the application which has been used as the source. 
* The user of this application has to replace the path accordingly
* CityController is the main controller class.


