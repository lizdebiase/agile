#Automated API Testing

In order to preserve vigorous API code among the team, any team shared code was exposed to automated tests on code and functionality. Tests were performed automatically every API service submitted to the repository. Feedback was given to developers within minutes of the submission on a variety of criteria explained below. If all tests were successful a development build will be created. 

![APIFunctionalProcess] (https://github.com/spinsys/dhs/blob/master/images/APIFunctionalTestProcess.PNG)

Create API functional tests to verify all services
Using Visual Studio 2013 NUnit functional testing, these tests were used to validate the service calls in the backend that was serving up useful information to our front end through a RESTful interface. Test execution is done using TeamCity CI tool when the solution is built. 
