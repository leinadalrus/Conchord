import { fileURLToPath } from "node:url"
import { mergeConfig, defineConfig, configDefaults } from "vitest/config"
import viteConfig from "./vite.config"

import vue from "@vitejs/plugin-vue"
import tsconfigPaths from "vite-tsconfig-paths"

export default mergeConfig(
  viteConfig,
  defineConfig({
    test: {
      environment: "jsdom",
      exclude: [...configDefaults.exclude, "e2e/*"],
      root: fileURLToPath(new URL("./", import.meta.url))
    },
    plugins: [vue(), tsconfigPaths()]
  })
)
