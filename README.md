# Bridgerton Social Registry Warmup

A beginner-friendly Java warmup project for testers preparing for a Java testing course.

## What This Is

Lady Whistledown needs help managing the social registry for the season's ball. You'll build a system that determines who may attend based on various etiquette rules. This project introduces Java fundamentals in a calm, structured way.

## Getting Started

**Java version:** this course targets modern Java, and requires **Java 21 or higher**.

In IntelliJ: set **Project SDK** to your installed JDK (21+). If you don't have one yet, IntelliJ can download it for you. You can manage all this in **File > Project Structure > Project**.

### Step 1: Install IntelliJ IDEA

Download and install **IntelliJ IDEA Community Edition** (it's free). When you first open it, IntelliJ will offer to download Java for you if you don't have it. Let it do that.

### Step 2: Open This Project

**Preferred route (recommended): clone the repository**

1. Launch IntelliJ
2. Click **Get from VCS** (or **Clone Repository**)
3. Paste the Git URL:
   - `https://github.com/bbottema/whistledowns-ball-registry.git`
4. Choose a local folder and click **Clone**
5. If prompted to trust the project, click **Trust Project**

**Alternative route (if you downloaded a ZIP or already have the folder): open the project folder**

1. Launch IntelliJ
2. Click **Open**
3. Navigate to the project folder and click **Open**
4. If prompted to trust the project, click **Trust Project**

### First Run

Ready to start? Here's what to do:

1. In the Project view (left side), open: `02-assignments/phase-01-first-season/session-01-sandbox`
2. Open the `S01_Assignment.java` file
3. Read the session `README.md` for instructions
4. Click the green ▶ run button to run the program

Note: in Session 01 you'll intentionally crash the program once. Seeing output, then a crash, then a stack trace is expected here — treat it like a useful test failure report.

## Project Structure

This project has four main folders:

### 00-coach-manual
Contains coaching materials and reference documents. This is optional - students can work through the project independently, but if a coach is guiding the sessions, this folder provides:
- **01. Whistledown's Ball Registry - core.md**: Complete coach manual with session-by-session guidance, timing, and teaching notes
- **02. Whistledown's Ball Registry - advanced.md**: Coach notes for Phase 4 (advanced topics)
- **03. Progress Tracker.md**: Printable template to fill in for students to keep track during the course
- **04. Java Cheat Sheet.md**: One-page printable reference of Java fundamentals covered in this warmup

### 01-clean-start
Contains starter files with TODO comments and hints. All code compiles but logic needs to be implemented. Use this as a reference or to start fresh. Don't modify anything in this folder.

### 02-assignments
**This is your working directory.** Make all your edits here. Starts identical to clean-start. This folder is marked as the Sources Root in IntelliJ.

### 03-solutions
Contains fully implemented solutions. Use these to check your work or get unstuck. All code here compiles and runs correctly.

## Phases Overview

Each of the three folders contains identical phase structure:

- **Phase 01 – First Season** (Sessions 1-5): Variables, strings, decisions, loops, and basic methods
- **Phase 02 – The Ton** (Sessions 6-8): Classes, interfaces, and orchestration
- **Phase 03 – Whistledown's Verdict** (Sessions 9-10): Assertions and JUnit preview
    - **Note:** This concludes the core basics, and you can choose to stop here
- **Phase 04 – Season of Refinement** (Sessions 11-18, optional): Maps, diagnostics, test harnesses, structured results, CSV data loading, parameterized testing, formatted reports, and statistics

## How to Run a Session

1. Navigate to `02-assignments/phase-XX/session-YY/`
2. Open the Java file(s) in that session
3. Read the session `README.md` for guidance
4. Run the session program:
   - Click the green ▶ next to `main(...)`, or
   - Right-click the file and choose **Run**
5. Observe output and compare to the "success" section

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

- Plain Java project (no build tools needed, everything is inside IntelliJ)
- Each session folder is self-contained
- No external libraries required

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