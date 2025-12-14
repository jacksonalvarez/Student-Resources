# Quizlet Study Sets - Java Programming Lessons 1-6 + Number Systems

## Instructions for Creating Quizlets:
1. Go to quizlet.com
2. Click "Create" → "Study Set"
3. Copy the terms and definitions from each section below
4. Format: Term | Definition (separated by tabs)

**NEW: Added Set 13 for Number Systems (Binary, Decimal, Hexadecimal)**

---

## Set 1: Java Primitives & Data Types (30 cards)

### Terms and Definitions

**Term:** How many bytes does an `int` use?
**Definition:** 4 bytes (32 bits)

**Term:** How many bytes does a `double` use?
**Definition:** 8 bytes (64 bits)

**Term:** How many bytes does a `boolean` use for APCSA?
**Definition:** 1 byte (though only stores true/false)

**Term:** What is the range of a `byte`?
**Definition:** -128 to 127

**Term:** What is the range of an `int`?
**Definition:** -2,147,483,648 to 2,147,483,647

**Term:** What is the default value of an uninitialized `int`?
**Definition:** 0

**Term:** What is the default value of an uninitialized `boolean`?
**Definition:** false

**Term:** What is the default value of an uninitialized `double`?
**Definition:** 0.0

**Term:** Is `String` a primitive type?
**Definition:** No, String is a class (reference type)

**Term:** What are the 8 primitive types in Java?
**Definition:** byte, short, int, long, float, double, char, boolean

**Term:** What type should you use for decimal numbers?
**Definition:** double (most common for APCSA)

**Term:** What type should you use for whole numbers?
**Definition:** int (most common for APCSA)

**Term:** What type should you use for a single character?
**Definition:** char (e.g., char c = 'A';)

**Term:** What type should you use for true/false values?
**Definition:** boolean

**Term:** What is the result of `10 / 3` in Java?
**Definition:** 3 (integer division truncates)

**Term:** What is the result of `10.0 / 3` in Java?
**Definition:** 3.3333333333333335 (floating-point division)

**Term:** What is the result of `10 % 3`?
**Definition:** 1 (modulus returns remainder)

**Term:** What is the result of `15 % 4`?
**Definition:** 3 (15 ÷ 4 = 3 remainder 3)

**Term:** How do you check if a number is even?
**Definition:** num % 2 == 0

**Term:** How do you check if a number is odd?
**Definition:** num % 2 == 1 or num % 2 != 0

**Term:** What is operator precedence order (PEMDAS)?
**Definition:** Parentheses, Multiplication/Division/Modulus, Addition/Subtraction

**Term:** What is the result of `5 + 3 * 2`?
**Definition:** 11 (multiplication before addition)

**Term:** What is the result of `(5 + 3) * 2`?
**Definition:** 16 (parentheses first)

**Term:** What does casting do? Example: `(double) 5`
**Definition:** Converts a value to a different type; (double) 5 becomes 5.0

**Term:** What is the result of `(double) 7 / 2`?
**Definition:** 3.5 (casting makes it floating-point division)

**Term:** What arithmetic operators are available in Java?
**Definition:** + (addition), - (subtraction), * (multiplication), / (division), % (modulus)

**Term:** What is the `%` operator called?
**Definition:** Modulus operator (returns remainder)

**Term:** What happens with `int x = 3.7;`?
**Definition:** Compilation error (cannot assign double to int without casting)

**Term:** What is the correct way to declare and initialize an int?
**Definition:** int x = 5;

**Term:** Can you change the value of a variable after initialization?
**Definition:** Yes, variables can be reassigned (unless declared `final`)

---

## Set 2: Variables & Operators (25 cards)

**Term:** What does `x += 5` mean?
**Definition:** x = x + 5 (compound assignment operator)

**Term:** What does `x -= 3` mean?
**Definition:** x = x - 3

**Term:** What does `x *= 2` mean?
**Definition:** x = x * 2

**Term:** What does `x /= 4` mean?
**Definition:** x = x / 4

**Term:** What does `x %= 3` mean?
**Definition:** x = x % 3

**Term:** What does `x++` do?
**Definition:** Increments x by 1 (x = x + 1)

**Term:** What does `x--` do?
**Definition:** Decrements x by 1 (x = x - 1)

**Term:** What is the difference between `x++` and `++x`?
**Definition:** x++ (post-increment) uses value then increments; ++x (pre-increment) increments then uses value

**Term:** What is the assignment operator?
**Definition:** = (single equals sign)

**Term:** What is variable declaration?
**Definition:** Creating a variable with a type: int x;

