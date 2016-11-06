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

## プロジェクト独自のビジネス例外はExceptionクラスから継承すること

ThrowableやErrorなどから、継承してしまうとエラーなのか例外なのか区別できなくなってしまう。  

例外体系  
```
Throwable
|
|-Error
|-Exception
  |- BusinessException
```

## assertThat

assertThatはJUnit4から採用された。  
これまでのassertHoge系は、テスト失敗時のエラーメッセージが直感的ではないため、わかりにくかった。  
テストの情報量が足りない。  

そのため、assertThatではMatcherを使用してわかりやすいエラーメッセージを提供できるインターフェースになった。  
RubyのRSpecのようなBDDに近い記法をすることで、エラーメッセージを増やした。  
ただし、その代償としてテストコードを書くために覚えなければいけないメソッドが増え初学者が扱うにはハードルが高い。  
誤った使い方をしてしまうこともよくある。  
熟練して扱うまで時間がかかる。  

これに対し、そもそもassertの情報量が多いほうがいいのではないかと考え始めた人たちがいる。  

* Groovy
* pytest
* power-assert

個人的にassertThatは、扱うのが難しいのでassertHoge系を使うだけでいいと思う。  

[assertThat()が必要とされた理由](http://blog.kengo-toda.jp/entry/2015/08/16/224841)  
[新しいテストライブラリのご提案 #tng10 @t_wada](https://www.youtube.com/watch?v=aDoQxqO_6rI)  

## Optional

戻り値がnullのメソッドを扱う場合、スマートに記述できる。  
そもそも、nullを返さない設計をしたい。  
使用しているライブラリがnullを帰す場合に使うと良さそう。  

[Java 8 "Optional" ～ これからのnullとの付き合い方 ～](http://qiita.com/shindooo/items/815d651a72f568112910)  
[Optionalの取り扱いかた](http://irof.hateblo.jp/entry/2015/05/05/071450)  
