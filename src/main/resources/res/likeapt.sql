create table likeapt
(
    serialno varchar(30),
    userid VARCHAR(16),
    address varchar(100),
    floor varchar(10),
	price varchar(20),
    area varchar(20),
    regtime timestamp DEFAULT CURRENT_TIMESTAMP,
    primary key (serialno, userid),
    foreign key (userid) references ssafy_member(userid)
);