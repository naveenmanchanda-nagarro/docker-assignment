const addUserApi = "http://localhost:9012/docker-demo/user/add";
const getAllUsersApi = "http://localhost:9012/docker-demo/user/get";

// ✅ Fetch all users → Populate table
function loadUsers() {
    fetch(getAllUsersApi)
        .then(res => res.json())
        .then(users => {
            const tableBody = document.getElementById("userTableBody");
            tableBody.innerHTML = "";

            users.forEach(user => {
                tableBody.innerHTML += `
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>
                        <td>${user.age}</td>
                    </tr>
                `;
            });
        })
        .catch(err => console.error("Fetch Users Error:", err));
}

// ✅ AUTO LOAD ON PAGE OPEN
document.addEventListener("DOMContentLoaded", function () {
    loadUsers();
});

// ✅ Submit form → Add user
document.getElementById("userForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const user = {
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        age: document.getElementById("age").value
    };

    fetch(addUserApi, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(res => {
        if (!res.ok) {
            throw new Error("Add user failed");
        }
    })
    .then(() => {
        alert("User added successfully");
        loadUsers(); // ✅ refresh after add
        document.getElementById("userForm").reset();
    })
    .catch(err => console.error("Add User Error:", err));
});
