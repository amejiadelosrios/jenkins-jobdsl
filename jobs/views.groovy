listView('python') {
    description('Python pipelines')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*python.*/)
    }
}