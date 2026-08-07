package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.u0;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import hr.b0;
import java.util.Collections;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f39861e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39864d;

    public a(b0 b0Var) {
        super(b0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(d0 d0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f39862b) {
            d0Var.V(1);
        } else {
            int iH = d0Var.H();
            int i11 = (iH >> 4) & 15;
            this.f39864d = i11;
            if (i11 == 2) {
                this.f39860a.b(new u0.b().g0("audio/mpeg").J(1).h0(f39861e[(iH >> 2) & 3]).G());
                this.f39863c = true;
            } else if (i11 == 7 || i11 == 8) {
                this.f39860a.b(new u0.b().g0(i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED).G());
                this.f39863c = true;
            } else if (i11 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f39864d);
            }
            this.f39862b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(d0 d0Var, long j11) {
        if (this.f39864d == 2) {
            int iA = d0Var.a();
            this.f39860a.d(d0Var, iA);
            this.f39860a.e(j11, 1, iA, 0, null);
            return true;
        }
        int iH = d0Var.H();
        if (iH != 0 || this.f39863c) {
            if (this.f39864d == 10 && iH != 1) {
                return false;
            }
            int iA2 = d0Var.a();
            this.f39860a.d(d0Var, iA2);
            this.f39860a.e(j11, 1, iA2, 0, null);
            return true;
        }
        int iA3 = d0Var.a();
        byte[] bArr = new byte[iA3];
        d0Var.l(bArr, 0, iA3);
        dr.a.b bVarE = dr.a.e(bArr);
        this.f39860a.b(new u0.b().g0("audio/mp4a-latm").K(bVarE.f60847c).J(bVarE.f60846b).h0(bVarE.f60845a).V(Collections.singletonList(bArr)).G());
        this.f39863c = true;
        return false;
    }
}
