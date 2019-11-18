pipeline {
  agent any
  stages {
      stage('execute ls command') {
        steps {
          echo 'execute ls command'
          bat 'dir'
        }
      }
    }
  }
