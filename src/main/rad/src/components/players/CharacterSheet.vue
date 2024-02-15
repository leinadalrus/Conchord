<script setup lang="ts">
import { reactive, ref } from 'vue'
import type { TvRemote } from '../../server/api/TvRemote'
// `import type` creates a file-module equivalent to Vue's `<script setup>`

class PlayerTrait implements TvRemote {
  #uuid = ref(0)
  #uri = ref('')
  #url = ref('')

  uuid() { return this.#uuid }
  uri() { return this.#uri }
  url() { return this.#url }

  index(): string | number {
    return `${this.#url.value}`
  }
  show(): number | boolean {
    return this.#uuid.value
  }
  init(): boolean | void {
  }
  create(): string | number {
    return `${this.#url.value}/${this.#uuid.value}`
  }
  edit(): string | number {
    return `${this.#url.value}/${this.#uuid.value}`
  }
  update(): string | number {
    return `${this.#url.value}/${this.#uuid.value}`
  }

  destroy(): boolean | void {
  }
}

// NOTE(reactive): the `reactive` keyword has Object limitations-
// -it doesn't have primitive type(s) support.
// Reactive is also not destructure-friendly.
const PlayerProxy = reactive(PlayerTrait)
// Therefore, Keep-It-Simple-Stupid.

function getId(id: number): number { return id }
function getName(name: string): string { return name }
function getImage(sourcePath: string): string { return sourcePath }
</script>

<template>
  <article v-show="getId(1)">
    <img :src="getImage('public/user/avatars/**')" alt="">
    <p>{{ getName('John Doe') }}</p>
  </article>
</template>

<style scoped module="styles" lang="scss"></style>