CREATE TABLE "HALLTABLE"

(    
   "H_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
   "H_NAME" VARCHAR(100),     
   "H_ISDELETED" BOOLEAN default false
);



CREATE TABLE "BOOKEDTICKETSTABLE" (
  "BT_ID" int NOT NULL  primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  "BT_UID" varchar(200) NOT NULL,
  "BT_TOTALPRICE" double NOT NULL
);



CREATE TABLE "MOVIESTABLE" (
  "M_Id" int NOT NULL primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  "M_NAME" varchar(200) NOT NULL ,
  "M_DATE" date NOT NULL ,
  "M_TIME" varchar(200) NOT NULL ,
  "M_PRICE" double NOT NULL ,
  "M_TID" int NOT NULL ,
  "M_HID" int NOT NULL ,
  "M_IMAGEPATH" varchar(2000) DEFAULT NULL,
  "M_IsDELETED" boolean DEFAULT false
);




CREATE TABLE "PAYMENTDETAILTABLE" (
  "P_ID" int NOT NULL primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  "P_BTID" int NOT NULL,
  "P_CARDHOLDERNAME" varchar(200) DEFAULT NULL,
  "P_CCVNUMBER" varchar(5) DEFAULT NULL ,
  "P_CARDNUMBER" varchar(100) DEFAULT NULL,
  "P_PAYMENTMETHOD" varchar(200) NOT NULL
);





CREATE TABLE "TICKETTYPETABLE" (
  "T_ID" int NOT NULL primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  "T_NAME" varchar(100) NOT NULL,
  "T_ISDELETED" BOOLEAN DEFAULT false
);



INSERT INTO "TICKETTYPETABLE" ( t_name, T_IsDeleted) VALUES
( 'Diamond', false),
( 'Silver', false);




CREATE TABLE "USERSTABLE" (
  "U_EMAIL" varchar(300) NOT NULL primary key,
  "U_PASSWORD" varchar(300) NOT NULL ,
  "U_FIRSTNAME" varchar(300) NOT NULL,
  "U_LASTNAME" varchar(300) NOT NULL,
  "U_ADDRESS" varchar(500) NOT NULL ,
  "U_USERTYPE" varchar(100) NOT NULL
);


INSERT INTO USERSTABLE (U_Email, U_Password, U_FirstName, U_LastName, U_Address, U_UserType) VALUES
('admin1@admin.com', 'admin1', 'Akbar', 'Ahmad', 'Street 214, Madinah', 'ADMIN'),
('admin@admin.com', 'admin', 'Ahmad', 'Ali', 'Street 214, Riyadh', 'ADMIN');



CREATE TABLE "USERTICKETSEATTABLE" (
  "UTS_ID" int NOT NULL primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  "UTS_BID" int NOT NULL  ,
  "UTS_MID" int NOT NULL  ,
  "UTS_SEATNUMBER" int  NOT NULL
);


