# DeepTalk 🚀

DeepTalk is an AI-powered chatbot that leverages Google's Gemini API to generate intelligent responses to user queries. Built using **Spring Boot**, **WebClient**, and **REST APIs**, DeepTalk is designed for seamless and efficient interactions.


---

## 🔥 Features

✅ AI-powered chatbot using Gemini API  
✅ RESTful API for smooth communication  
✅ Lightweight and fast with WebClient  
✅ Scalable and cloud-ready deployment  

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, WebClient
- **API:** Gemini AI API (Google AI)
- **Database:** MySQL (Optional, if storing history)
---

## 🚀 Installation & Setup

### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven
- Spring Boot
- API Key for Gemini API

### Steps to Run Locally

1. **Clone the repository**
   ```sh
   git clone https://beingnikil07/deeptalk.git
   cd deeptalk
   ```

2. **Configure Environment Variables**
   - Set your Gemini API key in `application.properties`:
     ```properties
     gemini.api.key=YOUR_GEMINI_API_KEY
     ```

3. **Build and Run the Project**
   ```sh
   mvn spring-boot:run
   ```

4. **Access the API**
   - Open `http://localhost:8080/api/query/ask  in your browser or use Postman.

---

## 📦 Deployment

### Deploying on Railway Cloud

1. **Login to Railway** and create a new project.
2. **Connect your GitHub repo** containing DeepTalk.
3. **Set environment variables** (API Key, DB URL if needed).
4. **Deploy and get your public URL!**

---

## 📜 API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST`  | `/api/query/ask` | Get AI response for a given message |

---
## 🤝 Contributing

Contributions are welcome! Feel free to fork this repo and submit a pull request.

---

## 📜 License

This project is licensed under the MIT License.

---

### ⭐ Star this repo if you like DeepTalk!

Let's build something amazing together! 🚀
