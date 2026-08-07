package os;

import gs.i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f99989b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<gs.b> f99990a;

    public b(gs.b bVar) {
        this.f99990a = Collections.singletonList(bVar);
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
        return j11 >= 0 ? this.f99990a : Collections.EMPTY_LIST;
    }

    private b() {
        this.f99990a = Collections.EMPTY_LIST;
    }
}
