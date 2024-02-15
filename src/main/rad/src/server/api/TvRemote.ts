//
// created by David on: 2024-2-14
//

export interface TvRemote {
  index(): string | number
  show(): number | boolean
  init(): void | boolean
  create(): string | number
  // create -> REST paramaterized values |> ORM
  edit(): string | number
  // edit -> REST paramaterized values |> ORM
  update(): string | number
  // updated -> [string | number] -> API |> ORM
  destroy(): void | boolean
}