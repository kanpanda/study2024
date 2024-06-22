<template>
  <div id="app">
    <BookForm />
    <div>
      <form @submit.prevent="submitForm">
        <label for="name">Name:</label>
        <input type="text" v-model="name" id="name" />
        <button type="submit">完了</button>
      </form>
    </div>
  </div>
</template>

<script>
import BookForm from './components/BookForm.vue';

export default {
  name: 'App',
  components: {
    BookForm
  },
  data() {
    return {
      name: ''
    }
  },
  methods: {
    submitForm() {
      console.log("フォームが送信されました:", this.name);
      // ここにフォームデータを送信する処理を追加できます
    }
  }
}
</script>
