package com.example

import com.android.tools.idea.concurrency.coroutineScope
import com.android.tools.idea.projectsystem.*
import com.android.tools.idea.run.ApkProvider
import com.android.tools.idea.run.ApplicationIdProvider
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.rd.util.launchChildOnUi
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElementFinder
import com.intellij.psi.search.GlobalSearchScope
import kotlinx.coroutines.delay
import org.jetbrains.android.facet.AndroidFacet
import java.nio.file.Path

class ProjectSystemImplementation(private val project: Project) : AndroidProjectSystemProvider {
    override val id: String = "Test PS"

    override val projectSystem: AndroidProjectSystem = object : AndroidProjectSystem {
        override fun getApkProvider(runConfiguration: RunConfiguration): ApkProvider? {
            TODO("Not implemented")
        }

        override fun getApplicationIdProvider(runConfiguration: RunConfiguration): ApplicationIdProvider? {
            TODO("Not implemented")
        }

        override val submodules: Collection<Module> = listOf()

        override fun allowsFileCreation(): Boolean {
            TODO("Not yet implemented")
        }

        override fun getAndroidFacetsWithPackageName(
            project: Project,
            packageName: String,
            scope: GlobalSearchScope
        ): Collection<AndroidFacet> {
            TODO("Not yet implemented")
        }

        override fun getBuildManager(): ProjectSystemBuildManager {
            TODO("Not yet implemented")
        }

        override fun getDefaultApkFile(): VirtualFile? {
            TODO("Not yet implemented")
        }

        override fun getLightResourceClassService(): LightResourceClassService {
            TODO("Not yet implemented")
        }

        override fun getModuleSystem(module: Module): AndroidModuleSystem {
            TODO("Not yet implemented")
        }

        override fun getPathToAapt(): Path {
            TODO("Not yet implemented")
        }

        override fun getPsiElementFinders(): Collection<PsiElementFinder> {
            TODO("Not yet implemented")
        }

        override fun getSourceProvidersFactory(): SourceProvidersFactory {
            TODO("Not yet implemented")
        }

        override fun getSyncManager(): ProjectSystemSyncManager {
            TODO("Not yet implemented")
        }
    }

    override fun isApplicable(): Boolean {
        project.coroutineScope.launchChildOnUi {
            delay(1000)
            println("Hello")
        }
        return false
    }
}
