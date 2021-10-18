package ru.cheber.mvplessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.cheber.mvplessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener { presenter.counterClick(CounterIndices.INDEX_OF_COUNTER_ONE) }
        vb?.btnCounter2?.setOnClickListener { presenter.counterClick(CounterIndices.INDEX_OF_COUNTER_TWO) }
        vb?.btnCounter3?.setOnClickListener { presenter.counterClick(CounterIndices.INDEX_OF_COUNTER_THREE) }

    }

    override fun setButtonOneText(text: String) {
        setButtonText(CounterIndices.INDEX_OF_COUNTER_ONE, text)
    }

    override fun setButtonTwoText(text: String) {
        setButtonText(CounterIndices.INDEX_OF_COUNTER_TWO, text)
    }

    override fun setButtonThreeText(text: String) {
        setButtonText(CounterIndices.INDEX_OF_COUNTER_THREE, text)
    }

    private fun setButtonText(index: CounterIndices, text: String) {
        when(index) {
            CounterIndices.INDEX_OF_COUNTER_ONE -> vb?.btnCounter1?.text = text
            CounterIndices.INDEX_OF_COUNTER_TWO -> vb?.btnCounter2?.text = text
            CounterIndices.INDEX_OF_COUNTER_THREE -> vb?.btnCounter3?.text = text
        }
    }
}