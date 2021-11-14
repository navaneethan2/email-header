

def getEmailHeaderTable() {

    def emailHeader = '<table cellpadding="5" border="1"><tr>'
    emailHeader += "<td><b>Environment</b></td><td>testEnvironment</td>"
    emailHeader += "<td><b>Branch</b></td><td>Branch_To_Build</td>"
    emailHeader += "<td><b>Build Type</b></td><td>buildType</td>"
    emailHeader += "</tr></table>"

    return emailHeader
}
def emailTest(){
    def email = 'abcd'
}
return this;