DROP TABLE STORY;

CREATE TABLE STORY(
  ID INT NOT NULL AUTO_INCREMENT,
  title TEXT NOT NULL,
  datet INT NOT NULL,
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

INSERT INTO STORY (title,datet,age,photo,video,story,cancerID,category1,category2,category3,stage,email)
VALUES (
  'Kirsty tells the story of her Nan, Joyces\', experience of pancreatic cancer',
  '26102017',
  '12',
  '',
  '',
  'Three months ago a very big part of me died.

My Nan, like most Nans, was a second mother to me, but so much more in my case. She was an absolute hero during my childhood, I lived with her until I was 12 with my Mum too but she worked a lot; my Nan was my biggest inspiration during early life.

My Nan’s diagnosis was a shock

She was diagnosed 16 months beforehand, with Stage 3 Pancreatic Cancer, in March 2016. The day after my Uncle’s 50th party where she partied the night away like she always did.

It was a shock when she told us, in fact she didn’t even tell me directly, my Mum did. Well she didn’t even tell us very much ever – she was a ‘let’s deal with this when we need to’ person. To me I was baffled. What is Stage 3 anyway? How many even are there?
e
She was very blasé about her inoperable cancer, so much so I almost believed that things would be OK. After self-diagnosing her diabetes a couple of years prior, and forcing the doctors to address it, there’s no doubt she had an inkling what was happening before she went to see the oncologist. My Mum said she went in so calmly and came out very determined like she had something to prove.',
  2,
  0,
  0,
  0,
  3,
  'example_1@example.com'
);

INSERT INTO STORY (title,datet,age,photo,video,story,cancerID,category1,category2,category3,stage,email)
VALUES (
  'Sara\'s story with acute lymphoblastic leukaemia',
  '12062015',
  '3',
  '',
  '',
  'His mum Sara said: "We had to drop everything to concentrate on getting Quinn better and when you have five other little children, you really need help.

"Quinn started treatment immediately and had intensive chemotherapy and steroids. He began losing his hair (the thing he was most scared of, because he thought it would hurt) and he didn\'t look like himself as the chemotherapy and steroids and everything else he had to take had a huge impact on his physical appearance. Quinn has been so strong throughout his treatment though; he\'s been amazing.
',
  5,
  0,
  0,
  0,
  1,
  'example_2@example.com'
)
