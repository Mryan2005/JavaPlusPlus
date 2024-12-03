# install the package

firstly, you should add the following line to your `~/.m2/settings.xml` file:

```xml
    <activeProfiles>
            <activeProfile>github</activeProfile>
    </activeProfiles>
    <profiles>
        <profile>
            <id>github</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                </repository>
                <repository>
                    <id>github</id>
                    <url>https://maven.pkg.github.com/Mryan2005/JavaPlusPlus</url>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>
    
    <servers>
        <server>
            <id>github</id>
            <username>Mryan2005</username>
            <password>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</password>
        </server>
    </servers>
```

And then you will see the following code in your `./m2/settings.xml` file

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
    // ...
    <activeProfiles>
            <activeProfile>github</activeProfile>
    </activeProfiles>
    <profiles>
        <profile>
            <id>github</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                </repository>
                <repository>
                    <id>github</id>
                    <url>https://maven.pkg.github.com/Mryan2005/JavaPlusPlus</url>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>
    
    <servers>
        <server>
            <id>github</id>
            <username>Mryan2005</username>
            <password>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</password>
        </server>
    </servers>
    // ...
</settings>
```

Then you can add the following code to your `pom.xml` file:

```xml
<dependency>
  <groupId>top.mryan2005.javaplusplus</groupId>
  <artifactId>javaplusplus</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```