package n8;

import android.os.Bundle;
import com.google.common.collect.f0;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f93613d = new y(new t0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f93614e = q0.N0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.collect.x<t0> f93616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93617c;

    public y(t0... t0VarArr) {
        this.f93616b = com.google.common.collect.x.o(t0VarArr);
        this.f93615a = t0VarArr.length;
        f();
    }

    private void f() {
        int i11 = 0;
        while (i11 < this.f93616b.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f93616b.size(); i13++) {
                if (this.f93616b.get(i11).equals(this.f93616b.get(i13))) {
                    s7.t.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    public t0 b(int i11) {
        return this.f93616b.get(i11);
    }

    public com.google.common.collect.x<Integer> c() {
        return com.google.common.collect.x.n(f0.j(this.f93616b, new ou.h() { // from class: n8.x
            @Override // ou.h
            public final Object apply(Object obj) {
                return Integer.valueOf(((t0) obj).f101501c);
            }
        }));
    }

    public int d(t0 t0Var) {
        int iIndexOf = this.f93616b.indexOf(t0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f93614e, s7.i.h(this.f93616b, new ou.h() { // from class: n8.w
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((t0) obj).h();
            }
        }));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f93615a == yVar.f93615a && this.f93616b.equals(yVar.f93616b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f93617c == 0) {
            this.f93617c = this.f93616b.hashCode();
        }
        return this.f93617c;
    }

    public String toString() {
        return this.f93616b.toString();
    }
}
