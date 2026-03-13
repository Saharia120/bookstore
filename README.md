# Mini Online Bookstore App


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
- All project files (frontend & backend) included

### Bonus / Extra Features
- Clean UI/UX improvements
- Toast notifications (if implemented)
- Loading spinner while API loads
- Pagination or sorting (if implemented)
- Fully responsive for desktop

## How to Run

### Clone Repository
```bash
git clone https://github.com/Saharia120/bookstore.git
cd bookstore
```

### Run Backend
```bash
cd backend/bookstore
./mvnw spring-boot:run
```

Backend runs at:  
http://localhost:8080

### Run Frontend
Open another terminal

```bash
cd frontend
```

If live-server is not installed:

```bash
npm install -g live-server
```

Run frontend:

```bash
live-server --port=5500
```

Open in browser:  
http://127.0.0.1:5500
