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
      <v-responsive
        max-width="614"
        max-height="44"
      >
        <v-text-field
          placeholder="Search for restaurant"
          variant="outlined"
          density="compact"
        >
          <template v-slot:prepend-inner>
            <v-btn size="44" class="mx-2">
              <v-icon icon="mdi-target" color="#707070"></v-icon>
            </v-btn>
          </template>
          <template v-slot:append-inner>
            <v-btn size="44">
              <v-icon icon="mdi-magnify"></v-icon>
            </v-btn>
          </template>
        </v-text-field>
      </v-responsive>
    </v-container>
  </v-app-bar>
</template>

<script lang="ts">
export default {

}
</script>

<style>
/*.v-text-field .v-input__control .v-input__slot {*/
/*  min-height: auto !important;*/
/*  display: flex !important;*/
/*  align-items: center !important;*/
/*}*/

/*//:deep(.v-text-field) {*/
/*//  min-height: 41px !important;*/
/*//}*/
/*//*/
/*//:deep(.v-input__control) {*/
/*//  min-height: 41px !important;*/
/*//}*/
/*//*/
/*//:deep(.v-input__slot) {*/
/*//  min-height: 41px !important;*/
/*//}*/
:deep(.v-field--appended) {
  padding-inline-end: 0px !important;
}
</style>
