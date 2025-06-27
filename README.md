# 💱 Currency Converter App

A simple Java console application to convert between different currencies in real-time, using live exchange rates from [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🚀 Features

- Real-time currency conversion using the **ExchangeRate-API**.
- Simple console interface with 6 conversion options.
- Reliable HTTP requests using Java's `HttpClient`.
- Easy-to-read output with converted currency results.

---

## 🔧 Supported Conversion Options

1. USD ➡️ Brazilian Real (BRL)  
2. Brazilian Real (BRL) ➡️ USD  
3. USD ➡️ Argentine Peso (ARS)  
4. Argentine Peso (ARS) ➡️ USD  
5. Brazilian Real (BRL) ➡️ Argentine Peso (ARS)  
6. Argentine Peso (ARS) ➡️ Brazilian Real (BRL)  
7. Exit the application  

---

## 🌐 Exchange Rate API

The app uses [ExchangeRate-API](https://www.exchangerate-api.com/) to retrieve up-to-date currency exchange rates.  
Currency conversion is performed by making a `GET` request to the API's **pair conversion endpoint**, for example:

https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/USD/BRL/20
Replace YOUR_API_KEY with your actual API key and adjust the amount and currency codes accordingly.

## 🖥️ How to Run
1. Clone the repository:

```
git clone https://github.com/yourusername/currency-converter-app.git
```

2. Navigate to the project folder:

```
cd currency-converter-app
```

3. Compile the application:

```
javac Main.java
```

4. Run the application:

```
java Main
```

## 📷 Screen captures of the application

<strong>Step 1</strong>

![image](https://github.com/user-attachments/assets/c0ab6c55-f391-45a5-9c3b-2b8300570ba0)


<strong>Step 2</strong>

![image](https://github.com/user-attachments/assets/f90c3059-cc7b-4906-ba0d-268c773aa291)


<strong>Step 3</strong>

![image](https://github.com/user-attachments/assets/741e41d6-2590-449c-a35b-53e5914ded1b)

<strong>Step 4</strong>

![image](https://github.com/user-attachments/assets/c6cf7f9c-a7e8-4db1-8ddc-c141450086c5)


## 📦 Dependencies

• Gson - For parsing JSON responses.

• Java 11 or higher (for HttpClient support).

## 📄 License

This project is for educational purposes only and not intended for production use.
Currency data provided by ExchangeRate-API.

## ✨ Author

Developed by Andrea Bermúdez.
