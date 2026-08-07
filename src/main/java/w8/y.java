package w8;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f121427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f121429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f121430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f121431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f121432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f121433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p7.f0 f121434l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f121435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f121436b;

        public a(long[] jArr, long[] jArr2) {
            this.f121435a = jArr;
            this.f121436b = jArr2;
        }
    }

    public y(byte[] bArr, int i11) {
        s7.b0 b0Var = new s7.b0(bArr);
        b0Var.p(i11 * 8);
        this.f121423a = b0Var.h(16);
        this.f121424b = b0Var.h(16);
        this.f121425c = b0Var.h(24);
        this.f121426d = b0Var.h(24);
        int iH = b0Var.h(20);
        this.f121427e = iH;
        this.f121428f = j(iH);
        this.f121429g = b0Var.h(3) + 1;
        int iH2 = b0Var.h(5) + 1;
        this.f121430h = iH2;
        this.f121431i = e(iH2);
        this.f121432j = b0Var.j(36);
        this.f121433k = null;
        this.f121434l = null;
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
        if (i11 == 20) {
            return 5;
        }
        if (i11 != 24) {
            return i11 != 32 ? -1 : 7;
        }
        return 6;
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

    public y a(List<i9.a> list) {
        return new y(this.f121423a, this.f121424b, this.f121425c, this.f121426d, this.f121427e, this.f121429g, this.f121430h, this.f121432j, this.f121433k, h(new p7.f0(list)));
    }

    public y b(a aVar) {
        return new y(this.f121423a, this.f121424b, this.f121425c, this.f121426d, this.f121427e, this.f121429g, this.f121430h, this.f121432j, aVar, this.f121434l);
    }

    public y c(List<String> list) {
        return new y(this.f121423a, this.f121424b, this.f121425c, this.f121426d, this.f121427e, this.f121429g, this.f121430h, this.f121432j, this.f121433k, h(r0.d(list)));
    }

    public long d() {
        long j11;
        long j12;
        int i11 = this.f121426d;
        if (i11 > 0) {
            j11 = (((long) i11) + ((long) this.f121425c)) / 2;
            j12 = 1;
        } else {
            int i12 = this.f121423a;
            j11 = ((((i12 != this.f121424b || i12 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i12) * ((long) this.f121429g)) * ((long) this.f121430h)) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public long f() {
        long j11 = this.f121432j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / ((long) this.f121427e);
    }

    public p7.u g(byte[] bArr, p7.f0 f0Var) {
        bArr[4] = -128;
        int i11 = this.f121426d;
        if (i11 <= 0) {
            i11 = -1;
        }
        return new p7.u.b().y0("audio/flac").o0(i11).T(this.f121429g).z0(this.f121427e).s0(s7.q0.q0(this.f121430h)).k0(Collections.singletonList(bArr)).r0(h(f0Var)).P();
    }

    public p7.f0 h(p7.f0 f0Var) {
        p7.f0 f0Var2 = this.f121434l;
        return f0Var2 == null ? f0Var : f0Var2.b(f0Var);
    }

    public long i(long j11) {
        return s7.q0.s((j11 * ((long) this.f121427e)) / 1000000, 0L, this.f121432j - 1);
    }

    private y(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, a aVar, p7.f0 f0Var) {
        this.f121423a = i11;
        this.f121424b = i12;
        this.f121425c = i13;
        this.f121426d = i14;
        this.f121427e = i15;
        this.f121428f = j(i15);
        this.f121429g = i16;
        this.f121430h = i17;
        this.f121431i = e(i17);
        this.f121432j = j11;
        this.f121433k = aVar;
        this.f121434l = f0Var;
    }
}
