package tf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class e0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f113309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f113310b;

    public e0(V v11) {
        this.f113309a = v11;
        this.f113310b = null;
    }

    public Throwable a() {
        return this.f113310b;
    }

    public V b() {
        return this.f113309a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (b() != null && b().equals(e0Var.b())) {
            return true;
        }
        if (a() == null || e0Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public e0(Throwable th2) {
        this.f113310b = th2;
        this.f113309a = null;
    }
}
