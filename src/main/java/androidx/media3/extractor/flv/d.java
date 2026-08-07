package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import p7.u;
import s7.c0;
import t7.h;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f11440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f11441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11445g;

    public d(o0 o0Var) {
        super(o0Var);
        this.f11440b = new c0(h.f112710a);
        this.f11441c = new c0(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(c0 c0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iM = c0Var.M();
        int i11 = (iM >> 4) & 15;
        int i12 = iM & 15;
        if (i12 == 7) {
            this.f11445g = i11;
            return i11 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i12);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(c0 c0Var, long j11) throws ParserException {
        int iM = c0Var.M();
        long jW = j11 + (((long) c0Var.w()) * 1000);
        if (iM == 0 && !this.f11443e) {
            c0 c0Var2 = new c0(new byte[c0Var.a()]);
            c0Var.q(c0Var2.f(), 0, c0Var.a());
            w8.d dVarB = w8.d.b(c0Var2);
            this.f11442d = dVarB.f121257b;
            this.f11415a.g(new u.b().W("video/x-flv").y0("video/avc").U(dVarB.f121267l).F0(dVarB.f121258c).h0(dVarB.f121259d).u0(dVarB.f121266k).k0(dVarB.f121256a).P());
            this.f11443e = true;
            return false;
        }
        if (iM != 1 || !this.f11443e) {
            return false;
        }
        int i11 = this.f11445g == 1 ? 1 : 0;
        if (!this.f11444f && i11 == 0) {
            return false;
        }
        byte[] bArrF = this.f11441c.f();
        bArrF[0] = 0;
        bArrF[1] = 0;
        bArrF[2] = 0;
        int i12 = 4 - this.f11442d;
        int i13 = 0;
        while (c0Var.a() > 0) {
            c0Var.q(this.f11441c.f(), i12, this.f11442d);
            this.f11441c.b0(0);
            int iQ = this.f11441c.Q();
            this.f11440b.b0(0);
            this.f11415a.f(this.f11440b, 4);
            this.f11415a.f(c0Var, iQ);
            i13 = i13 + 4 + iQ;
        }
        this.f11415a.b(jW, i11, i13, 0, null);
        this.f11444f = true;
        return true;
    }
}
