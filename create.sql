create table conta (id number(19,0) generated as identity, nome varchar2(255 char), valor number(38,2), primary key (id));
create table produto (id number(19,0) generated as identity, data date not null, produto varchar2(255 char) not null, qtd number(10,0) not null, tipo_pg varchar2(255 char), valor number(38,2) check (valor>=0), conta_id number(19,0), primary key (id));
create table usuario (id number(19,0) generated as identity, email varchar2(255 char), nome varchar2(255 char), senha varchar2(255 char), primary key (id));
alter table produto add constraint FKkptmtmjf96ypyfuaxyu6eu55i foreign key (conta_id) references conta;
