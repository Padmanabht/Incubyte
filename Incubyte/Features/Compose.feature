Feature: Composing and sending email

@Incube
Scenario: User should be able to compose and send an email

Given  User launches browser
And    User is logged in gmail with Email ID "abc@gmail.com" and password "password_1"
When   User clicks on compose button
And    User enters recepients Email Id "xyz@gmail.com"
And    User enters subject "Incubyte" & body "Automation QA test for Incubyte"
Then   User clicks on send button