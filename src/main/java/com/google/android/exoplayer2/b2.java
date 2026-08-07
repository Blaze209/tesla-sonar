package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.b2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b2 extends y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f39674e = ts.p0.t0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f39675f = ts.p0.t0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<b2> f39676g = new g.a() { // from class: br.m0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return b2.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39678d;

    public b2(int i11) {
        ts.a.b(i11 > 0, "maxStars must be a positive integer");
        this.f39677c = i11;
        this.f39678d = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b2 d(Bundle bundle) {
        ts.a.a(bundle.getInt(y1.f41386a, -1) == 2);
        int i11 = bundle.getInt(f39674e, 5);
        float f11 = bundle.getFloat(f39675f, -1.0f);
        return f11 == -1.0f ? new b2(i11) : new b2(i11, f11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f39677c == b2Var.f39677c && this.f39678d == b2Var.f39678d;
    }

    public int hashCode() {
        return ou.l.b(Integer.valueOf(this.f39677c), Float.valueOf(this.f39678d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.f41386a, 2);
        bundle.putInt(f39674e, this.f39677c);
        bundle.putFloat(f39675f, this.f39678d);
        return bundle;
    }

    public b2(int i11, float f11) {
        boolean z11 = false;
        ts.a.b(i11 > 0, "maxStars must be a positive integer");
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= i11) {
            z11 = true;
        }
        ts.a.b(z11, "starRating is out of range [0, maxStars]");
        this.f39677c = i11;
        this.f39678d = f11;
    }
}
