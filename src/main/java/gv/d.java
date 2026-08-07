package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class d extends f0.a.AbstractC1424a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69779c;

    static final class b extends f0.a.AbstractC1424a.AbstractC1425a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69782c;

        b() {
        }

        @Override // gv.f0.a.AbstractC1424a.AbstractC1425a
        public f0.a.AbstractC1424a a() {
            String str;
            String str2;
            String str3 = this.f69780a;
            if (str3 != null && (str = this.f69781b) != null && (str2 = this.f69782c) != null) {
                return new d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69780a == null) {
                sb2.append(" arch");
            }
            if (this.f69781b == null) {
                sb2.append(" libraryName");
            }
            if (this.f69782c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.a.AbstractC1424a.AbstractC1425a
        public f0.a.AbstractC1424a.AbstractC1425a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f69780a = str;
            return this;
        }

        @Override // gv.f0.a.AbstractC1424a.AbstractC1425a
        public f0.a.AbstractC1424a.AbstractC1425a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f69782c = str;
            return this;
        }

        @Override // gv.f0.a.AbstractC1424a.AbstractC1425a
        public f0.a.AbstractC1424a.AbstractC1425a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f69781b = str;
            return this;
        }
    }

    @Override // gv.f0.a.AbstractC1424a
    @NonNull
    public String b() {
        return this.f69777a;
    }

    @Override // gv.f0.a.AbstractC1424a
    @NonNull
    public String c() {
        return this.f69779c;
    }

    @Override // gv.f0.a.AbstractC1424a
    @NonNull
    public String d() {
        return this.f69778b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a.AbstractC1424a) {
            f0.a.AbstractC1424a abstractC1424a = (f0.a.AbstractC1424a) obj;
            if (this.f69777a.equals(abstractC1424a.b()) && this.f69778b.equals(abstractC1424a.d()) && this.f69779c.equals(abstractC1424a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f69777a.hashCode() ^ 1000003) * 1000003) ^ this.f69778b.hashCode()) * 1000003) ^ this.f69779c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f69777a + ", libraryName=" + this.f69778b + ", buildId=" + this.f69779c + "}";
    }

    private d(String str, String str2, String str3) {
        this.f69777a = str;
        this.f69778b = str2;
        this.f69779c = str3;
    }
}
