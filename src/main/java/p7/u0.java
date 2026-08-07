package p7;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f101582c = s7.q0.N0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101583d = s7.q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f101584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.x<Integer> f101585b;

    public u0(t0 t0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= t0Var.f101499a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f101584a = t0Var;
        this.f101585b = com.google.common.collect.x.n(list);
    }

    public static u0 a(Bundle bundle) {
        return new u0(t0.b((Bundle) s7.a.f(bundle.getBundle(f101582c))), ru.f.c((int[]) s7.a.f(bundle.getIntArray(f101583d))));
    }

    public int b() {
        return this.f101584a.f101501c;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f101582c, this.f101584a.h());
        bundle.putIntArray(f101583d, ru.f.n(this.f101585b));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f101584a.equals(u0Var.f101584a) && this.f101585b.equals(u0Var.f101585b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f101584a.hashCode() + (this.f101585b.hashCode() * 31);
    }
}
