public class Login {
    private final String username;
    private final String senha;

    public Login(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public boolean fazerLogin(String username, String senha) throws LoginInvalidoException {
        if (this.username.equals(username) && this.senha.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }
    }
}
