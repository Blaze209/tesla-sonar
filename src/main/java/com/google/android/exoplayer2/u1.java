package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.u1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u1 implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u1 f40753d = new u1(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40754e = ts.p0.t0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f40755f = ts.p0.t0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<u1> f40756g = new g.a() { // from class: br.f0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return u1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40759c;

    public u1(float f11) {
        this(f11, 1.0f);
    }

    public static /* synthetic */ u1 a(Bundle bundle) {
        return new u1(bundle.getFloat(f40754e, 1.0f), bundle.getFloat(f40755f, 1.0f));
    }

    public long b(long j11) {
        return j11 * ((long) this.f40759c);
    }

    public u1 c(float f11) {
        return new u1(f11, this.f40758b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class == obj.getClass()) {
            u1 u1Var = (u1) obj;
            if (this.f40757a == u1Var.f40757a && this.f40758b == u1Var.f40758b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f40757a)) * 31) + Float.floatToRawIntBits(this.f40758b);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f40754e, this.f40757a);
        bundle.putFloat(f40755f, this.f40758b);
        return bundle;
    }

    public String toString() {
        return ts.p0.B("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f40757a), Float.valueOf(this.f40758b));
    }

    public u1(float f11, float f12) {
        ts.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        ts.a.a(f12 > BitmapDescriptorFactory.HUE_RED);
        this.f40757a = f11;
        this.f40758b = f12;
        this.f40759c = Math.round(f11 * 1000.0f);
    }
}
