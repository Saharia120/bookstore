document.addEventListener("DOMContentLoaded", () => {
    const API = "http://127.0.0.1:8080/api/books";
    const container = document.getElementById("book-details");
    const toast = document.getElementById("toast");

    const params = new URLSearchParams(window.location.search);
    const id = params.get("id");

    async function loadBook() {
        try {
            const res = await fetch(`${API}/${id}`);
            const book = await res.json();
            container.innerHTML = `
                <img src="${book.image}" alt="${book.title}">
                <h2>${book.title}</h2>
                <p><b>Author:</b> ${book.author}</p>
                <p><b>Category:</b> ${book.category}</p>
                <p><b>Price:</b> $${book.price}</p>
                <p>${book.description}</p>
                <button onclick="addToCart(${book.id},'${book.title.replace(/'/g,"\\'")}')">Add To Cart</button>
            `;
        } catch (err) {
            container.innerHTML = "<p style='text-align:center;'>Error loading book</p>";
            console.error(err);
        }
    }

    async function addToCart(id, title) {
        try {
            await fetch("http://127.0.0.1:8080/api/cart/add", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ id })
            });
            showToast(`${title} added to cart`);
        } catch (err) {
            showToast("Failed to add to cart");
            console.error(err);
        }
    }

    function showToast(msg) {
        toast.innerText = msg;
        toast.classList.add("show");
        setTimeout(() => toast.classList.remove("show"), 2000);
    }

    loadBook();

    window.addToCart = addToCart; // Make global for button onclick
});