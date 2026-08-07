package hg;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import tf.b0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f72704a = new HashSet();

    @Override // tf.b0
    public void a(String str) {
        b(str, null);
    }

    @Override // tf.b0
    public void b(String str, Throwable th2) {
        Set<String> set = f72704a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void c(String str, Throwable th2) {
        if (tf.e.f113298a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // tf.b0
    public void debug(String str) {
        c(str, null);
    }

    @Override // tf.b0
    public void error(String str, Throwable th2) {
        if (tf.e.f113298a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
