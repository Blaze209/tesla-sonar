package d5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n extends e {
    public ArrayList<e> V0 = new ArrayList<>();

    public void b(e eVar) {
        this.V0.add(eVar);
        if (eVar.M() != null) {
            ((n) eVar.M()).y1(eVar);
        }
        eVar.h1(this);
    }

    @Override // d5.e
    public void v0() {
        this.V0.clear();
        super.v0();
    }

    public ArrayList<e> w1() {
        return this.V0;
    }

    public void x1() {
        ArrayList<e> arrayList = this.V0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.V0.get(i11);
            if (eVar instanceof n) {
                ((n) eVar).x1();
            }
        }
    }

    public void y1(e eVar) {
        this.V0.remove(eVar);
        eVar.v0();
    }

    @Override // d5.e
    public void z0(a5.c cVar) {
        super.z0(cVar);
        int size = this.V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.V0.get(i11).z0(cVar);
        }
    }

    public void z1() {
        this.V0.clear();
    }
}
