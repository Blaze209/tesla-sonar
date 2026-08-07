package js;

import gs.i;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<gs.b> f84333a;

    public b(List<gs.b> list) {
        this.f84333a = list;
    }

    @Override // gs.i
    public long a(int i11) {
        return 0L;
    }

    @Override // gs.i
    public int b() {
        return 1;
    }

    @Override // gs.i
    public int c(long j11) {
        return -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        return this.f84333a;
    }
}
