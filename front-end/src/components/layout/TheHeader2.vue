<template>
  <v-app-bar height="64">
    <v-container class="d-flex align-center">
      <div class="mr-10">
        <v-img
            width="48"
            height="48"
            src="/assets/images/logo.4a3964e.png"
        />
      </div>
      <v-sheet id="search-field" max-width="912" width="912" height="44" border rounded class="d-flex align-center">
        <div class="d-flex align-center ml-5">
          <v-icon size="16" icon="mdi-map-marker" color="#939393" class="mr-2"></v-icon>
          <p style="color: #939393; margin-top: 1px;">New York</p>
        </div>
        <v-btn size="44" class="mx-2" rounded="0">
          <v-icon size="16" icon="mdi-crosshairs-gps" color="#939393" />
        </v-btn>
        <v-text-field
            placeholder="Search for restaurant"
            variant="plain"
            single-line
            hide-details
            density="compact"
        />
        <v-btn size="44" rounded="0">
          <v-icon size="16" icon="mdi-magnify" color="#939393" />
        </v-btn>
      </v-sheet>
      <div class="ml-auto d-flex align-center">
        <v-btn prepend-icon="mdi-account-circle-outline">
          <template v-slot:prepend>
            <v-icon size="24"></v-icon>
          </template>
          ACCOUNT
        </v-btn>
        <v-btn prepend-icon="mdi-cart-outline">
          <template v-slot:prepend>
            <v-icon size="24"></v-icon>
          </template>
          (8)
        </v-btn>
        <v-app-bar-nav-icon></v-app-bar-nav-icon>
      </div>
    </v-container>
  </v-app-bar>
</template>

<script lang="ts">
export default {

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
  color: #939393 !important;
  opacity: 1 !important;
}
@media only screen and (max-width: 800px) {
  #search-field {
    display: none !important;
  }
}
</style>
