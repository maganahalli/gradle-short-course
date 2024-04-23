
 plugins{
    java
 }

 repositories{
     mavenCentral()
 }
 dependencies{
     testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
 }
 tasks.named<Jar>("jar") {
     manifest {
         attributes["Main-Class"] = "com.test.first.SayHello";
     }
 }

 tasks.named<Test>("test") {
     useJUnitPlatform()
 }

