@Library('global-pipeline-libraries@main') _
import com.seemscloud.ExampleClass


pipeline {
    agent none
    stages {
        stage('Stage: #0 (Parallel)') {
            parallel {
                stage('Python 3.11') {
                    agent { label 'python-3-11' }
                    steps {
                        container('python') {
                            script {
                                ExampleClass.getString()
                            }
                            sh '''
                                python3 --version
                            '''
                        }
                    }
                }
//                 stage('Ubuntu Latest') {
//                     agent { label 'python-3-10' }
//                     steps {
//                         container('python') {
//                             sh '''
//                                 python3 --version
//                             '''
//                         }
//                     }
//                 }
            }
        }
//         stage('Stage: #1 (Python 3.10)') {
//             agent { label 'python-3-10' }
//             steps {
//                 container('python') {
//                     sh '''
//                         python3 --version
//                     '''
//                 }
//             }
//         }
//         stage('Stage: #2 (Python 3.11)') {
//             agent { label 'python-3-10' }
//             steps {
//                 container('python') {
//                     sh '''
//                         python3 --version
//                     '''
//                 }
//             }
//         }
    }
}