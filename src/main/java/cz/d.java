package cz;

import android.os.Vibrator;

/* JADX INFO: loaded from: classes6.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long[] f59228a;

    public d(long[] jArr) {
        this.f59228a = jArr;
    }

    @Override // cz.a
    public void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f59228a, -1);
            }
        } catch (Exception unused) {
        }
    }
}
