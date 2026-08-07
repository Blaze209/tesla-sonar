package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class x extends f0.e.d.AbstractC1440e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69984b;

    static final class b extends f0.e.d.AbstractC1440e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69986b;

        b() {
        }

        @Override // gv.f0.e.d.AbstractC1440e.b.a
        public f0.e.d.AbstractC1440e.b a() {
            String str;
            String str2 = this.f69985a;
            if (str2 != null && (str = this.f69986b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69985a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f69986b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.AbstractC1440e.b.a
        public f0.e.d.AbstractC1440e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f69985a = str;
            return this;
        }

        @Override // gv.f0.e.d.AbstractC1440e.b.a
        public f0.e.d.AbstractC1440e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f69986b = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.AbstractC1440e.b
    @NonNull
    public String b() {
        return this.f69983a;
    }

    @Override // gv.f0.e.d.AbstractC1440e.b
    @NonNull
    public String c() {
        return this.f69984b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC1440e.b) {
            f0.e.d.AbstractC1440e.b bVar = (f0.e.d.AbstractC1440e.b) obj;
            if (this.f69983a.equals(bVar.b()) && this.f69984b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f69983a.hashCode() ^ 1000003) * 1000003) ^ this.f69984b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f69983a + ", variantId=" + this.f69984b + "}";
    }

    private x(String str, String str2) {
        this.f69983a = str;
        this.f69984b = str2;
    }
}
