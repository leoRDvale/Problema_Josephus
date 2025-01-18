import java.util.ArrayList;

    public class Soldado {

    private ArrayList<Soldados> listaSoldado;

    public Soldado() {
        listaSoldado = new ArrayList<>();



        listaSoldado.add(new Soldados(1, "João", "123456789", "12345678901", "Rua 1"));
        listaSoldado.add(new Soldados(2, "Maria", "987654321", "98765432109", "Rua 2"));
        listaSoldado.add(new Soldados(3, "José", "123456789", "12345678901", "Rua 3"));
        listaSoldado.add(new Soldados(4, "Ana", "987654321", "98765432109", "Rua 4"));
        listaSoldado.add(new Soldados(5, "Pedro", "123456789", "12345678901", "Rua 5"));
        listaSoldado.add(new Soldados(6, "Paula", "987654321", "98765432109", "Rua 6"));
        listaSoldado.add(new Soldados(7, "Carlos", "123456789", "12345678901", "Rua 7"));
        listaSoldado.add(new Soldados(8, "Marta", "987654321", "98765432109", "Rua 8"));
        listaSoldado.add(new Soldados(9, "Lucas", "123456789", "12345678901", "Rua 9"));
        listaSoldado.add(new Soldados(10, "Júlia", "987654321", "98765432109", "Rua 10"));
        listaSoldado.add(new Soldados(11, "Fernando", "123456789", "12345678901", "Rua 11"));
        listaSoldado.add(new Soldados(12, "Carla", "987654321", "98765432109", "Rua 12"));
        listaSoldado.add(new Soldados(13, "Ricardo", "123456789", "12345678901", "Rua 13"));
        listaSoldado.add(new Soldados(14, "Lúcia", "987654321", "98765432109", "Rua 14"));
        listaSoldado.add(new Soldados(15, "Roberto", "123456789", "12345678901", "Rua 15"));
        listaSoldado.add(new Soldados(16, "Sandra", "987654321", "98765432109", "Rua 16"));
        listaSoldado.add(new Soldados(17, "Rafael", "123456789", "12345678901", "Rua 17"));
        listaSoldado.add(new Soldados(18, "Tatiana", "987654321", "98765432109", "Rua 18"));
        listaSoldado.add(new Soldados(19, "Gustavo", "123456789", "12345678901", "Rua 19"));
        listaSoldado.add(new Soldados(20, "Fernanda", "987654321", "98765432109", "Rua 20"));

    }

        public ArrayList<Soldados> getListSoldado(){
            return listaSoldado;
        }

        public int localizarSoldado(int num) {
            int n = listaSoldado.size();
            int indice = 0;

            while(n > 1) {
                indice = (indice + num - 1) % n;
                listaSoldado.remove(indice);
                n--;

            }
            return listaSoldado.get(0).getNumero();
        }



        public class Soldados {
            int numero;
            String nome;
            String telefone;
            String cpf;
            String endereco;

            public Soldados(int numero, String nome, String telefone, String cpf, String endereco) {
                this.numero = numero;
                this.nome = nome;
                this.telefone = telefone;
                this.cpf = cpf;
                this.endereco = endereco;
            }

            public int getNumero() {
                return numero;
            }

            public String getNome() {
                return nome;
            }

            public String getTelefone() {
                return telefone;
            }

            public String getCpf() {
                return cpf;
            }

            public String getEndereco() {
                return endereco;
            }



    }
}


