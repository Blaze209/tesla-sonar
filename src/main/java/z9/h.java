package z9;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import s7.q0;
import t9.j;

/* JADX INFO: loaded from: classes3.dex */
final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f127964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f127965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f127966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f127967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f127968e;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f127964a = cVar;
        this.f127967d = map2;
        this.f127968e = map3;
        this.f127966c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f127965b = cVar.j();
    }

    @Override // t9.j
    public long a(int i11) {
        return this.f127965b[i11];
    }

    @Override // t9.j
    public int b() {
        return this.f127965b.length;
    }

    @Override // t9.j
    public int c(long j11) {
        int iG = q0.g(this.f127965b, j11, false, false);
        if (iG < this.f127965b.length) {
            return iG;
        }
        return -1;
    }

    @Override // t9.j
    public List<r7.a> d(long j11) {
        return this.f127964a.h(j11, this.f127966c, this.f127967d, this.f127968e);
    }
}
