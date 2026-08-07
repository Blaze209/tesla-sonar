package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.r1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class r1 extends y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f40312d = ts.p0.t0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.a<r1> f40313e = new g.a() { // from class: br.e0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return r1.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f40314c;

    public r1() {
        this.f40314c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r1 d(Bundle bundle) {
        ts.a.a(bundle.getInt(y1.f41386a, -1) == 1);
        float f11 = bundle.getFloat(f40312d, -1.0f);
        return f11 == -1.0f ? new r1() : new r1(f11);
    }

    public boolean equals(Object obj) {
        return (obj instanceof r1) && this.f40314c == ((r1) obj).f40314c;
    }

    public int hashCode() {
        return ou.l.b(Float.valueOf(this.f40314c));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.f41386a, 1);
        bundle.putFloat(f40312d, this.f40314c);
        return bundle;
    }

    public r1(float f11) {
        ts.a.b(f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f40314c = f11;
    }
}
