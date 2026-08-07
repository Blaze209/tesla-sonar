package ag;

import androidx.collection.x;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f1027b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<String, tf.i> f1028a = new x<>(20);

    g() {
    }

    public static g b() {
        return f1027b;
    }

    public tf.i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f1028a.get(str);
    }

    public void c(String str, tf.i iVar) {
        if (str == null) {
            return;
        }
        this.f1028a.put(str, iVar);
    }
}
