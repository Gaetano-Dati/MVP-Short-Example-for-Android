package com.example.mvpexample;

/**
 * Created by garro on 20/03/2018.
 */

public interface MVP {

    interface view{
        void displayToastMessage();
        void changeColor();
    }

    interface presenter{
        void clickedToastButton();
        void clickedChangeColorBtn();
    }
}
