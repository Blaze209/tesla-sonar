package androidx.media3.extractor.flv;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Collections;
import p7.u;
import s7.c0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f11416e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11419d;

    public a(o0 o0Var) {
        super(o0Var);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(c0 c0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f11417b) {
            c0Var.c0(1);
        } else {
            int iM = c0Var.M();
            int i11 = (iM >> 4) & 15;
            this.f11419d = i11;
            if (i11 == 2) {
                this.f11415a.g(new u.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(f11416e[(iM >> 2) & 3]).P());
                this.f11418c = true;
            } else if (i11 == 7 || i11 == 8) {
                this.f11415a.g(new u.b().W("video/x-flv").y0(i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED).P());
                this.f11418c = true;
            } else if (i11 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f11419d);
            }
            this.f11417b = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(c0 c0Var, long j11) {
        if (this.f11419d == 2) {
            int iA = c0Var.a();
            this.f11415a.f(c0Var, iA);
            this.f11415a.b(j11, 1, iA, 0, null);
            return true;
        }
        int iM = c0Var.M();
        if (iM != 0 || this.f11418c) {
            if (this.f11419d == 10 && iM != 1) {
                return false;
            }
            int iA2 = c0Var.a();
            this.f11415a.f(c0Var, iA2);
            this.f11415a.b(j11, 1, iA2, 0, null);
            return true;
        }
        int iA3 = c0Var.a();
        byte[] bArr = new byte[iA3];
        c0Var.q(bArr, 0, iA3);
        w8.a.b bVarF = w8.a.f(bArr);
        this.f11415a.g(new u.b().W("video/x-flv").y0("audio/mp4a-latm").U(bVarF.f121208c).T(bVarF.f121207b).z0(bVarF.f121206a).k0(Collections.singletonList(bArr)).P());
        this.f11418c = true;
        return false;
    }
}
