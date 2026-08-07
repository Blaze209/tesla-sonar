package el;

import java.util.List;
import pk.n;
import pk.o;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pk.f<tm.a> f63029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f63030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<Boolean> f63031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bm.g f63032d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<tm.a> f63033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n<Boolean> f63034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f63035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private bm.g f63036d;

        public b e() {
            return new b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public pk.f<tm.a> a() {
        return this.f63029a;
    }

    public n<Boolean> b() {
        return this.f63031c;
    }

    public bm.g c() {
        return this.f63032d;
    }

    public h d() {
        return this.f63030b;
    }

    private b(a aVar) {
        this.f63029a = aVar.f63033a != null ? pk.f.a(aVar.f63033a) : null;
        this.f63031c = aVar.f63034b != null ? aVar.f63034b : o.a(Boolean.FALSE);
        this.f63030b = aVar.f63035c;
        this.f63032d = aVar.f63036d;
    }
}
