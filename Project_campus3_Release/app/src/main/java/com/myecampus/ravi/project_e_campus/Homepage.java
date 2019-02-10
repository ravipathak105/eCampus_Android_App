package com.myecampus.ravi.project_e_campus;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Homepage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        FragmentManager fragmentManager4=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
        fragmentTransaction4.replace(R.id.content_homepage,new Home());
        fragmentTransaction4.commit();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    FragmentManager managerx = getSupportFragmentManager();

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);



            if (managerx.getBackStackEntryCount() > 0 ) {
                managerx.popBackStack();
            }


        else {

         new AlertDialog.Builder(this)
                    .setTitle("Exit eCampus?")
                    .setMessage("Are you sure you want to exit app?")
                    .setNegativeButton(android.R.string.no, null)
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {

                            moveTaskToBack(true);
                            finish();
                            System.exit(0);
                        }
                    }).create().show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            FragmentManager fragmentManager2=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction2=fragmentManager2.beginTransaction();
            fragmentTransaction2.replace(R.id.content_homepage,new AboutUs());
            fragmentTransaction2.addToBackStack(null).commit();
            return true;
        }
        if (id == R.id.action_help) {
            FragmentManager fragmentManager3 = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
            fragmentTransaction3.replace(R.id.content_homepage, new Help());
            fragmentTransaction3.addToBackStack(null).commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch(item.getItemId())
        {
            case R.id.nav_home :
                FragmentManager fragmentManager4=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
                fragmentTransaction4.replace(R.id.content_homepage,new Home());
                fragmentTransaction4.commit();



                break;
            case  R.id.nav_registration :
                FragmentManager fragmentManager0=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction0=fragmentManager0.beginTransaction();
                fragmentTransaction0.replace(R.id.content_homepage,new RegistrationBtn());
                fragmentTransaction0.addToBackStack(null).commit();
                break;
            case R.id.nav_chatbot:
                FragmentManager fragmentManager1=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.content_homepage,new stubotfr());
                fragmentTransaction1.addToBackStack(null).commit();
                break;

            case  R.id.action_about:
                FragmentManager fragmentManager2=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2=fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.content_homepage,new AboutUs());
                fragmentTransaction2.addToBackStack(null).commit();

                break;
            case  R.id.nav_blogs :
                FragmentManager fragmentManager3=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction3=fragmentManager3.beginTransaction();
                fragmentTransaction3.replace(R.id.content_homepage,new Blogs());
                fragmentTransaction3.addToBackStack(null).commit();
                break;
            case  R.id.nav_srms :
                FragmentManager fragmentManager5=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction5=fragmentManager5.beginTransaction();
                fragmentTransaction5.replace(R.id.content_homepage,new SrmsConnect());
                fragmentTransaction5.addToBackStack(null).commit();
                break;
            case  R.id.nav_gallery :
                FragmentManager fragmentManager6=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction6=fragmentManager6.beginTransaction();
                fragmentTransaction6.replace(R.id.content_homepage,new Gallery());
                fragmentTransaction6.addToBackStack(null).commit();
                break;

            case  R.id.nav_share :
                FragmentManager fragmentManager7=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction7=fragmentManager7.beginTransaction();
                fragmentTransaction7.replace(R.id.content_homepage,new Share());
                fragmentTransaction7.addToBackStack(null).commit();
                break;
            case  R.id.nav_location :
                FragmentManager fragmentManager8=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction8=fragmentManager8.beginTransaction();
                fragmentTransaction8.replace(R.id.content_homepage,new TrackLocation());
                fragmentTransaction8.addToBackStack(null).commit();
                break;
            case  R.id.nav_student :
                FragmentManager fragmentManager9=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction9=fragmentManager9.beginTransaction();
                fragmentTransaction9.replace(R.id.content_homepage,new Student());
                fragmentTransaction9.addToBackStack(null).commit();
                break;

            case  R.id.nav_aktu :
                FragmentManager fragmentManagerAktu=getSupportFragmentManager();
                FragmentTransaction fragmentTransactionAktu=fragmentManagerAktu.beginTransaction();
                fragmentTransactionAktu.replace(R.id.content_homepage,new AktuErp());
                fragmentTransactionAktu.addToBackStack(null).commit();
                break;


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
