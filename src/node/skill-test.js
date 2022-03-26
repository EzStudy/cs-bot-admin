Last login: Sat Mar 26 13:31:39 on ttys003
yunha@yunha-MacBookAir .ssh % ssh yunha-server
Welcome to Ubuntu 20.04.3 LTS (GNU/Linux 5.11.0-1028-oracle x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

  System information as of Sat Mar 26 05:03:32 UTC 2022

  System load:  0.0               Processes:             129
  Usage of /:   7.1% of 44.97GB   Users logged in:       1
  Memory usage: 28%               IPv4 address for ens3: 10.0.0.23
  Swap usage:   0%

 * Super-optimized for small spaces - read how we shrank the memory
   footprint of MicroK8s to make it the smallest full K8s around.

   https://ubuntu.com/blog/microk8s-memory-optimisation

23 updates can be applied immediately.
To see these additional updates run: apt list --upgradable


*** System restart required ***
Last login: Sat Mar 26 04:31:21 2022 from 220.75.193.87
ubuntu@yunha-server:~$ ls
skill-server-example
ubuntu@yunha-server:~$ cd skill-server-example/
ubuntu@yunha-server:~/skill-server-example$ ls
index.js  node_modules  package-lock.json  package.json
ubuntu@yunha-server:~/skill-server-example$ vim index.js 




















ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 
ubuntu@yunha-server:~/skill-server-example$ vim index.js 

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
                                                                                                    1,25          Top
