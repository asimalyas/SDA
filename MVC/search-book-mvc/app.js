const express = require("express");
const app = express();
const bookController = require("./controllers/bookController");

// Set view engine
app.set("view engine", "ejs");

// Default route for root
app.get("/", (req, res) => {
    res.redirect("/books/search"); // Redirect to the search page
});

// Route for book search
app.get("/books/search", bookController.searchBooks);

// Start server
app.listen(3000, () => {
    console.log("Server is running on http://localhost:3000");
});
app.use(express.static('public'));
