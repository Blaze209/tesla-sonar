package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.y1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class y1 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f41386a = ts.p0.t0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.a<y1> f41387b = new g.a() { // from class: br.i0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return y1.b(bundle);
        }
    };

    y1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y1 b(Bundle bundle) {
        int i11 = bundle.getInt(f41386a, -1);
        if (i11 == 0) {
            return (y1) v0.f41111g.a(bundle);
        }
        if (i11 == 1) {
            return (y1) r1.f40313e.a(bundle);
        }
        if (i11 == 2) {
            return (y1) b2.f39676g.a(bundle);
        }
        if (i11 == 3) {
            return (y1) e2.f39857g.a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i11);
    }
}
