use ssafyweb;
insert into board(userid, subject, content) 
values('ssafy', 'Vue Axios 연동', 'Vue를 이용한 HTTP 통신'), 
      ('ssafy', 'Vue를 배워봅시다', 'Vue와 Spring을 연동하자~'),
      ('admin', '뷰와 스프링부트를 이용한 실전 프로젝트', '프로젝트를 직접만드는 내용.'),
      ('ssafy', '프론트엔드 프레임워크', 'Vue는 프론트엔드의 인기있는 프레임워크 입니다.');
      
insert into comment values(1,1,'ssafy','첫번째 댓글!',now());
insert into comment values(2,1,'tlgus31','두번째 댓글!',now());
insert into comment values(3,2,'tlgus31','첫번째 댓글!',now());
insert into comment values(4,2,'kimsm0922','두번째 댓글!',now());

insert into ssafy_member values('admin',관리자,'admin','admin@ssafy.com!',now());
insert into ssafy_member values('ssafy',싸피,'ssafy','ssafy@ssafy.com!',now());
insert into ssafy_member values('tlgus31',강시현,'tlgus31','tlgus31@ssafy.com!',now());
insert into ssafy_member values('kimsm0922',김수만,'kimsm0922','kimsm0922@ssafy.com!',now());