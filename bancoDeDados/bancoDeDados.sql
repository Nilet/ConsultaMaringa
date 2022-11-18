
CREATE TABLE UnidadeSaude (
                idUbs INT AUTO_INCREMENT NOT NULL,
                Nome VARCHAR(48) NOT NULL,
                cep VARCHAR(8) NOT NULL,
                Bairro VARCHAR(32) NOT NULL,
                Endereco VARCHAR(70) NOT NULL,
                PRIMARY KEY (idUbs)
);


CREATE TABLE Paciente (
                CNS VARCHAR(15) NOT NULL,
                Nome VARCHAR(69) NOT NULL,
                dataNascimento DATE NOT NULL,
                cep VARCHAR(8) NOT NULL,
                Endereco VARCHAR(70) NOT NULL,
                Bairro VARCHAR(32) NOT NULL,
                cpf VARCHAR(11) NOT NULL UNIQUE,
                PRIMARY KEY (CNS)
);


CREATE TABLE Medicos (
                crm VARCHAR(6) NOT NULL,
                ESPECIALIDADE VARCHAR(32) NOT NULL,
                NOME VARCHAR(69) NOT NULL,
                PRIMARY KEY (crm)
);


CREATE TABLE Consulta (
                idConsulta INT AUTO_INCREMENT NOT NULL,
                crm VARCHAR(6) NOT NULL,
                CNS VARCHAR(15) NOT NULL,
                idUbs INT NOT NULL,
                DataHora DATETIME NOT NULL,
                PRIMARY KEY (idConsulta)
);


ALTER TABLE Consulta ADD CONSTRAINT unidadesaude_consulta_fk
FOREIGN KEY (idUbs)
REFERENCES UnidadeSaude (idUbs)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Consulta ADD CONSTRAINT paciente_consulta_fk
FOREIGN KEY (CNS)
REFERENCES Paciente (CNS)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Consulta ADD CONSTRAINT medicos_consulta_fk
FOREIGN KEY (crm)
REFERENCES Medicos (crm)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
