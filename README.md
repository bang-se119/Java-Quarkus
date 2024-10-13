# Backend Java Learning
![image](https://github.com/user-attachments/assets/e3e70bb7-4e01-4857-8147-4f6832d71aed)
## References:
[Roadmap.sh](https://roadmap.sh/java)
## Contacts
- **Author**: Dang Duy Bang (BangDD) <br>
- **Ideas and Scenarios**: Dang Duy Bang (BangDD) <br>
- [![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bangdd/)

## Table of contents

[I. Fundamentals](#i-fundamentals)
- [1. Basic syntax](#1-basic-syntax)
- [2. Data types, variables](#2-data-types-variables)
- [3. Conditionals](#3-conditionals)
- [4. Functions ( Methods )](#4-functions--methods)
- [5. Working with Date and Time](#5-working-with-date-and-time)
___
- [6. Data structure](#6-data-structure)
- [7. OOP](#7-oop)
- [8. Packages](#8-package)
- [9. Working with Files and APIs]()
___
- [10. Loops]()
- [11. Exception Handling]()

[II. Getting deeper]()
- [1. Memory Management]()
- [2. Collection Framework]()
- [3. Serialization]()
- [4. Networking & Sockets]()
___
- [5. How JVM works?]()
- [6. Garbage Collection]()
- [7. Basic Threads]()
___
- [8. Generics]()
- [9. Streams]()

[III. Build Tools]()
- [1. Gradle]()
- [2. Maven]()
- [3. Ant]()

[IV. Web Frameworks]()
- [1. Spring]()
- [2. Spring Boot]()
- [3. Spark]()
- [4. Quarkus]()

[V. ORM (Object - Relational Mapping)]()
- [1. Spring Data JPA]()
- [2. Hibernate]()
- [3. EBean]()
- [4. JPA()]()

[VI. JDBC]()
- [1. JDBI3]()
- [2. JDBC Template]()

[VII. Logging Frameworks]()
- [1. SLF4J]()
- [2. TinyLog]()
- [3. Logback]()
- [4. Log4j2]()

[VIII. Testing]()
- [1. Unit Testing]()
  - [1.1. JUnit]()
  - [1.2. TestNG]()
- [2. Integration Testing]()
  - [2.1. REST Assured]()
  - [2.2. JMeter]()
- [3. Behavior Testing]()
  - [3.1. Cucumber - JVM]()
  - [3.2. Cukes]()
  - [3.3. JBehave]()

===========================

<a name="i-fundamentals"></a>
## I. Fundamentals

<a name="1-basic-syntax"></a>
### 1. Basic syntax
- **Java is case sensitivity**: Phân biệt rõ ràng chữ viết hoa và thường (Ví dụ: `Hello` và `hello`)
- **Class Names**: PascalCase (Ví dụ: `class MyFirstJavaClass`)
- **Method Names**: camelCase (Ví dụ: `public void myMethodName()`)
- **File Name**: PascalCase Exactly match the **Class Name** (Ví dụ: `MyFirstJavaClass.java`)
- **Java Identifiers**: 
  - Identifiers: are the names [variables](), [methods](), [classes](), [packages](), [interfaces]().
  - Named start with:
    - (_A_ to _Z_ or _a_ to _z_)
    - $ (ví dụ: `$result`)
    - _ (Ví dụ: `_value`)
- **Java Keywords**
![java-keywords.png](assets/imgs/java-keywords.png)
- **Comments**
  - Single-line comments
  ```java
  // This is single comment
  ```
  - Multi-line comments: <br>
  ```java
  /*
    My first comment 
    This is an example
  */
  ```

<a name="2-data-types-variables"></a>
### 2. Data types, Variables
- **Data Types** được chia làm 2 loại:
  - Primitive Data Types (Kiểu dữ liệu nguyên thủy)
  - Non-Primitive Data Types (Kiểu dữ liệu không nguyên thủy)
![data-types.png](assets/imgs/data-types.png)
- **Java variables** được chia làm 3 loại:
  - **Local** variables: là biến được tạo và sử dụng bên trong method
  - **Instance** variables: là biến được tạo từ bên ngoài method, là một đối tượng cụ thể
  - **Static** variables: Khởi tạo chỉ duy nhất 1 lần lúc bắt đầu thực thi và được khai báo đầu tiên
```java
class Guru99 {
  static int a = 1; //static variable  
  int data = 99; //instance variable  
  void method() {
    int b = 90; //local variable  
  }
}
 ```

**_❖ Type conversion & Type Casting_**
- **Type conversion**: Biến có dung lượng nhỏ hơn được gán vào biến khác có dung lượng lớn hơn
```java
double d;
int i = 10;
d = i; __________________________// Chuyển kiểu dữ liệu - Type conversion 
```
- **Type Casting**: Gán biến có dung lượng lớn vào biến khác có dung lượng nhỏ hơn

```java
double d = 10;
int i;
i = (int) d; ____________________// Ép kiểu - Type Casting
```

<a name="3-conditionals"></a>
### 3. Conditionals
- if … else if ... else 
```java
public static void Weather(string myDay)
{
  if (myDay == " Sunny") // 1st condition
  {
    Console.WriteLine("Read in the Library");
  } else if (myday == "Raining") // 2nd condition
  {
    Console.WriteLine("Read at Home");
  } else // 3rd condition
  {
    Console.WriteLine("Read in the Garden");
  }
} 
```
- switch … case
```java
static void Main(string[] args)
{
  int myDay = 4; // setting the value to test
  switch (myDay)
  {
    case 1:
      Console.WriteLine("Read in the Library");
      break;
    case 2:
      Console.WriteLine("Read at Home");
      break;
    case 3:
      Console.WriteLine("Read in the Garden");
      break;
    default:
      Console.WriteLine("Get some Sleep");
      break;
  }
} 
```
- Loops
```java
 static void Main(string[] args)
{
    int n;
    while (n < 10) {
        // execute action
        n++;
    }
    
    // ===========================
  
    do {
        n++;
        // execute action
    } while (n < 10);

    // ===========================
  
    for (int i = 0; i < 10; i++) {
        // execute action
    }
} 
```

<a name="4-functions--methods"></a>
### 4. Functions ( Methods )
- **‘DRY’ principle**: Do not repeat yourself
![method-declaration.png](assets/imgs/method-declaration.png)
- Access Specifier (Phạm vi truy cập)

| Modifier  | Class (.java) | Package (📂java) | Child class | Global |
|-----------|---------------|------------------|-------------|--------|
| private   | ✅            | ❌               | ❌          | ❌     |
| default   | ✅            | ✅               | ❌          | ❌     |
| protected | ✅            | ✅               | ✅          | ❌     |
| public    | ✅            | ✅               | ✅          | ✅     |

- Có 2 loại methods chính:
  - Predefined Method (được định nghĩa trước)
  - User-defined Method (được người dùng định nghĩa)
```java
public class Demo {
    
    // Predefined Method
    public static void main(String[] args) {
        // using the max() method of Math class 
        System.out.print("The maximum number is: " + Math.max(9,7)); // Output: 9
    }

    // user defined method
    public static void findEvenOdd(int num) {
      //method body
      if (num % 2 == 0) {
        System.out.println(num + " is even");
      } else {
        System.out.println(num + " is odd");
      }
    }
}
```
- Trong đó, mỗi method sẽ có 4 dạng:
  - **Static Method**: Là phương thức được khai báo với từ khóa static và có thể được gọi trực tiếp từ lớp mà không cần tạo instance (đối tượng) của lớp đó.
```java
// Example Static Method
public class Display { 
    public static void main(String[] args) {
        show(); // Can calling method not creating an object 
    }
        
    static void show() { // Static Method
        System.out.println("It is an example of static method."); 
    }
}
```
  - **Instance Method**
    - **Accessor Method** (_getter methods_ => alway return a value of needed value)
    - **Mutator Method** (_setter methods_ => not return any things, it simply set value to a variable inside method)
  - **Abstract Method**
```java
// Example Abstract Method
abstract class OriginClass {
    abstract void display();
}

public class MyClass extends OriginClass {
    void display() {
        System.out.println("This is an abstract method");
    }
}
```
  - **Factory Method**: Là một phương thức được sử dụng để tạo ra các đối tượng, thường nằm trong một lớp và ẩn đi sự phức tạp của việc tạo ra đối tượng cụ thể. Ý tưởng là cung cấp một cách có kiểm soát để tạo ra đối tượng của một lớp nào đó, thay vì dùng trực tiếp new.
```java
// Example Factory Method
public class ShapeFactory {
  public static Shape createShape(String type) {
    if (type.equals("circle")) {
      return new Circle();
    } else if (type.equals("square")) {
      return new Square();
    }
    return null;
  }
}

Shape shape = ShapeFactory.createShape("circle"); // Gọi qua factory method.
```

<a name="5-working-with-date-and-time"></a>
### 5. Working with date, time
- Date/Time API
- The java.time package, such as 
  - LocalDate,  
  - LocalTime, 
  - LocalDateTime, 
  - ZonedDateTime, 
  - Period, 
  - Duration 
  - ...and their supported APIs.

<a name="6-data-structure"></a>
### 6. Data structure (DS)
- Includes all topics of Data Structure such as Array, Pointer, Structure, Linked List, Stack, Queue, Graph, Searching, Sorting, Programs, etc.
- Có 2 loại cấu trúc dữ liệu: (**Types**)
  - **Primitive data structure** (Nguyên thủy)
  - **Non-primitive data structure** (Không nguyên thủy)
    - **Linear data structure** (Tuyến tính): Là việc sắp xếp dữ liệu theo cách tuần tự (Arrays, Linked List, Stacks, and Queues), mỗi phần tử chỉ liên kết với một phần tử kế tiếp.
    - **Non-linear data structure** (Phi tuyến tính): Các phần tử không theo trình tự liên tục, Tree: Một phần tử (node) có thể liên kết với nhiều node khác (có thể có các con) theo cấu trúc nhánh cây.
- Data structures được phân loại thành 2 dạng: (**Classification**)
  - Static data structure
  - Dynamic data structure
- Major Operations
  - Searching
  - Sorting
  - Insertion
  - Updation
  - Deletion

<a name="7-oop"></a>
### 7. OOP 
- Các đối tượng được định nghĩa dựa trên các lớp (classes), và chúng có thể chứa dữ liệu (thuộc tính, properties) và các hành vi (phương thức, methods).
- 4 Nguyên lý chính:
  1. Tính Đóng gói - [Encapsulation]()
  2. Tính Kế thừa - [Inheritance]()
  3. Tính Đa hình - [Polymophism]()
  4. Tính Trường tượng - [Abstraction]()
---
[i. Tính Đóng gói]()
- Dữ liệu và phương thức được gói gọn bên trong một lớp, có quyền mới có thể truy cập dữ liệu của đối tượng
```java
class Person {
  private name: string;
  private age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  public getName(): string {
    return this.name;
  }

  public getAge(): number {
    return this.age;
  }

  public setAge(age: number): void {
    if (age > 0) {
      this.age = age;
    } else {
      console.log('Invalid age');
    }
  }
}

const person = new Person('John', 30);
console.log(person.getName()); // "John"
person.setAge(31);             // Cập nhật tuổi hợp lệ
person.setAge(-5);             // "Invalid age"
```
Ở đây, thuộc tính name và age được đóng gói bằng cách sử dụng từ khóa private. Chỉ có các phương thức công khai getName, getAge, và setAge mới có thể truy cập và thay đổi các giá trị này.

[ii. Tính Kế thừa]()
- Khả năng tái sử dụng và mở rộng, kế thừa thuộc tính và phương thức từ lớp khác
```java
class Animal {
  protected name: string;

  constructor(name: string) {
    this.name = name;
  }

  public makeSound(): void {
    console.log(`${this.name} is making a sound`);
  }
}

class Dog extends Animal {
  constructor(name: string) {
    super(name); // Gọi constructor của lớp cha
  }

  public makeSound(): void {
    console.log(`${this.name} is barking`);
  }
}

const myDog = new Dog('Buddy');
myDog.makeSound(); // "Buddy is barking" 
```
Ở đây, lớp Dog kế thừa từ lớp Animal, nhưng phương thức makeSound của Dog đã được ghi đè (override) để thể hiện hành vi riêng của Dog. Việc overide cũng được coi là một phần của tính đa hình

[iii. Tính Đa hình]()
- Cùng một phương thức nhưng các đối tượng thuộc các lớp khác nhau sẽ sử dụng các hành động khác nhau
```java
class Animal {
  public speak(): void {
    console.log('Animal speaks');
  }
}

class Dog extends Animal {
  public speak(): void {
    console.log('Woof! Woof!');
  }
}

class Cat extends Animal {
  public speak(): void {
    console.log('Meow! Meow!');
  }
}

function letAnimalSpeak(animal: Animal): void {
  animal.speak(); // Gọi phương thức speak tùy thuộc vào kiểu đối tượng
}

const myDog = new Dog();
const myCat = new Cat();

letAnimalSpeak(myDog); // Woof! Woof!
letAnimalSpeak(myCat); // Meow! Meow! 
```

[iv. Tính Trừu tượng]()
- Ẩn đi các chi tiết thực hiện, chỉ cần định nghĩa phương thức hoặc giao cho các lớp con thực hiện
```java
abstract class Shape {
  abstract getArea(): number; // Phương thức trừu tượng, cần được triển khai bởi các lớp con

  public describe(): void {
    console.log('This is a shape.');
  }
}

class Rectangle extends Shape {
  private width: number;
  private height: number;

  constructor(width: number, height: number) {
    super();
    this.width = width;
    this.height = height;
  }

  public getArea(): number {
    return this.width * this.height; // Triển khai phương thức
  }
}

class Circle extends Shape {
  private radius: number;

  constructor(radius: number) {
    super();
    this.radius = radius;
  }

  public getArea(): number {
    return Math.PI * Math.pow(this.radius, 2); // Triển khai phương thức
  }
}

const myRectangle = new Rectangle(5, 10);
console.log(myRectangle.getArea()); // 50

        const myCircle = new Circle(7);
console.log(myCircle.getArea());    // 153.938... 
```
---
- extends: kế thừa một class khác
- implements: kế thừa các interface
- abstract class: Có 2 loại method là abstract method và method thường:
  * abstract method là method trống không có thực thi.
  * (normal) method là method thường và có thực thi.
- interface:
  * Không phải là class
  * Chỉ chứa những method/properties trống không có thực thi, như một khuôn mẫu để các class implements và follow theo
```java
class A {
}

class B {
}

interface D {
}

interface E {
}

class C extends A {
}

------------------------------------------------------------------------------------------------------------

// --> ✅ 1 class can implement from one or more interface
class G implements D {
}

class G implements D, E {
}

// --> ❌ class can not implement from class
class G implements A { 
}

// --> ❌ class can not extend from interface
class C extends D {
}

// ---> ❌ 1 subclass only 1 class
class C extends A, B {
}

interface F extends D {
}

// ---> ❌ interface can not implement from another
interface F implements D {
}
```

<a name="8-package"></a>
### 8. Package
// TODO: Updating comming soon.
