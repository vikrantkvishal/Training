import { Link } from "react-router-dom";

function Header() {
    return (
        <>
            <ul className="nav">
                <li className="nav-item">
                    <Link className="nav-link active" to="home">Home</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="about">About</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="contact">Contact</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="users">Users</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="login">Login</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="products">Products</Link>
                </li>
                
            </ul>
        </>
    )
}

export default Header;

