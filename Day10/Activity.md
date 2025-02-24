# Deploying Java Spring Boot Application using Jenkins and Setting Up a Pipeline

## Start Jenkins
To start Jenkins, download the `jenkins.war` file and run the following command:
```sh
java -jar jenkins.war
```
This will start Jenkins on the default port (typically `8080`). Open `http://localhost:8080` in your browser and follow the setup instructions.

## Jenkins is fully up and running
![Image1](https://github.com/user-attachments/assets/31306fd3-4bc6-4098-8c6f-52c2e0c0a912)

## Create a New Jenkins Job
![Image2](https://github.com/user-attachments/assets/50e09329-056f-4a5d-89f8-965139495908)

## Configure the Job
Ensure your Jenkins job is configured properly:
![Image3](https://github.com/user-attachments/assets/bfb4be76-7a45-4494-a145-6db89541d902)

![Image4](https://github.com/user-attachments/assets/be2c1eaa-4e4a-45d0-89da-f05e60f00eac)

![Image5](https://github.com/user-attachments/assets/65cbe6be-0c8c-49c6-ba25-edd9f80f090a)

## Jenkins Pipeline Script
Use the following pipeline script to build, test, package, containerize, and deploy the Spring Boot application:
```groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/sonam-niit/springproject.git'
                bat "./mvnw compile"
                echo 'Building the Project with Maven compile'
            }
        }

        stage('Test') {
            steps {
                bat "./mvnw test"
                echo 'Testing the Project with Maven test'
            }
        }

        stage('Package') {
            steps {
                bat "./mvnw package"
                echo 'Packaging the Project with Maven package'
            }
        }

        stage('Containerize') {
            steps {
                bat "docker build -t myapp2 ."
                echo 'Containerizing the App with Docker'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Check if the container exists
                    def containerExists = bat(script: 'docker ps -aq -f name=sbapp', returnStdout: true).trim()

                    if (containerExists) {
                        echo 'Stopping and removing existing container...'
                        bat(script: 'docker stop sbapp', returnStatus: true)
                        bat(script: 'docker rm sbapp', returnStatus: true)
                    } else {
                        echo 'No existing container found. Proceeding with deployment.'
                    }
                }

                // Run Docker container
                bat "docker run -d --name sbapp -p 9095:8082 myapp2"
                echo 'Deploying the App with Docker'
            }
        }
    }
}
```

## Running the Job
![Image6](https://github.com/user-attachments/assets/28b9d8dc-976c-4c0c-af42-189b0c27121e)

## Checking the Deployed Application
Access the application at `http://localhost:9095`
![Image7](https://github.com/user-attachments/assets/11301775-a1f6-4bfe-88ee-76b1ac9b1da5)

Access the application at `http://localhost:9095/api/message`
![Image8](https://github.com/user-attachments/assets/978a6f48-d6c8-4a0e-8b07-b3344c5c8990)

Access the application at `http://localhost:9095/api/product/4`
![Image9](https://github.com/user-attachments/assets/0ce96799-93a6-41a6-aa36-05e114c53783)
