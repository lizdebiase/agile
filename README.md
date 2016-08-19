#Flexigle Agile Support

#Introduction
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

#Our Responsive Design
Our prototype works on multiple devices and is a responsive design. We implemented our front-end with the Bootstrap framework to provide a completely responsive experience. We conducted usability tests to observe users on these platforms and used Google’s chrome mobile display test tool to emulate the experience of different platforms.

#Our Tool Stack
We developed the prototype with 14 modern, open source technologies most appropriate to implement the prototype.

https://github.com/spinsys/dhs/blob/master/documentation/applicationstack.pdf

Front-End: Bootstrap, Angular.JS, Node.js, Karma, JS Hint, nvd3

Backend: Web API

Dev-Ops: TeamCity

#Our Devops Workflow
We use TeamCity as our continuous integration system to automate the running of tests and continuously deploy our code. We established BeanStalk App hooks for each branch to kickoff automated jobs. Custom jobs for each branch ran automated tests and deployed the code to Integrated Development Environment. Once tests were completed, J All pushes to the development branch are automatically examined by static code analysis, security scans, unit tests, integration tests, and performance tests. Load testing was performed ad-hoc (developer’s discretion) using Blazemeter


#Our Automated Testing
In order to maintain healthy code among the team, any team shared code was subjected to rigorous automated tests on various perspectives of quality, including code, security, performance, and functionality. Tests were executed automatically as developers submitted code to the repository. Feedback was made available to developers within minutes of the submission on a variety of criteria explained below. If all tests were successful a deployment was automatically initiated and available for review on the appropriate environment
