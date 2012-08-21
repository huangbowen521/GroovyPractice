println "potatoe" ==~ /potatoe/

def checkSpelling(spellingAttempt, spellingRegularExpression)
{
	if(spellingAttempt ==~ spellingRegularExpression)
	{
		println("Congratulations, you spelled it correctly.")
	}else {
		println("Sorry, try again.")
	}
}

theRegularExpression = /Bowen/
checkSpelling("Bowen", theRegularExpression)
checkSpelling("Bowe",theRegularExpression)
