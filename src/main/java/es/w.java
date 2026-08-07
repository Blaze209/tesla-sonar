package es;

import android.os.Bundle;
import com.google.common.collect.x;
import java.util.ArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f63210d = new w(new u[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63211e = p0.t0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<w> f63212f = new com.google.android.exoplayer2.g.a() { // from class: es.v
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return w.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x<u> f63214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63215c;

    public w(u... uVarArr) {
        this.f63214b = x.o(uVarArr);
        this.f63213a = uVarArr.length;
        d();
    }

    public static /* synthetic */ w a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f63211e);
        return parcelableArrayList == null ? new w(new u[0]) : new w((u[]) ts.c.d(u.f63204h, parcelableArrayList).toArray(new u[0]));
    }

    private void d() {
        int i11 = 0;
        while (i11 < this.f63214b.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f63214b.size(); i13++) {
                if (this.f63214b.get(i11).equals(this.f63214b.get(i13))) {
                    ts.u.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    public u b(int i11) {
        return this.f63214b.get(i11);
    }

    public int c(u uVar) {
        int iIndexOf = this.f63214b.indexOf(uVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f63213a == wVar.f63213a && this.f63214b.equals(wVar.f63214b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f63215c == 0) {
            this.f63215c = this.f63214b.hashCode();
        }
        return this.f63215c;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f63211e, ts.c.i(this.f63214b));
        return bundle;
    }
}
