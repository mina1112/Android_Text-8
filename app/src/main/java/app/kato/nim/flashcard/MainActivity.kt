package app.kato.nim.flashcard

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apple = Word(R.drawable.apple_icon, "りんご")
        val banana = Word(R.drawable.banana_icon, "バナナ")
        val orange = Word(R.drawable.orange_icon, "オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon, "いちご")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }



        private fun addWord(word: Word){
            val nameTextView = TextView(this)

            nameTextView.text = word.name

            //container.addView(nameTextView)

            val layout = LinearLayout(this)

            layout.orientation = LinearLayout.HORIZONTAL

            val imageView = ImageView(this)

            imageView.setImageResource(word.resId)

            layout.addView(imageView)
            layout.addView(nameTextView)

            container.addView(layout)
        }



}