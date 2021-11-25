Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.

--Criação do banco de Dados
create database db_ecommerce

--Usando o banco de dados para as querys
use db_ecommerce

--criando a tabela
create table tb_produtos(
	id bigint(5) auto_increment,
    	nome varchar(30) not null,
    	marca varchar(20) not null,
    	preco decimal(10,2),
    	ativo boolean,
    
    	primary key(id)
)

-- Inserindo os valores na minha tabela.

insert into tb_produtos (nome, marca, preco, ativo) values ("Celular", "Apple", 4000.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Celular", "Samsung", 2500.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Notebook", "Dell", 7000.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Aparelho de Som", "JBL", 14000.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Monitor", "Samsung", 2000.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Mousepad", "Corsair", 200.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Apoio Cadeira", "DX Racer", 120.00, true);
insert into tb_produtos (nome, marca, preco, ativo) values ("Quadro Star Wars", "Pitica", 4000.00, true);

--Selecionando os produtos com valor maior que 500

select * from tb_produtos where preco > 500;

--Selecionando os produtos com valor menor que 500

select * from tb_produtos where preco < 500

--Atualizando um dado da minha tabela

update tb_produtos set preco = 100
	where id = 8
