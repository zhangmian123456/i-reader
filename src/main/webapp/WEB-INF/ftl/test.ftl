<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Test</title>
    <!--引入WangEditor-->
    <script src="/resources/wangEditor.min.js"></script>
</head>
<body>
    测试页面
    <div>
        <button id="btnRead">读取内容</button>
        <button id="btnWrite">写入内容</button>
    </div>
    <div id="divEditor" style="width: 800px;height: 600px">
    <script>
        var E = window.wangEditor;
        var editor = new E("#divEditor"); //完成富文本编辑器初始化
        editor.create(); //创建富文本编辑器, 显示在页面上
        document.getElementById("btnRead").onclick = function () {
            var content = editor.txt.html(); //获取编辑器现有的html内容
            alert(content);
        };

        document.getElementById("btnWrite").onclick = function () {
            var content = "<li style='color:red'>我是<b>新内容</b></li>";
            editor.txt.html(content);
        }
    </script>
</div>
</body>
</html>