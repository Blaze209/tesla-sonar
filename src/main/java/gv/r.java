package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class r extends f0.e.d.a.b.AbstractC1434e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> f69934c;

    static final class b extends f0.e.d.a.b.AbstractC1434e.AbstractC1435a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> f69937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f69938d;

        b() {
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1435a
        public f0.e.d.a.b.AbstractC1434e a() {
            String str;
            List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list;
            if (this.f69938d == 1 && (str = this.f69935a) != null && (list = this.f69937c) != null) {
                return new r(str, this.f69936b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69935a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f69938d) == 0) {
                sb2.append(" importance");
            }
            if (this.f69937c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1435a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1435a b(List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f69937c = list;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1435a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1435a c(int i11) {
            this.f69936b = i11;
            this.f69938d = (byte) (this.f69938d | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1435a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1435a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f69935a = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e
    @NonNull
    public List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> b() {
        return this.f69934c;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e
    public int c() {
        return this.f69933b;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e
    @NonNull
    public String d() {
        return this.f69932a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b.AbstractC1434e) {
            f0.e.d.a.b.AbstractC1434e abstractC1434e = (f0.e.d.a.b.AbstractC1434e) obj;
            if (this.f69932a.equals(abstractC1434e.d()) && this.f69933b == abstractC1434e.c() && this.f69934c.equals(abstractC1434e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f69932a.hashCode() ^ 1000003) * 1000003) ^ this.f69933b) * 1000003) ^ this.f69934c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f69932a + ", importance=" + this.f69933b + ", frames=" + this.f69934c + "}";
    }

    private r(String str, int i11, List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list) {
        this.f69932a = str;
        this.f69933b = i11;
        this.f69934c = list;
    }
}
