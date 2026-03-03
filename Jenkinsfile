pipeline{
    agent any 
    environment
    {
        NETLIFY_SITE_ID = '4a1aac15-c15d-48cb-bc2b-41efca8a8dec'
        NETLIFY_AUTH_TOKEN=credentials('netlify-token')
    }

    stages{
        stage('Build')
        {
            agent{
                docker {
                    image 'node:18-alpine'
                    reuseNode true

                }
            }
            steps{
                sh '''
                ls -la
                node --version
                npm --version
                npm ci
                npm run build
                ls -la
                '''
            }
        }
        stage('Deploy')
        {
            agent{
                docker {
                    image 'node:18-alpine'
                    reuseNode true

                }
            }
            steps{
                sh '''
               npm install -g netlify-cli
                netlify version
                echo "deploying to production. SIteID: $NETLIFY_SITE_ID"
                netlify status
                netlify deploy --dir=build --prod
                '''
        
        }

    }
  }
}
