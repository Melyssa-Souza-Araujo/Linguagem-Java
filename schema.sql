CREATE TABLE IF NOT EXISTS CLIENTE(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	email VARCHAR(255),
	telefone VARCHAR(20)
);

INSERT INTO CLIENTE (nome, email, telefone) VALUES
('Roberto Santos', 'roberto@email.com', '1111-1111');
INSERT INTO CLIENTE (nome, email, telefone) VALUES
('Ana Paula', 'ana@email.com', '2222-2222');
