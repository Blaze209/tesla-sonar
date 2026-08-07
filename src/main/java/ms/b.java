package ms;

import gs.i;
import java.util.Collections;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gs.b[] f92507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f92508b;

    public b(gs.b[] bVarArr, long[] jArr) {
        this.f92507a = bVarArr;
        this.f92508b = jArr;
    }

    @Override // gs.i
    public long a(int i11) {
        ts.a.a(i11 >= 0);
        ts.a.a(i11 < this.f92508b.length);
        return this.f92508b[i11];
    }

    @Override // gs.i
    public int b() {
        return this.f92508b.length;
    }

    @Override // gs.i
    public int c(long j11) {
        int iE = p0.e(this.f92508b, j11, false, false);
        if (iE < this.f92508b.length) {
            return iE;
        }
        return -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        gs.b bVar;
        int i11 = p0.i(this.f92508b, j11, true, false);
        return (i11 == -1 || (bVar = this.f92507a[i11]) == gs.b.f69464r) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }
}
