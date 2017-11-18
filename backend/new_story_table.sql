CREATE TABLE STORY(
  ID INT NOT NULL AUTO_INCREMENT,
  title TEXT NOT NULL,
  datet TEXT NOT NULL,
  age INT,
  photo TEXT,
  video TEXT,
  story TEXT NOT NULL,
  cancerID INT,
  category1 INT NOT NULL,
  category2 INT,
  category3 INT,
  stage INT,
  email TEXT,
  PRIMARY KEY ( ID )
);
