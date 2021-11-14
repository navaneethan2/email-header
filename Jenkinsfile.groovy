

pipeline{
    agent any

    stages{
        stage('email'){
            emailHeaderTable = builds.getEmailHeaderTable()
            echo "${emailHeaderTable}"
        }
    }
}