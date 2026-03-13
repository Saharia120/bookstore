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

### Backend

1. Clone the repository:

```bash
git clone https://github.com/Saharia120/bookstore.git
cd bookstore
```

2. Navigate to the backend folder:

```bash
cd backend/bookstore
```

3. Run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

4. The backend server will start at:

http://localhost:8080


### Frontend

1. Open another terminal and navigate to the frontend folder:

```bash
cd bookstore/frontend
```

2. Start the frontend live server:

```bash
live-server --port=5500
```

3. Open the application in your browser:

http://127.0.0.1:5500

The frontend will communicate with the backend APIs running on port **8080**.
