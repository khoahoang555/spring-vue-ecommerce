<template>
  <v-container>
    <home-categories></home-categories>
    <v-divider
        class="border-opacity-25 my-4"
        thickness="2"
        color="var(--base-color-icon)"
    ></v-divider>
    <home-shops-recent></home-shops-recent>
    <p>THis is demo</p>
  </v-container>
</template>

<script lang="ts">
import HomeCategories from "@/components/home/HomeCategories.vue";
import HomeShopsRecent from "@/components/home/HomeShopsRecent.vue";

export default {
  components: {HomeShopsRecent, HomeCategories}
}
</script>

<style lang="scss" scoped>
</style>