package com.example.app_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 計算するボタンを取得し、イベントリスナーに登録。
        val button = findViewById<Button>(R.id.calulate)
        button.setOnClickListener {
            // 妥当性チェック。
            var isValid = true

            // 「定価」のEditTextを取得。指定するIDはprice。
            val priceEditText = findViewById<EditText>(R.id.price)
            val priceText = priceEditText.text.toString()

            // 定価が未入力の場合。
            if (priceText.isEmpty()) {
                priceEditText.error = getString(R.string.price_error)
                isValid = false
            }

            // 「割引率」のEditTextを取得。指定するIDはdiscount。
            val discountEditText = findViewById<EditText>(R.id.discount)
            val discountText = discountEditText.text.toString()

            // 割引率が未入力の場合。
            if (discountText.isEmpty()) {
                discountEditText.error = getString(R.string.discount_error)
                isValid = false
            }

            if (isValid) {
                val price = Integer.parseInt(priceText)
                val discount = Integer.parseInt(discountText)

                // 画面遷移を行う
                val intent = Intent(this, ResultActivity::class.java)
                // 起動するコンポーネントに値を持たせる。
                intent.putExtra("price", price)
                intent.putExtra("discount", discount)
                // 遷移先アクティビティから結果を受け取らない。
                startActivity(intent)
            }
        }
    }
}
