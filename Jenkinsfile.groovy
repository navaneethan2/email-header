

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{

                    builds = load 'scripts/builds.groovy'
                    //emailHeaderTable = builds.getEmailHeaderTable()

                    emailTest = builds.emailTest()
                    echo "${emailTest}"
                    //echo "${emailHeaderTable}"
                }
            }
        }
    }
}