# DSA Solving

A personal collection of Data Structures and Algorithms problems solved on LeetCode, written in Java. Each problem lives in its own folder with the solution file and a README containing the problem statement, examples, and constraints (exported via LeetHub).

## Problems Solved

31 problem folders covering 29 unique LeetCode problems (a few problems appear under both padded and unpadded folder names, e.g. `13-roman-to-integer` and `0013-roman-to-integer`).

### By Topic

| Category | Count | Problems |
| --- | --- | --- |
| Arrays & Hashing | 12 | Two Sum, Contains Duplicate, Contains Duplicate II, Valid Anagram, Group Anagrams, Product of Array Except Self, Top K Frequent Elements, Longest Consecutive Sequence, Valid Sudoku, Sum of Unique Elements, Remove Anagrams from Array, Remove Duplicates from Sorted Array |
| Stack / Monotonic Stack | 6 | Valid Parentheses, Evaluate Reverse Polish Notation, Min Stack, Daily Temperatures, Trapping Rain Water, Car Fleet |
| Strings | 4 | First Unique Character in a String, Roman to Integer, Longest Common Prefix, Integer to Roman |
| Math | 3 | Reverse Integer, Palindrome Number, Perfect Number |
| Two Pointers | 3 | Container With Most Water, Two Sum II (Sorted Array), 3Sum Closest |
| Binary Search | 1 | Search in Rotated Sorted Array |

### Problem Index

- [1-two-sum](1-two-sum/) — Two Sum (Easy)
- [7-reverse-integer](0007-reverse-integer/) — Reverse Integer (Medium)
- [9-palindrome-number](9-palindrome-number/) — Palindrome Number (Easy)
- [11-container-with-most-water](11-container-with-most-water/) — Container With Most Water (Medium)
- [12-integer-to-roman](0012-integer-to-roman/) — Integer to Roman (Medium)
- [13-roman-to-integer](13-roman-to-integer/) — Roman to Integer (Easy)
- [14-longest-common-prefix](0014-longest-common-prefix/) — Longest Common Prefix (Easy)
- [16-3sum-closest](0016-3sum-closest/) — 3Sum Closest (Medium)
- [20-valid-parentheses](20-valid-parentheses/) — Valid Parentheses (Easy)
- [26-remove-duplicates-from-sorted-array](0026-remove-duplicates-from-sorted-array/) — Remove Duplicates from Sorted Array (Easy)
- [33-search-in-rotated-sorted-array](33-search-in-rotated-sorted-array/) — Search in Rotated Sorted Array (Medium)
- [36-valid-sudoku](36-valid-sudoku/) — Valid Sudoku (Medium)
- [42-trapping-rain-water](42-trapping-rain-water/) — Trapping Rain Water (Hard)
- [49-group-anagrams](49-group-anagrams/) — Group Anagrams (Medium)
- [128-longest-consecutive-sequence](128-longest-consecutive-sequence/) — Longest Consecutive Sequence (Medium)
- [150-evaluate-reverse-polish-notation](150-evaluate-reverse-polish-notation/) — Evaluate Reverse Polish Notation (Medium)
- [155-min-stack](155-min-stack/) — Min Stack (Medium)
- [167-two-sum-ii-input-array-is-sorted](167-two-sum-ii-input-array-is-sorted/) — Two Sum II (Medium)
- [217-contains-duplicate](217-contains-duplicate/) — Contains Duplicate (Easy)
- [219-contains-duplicate-ii](219-contains-duplicate-ii/) — Contains Duplicate II (Easy)
- [238-product-of-array-except-self](238-product-of-array-except-self/) — Product of Array Except Self (Medium)
- [242-valid-anagram](242-valid-anagram/) — Valid Anagram (Easy)
- [347-top-k-frequent-elements](347-top-k-frequent-elements/) — Top K Frequent Elements (Medium)
- [387-first-unique-character-in-a-string](387-first-unique-character-in-a-string/) — First Unique Character in a String (Easy)
- [507-perfect-number](0507-perfect-number/) — Perfect Number (Easy)
- [739-daily-temperatures](739-daily-temperatures/) — Daily Temperatures (Medium)
- [883-car-fleet](883-car-fleet/) — Car Fleet (Medium)
- [1353-find-resultant-array-after-removing-anagrams](1353-find-resultant-array-after-removing-anagrams/) — Find Resultant Array After Removing Anagrams (Easy)
- [1848-sum-of-unique-elements](1848-sum-of-unique-elements/) — Sum of Unique Elements (Easy)

## Repository Layout

Each problem is stored as:

```
<number>-<problem-slug>/
  <problem-slug>.java     Solution implementation
  README.md               Problem statement from LeetCode
  Notes.md                Personal notes (where present)
```

`stats.json` tracks progress metadata (solved count, difficulty breakdown) as exported by LeetHub.

## Getting Started

Solutions are standalone Java files. Compile and run with your local JDK, for example:

```bash
javac 1-two-sum/two-sum.java
```

Or open the repository in any Java IDE (IntelliJ, VS Code with Java extensions) and run individual solutions with a small `main` method.

## License

[MIT](LICENSE)
