package cz;

import android.os.Vibrator;

/* JADX INFO: loaded from: classes6.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f59229a;

    public e(int i11) {
        this.f59229a = i11;
    }

    @Override // cz.a
    public void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f59229a);
            }
        } catch (Exception unused) {
        }
    }
}