**Term:** What is variable initialization?
**Definition:** Giving a variable its first value: x = 10;

**Term:** Can you declare multiple variables in one line?
**Definition:** Yes: int a, b, c; or int x = 5, y = 10;

**Term:** What are valid variable names?
**Definition:** Must start with letter, $, or _; can contain letters, digits, $, _; case-sensitive

**Term:** Are variable names case-sensitive?
**Definition:** Yes (myVar and myvar are different)

**Term:** What naming convention is used for variables?
**Definition:** camelCase (firstName, studentAge, totalScore)

**Term:** What naming convention is used for constants?
**Definition:** UPPER_SNAKE_CASE (MAX_VALUE, PI, MIN_AGE)

**Term:** How do you declare a constant?
**Definition:** final int MAX_SIZE = 100;

**Term:** Can you change the value of a `final` variable?
**Definition:** No, final variables are constants (cannot be reassigned)

**Term:** What is the default value of a local variable?
**Definition:** No default value (must be initialized before use)

**Term:** What happens if you use an uninitialized local variable?
**Definition:** Compilation error

**Term:** What is variable scope?
**Definition:** The region of code where a variable can be accessed

**Term:** What is a local variable?
**Definition:** Variable declared inside a method (only exists in that method)

**Term:** What is an instance variable?
**Definition:** Variable declared in a class (belongs to each object)

**Term:** What is a static variable?
**Definition:** Variable shared by all instances of a class (belongs to class, not objects)

**Term:** If `int x = 5; x += 3; x *= 2;`, what is x?
**Definition:** 16 (5 + 3 = 8, then 8 * 2 = 16)

---

## Set 3: Boolean Logic & Relational Operators (30 cards)

**Term:** What does `==` do?
**Definition:** Checks if two values are equal (comparison operator)

**Term:** What does `!=` do?
**Definition:** Checks if two values are NOT equal

**Term:** What does `>` do?
**Definition:** Checks if left value is greater than right value

**Term:** What does `<` do?
**Definition:** Checks if left value is less than right value

**Term:** What does `>=` do?
**Definition:** Checks if left value is greater than or equal to right value

**Term:** What does `<=` do?
**Definition:** Checks if left value is less than or equal to right value

**Term:** What is the result of `5 == 5`?
**Definition:** true

**Term:** What is the result of `5 != 3`?
**Definition:** true

**Term:** What is the result of `7 > 10`?
**Definition:** false

**Term:** What is the result of `5 >= 5`?
**Definition:** true

**Term:** What does `&&` do?
**Definition:** Logical AND (both conditions must be true)

**Term:** What does `||` do?
**Definition:** Logical OR (at least one condition must be true)

**Term:** What does `!` do?
**Definition:** Logical NOT (negates/flips boolean value)

**Term:** What is the result of `true && true`?
**Definition:** true

**Term:** What is the result of `true && false`?
**Definition:** false

**Term:** What is the result of `false && false`?
**Definition:** false

**Term:** What is the result of `true || false`?
**Definition:** true

**Term:** What is the result of `false || false`?
**Definition:** false

**Term:** What is the result of `!true`?
**Definition:** false

**Term:** What is the result of `!false`?
**Definition:** true

**Term:** What is the result of `(5 > 3) && (10 < 20)`?
**Definition:** true (both conditions are true)

**Term:** What is the result of `(5 > 3) || (10 > 20)`?
**Definition:** true (first condition is true)

**Term:** What is the result of `!(5 == 5)`?
**Definition:** false (5 == 5 is true, ! flips it to false)

**Term:** What is the precedence of logical operators?
**Definition:** ! (highest), then &&, then || (lowest)

**Term:** What is short-circuit evaluation in `&&`?
**Definition:** If first condition is false, second condition is not evaluated

**Term:** What is short-circuit evaluation in `||`?
**Definition:** If first condition is true, second condition is not evaluated

**Term:** Common mistake: What's wrong with `if (x = 5)`?
**Definition:** Uses assignment (=) instead of comparison (==); should be `if (x == 5)`

**Term:** For Strings, should you use `==` or `.equals()`?
**Definition:** Use .equals() for comparing String content; == compares references

**Term:** What is the result of `!(true && false) || false`?
**Definition:** true (!(false) || false → true || false → true)

**Term:** How do you check if a number is between 10 and 20 (inclusive)?
**Definition:** (num >= 10 && num <= 20)

---

## Set 4: Control Flow - If Statements (20 cards)

