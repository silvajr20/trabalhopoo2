CREATE TABLE produto (codprod INTEGER NOT NULL AUTO_INCREMENT, descprod VARCHAR (50) NOT NULL, vlrprod FLOAT NOT NULL, qtdprod SMALLINT NOT NULL DEFAULT '0', PRIMARY KEY (codprod));

CREATE TABLE clientes (
codcli varchar(14) NOT NULL, 
nomecli VARCHAR(50) NOT NULL, 
emailcli varchar(50) NOT NULL,
 telefone VARCHAR(20),   
 PRIMARY KEY (codcli));



CREATE TABLE pedido(nuped INTEGER NOT NULL AUTO_INCREMENT, vlrnota FLOAT NOT NULL, codcli varchar(14) NOT NULL, PRIMARY KEY (nuped), CONSTRAINT pedidofk FOREIGN KEY (codcli) REFERENCES clientes(codcli) );


CREATE TABLE itens_pedido( nuped INTEGER NOT NULL, codprod INTEGER NOT NULL, qtdprod SMALLINT NOT NULL, CONSTRAINT itens_pedidopk PRIMARY KEY (nuped, codprod, qtdprod), CONSTRAINT ITEFK1 FOREIGN KEY (nuped) REFERENCES pedido(nuped), CONSTRAINT ITEFK2 FOREIGN KEY (codprod) REFERENCES produto(codprod)  );

CREATE TABLE fecha_pedido(nuped INTEGER NOT NULL,vlrnota FLOAT,vlrpago FLOAT,vlrtroco FLOAT,CONSTRAINT FECHAPK PRIMARY KEY (nuped),CONSTRAINT FECHAFK FOREIGN KEY (nuped) REFERENCES pedido(nuped));



