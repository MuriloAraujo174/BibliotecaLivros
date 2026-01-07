package beans;

public class PacoteCadastroFuncionarios {
    
    private Person person;
    private Cpf cpf;
    private Login login;
    private TypeUser typeUser;
    
    public PacoteCadastroFuncionarios() {
        this.person = new Person();
        this.cpf = new Cpf();
        this.login = new Login();
        this.typeUser = new TypeUser();
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
    
}
