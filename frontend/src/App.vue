<template>
  <div id="app">
    <h1>書籍情報入力フォーム</h1>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="author">作者:</label>
        <input type="text" id="author" v-model="book.author" required>
      </div>
      <div>
        <label for="title">タイトル:</label>
        <input type="text" id="title" v-model="book.title" required>
      </div>
      <div>
        <label for="publishedDate">出版日:</label>
        <input type="date" id="publishedDate" v-model="book.publishedDate" required>
      </div>
      <div>
        <label for="genre">ジャンル:</label>
        <select id="genre" v-model="book.genre" required>
          <option disabled value="">選択してください</option>
          <option>アクション</option>
          <option>恋愛</option>
          <option>歴史</option>
          <option>学問</option>
        </select>
      </div>
      <div>
        <label>出版タイプ:</label>
        <div>
          <input type="radio" id="domestic" value="0" v-model="book.publicationType" required>
          <label for="domestic">国内出版</label>
        </div>
        <div>
          <input type="radio" id="international" value="1" v-model="book.publicationType" required>
          <label for="international">国外出版</label>
        </div>
      </div>
      <button type="submit">送信</button>
    </form>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      book: {
        author: '',
        title: '',
        publishedDate: '',
        genre: '',
        publicationType: '',
      }
    };
  },
  methods: {
    handleSubmit() {
      console.log("フォームが送信されました:", this.book);
      // ここにフォームデータを送信する処理を追加できます。
    }
  }
};
</script>

<!-- <style scoped>
#app {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 10px;
  box-shadow: 2px 2px 12px rgba(0,0,0,0.1);
}
#app h1 {
  text-align: center;
}
#app div {
  margin-bottom: 15px;
}
#app label {
  display: block;
  margin-bottom: 5px;
}
#app input, #app select {
  width: 100%;
  padding: 8px;
  box-sizing: border-box;
}
#app button {
  width: 100%;
  padding: 10px;
  background-color: #28a745;
  color: #fff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}
#app button:hover {
  background-color: #218838;
}
</style> -->
