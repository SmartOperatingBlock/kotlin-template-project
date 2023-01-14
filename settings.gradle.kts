plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.1.0"
}

rootProject.name = "kotlin-template-project"

gitHooks {
    preCommit {
        tasks("detekt")
        tasks("ktlintCheck")
    }
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}
