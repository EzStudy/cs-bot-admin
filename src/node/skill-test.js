const express = require('express');
const app = express();
const logger = require('morgan');
const bodyParser = require('body-parser');

const apiRouter = express.Router();

app.use(logger('dev', {}));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
  extended: true
}));

app.use('/api', apiRouter);

apiRouter.post('/sayHello', function(req, res) {
  const responseBody = {
    version: "2.0",
    template: {
      outputs: [
        {
          simpleText: {
            text: "hello I'm Ryan"
          }
        }
      ]
    }
  };

  res.status(200).send(responseBody);
});

apiRouter.post('/showHello', function(req, res) {
  console.log(req.body);

  const responseBody = {
    version: "2.0",
    template: {
      outputs: [
        {
          simpleImage: {
            imageUrl: "https://t1.daumcdn.net/friends/prod/category/M001_friends_ryan2.jpg",
            altText: "hello I'm Ryan"
          }
        }
      ]
    }
  };

  res.status(200).send(responseBody);
});

apiRouter.post('/categoryList', function(req,res) {
    const responseBody = {
        "contents":[
            {
                "type":"card.text",
                "cards":[
                    {
                        "description":"카테고리를 관리할 수 있습니다.",
                        "buttons":[
                            {
                                "type":"text",
                                "label":"카테고리 추가하기",
                                "action":"block",
                                "blockId":"623e9fc93639626c92ed7c63",
                                "message": "카테고리 추가하기"
                            }
                        ]
                    }
                ]
            }
        ],
        "quickReplies": [
            {
                "type": "text",
                "label": "자바",
		"action": "block",
		"blockId": "622c3d6f4076e24a6383001d",
                "message": "",
                "data": {
                }
            },
            {
                "type": "text",
                "label": "데이터베이스",
		"action": "block",
                "blockId": "622c3d6f4076e24a6383001d",
                "message": "",
                "data": {
                    "url": ""
                }
            }
        ]
    }
    res.status(200).send(responseBody);
});


app.listen(3000, function() {
  console.log('Example skill server listening on port 3000!');
});
