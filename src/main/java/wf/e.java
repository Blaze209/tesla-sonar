package wf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g<cg.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final cg.d f121741i;

    public e(List<ig.a<cg.d>> list) {
        super(list);
        int iMax = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            cg.d dVar = list.get(i11).f77657b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f121741i = new cg.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // wf.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public cg.d i(ig.a<cg.d> aVar, float f11) {
        this.f121741i.g(aVar.f77657b, aVar.f77658c, f11);
        return this.f121741i;
    }
}
