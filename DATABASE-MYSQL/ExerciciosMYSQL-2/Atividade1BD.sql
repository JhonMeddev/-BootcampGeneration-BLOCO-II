Atividade 1
Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.

O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

siga exatamente esse passo a passo:

Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.

Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos personagem para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).

Popule esta tabela classe com até 5 dados.

Popule esta tabela personagem com até 8 dados.

Faça um select que retorne os personagens com o poder de ataque maior do que 2000.

Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.

Faça um select utilizando LIKE buscando os personagens com a letra C.

Faça um um select com Inner join entre tabela classe e personagem.

Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).
salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.


--- Criando Banco de dados :

create database db_generation_game_online;

use db_generation_game_online;

--- Criando tabelas :	

create table tb_classe(
	id_classe bigint(5) auto_increment,
    className varchar(40),
    classFunction varchar (40),
    classVantagem varchar (40),
    primary key (id_classe)
);

create table tb_personagem(
    id_personagem bigint (5) auto_increment,
    nome varchar (40),
    dano bigint (5),
    defesa bigint (5),
    cura bigint (5),
    especial varchar (40),
    id_class bigint(5) auto_increment,
    primary key (id_personagem),
    foreign key (id_class) references tb_classe (id_classe)
);

--- Populando tabela de classe :

INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("mago", "atacar", "Auto Nivel de dano em grande escala");
INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("guerreiro", "atacar", "Auto Nivel de dano");
INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("guardião", "defesa", "Auto Nivel de defesa em grande escala");
INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("arqueiro", "atacar", "Auto Nivel de dano em grande escala");
INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("assassino", "dano", "ataque furtivo");
INSERT INTO tb_classe(className, ClassFunction, ClassVantagem) VALUES ("curandeira", "curar", "Auto Nivel de cura em grande escala");

--- populando tabela de personagem : 

INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Mago", 2500, 500, 50, "Chuva de raio");
INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Guerreiro", 2000, 1000, 0, "Modo Beserker");
INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Guardião", 500, 3000, 0, "Escudo protetor e regenração de vida");
INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Arqueiro", 2500, 0, 0, "Chuva de flecha");
INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Assassino", 2500, 0, 0, "Modo Furtivo");
INSERT INTO tb_personagem(nome, dano, defesa, cura, especial) VALUES ("Curandeira", 50, 1000, 2500, "Curar toda equipe");

--- Faça um select que retorne os personagens com o poder de ataque maior do que 2000 :

select * from tb_personagem where dano > 2000;

--- Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000 :

select * from tb_personagem where defesa between 1000 and 2000;

--- Faça um select utilizando LIKE buscando os personagens com a letra C. :

select * from tb_personagem where nome like "%C%";

--- Faça um um select com Inner join entre tabela classe e personagem :

select * from tb_personagem inner join  tb_classe on tb_classe.id_classe = tb_personagem.id_class;

select tb_personagem.nome,  tb_classe.className, tb_classe.classFunction, tb_personagem.dano, tb_personagem.defesa
from tb_personagem inner join  tb_classe 
on tb_classe.id_classe = tb_personagem.id_class;

--- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).

select * from tb_personagem where nome like "%Arq%";












