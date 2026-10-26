## Daily Coding Practice

This project is for practicing coding interview problems in Java, with the goal of becoming more comfortable solving them without assistance.

### Getting the Daily Problem

Open ChatGPT and ask:

> I'm ready for today's coding problem.

ChatGPT will provide an interview-style coding problem appropriate to my current level. Problems should gradually introduce new algorithms, data structures, and problem-solving techniques.

### Practice Guidelines

1. **Solve it myself first.** Spend 10–15 minutes thinking through the problem and implementing a solution before asking for help.
2. **Ask for hints when needed.** ChatGPT should provide incremental hints rather than immediately revealing the solution.
3. **Start with a working solution.** Don't worry about finding the optimal algorithm right away.
4. **Analyze the solution.** Understand its time and space complexity, edge cases, and opportunities for improvement.
5. **Write tests.** Use JUnit to verify the solution against the examples and additional test cases.
6. **Review and learn.** Discuss the solution with ChatGPT as if explaining it in a technical interview.

### Goals

* Build confidence with common coding interview problems.
* Improve algorithm and data structure skills.
* Practice writing clean, correct Java code.
* Learn to analyze time and space complexity.
* Develop the ability to explain and defend technical decisions.
* Learn when optimization is worthwhile and understand its trade-offs.

**The goal is consistent practice, not speed or memorization.** One problem a day is enough to build confidence and make interview questions feel more familiar over time.

### Setup

This project uses IntelliJ IDEA to manage JUnit dependencies instead of Maven or Gradle.

#### Adding JUnit 6

If JUnit isn't configured yet, you can let IntelliJ help:

1. Open a test class that has unresolved JUnit imports.
2. Click the error on a JUnit import, such as `org.junit.jupiter.api.Test`.
3. Use IntelliJ's suggested quick fix to add the missing JUnit library.
4. If prompted, select JUnit 6 and let IntelliJ download and configure the library.

Alternatively, configure it manually through **File → Project Structure → Modules → Dependencies**, then add the JUnit library.

**Note:** JUnit libraries are downloaded locally and are not committed to Git. If you clone this project on another machine, you may need to configure the library again.

TODO consider converting to a maven project to manage dependencies like this.

### AI Coding Assistant Skill

The `skills/java-challenges/SKILL.md` file contains instructions for AI assistants working on this project,
including challenge progression, coaching style, testing conventions, and code review guidelines. If you use an
AI coding assistant that supports Agent Skills, create a symlink to this skill in the appropriate discovery directory
for that tool. For example, Claude Code uses `.claude/skills/` and Antigravity uses `.agents/skills/`. 

Check each tool's documentation for its current conventions. 

If symlinks are unsupported or the skill isn't discovered correctly, copy the `SKILL.md` file into the appropriate 
location instead. 

You can also paste the file into a ChatGPT conversation to restore the challenge coaching instructions if conversation
context is lost.