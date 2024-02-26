import { describe, it, expect } from "vitest"
import { mount } from "@vue/test-utils"
import TradingCard from "../cards/TradingCard.vue"

describe("I-400-class Submarine", () => {
  it("renders properly", () => {
    const wrapper = mount(TradingCard, {
      props: { msg: "Imperial Japanese Navy" }
    })
    expect(wrapper.text()).toContain("Imperial Japanese Navy")
  })
})
