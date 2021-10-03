# spring-webflux-sample
以下両パターンの検証
- アノテーションベースでの実装（HelloController.java）
- 関数型プログラミングでの実装（HelloFunction.java）

## メモ（ざっくり調べた内容なので、もしかしたら間違っているものもあるかもしれません。。）
- Spring WebFluxのデフォルトアプリケーションサーバーはNettyである
- 戻り値にMonoとFluxを使える
- Monoはレスポンスを1つ含められる
- Fluxはレスポンスを複数含められる