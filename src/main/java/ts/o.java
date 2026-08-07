package ts;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f115028a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f115029a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f115030b;

        public b a(int i11) {
            ts.a.g(!this.f115030b);
            this.f115029a.append(i11, true);
            return this;
        }

        public b b(o oVar) {
            for (int i11 = 0; i11 < oVar.d(); i11++) {
                a(oVar.c(i11));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i11 : iArr) {
                a(i11);
            }
            return this;
        }

        public b d(int i11, boolean z11) {
            return z11 ? a(i11) : this;
        }

        public o e() {
            ts.a.g(!this.f115030b);
            this.f115030b = true;
            return new o(this.f115029a);
        }
    }

    public boolean a(int i11) {
        return this.f115028a.get(i11);
    }

    public boolean b(int... iArr) {
        for (int i11 : iArr) {
            if (a(i11)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i11) {
        ts.a.c(i11, 0, d());
        return this.f115028a.keyAt(i11);
    }

    public int d() {
        return this.f115028a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (p0.f115040a >= 24) {
            return this.f115028a.equals(oVar.f115028a);
        }
        if (d() != oVar.d()) {
            return false;
        }
        for (int i11 = 0; i11 < d(); i11++) {
            if (c(i11) != oVar.c(i11)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (p0.f115040a >= 24) {
            return this.f115028a.hashCode();
        }
        int iD = d();
        for (int i11 = 0; i11 < d(); i11++) {
            iD = (iD * 31) + c(i11);
        }
        return iD;
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f115028a = sparseBooleanArray;
    }
}
