package com.example.interfaceforproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Status extends AppCompatActivity {

    public View viewS;

    TextView indHealth, indEat, indToilet, indSleep, indFun;
    ProgressBar indHealthBar, indEatBar, indToiletBar, indSleepBar, indFunBar;
    TextView indHealthInt, indEatInt, indToiletInt, indSleepInt, indFunInt;

    @Nullable
    public void onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.status, container, false);
    }
}
//
//        indHealth = view.findViewById(R.id.indHealth);
//        indHealthInt = view.findViewById(R.id.indHealthInt);
//        indHealthBar = view.findViewById(R.id.indHealthBar);
//        indHealth.setText(R.string.upHealth);
//        indHealthInt.setText(String.valueOf(Person.health));
//        indHealthBar.setProgress(Person.health);
//
//        indEat = view.findViewById(R.id.indEat);
//        indEatInt = view.findViewById(R.id.indEatInt);
//        indEatBar = view.findViewById(R.id.indEatBar);
//        indEat.setText(R.string.upEat);
//        indEatInt.setText(String.valueOf(Person.eat));
//        indEatBar.setProgress(Person.eat);
//
//        indToilet = view.findViewById(R.id.indToilet);
//        indToiletInt = view.findViewById(R.id.indToiletInt);
//        indToiletBar = view.findViewById(R.id.indToiletBar);
//        indToilet.setText(R.string.upToilet);
//        indToiletInt.setText(String.valueOf(Person.toilet));
//        indToiletBar.setProgress(Person.toilet);
//
//        indSleep = view.findViewById(R.id.indSleep);
//        indSleepInt = view.findViewById(R.id.indSleepInt);
//        indSleepBar = view.findViewById(R.id.indSleepBar);
//        indSleep.setText(R.string.upSleep);
//        indSleepInt.setText(String.valueOf(Person.sleep));
//        indSleepBar.setProgress(Person.sleep);
//
//        indFun = view.findViewById(R.id.indFun);
//        indFunInt = view.findViewById(R.id.indFunInt);
//        indFunBar = view.findViewById(R.id.indFunBar);
//        indFun.setText(R.string.upFun);
//        indFunInt.setText(String.valueOf(Person.Fun));
//        indFunBar.setProgress(Person.Fun);
//
//        return view;
//    }
//
//    public void UpdateIndicators() {
//        indHealth = viewS.findViewById(R.id.indHealth);
//        indHealthInt = viewS.findViewById(R.id.indHealthInt);
//        indHealthBar = viewS.findViewById(R.id.indHealthBar);
//        indHealth.setText(R.string.upHealth);
//        indHealthInt.setText(String.valueOf(Person.health));
//        indHealthBar.setProgress(Person.health);
//
//
//        indEat = viewS.findViewById(R.id.indEat);
//        indEatInt = viewS.findViewById(R.id.indEatInt);
//        indEatBar = viewS.findViewById(R.id.indEatBar);
//        indEat.setText(R.string.upEat);
//        indEatInt.setText(String.valueOf(Person.eat));
//        indEatBar.setProgress(Person.eat);
//
//        indToilet = viewS.findViewById(R.id.indToilet);
//        indToiletInt = viewS.findViewById(R.id.indToiletInt);
//        indToiletBar = viewS.findViewById(R.id.indToiletBar);
//        indToilet.setText(R.string.upToilet);
//        indToiletInt.setText(String.valueOf(Person.toilet));
//        indToiletBar.setProgress(Person.toilet);
//
//
//        indSleep = viewS.findViewById(R.id.indSleep);
//        indSleepInt = viewS.findViewById(R.id.indSleepInt);
//        indSleepBar = viewS.findViewById(R.id.indSleepBar);
//        indSleep.setText(R.string.upSleep);
//        indSleepInt.setText(String.valueOf(Person.sleep));
//        indSleepBar.setProgress(Person.sleep);
//
//
//    }
//}
