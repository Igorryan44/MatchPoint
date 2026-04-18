CREATE TABLE usuario(
    id serial PRIMARY KEY,
    name varchar(244),
    email varchar(244) UNIQUE NOT NULL,
    userPassword varchar(244)
)