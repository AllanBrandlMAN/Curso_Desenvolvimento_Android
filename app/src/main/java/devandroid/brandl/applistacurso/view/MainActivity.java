package devandroid.brandl.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.brandl.applistacurso.R;
import devandroid.brandl.applistacurso.model.Brinquedo;
import devandroid.brandl.applistacurso.model.Cidade;
import devandroid.brandl.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa ;
    Pessoa outraPessoa;
    Cidade cidade;
    Cidade novaCidade;
    Brinquedo brinquedo;
    Brinquedo novoBrinquedo;


    String dadosPessoa;
    String dadosOutraPessoa;


    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        pessoa = new Pessoa();
        //atribuir conteudo, dados, valores para o objeto
        pessoa.setPrimeiroNome("Allan");
        pessoa.setSobreNome("Brandl");
        pessoa.setCursoDesejado("Androido");
        pessoa.setTelefoneContato("979738336");


        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Daniele");
        outraPessoa.setSobreNome("Brandl");
        outraPessoa.setCursoDesejado("Apple");
        outraPessoa.setTelefoneContato("981234564");


        editPrimeiroNome = findViewById(R.id.PrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.SobreNomeAluno);
        editNomeCurso = findViewById(R.id.NomeCurso);
        editTelefoneContato = findViewById(R.id.TelefoneContato);



        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());



        cidade = new Cidade();
        cidade.setNomeCidade("São Paulo");
        cidade.setEstadoCidade("São Paulo");
        cidade.setPaisCidade("Brasil");

        novaCidade = new Cidade();
        novaCidade.setNomeCidade("Rio de Janeiro");
        novaCidade.setEstadoCidade("Rio de Janeiro");
        novaCidade.setPaisCidade("Brasil");


        brinquedo = new Brinquedo();
        brinquedo.setNomeBrinquedo("Bola");
        brinquedo.setAnoBrinquedo("2023");
        brinquedo.setPrecoBrinquedo("100,00");

        novoBrinquedo = new Brinquedo();
        novoBrinquedo.setNomeBrinquedo("Carrinho");
        novoBrinquedo.setAnoBrinquedo("2025");
        novoBrinquedo.setPrecoBrinquedo("150,00");

//-------------------------------------------------------------------------------
        //Utilizando os Gets


        dadosPessoa = " Primeiro none: ";
        dadosPessoa += pessoa.getPrimeiroNome() ;
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curos desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = " Primeiro none: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome() ;
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curos desejado: ";
        dadosOutraPessoa +=outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();


        Log.i("POO Android","Objeto Pessoa: " +  pessoa.toString());
        Log.i("POO Android", "Objeto outraPessoa: " +outraPessoa.toString());

        Log.i("Informacao Cidade", cidade.toString());

        Log.i("Informacao Brinquedos", brinquedo.toString());
    }

}