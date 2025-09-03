pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-username/automation-demo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Publish Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
    post {
        always {
            echo "Cleaning workspace..."
            cleanWs()
        }
    }
}
