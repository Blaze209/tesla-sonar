package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.v0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v0 extends y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41109e = ts.p0.t0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41110f = ts.p0.t0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<v0> f41111g = new g.a() { // from class: br.s
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return v0.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41113d;

    public v0() {
        this.f41112c = false;
        this.f41113d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v0 d(Bundle bundle) {
        ts.a.a(bundle.getInt(y1.f41386a, -1) == 0);
        return bundle.getBoolean(f41109e, false) ? new v0(bundle.getBoolean(f41110f, false)) : new v0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f41113d == v0Var.f41113d && this.f41112c == v0Var.f41112c;
    }

    public int hashCode() {
        return ou.l.b(Boolean.valueOf(this.f41112c), Boolean.valueOf(this.f41113d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.f41386a, 0);
        bundle.putBoolean(f41109e, this.f41112c);
        bundle.putBoolean(f41110f, this.f41113d);
        return bundle;
    }

    public v0(boolean z11) {
        this.f41112c = true;
        this.f41113d = z11;
    }
}
