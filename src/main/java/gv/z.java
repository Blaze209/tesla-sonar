package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class z extends f0.e.AbstractC1441e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69992d;

    static final class b extends f0.e.AbstractC1441e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f69993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f69996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f69997e;

        b() {
        }

        @Override // gv.f0.e.AbstractC1441e.a
        public f0.e.AbstractC1441e a() {
            String str;
            String str2;
            if (this.f69997e == 3 && (str = this.f69994b) != null && (str2 = this.f69995c) != null) {
                return new z(this.f69993a, str, str2, this.f69996d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69997e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f69994b == null) {
                sb2.append(" version");
            }
            if (this.f69995c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f69997e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.AbstractC1441e.a
        public f0.e.AbstractC1441e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f69995c = str;
            return this;
        }

        @Override // gv.f0.e.AbstractC1441e.a
        public f0.e.AbstractC1441e.a c(boolean z11) {
            this.f69996d = z11;
            this.f69997e = (byte) (this.f69997e | 2);
            return this;
        }

        @Override // gv.f0.e.AbstractC1441e.a
        public f0.e.AbstractC1441e.a d(int i11) {
            this.f69993a = i11;
            this.f69997e = (byte) (this.f69997e | 1);
            return this;
        }

        @Override // gv.f0.e.AbstractC1441e.a
        public f0.e.AbstractC1441e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f69994b = str;
            return this;
        }
    }

    @Override // gv.f0.e.AbstractC1441e
    @NonNull
    public String b() {
        return this.f69991c;
    }

    @Override // gv.f0.e.AbstractC1441e
    public int c() {
        return this.f69989a;
    }

    @Override // gv.f0.e.AbstractC1441e
    @NonNull
    public String d() {
        return this.f69990b;
    }

    @Override // gv.f0.e.AbstractC1441e
    public boolean e() {
        return this.f69992d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.AbstractC1441e) {
            f0.e.AbstractC1441e abstractC1441e = (f0.e.AbstractC1441e) obj;
            if (this.f69989a == abstractC1441e.c() && this.f69990b.equals(abstractC1441e.d()) && this.f69991c.equals(abstractC1441e.b()) && this.f69992d == abstractC1441e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f69989a ^ 1000003) * 1000003) ^ this.f69990b.hashCode()) * 1000003) ^ this.f69991c.hashCode()) * 1000003) ^ (this.f69992d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f69989a + ", version=" + this.f69990b + ", buildVersion=" + this.f69991c + ", jailbroken=" + this.f69992d + "}";
    }

    private z(int i11, String str, String str2, boolean z11) {
        this.f69989a = i11;
        this.f69990b = str;
        this.f69991c = str2;
        this.f69992d = z11;
    }
}
