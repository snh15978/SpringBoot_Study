INSERT INTO USER(ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES(1, 'snh2413','test','성남현','snh2413@nate.com', CURRENT_TIMESTAMP());
INSERT INTO USER(ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES(2, 'namhyun2413','test','남현','snh2413@nate.com', CURRENT_TIMESTAMP());

INSERT INTO QUESTION(id, writer_id, title, contents, create_date, count_of_answer) VALUES(1, 1, 'test','테스트입니다', CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION(id, writer_id, title, contents, create_date, count_of_answer) VALUES(2, 2, 'test2','테스트입니다2', CURRENT_TIMESTAMP(), 0);