package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import h00.a;
import wq0.c;

/* JADX INFO: loaded from: classes6.dex */
public class ChromeTabsManagerActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48288a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48289b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48290c = false;

    private static Intent a(Context context) {
        return new Intent(context, (Class<?>) ChromeTabsManagerActivity.class);
    }

    public static Intent b(Context context) {
        Intent intentA = a(context);
        intentA.addFlags(67108864);
        return intentA;
    }

    public static Intent c(Context context, Intent intent) {
        Intent intentA = a(context);
        intentA.putExtra("browserIntent", intent);
        return intentA;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (!getIntent().hasExtra("browserIntent") || (bundle != null && bundle.getString("browserResultType") != null)) {
                finish();
                return;
            }
            Intent intent = (Intent) getIntent().getParcelableExtra("browserIntent");
            intent.addFlags(67108864);
            startActivity(intent);
            this.f48289b = "dismiss";
        } catch (Exception e11) {
            this.f48290c = true;
            c.c().l(new a("Unable to open url.", this.f48289b, Boolean.valueOf(this.f48290c)));
            finish();
            e11.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        String str = this.f48289b;
        if (str != null) {
            str.getClass();
            if (str.equals("cancel")) {
                c.c().l(new a("chrome tabs activity closed", this.f48289b, Boolean.valueOf(this.f48290c)));
            } else {
                c.c().l(new a("chrome tabs activity destroyed", "dismiss", Boolean.valueOf(this.f48290c)));
            }
            this.f48289b = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f48289b = bundle.getString("browserResultType");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f48288a) {
            this.f48288a = true;
        } else {
            this.f48289b = "cancel";
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("browserResultType", "dismiss");
        super.onSaveInstanceState(bundle);
    }
}
