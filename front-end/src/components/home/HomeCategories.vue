<template>
  <v-row>
    <v-col
        v-for="category in categories"
        :key="category.title"
        cols="12"
        lg="3"
        md="3"
        sm="6"
    >
      <v-hover v-slot:default="{ isHovering, props }">
        <v-card
            v-bind="props"
            class="mx-auto"
            max-width="w-100"
            :href="category.link"
            rounded="lg"
            :elevation="isHovering ? 6 : 2"
        >
          <v-img
              class="align-center text-white text-center"
              height="150"
              :src="category.image"
              cover
              gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)"
          >
            <v-card-title style="text-shadow: 0 2px 2px rgba(0,0,0,.8);">{{ category.title }}</v-card-title>
          </v-img>
        </v-card>
      </v-hover>
    </v-col>
  </v-row>
</template>

<script lang="ts">
export default {
  data() {
    return {
      categories: [
        {
          title: "Gần đây",
          image: "/assets/images/categories/15.15c95d2.jpg",
          link: "#"
        },
        {
          title: "Khuyến mãi",
          image: "/assets/images/categories/16.bbc24cb.jpg",
          link: "#"
        },
        {
          title: "Ưu đãi",
          image: "/assets/images/categories/17.3634737.jpg",
          link: "#"
        },
        {
          title: "Giảm giá",
          image: "/assets/images/categories/18.2a12c1e.jpg",
          link: "#"
        }
      ]
    }
  }
}
</script>

<style lang="scss" scoped>

</style>