package ru.cheber.mvplessons

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(index: CounterIndices){
        when(index){
            CounterIndices.INDEX_OF_COUNTER_ONE -> {
                val nextValue = model.next(0)
                view.setButtonOneText(nextValue.toString())
            }
            CounterIndices.INDEX_OF_COUNTER_TWO -> {
                val nextValue = model.next(1)
                view.setButtonTwoText(nextValue.toString())
            }
            CounterIndices.INDEX_OF_COUNTER_THREE -> {
                val nextValue = model.next(2)
                view.setButtonThreeText(nextValue.toString())
            }
        }
    }
}