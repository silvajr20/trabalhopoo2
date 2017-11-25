/*
CREATE TABLE produto (codprod INTEGER NOT NULL AUTO_INCREMENT, descprod VARCHAR (50) NOT NULL, vlrprod FLOAT NOT NULL, qtdprod SMALLINT NOT NULL DEFAULT '0', PRIMARY KEY (codprod));
CREATE TABLE clientes (codcli varchar(14) NOT NULL, nomecli VARCHAR(50) NOT NULL, emailcli varchar(50) NOT NULL, telefone VARCHAR(20),    PRIMARY KEY (codcli));
CREATE TABLE pedido(nuped INTEGER NOT NULL AUTO_INCREMENT, vlrnota FLOAT NOT NULL, codcli varchar(14) NOT NULL, PRIMARY KEY (nuped), CONSTRAINT pedidofk FOREIGN KEY (codcli) REFERENCES clientes(codcli) );
CREATE TABLE itens_pedido( nuped INTEGER NOT NULL, codprod INTEGER NOT NULL, qtdprod SMALLINT NOT NULL, CONSTRAINT itens_pedidopk PRIMARY KEY (nuped, codprod, qtdprod), CONSTRAINT ITEFK1 FOREIGN KEY (nuped) REFERENCES pedido(nuped), CONSTRAINT ITEFK2 FOREIGN KEY (codprod) REFERENCES produto(codprod)  );
CREATE TABLE fecha_pedido(nuped INTEGER NOT NULL,vlrnota FLOAT,vlrpago FLOAT,vlrtroco FLOAT,CONSTRAINT FECHAPK PRIMARY KEY (nuped),CONSTRAINT FECHAFK FOREIGN KEY (nuped) REFERENCES pedido(nuped));
*/




CREATE TABLE public.clientes
(
  cpfcnpj character varying(30) NOT NULL,
  nomecli character varying(300),
  email character varying(100),
  telefone character varying(50),
  CONSTRAINT clientes_pkey PRIMARY KEY (cpfcnpj)
);

CREATE TABLE public.itens_pedido
(
  numPed integer NOT NULL,
  numProd integer,
  qtdProd integer, 
  CONSTRAINT itens_pedido_pkey PRIMARY KEY (numPed)
);

CREATE TABLE public.pedido
(
  numPed integer NOT NULL, 
  vlrnota real,
  codcli integer,
  CONSTRAINT pedido_pkey PRIMARY KEY (numPed)
);
CREATE TABLE public.produto
(
  descprod character varying(150),
  vlrprod real,
  qtdprod integer,
  codProd integer NOT NULL (codProd),
  CONSTRAINT produto_pkey PRIMARY KEY (codProd)
);

CREATE TABLE public.users
(
  codUser integer NOT NULL DEFAULT nextval(codUser),
  nome character varying(300),
  senha character varying(50),
  tipo character varying(20),
  CONSTRAINT users_pkey PRIMARY KEY (codUser)
);




