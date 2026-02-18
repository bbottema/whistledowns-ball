# Bridgerton Social Registry Warmup

A beginner-friendly Java warmup project for testers preparing for a Java testing course.

## What This Is

Lady Whistledown needs help managing the social registry for the season's ball. You'll build a system that determines who may attend based on various etiquette rules. This project introduces Java fundamentals in a calm, structured way.

## Project Structure

This project has three main folders:

### 01-clean-start
Contains starter files with TODO comments and hints. All code compiles but logic needs to be implemented. Use this as a reference or to start fresh.

### 02-assignments
**This is your working directory.** Make all your edits here. Starts identical to clean-start. This folder is marked as the Sources Root in IntelliJ.

### 03-solutions
Contains fully implemented solutions. Use these to check your work or get unstuck. All code here compiles and runs correctly.

## Phases Overview

Each of the three folders contains identical phase structure:

- **Phase 01 – Safety** (Sessions 1-5): Variables, strings, decisions, loops, and basic methods
- **Phase 02 – Enter the Ton** (Sessions 6-8): Classes, interfaces, and orchestration
- **Phase 03 – Test Engine** (Sessions 9-10): Assertions and JUnit preview
- **Phase 04 – Expansion Pack** (Sessions 11-13): Maps, diagnostics, and test harnesses

## Setup: JShell Console Plugin

**Important:** Sessions 1-3 use JShell for interactive Java experimentation. You need to install the JShell Console plugin first.

### Installing JShell Console Plugin

1. Open IntelliJ IDEA
2. Go to **File → Settings** (or **IntelliJ IDEA → Preferences** on Mac)
3. Navigate to **Plugins**
4. Click **Marketplace** tab
5. Search for **"JShell Console"**
6. Click **Install** on the JShell Console plugin
7. Restart IntelliJ when prompted

### Opening JShell Console

Once installed, open JShell via:
- **Tools → JShell Console...**

An empty console will appear where you can type Java code directly without needing a main method.

## How to Run a Session

### Sessions 1-3 (JShell Interactive)

1. Navigate to `02-assignments/phase-01-safety/session-XX/`
2. Open the `.java` file in that session
3. Read the session README.md for guidance
4. Open JShell Console via **Tools → JShell Console...**
5. Copy code snippets from the file and paste into JShell
6. Experiment by modifying values and re-running code

### Sessions 4+ (Regular Java Programs)

1. Navigate to `02-assignments/phase-XX/session-YY/`
2. Open the Java file(s) in that session
3. Read the session README.md for guidance
4. Right-click the file with `main(...)` and select "Run"
5. Observe output and compare to expected results

## How to Reset a Session

If you want to start a session over:

1. Copy the files from `01-clean-start/phase-XX/session-YY/`
2. Paste into `02-assignments/phase-XX/session-YY/`
3. Replace the existing files

## Coach Rule

**Stop after a win.**

When your code runs and produces the expected output, stop. You're done. Don't chase perfection. Don't add extra features. Celebrate the green output and move on.

## Progress Tracking

See `PROGRESS.md` for a checklist of all sessions. Mark them off as you complete them.

## Technical Notes

- This is a plain Java project (no Maven, no Gradle)
- Uses Java 17
- No external dependencies required
- Default package (no package declarations)
- Only `02-assignments` should be marked as Sources Root in IntelliJ

## Getting Help

Each session has a README.md with:
- Goal
- Steps to follow
- Expected output
- Common errors and fixes
- Coaching notes

If you're stuck for more than 10 minutes, check the solution in `03-solutions` or take a break. Errors are feedback, not judgment.

---

*Built with care for testers entering the world of Java.*