**Term:** What is the syntax of a basic if statement?
**Definition:** if (condition) { // code }

**Term:** What is the syntax of an if-else statement?
**Definition:** if (condition) { // code } else { // code }

**Term:** What is the syntax of an if-else-if statement?
**Definition:** if (cond1) { } else if (cond2) { } else { }

**Term:** When does the code inside an if statement execute?
**Definition:** Only when the condition is true

**Term:** What happens if all conditions in if-else-if are false?
**Definition:** The else block executes (if present); otherwise nothing executes

**Term:** Can you have an if without an else?
**Definition:** Yes, else is optional

**Term:** Can you have else without if?
**Definition:** No, else must follow an if

**Term:** Can you have multiple else if blocks?
**Definition:** Yes, as many as needed

**Term:** In if-else-if chains, what happens when first condition is true?
**Definition:** That block executes and the rest are skipped

**Term:** What is "inclusive" mean in range checking?
**Definition:** Including the endpoints (e.g., 0-100 inclusive means 0 and 100 are valid)

**Term:** What is "exclusive" mean in range checking?
**Definition:** Excluding the endpoints (e.g., 0-100 exclusive means 1-99 are valid)

**Term:** How do you check if age is between 13 and 19 (inclusive)?
**Definition:** if (age >= 13 && age <= 19)

**Term:** What is a nested if statement?
**Definition:** An if statement inside another if statement

**Term:** What is the dangling else problem?
**Definition:** Ambiguity about which if an else belongs to; use braces to clarify

**Term:** Should you always use braces { } with if statements?
**Definition:** Yes, for clarity and to prevent bugs (even for single-line statements)

**Term:** What prints: if (5 > 3) System.out.println("Yes");
**Definition:** "Yes" (condition is true)

**Term:** What prints: if (5 < 3) System.out.println("Yes");
**Definition:** Nothing (condition is false, no else clause)

**Term:** How do you check if a number is NOT between 10 and 20?
**Definition:** if (num < 10 || num > 20)

**Term:** What's the difference between nested if and else if?
**Definition:** Nested if requires all outer conditions true; else if checks alternatives

**Term:** Best practice: How should you format if statements?
**Definition:** Use braces, proper indentation, and clear conditions

---

## Set 5: Control Flow - Switch Statements (15 cards)

**Term:** What is the syntax of a switch statement?
**Definition:** switch (variable) { case value: code; break; default: code; }

**Term:** What happens if you forget `break` in a switch case?
**Definition:** Fall-through occurs (next case executes too)

**Term:** What data types work with switch statements?
**Definition:** int, byte, short, char, String, enum (NOT double, float, long, boolean)

**Term:** Can you use a `double` in a switch statement?
**Definition:** No

**Term:** Can you use a `boolean` in a switch statement?
**Definition:** No

**Term:** Can you use a `String` in a switch statement?
**Definition:** Yes (Java 7+)

**Term:** What is the `default` case in a switch?
**Definition:** Executes if no other case matches (like else in if-else)

**Term:** Is `default` required in a switch statement?
**Definition:** No, it's optional but recommended

**Term:** Can you have multiple statements in a case without braces?
**Definition:** Yes, all statements before break execute

**Term:** What is fall-through in switch statements?
**Definition:** When execution continues to next case because break is missing

**Term:** When would you intentionally omit break?
**Definition:** When you want multiple cases to execute the same code

**Term:** Can you use variables in case labels?
**Definition:** No, case labels must be compile-time constants

**Term:** How do you handle multiple values with same behavior?
**Definition:** Stack cases: case 1: case 2: case 3: // code break;

**Term:** Which is more readable for many conditions: if-else-if or switch?
**Definition:** switch (for checking one variable against many values)

**Term:** When should you use if-else instead of switch?
**Definition:** When checking ranges, complex conditions, or types switch doesn't support

---

## Set 6: Loops - For Loop (25 cards)

**Term:** What is the syntax of a for loop?
**Definition:** for (init; condition; update) { // code }

**Term:** What are the three components of a for loop?
**Definition:** initialization, condition, update

**Term:** When is the initialization executed?
**Definition:** Once, at the very beginning of the loop

**Term:** When is the condition checked?
**Definition:** Before each iteration of the loop

**Term:** When is the update executed?
**Definition:** After each iteration of the loop body

**Term:** What does this print: for (int i = 0; i < 5; i++) System.out.println(i);
**Definition:** 0 1 2 3 4 (each on new line)

**Term:** How many times does for (int i = 0; i < 10; i++) execute?
**Definition:** 10 times (i goes from 0 to 9)

**Term:** How many times does for (int i = 1; i <= 10; i++) execute?
**Definition:** 10 times (i goes from 1 to 10)

**Term:** How many times does for (int i = 0; i < 10; i += 2) execute?
**Definition:** 5 times (i is 0, 2, 4, 6, 8)

**Term:** What is an infinite for loop?
**Definition:** for (;;) or for with condition that's always true

**Term:** Can you declare multiple variables in for initialization?
**Definition:** Yes: for (int i = 0, j = 10; i < j; i++, j--)

**Term:** Can you use a for loop without initialization?
**Definition:** Yes: for (; condition; update) { }

**Term:** Can you use a for loop without update?
**Definition:** Yes: for (init; condition;) { }

**Term:** What is the scope of a variable declared in for loop initialization?
**Definition:** Only within the for loop

**Term:** How do you count down from 10 to 1?
**Definition:** for (int i = 10; i > 0; i--)

**Term:** How do you loop through array indices?
**Definition:** for (int i = 0; i < arr.length; i++)

**Term:** What is an off-by-one error?
**Definition:** Loop executing one too many or too few times (usually wrong condition)

**Term:** Common mistake: What's wrong with i <= arr.length?
**Definition:** Goes one past last valid index; should be i < arr.length

**Term:** How do you access array elements in a for loop?
**Definition:** arr[i] where i is the loop variable

**Term:** Can you modify loop variable inside the loop body?
**Definition:** Yes, but it can cause confusion (generally not recommended)

**Term:** What happens if condition is false initially?
**Definition:** Loop body never executes (0 iterations)

**Term:** How do you loop through every other element?
**Definition:** for (int i = 0; i < arr.length; i += 2)

**Term:** How do you loop backward through an array?
**Definition:** for (int i = arr.length - 1; i >= 0; i--)

**Term:** What is a nested for loop?
**Definition:** A for loop inside another for loop

**Term:** How many times does nested loop execute: for (i=0;i<3;i++) for(j=0;j<4;j++)?
**Definition:** 12 times (3 * 4)

---

## Set 7: Loops - While & Do-While (20 cards)

**Term:** What is the syntax of a while loop?
**Definition:** while (condition) { // code }

**Term:** When is the condition checked in a while loop?
**Definition:** Before each iteration (including first)

**Term:** What is the minimum number of iterations for a while loop?
**Definition:** 0 (may not execute at all if condition is initially false)

**Term:** What is the syntax of a do-while loop?
**Definition:** do { // code } while (condition);

**Term:** When is the condition checked in a do-while loop?
**Definition:** After each iteration

**Term:** What is the minimum number of iterations for a do-while loop?
**Definition:** 1 (always executes at least once)

**Term:** Don't forget: What punctuation comes after do-while condition?
**Definition:** Semicolon: while (condition);

**Term:** When should you use while instead of for?
**Definition:** When you don't know how many iterations needed in advance

**Term:** When should you use do-while instead of while?
**Definition:** When loop body must execute at least once

**Term:** What is an infinite while loop?
**Definition:** while (true) { } or while with condition that never becomes false

**Term:** How do you prevent infinite loops?
**Definition:** Ensure loop variable changes and condition eventually becomes false

**Term:** Convert to while: for (int i = 0; i < 5; i++) System.out.println(i);
**Definition:** int i = 0; while (i < 5) { System.out.println(i); i++; }

**Term:** What does this print: int i=5; while(i>0) { System.out.print(i); i--; }
**Definition:** 54321

**Term:** What does this print: int i=0; do { System.out.print(i); i++; } while(i<0);
**Definition:** 0 (executes once despite false condition)

**Term:** How do you read input until user enters specific value?
**Definition:** while (input != targetValue) { // read input }

**Term:** What is a sentinel value?
**Definition:** Special value that signals end of input (e.g., -1, "quit")

**Term:** Can you use break in while loops?
**Definition:** Yes, break exits the loop immediately

**Term:** Can you use continue in while loops?
**Definition:** Yes, continue skips to next iteration

**Term:** What does break do in a loop?
**Definition:** Exits the loop immediately (jumps to code after loop)

**Term:** What does continue do in a loop?
**Definition:** Skips rest of current iteration and goes to next iteration

---

## Set 8: Enhanced For Loop (For-Each) (15 cards)

**Term:** What is the syntax of an enhanced for loop?
**Definition:** for (Type variable : collection) { // code }

**Term:** What is another name for enhanced for loop?
**Definition:** For-each loop

**Term:** When should you use enhanced for loop?
**Definition:** When iterating through all elements and don't need the index

**Term:** Can you modify array elements with enhanced for loop?
**Definition:** No (you only get a copy of each element)

**Term:** Can you access array index with enhanced for loop?
**Definition:** No (no index variable available)

**Term:** Example: for (int num : arr) - what is num?
**Definition:** A copy of each element in arr (one at a time)

**Term:** What does this do: for (int x : arr) sum += x;
**Definition:** Adds up all elements in arr

**Term:** Can you loop backward with enhanced for loop?
**Definition:** No (always goes forward through collection)

**Term:** Can you skip elements with enhanced for loop?
**Definition:** No (always processes all elements)

**Term:** Can you use enhanced for with primitive arrays?
**Definition:** Yes: for (int i : intArray)

**Term:** Can you use enhanced for with String arrays?
**Definition:** Yes: for (String s : stringArray)

**Term:** Can you use enhanced for with 2D arrays?
**Definition:** Yes: for (int[] row : matrix) for (int val : row)

**Term:** What happens if you try to modify loop variable?
**Definition:** Only the copy changes; original array is not affected

**Term:** When should you use regular for instead of enhanced for?
**Definition:** When you need index, need to modify elements, or skip elements

**Term:** Is enhanced for loop more readable?
**Definition:** Yes, cleaner syntax when you just need to process all elements

---

## Set 9: Arrays Basics (30 cards)

**Term:** What is an array?
**Definition:** Fixed-size collection of elements of the same type

**Term:** Are arrays zero-indexed in Java?
**Definition:** Yes (first element is at index 0)

**Term:** How do you declare an array?
**Definition:** Type[] name; or Type name[];

**Term:** How do you create an array of 5 integers?
**Definition:** int[] arr = new int[5];

**Term:** How do you create and initialize an array?
**Definition:** int[] arr = {1, 2, 3, 4, 5};

**Term:** What is the default value of int array elements?
**Definition:** 0

**Term:** What is the default value of boolean array elements?
**Definition:** false

**Term:** What is the default value of double array elements?
**Definition:** 0.0

**Term:** What is the default value of String array elements?
**Definition:** null

**Term:** How do you access the first element of an array?
**Definition:** arr[0]

**Term:** How do you access the last element of an array?
**Definition:** arr[arr.length - 1]

**Term:** How do you get the length of an array?
**Definition:** arr.length (NO parentheses!)

**Term:** Common mistake: arr.length() or arr.length?
**Definition:** arr.length (no parentheses; it's a property, not a method)

**Term:** What happens if you access arr[arr.length]?
**Definition:** ArrayIndexOutOfBoundsException (last valid index is arr.length - 1)

**Term:** Can you change the size of an array after creation?
**Definition:** No, arrays have fixed size

**Term:** How do you change an array element?
**Definition:** arr[index] = newValue;

**Term:** Can an array hold different data types?
**Definition:** No, all elements must be the same type

**Term:** What error occurs with invalid array index?
**Definition:** ArrayIndexOutOfBoundsException

**Term:** What are valid indices for array of length 5?
**Definition:** 0, 1, 2, 3, 4

**Term:** How do you declare array without initializing?
**Definition:** int[] arr; (arr is null until assigned an array)

**Term:** What is arr.length for int[] arr = {10, 20, 30}?
**Definition:** 3

**Term:** Can you have an array of size 0?
**Definition:** Yes: int[] arr = new int[0]; (valid but empty)

**Term:** How do you copy an array?
**Definition:** arr.clone() or Arrays.copyOf(arr, arr.length)

**Term:** What happens with: int[] a = {1,2}; int[] b = a;
**Definition:** Both reference same array (changing b changes a)

**Term:** How do you compare array contents?
**Definition:** Arrays.equals(arr1, arr2) (NOT arr1 == arr2)

**Term:** What does arr1 == arr2 check?
**Definition:** If both variables reference the exact same array object

**Term:** How do you print array contents?
**Definition:** Arrays.toString(arr) or loop through and print each element

**Term:** What prints: System.out.println(arr) where arr is int array?
**Definition:** Memory address like [I@15db9742 (not the contents!)

**Term:** How do you find sum of array elements?
**Definition:** Loop through array and add each element to sum variable

**Term:** How do you find max element in array?
**Definition:** Loop through, track max, update if current element is larger

---

## Set 10: Object-Oriented Programming Basics (35 cards)

**Term:** What is a class?
**Definition:** Blueprint or template that defines structure and behavior of objects

**Term:** What is an object?
**Definition:** Instance of a class (actual item created from blueprint)

**Term:** What is the difference between class and object?
**Definition:** Class is blueprint; object is instance created from that blueprint

**Term:** How do you create an object?
**Definition:** ClassName objectName = new ClassName();

**Term:** What does the `new` keyword do?
**Definition:** Creates a new instance of a class (allocates memory for object)

**Term:** What is a constructor?
**Definition:** Special method that initializes an object when it's created

**Term:** What are the rules for constructors?
**Definition:** Same name as class, no return type, called automatically with new

**Term:** Can a class have multiple constructors?
**Definition:** Yes (constructor overloading with different parameters)

**Term:** What is a default constructor?
**Definition:** Constructor with no parameters

**Term:** What happens if you don't write any constructor?
**Definition:** Java provides default no-argument constructor automatically

**Term:** What is an instance variable?
**Definition:** Variable declared in class; each object has its own copy

**Term:** What is the naming convention for classes?
**Definition:** PascalCase (e.g., StudentRecord, GradeCalculator)

**Term:** What is the naming convention for methods and variables?
**Definition:** camelCase (e.g., firstName, calculateAverage)

**Term:** What does `this` keyword refer to?
**Definition:** Current object (the object whose method is being called)

**Term:** When do you use `this` keyword?
**Definition:** To distinguish instance variables from parameters with same name

**Term:** What is encapsulation?
**Definition:** Hiding internal data and providing controlled access through methods

**Term:** How do you implement encapsulation?
**Definition:** Make variables private, provide public getter/setter methods

**Term:** Why should instance variables be private?
**Definition:** To protect data from direct modification (encapsulation principle)

**Term:** What is a getter method?
**Definition:** Public method that returns the value of a private variable

**Term:** What is a setter method?
**Definition:** Public method that modifies the value of a private variable

**Term:** What is the naming convention for getters?
**Definition:** get + VariableName (e.g., getName(), getAge())

**Term:** What is the naming convention for setters?
**Definition:** set + VariableName (e.g., setName(), setAge())

**Term:** What is the naming convention for boolean getters?
**Definition:** is/has/can + Description (e.g., isActive(), hasPermission())

**Term:** Should getters validate data?
**Definition:** Not usually (but can); mainly return values as-is

**Term:** Should setters validate data?
**Definition:** Yes, always validate before assigning to prevent invalid state

**Term:** Why return arr.clone() instead of arr in getter?
**Definition:** To return copy and protect original array from external modification

**Term:** What is a method signature?
**Definition:** Method name and parameter list (not including return type)

**Term:** What is method overloading?
**Definition:** Multiple methods with same name but different parameters

**Term:** What is the difference between instance and static methods?
**Definition:** Instance methods need an object; static methods belong to class

**Term:** How do you call an instance method?
**Definition:** objectName.methodName()

**Term:** How do you call a static method?
**Definition:** ClassName.methodName() or just methodName() in same class

**Term:** What is the `toString()` method?
**Definition:** Returns string representation of object; called by System.out.println()

**Term:** How do you override toString()?
**Definition:** @Override public String toString() { return "..."; }

**Term:** What is the difference between public and private?
**Definition:** Public: accessible everywhere; Private: only within same class

**Term:** Can you access private variables from outside the class?
**Definition:** No, only through public methods (getters/setters)

---

## Set 11: The Big Four OOP Methods (20 cards)

**Term:** What are "The Big Four" OOP methods?
**Definition:** Constructor, Getter, Setter, toString

**Term:** Purpose of Constructor?
**Definition:** Initialize object's instance variables when object is created

**Term:** Purpose of Getter?
**Definition:** Provide read access to private instance variables

**Term:** Purpose of Setter?
**Definition:** Provide write access to private instance variables with validation

**Term:** Purpose of toString()?
**Definition:** Return string representation of object for printing/debugging

**Term:** Constructor syntax example?
**Definition:** public Student(String name, int age) { this.name = name; this.age = age; }

**Term:** Getter syntax example?
**Definition:** public String getName() { return name; }

**Term:** Setter syntax example?
**Definition:** public void setAge(int age) { if (age > 0) this.age = age; }

**Term:** toString syntax example?
**Definition:** public String toString() { return "Student[name=" + name + ", age=" + age + "]"; }

**Term:** Do constructors have return types?
**Definition:** No, not even void

**Term:** Do getters modify the object?
**Definition:** No, they only return data

**Term:** Do setters return values?
**Definition:** Usually no (return type is void)

**Term:** When is toString() automatically called?
**Definition:** When object is passed to System.out.println() or string concatenation

**Term:** What annotation goes above toString()?
**Definition:** @Override

**Term:** Why validate in setters but not getters?
**Definition:** Setters modify state (must ensure valid data); getters just return data

**Term:** What should you return for array in getter?
**Definition:** arr.clone() (defensive copy to protect original)

**Term:** Can you have multiple constructors?
**Definition:** Yes (constructor overloading)

**Term:** Example of constructor chaining?
**Definition:** public Student(String name) { this(name, 0); } // calls other constructor

**Term:** Should toString() include all instance variables?
**Definition:** Usually yes, for complete representation (but not always required)

**Term:** What's the difference between getter and direct access?
**Definition:** Getter provides controlled access; direct access breaks encapsulation

---

## Set 12: Common Mistakes & Best Practices (25 cards)

**Term:** Common mistake: = vs ==
**Definition:** = is assignment; == is comparison (if (x == 5) not if (x = 5))

**Term:** Common mistake: arr.length vs string.length()
**Definition:** Arrays use .length (no parentheses); Strings use .length() (with parentheses)

**Term:** Common mistake: Forgetting break in switch
**Definition:** Causes fall-through (multiple cases execute); always use break

**Term:** Common mistake: arr[arr.length]
**Definition:** Index out of bounds; last valid index is arr.length - 1

**Term:** Common mistake: int division
**Definition:** 5/2 = 2 (not 2.5); use 5/2.0 or (double)5/2 for 2.5

**Term:** Common mistake: Using == for Strings
**Definition:** Use .equals() for content comparison; == compares references

**Term:** Common mistake: Public instance variables
**Definition:** Breaks encapsulation; should be private with getters/setters

**Term:** Common mistake: Returning original array
**Definition:** Use .clone() to return defensive copy and protect original

**Term:** Common mistake: Off-by-one in loops
**Definition:** i <= arr.length (wrong) vs i < arr.length (correct)

**Term:** Common mistake: Not initializing variables
**Definition:** Local variables must be initialized before use

**Term:** Best practice: Variable naming
**Definition:** Use descriptive camelCase names (studentAge not x or sa)

**Term:** Best practice: Method naming
**Definition:** Use verbs for actions (calculateAverage, printResults)

**Term:** Best practice: Constant naming
**Definition:** ALL_CAPS_WITH_UNDERSCORES for final variables

**Term:** Best practice: Always use braces
**Definition:** Use { } even for single-statement if/loop (prevents bugs)

**Term:** Best practice: Validate input
**Definition:** Check for null, negative values, empty arrays in setters/constructors

**Term:** Best practice: Single responsibility
**Definition:** Each method should do one thing well

**Term:** Best practice: Avoid magic numbers
**Definition:** Use named constants instead of hardcoded numbers

**Term:** Best practice: Comment complex code
**Definition:** Explain WHY, not WHAT (code should be self-explanatory)

**Term:** Best practice: DRY principle
**Definition:** Don't Repeat Yourself - reuse code with methods

**Term:** Best practice: Keep methods short
**Definition:** If method is too long, break into smaller helper methods

**Term:** Best practice: Consistent indentation
**Definition:** Use 2 or 4 spaces consistently (improves readability)

**Term:** Best practice: Meaningful variable names
**Definition:** totalScore better than ts; studentCount better than sc

**Term:** Best practice: Initialize at declaration
**Definition:** int count = 0; (better than int count; ... count = 0;)

**Term:** Best practice: Use enhanced for when possible
**Definition:** for (int num : arr) cleaner than indexed for when you don't need index

**Term:** Best practice: Test boundary conditions
**Definition:** Test with empty arrays, zero, negative numbers, max values

---

## Instructions for Bulk Import to Quizlet:

1. Copy all terms and definitions from a set
2. On Quizlet, click "Import from Word, Excel, etc."
3. Paste the content
4. Set "Between term and definition" to "Tab" or "Colon"
5. Set "Between cards" to "New line"
6. Click Import

**Format for import:**
```
How many bytes does an int use?	4 bytes (32 bits)
How many bytes does a double use?	8 bytes (64 bits)
```

Or if using the long form above, convert:
**Term:** X  →  becomes  →  X	
**Definition:** Y  →  becomes  →  Y

---

## Set 13: Number Systems - Binary, Decimal, Hexadecimal (40 cards)

### Terms and Definitions

**Term:** What is the base of the decimal number system?
**Definition:** Base 10 (uses digits 0-9)

**Term:** What is the base of the binary number system?
**Definition:** Base 2 (uses digits 0 and 1 only)

**Term:** What is the base of the hexadecimal number system?
**Definition:** Base 16 (uses digits 0-9 and letters A-F)

**Term:** What decimal value does hex digit 'A' represent?
**Definition:** 10

**Term:** What decimal value does hex digit 'B' represent?
**Definition:** 11

**Term:** What decimal value does hex digit 'C' represent?
**Definition:** 12

**Term:** What decimal value does hex digit 'D' represent?
**Definition:** 13

**Term:** What decimal value does hex digit 'E' represent?
**Definition:** 14

**Term:** What decimal value does hex digit 'F' represent?
**Definition:** 15

**Term:** What are the place values in binary (rightmost 8 positions)?
**Definition:** 128, 64, 32, 16, 8, 4, 2, 1

**Term:** Convert 1111₂ to decimal
**Definition:** 15₁₀ (8+4+2+1)

**Term:** Convert 1010₂ to decimal
**Definition:** 10₁₀ (8+2)

**Term:** Convert 1100₂ to decimal
**Definition:** 12₁₀ (8+4)

**Term:** Convert 11111111₂ to decimal
**Definition:** 255₁₀ (all 8 bits set)

**Term:** What is 2⁴?
**Definition:** 16

**Term:** What is 2⁵?
**Definition:** 32

**Term:** What is 2⁶?
**Definition:** 64

**Term:** What is 2⁷?
**Definition:** 128

**Term:** What is 2⁸?
**Definition:** 256

**Term:** What is 2¹⁰?
**Definition:** 1024 (1 kilobyte)

**Term:** How do you convert binary to hexadecimal?
**Definition:** Group binary digits into sets of 4 from RIGHT to LEFT, then convert each group to hex

**Term:** Convert 1111₂ to hex
**Definition:** F₁₆

**Term:** Convert FF₁₆ to decimal
**Definition:** 255₁₀ (15×16 + 15)

**Term:** Convert 10₁₆ to decimal
**Definition:** 16₁₀ (1×16 + 0)

**Term:** What does #FF0000 represent in RGB colors?
**Definition:** Pure red (R=255, G=0, B=0)

**Term:** What does #00FF00 represent in RGB colors?
**Definition:** Pure green (R=0, G=255, B=0)

**Term:** What does #0000FF represent in RGB colors?
**Definition:** Pure blue (R=0, G=0, B=255)

**Term:** How many bits are in one byte?
**Definition:** 8 bits

**Term:** What range of values can 8 bits represent?
**Definition:** 0-255 (256 possible values)

**Term:** Why is hexadecimal useful in programming?
**Definition:** It's a shorthand for binary - each hex digit represents exactly 4 binary bits

**Term:** Convert 16₁₀ to binary
**Definition:** 10000₂ (2⁴)

**Term:** Convert 255₁₀ to binary
**Definition:** 11111111₂ (all 8 bits set)

**Term:** Convert 1101₂ to hex
**Definition:** D₁₆ (13 in decimal)

**Term:** Convert 10101111₂ to hex
**Definition:** AF₁₆ (group: 1010=A, 1111=F)

**Term:** How many bits are needed to represent one RGB color?
**Definition:** 24 bits (8 bits per component × 3 components)

**Term:** What is the binary representation of 32?
**Definition:** 100000₂ (2⁵)

**Term:** What is 1010₂ in hex?
**Definition:** A₁₆

**Term:** What is the first step in converting decimal to binary using the division method?
**Definition:** Divide the decimal number by 2 and record the remainder

**Term:** When grouping binary for hex conversion, which direction do you start?
**Definition:** From the RIGHT to LEFT

**Term:** Why do computers use binary?
**Definition:** Electronic circuits have two states: on (1) and off (0), making binary natural for digital systems

---

## Study Tips:

1. **Spaced Repetition**: Review flashcards daily, not just before test
2. **Active Recall**: Try to answer before flipping card
3. **Mix It Up**: Study cards in random order (Quizlet does this)
4. **Practice Modes**: Use Quizlet's Learn, Test, and Match features
5. **Focus on Weak Areas**: Star difficult cards for extra review
6. **Explain Out Loud**: Say answers aloud to reinforce learning
7. **Code While Studying**: Type out examples as you review
8. **Connect Concepts**: Link related topics together mentally
9. **NEW - Number Systems**: Use the Visual Guide PDF alongside flashcards
10. **NEW - Practice Conversions**: Do a few conversions by hand daily

**Total Cards: 325+ cards across 13 sets!**

Good luck! 🎯
