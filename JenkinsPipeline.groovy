pipeline {
  agent any
  stages {
      stage('execute ls command') {
        steps {
          echo 'execute ls command'
          bat 'dir'
        }
      }
	  stage('Where do ls command execute?') {
        steps {
          echo 'Here is default.'
          bat 'dir /A'
          echo 'you can define where to execute command.'
          echo 'For example, I want to view root directory'
          bat 'dir /A D:'
        }
      }
	  stage('Is there any other way?') { 
        steps {
          echo 'Maybe sh is independent'
          bat 'cd D:'
          bat 'chdir'
          bat 'dir /A'
          echo 'If you want to execute multiple commands in one sh.'
          bat '''cd
          chdir
          dir /A'''
        }
      }
    }
  }
