Feature: Login Application

Scenario: Home page default Login
Given user is on the landing page
When user login into application with username "smartkowshic@gmail.com" and password "facepass24"
Then home page should display

Scenario: Home page default Login
Given user is on the landing page
When user login into application with username "xyz" and password "password"
Then home page should display