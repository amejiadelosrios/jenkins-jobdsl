listView('python') {
    description('Python pipelines')
    filterBuildQueue()
    filterExecutors()
    jobs {
        name(/.*python.*/)
        regex(/project-A-.+/)
    }
}