package t9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {
    private static int a(j jVar, long j11) {
        if (j11 == -9223372036854775807L) {
            return 0;
        }
        int iC = jVar.c(j11);
        if (iC == -1) {
            iC = jVar.b();
        }
        return (iC <= 0 || jVar.a(iC + (-1)) != j11) ? iC : iC - 1;
    }

    private static void b(j jVar, int i11, s7.n<d> nVar) {
        long jA = jVar.a(i11);
        List<r7.a> listD = jVar.d(jA);
        if (listD.isEmpty()) {
            return;
        }
        if (i11 == jVar.b() - 1) {
            throw new IllegalStateException();
        }
        long jA2 = jVar.a(i11 + 1) - jVar.a(i11);
        if (jA2 > 0) {
            nVar.accept(new d(listD, jA, jA2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void c(j jVar, q.b bVar, s7.n<d> nVar) {
        boolean z11;
        int iA = a(jVar, bVar.f112984a);
        if (bVar.f112984a == -9223372036854775807L || iA >= jVar.b()) {
            z11 = false;
        } else {
            List<r7.a> listD = jVar.d(bVar.f112984a);
            long jA = jVar.a(iA);
            if (listD.isEmpty()) {
                z11 = false;
            } else {
                long j11 = bVar.f112984a;
                if (j11 < jA) {
                    nVar.accept(new d(listD, j11, jA - j11));
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
        for (int i11 = iA; i11 < jVar.b(); i11++) {
            b(jVar, i11, nVar);
        }
        if (bVar.f112985b) {
            if (z11) {
                iA--;
            }
            for (int i12 = 0; i12 < iA; i12++) {
                b(jVar, i12, nVar);
            }
            if (z11) {
                nVar.accept(new d(jVar.d(bVar.f112984a), jVar.a(iA), bVar.f112984a - jVar.a(iA)));
            }
        }
    }
}
