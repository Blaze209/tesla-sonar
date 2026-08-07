package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J3 implements Z0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fourthline.vision.internal.T0$d] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final List detect$lambda$2(T0.c root) {
        p013kotlin.jvm.internal.s.k(root, "root");
        List<T0.d> texts = root.getTexts();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(texts, 10));
        Iterator it = texts.iterator();
        while (it.hasNext()) {
            ?? bVar = (T0.d) it.next();
            MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(bVar.getText());
            if (mrzInfoCreate != null) {
                bVar = new T0.b(mrzInfoCreate, bVar);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    static /* synthetic */ Object detect$suspendImpl(J3 j11, D3 d11, Continuation<? super List<? extends T0>> continuation) {
        return j11.awaitDetection(d11, new wn0.l() { // from class: com.fourthline.vision.internal.c8
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return J3.detect$lambda$2((T0.c) obj);
            }
        }, continuation);
    }

    protected abstract Object awaitDetection(D3 d11, wn0.l<? super T0.c, ? extends List<? extends T0>> lVar, Continuation<? super List<? extends T0>> continuation);

    public Object detect(D3 d11, Continuation<? super List<? extends T0>> continuation) {
        return detect$suspendImpl(this, d11, continuation);
    }

    @Override // com.fourthline.vision.internal.A3, com.fourthline.vision.internal.InterfaceC4327z0
    public /* bridge */ /* synthetic */ Object detect(E2 e11, Continuation continuation) {
        return detect((D3) e11, (Continuation<? super List<? extends T0>>) continuation);
    }
}
