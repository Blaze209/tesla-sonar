package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class n extends f0.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC1434e> f69895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0.e.d.a.b.c f69896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0.a f69897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.e.d.a.b.AbstractC1432d f69898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC1428a> f69899e;

    static final class b extends f0.e.d.a.b.AbstractC1430b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC1434e> f69900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f0.e.d.a.b.c f69901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f0.a f69902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.e.d.a.b.AbstractC1432d f69903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC1428a> f69904e;

        b() {
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b a() {
            List<f0.e.d.a.b.AbstractC1428a> list;
            f0.e.d.a.b.AbstractC1432d abstractC1432d = this.f69903d;
            if (abstractC1432d != null && (list = this.f69904e) != null) {
                return new n(this.f69900a, this.f69901b, this.f69902c, abstractC1432d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69903d == null) {
                sb2.append(" signal");
            }
            if (this.f69904e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b.AbstractC1430b b(f0.a aVar) {
            this.f69902c = aVar;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b.AbstractC1430b c(List<f0.e.d.a.b.AbstractC1428a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f69904e = list;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b.AbstractC1430b d(f0.e.d.a.b.c cVar) {
            this.f69901b = cVar;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b.AbstractC1430b e(f0.e.d.a.b.AbstractC1432d abstractC1432d) {
            if (abstractC1432d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f69903d = abstractC1432d;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1430b
        public f0.e.d.a.b.AbstractC1430b f(List<f0.e.d.a.b.AbstractC1434e> list) {
            this.f69900a = list;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b
    public f0.a b() {
        return this.f69897c;
    }

    @Override // gv.f0.e.d.a.b
    @NonNull
    public List<f0.e.d.a.b.AbstractC1428a> c() {
        return this.f69899e;
    }

    @Override // gv.f0.e.d.a.b
    public f0.e.d.a.b.c d() {
        return this.f69896b;
    }

    @Override // gv.f0.e.d.a.b
    @NonNull
    public f0.e.d.a.b.AbstractC1432d e() {
        return this.f69898d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b) {
            f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
            List<f0.e.d.a.b.AbstractC1434e> list = this.f69895a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                f0.e.d.a.b.c cVar = this.f69896b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    f0.a aVar = this.f69897c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f69898d.equals(bVar.e()) && this.f69899e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // gv.f0.e.d.a.b
    public List<f0.e.d.a.b.AbstractC1434e> f() {
        return this.f69895a;
    }

    public int hashCode() {
        List<f0.e.d.a.b.AbstractC1434e> list = this.f69895a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.e.d.a.b.c cVar = this.f69896b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f0.a aVar = this.f69897c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f69898d.hashCode()) * 1000003) ^ this.f69899e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f69895a + ", exception=" + this.f69896b + ", appExitInfo=" + this.f69897c + ", signal=" + this.f69898d + ", binaries=" + this.f69899e + "}";
    }

    private n(List<f0.e.d.a.b.AbstractC1434e> list, f0.e.d.a.b.c cVar, f0.a aVar, f0.e.d.a.b.AbstractC1432d abstractC1432d, List<f0.e.d.a.b.AbstractC1428a> list2) {
        this.f69895a = list;
        this.f69896b = cVar;
        this.f69897c = aVar;
        this.f69898d = abstractC1432d;
        this.f69899e = list2;
    }
}
