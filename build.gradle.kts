import Dep.Kotlin.reflect
import Dep.Kotlin.stdlib
import Dep.commonmark
import Dep.commonmarkExtGfmTables
import Dep.coroutines
import Dep.httpClient
import Dep.jacksonKotlin
import Dep.jacksonXml
import Dep.junit
import Dep.kotlinVersion
import Dep.mockk

plugins {
    application
    kotlin("jvm") version Dep.kotlinVersion
}

application {
    mainClassName = "link.kotlin.scripts.Application"
}

repositories {
    jcenter()
    maven { url = uri("https://dl.bintray.com/heapy/heap") }
}

dependencies {
    implementation(stdlib)
    implementation(reflect)
    implementation(coroutines)

    implementation(jacksonXml)
    implementation(jacksonKotlin)

    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("io.sentry:sentry-logback:1.7.30")

    implementation("com.rometools:rome:1.12.2")
    implementation("com.github.dfabulich:sitemapgen4j:1.1.2")
    implementation("org.jsoup:jsoup:1.13.1")
    implementation("by.heap.remark:remark-kotlin:1.2.0")

    implementation(kotlin("scripting-common"))
    implementation(kotlin("scripting-jvm"))
    implementation(kotlin("scripting-jvm-host-embeddable"))

    implementation(commonmark)
    implementation(commonmarkExtGfmTables)

    implementation(httpClient)
    implementation("org.apache.httpcomponents:httpcore:4.4.13")
    implementation("org.apache.httpcomponents:httpcore-nio:4.4.13")

    testImplementation(mockk)
    testImplementation(junit)
}
