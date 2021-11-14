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
                def compName = result[0].trim()
                def status = result[1].trim()

                def buildStatusStyle = getBuildStatusCellStyle(status)

                resultRow += "<tr><td>${compName}</td><td style=\"${buildStatusStyle}\">${status}</td></tr>"

            }
        }
    }
}

def getEmailBuildResultsTable() {

    def buildResults = "<table cellpadding=\"5\" border=\"1\"><tr><th>Repo</th><th>Status</th></tr>"

    buildResults += getBuildResults()
    buildResults += "</table>"

    return buildResults

}

def getBuildStatusCellStyle(String status) {

    def style = "text-align:center"

    switch(status) {
        case "SUCCESS":
            style = "text-align:center;background-color:#9ACD32;color:white"
            break
        case "SKIPPED":
            style = "text-align:center;background-color:red;color:white"
            break
    }

    return style

}
return this;