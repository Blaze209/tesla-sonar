package is;

import gs.i;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<gs.b> f81870a;

    public c(List<gs.b> list) {
        this.f81870a = list;
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
        return this.f81870a;
    }
}
