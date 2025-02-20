import { useState, useEffect } from "react";
import axios from "axios";

function Users() {
    const [users, setUsers] = useState([]);

    const fetchData = async () => {
        try {
            const res = await axios.get('http://localhost:3000/users');
            console.log(res);
            setUsers(res.data);
        } catch (error) {
            console.log(error);
        }
    }

    const deleteUser = async (id) => {
        try {
            const res = await axios.delete(`http://localhost:3000/users/${id}`);
            if (res.status === 200) {
                alert('User deleted successfully');
                setUsers(users.filter(user => user.id !== id));
            }
        } catch (error) {
            console.log(error);
        }
    }
    useEffect(() => {
        fetchData();
    }, []);

    return (
        <>
            <h3>Users Component</h3>
            <table className="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Address</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map(user => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.address}</td>
                            <td>
                                <button className="btn btn-danger" onClick={() => deleteUser(user.id)}>X</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    );
}

export default Users;
