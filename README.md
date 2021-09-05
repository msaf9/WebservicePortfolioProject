# Web Service Portfolio Project

## About
- A RESTful web service; that provides different cities details.

## Frameworks
- Spring

## Modules
- Spring Security
- Spring Boot
- Spring Data
- Spring MVC

## Endpoints
- Create city 
	- POST (/city/add)
    - Request model 
    ```
    {
        "cityDescription": "string",
        "cityName": "string",
        "country": "string",
        "state": "string"
    }
    ```
    - Response body
    ```
    {
        "message": "string"
    }
    ```
- Fetch all cities 
    - GET (/city/all)
    - Response body
    ```
    {
        "cityDescription": "string",
        "cityId": 0,
        "cityName": "string",
        "country": "string",
        "state": "string"
    }
    ```
- Fetch city by id 
    - GET (/city/city/{id})
    - Request parameter
    ```
        id: integer
    ```
    - Response body
    ```
    {
        "cityDescription": "string",
        "cityId": 0,
        "cityName": "string",
        "country": "string",
        "state": "string"
    }
    ```
- Delete city by id 
    - DELETE (/city/delete)
    - Request parameter
    ```
        id: integer
    ```
    - Response body
    ```
    {
        "message": "string"
    }
    ```
- Delete all cities 
    - DELETE (/city/deleteAll)
    - Response body
    ```
    {
        "message": "string"
    }
    ```
- Update city by id 
    - PUT (/city/update)
    - Request model 
    ```
    {
        "cityDescription": "string",
        "cityName": "string",
        "country": "string",
        "state": "string"
    }
    ```
    - Response body
    ```
    {
        "message": "string"
    }
    ```