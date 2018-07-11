<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>4eachblog　掲示板</title>
    <link rel="stylesheet" type="text/css" hre="style.css">
    </head>
    
    <body>
    
        
        <?php
        
        mb_internal_encoding("utf8");
        $pdo = newPDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
        
        $stmt = $pdo->query("select * from 4each_keijiban");
        
        ?>
        
        <img src="4eachblog_logo.jpg">
         <header>
        <li>
            <ul>トップ</ul>
            <ul>プロフィール</ul>
            <ul>4eachについて</ul>
            <ul>登録フォーム</ul>
            <ul>問い合わせ</ul>
            <ul><その他/ul>
                </li>
                
                </header>
            <h2>プログラミングに役立つ掲示板</h2>
            
            
    
    </body>
</html>
