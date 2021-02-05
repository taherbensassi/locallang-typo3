package com.github.taherbensassi.locallangtypo3.services

import com.github.taherbensassi.locallangtypo3.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
