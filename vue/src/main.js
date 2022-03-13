import "mdb-vue-ui-kit/css/mdb.min.css";
import Vue from "vue";
import router from "./router";
import { BootstrapVue, IconsPlugin } from "bootstrap-vue";
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";
import "bootstrap/dist/js/bootstrap.min.js";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
let Bootstrap = require("bootstrap");
Vue.use(Bootstrap);
import App from "./App.vue";
// Vue.use(Bootstrap);
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
import Vuelidate from "vuelidate";
import VueSidebarMenu from "vue-sidebar-menu";
import "vue-sidebar-menu/dist/vue-sidebar-menu.css";
import "@fortawesome/fontawesome-free/css/all.css";
import "vue-material/dist/vue-material.min.css";
import "mdbvue/lib/css/mdb.min.css";
import Vuetify from "vuetify";

import "@andresouzaabreu/vue-data-table/dist/DataTable.css";
import VueScreen from "vue-screen";
import VueMaterial from "vue-material";
Vue.use(VueMaterial);
const vuetify = new Vuetify();
Vue.use(vuetify);
Vue.use(VueSidebarMenu);
Vue.use(Vuelidate);
Vue.use(VueScreen);
window.Vue = require("vue");
window.router = router;
window.Fire = new Vue();
import "boxicons";
Vue.config.productionTip = false;

Vue.mixin({
  methods: {
    showModal: function (id) {
      $(`#${id}`).modal("show");
    },
    hideModal: function (id) {
      $(`#${id}`).modal("hide");
    },
  },
});

new Vue({
  router,
  render: (h) => h(App),
}).$mount("#app");
