package d5;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f59545a = new boolean[3];

    static void a(f fVar, a5.d dVar, e eVar) {
        eVar.f59466t = -1;
        eVar.f59468u = -1;
        e.b bVar = fVar.f59431b0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f59431b0[0] == e.b.MATCH_PARENT) {
            int i11 = eVar.Q.f59425g;
            int iY = fVar.Y() - eVar.S.f59425g;
            d dVar2 = eVar.Q;
            dVar2.f59427i = dVar.q(dVar2);
            d dVar3 = eVar.S;
            dVar3.f59427i = dVar.q(dVar3);
            dVar.f(eVar.Q.f59427i, i11);
            dVar.f(eVar.S.f59427i, iY);
            eVar.f59466t = 2;
            eVar.T0(i11, iY);
        }
        if (fVar.f59431b0[1] == bVar2 || eVar.f59431b0[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i12 = eVar.R.f59425g;
        int iZ = fVar.z() - eVar.T.f59425g;
        d dVar4 = eVar.R;
        dVar4.f59427i = dVar.q(dVar4);
        d dVar5 = eVar.T;
        dVar5.f59427i = dVar.q(dVar5);
        dVar.f(eVar.R.f59427i, i12);
        dVar.f(eVar.T.f59427i, iZ);
        if (eVar.f59455n0 > 0 || eVar.X() == 8) {
            d dVar6 = eVar.U;
            dVar6.f59427i = dVar.q(dVar6);
            dVar.f(eVar.U.f59427i, eVar.f59455n0 + i12);
        }
        eVar.f59468u = 2;
        eVar.k1(i12, iZ);
    }

    public static final boolean b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
