package com.example.mvpexample;

/**
 * Created by garro on 20/03/2018.
 */

public class Presenter implements MVP.presenter {

    private MVP.view view;

    public Presenter(MVP.view view){
        this.view = view;
    }

    @Override
    public void clickedToastButton() {
        view.displayToastMessage();
    }

    @Override
    public void clickedChangeColorBtn() {
        view.changeColor();
    }
}
