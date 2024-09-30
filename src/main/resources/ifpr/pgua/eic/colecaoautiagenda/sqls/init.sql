CREATE TABLE IF NOT EXISTS tb_usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL,
    senha VARCHAR(150) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_responsavel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_rotina_diaria (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    data_agendamento DATE NOT NULL,
    horario TIME NOT NULL,
    detalhes VARCHAR(150)
);

CREATE TABLE IF NOT EXISTS tb_terapia (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    data_agendamento DATE NOT NULL,
    horario TIME NOT NULL,
    detalhes VARCHAR(150)
);

CREATE TABLE IF NOT EXISTS tb_medicamento (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    data_agendamento DATE NOT NULL,
    horario TIME NOT NULL,
    detalhes VARCHAR(150),
    foto VARCHAR(150)
);


