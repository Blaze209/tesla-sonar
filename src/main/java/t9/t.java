package t9;

import java.io.EOFException;
import p7.g0;
import p7.u;
import s7.c0;
import s7.q0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
final class t implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f112993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q.a f112994b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f113000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u f113001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f113002j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f112995c = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112997e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f112998f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f112999g = q0.f110459f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f112996d = new c0();

    public t(o0 o0Var, q.a aVar) {
        this.f112993a = o0Var;
        this.f112994b = aVar;
    }

    private void i(int i11) {
        int length = this.f112999g.length;
        int i12 = this.f112998f;
        if (length - i12 >= i11) {
            return;
        }
        int i13 = i12 - this.f112997e;
        int iMax = Math.max(i13 * 2, i11 + i13);
        byte[] bArr = this.f112999g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f112997e, bArr2, 0, i13);
        this.f112997e = 0;
        this.f112998f = i13;
        this.f112999g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(d dVar, long j11, int i11) {
        s7.a.j(this.f113001i);
        byte[] bArrA = this.f112995c.a(dVar.f112955a, dVar.f112957c);
        this.f112996d.Y(bArrA);
        this.f112993a.f(this.f112996d, bArrA.length);
        long j12 = dVar.f112956b;
        if (j12 == -9223372036854775807L) {
            s7.a.h(this.f113001i.f101549t == Long.MAX_VALUE);
        } else {
            long j13 = this.f113001i.f101549t;
            j11 = j13 == Long.MAX_VALUE ? j11 + j12 : j12 + j13;
        }
        this.f112993a.b(j11, i11 | 1, bArrA.length, 0, null);
    }

    @Override // w8.o0
    public void a(c0 c0Var, int i11, int i12) {
        if (this.f113000h == null) {
            this.f112993a.a(c0Var, i11, i12);
            return;
        }
        i(i11);
        c0Var.q(this.f112999g, this.f112998f, i11);
        this.f112998f += i11;
    }

    @Override // w8.o0
    public void b(final long j11, final int i11, int i12, int i13, o0.a aVar) {
        if (this.f113000h == null) {
            this.f112993a.b(j11, i11, i12, i13, aVar);
            return;
        }
        s7.a.b(aVar == null, "DRM on subtitles is not supported");
        int i14 = (this.f112998f - i13) - i12;
        try {
            this.f113000h.a(this.f112999g, i14, i12, q.b.b(), new s7.n() { // from class: t9.s
                @Override // s7.n
                public final void accept(Object obj) {
                    this.f112990a.j((d) obj, j11, i11);
                }
            });
        } catch (RuntimeException e11) {
            if (!this.f113002j) {
                throw e11;
            }
            s7.t.j("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e11);
        }
        int i15 = i14 + i12;
        this.f112997e = i15;
        if (i15 == this.f112998f) {
            this.f112997e = 0;
            this.f112998f = 0;
        }
    }

    @Override // w8.o0
    public int c(p7.j jVar, int i11, boolean z11, int i12) throws EOFException {
        if (this.f113000h == null) {
            return this.f112993a.c(jVar, i11, z11, i12);
        }
        i(i11);
        int i13 = jVar.read(this.f112999g, this.f112998f, i11);
        if (i13 != -1) {
            this.f112998f += i13;
            return i13;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // w8.o0
    public void g(u uVar) {
        s7.a.f(uVar.f101544o);
        s7.a.a(g0.k(uVar.f101544o) == 3);
        if (!uVar.equals(this.f113001i)) {
            this.f113001i = uVar;
            this.f113000h = this.f112994b.b(uVar) ? this.f112994b.c(uVar) : null;
        }
        if (this.f113000h == null) {
            this.f112993a.g(uVar);
        } else {
            this.f112993a.g(uVar.b().y0("application/x-media3-cues").U(uVar.f101544o).C0(Long.MAX_VALUE).Y(this.f112994b.a(uVar)).P());
        }
    }

    public void k(boolean z11) {
        this.f113002j = z11;
    }
}
