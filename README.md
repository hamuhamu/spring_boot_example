# spring_boot_example
Spring Bootの実装例

## 実行方法

[実行] - [Spring Bootアプリケーション]

http://localhost:8080/

Hello Wrodが表示されるはず

## Hot Reloading

アプリを起動したまま、コード修正時に自動再起動で変更を反映させる
[Spring Dev Tool]

## Lombok

http://snona.hatenablog.com/entry/2016/02/18/024239


## static import

static修飾子の付いたフィールドやメソッドだけをインポートできる

## JUnitのテスト

「Run AS」 -> 「JUnit Test」  
テスト実行をショートカット登録しておくと便利  
「Spring Tool Suite」 -> 「環境設定」 -> 「General」 -> 「keys」  

## ラッパークラス型よりプリミティブ型を使おう

### ラッパークラス型

Integer, Double, Boolean  
==で同値比較ができない  
.Equalメソッドを使用する必要がある  
nullの代入ができてしまう  

### プリミティブ型

int, double, boolean  
==で同値比較ができる  
nullの代入ができない  

### 理由

ラッパークラスは、オブジェクトの生成や破棄にコストがかかる。  
ラッパークラスでもプリミティブ型でも実現可能であれば、プリミティブ型を使う。  

## オートボクシングを使用しない

プリミティブ型からラッパークラス型のオブジェクトを作ることをボクシング(boxing)という。  
プリミティブ型から対応するラッパークラス型へボクシングする機能をオートボクシングという。  
ラッパークラス型から対応するプリミティブ型へボクシングする機能をオートアンボクシングという。  

オートボクシング / オートアンボクシングを使ってしまうと非常にコードがわかりにくくコンパイラでチェックできない。  
さらに、forなどの繰り返し処理でオートボクシングされると性能が劣化する。  

[「原罪」(Javaは、プリミティブがないほうがよかったか？)](https://www.infoq.com/jp/news/2009/06/java-without-primitives)  


