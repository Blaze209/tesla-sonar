package qs;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f106084c = p0.t0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f106085d = p0.t0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<w> f106086e = new com.google.android.exoplayer2.g.a() { // from class: qs.v
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return w.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es.u f106087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.x<Integer> f106088b;

    public w(es.u uVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= uVar.f63205a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f106087a = uVar;
        this.f106088b = com.google.common.collect.x.n(list);
    }

    public static /* synthetic */ w a(Bundle bundle) {
        return new w((es.u) es.u.f63204h.a((Bundle) ts.a.e(bundle.getBundle(f106084c))), ru.f.c((int[]) ts.a.e(bundle.getIntArray(f106085d))));
    }

    public int b() {
        return this.f106087a.f63207c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f106087a.equals(wVar.f106087a) && this.f106088b.equals(wVar.f106088b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f106087a.hashCode() + (this.f106088b.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f106084c, this.f106087a.toBundle());
        bundle.putIntArray(f106085d, ru.f.n(this.f106088b));
        return bundle;
    }
}
