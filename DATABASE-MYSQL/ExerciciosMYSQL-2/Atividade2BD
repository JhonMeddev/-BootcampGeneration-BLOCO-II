Atividade 2
Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo os Produtos com valor entre 29 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.

create database db_pizzaria_legal;

use db_pizzaria_legal;

-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes
-- do tb_categoria para se trabalhar com o serviço dessa pizzaria.

create table tb_categoria (
    id bigint auto_increment,
    categorias varchar (255) not null,
    tipo varchar (255) not null,
    combo varchar (255) not null,
    ativo boolean not null,
    
    primary key (id)		
    );
    select * from tb_categoria;
    
    insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgada","Combo",true);
	insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgada","Combo",true);
    insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgada","Combo",false);
	insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgado","Combo",false);
    insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgado","Combo",true);
    insert into tb_categoria (categorias, tipo, combo, ativo) values ("Pizza","Salgado","Combo",true);
    
    -- Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine
    -- 5 atributos relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça
    -- de criar a foreign key de tb_categoria nesta tabela).
    
	create table tb_pizza(
			id bigint auto_increment,
		    sabor varchar (255) not null,
            tamanho varchar (255) not null,
            valor decimal (8,2) not null,
            recheio_borda varchar (255) not null,
            categoria_id bigint,
            
            primary key (id),
            FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)           
    );
    
    select * from tb_pizza;
    
    insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Calabresa","Grande",29.90,"Com Recheio",1);
	insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Mussarela","Grande",29.90,"Sem Recheio",2);
	insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Prestígio","Grande",49.90,"Com Recheio",3);
	insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Chocolate","Grande",49.90,"Sem Recheio",4);
	insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Vegana","Grande",59.90,"Sem Recheio",5);
	insert into tb_pizza (sabor, tamanho, valor, recheio_borda, categoria_id) values ("Palmito","Grande",59.90,"Com Recheio",6);
    
    select * from tb_pizza where valor > 45;
    
    select * from tb_pizza where valor between 29 and 60;
    
    select * from tb_pizza where sabor like "%C%";
    
    -- Faça um um select com Inner join entre  tabela categoria e pizza.
    
	select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
    
    select tb_categoria.categorias, tb_pizza.tamanho, tb_pizza.sabor, tb_pizza.recheio_borda, tb_pizza.valor
    from tb_pizza inner join tb_categoria
    on tb_categoria.id = tb_pizza.categoria_id;
    
    -- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os 
    -- produtos que são pizza doce).
    
    select * from tb_pizza where categoria_id in(3,4);
