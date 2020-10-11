multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote("https://github.com/amejiadelosrios/test-jenkins-1.git")
            id("cbfb0bcb-6c38-4d07-810e-4c84606289e1")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}