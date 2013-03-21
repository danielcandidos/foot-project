

create table if not exists jogador
(id int auto_increment not null primary key,
nome varchar (30) not null,
nome_c varchar (60) not null,
data_n varchar (12) not null,
altura float(6) not null,
peso float (6) not null,
ultimo_clube varchar (40),
clube_atual varchar (40),
nacionalidade_jogador varchar(25),
imagem_jogador varchar(30));

