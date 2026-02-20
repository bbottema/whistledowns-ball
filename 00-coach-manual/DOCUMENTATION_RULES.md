# Documentation Guide (Session README + assignment code)

Date: 19 February 2026

This document is the house style guide for Whistledown’s Ball Registry documentation.
Use it whenever you add a new session, add a new assignment, or revise an existing page.

The audience is **test analysts who are nervous about Java**. The goal is to make each session feel safe, predictable, and runnable without a coach.

---

## Checklist (non‑negotiables)

For every session:

- **Same shape every time**: learners should recognize the page structure immediately.
- **Task-first**: quick “what you’ll get out of this”, then tiny concepts, then do the TODOs.
- **Readable + friendly**: casual, reassuring, “errors are information”, light humor allowed.
- **Testing mindset**: use test analysts’ mental models and jargon when it helps (setup / test data / observe / expected vs actual).
- **No doc sprawl**: avoid slides/duplicate instructions scattered around.
- **Clear boundaries**:
  - Session `README.md` = explanation + how to run + success criteria + troubleshooting
  - Assignment code = action surface (TODO worksheet), minimal commentary, cross-link back to README

---

## Target “doc philosophy” (what Session 01 demonstrates)

### Approach

- **Layered guidance** with a tight feedback loop:
  1) read a small concept chunk
  2) run a tiny snippet / run the program / run tests
  3) observe output or error signals
  4) adjust and rerun

- **Read → do → observe** is the default learning rhythm.

### Documentation density

- **Moderate and purposeful**:
  - enough meaning to reduce fear and confusion
  - not so much that it becomes a textbook

- Concepts are **short and runnable** (a snippet or a rule-of-thumb per concept).

### Style / voice

- Friendly, casual, non-judgy.
- Normalizes mistakes (“not a personal insult”).
- Uses test-analyst framing (“setup”, “test data”, “signals”, “observe”).

---

## The session README contract (template)

Every session `README.md` should follow this structure:

1. `# Session XX – <topic>`
2. `## What you’ll get out of this` (3–5 bullets; capabilities, not abstract goals)
3. `## Concepts (quick read, then do the TODOs)`
   - 2–5 micro-sections max
   - each micro-section includes:
     - a runnable snippet **or** a tight “rule of thumb” + example
   - keep language test-analyst friendly
4. `## Start here`
   - “Open `<main file>` and follow TODO blocks in order”
5. `## How to run` (primary path)
6. `## Plan B` (one fallback path)
7. `## What “success” looks like` (observable outcomes)
8. `## Troubleshooting` (3–8 common issues + fixes)

### Guardrails (to prevent drift)

- If a concept needs more than ~15 lines without a snippet, it’s probably **coach manual** content.
- “Success” must be observable (output, files produced, tests passing), not “understand X”.
- Troubleshooting should list only the errors learners will realistically hit in that session.

---

## The assignment code contract (top-of-file guidance)

For each session’s main assignment file(s):

- Keep a **short header** that answers:
  - Where do I start?
  - How do I run this?
  - What should I do first?
- Then provide a **numbered TODO map**.
- Avoid long “lesson paragraphs” in code (the README is the place for that).
- Include a **cross-link** back to the session `README.md`.

Allowed in code comments:
- concise operational reminders (uncomment TODOs, run TODOs in order)
- a single reassuring line (“If this is your first time touching Java: you’re doing fine.”)

### Special rule: `03-solutions/` files are not learner worksheets

Solution code under `03-solutions/` should be **clean** and **non-instructional**.

- **Do not** include learner-facing header blocks (no TODO maps, no “Start here”, no “How to run”, no coaching reminders).
- Allowed: **brief clarifications about the solution itself** (assumptions, edge cases handled, why a particular approach was chosen).
- If a learner needs instructions, they belong in the session `README.md`, not in `03-solutions/` code.

---

## Tone and jargon guide (for nervous test analysts)

Prefer:

- “setup”, “test data”, “sanity check”, “observe”, “signals”, “debug print/log”, “expected vs actual”, “fail fast”

Normalize:

- exceptions/errors as information
- “this looks scary” moments

Avoid:

- academic wording (“formally define”, “as you know”)
- long theory blocks
- burying the lead (always tell them what to do next)

---

## Phase-by-phase run-mode notes (because “how to run” changes)

### Phase 01 — First Season (Sessions 02–05)

- Run the session Java file directly from IntelliJ from day 1.
- Standardize:
  - Click the green ▶ next to `main(...)`
  - Plan B: right-click the file and choose **Run**
- Troubleshooting should cover:
  - missing semicolons
  - “cannot find symbol” (setup order)
  - `NullPointerException` (Session 02 especially)

### Phase 02 — The Ton (Sessions 06–08)

- Move toward classes/objects and running via `main(...)`.
- Standardize “How to run” around IntelliJ’s green run triangle / run configuration.

### Phase 03 — Whistledown’s Verdict (Sessions 09–10)

- Testing becomes explicit.
- “How to run” becomes **run tests, read failures, rerun**.
- Troubleshooting covers JUnit discovery, wrong folder, imports.

### Phase 04 — Season of Refinement (Sessions 11–18)

- More moving parts (maps, diagnostics, harness, structured results, CSV, parameterized cases, reports, stats).
- Strengthen:
  - “success looks like” (files generated, report output, summary counts)
  - “where to look when it fails” (the first place to check)

---

## Concrete workflow per session (repeatable loop)

For each session folder (existing or new):

1. **Inventory**
   - read the existing session `README.md` (if present)
   - identify the main assignment file(s) learners should start with
2. **Draft/update the README using the template**
   - keep the meaning, but reframe into friendly, runnable micro-chunks
   - add example snippet(s) where helpful
3. **Refit assignment code header**
   - short “how to use this file” + numbered TODO map
4. **Cross-link check**
   - README points to code file(s)
   - code header points to README
5. **Quality checks**
   - README still includes concepts (not just instructions)
   - “success looks like” is observable
   - troubleshooting matches likely errors
6. **Consistency check against Session 01-style pages**
   - structure and tone match

---

## Safeguards (avoid the two common failure modes)

### Failure mode A: README turns into a textbook

Safeguards:
- cap Concepts to 2–5 micro-sections
- each micro-section must connect to a TODO/snippet immediately
- move deeper narrative to `00-coach-manual/`

### Failure mode B: README becomes only run instructions

Safeguards:
- each session README must include:
  - one mental model explanation
  - one runnable snippet or concrete example
  - one “errors are information” framing (especially in early sessions)

---

## Keeping tracks in sync

This repo has two learner tracks:

- `01-clean-start/` (guided track)
- `02-assignments/` (assignment track)

Documentation should be mirrored so both tracks feel identical to learners.

When you change a session `README.md` in one track, make the same change in the matching session folder in the other track.