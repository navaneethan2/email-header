

pipeline{
    agent any

    stages{
        stage('email'){
            steps{
                script{

                    builds = load 'scripts/builds.groovy'
                    emailHeaderTable = builds.getEmailHeaderTable()
                    buildResultsTable = builds.getEmailBuildResultsTable()

                    emailTest = builds.emailTest()
                    echo "${emailTest}"
                    echo "${emailHeaderTable}"
                    echo "${buildResultsTable}"
                }
            }
        }
    }
}