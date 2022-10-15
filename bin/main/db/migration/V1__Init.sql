CREATE TABLE USER_ACCOUNT
(
    id       serial NOT NULL,
    name     character varying(255),
    username character varying(255) UNIQUE,
    password character varying(255)
);


CREATE TABLE ANIMAL
(
    id          serial NOT NULL,
    nome     character varying(255),
    data_nascimento timestamp,
    raca     character varying(255),
    foto     character varying(255),
    laudo     character varying(255),
    obs     character varying(255),
    historico  character varying(255)
);

CREATE TABLE CLIENTE
(
    id          serial NOT NULL,
    nome     character varying(255),
    data_nascimento timestamp,
    cpf     character varying(255),
    rg     character varying(255),
    foto     character varying(255),
    relatorio_animal     character varying(255)
);
