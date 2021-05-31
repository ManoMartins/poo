CREATE TABLE pool_schedule (
    id serial PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    block INT NOT NULL,
    ap INT NOT NULL,
    created_at TIMESTAMP NOT NULL
)