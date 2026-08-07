package gs;

import android.os.Bundle;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f69507c = new f(x.r(), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69508d = p0.t0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f69509e = p0.t0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<f> f69510f = new com.google.android.exoplayer2.g.a() { // from class: gs.e
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return f.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<b> f69511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69512b;

    public f(List<b> list, long j11) {
        this.f69511a = x.n(list);
        this.f69512b = j11;
    }

    private static x<b> b(List<b> list) {
        x.a aVarK = x.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).f69476d == null) {
                aVarK.a(list.get(i11));
            }
        }
        return aVarK.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f69508d);
        return new f(parcelableArrayList == null ? x.r() : ts.c.d(b.J, parcelableArrayList), bundle.getLong(f69509e));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f69508d, ts.c.i(b(this.f69511a)));
        bundle.putLong(f69509e, this.f69512b);
        return bundle;
    }
}
