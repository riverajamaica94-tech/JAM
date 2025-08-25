# CALTRON

CALTRON (Computational Academic Learning Tracker with Real-time Outcome-based Nudges) is an offline, web-based academic performance monitoring system.  
It calculates weighted grades from Written Works, Performance Tasks, and Exams, classifies performance into six categories, and provides adaptive, personalized recommendations via a Python ML service.

---

## Features

- Weighted Average Calculation: Computes the final grade based on configurable weights for WW, PT, and Exams.  
- 6-Level Performance Classification**:
  - Low (<75)
  - Moderately Low (75–79.99)
  - Average (80–84.99)
  - Moderately High (85–89.99)
  - High (90–94.99)
  - Extremely High (95–100)
- Personalized Recommendations: Python FastAPI service suggests 3–5 adaptive nudges for improvement.  
- Offline Functionality: Both Java backend and Python recommender run locally without internet.  
- Simple Frontend: HTML page to test inputting scores and viewing results in real time.

---

## Project Structure

caltron/
├─ ml/ # Python FastAPI recommender
├─ src/main/java/... # Java Spring Boot backend
├─ src/main/resources/static/index.html # Simple frontend
├─ README.md
└─ pom.xml