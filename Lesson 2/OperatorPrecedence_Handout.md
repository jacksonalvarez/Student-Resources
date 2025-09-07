# Java Operator Precedence Reference

1. Parentheses: ()
2. Unary: -n, n++, n--, !n
3. Multiplicative: *, /, %,
4. Additive: +, -
5. Relational: <, >, <=, >=
6. Equality: ==, !=
7. Logical AND: boolean test = true && false;
8. Logical OR: || boolean test = true || false;
9. Assignment: =, int n = n + n;, -=, *=, /=, %=

**Notes:**

- Operators on the same line are evaluated left to right (except assignment,
  which is right to left).
- Integer division truncates (drops) the decimal part.
- Use parentheses to clarify or change evaluation order.
