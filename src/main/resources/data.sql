insert into `users`
(`id`,`username`,`password`,`email`)
values (1, 'han','1234','ham@burger.com');

--------------------------------

insert into `category`
(`category_id`,`category_name`,`site_user_id` )
values (1,'쇼핑몰', 1);

insert into `category`
(`category_id`,`category_name`,`site_user_id` )
values (2,'그림', 1);

--------------------------------


insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (1, 'TOP', 1, 1);

insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (2, 'BOTTOM', 1, 1);

insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (3, 'ACC', 1, 1);


--------------------------------


insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (4, '풍경', 2, 1);

insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (5, '인물', 2, 1);


--------------------------------


insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (1, 'https://nomelet.co.kr/', '질 좋은 기본템', '노멜렛', 1, 1);

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (2, 'https://reetkeem.com/', '트렌디~~', '릿킴', 1, 1);

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (5, 'https://0milewear.co.kr/', '후디가 귀엽다', '0milewear', 1, 1);

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (7, 'https://aubenine.com/', '어른같은 옷들 많음', '오브나인', 1, 1);


--------------------------------


insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (3, 'https://addoff.co.kr/', '바지 맛집', '애드오프', 2, 1);

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (4, 'http://www.juunj.com/', '부자되면.. 언젠가..', '준지', 2, 1);

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (6, 'https://prts.kr/', '캠퍼스룩 ^_^', '포트레이트 서울', 2, 1);


--------------------------------

insert into `links`
(`link_id`, `link_address`, `link_content`, `link_title`, `link_collection_id`, `site_user_id`)
values (8, 'https://honsby.com/', '신발은 여기서', '혼츠비', 3, 1);





--------------------------------
--------------------------------
--------------------------------
--------------------------------


insert into `users`
(`id`,`username`,`password`,`email`)
values (2, 'whwl','1234','imyour@joji.com');


--------------------------------


insert into `category`
(`category_id`,`category_name`,`site_user_id` )
values (3,'영화', 2);

insert into `category`
(`category_id`,`category_name`,`site_user_id` )
values (4,'게임', 2);


--------------------------------


insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (6, 'ott', 3, 2);

insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (7, '리뷰', 3, 2);


--------------------------------

insert into `link_collection`
(`link_collection_id`, `link_collection_name`, `category_id`, `site_user_id`)
values (8, '카트라이더 드리프트', 4, 2);