const cartList = document.getElementById("cart-list");
let cart = JSON.parse(localStorage.getItem("cart")) || [];

function saveCart() {
    localStorage.setItem("cart", JSON.stringify(cart));
}

function removeFromCart(index){
    cart.splice(index,1);
    saveCart();
    renderCart();
}

function increaseQty(index){
    cart[index].quantity = (cart[index].quantity || 1) + 1;
    saveCart();
    renderCart();
}

function decreaseQty(index){
    if(cart[index].quantity > 1){
        cart[index].quantity -= 1;
    } else {
        removeFromCart(index);
        return;
    }
    saveCart();
    renderCart();
}

function renderCart(){
    cartList.innerHTML = "";
    if(cart.length === 0){
        cartList.innerHTML = "<p>Your cart is empty.</p>";
        return;
    }

    cart.forEach((book,index)=>{
        const quantity = book.quantity || 1;
        const subtotal = book.price * quantity;

        const div = document.createElement("div");
        div.className = "cart-item";
        div.style.borderBottom = "1px solid #ccc";
        div.style.padding = "10px 0";

        div.innerHTML = `
            <h3>${book.title}</h3>
            <p>Author: ${book.author}</p>
            <p>Price: $${book.price}</p>
            <div>
                <button onclick="decreaseQty(${index})">-</button>
                <span style="margin:0 10px;">${quantity}</span>
                <button onclick="increaseQty(${index})">+</button>
            </div>
            <p>Subtotal: $${subtotal}</p>
            <button onclick="removeFromCart(${index})" style="margin-top:5px;background:#dc3545;color:white;">Remove</button>
        `;
        cartList.appendChild(div);
    });
}

// On page load, initialize quantity for each book if missing
cart.forEach(book=>{
    if(!book.quantity) book.quantity = 1;
});

renderCart();