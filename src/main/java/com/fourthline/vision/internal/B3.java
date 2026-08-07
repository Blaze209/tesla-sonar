package com.fourthline.vision.internal;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class B3 implements U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f37635a;

    /* JADX WARN: Multi-variable type inference failed */
    public B3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(dy.a.e it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    public B3(wn0.l<? super dy.a.e, Boolean> isBlockOk) {
        p013kotlin.jvm.internal.s.k(isBlockOk, "isBlockOk");
        this.f37635a = isBlockOk;
    }

    @Override // com.fourthline.vision.internal.U0
    public T0.c buildDetectionRoot(dy.a sourceDetection) {
        p013kotlin.jvm.internal.s.k(sourceDetection, "sourceDetection");
        List<dy.a.e> listB = sourceDetection.b();
        p013kotlin.jvm.internal.s.j(listB, "getTextBlocks(...)");
        wn0.l lVar = this.f37635a;
        ArrayList<dy.a.e> arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        for (dy.a.e eVar : arrayList) {
            String strE = eVar.e();
            p013kotlin.jvm.internal.s.j(strE, "getText(...)");
            C4165c4 c4165c4NullableToRectangle = AbstractC4173d4.nullableToRectangle(eVar.a());
            List<dy.a.b> listD = eVar.d();
            p013kotlin.jvm.internal.s.j(listD, "getLines(...)");
            ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listD, 10));
            for (dy.a.b bVar : listD) {
                String strD = bVar.d();
                p013kotlin.jvm.internal.s.j(strD, "getText(...)");
                arrayList3.add(new T0.a(strD, AbstractC4173d4.nullableToRectangle(bVar.a()), null, 4, null));
            }
            arrayList2.add(new T0.d(strE, c4165c4NullableToRectangle, arrayList3));
        }
        return new T0.c(arrayList2);
    }

    public /* synthetic */ B3(wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new wn0.l() { // from class: com.fourthline.vision.internal.b7
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(B3._init_$lambda$0((dy.a.e) obj));
            }
        } : lVar);
    }
}
