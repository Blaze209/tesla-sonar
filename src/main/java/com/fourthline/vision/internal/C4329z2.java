package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4329z2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4227k4 f39153a;

    public C4329z2(InterfaceC4227k4 dataSource) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        this.f39153a = dataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4165c4 process$lambda$0(AbstractC4273r2 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.getFaceBox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair process$lambda$1(C4165c4 c4165c4, C4165c4 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return jn0.x.a(Integer.valueOf(it.area()), Integer.valueOf(c4165c4.area()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float process$lambda$2(Pair it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return ((Number) it.e()).intValue() / ((Number) it.f()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean process$lambda$3(float f11) {
        return ((double) f11) < 0.2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerWarning process$lambda$4(float f11) {
        return SelfieScannerWarning.FACE_TOO_FAR;
    }

    public final InterfaceC4227k4 getDataSource() {
        return this.f39153a;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    public final void setDataSource(InterfaceC4227k4 interfaceC4227k4) {
        p013kotlin.jvm.internal.s.k(interfaceC4227k4, "<set-?>");
        this.f39153a = interfaceC4227k4;
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
        final C4165c4 c4165c4ContentDetectionArea = this.f39153a.contentDetectionArea();
        return ho0.l.c0(ho0.l.U(ho0.l.a0(ho0.l.U(ho0.l.U(ho0.l.U(p013kotlin.collections.v.e0(list), new wn0.l() { // from class: com.fourthline.vision.internal.sc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4329z2.process$lambda$0((AbstractC4273r2) obj);
            }
        }), new wn0.l() { // from class: com.fourthline.vision.internal.tc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4329z2.process$lambda$1(c4165c4ContentDetectionArea, (C4165c4) obj);
            }
        }), new wn0.l() { // from class: com.fourthline.vision.internal.uc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Float.valueOf(C4329z2.process$lambda$2((Pair) obj));
            }
        }), new wn0.l() { // from class: com.fourthline.vision.internal.vc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C4329z2.process$lambda$3(((Float) obj).floatValue()));
            }
        }), new wn0.l() { // from class: com.fourthline.vision.internal.wc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4329z2.process$lambda$4(((Float) obj).floatValue());
            }
        }));
    }
}
