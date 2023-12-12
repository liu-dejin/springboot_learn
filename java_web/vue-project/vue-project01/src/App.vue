<template>
  <div>

    <!--      {{message}}-->
    <!--      <element-view></element-view>-->

    <!--      员工管理-->
    <!--      <emp-view></emp-view>-->
    <router-view></router-view>
  </div>
</template>

<script>
// import ElementView from "@/views/elemenet/ElementView.vue";

// import EmpView from "@/views/tlias/EmpView.vue";

export default {
  // components: {EmpView},
  // components: {ElementView},
  data(){
    return{
      message :"hello vue"
    }
  },
  methods:{

  }

}
</script>

<style>

</style>
