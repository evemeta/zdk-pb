apply<org.gradle.api.publish.maven.plugins.MavenPublishPlugin>()

val localProperties = java.util.Properties().also { rootProject.file("local.properties").takeIf { it.exists() }?.inputStream()?.use(it::load) }

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.evemeta.zdk"
            artifactId = "pb"
            version = "1.0.0"

            artifact(file("build/libs/pb-1.0.0.jar"))
        }
    }
    repositories {
        maven {
            url = uri("https://gitlab.com/api/v4/projects/47835937/packages/maven")
            credentials(HttpHeaderCredentials::class) {
                name = "Private-Token"
                value = localProperties.getProperty("gitlabAccessToken") ?: System.getenv("GITLAB_ACCESS_TOKEN") ?: "unknown"
            }
            authentication {
                create<HttpHeaderAuthentication>("header")
            }
        }
    }
}