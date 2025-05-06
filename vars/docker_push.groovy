def call(String Project, String ImageTag, String dockerhubuser){
  withcredentials([usernamePassword(credentialsId: 'dockerHubCred',passwordVariables: 'dockerHubPass', usernameVariable:'dockerHubUser')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
