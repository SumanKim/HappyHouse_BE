create table likeapt
(
    aptno INT auto_increment,
    userid VARCHAR(16),
    address varchar(100),
    regtime timestamp DEFAULT CURRENT_TIMESTAMP,
    primary key (aptno),
    foreign key (userid) references ssafy_member(userid)
);