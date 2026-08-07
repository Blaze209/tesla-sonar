package d5;

import e5.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class j extends e implements i {
    public e[] V0 = new e[4];
    public int W0 = 0;

    @Override // d5.i
    public void a() {
        this.W0 = 0;
        Arrays.fill(this.V0, (Object) null);
    }

    @Override // d5.i
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i11 = this.W0 + 1;
        e[] eVarArr = this.V0;
        if (i11 > eVarArr.length) {
            this.V0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.V0;
        int i12 = this.W0;
        eVarArr2[i12] = eVar;
        this.W0 = i12 + 1;
    }

    @Override // d5.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        j jVar = (j) eVar;
        this.W0 = 0;
        int i11 = jVar.W0;
        for (int i12 = 0; i12 < i11; i12++) {
            b(map.get(jVar.V0[i12]));
        }
    }

    public void w1(ArrayList<o> arrayList, int i11, o oVar) {
        for (int i12 = 0; i12 < this.W0; i12++) {
            oVar.a(this.V0[i12]);
        }
        for (int i13 = 0; i13 < this.W0; i13++) {
            e5.i.a(this.V0[i13], i11, arrayList, oVar);
        }
    }

    public int x1(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < this.W0; i14++) {
            e eVar = this.V0[i14];
            if (i11 == 0 && (i13 = eVar.S0) != -1) {
                return i13;
            }
            if (i11 == 1 && (i12 = eVar.T0) != -1) {
                return i12;
            }
        }
        return -1;
    }

    @Override // d5.i
    public void c(f fVar) {
    }
}
