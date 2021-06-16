rootProject.name = "discord4j-coroutines"

include(":common", ":rest")

rootProject.children.forEach { project -> project.name = "${rootProject.name}-${project.name}" }