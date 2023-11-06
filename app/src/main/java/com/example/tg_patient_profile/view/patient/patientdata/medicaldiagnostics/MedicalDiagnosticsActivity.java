package com.example.tg_patient_profile.view.patient.patientdata.medicaldiagnostics;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.example.tg_patient_profile.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MedicalDiagnosticsActivity extends AppCompatActivity {
  @Override
  protected void onCreate(final Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_medical_diagnostics);

    final TabLayout tabLayout = findViewById(R.id.medicalDiagnosticsTabLayout);
    final ViewPager2 viewPager2 = findViewById(R.id.medicalDiagnosticsViewPager);

    new TabLayoutMediator(
            tabLayout,
            viewPager2,
            (tab, position) -> {
              if (0 == position) {
                tab.setText("Current");
              } else {
                tab.setText("Past");
              }
            })
        .attach();
  }
}
