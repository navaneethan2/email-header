

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{
                    emailHeaderTable = builds.getEmailHeaderTable()
                    echo "${emailHeaderTable}"
                }
            }
        }
    }
}