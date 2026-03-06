# Loops
Loops as your way of telling a computer, "Hey, don't stop doing this until I say so." 
Here is the breakdown of how to keep your code running in circles (the productive kind).

---

### 1. The `for` Loop: The Precise Planner

Use this when you know exactly how many times you want to run a block of code. It keeps the counter, the condition, and the increment all in one neat line.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

```

* **Initialization:** `int i = 0` (Where we start)
* **Condition:** `i < 5` (Keep going as long as this is true)
* **Update:** `i++` (What to do after each loop)

---

### 2. The `while` Loop: The Patient Observer

Use this when you don’t know how many repetitions you need, but you know what condition should stop it (like waiting for a user to press "Quit").

```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++; // Don't forget this, or you'll loop forever!
}

```

> **Heads up:** If the condition is false at the very beginning, a `while` loop will never run even once.

---

### 3. The `do-while` Loop: The "Shoot First, Ask Questions Later"

This is the rebel sibling of the `while` loop. It executes the code block **at least once** before checking if it should continue.

```java
int i = 10;
do {
    System.out.println("This will print once even though 10 is not < 5");
    i++;
} while (i < 5);

```

---

### 4. The `for-each` Loop: The Collection Specialist

Introduced to make iterating through arrays or lists much cleaner. You don't have to manage an index ($i$); you just grab every item in the "bucket."

```java
String[] fruits = {"Apple", "Banana", "Cherry"};
for (String fruit : fruits) {
    System.out.println(fruit);
}

```

---

### Control Statements: Breaking the Cycle

Sometimes you need to exit a loop early or skip a specific turn.

| Keyword | Action |
| --- | --- |
| `break` | Jumps out of the loop entirely. |
| `continue` | Skips the rest of the current turn and jumps to the next one. |

---

### Which one should you use?

* **Known number of iterations?** Use `for`.
* **Looping through an array/list?** Use `for-each`.
* **Waiting for an event or condition?** Use `while`.
* **Need to run it at least once no matter what?** Use `do-while`.

If a `for` loop is a repetitive treadmill, a `switch` statement is a **multi-way branch**. It’s the cleaner, more sophisticated cousin of a long chain of `if-else if` statements.

# Switch Statement
In Java, you use a `switch` to test a single variable against a list of possible values (called **cases**).

---

### 1. Basic Syntax

The `switch` works with byte, short, char, int, Enums, and Strings.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Weekend or invalid day");
}

```

### 2. Key Components

* **The Expression:** The variable you are checking (e.g., `day`).
* **`case`:** The specific value you are looking for.
* **`break`:** **Crucial.** This tells Java to stop executing the switch once a match is found. If you forget it, the code will "fall through" and execute every case below it until it hits a break.
* **`default`:** The "catch-all." If none of the cases match, this code runs. It's like the `else` at the end of an `if` chain.

---

### 3. The "Modern" Switch (Java 12+)

Java recently got a major upgrade called **Switch Expressions**. It’s much more concise, uses the "arrow" (`->`) syntax, and handles the "break" automatically so you don't forget it.

```java
String result = switch (day) {
    case 1          -> "Monday";
    case 2          -> "Tuesday";
    case 3          -> "Wednesday";
    case 4, 5, 6, 7 -> "Later in the week";
    default         -> "Unknown day";
};

```

*Notice that you can now assign the result of a switch directly to a variable!*

---

### When to use `switch` vs. `if-else`

| Feature | `switch` | `if-else` |
| --- | --- | --- |
| **Readability** | High for many fixed values. | Gets messy with many conditions. |
| **Logic** | Checks for **equality** only. | Can check **ranges** (e.g., `x > 10 && x < 20`). |
| **Speed** | Often slightly faster (uses a lookup table). | Evaluates conditions sequentially. |

---

### A Common "Gotcha": Fall-Through

If you purposely omit a `break`, you can group cases together. This is useful if multiple inputs should trigger the same result:

```java
int month = 2;
switch (month) {
    case 12:
    case 1:
    case 2:
        System.out.println("It's Winter!");
        break; // This break stops all three cases above
}

```
