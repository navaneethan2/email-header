

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{
                    //emailHeaderTable = builds.getEmailHeaderTable()
                    emailTest = builds.emailTest()
                    echo "${emailTest}"
                    //echo "${emailHeaderTable}"
                }
            }
        }
    }
}