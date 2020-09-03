import React from 'react';
import { Link } from 'react-router-dom';

export default class AppNavBar extends React.Component {

    constructor(props) {
        super(props);
        this.state = { isOpen: false };
        this.toggle = this.toggle.bind(this);
    }

    toggle() {
        this.setState({
            isOpen: !this.state.isOpen
        })
    }
    render() {
        return (
            // <div className="navbar navbar-inverse">
            //     <div className="container-fluid">
            //         <div className="navbar-header">
            //             <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false" >
            //                 <span className="sr-only">Toggle Navigation</span>
            //                 <span className="icon-bar" />
            //                 <span className="icon-bar" />
            //                 <span className="icon-bar" />
            //             </button>
            //             <Link className="navbar-brand" to="/"> Premier Bank</Link>
            //         </div>

            //         <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            //             <ul className="nav navbar-nav">
            //                 <li> <Link to="/">Home</Link></li>
            //                 <li>
            //                     <Link to="/customers">Customer</Link>
            //                 </li>
            //                 <li>
            //                     <Link to="/about">About</Link>
            //                 </li>
            //             </ul>

            //         </div>

            //     </div>
            // </div>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Premier Bank</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <li> <Link to="/">Home</Link></li>
                            {/* <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a> */}
                        </li>
                        <li class="nav-item">
                            <Link to="/customers">Customer</Link>
                            {/* <a class="nav-link" href="#">Customer</a> */}
                        </li>
                        <li class="nav-item">
                            <Link to="/about">About</Link>
                            {/* <a class="nav-link" href="#">About</a> */}
                        </li>
                        {/* <li class="nav-item">
                            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                        </li> */}
                    </ul>
                </div>
            </nav>
        );
    }
}