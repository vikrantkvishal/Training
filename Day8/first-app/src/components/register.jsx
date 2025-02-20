import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

function Register() {
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [address, setAddress] = useState('');
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        if (!name || !email || !address) {
            alert('All Fields are Mandatory');
        }
        else {
            try {
                const uniqueNo = Date.now();
                const user = { id: uniqueNo + '', name, email, address };
                const res = await axios.post('http://localhost:3000/users', user);
                if (res.status === 201) {
                    alert('User created Successfully');
                    navigate('/users');
                }
            } catch (err) {
                console.log(err);
            }
        }
    }
    return (
        <>
            <h3 className="text-center p-2 text-bg-secondary">Registration Page</h3>
            <form onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label className="form-label">Name</label>
                    <input type="text" className="form-control" placeholder="Your Name" onChange={(e) => setName(e.target.value)} />
                </div>
                <div className="mb-3">
                    <label className="form-label">Email Address</label>
                    <input type="email" className="form-control" placeholder="Your Email Address" onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div className="mb-3">
                    <label className="form-label">Address</label>
                    <input type="text" className="form-control" placeholder="Your Address" onChange={(e) => setAddress(e.target.value)} />
                </div>
                <button type="submit" className="btn btn-primary w-100 mt-3">Register Me</button>
            </form>
        </>
    );
}

export default Register;