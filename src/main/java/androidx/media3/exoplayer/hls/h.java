package androidx.media3.exoplayer.hls;

import androidx.media3.decoder.DecoderInputBuffer;
import n8.s;
import z7.u;

/* JADX INFO: loaded from: classes3.dex */
final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f10025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10026c = -1;

    public h(l lVar, int i11) {
        this.f10025b = lVar;
        this.f10024a = i11;
    }

    private boolean d() {
        int i11 = this.f10026c;
        return (i11 == -1 || i11 == -3 || i11 == -2) ? false : true;
    }

    @Override // n8.s
    public void a() throws SampleQueueMappingException {
        int i11 = this.f10026c;
        if (i11 == -2) {
            throw new SampleQueueMappingException(this.f10025b.k().b(this.f10024a).c(0).f101544o);
        }
        if (i11 == -1) {
            this.f10025b.X();
        } else if (i11 != -3) {
            this.f10025b.Y(i11);
        }
    }

    @Override // n8.s
    public int b(long j11) {
        if (d()) {
            return this.f10025b.s0(this.f10026c, j11);
        }
        return 0;
    }

    public void c() {
        s7.a.a(this.f10026c == -1);
        this.f10026c = this.f10025b.A(this.f10024a);
    }

    public void e() {
        if (this.f10026c != -1) {
            this.f10025b.t0(this.f10024a);
            this.f10026c = -1;
        }
    }

    @Override // n8.s
    public boolean isReady() {
        if (this.f10026c != -3) {
            return d() && this.f10025b.S(this.f10026c);
        }
        return true;
    }

    @Override // n8.s
    public int j(u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (this.f10026c == -3) {
            decoderInputBuffer.e(4);
            return -4;
        }
        if (d()) {
            return this.f10025b.i0(this.f10026c, uVar, decoderInputBuffer, i11);
        }
        return -3;
    }
}
