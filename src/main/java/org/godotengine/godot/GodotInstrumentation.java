package org.godotengine.godot;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import com.fourthline.analytics.internal.AnalyticsAttribute;

/* JADX INFO: loaded from: classes10.dex */
public class GodotInstrumentation extends Instrumentation {
    private Intent intent;

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        this.intent = (Intent) bundle.getParcelable(AnalyticsAttribute.Intent);
        start();
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        startActivitySync(this.intent);
    }
}
