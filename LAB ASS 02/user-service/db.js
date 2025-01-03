require('dotenv').config(); 
const sql = require("mssql");

const config = {
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    server: process.env.DB_SERVER, // e.g., localhost
    database: process.env.DB_NAME,
    options: {
      encrypt: false,
      enableArithAbort: true,
    },
  };
  
  const poolPromise = new sql.ConnectionPool(config)
    .connect()
    .then((pool) => {
      console.log("Connected to MSSQL");
      return pool;
    })
    .catch((err) => console.log("Database Connection Failed! Error: ", err));
  
  module.exports = {
    sql,
    poolPromise,
  };