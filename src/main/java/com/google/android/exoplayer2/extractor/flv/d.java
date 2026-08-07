package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import hr.b0;
import ts.d0;
import ts.z;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f39885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f39886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39890g;

    public d(b0 b0Var) {
        super(b0Var);
        this.f39885b = new d0(z.f115086a);
        this.f39886c = new d0(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(d0 d0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iH = d0Var.H();
        int i11 = (iH >> 4) & 15;
        int i12 = iH & 15;
        if (i12 == 7) {
            this.f39890g = i11;
            return i11 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i12);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(d0 d0Var, long j11) throws ParserException {
        int iH = d0Var.H();
        long jR = j11 + (((long) d0Var.r()) * 1000);
        if (iH == 0 && !this.f39888e) {
            d0 d0Var2 = new d0(new byte[d0Var.a()]);
            d0Var.l(d0Var2.e(), 0, d0Var.a());
            us.a aVarB = us.a.b(d0Var2);
            this.f39887d = aVarB.f116528b;
            this.f39860a.b(new u0.b().g0("video/avc").K(aVarB.f116535i).n0(aVarB.f116529c).S(aVarB.f116530d).c0(aVarB.f116534h).V(aVarB.f116527a).G());
            this.f39888e = true;
            return false;
        }
        if (iH != 1 || !this.f39888e) {
            return false;
        }
        int i11 = this.f39890g == 1 ? 1 : 0;
        if (!this.f39889f && i11 == 0) {
            return false;
        }
        byte[] bArrE = this.f39886c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i12 = 4 - this.f39887d;
        int i13 = 0;
        while (d0Var.a() > 0) {
            d0Var.l(this.f39886c.e(), i12, this.f39887d);
            this.f39886c.U(0);
            int iL = this.f39886c.L();
            this.f39885b.U(0);
            this.f39860a.d(this.f39885b, 4);
            this.f39860a.d(d0Var, iL);
            i13 = i13 + 4 + iL;
        }
        this.f39860a.e(jR, i11, i13, 0, null);
        this.f39889f = true;
        return true;
    }
}
