import './assets/main.scss'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import vuetify from '@/plugins/vuetify';

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(vuetify)
// app.use(components)

app.mount('#app')
