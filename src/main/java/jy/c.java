package jy;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f84431b;

    public c(a aVar) {
        this.f84430a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f84431b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i11) {
        if (i11 >= this.f84431b.size()) {
            List<b> list = this.f84431b;
            b bVarG = list.get(list.size() - 1);
            for (int size = this.f84431b.size(); size <= i11; size++) {
                a aVar = this.f84430a;
                bVarG = bVarG.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f84431b.add(bVarG);
            }
        }
        return this.f84431b.get(i11);
    }

    public void b(int[] iArr, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i11;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i11);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrD = new b(this.f84430a, iArr2).h(i11, 1).b(bVarA)[1].d();
        int length2 = i11 - iArrD.length;
        for (int i12 = 0; i12 < length2; i12++) {
            iArr[length + i12] = 0;
        }
        System.arraycopy(iArrD, 0, iArr, length + length2, iArrD.length);
    }
}
