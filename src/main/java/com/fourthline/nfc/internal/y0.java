package com.fourthline.nfc.internal;

import java.util.Comparator;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements Comparator {

    public enum a {
        ECDH,
        DH;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24748d = on0.a.a(a());
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(br0.n info1, br0.n info2) {
        p013kotlin.jvm.internal.s.k(info1, "info1");
        p013kotlin.jvm.internal.s.k(info2, "info2");
        String strJ = br0.n.j(info1.e());
        p013kotlin.jvm.internal.s.j(strJ, "toKeyAgreementAlgorithm(...)");
        a aVarValueOf = a.valueOf(strJ);
        String strJ2 = br0.n.j(info2.e());
        p013kotlin.jvm.internal.s.j(strJ2, "toKeyAgreementAlgorithm(...)");
        a aVarValueOf2 = a.valueOf(strJ2);
        a aVar = a.ECDH;
        if (aVarValueOf == aVar && aVarValueOf2 == aVar) {
            return 0;
        }
        a aVar2 = a.DH;
        if (aVarValueOf == aVar2 && aVarValueOf2 == aVar2) {
            return 0;
        }
        return aVarValueOf == aVar ? 1 : -1;
    }
}
