<template>
  <!-- スタイルを適用する場合 -->
    <!-- <div class="book-form"> -->
    <div>
      <h1>書籍情報入力フォーム</h1>
      <form @submit.prevent="handleSubmit">
        <div>
          <label for="title">タイトル:</label>
          <input type="text" id="title" v-model="book.title" required>
        </div>
        <div>
          <label for="author">作者:</label>
          <input type="text" id="author" v-model="book.author" required>
        </div>
        <div>
          <label for="genre">ジャンル:</label>
          <select id="genre" v-model="book.genre" required>
          <option value="">選択してください</option>
          <option>アクション</option>
          <option>恋愛</option>
          <option>歴史</option>
          <option>学問</option>
        </select>
        </div>
        <div>
          <label for="publisher">出版社:</label>
          <input type="text" id="publisher" v-model="book.publisher" required>
        </div>
        <div>
          <label for="publishedDate">出版日:</label>
          <input type="date" id="publishedDate" v-model="book.publishedDate" required>
        </div>
        <div>
          <label for="discontinuedDate">廃版日:</label>
          <input type="date" id="discontinuedDate" v-model="book.discontinuedDate">
        </div>
        <button type="submit">送信</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        book: {
          title: '', //タイトル
          author: '', //作者
          genre: '', //ジャンル
          publisher: '', //出版社
          publishedDate: '', //出版日
          discontinuedDate: '' //廃版日
        }
      }
    },
    methods: {
      handleSubmit() {
        console.log("フォームが送信されました:", this.book);
        // ここにフォームデータを送信する処理を追加できます。
      }
    }
  }
  </script>
  
  <style scoped>
  .book-form {
    max-width: 600px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 10px;
    box-shadow: 2px 2px 12px rgba(0,0,0,0.1);
  }
  .book-form h1 {
    text-align: center;
  }
  .book-form div {
    margin-bottom: 15px;
  }
  .book-form label {
    display: block;
    margin-bottom: 5px;
  }
  .book-form input {
    width: 100%;
    padding: 8px;
    box-sizing: border-box;
  }
  .book-form button {
    width: 100%;
    padding: 10px;
    background-color: #28a745;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  .book-form button:hover {
    background-color: #218838;
  }
  </style>
  