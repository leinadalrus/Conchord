import React from 'react'
import ReactDOM from 'react-dom'
import client from './_client.js'

const Account = () => <></>

const Profile = () => {
  const accounts = this.props.accounts.map(account => (
    <Account
      key={account._links.self.href}
      account={account}
    />
  ))

  return <>{accounts}</>
}

class App extends React.Component {
  constructor(props) {
    super(props)
    this.state = { accounts: [] }
  }

  componentDidMount() {
    client({ method: 'GET', path: '/api/accounts' }).done(response => {
      this.setState({ accounts: response.entity._embedded.accounts })
    })
  }

  render() {
    return <Profile accounts={this.state.accounts} />
  }
}

ReactDOM.render(<App />, document.getElementsByClassName('React'))
