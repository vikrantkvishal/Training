function Login() {
    return (
        <>
            <h3 className="text-center p-2 text-bg-secondary">Login Page</h3>
            <div className="mb-3">
                <label className="form-label">Email address</label>
                <input type="email" className="form-control" placeholder="name@example.com" />
            </div>
            <div className="mb-3">
                <label className="form-label">Example textarea</label>
                <textarea className="form-control" rows="3"></textarea>
            </div>
            <div className="row g-3 align-items-center">
                <label className="form-label">Password</label>
                <input type="password" className="form-control" aria-describedby="passwordHelpBlock" />
                <div className="form-text">
                    Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
                </div>
            </div>
            <button className="btn btn-primary mt-3 w-100">
                Login
            </button>
        </>
    );
}

export default Login;