CREATE TABLE tbl_reply(
rno NUMBER,
qno NUMBER,
replyer VARCHAR2(15) NOT NULL,
replyText VARCHAR2(300) NOT NULL,
regDay DATE DEFAULT SYSDATE,
updateDay DATE DEFAULT SYSDATE,
CONSTRAINT pk_reply_rno PRIMARY KEY(rno),
CONSTRAINT fk_qa_qno FOREIGN KEY(qno) REFERENCES tbl_qa(qno) ON DELETE CASCADE
)

CREATE TABLE tbl_reply(
rno NUMBER,
qno NUMBER,
replyer VARCHAR2(15) NOT NULL,
replyText VARCHAR2(300) NOT NULL,
regDay DATE DEFAULT SYSDATE,
updateDay DATE DEFAULT SYSDATE,
CONSTRAINT pk_reply_rno PRIMARY KEY(rno),
CONSTRAINT fk_qa_qno FOREIGN KEY(qno) REFERENCES tbl_qa(qno)
)


drop table tbl_reply CASCADE CONSTRAINTS PURGE;

drop table tbl_reply CASCADE CONSTRAINTS
CREATE SEQUENCE seq_reply_rno

SELECT*FROM tbl_reply

SELECT * FROM COLS WHERE TABLE_NAME = "TBL_BOARD";