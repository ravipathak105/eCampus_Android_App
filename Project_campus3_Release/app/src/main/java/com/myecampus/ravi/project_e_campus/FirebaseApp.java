package com.myecampus.ravi.project_e_campus;

import com.google.firebase.database.FirebaseDatabase;

public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}