package org.godotengine.godot;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.u;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FullScreenGodotApp extends u {
    protected Godot godotFragment;

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Godot godot = this.godotFragment;
        if (godot != null) {
            godot.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.godot_app_layout);
        this.godotFragment = new Godot();
        getSupportFragmentManager().r().o(R.id.godot_fragment_container, this.godotFragment).w(this.godotFragment).j();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i11, int i12, KeyEvent keyEvent) {
        Godot godot = this.godotFragment;
        if (godot == null || !godot.onKeyMultiple(i11, i12, keyEvent)) {
            return super.onKeyMultiple(i11, i12, keyEvent);
        }
        return true;
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Godot godot = this.godotFragment;
        if (godot != null) {
            godot.onNewIntent(intent);
        }
    }
}
