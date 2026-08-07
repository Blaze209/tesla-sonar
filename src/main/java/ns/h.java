package ns;

import gs.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f95437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f95438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f95439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f95440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f95441e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f95437a = dVar;
        this.f95440d = map2;
        this.f95441e = map3;
        this.f95439c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f95438b = dVar.j();
    }

    @Override // gs.i
    public long a(int i11) {
        return this.f95438b[i11];
    }

    @Override // gs.i
    public int b() {
        return this.f95438b.length;
    }

    @Override // gs.i
    public int c(long j11) {
        int iE = p0.e(this.f95438b, j11, false, false);
        if (iE < this.f95438b.length) {
            return iE;
        }
        return -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        return this.f95437a.h(j11, this.f95439c, this.f95440d, this.f95441e);
    }
}
