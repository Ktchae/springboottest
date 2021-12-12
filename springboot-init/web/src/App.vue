<template v-slot:layout>
  <a-layout id="components-layout-demo-top-side-2">
    <the-Header></the-Header>
    <router-view/>
    <the-footer></the-footer>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import TheHeader from '@/components/the-Header.vue';
import TheFooter from '@/components/the-footer.vue';

export default defineComponent({
  name: 'app',
  components: {
    TheHeader,
    TheFooter,
  },
});
</script>
