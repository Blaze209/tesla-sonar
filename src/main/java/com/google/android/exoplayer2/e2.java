package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.e2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e2 extends y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f39855e = ts.p0.t0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f39856f = ts.p0.t0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<e2> f39857g = new g.a() { // from class: br.n0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return e2.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f39859d;

    public e2() {
        this.f39858c = false;
        this.f39859d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e2 d(Bundle bundle) {
        ts.a.a(bundle.getInt(y1.f41386a, -1) == 3);
        return bundle.getBoolean(f39855e, false) ? new e2(bundle.getBoolean(f39856f, false)) : new e2();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f39859d == e2Var.f39859d && this.f39858c == e2Var.f39858c;
    }

    public int hashCode() {
        return ou.l.b(Boolean.valueOf(this.f39858c), Boolean.valueOf(this.f39859d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.f41386a, 3);
        bundle.putBoolean(f39855e, this.f39858c);
        bundle.putBoolean(f39856f, this.f39859d);
        return bundle;
    }

    public e2(boolean z11) {
        this.f39858c = true;
        this.f39859d = z11;
    }
}
