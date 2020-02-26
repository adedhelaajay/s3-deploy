pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh './mvnw clean install'
                archiveArtifacts artifacts: 'dist/myapp.zip'
            }
        }
    }
}
