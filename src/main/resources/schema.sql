CREATE TABLE IF NOT EXISTS livro (
                                     id SERIAL PRIMARY KEY,
                                     titulo VARCHAR(255) NOT NULL,
                                     autor VARCHAR(255) NOT NULL,
                                     ano_publicacao INT NOT NULL
);

CREATE TABLE IF NOT EXISTS membro (
                                      id SERIAL PRIMARY KEY,
                                      nome VARCHAR(255) NOT NULL,
                                      endereco VARCHAR(255) NOT NULL,
                                      telefone VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS emprestimo (
                                          id SERIAL PRIMARY KEY,
                                          livro_id INT NOT NULL,
                                          membro_id INT NOT NULL,
                                          data_emprestimo DATE NOT NULL,
                                          data_devolucao DATE,
                                          FOREIGN KEY (livro_id) REFERENCES livro(id),
                                          FOREIGN KEY (membro_id) REFERENCES membro(id)
);

CREATE TABLE IF NOT EXISTS bibliotecario (
                                             id SERIAL PRIMARY KEY,
                                             nome VARCHAR(255) NOT NULL,
                                             email VARCHAR(255) NOT NULL,
                                             senha VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS visitante (
                                         id SERIAL PRIMARY KEY,
                                         nome VARCHAR(255) NOT NULL,
                                         telefone VARCHAR(20) NOT NULL
);
