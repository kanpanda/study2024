<template>
    <div>
      <form @submit.prevent="submitForm">
        <label for="name">Name:</label>
        <input type="text" v-model="name" id="name" />
        <button type="submit">Submit</button>
      </form>
    </div>
  </template>
  
  
  <script>
  import axios from 'axios'
  
  export default {
    data() {
      return {
        name: ''
      }
    },
    methods: {
      async submitForm() {
        try {
          const response = await axios.post('http://localhost:8080/api/submit', {
            name: this.name
          })
          console.log('Response:', response.data)
        } catch (error) {
          console.error('Error submitting form:', error)
        }
      }
    }
  }
  </script>
  
  <style scoped>
  /* スタイルを追加する場合はここに記述 */
  </style>
  