package com.fourthline.nfc.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 implements Comparator {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(br0.n info1, br0.n info2) {
        p013kotlin.jvm.internal.s.k(info1, "info1");
        p013kotlin.jvm.internal.s.k(info2, "info2");
        br0.n.b bVarL = br0.n.l(info1.e());
        br0.n.b bVarL2 = br0.n.l(info2.e());
        br0.n.b bVar = br0.n.b.CAM;
        if (bVarL == bVar && bVarL2 == bVar) {
            return 0;
        }
        br0.n.b bVar2 = br0.n.b.IM;
        if (bVarL == bVar2 && bVarL2 == bVar2) {
            return 0;
        }
        br0.n.b bVar3 = br0.n.b.GM;
        if (bVarL == bVar3 && bVarL2 == bVar3) {
            return 0;
        }
        return (bVarL == bVar || bVarL2 == bVar3) ? 1 : -1;
    }
}
