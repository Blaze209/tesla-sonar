package p7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f101183b = new a1(com.google.common.collect.x.r());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f101184c = s7.q0.N0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.x<a> f101185a;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f101186f = s7.q0.N0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f101187g = s7.q0.N0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f101188h = s7.q0.N0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f101189i = s7.q0.N0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t0 f101191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f101192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f101193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f101194e;

        public a(t0 t0Var, boolean z11, int[] iArr, boolean[] zArr) {
            int i11 = t0Var.f101499a;
            this.f101190a = i11;
            boolean z12 = false;
            s7.a.a(i11 == iArr.length && i11 == zArr.length);
            this.f101191b = t0Var;
            if (z11 && i11 > 1) {
                z12 = true;
            }
            this.f101192c = z12;
            this.f101193d = (int[]) iArr.clone();
            this.f101194e = (boolean[]) zArr.clone();
        }

        public static a b(Bundle bundle) {
            t0 t0VarB = t0.b((Bundle) s7.a.f(bundle.getBundle(f101186f)));
            return new a(t0VarB, bundle.getBoolean(f101189i, false), (int[]) ou.j.a(bundle.getIntArray(f101187g), new int[t0VarB.f101499a]), (boolean[]) ou.j.a(bundle.getBooleanArray(f101188h), new boolean[t0VarB.f101499a]));
        }

        public a a(String str) {
            return new a(this.f101191b.a(str), this.f101192c, this.f101193d, this.f101194e);
        }

        public t0 c() {
            return this.f101191b;
        }

        public u d(int i11) {
            return this.f101191b.c(i11);
        }

        public int e(int i11) {
            return this.f101193d[i11];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f101192c == aVar.f101192c && this.f101191b.equals(aVar.f101191b) && Arrays.equals(this.f101193d, aVar.f101193d) && Arrays.equals(this.f101194e, aVar.f101194e)) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return this.f101191b.f101501c;
        }

        public boolean g() {
            return this.f101192c;
        }

        public boolean h() {
            return ru.a.a(this.f101194e, true);
        }

        public int hashCode() {
            return (((((this.f101191b.hashCode() * 31) + (this.f101192c ? 1 : 0)) * 31) + Arrays.hashCode(this.f101193d)) * 31) + Arrays.hashCode(this.f101194e);
        }

        public boolean i(boolean z11) {
            for (int i11 = 0; i11 < this.f101193d.length; i11++) {
                if (l(i11, z11)) {
                    return true;
                }
            }
            return false;
        }

        public boolean j(int i11) {
            return this.f101194e[i11];
        }

        public boolean k(int i11) {
            return l(i11, false);
        }

        public boolean l(int i11, boolean z11) {
            int i12 = this.f101193d[i11];
            if (i12 != 4) {
                return z11 && i12 == 3;
            }
            return true;
        }

        public Bundle m() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f101186f, this.f101191b.h());
            bundle.putIntArray(f101187g, this.f101193d);
            bundle.putBooleanArray(f101188h, this.f101194e);
            bundle.putBoolean(f101189i, this.f101192c);
            return bundle;
        }
    }

    public a1(List<a> list) {
        this.f101185a = com.google.common.collect.x.n(list);
    }

    public static a1 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101184c);
        return new a1(parcelableArrayList == null ? com.google.common.collect.x.r() : s7.i.d(new ou.h() { // from class: p7.z0
            @Override // ou.h
            public final Object apply(Object obj) {
                return a1.a.b((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public com.google.common.collect.x<a> b() {
        return this.f101185a;
    }

    public boolean c() {
        return this.f101185a.isEmpty();
    }

    public boolean d(int i11) {
        for (int i12 = 0; i12 < this.f101185a.size(); i12++) {
            a aVar = this.f101185a.get(i12);
            if (aVar.h() && aVar.f() == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i11) {
        return f(i11, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        return this.f101185a.equals(((a1) obj).f101185a);
    }

    public boolean f(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.f101185a.size(); i12++) {
            if (this.f101185a.get(i12).f() == i11 && this.f101185a.get(i12).i(z11)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f101184c, s7.i.h(this.f101185a, new ou.h() { // from class: p7.y0
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((a1.a) obj).m();
            }
        }));
        return bundle;
    }

    public int hashCode() {
        return this.f101185a.hashCode();
    }
}
