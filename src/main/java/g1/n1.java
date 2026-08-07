package g1;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f66976a = a(0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f66977b = a(1, 3, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f66978c = a(6, 7, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1 f66979d = a(6, 6, 1);

    n1() {
    }

    @NonNull
    public static n1 a(int i11, int i12, int i13) {
        return new e(i11, i12, i13);
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();
}
