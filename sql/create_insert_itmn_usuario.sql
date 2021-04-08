USE projeto;

CREATE TABLE itmn_usuario (
  id int NOT NULL AUTO_INCREMENT,
  email varchar(100) NOT NULL,
  linkfoto varchar(200) DEFAULT NULL,
  nome varchar(100) NOT NULL,
  racf varchar(7) NOT NULL,
  senha varchar(30) DEFAULT NULL,
  constraint pk_usuario PRIMARY KEY (id),
  constraint UNIQUE KEY UK_email_usuario (email),
  constraint UNIQUE KEY UK_racf_usuario (racf)
);

insert into itmn_usuario values(
null,
'emerson@paduan.pro.br',
'https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg',
'Emerson Paduan',
'1234567',
'1234'
);