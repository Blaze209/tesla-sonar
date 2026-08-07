package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4180e3 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4234l4 f38268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4164c3 f38269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pair f38270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z0 f38271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q2 f38272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn0.l f38273f;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.e3$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38276c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38278e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38276c = obj;
            this.f38278e |= Integer.MIN_VALUE;
            return C4180e3.this.process((Pair<? extends Image, C4165c4>) null, (Continuation<? super K5>) this);
        }
    }

    public C4180e3(InterfaceC4234l4 scannerDetectionAreaProvider, InterfaceC4164c3 imageConverter, Pair<Integer, Integer> imageSize, Z0 mrzDocumentDetector, Q2 scannerImageCreator, wn0.l<? super List<? extends T0>, ? extends List<? extends T0>> mrzCandidateFilter) {
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(imageSize, "imageSize");
        p013kotlin.jvm.internal.s.k(mrzDocumentDetector, "mrzDocumentDetector");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        p013kotlin.jvm.internal.s.k(mrzCandidateFilter, "mrzCandidateFilter");
        this.f38268a = scannerDetectionAreaProvider;
        this.f38269b = imageConverter;
        this.f38270c = imageSize;
        this.f38271d = mrzDocumentDetector;
        this.f38272e = scannerImageCreator;
        this.f38273f = mrzCandidateFilter;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Image, C4165c4>) obj, (Continuation<? super K5>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Pair<? extends Image, C4165c4> pair, Continuation<? super K5> continuation) {
        a aVar;
        C4180e3 c4180e3;
        List listM;
        List list;
        C4180e3 c4180e4;
        ArrayList arrayList;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38278e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38278e = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objDetect = aVar.f38276c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38278e;
        if (i12 == 0) {
            jn0.t.b(objDetect);
            D3 mlKitFrame = this.f38269b.toMlKitFrame(pair.e(), ((Number) this.f38270c.e()).intValue(), ((Number) this.f38270c.f()).intValue(), this.f38268a.contentDetectionArea());
            try {
                Z0 z11 = this.f38271d;
                aVar.f38274a = this;
                aVar.f38275b = pair;
                aVar.f38278e = 1;
                objDetect = z11.detect(mlKitFrame, aVar);
                if (objDetect != coroutine_suspended) {
                    c4180e3 = this;
                }
            } catch (AbstractC4255o4 unused) {
                c4180e3 = this;
                listM = p013kotlin.collections.v.m();
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            pair = (Pair) aVar.f38275b;
            c4180e3 = (C4180e3) aVar.f38274a;
            try {
                jn0.t.b(objDetect);
            } catch (AbstractC4255o4 unused2) {
                listM = p013kotlin.collections.v.m();
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f38275b;
            c4180e4 = (C4180e3) aVar.f38274a;
            jn0.t.b(objDetect);
        }
        ScannerImage scannerImage = (ScannerImage) objDetect;
        Iterable iterable = (Iterable) c4180e4.f38273f.invoke(list);
        arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof T0.b) {
                arrayList.add(obj);
            }
        }
        T0.b bVar = (T0.b) p013kotlin.collections.v.q0(arrayList);
        return bVar != null ? new InterfaceC4163c2.b(scannerImage, bVar.getMrz(), null, 4, null) : new InterfaceC4163c2.a(scannerImage, null, 2, null);
        listM = (List) objDetect;
        Q2 q11 = c4180e3.f38272e;
        aVar.f38274a = c4180e3;
        aVar.f38275b = listM;
        aVar.f38278e = 2;
        Object objProcess = q11.process(pair, aVar);
        if (objProcess != coroutine_suspended) {
            List list2 = listM;
            objDetect = objProcess;
            list = list2;
            c4180e4 = c4180e3;
            ScannerImage scannerImage2 = (ScannerImage) objDetect;
            Iterable iterable2 = (Iterable) c4180e4.f38273f.invoke(list);
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                if (obj instanceof T0.b) {
                    arrayList.add(obj);
                }
            }
            T0.b bVar2 = (T0.b) p013kotlin.collections.v.q0(arrayList);
            if (bVar2 != null) {
            }
        }
        return coroutine_suspended;
    }
}
