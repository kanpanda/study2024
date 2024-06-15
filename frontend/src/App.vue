
<!-- jsを書く -->
<script>
// const userName = 'aiueo'
let price = 9.9

export default {
  data() {
    return {
      userName: 'どうもども'
    };
  }
};

function increment() {
    console.log('aaa')
}

</script>


<!-- htmlを書く -->
<template>
    <h1>Title: {{ userName }}</h1>
    <button @click="increment">button</button>
</template>

<!-- CSSを書く なくてもよい -->
<style>
h1{
    color: red;
}
</style>