// Deploying this on aws Elastic Beanstack with Github for this folder

const express1= require("express");
const bodyparser1=require("body-parser");

const app1= express1();

app1.use(bodyparser1.urlencoded({extended: true}));

app1.get("/",function(req1,res1){
     res1.sendFile(__dirname+"/index.html");
    }
     );

const port= process.env.port || 3305;

app1.listen(port,function(){ console.log("App1 server started on port Env port or 3304");});