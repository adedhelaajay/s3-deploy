pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh './mvnw clean package'
				archiveArtifacts artifacts: 'target/springapp-0.0.1-SNAPSHOT.war', excludes: 'target'
            }
        }
    }
}
