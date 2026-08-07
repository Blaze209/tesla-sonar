package b9;

import java.util.Objects;
import w8.e;
import w8.q;
import w8.v;
import w8.y;

/* JADX INFO: loaded from: classes3.dex */
final class b extends e {

    /* JADX INFO: renamed from: b9.b$b, reason: collision with other inner class name */
    private static final class C0335b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f16880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f16882c;

        private long c(q qVar) {
            while (qVar.h() < qVar.getLength() - 6 && !v.h(qVar, this.f16880a, this.f16881b, this.f16882c)) {
                qVar.i(1);
            }
            if (qVar.h() < qVar.getLength() - 6) {
                return this.f16882c.f121419a;
            }
            qVar.i((int) (qVar.getLength() - qVar.h()));
            return this.f16880a.f121432j;
        }

        @Override // w8.e.f
        public e.C2600e b(q qVar, long j11) {
            long position = qVar.getPosition();
            long jC = c(qVar);
            long jH = qVar.h();
            qVar.i(Math.max(6, this.f16880a.f121425c));
            long jC2 = c(qVar);
            long jH2 = qVar.h();
            if (jC > j11 || jC2 <= j11) {
                return jC2 <= j11 ? e.C2600e.f(jC2, jH2) : e.C2600e.d(jC, position);
            }
            return e.C2600e.e(jH);
        }

        private C0335b(y yVar, int i11) {
            this.f16880a = yVar;
            this.f16881b = i11;
            this.f16882c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i11, long j11, long j12) {
        super(new e.d() { // from class: b9.a
            @Override // w8.e.d
            public final long a(long j13) {
                return yVar.i(j13);
            }
        }, new C0335b(yVar, i11), yVar.f(), 0L, yVar.f121432j, j11, j12, yVar.d(), Math.max(6, yVar.f121425c));
        Objects.requireNonNull(yVar);
    }
}
