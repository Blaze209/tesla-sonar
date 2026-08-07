package com.fourthline.vision.internal;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class A2 extends AbstractC4215j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(zx.d detector, S3 playServicesAvailable) {
        super(detector, playServicesAvailable);
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailable, "playServicesAvailable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List detect$lambda$0(A2 a11, List it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return a11.toFastDetections(it);
    }

    private final List<AbstractC4273r2.b> toFastDetections(List<? extends zx.a> list) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (zx.a aVar : list) {
            Rect rectA = aVar.a();
            p013kotlin.jvm.internal.s.j(rectA, "getBoundingBox(...)");
            arrayList.add(new AbstractC4273r2.b(toFaceBox(rectA), areEyesOpen(aVar), aVar.d(), aVar.c()));
        }
        return arrayList;
    }

    @Override // com.fourthline.vision.internal.A3, com.fourthline.vision.internal.InterfaceC4327z0
    public /* bridge */ /* synthetic */ Object detect(E2 e11, Continuation continuation) {
        return detect((D3) e11, (Continuation<? super List<AbstractC4273r2.b>>) continuation);
    }

    public Object detect(D3 d11, Continuation<? super List<AbstractC4273r2.b>> continuation) {
        return awaitDetection(d11, new wn0.l() { // from class: com.fourthline.vision.internal.a7
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return A2.detect$lambda$0(this.f38163a, (List) obj);
            }
        }, continuation);
    }
}
