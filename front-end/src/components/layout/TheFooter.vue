<template>
  <v-footer style="background-color: var(--base-secondary-color)">
    <v-container>
      <v-row>
        <v-col class="d-flex flex-column" lg="3" md="4" sm="6" cols="12">
          <v-img
              width="48"
              height="48"
              src="/assets/images/logo.4a3964e.png"
          />
          <p class="text-left mt-5 font-weight-regular" style="color: var(--base-text-color);">
            Được xây dựng từ giữa năm 2012, Foody là cộng đồng tin cậy cho mọi người có thể tìm
            kiếm, đánh giá, bình luận các địa điểm ăn uống.
          </p>
          <div class="mt-4">
            <v-img
                style="display: inline-block; margin-right: 10px;"
                width="120"
                height="45"
                src="/assets/images/google-play.430ca54.png"
            />
            <v-img
                style="display: inline-block;"
                width="120"
                height="45"
                src="/assets/images/app-store.63e3986.png"
            />
          </div>
        </v-col>
        <v-col lg="3" md="4" sm="6" cols="12">
          <h2 class="mb-5">Công Ty</h2>
          <div class="d-flex flex-column footer-item-body">
            <a href="#">Giới thiệu</a>
            <a href="#">Điều khoản</a>
            <a href="#">Đăng ký quán</a>
            <a href="#">Liên hệ</a>
            <a href="#">Quy chế</a>
          </div>
        </v-col>
        <v-col lg="3" md="4" sm="6" cols="12">
          <h2 class="mb-5">Hỗ Trợ</h2>
          <div class="d-flex flex-column footer-item-body">
            <a href="#">Tư vấn</a>
            <a href="#">Chính sách đổi trả</a>
            <a href="#">Chăm sóc khách hàng</a>
            <a href="#">Mua hàng</a>
            <a href="#">Dịch vụ</a>
          </div>
        </v-col>
        <v-col lg="3" md="12" sm="6" cols="12">
          <h2 class="mb-5">Liên Hệ</h2>
          <div class="d-flex flex-column footer-item-body">
            <p>số 244 đường Cống Quỳnh, phường Phạm Ngũ Lão, Quận 1, TPHCM</p>
            <p>Email: support@shopeefood.vn</p>
            <p>Điện thoại liên hệ: 028 71096879</p>
            <div>
              <v-btn class="mr-2" size="32" style="background-color: #0f3460; color: #ffffff;" icon="mdi-facebook">
                <template v-slot:default>
                  <v-icon size="18"></v-icon>
                </template>
              </v-btn>
              <v-btn class="mr-2" style="background-color: #0f3460; color: #ffffff;" size="32" icon="mdi-twitter">
                <template v-slot:default>
                  <v-icon size="18"></v-icon>
                </template>
              </v-btn>
              <v-btn class="mr-2" style="background-color: #0f3460; color: #ffffff;" size="32" icon="mdi-instagram">
                <template v-slot:default>
                  <v-icon size="18"></v-icon>
                </template>
              </v-btn>
              <v-btn class="mr-2" style="background-color: #0f3460; color: #ffffff;" size="32" icon="mdi-youtube">
                <template v-slot:default>
                  <v-icon size="18"></v-icon>
                </template>
              </v-btn>
              <v-btn class="mr-2" style="background-color: #0f3460; color: #ffffff;" size="32" icon="mdi-google">
                <template v-slot:default>
                  <v-icon size="18"></v-icon>
                </template>
              </v-btn>
            </div>
          </div>
        </v-col>
      </v-row>
    </v-container>
  </v-footer>
</template>
<script lang="ts">
export default {}
</script>

<style lang="scss" scoped>
.footer-item-body {

  a {
    text-decoration: none;
    font-size: 16px;
    color: var(--base-text-color);
    margin-bottom: 12px;
  }

  a:hover {
    color: var(--base-color-active);
  }

  p {
    font-size: 16px;
    color: var(--base-text-color);
    margin-bottom: 12px;
  }
}
</style>