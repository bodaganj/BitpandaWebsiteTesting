Narrative:
As a user of e-commerce web site
I want to be able to sign in to my account
Or to see appropriate alerts if credentials are not correct

Scenario: Sign in using existed credentials
Given sign in page is opened
When user tries to sign in with the following credentials: email = bodaganj@gmail.com and password = Qazqaz123
Then my account page is shown

Scenario: Sign in using incorrect credentials
Given sign in page is opened
When user tries to sign in with the following credentials: email = wrongEmail and password = fakePassword
Then appropriate alert is shown