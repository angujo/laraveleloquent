package com.github.angujo.laraveleloquent.services

import com.github.angujo.laraveleloquent.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
