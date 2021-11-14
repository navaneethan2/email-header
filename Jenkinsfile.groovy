

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{

                    builds = load 'scripts/bulds.groovy'
                    //emailHeaderTable = builds.getEmailHeaderTable()

                    emailTest = builds.emailTest()
                    echo "${emailTest}"
                    //echo "${emailHeaderTable}"
                }
            }
        }
    }
}