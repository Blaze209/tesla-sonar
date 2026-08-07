package u9;

import java.util.Collections;
import java.util.List;
import t9.j;

/* JADX INFO: loaded from: classes3.dex */
final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<r7.a> f116042a;

    public f(List<r7.a> list) {
        this.f116042a = list;
    }

    @Override // t9.j
    public long a(int i11) {
        s7.a.a(i11 == 0);
        return 0L;
    }

    @Override // t9.j
    public int b() {
        return 1;
    }

    @Override // t9.j
    public int c(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // t9.j
    public List<r7.a> d(long j11) {
        return j11 >= 0 ? this.f116042a : Collections.EMPTY_LIST;
    }
}
