// models/Book.js
const books = [
    { id: 1, title: "The Great Gatsby", author: "F. Scott Fitzgerald" },
    { id: 2, title: "To Kill a Mockingbird", author: "Harper Lee" },
    { id: 3, title: "1984", author: "George Orwell" },
    { id: 4, title: "Pride and Prejudice", author: "Jane Austen" },
    { id: 5, title: "Moby Dick", author: "Herman Melville" },
    { id: 6, title: "War and Peace", author: "Leo Tolstoy" },
    { id: 7, title: "The Catcher in the Rye", author: "J.D. Salinger" },
    { id: 8, title: "The Hobbit", author: "J.R.R. Tolkien" },
    { id: 9, title: "Ulysses", author: "James Joyce" },
    { id: 10, title: "The Odyssey", author: "Homer" },
];

exports.search = (query) => {
    return books.filter((book) => book.title.toLowerCase().includes(query.toLowerCase()));
};
