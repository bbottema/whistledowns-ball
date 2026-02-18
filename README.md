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

### Step 3: Install JShell Console Plugin

Sessions 1-3 use JShell for interactive practice.

1. Go to **File → Settings → Plugins** (or **IntelliJ IDEA → Preferences → Plugins** on Mac)
2. Click **Marketplace**
3. Search for **"JShell Console"**
4. Click **Install** and restart when prompted

You can now access JShell via **Tools → JShell Console...**

## Project Structure

This project has four main folders:

### 00-coach-manual
Contains coaching materials and reference documents. This is optional - students can work through the project independently, but if a coach is guiding the sessions, this folder provides:
- **Whistledown's Ball Registry.md**: Complete coach manual with session-by-session guidance, timing, and teaching notes
- **Whistledown's Ball Registry Expansion.md**: Coach notes for Phase 4 (expansion pack sessions)
- **Java Cheat Sheet.md**: One-page printable reference of Java fundamentals covered in this warmup

### 01-clean-start
Contains starter files with TODO comments and hints. All code compiles but logic needs to be implemented. Use this as a reference or to start fresh. Don't modify anything in this folder.

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
