def getEmailHeaderTable() {

    def emailHeader = '<table cellpadding="5" border="1"><tr>'
    emailHeader += "<td><b>Environment</b></td><td>testEnvironment</td>"
    emailHeader += "<td><b>Branch</b></td><td>Branch_To_Build</td>"
    emailHeader += "<td><b>Build Type</b></td><td>buildType</td>"
    emailHeader += "</tr></table>"

    return emailHeader
}

def emailTest() {
    def email = 'abcd'
    return email
}

def getBuildResults(){
    def resultRow = ""

    def results = sh(script: "cat results.txt", returnSdout: true)

    if(result != ''){
        def resultsArray = results.split("\\R")

        resultsArray.each {

            def row = "${it}"

            def duration = ""

            def result = row.split(regex: ",")

            if(result.size > 0){


            }
        }
    }
}
return this;