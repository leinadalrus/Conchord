'use client'

import React from 'react'

class RadarService extends Component
{
  constructor(props)
  {
    super(props)
    this.state = {radars: []}
  }

  componentDidMount()
  {
    client({method: 'GET', path: '/api/radar-chart'}).done(response => {
      this.setState({radars: response.entity._embedded.radars})
    })
  }

  render()
  {
    return (
      <RadarChart radars={this.state.radars} />
    )
  }
}

export class RadarService