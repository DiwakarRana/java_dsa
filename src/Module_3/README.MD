# Questions
## Fibonacci Series:
* **Logic :**
```java
int nummber;
int a = 0, b=1;
for (int i = 0; i < number; i++){
    System.out.println(a);
    int c = a +b;
    a = b;
    b = c;
        }
```
## Inverse The number:
* **Logic :**
```java
int number;
int inverse = 0;
int originalposition = 1;
while(number!=0){
    int originaldigit = number%10;
    int inversedigit= originalposition;
    int inverseposition = originaldigit;
    inverse = inverse + inversedigit*Math.pow(10, inversposition-1);
    nummber = number/10;
    originalposition++;
        }
System.out.println(inverse);
```
## Prime Numbers:
* **Logic :**
```java
int prime;
int count =0;
for (int i = 2; i <=prime; i++){
    if(prime%i==0){
        count++;
        }
    if(count==0){
        System.out.println("Prime");
        }else System.out.println("Not prime");
        }
```
## Reverse Number:
* **Logic :**
```java
int number;
        while (number > 0) {
            int digit = number%10;
            number = number/10;
            System.out.print(digit);

        }
```
## Rotate Number:
* **Logic :**
```java
int rotate;

        int temp = number;
        int nod = 0;

        while (temp >0){
            temp = temp/10;
            nod++;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i<=nod;i++){
            if(i<=rotate){
                div = div*10;
            }else {
                mult = mult *10;
            }
        }
        rotate = rotate%nod;
        if (rotate<0){
            rotate = rotate + nod;
        }
        int quotient = number/div;
        int remainder = number % div;
        int result = remainder * mult + quotient;
        System.out.println("Reversed number is: "+ result);
```