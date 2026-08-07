package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class p extends f0.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> f69916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.e.d.a.b.c f69917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69918e;

    static final class b extends f0.e.d.a.b.c.AbstractC1431a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> f69921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.e.d.a.b.c f69922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f69923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f69924f;

        b() {
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c a() {
            String str;
            List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list;
            if (this.f69924f == 1 && (str = this.f69919a) != null && (list = this.f69921c) != null) {
                return new p(str, this.f69920b, list, this.f69922d, this.f69923e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69919a == null) {
                sb2.append(" type");
            }
            if (this.f69921c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f69924f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c.AbstractC1431a b(f0.e.d.a.b.c cVar) {
            this.f69922d = cVar;
            return this;
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c.AbstractC1431a c(List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f69921c = list;
            return this;
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c.AbstractC1431a d(int i11) {
            this.f69923e = i11;
            this.f69924f = (byte) (this.f69924f | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c.AbstractC1431a e(String str) {
            this.f69920b = str;
            return this;
        }

        @Override // gv.f0.e.d.a.b.c.AbstractC1431a
        public f0.e.d.a.b.c.AbstractC1431a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f69919a = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b.c
    public f0.e.d.a.b.c b() {
        return this.f69917d;
    }

    @Override // gv.f0.e.d.a.b.c
    @NonNull
    public List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> c() {
        return this.f69916c;
    }

    @Override // gv.f0.e.d.a.b.c
    public int d() {
        return this.f69918e;
    }

    @Override // gv.f0.e.d.a.b.c
    public String e() {
        return this.f69915b;
    }

    public boolean equals(Object obj) {
        String str;
        f0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b.c) {
            f0.e.d.a.b.c cVar2 = (f0.e.d.a.b.c) obj;
            if (this.f69914a.equals(cVar2.f()) && ((str = this.f69915b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f69916c.equals(cVar2.c()) && ((cVar = this.f69917d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f69918e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.d.a.b.c
    @NonNull
    public String f() {
        return this.f69914a;
    }

    public int hashCode() {
        int iHashCode = (this.f69914a.hashCode() ^ 1000003) * 1000003;
        String str = this.f69915b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f69916c.hashCode()) * 1000003;
        f0.e.d.a.b.c cVar = this.f69917d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f69918e;
    }

    public String toString() {
        return "Exception{type=" + this.f69914a + ", reason=" + this.f69915b + ", frames=" + this.f69916c + ", causedBy=" + this.f69917d + ", overflowCount=" + this.f69918e + "}";
    }

    private p(String str, String str2, List<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> list, f0.e.d.a.b.c cVar, int i11) {
        this.f69914a = str;
        this.f69915b = str2;
        this.f69916c = list;
        this.f69917d = cVar;
        this.f69918e = i11;
    }
}
