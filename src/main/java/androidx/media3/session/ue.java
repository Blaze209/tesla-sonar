package androidx.media3.session;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ue {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p7.j0.e f12444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ue f12445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f12446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f12447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f12448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f12449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f12450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f12451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f12452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f12453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f12454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f12455v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.j0.e f12456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12465j;

    static {
        p7.j0.e eVar = new p7.j0.e(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f12444k = eVar;
        f12445l = new ue(eVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        f12446m = s7.q0.N0(0);
        f12447n = s7.q0.N0(1);
        f12448o = s7.q0.N0(2);
        f12449p = s7.q0.N0(3);
        f12450q = s7.q0.N0(4);
        f12451r = s7.q0.N0(5);
        f12452s = s7.q0.N0(6);
        f12453t = s7.q0.N0(7);
        f12454u = s7.q0.N0(8);
        f12455v = s7.q0.N0(9);
    }

    public ue(p7.j0.e eVar, boolean z11, long j11, long j12, long j13, int i11, long j14, long j15, long j16, long j17) {
        s7.a.a(z11 == (eVar.f101403i != -1));
        this.f12456a = eVar;
        this.f12457b = z11;
        this.f12458c = j11;
        this.f12459d = j12;
        this.f12460e = j13;
        this.f12461f = i11;
        this.f12462g = j14;
        this.f12463h = j15;
        this.f12464i = j16;
        this.f12465j = j17;
    }

    public static ue b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f12446m);
        return new ue(bundle2 == null ? f12444k : p7.j0.e.c(bundle2), bundle.getBoolean(f12447n, false), bundle.getLong(f12448o, -9223372036854775807L), bundle.getLong(f12449p, -9223372036854775807L), bundle.getLong(f12450q, 0L), bundle.getInt(f12451r, 0), bundle.getLong(f12452s, 0L), bundle.getLong(f12453t, -9223372036854775807L), bundle.getLong(f12454u, -9223372036854775807L), bundle.getLong(f12455v, 0L));
    }

    public ue a(boolean z11, boolean z12) {
        long j11;
        long j12;
        long j13;
        if (z11 && z12) {
            return this;
        }
        p7.j0.e eVarB = this.f12456a.b(z11, z12);
        boolean z13 = z11 && this.f12457b;
        long j14 = this.f12458c;
        long j15 = z11 ? this.f12459d : -9223372036854775807L;
        long j16 = z11 ? this.f12460e : 0L;
        int i11 = z11 ? this.f12461f : 0;
        long j17 = z11 ? this.f12462g : 0L;
        long j18 = z11 ? this.f12463h : -9223372036854775807L;
        long j19 = z11 ? this.f12464i : -9223372036854775807L;
        if (z11) {
            j11 = j15;
            j13 = this.f12465j;
            j12 = j19;
        } else {
            j11 = j15;
            j12 = j19;
            j13 = 0;
        }
        new ue(eVarB, z13, j14, j11, j16, i11, j17, j18, j12, j13);
        return r3;
    }

    public Bundle c(int i11) {
        Bundle bundle = new Bundle();
        if (i11 < 3 || !f12444k.a(this.f12456a)) {
            bundle.putBundle(f12446m, this.f12456a.d(i11));
        }
        boolean z11 = this.f12457b;
        if (z11) {
            bundle.putBoolean(f12447n, z11);
        }
        long j11 = this.f12458c;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f12448o, j11);
        }
        long j12 = this.f12459d;
        if (j12 != -9223372036854775807L) {
            bundle.putLong(f12449p, j12);
        }
        if (i11 < 3 || this.f12460e != 0) {
            bundle.putLong(f12450q, this.f12460e);
        }
        int i12 = this.f12461f;
        if (i12 != 0) {
            bundle.putInt(f12451r, i12);
        }
        long j13 = this.f12462g;
        if (j13 != 0) {
            bundle.putLong(f12452s, j13);
        }
        long j14 = this.f12463h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f12453t, j14);
        }
        long j15 = this.f12464i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f12454u, j15);
        }
        if (i11 >= 3 && this.f12465j == 0) {
            return bundle;
        }
        bundle.putLong(f12455v, this.f12465j);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ue.class == obj.getClass()) {
            ue ueVar = (ue) obj;
            if (this.f12458c == ueVar.f12458c && this.f12456a.equals(ueVar.f12456a) && this.f12457b == ueVar.f12457b && this.f12459d == ueVar.f12459d && this.f12460e == ueVar.f12460e && this.f12461f == ueVar.f12461f && this.f12462g == ueVar.f12462g && this.f12463h == ueVar.f12463h && this.f12464i == ueVar.f12464i && this.f12465j == ueVar.f12465j) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f12456a, Boolean.valueOf(this.f12457b));
    }

    public String toString() {
        return "SessionPositionInfo {PositionInfo {mediaItemIndex=" + this.f12456a.f101397c + ", periodIndex=" + this.f12456a.f101400f + ", positionMs=" + this.f12456a.f101401g + ", contentPositionMs=" + this.f12456a.f101402h + ", adGroupIndex=" + this.f12456a.f101403i + ", adIndexInAdGroup=" + this.f12456a.f101404j + "}, isPlayingAd=" + this.f12457b + ", eventTimeMs=" + this.f12458c + ", durationMs=" + this.f12459d + ", bufferedPositionMs=" + this.f12460e + ", bufferedPercentage=" + this.f12461f + ", totalBufferedDurationMs=" + this.f12462g + ", currentLiveOffsetMs=" + this.f12463h + ", contentDurationMs=" + this.f12464i + ", contentBufferedPositionMs=" + this.f12465j + "}";
    }
}
