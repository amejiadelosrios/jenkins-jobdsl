multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(5)
    }
    branchSources {
        git {
            remote("https://github.com/amejiadelosrios/test-jenkins-1.git")
            credentialsId('amejiadelosrios')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}