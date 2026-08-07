package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LocalDate f82127h = LocalDate.of(2000, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChronoLocalDate f82128g;

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        if (uVar.f82147c) {
            return super.b(uVar);
        }
        return false;
    }

    public o(j$.time.temporal.p pVar, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(pVar, i11, i12, d0.NOT_NEGATIVE, i13);
        this.f82128g = chronoLocalDate;
    }

    @Override // j$.time.format.i
    public final long a(w wVar, long j11) {
        long jAbs = Math.abs(j11);
        ChronoLocalDate chronoLocalDate = this.f82128g;
        long jE = chronoLocalDate != null ? j$.time.chrono.l.n(wVar.f82154a).C(chronoLocalDate).e(this.f82103a) : 0;
        long[] jArr = i.f82102f;
        if (j11 >= jE) {
            long j12 = jArr[this.f82104b];
            if (j11 < jE + j12) {
                return jAbs % j12;
            }
        }
        return jAbs % jArr[this.f82105c];
    }

    @Override // j$.time.format.i
    public final int c(u uVar, long j11, int i11, int i12) {
        final o oVar;
        final u uVar2;
        final long j12;
        final int i13;
        final int i14;
        int iE;
        long j13;
        ChronoLocalDate chronoLocalDate = this.f82128g;
        if (chronoLocalDate != null) {
            j$.time.chrono.l lVar = uVar.c().f82079c;
            if (lVar == null && (lVar = uVar.f82145a.f82063e) == null) {
                lVar = j$.time.chrono.s.f82037c;
            }
            iE = lVar.C(chronoLocalDate).e(this.f82103a);
            oVar = this;
            uVar2 = uVar;
            j12 = j11;
            i13 = i11;
            i14 = i12;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f82122a.c(uVar2, j12, i13, i14);
                }
            };
            if (uVar2.f82149e == null) {
                uVar2.f82149e = new ArrayList();
            }
            uVar2.f82149e.add(consumer);
        } else {
            oVar = this;
            uVar2 = uVar;
            j12 = j11;
            i13 = i11;
            i14 = i12;
            iE = 0;
        }
        int i15 = i14 - i13;
        int i16 = oVar.f82104b;
        if (i15 != i16 || j12 < 0) {
            j13 = j12;
        } else {
            long j14 = i.f82102f[i16];
            long j15 = iE;
            long j16 = j15 - (j15 % j14);
            long j17 = iE > 0 ? j16 + j12 : j16 - j12;
            j13 = j17 < j15 ? j17 + j14 : j17;
        }
        return uVar2.f(oVar.f82103a, j13, i13, i14);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f82107e == -1) {
            return this;
        }
        return new o(this.f82103a, this.f82104b, this.f82105c, this.f82128g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i11) {
        return new o(this.f82103a, this.f82104b, this.f82105c, this.f82128g, this.f82107e + i11);
    }

    @Override // j$.time.format.i
    public final String toString() {
        ChronoLocalDate chronoLocalDate = this.f82128g;
        return "ReducedValue(" + this.f82103a + "," + this.f82104b + "," + this.f82105c + "," + (chronoLocalDate != null ? chronoLocalDate : 0) + ")";
    }
}
