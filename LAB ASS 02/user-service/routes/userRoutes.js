const express = require("express");
const router = express.Router();
const { poolPromise, sql } = require("../db");

// Register a new user
router.post("/register", async (req, res) => {
  try {
    const { name, email } = req.body;
    const pool = await poolPromise;
    const result = await pool
      .request()
      .input("name", sql.NVarChar, name)
      .input("email", sql.NVarChar, email)
      .query("INSERT INTO Users (name, email) VALUES (@name, @email)");

    res.status(201).send({ message: "User registered successfully", result });
  } catch (err) {
    console.error(err);
    res.status(500).send("Error registering user");
  }
});

// Fetch all users
router.get("/", async (req, res) => {
  try {
    const pool = await poolPromise;
    const result = await pool.request().query("SELECT * FROM Users");

    res.status(200).send(result.recordset);
  } catch (err) {
    console.error(err);
    res.status(500).send("Error fetching users");
  }
});

// DELETE a user
router.delete("/:id", async (req, res) => {
    const userId = req.params.id;
  
    try {
      const pool = await poolPromise;
      await pool.request().query(`DELETE FROM Users WHERE id = ${userId}`);
      res.status(200).send({ message: "User deleted successfully" });
    } catch (error) {
      console.error(error);
      res.status(500).send({ error: "Error deleting user" });
    }
  });
module.exports = router;
