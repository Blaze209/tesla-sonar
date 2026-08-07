package kr;

import hr.l;
import hr.q;
import hr.t;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b extends hr.a {

    /* JADX INFO: renamed from: kr.b$b, reason: collision with other inner class name */
    private static final class C1881b implements hr.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f89333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f89334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q.a f89335c;

        private long c(l lVar) {
            while (lVar.h() < lVar.getLength() - 6 && !q.h(lVar, this.f89333a, this.f89334b, this.f89335c)) {
                lVar.i(1);
            }
            if (lVar.h() < lVar.getLength() - 6) {
                return this.f89335c.f73376a;
            }
            lVar.i((int) (lVar.getLength() - lVar.h()));
            return this.f89333a.f73389j;
        }

        @Override // hr.a.f
        public hr.a.e b(l lVar, long j11) {
            long position = lVar.getPosition();
            long jC = c(lVar);
            long jH = lVar.h();
            lVar.i(Math.max(6, this.f89333a.f73382c));
            long jC2 = c(lVar);
            long jH2 = lVar.h();
            if (jC > j11 || jC2 <= j11) {
                return jC2 <= j11 ? hr.a.e.f(jC2, jH2) : hr.a.e.d(jC, position);
            }
            return hr.a.e.e(jH);
        }

        private C1881b(t tVar, int i11) {
            this.f89333a = tVar;
            this.f89334b = i11;
            this.f89335c = new q.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final t tVar, int i11, long j11, long j12) {
        super(new hr.a.d() { // from class: kr.a
            @Override // hr.a.d
            public final long a(long j13) {
                return tVar.i(j13);
            }
        }, new C1881b(tVar, i11), tVar.f(), 0L, tVar.f73389j, j11, j12, tVar.d(), Math.max(6, tVar.f73382c));
        Objects.requireNonNull(tVar);
    }
}
