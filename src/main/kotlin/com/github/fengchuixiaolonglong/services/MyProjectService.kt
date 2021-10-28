package com.github.fengchuixiaolonglong..services

import com.intellij.openapi.project.Project
import com.github.fengchuixiaolonglong..MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
