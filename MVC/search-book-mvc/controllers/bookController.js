const Book = require("../models/Book");

exports.searchBooks = (req, res) => {
    const query = req.query.q || ""; // Get the search query
    const results = Book.search(query);
    res.render("search", { books: results, query });
};
