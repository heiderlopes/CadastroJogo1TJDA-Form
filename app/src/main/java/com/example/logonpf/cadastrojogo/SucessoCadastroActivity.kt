package com.example.logonpf.cadastrojogo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sucesso_cadastro.*

class SucessoCadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso_cadastro)

        //vMensagem.text = intent.getStringExtra("nome")
        val jogo = intent.getParcelableExtra<Jogo>("jogo")
        tvMensagem.text = getString(R.string.cadastro_com_sucesso,
                jogo.nome,
                jogo.genero,
                jogo.anoLancamento)
    }
}
