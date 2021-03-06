rootProject.name = "okhttp-parent"

include(":mockwebserver")
include(":mockwebserver-deprecated")
include(":mockwebserver-junit4")
include(":mockwebserver-junit5")

if (System.getProperties().containsKey("android.injected.invoked.from.ide") ||
        System.getenv("ANDROID_SDK_ROOT") != null) {
  // Currently incompatible with Intellij, use with Android Studio and from CLI with explicit flag
  include(":android-test")
  include(":regression-test")
}

include(":native-image-tests")

include(":okcurl")
include(":okhttp")
include(":okhttp-bom")
include(":okhttp-brotli")
include(":okhttp-dnsoverhttps")
include(":okhttp-hpacktests")
include(":okhttp-logging-interceptor")
include(":okhttp-sse")
include(":okhttp-testing-support")
include(":okhttp-tls")
include(":okhttp-urlconnection")
include(":samples:compare")
include(":samples:crawler")
include(":samples:guide")
include(":samples:simple-client")
include(":samples:slack")
include(":samples:static-server")
include(":samples:unixdomainsockets")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven(url = "https://dl.bintray.com/kotlin/dokka")
        google()
    }
}
