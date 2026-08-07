package com.fourthline.vision.internal;

import android.media.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class L2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f37821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4265q0 f37822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f37823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4164c3 f37824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4234l4 f37825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pair f37826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4265q0 f37827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D2 f37828h;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37831c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37833e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37831c = obj;
            this.f37833e |= Integer.MIN_VALUE;
            return L2.this.process((Image) null, (Continuation<? super List<? extends T0>>) this);
        }
    }

    public L2(Z0 mrzDocumentDetector, InterfaceC4265q0 imagePrecondition, wn0.l<? super List<? extends T0>, ? extends List<? extends T0>> mrzCandidateFilter, InterfaceC4164c3 imageConverter, InterfaceC4234l4 detectionAreaProvider, Pair<Integer, Integer> imageSize, InterfaceC4265q0 interfaceC4265q0) {
        p013kotlin.jvm.internal.s.k(mrzDocumentDetector, "mrzDocumentDetector");
        p013kotlin.jvm.internal.s.k(imagePrecondition, "imagePrecondition");
        p013kotlin.jvm.internal.s.k(mrzCandidateFilter, "mrzCandidateFilter");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageSize, "imageSize");
        this.f37821a = mrzDocumentDetector;
        this.f37822b = imagePrecondition;
        this.f37823c = mrzCandidateFilter;
        this.f37824d = imageConverter;
        this.f37825e = detectionAreaProvider;
        this.f37826f = imageSize;
        this.f37827g = interfaceC4265q0;
        this.f37828h = new D2("Camera2Document", 0L, 2, null);
    }

    private final List<C4165c4> debugRectangles(List<T0.d> list, C4165c4 c4165c4) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((T0.d) it.next()).getBox());
        }
        return fitTextBoxesIntoMrzArea(arrayList, c4165c4);
    }

    private final List<C4165c4> fitTextBoxesIntoMrzArea(List<C4165c4> list, C4165c4 c4165c4) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4165c4) it.next()).translate(c4165c4.getLeft(), c4165c4.getTop()));
        }
        return p013kotlin.collections.v.P0(arrayList, p013kotlin.collections.v.e(c4165c4));
    }

    public final Z0 getMrzDocumentDetector() {
        return this.f37821a;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super List<? extends T0>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        if (r4.consume(r11, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(android.media.Image r11, p013kotlin.coroutines.Continuation<? super java.util.List<? extends com.fourthline.vision.internal.T0>> r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.L2.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
