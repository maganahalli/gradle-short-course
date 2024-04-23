
 plugins{
    java
 }

 tasks.named<Jar>("jar"){
    manifest  {
        attributes["Main-Class"] = "com.test.first.SayHello";
    }

    repositories{
      mavenCentral()
    }

    dependencies{
      testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    }

 }