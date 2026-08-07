package hr;

import com.google.android.exoplayer2.u0;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f73387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f73388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f73389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f73390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ur.a f73391l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f73392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f73393b;

        public a(long[] jArr, long[] jArr2) {
            this.f73392a = jArr;
            this.f73393b = jArr2;
        }
    }

    public t(byte[] bArr, int i11) {
        ts.c0 c0Var = new ts.c0(bArr);
        c0Var.p(i11 * 8);
        this.f73380a = c0Var.h(16);
        this.f73381b = c0Var.h(16);
        this.f73382c = c0Var.h(24);
        this.f73383d = c0Var.h(24);
        int iH = c0Var.h(20);
        this.f73384e = iH;
        this.f73385f = j(iH);
        this.f73386g = c0Var.h(3) + 1;
        int iH2 = c0Var.h(5) + 1;
        this.f73387h = iH2;
        this.f73388i = e(iH2);
        this.f73389j = c0Var.j(36);
        this.f73390k = null;
        this.f73391l = null;
    }

    private static int e(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 != 20) {
            return i11 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i11) {
        switch (i11) {
            case ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public t a(List<xr.a> list) {
        return new t(this.f73380a, this.f73381b, this.f73382c, this.f73383d, this.f73384e, this.f73386g, this.f73387h, this.f73389j, this.f73390k, h(new ur.a(list)));
    }

    public t b(a aVar) {
        return new t(this.f73380a, this.f73381b, this.f73382c, this.f73383d, this.f73384e, this.f73386g, this.f73387h, this.f73389j, aVar, this.f73391l);
    }

    public t c(List<String> list) {
        return new t(this.f73380a, this.f73381b, this.f73382c, this.f73383d, this.f73384e, this.f73386g, this.f73387h, this.f73389j, this.f73390k, h(e0.c(list)));
    }

    public long d() {
        long j11;
        long j12;
        int i11 = this.f73383d;
        if (i11 > 0) {
            j11 = (((long) i11) + ((long) this.f73382c)) / 2;
            j12 = 1;
        } else {
            int i12 = this.f73380a;
            j11 = ((((i12 != this.f73381b || i12 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i12) * ((long) this.f73386g)) * ((long) this.f73387h)) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public long f() {
        long j11 = this.f73389j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / ((long) this.f73384e);
    }

    public u0 g(byte[] bArr, ur.a aVar) {
        bArr[4] = -128;
        int i11 = this.f73383d;
        if (i11 <= 0) {
            i11 = -1;
        }
        return new u0.b().g0("audio/flac").Y(i11).J(this.f73386g).h0(this.f73384e).V(Collections.singletonList(bArr)).Z(h(aVar)).G();
    }

    public ur.a h(ur.a aVar) {
        ur.a aVar2 = this.f73391l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j11) {
        return p0.r((j11 * ((long) this.f73384e)) / 1000000, 0L, this.f73389j - 1);
    }

    private t(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, a aVar, ur.a aVar2) {
        this.f73380a = i11;
        this.f73381b = i12;
        this.f73382c = i13;
        this.f73383d = i14;
        this.f73384e = i15;
        this.f73385f = j(i15);
        this.f73386g = i16;
        this.f73387h = i17;
        this.f73388i = e(i17);
        this.f73389j = j11;
        this.f73390k = aVar;
        this.f73391l = aVar2;
    }
}
