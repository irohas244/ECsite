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
        $pdo = newPDO("mysql:dbname=lesson01;host=localhost;","root","");
        
        $stmt = $pdo->query("select * from 4each_keijiban");
        
        while($row = $stmt->fetch()){
            echo $row['handlename'];
            echo $row['title'];
            echo $row['comments'];
        }
        ?>
    
    </body>
</html>