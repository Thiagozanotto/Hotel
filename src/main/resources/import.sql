insert into cargo (nome) values ("Atendente");
insert into cargo (nome) values ("Faxineiro");
insert into cargo (nome) values ("Técnico");

insert into usuario (login, senha) values ("Thiago","123");
insert into usuario (login, senha) values ("Fabricio","1234");
insert into usuario (login, senha) values ("Sergio","12345");

insert into funcionario (nome, cpf, usuario_codigo) values ("Thiago", "48730874329", 1);
insert into funcionario (nome, cpf, usuario_codigo) values ("Fabricio", "48774330829", 2);
insert into funcionario (nome, cpf, usuario_codigo) values ("Sergio", "48729874309", 3);

insert into cargo_funcionario (dt_admissao, dt_saida, cargo_codigo, funcionario_codigo) values ("2022-09-30", "2022-12-12", 1, 1);
insert into cargo_funcionario (dt_admissao, dt_saida, cargo_codigo, funcionario_codigo) values ("2021-02-01", "2022-12-10", 2, 2);
insert into cargo_funcionario (dt_admissao, dt_saida, cargo_codigo, funcionario_codigo) values ("2019-03-25", "2022-12-25", 3, 3);

insert into perfil (nome) values ("Admin");
insert into perfil (nome) values ("UserAtendente");
insert into perfil (nome) values ("UserGerente");

insert into hotel (nome_fantasia,razao_social,cnpj) values ("HotelStrata","Strata","16.698.681/0001-43");
insert into hotel (nome_fantasia,razao_social,cnpj) values ("HotelAdvanced","Advanced","98.616.681/0001-43");
insert into hotel (nome_fantasia,razao_social,cnpj) values ("HotelSulamerica","Sulamerica","81.698.616/0001-43");

insert into perfil_usuario (perfil_codigo,usuario_codigo) values (1,1);
insert into perfil_usuario (perfil_codigo,usuario_codigo) values (2,2);
insert into perfil_usuario (perfil_codigo,usuario_codigo) values (3,3);