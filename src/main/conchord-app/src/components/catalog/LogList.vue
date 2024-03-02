<script setup lang="ts">
import axios from "axios"

import type ShipsBoats from "../ships/ShipsBoats.vue"

const respVal = await axios.get<Array<typeof ShipsBoats>>("/api/ships")

const ships = respVal.data
const status = respVal.status
const headers = respVal.headers
</script>

<template>
  <section :class="styles.CardSection">
    <h1>{{ ships }}</h1>
    <h2>{{ headers }}</h2>
  </section>
  <article :class="styles.CardArticle">
    <div :class="styles.CardDescriptor">{{ status }}</div>
  </article>
</template>

<style scoped module="styles" lang="scss">
.CardSection {
}

.CardArticle {
}

.CardDescriptor {
}
</style>
