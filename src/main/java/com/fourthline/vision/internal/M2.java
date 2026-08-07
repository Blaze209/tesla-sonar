package com.fourthline.vision.internal;

import android.media.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class M2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4287t2 f37840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4265q0 f37841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4164c3 f37842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D2 f37843d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37845b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37847d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37845b = obj;
            this.f37847d |= Integer.MIN_VALUE;
            return M2.this.process((Image) null, (Continuation<? super List<? extends AbstractC4273r2>>) this);
        }
    }

    public M2(InterfaceC4287t2 faceDetectorFast, InterfaceC4265q0 interfaceC4265q0, InterfaceC4164c3 imageConverter) {
        p013kotlin.jvm.internal.s.k(faceDetectorFast, "faceDetectorFast");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        this.f37840a = faceDetectorFast;
        this.f37841b = interfaceC4265q0;
        this.f37842c = imageConverter;
        this.f37843d = new D2("Camera2Selfie", 0L, 2, null);
    }

    public final InterfaceC4287t2 getFaceDetectorFast() {
        return this.f37840a;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super List<? extends AbstractC4273r2>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Image image, Continuation<? super List<? extends AbstractC4273r2>> continuation) {
        a aVar;
        M2 m11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f37847d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f37847d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objDetect = aVar.f37845b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f37847d;
        if (i12 == 0) {
            jn0.t.b(objDetect);
            D3 mlKitFrame = this.f37842c.toMlKitFrame(image);
            this.f37843d.monitor();
            InterfaceC4287t2 interfaceC4287t2 = this.f37840a;
            aVar.f37844a = this;
            aVar.f37847d = 1;
            objDetect = interfaceC4287t2.detect(mlKitFrame, aVar);
            if (objDetect != coroutine_suspended) {
                m11 = this;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = aVar.f37844a;
            jn0.t.b(objDetect);
            return obj;
        }
        m11 = (M2) aVar.f37844a;
        jn0.t.b(objDetect);
        List list = (List) objDetect;
        InterfaceC4265q0 interfaceC4265q0 = m11.f37841b;
        if (interfaceC4265q0 != null) {
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC4273r2) it.next()).getFaceBox());
            }
            aVar.f37844a = objDetect;
            aVar.f37847d = 2;
            if (interfaceC4265q0.consume(arrayList, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objDetect;
    }
}
