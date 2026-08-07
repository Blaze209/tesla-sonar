package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import j$.time.DateTimeException;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes2.dex */
public class i implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f82102f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f82103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f82106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82107e;

    public long a(w wVar, long j11) {
        return j11;
    }

    public i(j$.time.temporal.p pVar, int i11, int i12, d0 d0Var) {
        this.f82103a = pVar;
        this.f82104b = i11;
        this.f82105c = i12;
        this.f82106d = d0Var;
        this.f82107e = 0;
    }

    public i(j$.time.temporal.p pVar, int i11, int i12, d0 d0Var, int i13) {
        this.f82103a = pVar;
        this.f82104b = i11;
        this.f82105c = i12;
        this.f82106d = d0Var;
        this.f82107e = i13;
    }

    public i d() {
        if (this.f82107e == -1) {
            return this;
        }
        return new i(this.f82103a, this.f82104b, this.f82105c, this.f82106d, -1);
    }

    public i e(int i11) {
        return new i(this.f82103a, this.f82104b, this.f82105c, this.f82106d, this.f82107e + i11);
    }

    @Override // j$.time.format.e
    public boolean s(w wVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f82103a;
        Long lA = wVar.a(pVar);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        a0 a0Var = wVar.f82155b.f82061c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i11 = this.f82105c;
        if (length > i11) {
            throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i11);
        }
        a0Var.getClass();
        int i12 = this.f82104b;
        d0 d0Var = this.f82106d;
        if (jA >= 0) {
            int i13 = b.f82076a[d0Var.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    sb2.append('+');
                }
            } else if (i12 < 19 && jA >= f82102f[i12]) {
                sb2.append('+');
            }
        } else {
            int i14 = b.f82076a[d0Var.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                sb2.append(CoreConstants.DASH_CHAR);
            } else if (i14 == 4) {
                throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i15 = 0; i15 < i12 - string.length(); i15++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public boolean b(u uVar) {
        int i11 = this.f82107e;
        if (i11 != -1) {
            return i11 > 0 && this.f82104b == this.f82105c && this.f82106d == d0.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(j$.time.format.u r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.w(j$.time.format.u, java.lang.CharSequence, int):int");
    }

    public int c(u uVar, long j11, int i11, int i12) {
        return uVar.f(this.f82103a, j11, i11, i12);
    }

    public String toString() {
        int i11 = this.f82105c;
        j$.time.temporal.p pVar = this.f82103a;
        d0 d0Var = this.f82106d;
        int i12 = this.f82104b;
        if (i12 == 1 && i11 == 19 && d0Var == d0.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i12 == i11 && d0Var == d0.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i12 + ")";
        }
        return "Value(" + pVar + "," + i12 + "," + i11 + "," + d0Var + ")";
    }
}
