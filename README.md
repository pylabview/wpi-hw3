# wpi-hw3

### 1. Assignment

### 2. GitHub Repository

######  https://github.com/pylabview/wpi-hw3

1. Upload a file with a link to your github code. I should see a testing framework (like xunit) setup and unit tests + mocks. Note, you may need to refactor the code to make it testable.
2. Also in the uploaded file, discuss how you would setup a system test.

I am using IntelliJ idea IDE and taking advantage of all cool tools this idea offers. Also using Maven to build and add dependencies, including JUnit 5 and Maven  4.

###    2. Source code

```java
package com.wpi;

public class A {
    public static int f1(int x) {
        x = x + 1;
        return x;
    }

    static int f2(int x) {
        x = x + 2;
        return x;
    }

    protected static int f3(int x) {
        x = x + 3;
        return x;
    }

    private static int f4(int x) {
        x = x + 4;
        return x;
    }

    public static double f5(int x, int y) {
        return (double) x / y;
    }

    public static int f6(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x can't be negative");
        }

        return x + 5;
    }

    public static String f7(String s) {
        String ss = s + " more stuff";
        return ss;
    }

    public int f8(int x) {
        // Assume this calls a SQL database such as "select * from where something = x"
        return x + 8;
    }
}
```

```java
package com.wpi;

class B {
    private final A a;

    B(A a) {
        this.a = a;
    }

    int g1(int x) {
        return a.f8(x);
    }
}
```

```java
public class HelloWorld {
    public static void main(String[] args) {
        int v1 = A.f1(1);
        int v2 = A.f2(2);
        double v5 = A.f5(5, 2);
        int v6 = A.f6(3);
        String v7 = A.f7("hello");
        A a = new A();
        B b = new B(a);
        int v8 = b.g1(1);
    }
}
```

Maven pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.wpi</groupId>
    <artifactId>hw3</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>4.2.0</version>
        <scope>test</scope>
    </dependency>
    </dependencies>

</project>
```