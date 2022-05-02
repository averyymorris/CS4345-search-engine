# CS4345 Search Engine Team 5

Authors: Avery Morris, John Jo, Burns McKay, Brandon Herman

## Search Engine

The following project includes all needed files to compile and run a search engine component for searching and returning scientific articles in the Scientist Social Network's database. 
The search engine will return a scientific article by outputting its title, url, and summary based on the user's inputted query. 

### Tech Stack

The following component was written in:
- Frontend:
    - Java
    - Scala HTML
- Backend:
    - Java
        
## How to Use 

To use the search engine, you must first log in to the demo with an **active** username and password. After clicking the link to navigate you to the search page, you can search any keywords in the search bar and click the "Search" button, which will redirect you to the results based on the keywords inputted.

The search can be farther specified and filtered by clicking on the "Advanced Search" option.


## File Structure

The component's code is split among three folders in the ```frontend/app/``` path. These include:
``` 
    controllers/
      - HomeController
      - Paper
      - PaperController
      - Query
      - User
```
The ```controllers/``` folder contains files to navigate the file and contain the logic for our functions.

``` 
    utils/
      - HttpResponse 
      - HttpUtil 
```
The ```utils/``` folder contains backend logic for routes, primarily POSTS and GETS.
``` 
    views/
      - displayResultsPage.scala.html 
      - index.scala.html 
      - login.scala.html
      - register.scala.html 
      - searchPage.scala.html 
      - showResult.scala.html
```
The ```views/``` folder contains the scala.html code that displays our frontend.

---------------------

### Team System Builds

- Avery Morris [aamorris@smu.edu] 
    - macOS Monterey 12.3.1
- Burns Clark McKay [bclarkmckay@smu.edu]
    - Windows 10 Build 19044.1645
- Brandon Herman [bherman@smu.edu]
    - Arch Linux 5.17.4
- John Jo [djo@smu.edu]
    -    Windows 10 Build 19044.1645


## Running Environment

**JDK Version**:

IntelliJ IDEA 2021.3.1 (Ultimate Edition) Build #IU-213.6461.79

**Database Version**:

MySQL 8.0.28-arm64

**Backend port number**:

#9002

## Dependencies

All library dependencies are listed in the **`build.sbt`** file in the directory:
``` 
    ebean-backend/
      - app/ 
        - build.sbt 
```

## Database

The database in use is of 

`MySQL version 8.0.28-arm64`

The SQL database can generated for Team 5's submission with the following lines of code:


```sql
CREATE DATABASE team5finalproj;

USE team5finalproj;
```
using port number: `9002`



## Extra Configuration

There should not be any needed extra configuration to run this program.

## Sample Usage

### *Sign in* using the following credentials:

***Username***: peruna

***Password***: smu

---


Entering

`rsa`

into the seach query will return the following:
```
Paper Title: Twenty Years of Attacks on the RSA Cryptosystem

Paper URL: http://crypto.standford.edu/~dabo/papers/RSA-survey.pdf

Page Summary: The RSA cryptosystem invented by Ron Rivers .. .. ..
```
