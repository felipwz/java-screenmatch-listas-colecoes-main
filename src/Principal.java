import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filmePreferido = new Filme("Ilha do medo", 2013);
        filmePreferido.setIncluidoNoPlano(true);
        filmePreferido.setAnoDeLancamento(2013);

        ArrayList<Filme> minhaLista = new ArrayList<>();
        minhaLista.add(meuFilme);
        minhaLista.add(outroFilme);
        minhaLista.add(filmePreferido);
        System.out.println("O tamamanho da lista: " + minhaLista.size());
        System.out.println("O primeiro filme dessa lista é: " + minhaLista.get(0).getNome());
        System.out.println(minhaLista);

        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Luiz Felipe");
        primeiraPessoa.setIdade(18);

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setIdade(21);
        segundaPessoa.setNome("Pietra");

        Pessoa terceiraPessoa = new Pessoa();
        terceiraPessoa.setNome("Pedro");
        terceiraPessoa.setIdade(25);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);
        System.out.println("Na lista existem: " + listaDePessoas.size() + ".");
        System.out.println("E a primeira pessoa dessa lista é: " + listaDePessoas.get(0).getNome() + " e essa pessoa tem: " + listaDePessoas.get(0).getIdade()+ " anos de idade.");
        System.out.println("E a lista completa é: " + listaDePessoas);

    }
}