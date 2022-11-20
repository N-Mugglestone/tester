import PropTypes from 'prop-types'
import { Link } from 'react-router-dom'

const Header = () => {

    return (
        <>
            <nav>
                <nav className="navbar navbar-expand-lg navbar-dark">

                      <a href="/"> Home </a>

                      <a href ="/AddAPerson"> AddAPerson </a>
                        <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div className="navbar-nav">

                            </div>
                        </div>
                </nav>
            </nav>
        </>
    )


}

export default Header;