package software.br.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //vinculando os valores vindos da view "botões" ao activity que é uma tela
    public void somar(View view){

        /**
         * EditText: é o campo onde o usuário irá inserir os valores
         * R é uma classe criada automaticamente pela ide, representa os recursos do projeto android.
         * findViewById pegar o elemento selecionado pelo id, por exemplo findViewById(R.id.n1), pega o elemento de id n1
         */
        EditText n1 = (EditText) findViewById(R.id.n1); //retorna uma view, por isso a necessidade do cast
        Double num1 = Double.parseDouble( n1.getText().toString() ); //pega o conteúdo do campo e converte para Double

        EditText n2 = (EditText) findViewById(R.id.n2);
        Double num2 = Double.parseDouble( n2.getText().toString() );

        Double resultado = num1 + num2;
        //é uma classe que exibe um valor na tela
        Toast.makeText(this, "Resultado: "+ resultado, Toast.LENGTH_LONG).show();
    }

    public void subtrair(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        Double num1 = Double.parseDouble( n1.getText().toString() );
        EditText n2 = (EditText) findViewById(R.id.n2);
        Double num2 = Double.parseDouble( n2.getText().toString() );
        Double resultado = num1 - num2;
        Toast.makeText(this, "Resultado: "+ resultado, Toast.LENGTH_LONG).show();
    }

    public void dividir(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        Double num1 = Double.parseDouble( n1.getText().toString() );
        EditText n2 = (EditText) findViewById(R.id.n2);
        Double num2 = Double.parseDouble( n2.getText().toString() );
        Double resultado = num1 / num2;
        Toast.makeText(this, "Resultado: "+ resultado, Toast.LENGTH_LONG).show();
    }

    public void multiplicar(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        Double num1 = Double.parseDouble( n1.getText().toString() );
        EditText n2 = (EditText) findViewById(R.id.n2);
        Double num2 = Double.parseDouble( n2.getText().toString() );
        Double resultado = num1 * num2;
        Toast.makeText(this, "Resultado: "+ resultado, Toast.LENGTH_LONG).show();
    }

}
