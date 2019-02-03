# Kinomo-JVM-Language
Kinomo là ngôn ngữ lập trình chạy trên Java Virtual Machine

## Compiling and running Kinomo scripts

1. Build Kinomo Compiler ==> (.jar) sử dụng Maven script

```bash
mvn clean package
```

2. Compile .ki file

- File sau khi build sẽ có tên là ```compiler-1.0-SNAPSHOT-jar-with-dependencies.jar``` được Maven lưu tại địa chỉ ```~./compiler/target/``` để Compile KiCode sử dụng lệnh sau

```bash
java -jar compiler/target/compiler-1.0-SNAPSHOT-jar-with-dependencies.jar  KinomoExamples/first.ki
```
### Result

```bash
OK: You declared variable named 'five' with value of '5' at line '1'.
OK: You instructed to print variable '0' which has value of '5' at line '2'.'
OK: You declared variable named 'name' with value of '"tranphuquy19"' at line '3'.
OK: You instructed to print variable '1' which has value of '"tranphuquy19"' at line '4'.'
```
### Run

```bash
java -cp . first
```