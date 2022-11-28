use ssafyweb;
create table comment 
(
    commentno INT auto_increment,
    articleno INT,
    userid VARCHAR(16),
    content varchar(300),
    regtime timestamp,
    primary key (commentno),
    foreign key (userid) references ssafy_member(userid),
    foreign key (articleno) references board(articleno)
);

insert into comment values(1,1,'ssafy','첫번째 댓글!',now());
select * from comment;