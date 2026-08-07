package w7;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.datasource.cache.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet<c> f121104b = new TreeSet<>(new Comparator() { // from class: w7.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h.h((c) obj, (c) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f121105c;

    public h(long j11) {
        this.f121103a = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(c cVar, c cVar2) {
        long j11 = cVar.f121097f;
        long j12 = cVar2.f121097f;
        if (j11 - j12 == 0) {
            return cVar.compareTo(cVar2);
        }
        return j11 < j12 ? -1 : 1;
    }

    private void i(Cache cache, long j11) {
        while (this.f121105c + j11 > this.f121103a && !this.f121104b.isEmpty()) {
            cache.f(this.f121104b.first());
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public boolean a() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.b
    public void b(Cache cache, String str, long j11, long j12) {
        if (j12 != -1) {
            i(cache, j12);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void c(Cache cache, c cVar, c cVar2) {
        f(cache, cVar);
        e(cache, cVar2);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void e(Cache cache, c cVar) {
        this.f121104b.add(cVar);
        this.f121105c += cVar.f121094c;
        i(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void f(Cache cache, c cVar) {
        this.f121104b.remove(cVar);
        this.f121105c -= cVar.f121094c;
    }

    @Override // androidx.media3.datasource.cache.b
    public void d() {
    }
}
