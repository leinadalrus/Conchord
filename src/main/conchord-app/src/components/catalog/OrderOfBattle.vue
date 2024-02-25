<script lang="ts">
import { ref } from "vue"
import { defineStore } from "pinia"
import ShipsBoats from "../ships/ShipsBoats.vue";
</script>

<template>
  <section>
    <ShipsBoats />
    <LogList />
  </section>
</template>

<style scoped module="styles" lang="scss"></style>
