Atividade 5
Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

Siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos (não
esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica).

Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.

	create database db_construindo_a_nossa_vida;
     use db_construindo_a_nossa_vida;
     
-- Abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce
     
     create table tb_categoria (
		id bigint auto_increment,
        
        promocao boolean not null, 
        desconto varchar (255) not null,
        tipo_produto varchar (255) not null,
               
        primary key (id)
     );     
     select * from tb_categoria;
     
    insert into tb_categoria (promocao, desconto, tipo_produto) values (true, "10%","Materiais de Construção");
	insert into tb_categoria (promocao, desconto, tipo_produto) values (false, "0%","Ferramentas de Jardinagem"); 
	insert into tb_categoria (promocao, desconto, tipo_produto) values (true, "50%","Decoração de interiores");
	insert into tb_categoria (promocao, desconto, tipo_produto) values (false, "0%","Tintas");
    insert into tb_categoria (promocao, desconto, tipo_produto) values (true, "20%","Materiais Hidraulicos");
	insert into tb_categoria (promocao, desconto, tipo_produto) values (true, "25%","Paisagismo"); 
 
 -- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 
 -- atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia
 -- (não esqueça de criar a foreign key de tb_categoria nesta tabela).
 
     create table tb_produto (		
		id bigint auto_increment,
        
        nome varchar (255) not null,
        preco decimal (8,2) not null,
        estoque_produto int not null,
        data_validade date,
        categoria_id bigint,
        
        primary key (id),
		foreign key (categoria_id) REFERENCES tb_categoria (id)        
     );
     
     select *from tb_produto;
     
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Cimento",14.50,255,"2024-10-25",1);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Telhas",6.50,255,"2025-12-30",1);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Pá",18.90,255,"2025-10-12",2);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Quadros",2.90,255,"2024-11-25",3);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Tinta Azul",99.90,255,"2023-04-03",4);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Torneira",42,255,"2023-03-14",5);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Plantas",30.99,255,"2021-12-25",6);
	insert into tb_produto (nome, preco, estoque_produto, data_validade, categoria_id) values ("Gramado",5.90,255,"2022-10-25",6);
    
    select * from tb_produto where preco > 50;
    
    select * from tb_produto where preco between 3 and 60;
    
    select * from tb_produto where nome like "%B%";
    
	-- Faça um um select com Inner join entre  tabela categoria e produto.
    select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

    -- Faça um select onde traga todos os Produtos de uma categoria específica 
    
    select * from tb_produto where categoria_id = 1; -- produtos da categoria de material de construção
