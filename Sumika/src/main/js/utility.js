'use strict'

import interceptor from 'rest'

export function intercept(bundler)
{
  return interceptor
  ({
    request: (request) => {
      if (request.path.indexOf('{') == -1) return request
      else
      {
        request.path = request.path.split('{')[0]
        return request
      }
    }
  })
}

export function convert()
{
  return
  {
    read: (string) => {
      return string.split('\n')
    },

    write: (entity) => {
      if (entity instanceof Array) 
        return entity.map(resource => resource.__links.self.href).join('\n')
      else return entity.__links.self.href
    }
  }
}
