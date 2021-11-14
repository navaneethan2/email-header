

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{

                    builds = load 'script/bulds.groovy'
                    //emailHeaderTable = builds.getEmailHeaderTable()

                    emailTest = builds.emailTest()
                    echo "${emailTest}"
                    //echo "${emailHeaderTable}"
                }
            }
        }
    }
}