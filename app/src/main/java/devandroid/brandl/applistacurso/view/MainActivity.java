package devandroid.brandl.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.brandl.applistacurso.R;
import devandroid.brandl.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

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

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_SHORT).show();


            }

        });



/*
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

*/
        Log.i("POO Android", "Objeto Pessoa: " + pessoa.toString());
        Log.i("POO Android", "Objeto outraPessoa: " + outraPessoa.toString());


    }

}