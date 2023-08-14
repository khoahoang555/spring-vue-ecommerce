<template>
  <v-layout class="d-flex flex-column">
    <the-header></the-header>
    <v-main>
      <router-view></router-view>
    </v-main>
    <the-footer></the-footer>
  </v-layout>
</template>

<script lang="ts">

import TheHeader from "@/components/layout/TheHeader.vue";
import TheFooter from "@/components/layout/TheFooter.vue";

export default {
  components: {TheFooter, TheHeader}
}
</script>

<style lang="scss" scoped>

</style>