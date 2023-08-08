<template>
  <v-layout>
    <the-header2></the-header2>
    <v-main>
      <router-view></router-view>
    </v-main>
    <v-footer></v-footer>
  </v-layout>
</template>

<script lang="ts">

import TheHeader2 from "@/components/layout/TheHeader2.vue";

export default {
  components: {TheHeader2}
}
</script>

<style lang="scss" scoped>

</style>