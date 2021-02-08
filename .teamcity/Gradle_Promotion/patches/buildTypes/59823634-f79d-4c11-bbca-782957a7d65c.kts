package Gradle_Promotion.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '59823634-f79d-4c11-bbca-782957a7d65c' (id = 'Gradle_Promotion_AllBranchesStartReleaseCycleTest')
accordingly, and delete the patch script.
*/
changeBuildType(uuid("59823634-f79d-4c11-bbca-782957a7d65c")) {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}