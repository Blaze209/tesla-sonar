package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends androidx.appcompat.app.c implements co.a, co.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f23094f = m();

    protected s() {
    }

    @Override // co.f
    public void a(String[] strArr, int i11, co.g gVar) {
        this.f23094f.requestPermissions(strArr, i11, gVar);
    }

    @Override // co.a
    public void g() {
        super.onBackPressed();
    }

    protected v m() {
        return new v(this, n());
    }

    protected String n() {
        return null;
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.f23094f.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f23094f.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.c, androidx.p002activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23094f.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23094f.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f23094f.onDestroy();
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f23094f.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.f23094f.onKeyLongPress(i11, keyEvent) || super.onKeyLongPress(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.f23094f.onKeyUp(i11, keyEvent) || super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f23094f.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f23094f.onPause();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        this.f23094f.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f23094f.onResume();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f23094f.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        this.f23094f.onWindowFocusChanged(z11);
    }

    public z p() {
        return this.f23094f.getReactDelegate();
    }

    protected final o0 q() {
        return this.f23094f.getReactNativeHost();
    }
}
