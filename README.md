#Challenge Overview
#Our Solution: **Recognize**
#Environments
We used the following three environments that were provisioned using AWS.

+ Developer Integration Environment : is the test and integration environment for all of the developers. This is the environment where all developers validate the integration their code to others', by manual and automated testing.   [https://dhsdev.spinsys.com](https://dhsdev.spinsys.com/dhsweb "Dev Environment")

+ UAT Environment : We used this environment to review the Sprint deliverables
 completed by the team and to collect feedback from the user. We also used this environment to conduct functional test, responsive test and section 508 tests
 [https://dhsuat.spinsys.com](https://dhsuat.spinsys.com/dhsweb "UAT Environment")

+ Prod Environment : We used this environment to release the final MVP after the end of two sprints.[https://dhsprod.spinsys.com](https://dhsprod.spinsys.com/dhsweb "Dev Environment")

#Application Architecture
One of the goals of the architecture is to surface the data in a simple way so that we can add new ways to get to the data or even add data quickly. We stored the data in SQL Server and we choose Entity Framework (EF)  to rapidly create data models. We used ASP.NET Web API to serve JSON data.

+ **Front End Layer:** We used Angular JS, one of the most powerful and adaptive Javascript framework and Bootstrap, popular CSS responsive front-end framework to build our dynamic and responsive UI.s our responsive screens.These two framework enabled our development team to build a modular and easily testable application.

+ **ASP.NET RESTFUL Web API Backend Layer:** We used The **ASP.NET Web API** , one of the Microsoft _open source technology_ to build the powerful ****. It exposed CRUD operations on the data. We used The Repository Pattern to create abstract layer by isolating business objects from Data Access Layer. With this we maximize the amount of code for automated unit testing and isolated data access from data store. This pattern allowed us  to centralize data access, code readability and maintainability and have flexible architecture. We built the API using REST architecture principles.

+ **Entity Framework Layer:** Entity framework is an object-relational mapping framework(ORM) that enabled our team to work with relational data using domain-specific objects and provided a conceptual model of the domain entities. It allowed to translate the C# models used by Web API into database entities.

At a high level, here is the architecture of the application

![ar] (https://github.com/spinsys/dhs/blob/master/images/AppArchitecture.png "Architecture")


#Tool Stack
We developed the prototype with 14 modern, open source technologies most appropriate to implement the prototype.

https://github.com/spinsys/dhs/blob/master/documentation/applicationstack.pdf
+ Front-End: Bootstrap, Angular.JS, Node.js, Karma, JS Hint, nvd3
+ Backend: Web API
+ Dev-Ops: TeamCity

#Coding Practices & Automated Testing
#Development Workflow & DEVOPS
#Design: Wireframes/Personas/Mockups
#Agile Process & Artifacts
Prototype: https://dhsprod.spinsys.com/

Development: https://dhsdev.spinsys.com/dhsweb1
             https://dhsdev.spinsys.com/dhsapi1
             
Staging: https://dhsuat.spinsys.com/dhsweb1
             https://dhsuat.spinsys.com/dhsapi1
             
#The Challenge

#The Solution

#Digital Services Playbook

We closely followed the Digital Services playbook guidelines as detailed in the link below:U.S. Digital Services Playbook (https://playbook.cio.gov)

We have outlined our process here:
https://github.com/spinsys/dhs/blob/master/documentation/DigitalServicePlays.md

#Source Control
The team utilized BeanStalkapp (git protocol) for distributed source control. We leveraged the GitFlow model of propagating code from feature branches, to development, to release, and finally to production. 

#Our Style Guide/ Wireframes/ Mockups

Login Screen Mockup:
https://marvelapp.com/2agi97a

Basecamp: https://basecamp.com/2515051/projects/12717716   [ Use username:demo pwd: demo to see the project ]

#Our Iterative Agile Process

#Sprint
![logo] (http://cdn2.hubspot.net/hubfs/1789978/icons-CS76-01.png?t=1471546217499 "sprint")

#Our Responsive Design
Our prototype works on multiple devices and is a responsive design. We implemented our front-end with the Bootstrap framework to provide a completely responsive experience. We conducted usability tests to observe users on these platforms and used Google’s chrome mobile display test tool to emulate the experience of different platforms.

#Our Tool Stack

#Our Devops Workflow
We use TeamCity as our continuous integration system to automate the running of tests and continuously deploy our code. We established BeanStalk App hooks for each branch to kickoff automated jobs. Custom jobs for each branch ran automated tests and deployed the code to Integrated Development Environment. Once tests were completed, J All pushes to the development branch are automatically examined by static code analysis, security scans, unit tests, integration tests, and performance tests. Load testing was performed ad-hoc (developer’s discretion) using Blazemeter


#Our Automated Testing
In order to maintain healthy code among the team, any team shared code was subjected to rigorous automated tests on various perspectives of quality, including code, security, performance, and functionality. Tests were executed automatically as developers submitted code to the repository. Feedback was made available to developers within minutes of the submission on a variety of criteria explained below. If all tests were successful a deployment was automatically initiated and available for review on the appropriate environment
