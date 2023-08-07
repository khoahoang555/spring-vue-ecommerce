<template>
  <v-layout>
    <the-header></the-header>
    <v-main>
      <router-view></router-view>
    </v-main>
    <v-footer></v-footer>
  </v-layout>
</template>

<script lang="ts">


import TheHeader from "@/components/layout/TheHeader.vue";

export default {
  components: {TheHeader}
}
</script>

<style lang="scss" scoped>

</style>