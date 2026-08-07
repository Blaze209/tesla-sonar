package p7;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f101448a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f101449a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f101450b;

        public b a(int i11) {
            s7.a.h(!this.f101450b);
            this.f101449a.append(i11, true);
            return this;
        }

        public b b(q qVar) {
            for (int i11 = 0; i11 < qVar.d(); i11++) {
                a(qVar.c(i11));
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

        public q e() {
            s7.a.h(!this.f101450b);
            this.f101450b = true;
            return new q(this.f101449a);
        }
    }

    public boolean a(int i11) {
        return this.f101448a.get(i11);
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
        s7.a.c(i11, 0, d());
        return this.f101448a.keyAt(i11);
    }

    public int d() {
        return this.f101448a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f101448a.equals(((q) obj).f101448a);
        }
        return false;
    }

    public int hashCode() {
        return this.f101448a.hashCode();
    }

    private q(SparseBooleanArray sparseBooleanArray) {
        this.f101448a = sparseBooleanArray;
    }
}
