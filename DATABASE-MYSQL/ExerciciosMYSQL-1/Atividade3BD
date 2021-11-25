Atividade 3
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos estudantes deste registro dessa escola.
Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos estudantes para se trabalhar com o serviço dessa escola.
Popule esta tabela com até 8 dados;
Faça um select que retorne o/as estudantes com a nota maior do que 7.
Faça um select que retorne o/as estudantes com a nota menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.

-Criação do banco de Dados
create database db_escola

--Usando o banco de dados para as querys
use db_escola

--criando a tabela
create table tb_alunos(
	Id bigint(5) auto_increment,
    	Nome varchar(20) not null,
    	Idade int(3) not null,
    	Turma int (5) not null,
    	Nota decimal (2,1) not null,
    
    
    	primary key(id)
)

-- Inserindo os valores na minha tabela.

insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Mayquel", 25, 39, 9.2);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Priscila", 20, 25,9.0);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Mariana", 24, 39, 9.8);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Gabriel", 19, 15, 5.2);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Joana", 27, 39, 7.0);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Elizabeth", 20, 39, 8.7);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Fábio", 20, 39, 2.0);
insert into tb_alunos (Nome, Idade, Turma, Nota) values ("Marcio", 21, 30, 4.1);

--Selecionando os alunos com nota maior que 7

select * from tb_alunos where Nota > 7

--Selecionando os alunos com nota menor que 7

select * from tb_alunos where Nota < 7

--Atualizando um dado da minha tabela

update tb_alunos set Nota = 8
	where id = 9
