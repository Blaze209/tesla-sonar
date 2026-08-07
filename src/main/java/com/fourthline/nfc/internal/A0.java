package com.fourthline.nfc.internal;

import java.util.Comparator;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 implements Comparator {

    public enum a {
        AES,
        DESede;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24505d = on0.a.a(a());
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(br0.n info1, br0.n info2) {
        p013kotlin.jvm.internal.s.k(info1, "info1");
        p013kotlin.jvm.internal.s.k(info2, "info2");
        String strH = br0.n.h(info1.e());
        p013kotlin.jvm.internal.s.j(strH, "toCipherAlgorithm(...)");
        a aVarValueOf = a.valueOf(strH);
        String strH2 = br0.n.h(info2.e());
        p013kotlin.jvm.internal.s.j(strH2, "toCipherAlgorithm(...)");
        a aVarValueOf2 = a.valueOf(strH2);
        a aVar = a.DESede;
        if (aVarValueOf == aVar && aVarValueOf2 == aVar) {
            return 0;
        }
        a aVar2 = a.AES;
        if (aVarValueOf == aVar2 && aVarValueOf2 == aVar2) {
            return p013kotlin.jvm.internal.s.m(br0.n.k(info1.e()), br0.n.k(info2.e()));
        }
        return aVarValueOf == aVar ? 1 : -1;
    }
}
