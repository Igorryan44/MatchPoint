CREATE TABLE usuario(
    id serial PRIMARY KEY,
    name varchar(244),
    email varchar(244) UNIQUE NOT NULL,
    user_password varchar(244)
)