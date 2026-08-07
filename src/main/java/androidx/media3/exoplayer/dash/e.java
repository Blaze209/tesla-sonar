package androidx.media3.exoplayer.dash;

import androidx.media3.decoder.DecoderInputBuffer;
import n8.s;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f9683a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f9685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d8.f f9687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9689g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h9.c f9684b = new h9.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9690h = -9223372036854775807L;

    public e(d8.f fVar, u uVar, boolean z11) {
        this.f9683a = uVar;
        this.f9687e = fVar;
        this.f9685c = fVar.f59810b;
        e(fVar, z11);
    }

    @Override // n8.s
    public void a() {
    }

    @Override // n8.s
    public int b(long j11) {
        int iMax = Math.max(this.f9689g, q0.g(this.f9685c, j11, true, false));
        int i11 = iMax - this.f9689g;
        this.f9689g = iMax;
        return i11;
    }

    public String c() {
        return this.f9687e.a();
    }

    public void d(long j11) {
        int iG = q0.g(this.f9685c, j11, true, false);
        this.f9689g = iG;
        if (!this.f9686d || iG != this.f9685c.length) {
            j11 = -9223372036854775807L;
        }
        this.f9690h = j11;
    }

    public void e(d8.f fVar, boolean z11) {
        int i11 = this.f9689g;
        long j11 = i11 == 0 ? -9223372036854775807L : this.f9685c[i11 - 1];
        this.f9686d = z11;
        this.f9687e = fVar;
        long[] jArr = fVar.f59810b;
        this.f9685c = jArr;
        long j12 = this.f9690h;
        if (j12 != -9223372036854775807L) {
            d(j12);
        } else if (j11 != -9223372036854775807L) {
            this.f9689g = q0.g(jArr, j11, false, false);
        }
    }

    @Override // n8.s
    public boolean isReady() {
        return true;
    }

    @Override // n8.s
    public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        int i12 = this.f9689g;
        boolean z11 = i12 == this.f9685c.length;
        if (z11 && !this.f9686d) {
            decoderInputBuffer.n(4);
            return -4;
        }
        if ((i11 & 2) != 0 || !this.f9688f) {
            uVar.f127112b = this.f9683a;
            this.f9688f = true;
            return -5;
        }
        if (z11) {
            return -3;
        }
        if ((i11 & 1) == 0) {
            this.f9689g = i12 + 1;
        }
        if ((i11 & 4) == 0) {
            byte[] bArrA = this.f9684b.a(this.f9687e.f59809a[i12]);
            decoderInputBuffer.p(bArrA.length);
            decoderInputBuffer.f9286d.put(bArrA);
        }
        decoderInputBuffer.f9288f = this.f9685c[i12];
        decoderInputBuffer.n(1);
        return -4;
    }
}
