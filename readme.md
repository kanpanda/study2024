# 簡単な書籍管理アプリ開発を作ってみよう


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
### 原因
dockerとは別に、ローカルにpgAdmin4を入れていたため、競合？していた
1. docker-compose.ymlの設定を以下にする。
    ports: 
      - "5433:5432"
2. A5sqlの「データベースの追加と削除」→portsを5432にしてテスト接続
3. docker起動

###  dockerの起動方法
dockerを利用してdbの環境を構築した。
- docker desktopを起動
- 以下のコマンドを入力
```
dockerデスクトップの起動
// GUIで

docker-comopse up -d
```

###  docker停止
```
docker-compose down
```

# 起動の手順
1. dockerの起動
2. spring bootを起動
- BookappApplication.javaのrunを押す
3. vueを起動
- study2024/frontdend でnpm run devをする

# やりたいこと
- 書籍情報の一覧をフロントで表示
- 
- 

# postgresql
##　


# <script setup>
  <script setup>はVue 3.2以降で利用可能な構文です。簡潔に書けるため、推奨されることが多いです。この構文では、setupオプションの内容をそのまま書くことができます。

# コードサンプル

<script setup>
import {ref} from 'vue'
const userInput =ref('')
const count =ref(0)
const increment = () =>{
    count.value++
}
const decrement = () =>{
    count.value--    
}
</script>

<template>
        <p>{{ userInput }}</p>
        <input v-model="userInput" type="text" />
        <p>{{ count }}</p>
        <button @click="increment">Increment</button>
        <button @click="decrement">Decrement</button>
</template>
