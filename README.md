# Bridgerton Social Registry Warmup

A beginner-friendly Java warmup project for testers preparing for a Java testing course.

## What This Is

Lady Whistledown needs help managing the social registry for the season's ball. You'll build a system that determines who may attend based on various etiquette rules. This project introduces Java fundamentals in a calm, structured way.

## Getting Started

### Step 1: Install IntelliJ IDEA

Download and install **IntelliJ IDEA Community Edition** (it's free). When you first open it, IntelliJ will offer to download Java for you if you don't have it. Let it do that.

### Step 2: Open This Project

1. Launch IntelliJ
2. Click **Open**
3. Navigate to this project folder and click **Open**
4. If prompted to trust the project, click **Trust Project**

### Step 3: Install JShell Console Plugin (Optional)

Sessions 1-3 work best with JShell for interactive practice.

1. Go to **File → Settings → Plugins** (or **IntelliJ IDEA → Preferences → Plugins** on Mac)
2. Click **Marketplace**
3. Search for **"JShell Console"**
4. Click **Install** and restart when prompted

You can now access JShell via **Tools → JShell Console...**

**Plan B:** If you prefer to skip the JShell plugin, use an IntelliJ Scratch file instead:
- Right-click anywhere in the Project view
- Select **New → Scratch File → Java**
- Copy/paste code snippets and run them there

### First Run

Ready to start? Here's what to do:

1. In the Project view (left side), open: `02-assignments/phase-01-first-season/session-01-sandbox`
2. Open the `S01_Sandbox.java` file
3. Read the session `README.md` for instructions
4. For Sessions 1-3: Copy code to JShell Console (or Scratch file)
5. For Sessions 4+: Click the green ▶ button next to `main(...)`

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

### Phase 1 - Sessions 1-3 (JShell Interactive)

1. Navigate to `02-assignments/phase-01-first-season/session-XX/`
2. Open the `.java` file in that session
3. Read the session README.md for guidance
4. Open JShell Console via **Tools → JShell Console...**
5. Copy code snippets from the file and paste into JShell
6. Experiment by modifying values and re-running code

### All other sessions (main method)

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
