package com.github.jainrahul0311.myintellijplugin.services

import com.github.jainrahul0311.myintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
