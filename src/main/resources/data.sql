INSERT INTO livro (titulo, autor, ano_publicacao) VALUES ('1984', 'George Orwell', 1949);
INSERT INTO livro (titulo, autor, ano_publicacao) VALUES ('O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 1943);
INSERT INTO livro (titulo, autor, ano_publicacao) VALUES ('O Hobbit', 'J.R.R. Tolkien', 1937);
INSERT INTO livro (titulo, autor, ano_publicacao) VALUES ('Orgulho e Preconceito', 'Jane Austen', 1813);
INSERT INTO livro (titulo, autor, ano_publicacao) VALUES ('Crime e Castigo', 'Fiódor Dostoiévski', 1866);

INSERT INTO membro (nome, endereco, telefone) VALUES ('Ana', 'Avenida ABC, 456', '(11) 12345-6789');
INSERT INTO membro (nome, endereco, telefone) VALUES ('Carlos', 'Rua XYZ, 789', '(22) 98765-4321');
INSERT INTO membro (nome, endereco, telefone) VALUES ('Laura', 'Rua QWERTY, 123', '(33) 24680-1357');
INSERT INTO membro (nome, endereco, telefone) VALUES ('Pedro', 'Avenida 123, 789', '(44) 56789-1234');
INSERT INTO membro (nome, endereco, telefone) VALUES ('Maria', 'Rua 456, 987', '(55) 98765-4321');

INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES (1, 1, '2024-03-16', '2024-04-16');
INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES (2, 2, '2024-03-16', '2024-04-16');
INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES (3, 3, '2024-03-16', '2024-04-16');
INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES (4, 4, '2024-03-16', '2024-04-16');
INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES (5, 5, '2024-03-16', '2024-04-16');

INSERT INTO bibliotecario (nome, email, senha) VALUES ('Fernanda', 'fernanda@example.com', 'senha123');
INSERT INTO bibliotecario (nome, email, senha) VALUES ('Guilherme', 'guilherme@example.com', 'senha456');
INSERT INTO bibliotecario (nome, email, senha) VALUES ('Isabela', 'isabela@example.com', 'senha789');
INSERT INTO bibliotecario (nome, email, senha) VALUES ('Lucas', 'lucas@example.com', 'senha101112');
INSERT INTO bibliotecario (nome, email, senha) VALUES ('Ana', 'ana@example.com', 'senha131415');

INSERT INTO visitante (nome, telefone) VALUES ('Rafaela', '(66) 12345-6789');
INSERT INTO visitante (nome, telefone) VALUES ('Gabriel', '(77) 98765-4321');
INSERT INTO visitante (nome, telefone) VALUES ('Mariana', '(88) 24680-1357');
INSERT INTO visitante (nome, telefone) VALUES ('Pedro', '(99) 56789-1234');
INSERT INTO visitante (nome, telefone) VALUES ('Larissa', '(00) 13579-2468');
