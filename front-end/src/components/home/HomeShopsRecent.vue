<template>
  <h1>Ưu đãi FoodShop</h1>
  <v-row class="mt-1">
    <v-col
        v-for="n in 4"
        :key="n+1"
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
          href="#"
          rounded="lg"
          :elevation="isHovering ? 6 : 2"
        >
          <v-img
              class="align-center text-white text-center"
              height="150"
              src="/assets/images/categories/16.bbc24cb.jpg"
              cover
          >
          </v-img>
          <v-card-item>
            <v-card-title>Cafe Badilido</v-card-title>
<!--            <v-card-subtitle>-->
<!--              <span class="me-1">146/3 Nguyễn Văn Trỗi, P.8, Q.Tân Bình, TP.HCM</span>-->
<!--            </v-card-subtitle>-->
            <v-card-subtitle>
              <span class="me-1">Local Favorite</span>

              <v-icon
                  color="error"
                  icon="mdi-fire-circle"
                  size="small"
              ></v-icon>
            </v-card-subtitle>
          </v-card-item>
<!--          <v-divider></v-divider>-->
<!--          <v-card-item>-->
<!--            <template v-slot:subtitle>-->
<!--              <v-icon-->
<!--                  icon="mdi-tag"-->
<!--                  size="18"-->
<!--                  color="error"-->
<!--                  class="me-1 pb-1"-->
<!--              ></v-icon>-->
<!--              <b style="color: var(&#45;&#45;base-color-active);">Giảm giá</b>-->
<!--            </template>-->
<!--          </v-card-item>-->
          <v-card-text>
            <v-row
              align="center"
              class="mx-0"
            >
              <v-rating
                :model-value="4.5"
                color="amber"
                density="compact"
                half-increments
                readonly
                size="small"
              >
              </v-rating>
              <div class="text-grey ms-4">
                4.5 (413)
              </div>
            </v-row>
<!--            <div class="my-4 text-subtitle-1">-->
<!--              $ • Italian, Cafe-->
<!--            </div>-->
            <div class="mt-4">
              146/3 Nguyễn Văn Trỗi, P.8, Q.Tân Bình, TP.HCM
            </div>
<!--            <v-card-subtitle align="center" class="mx-0">-->
<!--              <span class="me-1">146/3 Nguyễn Văn Trỗi, P.8, Q.Tân Bình, TP.HCM</span>-->
<!--            </v-card-subtitle>-->
          </v-card-text>
        </v-card>
      </v-hover>
    </v-col>
  </v-row>
</template>

<script lang="ts">
export default {
  data() {
    return {
      products: []
    }
  }
}
</script>

<style lang="scss" scoped>

</style>