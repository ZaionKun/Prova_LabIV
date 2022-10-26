use anotacao;

create table med_medida(
    med_id BIGINT primary key auto_increment,
    med_data_hora datetime not null default current_timestamp,
    med_temperatura float not null,
    med_umidade float not null
);

insert into med_medida (med_data_hora, med_temperatura, med_umidade)
values ('2022-10-13 10:00', 25.4, 0.6),
       ('2022-10-13 11:00', 24.8, 0.8);