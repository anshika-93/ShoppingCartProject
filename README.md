# Shopping Cart System 

---

## Project Structure
```
shopping-cart-system/
├── backend/                  # Java Spring Boot backend
├── frontend/                 # Angular 
├── scripts/                  # Python reporting script
└── README.md
```

---

## Features
- REST API to manage a shopping cart
- Pricing logic with special offers:
  - Apples: 35p each
  - Bananas: 20p each
  - Melons: Buy 1 Get 1 Free
  - Limes: 3 for the price of 2
- Angular app makes HTTP calls to backend (no UI)
- Python script generates a summary report (mocked)

---

## Tech Stack
| Layer     | Technology       |
|-----------|------------------|
| Backend   | Java 17 + Spring Boot + Gradle |
| Frontend  | Angular 17       |
| Reporting | Python 3         |

---

## How to Run Locally

### Clone the Repo
```bash
git clone https://github.com/anshika-93/Shopping-Cart-Project.git
cd Shopping-Cart-Project
```

### Start the Backend (Spring Boot)
```bash
cd backend
./gradlew bootRun
```

Backend will start at: `http://localhost:8080`

##ScreenShot 
<img width="987" alt="image" src="https://github.com/user-attachments/assets/86cbaa05-4dbf-43fd-bc10-de8562c60e53" />


### 🌐 Start the Frontend (Angular API Calls)
```bash
cd ../frontend
npm install
ng serve
```

Angular will run at: `http://localhost:4200`

You should see API call logs in the browser console (no UI).

##ScreenShot 
<img width="1170" alt="image" src="https://github.com/user-attachments/assets/14d807e9-b42b-4450-9577-d21320324447" />


### 🤖 Test API Manually 
```bash
curl -X POST http://localhost:8080/cart/item -H "Content-Type: application/json" -d '{"item":"Apple"}'
curl http://localhost:8080/cart
curl http://localhost:8080/cart/total
```

### 📊 Run the Python Report Script
```bash
cd ../scripts
python report_generator.py
```
Outputs a mock cart report with item counts and total cost.

---

## 📗 File: `report_generator.py`
This Python script analyzes a hardcoded cart and applies the same pricing logic.
It's a standalone.

---
