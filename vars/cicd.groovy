def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def newMaven()
{
  sh "mvn package"
}

def newDeploy(jobname,ipaddress,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapp/${context}.war"
}
