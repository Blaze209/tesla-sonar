package cz;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes6.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f59227a;

    c(int i11) {
        this.f59227a = i11;
    }

    @Override // cz.a
    public void a(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(VibrationEffect.createPredefined(this.f59227a));
            }
        } catch (Exception unused) {
        }
    }
}
