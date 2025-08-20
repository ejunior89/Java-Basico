const API_URL = 'http://localhost:8080/users';

// O login agora é tratado pelo navegador via httpBasic
async function register() {
    const username = document.getElementById('register-username').value;
    const password = document.getElementById('register-password').value;
    const role = document.getElementById('register-role').value;
    const statusText = document.getElementById('register-status');

    try {
        const response = await fetch(`${API_URL}/register`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ username, password, role })
        });

        const text = await response.text();
        if (response.ok) {
            statusText.textContent = 'Usuário cadastrado com sucesso!';
            statusText.style.color = 'green';
        } else {
            statusText.textContent = `Falha no cadastro: ${text}`;
            statusText.style.color = 'red';
        }
    } catch (error) {
        statusText.textContent = 'Erro ao conectar. Tente novamente.';
        statusText.style.color = 'red';
        console.error('Erro de registro:', error);
    }
}

async function listUsers() {
    const userList = document.getElementById('user-list');
    userList.innerHTML = '';

    try {
        const response = await fetch(API_URL, {
            method: 'GET'
        });

        if (response.ok) {
            const users = await response.json();
            users.forEach(user => {
                const li = document.createElement('li');
                li.textContent = `ID: ${user.id} | Usuário: ${user.username} | Permissão: ${user.role}`;
                userList.appendChild(li);
            });
        } else {
            userList.innerHTML = '<li>Falha ao buscar usuários.</li>';
        }
    } catch (error) {
        userList.innerHTML = '<li>Erro ao conectar à API.</li>';
        console.error('Erro ao listar usuários:', error);
    }
}

function checkAuth() {
    listUsers(); // Tenta listar os usuários
}

window.onload = checkAuth;