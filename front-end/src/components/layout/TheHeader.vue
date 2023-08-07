<template>
  <v-app-bar height="70">
    <v-container class="d-flex position-relative">
      <div class="margin-main-logo">
        <v-img
            width="150"
            height="30"
            src="/assets/images/shopeefoodvn.png"
        >
        </v-img>
      </div>
      <div class="main-container position-absolute d-flex">
        <div class="select-provinces">
            <v-select
                v-model="select"
                label="Select"
                :items="provinces"
                item-title="name"
                item-value="id"
                variant="outlined"
                single-line
                density="compact"
                bg-color="#f0f0f0"
                menu
            >
<!--              <template v-slot:selection="data">-->
<!--                &lt;!&ndash; HTML that describe how select should render selected items &ndash;&gt;-->
<!--                {{ data.item[0] }} - 97133 địa điểm-->
<!--              </template>-->
<!--              <template v-slot:item="data">-->
<!--                &lt;!&ndash; HTML that describe how select should render items when the select is open &ndash;&gt;-->
<!--                {{ data.name }} - {{ data.quantity }} địa điểm-->
<!--              </template>-->
            </v-select>
        </div>
        <p>This is main container</p>
      </div>
    </v-container>
  </v-app-bar>
</template>

<script lang="ts">
export default {
  data() {
    return {
      select: {
        id: 1,
        name: 'TP.HCM',
        quantity: 9999
      },
      provinces: [
        {
          id: 1,
          name: 'TP.HCM',
          quantity: 9999
        }
      ]
    }
  }
}
</script>

<style scoped>
.margin-main-logo {
  margin-left: 50px;
}

.position-relative {
  position: relative;
}

.position-absolute {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
}

:deep(.v-select__selection-text) {
  font-size: 14px;
}
</style>