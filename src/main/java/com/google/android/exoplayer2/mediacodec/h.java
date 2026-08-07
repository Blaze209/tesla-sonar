package com.google.android.exoplayer2.mediacodec;

import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40240a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40241b;

    @Override // com.google.android.exoplayer2.mediacodec.j.b
    public j a(j.a aVar) {
        int i11;
        int i12 = p0.f115040a;
        if (i12 < 23 || ((i11 = this.f40240a) != 1 && (i11 != 0 || i12 < 31))) {
            return new q.b().a(aVar);
        }
        int i13 = y.i(aVar.f40249c.f40712l);
        u.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + p0.k0(i13));
        return new b.C0651b(i13, this.f40241b).a(aVar);
    }
}
