# Mini Online Bookstore App

This is a mini online bookstore project built for the Growth Analytics & CRO Specialist technical assignment at Rokomari.com.

## Features

### Frontend
- HTML, CSS, Vanilla JS
- Book listing page
- Book details page
- Shopping cart
- Search functionality
- Responsive design for desktop

### Backend
- Java Spring Boot REST APIs
- Endpoints:
  - `GET /api/books` - Get all books
  - `GET /api/books/{id}` - Get book by ID
  - `GET /api/books?keyword=` - Search books
  - `POST /api/cart/add` - Add to cart
  - `GET /api/cart` - Get cart items

### Database
- MySQL (or H2 for testing)

## How to Run

### Backend
1. Navigate to the backend folder
2. Run `./mvnw spring-boot:run` (or via IDE)
3. Application runs on `http://localhost:8080`

### Frontend
1. Open `index.html` in a browser
2. Connects to backend APIs

## Notes
- `.DS_Store` files are system files from macOS, can be ignored.
- This project demonstrates a basic full-stack bookstore app.
- All project files (frontend & backend) are included in this repository.
