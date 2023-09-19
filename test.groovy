pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'WelCome In Jenkins World'
            }
        }
    }
}
