<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>国际化</title>
  <style type="text/css">
    body{
      background: url("image/back.jpg");
      background-repeat:no-repeat;
      background-position: 200px 20px;
    }
    body{
      margin: 0;
      padding: 0;
    }

    #box{
      width: 650px;
      height: 367px;
      /*border: 1px solid red;*/
      margin: 100px auto;
    }
    #text{
      width: 650px;
      height: 83px;
      border: 4px solid gray;
      background: rgba(0,0,0,0.5);
      outline: none; /**去掉边框线**/
      resize: none;/**禁止拖动**/
    }
    select{
      width: 160px;
      height:40px;
      margin: 20px;
      font-size: 18px;
      outline: none;
      padding-left: 40px; /**盒子与内容的边距 **/
    }
    .center{
      margin: 10px 0;
    }
    img{
      margin: 10px 0 -22px 10px;
    }
    a{
      text-decoration: none; /** 去掉下划线**/
      width: 60px;
      height: 38px;
      background:#99FFFF;
      display: inline-block; /*元素转换：行内快级*/
      line-height: 39px;
      text-align: center; /*居中*/
      color: #FFFFFF;
    }
    .footer{
      width: 650px;
      height:206px;
      border: 4px solid gray;
    }
  </style>
</head>
<body>
  <div id="box">
    <textarea id="text"></textarea>
    <div class="center">
      <select id="from" name="from">
        <option value="auto">智能识别</option>
        <option value="zh">中文</option>
        <option value="zh">文言文</option>
        <option value="zh">粤语</option>
        <option value="zh">英语</option>
        <option value="zh">俄语</option>
        <option value="zh">德语</option>
        <option value="zh">日语</option>
        <option value="zh">法语</option>
        <option value="zh">韩语</option>
        <option value="zh">泰语</option>
      </select>
      <!-- alt加载信息-->
      <img src="image/phone.jpg" width="130" height="45" alt="你好">
      <select id="to" name="to">
        <option value="zh">中文</option>
        <option value="zh">文言文</option>
        <option value="zh">粤语</option>
        <option value="zh">英语</option>
        <option value="zh">俄语</option>
        <option value="zh">德语</option>
        <option value="zh">日语</option>
        <option value="zh">法语</option>
        <option value="zh">韩语</option>
        <option value="zh">泰语</option>
      </select>
      <a href="#" id="btn">翻译</a>
    </div>
    <div class="footer">
      <div id="r_test"></div>
    </div>
  </div>
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script type="text/javascript">
//    $(document).keydown(function (event) {
//        if (event.keyCode==13){ //按下回车键
//            query();
//        }
//    });
      $(function () {
          $("#btn").on("click",function () {
              var test=$('#text').val(); //拿到文本里面的值
              var from=$('#from').val(); //拿到第一个下拉框
              var to=$('#to').val();  //拿到第二个下拉框
              $.ajax({
                  type:"get",//请求方式get/post
                  dataType:"json",
                  url:"trans",//请求对应的地址
                  data:{"test":test,"from":from,"to":to},//往服务器传递的参数，
                  success:function(data) {//服务器交互成功调用的回调函数，data就是服务器端传递出来的数据
                      console.log(data);
                      alert(data);
                      var jsontype=$.parseJSON(data); //转成json格式
                      var content=(jsontype.trans_result)[0].dst;
                      $('#r_test').html(content);
//
                  }
              })
          });
      });
  </script>
</body>
</html>
