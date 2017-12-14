package br.com.eteczl.placartruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int nos;
    private int eles;
    private TextView placarTextEditEles;
    private TextView placarTextEditNos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.placarTextEditEles = (TextView) findViewById(R.id.lblElesPlacar);
        this.placarTextEditNos = (TextView) findViewById(R.id.lblNosPlacar);

        this.zerar();
        this.atualizar();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private void atualizar() {
        this.placarTextEditEles.setText(Integer.toString(this.eles));
        this.placarTextEditNos.setText(Integer.toString(this.nos));

        if (this.eles >= 12){
            Toast elesGanharam = Toast.makeText(this,"Eles GANHARAM !!!",Toast.LENGTH_SHORT);
            elesGanharam.show();
        }else if(this.nos >=12){
            Toast nosGanhamos = Toast.makeText(this,"GANHAMOS !!!!!", Toast.LENGTH_SHORT);
            nosGanhamos.show();
        }

    }

    private void zerar() {
        this.eles = 0;
        this.nos = 0;
    }

    public void elesMaisUm(View view) {
        this.eles = this.eles + 1;
        this.atualizar();
    }

    public void nosMaisUm(View view) {
        this.nos = this.nos + 1;
        this.atualizar();
    }

    public void elesMaisTres(View view) {
        this.eles = this.eles + 3;
        this.atualizar();
    }

    public void nosMaisTres(View view) {
        this.nos = this.nos + 3;
        this.atualizar();
    }

    public void elesMaisSeis(View view) {
        this.eles = this.eles + 6;
        this.atualizar();
    }

    public void nosMaisSeis(View view) {
        this.nos = this.nos + 6;
        this.atualizar();
    }

    public void elesMaisNove(View view) {
        this.eles = this.eles + 9;
        this.atualizar();
    }

    public void nosMaisNove(View view) {
        this.nos = this.nos + 9;
        this.atualizar();
    }

    public void elesMaisDoze(View view) {
        this.eles = this.eles + 12;
        this.atualizar();
    }

    public void nosMaisDoze(View view) {
        this.nos = this.nos + 12;
        this.atualizar();
    }

    public void novoJogo(View view) {
        this.zerar();
        this.atualizar();
    }
}
