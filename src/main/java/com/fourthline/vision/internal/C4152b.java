package com.fourthline.vision.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4152b extends AbstractC4215j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4152b(zx.d detector, S3 playServicesAvailable) {
        super(detector, playServicesAvailable);
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailable, "playServicesAvailable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List detect$lambda$0(C4152b c4152b, List it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return c4152b.toAccurateDetections(it);
    }

    private final List<AbstractC4273r2.a> toAccurateDetections(List<? extends zx.a> list) {
        List listM;
        List<PointF> listA;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (zx.a aVar : list) {
            Rect rectA = aVar.a();
            p013kotlin.jvm.internal.s.j(rectA, "getBoundingBox(...)");
            C4165c4 faceBox = toFaceBox(rectA);
            boolean zAreEyesOpen = areEyesOpen(aVar);
            zx.b bVarB = aVar.b(1);
            if (bVarB == null || (listA = bVarB.a()) == null) {
                listM = p013kotlin.collections.v.m();
            } else {
                listM = new ArrayList(p013kotlin.collections.v.y(listA, 10));
                for (PointF pointF : listA) {
                    listM.add(new PointF(pointF.x, pointF.y));
                }
            }
            arrayList.add(new AbstractC4273r2.a(faceBox, zAreEyesOpen, listM));
        }
        return arrayList;
    }

    @Override // com.fourthline.vision.internal.A3, com.fourthline.vision.internal.InterfaceC4327z0
    public /* bridge */ /* synthetic */ Object detect(E2 e11, Continuation continuation) {
        return detect((D3) e11, (Continuation<? super List<AbstractC4273r2.a>>) continuation);
    }

    public Object detect(D3 d11, Continuation<? super List<AbstractC4273r2.a>> continuation) {
        return awaitDetection(d11, new wn0.l() { // from class: com.fourthline.vision.internal.d9
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4152b.detect$lambda$0(this.f38244a, (List) obj);
            }
        }, continuation);
    }
}
