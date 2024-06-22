<template>
  <div id="app">
    <h1>書籍情報入力フォーム</h1>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="author">作者:</label>
        <input type="text" id="author" v-model="formData.author" required>
      </div>
      <div>
        <label for="title">タイトル:</label>
        <input type="text" id="title" v-model="formData.title" required>
      </div>
      <button type="submit">送信</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'App',
  data() {
    return {
      formData: {
        author: '',
        title: ''
      }
    };
  },
  methods: {
    async handleSubmit() {
      const{ author, title} = this.formData;
      
      try{
        const response = await axios.post('http://localhost:8080/api/submit', {
          author: author,
          title: title
        });
        console.log('Server response:', response.data);
        // 成功したらフォームをリセットする
        this.formData.author ='';
        this.formData.title = '';
        }catch(error){
        console.error('Error submitting data:', error);
        alert('警告:An error occurred while submitting the form. Please try again.');
      };
    }
  }
};
</script>