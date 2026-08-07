package ls;

import gs.i;
import java.util.Collections;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<List<gs.b>> f90735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Long> f90736b;

    public d(List<List<gs.b>> list, List<Long> list2) {
        this.f90735a = list;
        this.f90736b = list2;
    }

    @Override // gs.i
    public long a(int i11) {
        ts.a.a(i11 >= 0);
        ts.a.a(i11 < this.f90736b.size());
        return this.f90736b.get(i11).longValue();
    }

    @Override // gs.i
    public int b() {
        return this.f90736b.size();
    }

    @Override // gs.i
    public int c(long j11) {
        int iD = p0.d(this.f90736b, Long.valueOf(j11), false, false);
        if (iD < this.f90736b.size()) {
            return iD;
        }
        return -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        int iF = p0.f(this.f90736b, Long.valueOf(j11), true, false);
        return iF == -1 ? Collections.EMPTY_LIST : this.f90735a.get(iF);
    }
}
