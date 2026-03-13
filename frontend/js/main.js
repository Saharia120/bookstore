const books = [
    {id:1, title:"Java Programming", price:25, img:""},
    {id:2, title:"Python Programming", price:30, img:""},
    {id:3, title:"C++ Programming", price:20, img:""}
];

const bookList = document.getElementById("book-list");
const cartCount = document.getElementById("cart-count");

let cart = JSON.parse(localStorage.getItem("cart")) || [];

function updateCartCount(){ cartCount.textContent = cart.length; }

function addToCart(bookId){
    const book = books.find(b => b.id === bookId);
    cart.push(book);
    localStorage.setItem("cart", JSON.stringify(cart));
    updateCartCount();
    alert(`${book.title} added to cart!`);
}

function renderBooks(){
    bookList.innerHTML = "";
    books.forEach(book=>{
        const div = document.createElement("div");
        div.className="book";
        div.innerHTML=`
            <div style="width:150px;height:200px;background:#ddd;display:flex;align-items:center;justify-content:center;margin-bottom:10px;">Cover</div>
            <h3>${book.title}</h3>
            <p>Price: $${book.price}</p>
            <button onclick="addToCart(${book.id})">Add to Cart</button>
        `;
        bookList.appendChild(div);
    });
}

renderBooks();
updateCartCount();