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
<!--      <v-responsive-->
<!--        max-width="614"-->
<!--        max-height="44"-->
<!--      >-->
<!--        <v-text-field-->
<!--          placeholder="Search for restaurant"-->
<!--          variant="outlined"-->
<!--          density="compact"-->
<!--        >-->
<!--          <template v-slot:prepend-inner>-->
<!--            <v-btn size="44" class="mx-2">-->
<!--              <v-icon size="16" icon="mdi-target" color="#939393" />-->
<!--            </v-btn>-->
<!--          </template>-->
<!--          <template v-slot:append-inner>-->
<!--            <v-btn size="44">-->
<!--              <v-icon size="16" icon="mdi-magnify" color="#939393" />-->
<!--            </v-btn>-->
<!--          </template>-->
<!--        </v-text-field>-->
<!--      </v-responsive>-->
      <v-sheet width="912" height="44" border rounded class="d-flex align-center">
        <div class="d-flex align-center ml-5">
          <v-icon size="16" icon="mdi-map-marker" color="#939393" class="mr-2"></v-icon>
          <p style="color: #828282; margin-top: 1px;">New York</p>
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
      </v-sheet>
    </v-container>
  </v-app-bar>
</template>

<script lang="ts">
export default {

}
</script>

<style lang="scss" scoped>
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
//:deep(.v-input) {
//  --v-input-chips-margin-top: 4px !important;
//}
//:deep(.v-input--density-compact) {
//  --v-input-chips-margin-bottom: 0px !important;
//}
</style>
