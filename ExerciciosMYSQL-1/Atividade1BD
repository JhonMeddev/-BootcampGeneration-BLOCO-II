Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.

-- Criar Banco de dados
create database db_rh;

 -- Usar banco de dados para execultar as Querys abaixo
use db_rh;
 
 
 -- Criar Tabela
 CREATE TABLE tb_funcionarios(
    id bigint(5) AUTO_INCREMENT, -- Definindo como auto Incremente 1, 2, 3 ...
    nome varchar(20) not null,
    nascimento date not null,
    salario decimal(10,2),
    funcao varchar(20),
    ativo boolean,
    PRIMARY KEY (id) -- Definir coluna id como chave primária
);

-- Inserir valores na tabela Marcas

INSERT INTO tb_funcionarios (nome, nascimento, salario, funcao, ativo) VALUES ("Jhonatan M.", '1994-08-05',5000,"Desenvolvedor", true);
INSERT INTO tb_funcionarios (nome, nascimento, salario, funcao, ativo) VALUES ("Jakeline D.", '2000-08-05',3000,"Design", true);
INSERT INTO tb_funcionarios (nome, nascimento, salario, funcao, ativo) VALUES ("João P.", '1930-07-04',5000,"Desenvolvedor", true);
INSERT INTO tb_funcionarios (nome, nascimento, salario, funcao, ativo) VALUES ("Aline S.", '1999-08-05',1500,"Atendente", true);
INSERT INTO tb_funcionarios (nome, nascimento, salario, funcao, ativo) VALUES ("Pedro F.", '1997-08-05',3000,"Desenvolvedor Jr.", true);

-- Selecionando funcionarios de acordo com salario

select * from tb_funcionarios where salario > 2000.00;
select * from tb_funcionarios where salario < 2000.00;

-- query de atualização de algum dado

UPDATE tb_funcionarios set salario=7000 where id=1;
