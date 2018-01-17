# Project Virtual Quizz

Welcome to the virtual quizz project. In this project, you will a develop a quizz application that runs on both Web and Android Platform.

## How to

To work on this project:
 1. Team leader adds his colleagues as contributors
 2. Code / test / validate / close issues
 5. Document
 6. ???
 7. Profit

## Project Management

The project is organized in milestones. To complete a milestone you must close the issues.

How to close an issue:
To close an issue, you must link the sources that closes this and also link the unit test(s) that is/are associated to this issue. Would one of these be missing, the issue will not be considered close by the grader.


## Documenting the project

Proper ways to document:
 * Javadoc your method
 * Swagger or alike for REST documentation
 * Github Wiki for architecture, installation guide

## Grades

The project will be graded based on the following item:
 * Advances: how many issues you completed, which milestone you reached. Note that an issue closed without unit test will not be considered valid
 * Code quality: is your code well organized, did you follow the requirements
 * Documentation: documenting your code is necessary. Sequence diagram for the main operation are also required. They must be placed in the doc directory. The filename must start with the issue number.
 * Extra features: you are free to add new features, for this purpose, first document an issue and close it when the feature is implemented. However do not forget to first implement the required features before adding extra ones.
 
 There will be three grades on the project, each on topics seen during the INFO6 module:
  1. Backend
  2. Mobile application
  3. Web Frontend + Security

## Project structure

    └── quizz-android                                    Android project
    └── quizz-backend                                    Maven project for the spring boot backend
        └── src/main/java/fr/tse/info6/quizzbackend      Root directory for the Java files
        └── src/main/resources                           Root directory for the resources
    └── quizz-documentation                              Directory for documentation - Sequence diagrams mostly
    └── .gitignore                                       
    └── README.md                                        This file
