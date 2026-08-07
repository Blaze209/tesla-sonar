package d5;

/* JADX INFO: loaded from: classes.dex */
public class l extends m {
    @Override // d5.m
    public void H1(int i11, int i12, int i13, int i14) {
        int iE1 = E1() + F1();
        int iG1 = G1() + D1();
        if (this.W0 > 0) {
            iE1 += this.V0[0].Y();
            iG1 += this.V0[0].z();
        }
        int iMax = Math.max(K(), iE1);
        int iMax2 = Math.max(J(), iG1);
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(iMax, i12);
            } else {
                i12 = i11 == 0 ? iMax : 0;
            }
        }
        if (i13 != 1073741824) {
            if (i13 == Integer.MIN_VALUE) {
                i14 = Math.min(iMax2, i14);
            } else {
                i14 = i13 == 0 ? iMax2 : 0;
            }
        }
        M1(i12, i14);
        p1(i12);
        Q0(i14);
        L1(this.W0 > 0);
    }

    @Override // d5.e
    public void g(a5.d dVar, boolean z11) {
        super.g(dVar, z11);
        if (this.W0 > 0) {
            e eVar = this.V0[0];
            eVar.w0();
            d.a aVar = d.a.LEFT;
            eVar.j(aVar, this, aVar);
            d.a aVar2 = d.a.RIGHT;
            eVar.j(aVar2, this, aVar2);
            d.a aVar3 = d.a.TOP;
            eVar.j(aVar3, this, aVar3);
            d.a aVar4 = d.a.BOTTOM;
            eVar.j(aVar4, this, aVar4);
        }
    }
}
