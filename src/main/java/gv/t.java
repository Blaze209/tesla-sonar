package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class t extends f0.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69953d;

    static final class b extends f0.e.d.a.c.AbstractC1438a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f69956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f69957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f69958e;

        b() {
        }

        @Override // gv.f0.e.d.a.c.AbstractC1438a
        public f0.e.d.a.c a() {
            String str;
            if (this.f69958e == 7 && (str = this.f69954a) != null) {
                return new t(str, this.f69955b, this.f69956c, this.f69957d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69954a == null) {
                sb2.append(" processName");
            }
            if ((this.f69958e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f69958e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f69958e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.c.AbstractC1438a
        public f0.e.d.a.c.AbstractC1438a b(boolean z11) {
            this.f69957d = z11;
            this.f69958e = (byte) (this.f69958e | 4);
            return this;
        }

        @Override // gv.f0.e.d.a.c.AbstractC1438a
        public f0.e.d.a.c.AbstractC1438a c(int i11) {
            this.f69956c = i11;
            this.f69958e = (byte) (this.f69958e | 2);
            return this;
        }

        @Override // gv.f0.e.d.a.c.AbstractC1438a
        public f0.e.d.a.c.AbstractC1438a d(int i11) {
            this.f69955b = i11;
            this.f69958e = (byte) (this.f69958e | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.c.AbstractC1438a
        public f0.e.d.a.c.AbstractC1438a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f69954a = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.c
    public int b() {
        return this.f69952c;
    }

    @Override // gv.f0.e.d.a.c
    public int c() {
        return this.f69951b;
    }

    @Override // gv.f0.e.d.a.c
    @NonNull
    public String d() {
        return this.f69950a;
    }

    @Override // gv.f0.e.d.a.c
    public boolean e() {
        return this.f69953d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.c) {
            f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
            if (this.f69950a.equals(cVar.d()) && this.f69951b == cVar.c() && this.f69952c == cVar.b() && this.f69953d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f69950a.hashCode() ^ 1000003) * 1000003) ^ this.f69951b) * 1000003) ^ this.f69952c) * 1000003) ^ (this.f69953d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f69950a + ", pid=" + this.f69951b + ", importance=" + this.f69952c + ", defaultProcess=" + this.f69953d + "}";
    }

    private t(String str, int i11, int i12, boolean z11) {
        this.f69950a = str;
        this.f69951b = i11;
        this.f69952c = i12;
        this.f69953d = z11;
    }
}
