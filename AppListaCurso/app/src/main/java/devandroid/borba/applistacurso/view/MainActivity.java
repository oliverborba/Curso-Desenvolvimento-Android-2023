package devandroid.borba.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.borba.applistacurso.R;
import devandroid.borba.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo, dados, valores ao objeto
        //Conforme Modelo, Template
        pessoa.setPrimeiroNome("Lucas");
        pessoa.setSobreNome("Borba");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("54-999444223");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Fernanda");
        outraPessoa.setSobreNome("Cioato");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("54-95544321");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();


        int parada = 0;
    }
}