package hs;

import gs.i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<gs.b> f73623a;

    public f(List<gs.b> list) {
        this.f73623a = list;
    }

    @Override // gs.i
    public long a(int i11) {
        ts.a.a(i11 == 0);
        return 0L;
    }

    @Override // gs.i
    public int b() {
        return 1;
    }

    @Override // gs.i
    public int c(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        return j11 >= 0 ? this.f73623a : Collections.EMPTY_LIST;
    }
}
