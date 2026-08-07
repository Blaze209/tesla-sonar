package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4315x2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4227k4 f39089a;

    public C4315x2(InterfaceC4227k4 dataSource) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        this.f39089a = dataSource;
    }

    public final InterfaceC4227k4 getDataSource() {
        return this.f39089a;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    public final void setDataSource(InterfaceC4227k4 interfaceC4227k4) {
        p013kotlin.jvm.internal.s.k(interfaceC4227k4, "<set-?>");
        this.f39089a = interfaceC4227k4;
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
        C4165c4 c4165c4ContentDetectionArea = this.f39089a.contentDetectionArea();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4273r2) it.next()).getFaceBox());
        }
        ArrayList<C4165c4> arrayList2 = new ArrayList();
        boolean z11 = false;
        for (Object obj : arrayList) {
            if (z11) {
                arrayList2.add(obj);
            } else if (!c4165c4ContentDetectionArea.contains((C4165c4) obj)) {
                arrayList2.add(obj);
                z11 = true;
            }
        }
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(arrayList2, 10));
        for (C4165c4 c4165c4 : arrayList2) {
            arrayList3.add(SelfieScannerWarning.FACE_NOT_IN_FRAME);
        }
        return arrayList3;
    }
}
