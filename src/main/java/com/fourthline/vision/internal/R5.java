package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class R5 implements Q2 {
    private final boolean isInBounds(float f11) {
        return f11 > 20.0f;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    public Object process(List<? extends AbstractC4273r2> list, Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC4273r2.b) {
                arrayList.add(obj);
            }
        }
        ArrayList<AbstractC4273r2.b> arrayList2 = new ArrayList();
        boolean z11 = false;
        for (Object obj2 : arrayList) {
            if (z11) {
                arrayList2.add(obj2);
            } else if (!isInBounds(((AbstractC4273r2.b) obj2).getYaw())) {
                arrayList2.add(obj2);
                z11 = true;
            }
        }
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(arrayList2, 10));
        for (AbstractC4273r2.b bVar : arrayList2) {
            arrayList3.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        return arrayList3;
    }
}
