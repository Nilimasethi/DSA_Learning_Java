#DSA Learning Java 🚀

Daily DSA practice — solving problems in Java.

## 📚 Topics
- [x] Arrays
- [x] Patterns
- [x] Strings
- [ ] Linked Lists
- [ ] Stack & Queue
- [ ] Trees
- [ ] Graphs
- [ ] DP

## 📊 Stats
- Total problems: 9
- Easy: 9 | Medium: 0 | Hard: 0
- Current streak: Day 1 🔥

## 🗂️ Folder Guide
| Folder | Purpose |
|--------|---------|
| `arrays/` | Array-based problems |
| `patterns/` | Pattern printing programs |
| `strings/` | String manipulation |
| `linked_list/` | Linked list problems |
| `stack_queue/` | Stack & queue problems |
| `trees/` | Binary tree & BST |
| `graphs/` | Graph algorithms |
| `dp/` | Dynamic programming |
| `sorting/` | Sorting algorithms |
| `notes/` | Notes & cheat sheets |

## Patterns Rule
* Rules:
* 1. Use nested loop
* 2. Outer loop runs = no of rows
* 3. Inner loop runs = no of columns
* 4. Print within the loops
* 5. Express j as f(i, n)
*
* Logic:
* - Outer loop: i = 0 to n-1  (rows)
* - Inner loop: j = 0 to ___  (columns)
* - j = f(i, n) = ___
- 
- When solving patterns, always ask yourself two separate questions:
- Question 1: How many columns in each row?
- This gives you the inner loop condition → j < f(i, n)

- Question 2: What value goes in each cell?
- This gives you the print statement → System.out.print(???)