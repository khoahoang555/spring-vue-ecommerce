<template>
  <v-navigation-drawer v-model="drawer" location="left" temporary width="320">
    <v-list>
      <v-list-item>
        <v-list-item-title class="font-weight-bold">Bảng chọn</v-list-item-title>
        <template v-slot:append>
          <v-icon icon="mdi-close" style="color: var(--base-color-icon)" @click="drawer = !drawer"/>
        </template>
      </v-list-item>
      <v-list-group value="Danh mục" active-color="var(--base-color-active)">
        <template v-slot:activator="{ props }">
          <v-list-item
              v-bind="props"
              prepend-icon="mdi-view-dashboard-variant-outline"
              title="Danh mục"
          >
          </v-list-item>
        </template>
        <v-list-item
          active-color="var(--base-color-active)"
          v-for="(item, index) in categories"
          :key="index"
          :title="item"
          :value="item"
        >
        </v-list-item>
      </v-list-group>
    </v-list>
  </v-navigation-drawer>
  <v-app-bar
      height="64"
      :elevation="isScrollOnTop ? 0 : 2"
      v-scroll.value="onScroll"
  >
    <v-container class="d-flex align-center">
      <div class="mr-10">
        <v-img
            width="48"
            height="48"
            src="/assets/images/logo.4a3964e.png"
        />
      </div>
      <v-sheet id="search-field" max-width="600" width="600" height="44" border rounded class="d-flex align-center">
        <div class="d-flex align-center ml-5">
          <v-icon size="16" icon="mdi-map-marker" style="color: var(--base-color-icon)" class="mr-2"></v-icon>
          <p style="color: var(--base-color-icon); margin-top: 1px;">TP.HCM</p>
        </div>
        <v-btn size="44" class="mx-2" rounded="0">
          <v-icon size="16" icon="mdi-crosshairs-gps" style="color: var(--base-color-icon)"/>
        </v-btn>
        <v-text-field
            placeholder="Tìm cửa hàng, món ăn..."
            variant="plain"
            single-line
            hide-details
            density="compact"
        />
        <v-btn size="44" rounded="0">
          <v-icon size="16" icon="mdi-magnify" style="color: var(--base-color-icon)"/>
        </v-btn>
      </v-sheet>
      <div class="ml-auto d-flex align-center">
        <v-btn prepend-icon="mdi-account-circle-outline">
          <template v-slot:prepend>
            <v-icon size="24"></v-icon>
          </template>
          Tài khoản
        </v-btn>
        <v-btn prepend-icon="mdi-cart-outline">
          <template v-slot:prepend>
            <v-icon size="24"></v-icon>
          </template>
          (8)
        </v-btn>
        <v-app-bar-nav-icon
            @click="drawer = !drawer"
        ></v-app-bar-nav-icon>
      </div>
    </v-container>
  </v-app-bar>
</template>

<script lang="ts">
export default {
  data() {
    return {
      drawer: false,
      items: [
        'Demo',
        'Test'
      ],
      categories: [
          'Cơm',
          'Phở',
          'Đồ ăn nhanh',
          'Nước'
      ],
      isScrollOnTop: true
    }
  },
  methods: {
    onScroll() {
      if (window.scrollY === 0) {
        this.isScrollOnTop = true;
      } else {
        this.isScrollOnTop = false;
      }
    }
  }
}
</script>

<style lang="scss" scoped>
:deep(.v-field--appended) {
  padding-inline-end: 0px !important;
}

:deep(.v-field__input) {
  padding-top: 3px !important;
}

:deep(input::placeholder) {
  color: var(--base-color-icon) !important;
  opacity: 1 !important;
}

@media only screen and (max-width: 800px) {
  #search-field {
    display: none !important;
  }
}
</style>
