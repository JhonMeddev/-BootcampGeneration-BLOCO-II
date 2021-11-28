Atividade 3
Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra B.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.


	
-- Criando database  

	 create database db_farmacia_do_bem;
         use db_farmacia_do_bem;
     
-- habilidade de abstração e determine 3 atributos relevantes do tb_categoria
     
     create table tb_categoria (
		id bigint auto_increment,
        
        receita boolean not null,
        tipo_produto varchar (255) not null,
        idade_alvo varchar (255) not null,
        
        primary key (id)
     );     
     select * from tb_categoria;
     
    insert into tb_categoria (receita, tipo_produto, idade_alvo) values (true, "Medicamento Restrito","Adulto");
	insert into tb_categoria (receita, tipo_produto, idade_alvo) values (true, "Medicamento Restrito","Infantil");
	insert into tb_categoria (receita, tipo_produto, idade_alvo) values (false, "Cosméticos","Adulto"); 
	insert into tb_categoria (receita, tipo_produto, idade_alvo) values (false, "Cosméticos","Adulto");
	insert into tb_categoria (receita, tipo_produto, idade_alvo) values (false, "Higiene Pessoal","Adulto");
	insert into tb_categoria (receita, tipo_produto, idade_alvo) values (false, "Higiene Pessoal","Infantil");
     
 -- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 
 -- atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia
 -- (não esqueça de criar a foreign key de tb_categoria nesta tabela).
 
     create table tb_produto (		
		id bigint auto_increment,
        
        nome varchar (255) not null,
        preco decimal (8,2) not null,
        qtd_estoque int not null,
        data_validade date,
        categoria_id bigint,
        
        primary key (id),
		foreign key (categoria_id) REFERENCES tb_categoria (id)        
     );
     
     select *from tb_produto;
     
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Sibutramina",500.99,255,"2024-08-01",1);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Amoxicilina",290.99,255,"2025-11-25",1);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Dipirona",18.90,255,"2023-10-20",2);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Tinta de cabelo",29.90,255,"2021-12-01",3);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Shampoo",30.50,255,"2022-12-05",4);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Hipoglos",12.50,255,"2023-12-14",6);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Alcool em Gel",9.80,255,"2022-01-26",5);
	insert into tb_produto (nome, preco, qtd_estoque, data_validade, categoria_id) values ("Lenços",54.29,255,"2024-10-25",6);
    
    select * from tb_produto where preco > 50;
    
    select * from tb_produto where preco between 3 and 60;
    
    select * from tb_produto where nome like "%b%";
    
	-- Faça um um select com Inner join entre  tabela categoria e produto.
    select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

    select tb_produto.nome, tb_categoria.tipo_produto, tb_categoria.receita, tb_categoria.idade_alvo, tb_produto.preco
    from tb_produto inner join tb_categoria
    on tb_categoria.id = tb_produto.categoria_id;
    
    -- Faça um select onde traga todos os Produtos de uma categoria específica 
    -- (exemplo todos os produtos que são cosméticos).
    
    select * from tb_produto where categoria_id in(1,2); -- todos os produtos que são medicamentos
