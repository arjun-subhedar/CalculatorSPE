pipeline{
    environment{
        DOCKERHUB_CRED = credentials("Docker_credentials")
    }
    agent any
    stages{
        stage("Stage 1 : Git Clone"){
            steps{
//                 git credentialsId: 'GitHub_credentials', url: 'https://github.com/arjun-subhedar/CalculatorSPE.git', branch: 'master'
//                 git "https://github.com/arjun-subhedar/CalculatorSPE.git"
                 sh 'ls'
            }
        }

        stage("Stage 2 : Maven Build"){
            steps{
                sh 'mvn clean install'
            }
        }

        stage("Stage 3 : Build Docker Image"){
            steps{
                sh "docker build -t arjunsubhedar/calculator:latest ."
            }
        }

        stage("Stage 4 : Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "docker push arjunsubhedar/calculator:latest"
            }
        }

        stage("Stage 5 : Clean Unwanted Docker Images"){
            steps{
                sh "docker container prune -f"
                sh "docker image prune -a -f"
            }
        }
()
        stage('Stage 6 : Ansible Deployment') {
            steps {
//                 ansiblePlaybook colorized: true,
//                 credentialsId: 'localhost',
//                 installation: 'Ansible',
//                 inventory: 'inventory',
//                 playbook: 'Deploy_Calculator.yml'
                    sh 'ansible-playbook -i inventory Deploy_Calculator.yml'

             }
        }
    }
}