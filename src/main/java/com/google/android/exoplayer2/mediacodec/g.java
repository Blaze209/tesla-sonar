package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import dr.t;
import java.nio.ByteBuffer;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40239c;

    g() {
    }

    private long a(long j11) {
        return this.f40237a + Math.max(0L, ((this.f40238b - 529) * 1000000) / j11);
    }

    public long b(u0 u0Var) {
        return a(u0Var.f40726z);
    }

    public void c() {
        this.f40237a = 0L;
        this.f40238b = 0L;
        this.f40239c = false;
    }

    public long d(u0 u0Var, DecoderInputBuffer decoderInputBuffer) {
        if (this.f40238b == 0) {
            this.f40237a = decoderInputBuffer.f39722e;
        }
        if (this.f40239c) {
            return decoderInputBuffer.f39722e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(decoderInputBuffer.f39720c);
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = (i11 << 8) | (byteBuffer.get(i12) & 255);
        }
        int iM = t.m(i11);
        if (iM != -1) {
            long jA = a(u0Var.f40726z);
            this.f40238b += (long) iM;
            return jA;
        }
        this.f40239c = true;
        this.f40238b = 0L;
        this.f40237a = decoderInputBuffer.f39722e;
        u.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.f39722e;
    }
}
