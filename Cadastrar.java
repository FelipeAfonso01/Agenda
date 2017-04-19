package application.example.com.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    EditText name;
    EditText username;
    EditText email;
    EditText senha;
    EditText confsenha;
    Integer i=0;

    public void cadastrar_usuario(View v){

        confsenha = (EditText)findViewById(R.id.confsenha);
        senha = (EditText)findViewById(R.id.senha);
        name = (EditText)findViewById(R.id.name);
        username = (EditText)findViewById(R.id.username);
        email = (EditText)findViewById(R.id.email);

        if (name.getText().toString().trim().isEmpty()) {
            i = i+1;
            name.setError("Campo obrigatório");
            name.requestFocus();
        }
        if (username.getText().toString().trim().isEmpty()) {
            i = i+1;
            username.setError("Campo obrigatório");
            username.requestFocus();
        }
        if (email.getText().toString().trim().isEmpty()) {
            i = i+1;
            email.setError("Campo obrigatório");
            email.requestFocus();
        }
        if (senha.getText().toString().trim().isEmpty()) {
            i = i+1;
            senha.setError("Campo obrigatório");
            senha.requestFocus();
        }
        Toast.makeText(this,i.toString(), Toast.LENGTH_SHORT).show();

        if(i==0){
            if(senha.getText().toString().equals(confsenha.getText().toString())){
                Intent cadastrou = new Intent();
                startActivity(cadastrou);
            }else{
                Toast.makeText(this,"Senhas não conferem",Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this,i.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
