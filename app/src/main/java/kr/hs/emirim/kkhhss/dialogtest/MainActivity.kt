package kr.hs.emirim.kkhhss.dialogtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn_item: Button
    lateinit var text_result : TextView
    lateinit var imgv : ImageView

    var verrionArray = arrayOf("기니피그", "카피바라", "햄스터")
    var AnimalImgRes = arrayOf(R.drawable.ginipig, R.drawable.capibara, R.drawable.hamster03)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_item = findViewById(R.id.btn_item)
        text_result = findViewById(R.id.text_result)
        imgv = findViewById(R.id.imgv)

        btn_item.setOnClickListener{
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 아이돌은?")
            dlg.setIcon(R.drawable.doguri)
            dlg.setItems(verrionArray){dialog, index ->
                text_result.text = verrionArray[index]
                imgv.setImageResource(AnimalImgRes[index])

            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}