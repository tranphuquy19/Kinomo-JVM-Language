# Kinomo-JVM-Language
Kinomo là ngôn ngữ lập trình chạy trên Java Virtual Machine

Download Kinomo Compiler [Kinomo-Compiler-v1.0](https://github.com/tranphuquy19/Kinomo-JVM-Language/raw/master/Documentations/Kinomo-release-v1.0.jar)


## Compiling and running Kinomo scripts

1. Build Kinomo Compiler ==> (.jar) sử dụng Maven script

```bash
mvn clean package
```

2. Compile .ki file

### Code ```~./KinomoExamples/first.ki```

```bash
first {
        void main (string[] args) {
            var x = 50
            OutVar(x)
        }

        void OutVar (int param) {
            echo param
        }
}
```

- File sau khi build sẽ có tên là ```compiler-1.0-SNAPSHOT-jar-with-dependencies.jar``` được Maven lưu tại địa chỉ ```~./compiler/target/``` để Compile KiCode sử dụng lệnh sau

```bash
java -jar compiler/target/compiler-1.0-SNAPSHOT-jar-with-dependencies.jar  KinomoExamples/first.ki
```


### Run

```bash
java -cp . first
```

### Result

```50```

### Decompiled ```~~/first.ki```

-   Thử xem file ```first.ki``` sau khi biên dịch sẽ như thế nào, ở đây mình sài trình dịch ngược mặc định của IntelliJ IDEA từ ".class" về ".java"

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class first {
    public static void main(String[] var0) {
        boolean var1 = true;
        OutVar(50);
    }

    public static void OutVar(int var0) {
        System.out.println(var0);
    }
}

```
