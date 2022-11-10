use anotacao;

create table tra_trabalho(
    tra_id BIGINT primary key auto_increment,
    tra_titulo varchar(50) not null unique,
    tra_conteudo  varchar(200),
    tra_nota int
);

insert into tra_trabalho (tra_titulo, tra_conteudo, tra_nota)
values ('teste 1', 'Trabalho para avaliação 1', 6),
       ('teste 2', 'Trabalho para avaliação 2', 3);
