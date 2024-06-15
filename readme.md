# 研修キャッチアップのためにアプリ開発を行う


# frontend
## 環境構築
- vueを使用してfrontendを構築した
- 設定項目
√ Project name: ... frontend
√ Add TypeScript? ... No / Yes
√ Add JSX Support? ... No / Yes
√ Add Vue Router for Single Page Application development? ... No / Yes
√ Add Pinia for state management? ... No / Yes
√ Add Vitest for Unit Testing? ... No / Yes
√ Add an End-to-End Testing Solution? » No
√ Add ESLint for code quality? ... No / Yes
√ Add Vue DevTools 7 extension for debugging? (experimental) ... No / Yes

## 起動
```
npm run dev
```


# backend
springbootを使用してbackendを開発する

# docker
dockerでpostgresqlにつなぐときにエラーが発生した
## 原因
dockerとは別に、ローカルにpgAdmin4を入れていたため、競合？していた
1. docker-compose.ymlの設定を以下にする。
    ports: 
      - "5433:5432"
2. A5sqlの「データベースの追加と削除」→portsを5432にしてテスト接続
3. docker起動

##  docker起動
dockerを利用してdbの環境を構築した。


```
dockerデスクトップの起動
// GUIで

docker-comopse up -d
```

##  docker停止
```
docker-compose down
```

# 起動の手順
- dockerの起動
- spring bootを起動
- vueを起動

# やりたいこと
- 書籍情報の一覧をフロントで表示
- 
- 

# postgresql
##　
