package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003lifecycle.Lifecycle;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionScannerEvent;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.compose.DocumentScannerControl;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T1 {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f37960a;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.T1$a$a, reason: collision with other inner class name */
        public static final class C0634a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f37961a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.T1$a$a$a, reason: collision with other inner class name */
            public static final class C0635a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f37962a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f37963b;

                public C0635a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f37962a = obj;
                    this.f37963b |= Integer.MIN_VALUE;
                    return C0634a.this.emit(null, this);
                }
            }

            public C0634a(FlowCollector flowCollector) {
                this.f37961a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0635a c0635a;
                VisionScannerEvent visionScannerEvent;
                if (continuation instanceof C0635a) {
                    c0635a = (C0635a) continuation;
                    int i11 = c0635a.f37963b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0635a.f37963b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0635a = new C0635a(continuation);
                    }
                } else {
                    c0635a = new C0635a(continuation);
                }
                Object obj2 = c0635a.f37962a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0635a.f37963b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f37961a;
                    DocumentScannerControl documentScannerControl = (DocumentScannerControl) obj;
                    if (documentScannerControl instanceof DocumentScannerControl.MoveToNextStep) {
                        visionScannerEvent = VisionScannerEvent.MoveToNextStep.INSTANCE;
                    } else if (documentScannerControl instanceof DocumentScannerControl.ResetCurrentStep) {
                        visionScannerEvent = VisionScannerEvent.ResetCurrentStep.INSTANCE;
                    } else if (documentScannerControl instanceof DocumentScannerControl.RestartScanner) {
                        visionScannerEvent = VisionScannerEvent.RestartScanner.INSTANCE;
                    } else if (documentScannerControl instanceof DocumentScannerControl.StartScanner) {
                        visionScannerEvent = VisionScannerEvent.StartScanner.INSTANCE;
                    } else {
                        if (!(documentScannerControl instanceof DocumentScannerControl.TakeSnapshot)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        visionScannerEvent = VisionScannerEvent.TakeSnapshot.INSTANCE;
                    }
                    c0635a.f37963b = 1;
                    if (flowCollector.emit(visionScannerEvent, c0635a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public a(Flow flow) {
            this.f37960a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f37960a.collect(new C0634a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentScannerConfig f37966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X1 f37967c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DocumentScannerConfig documentScannerConfig, X1 x11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37966b = documentScannerConfig;
            this.f37967c = x11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f37966b, this.f37967c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f37965a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (this.f37966b.getShouldStartAutomatically()) {
                this.f37967c.start();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4241m4.values().length];
            try {
                iArr[EnumC4241m4.NO_CAMERA_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4241m4.NO_AUDIO_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CameraXDocumentScanner(DocumentScannerConfig documentScannerConfig, final wn0.a<j3.i> documentDetectionAreaProvider, final Flow<? extends DocumentScannerControl> controls, wn0.l<? super DocumentScannerEvent, jn0.h0> lVar, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar2, final int i11) {
        int i12;
        p020r2.l lVar3;
        final DocumentScannerConfig config = documentScannerConfig;
        final wn0.l<? super DocumentScannerEvent, jn0.h0> callback = lVar;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(controls, "controls");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar2.v(153951283);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(config) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(documentDetectionAreaProvider) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(controls) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(callback) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarV.K(content) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i13 = i12;
        if ((i13 & 9363) == 9362 && lVarV.b()) {
            lVarV.j();
            lVar3 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(153951283, i13, -1, "com.fourthline.visionx.document.CameraXDocumentScanner (DocumentScannerComposable.kt:38)");
            }
            lVarV.o(480666777);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(new E5(0, 0), null, 2, null);
                lVarV.B(objI);
            }
            final p020r2.p1 p1Var = (p020r2.p1) objI;
            lVarV.l();
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                p020r2.a0 a0Var = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                lVarV.B(a0Var);
                objI2 = a0Var;
            }
            CoroutineScope coroutineScope = ((p020r2.a0) objI2).getCoroutineScope();
            lVarV.o(480671948);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new S0(context, coroutineScope);
                lVarV.B(objI3);
            }
            S0 s11 = (S0) objI3;
            lVarV.l();
            c0.p DEFAULT_BACK_CAMERA = c0.p.f18377d;
            p013kotlin.jvm.internal.s.j(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
            InterfaceC4264q interfaceC4264qRememberCameraXEngine = J.rememberCameraXEngine(DEFAULT_BACK_CAMERA, config.getInternalConfig().getPreferredVideoRecordingBitrate(), lVarV, 0);
            lVarV.o(480685126);
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                objI4 = s11.stateMachine(documentDetectionAreaProvider, config, interfaceC4264qRememberCameraXEngine, s11.motionDataManager(config.getIncludeMotionData()), new wn0.a() { // from class: com.fourthline.vision.internal.i8
                    @Override // wn0.a
                    public final Object invoke() {
                        return T1.CameraXDocumentScanner$lambda$1(p1Var);
                    }
                }, lVar);
                config = config;
                callback = lVar;
                lVarV.B(objI4);
            }
            final X1 x11 = (X1) objI4;
            lVarV.l();
            lVarV.o(480699710);
            Object objI5 = lVarV.I();
            if (objI5 == companion.a()) {
                objI5 = s11.analyzer(interfaceC4264qRememberCameraXEngine.getCoordinates().getAnalyzerTargetCoordinateSystem(), x11);
                lVarV.B(objI5);
            }
            androidx.camera.core.f.a aVar = (androidx.camera.core.f.a) objI5;
            lVarV.l();
            RecordingType recordingType = config.getRecordingType();
            boolean debugModeEnabled = config.getDebugModeEnabled();
            a aVar2 = new a(controls);
            lVarV.o(480707324);
            boolean z11 = (i13 & 7168) == 2048;
            Object objI6 = lVarV.I();
            if (z11 || objI6 == companion.a()) {
                objI6 = new wn0.l() { // from class: com.fourthline.vision.internal.j8
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return T1.CameraXDocumentScanner$lambda$9$lambda$8(callback, (EnumC4241m4) obj);
                    }
                };
                lVarV.B(objI6);
            }
            wn0.l lVar4 = (wn0.l) objI6;
            lVarV.l();
            lVarV.o(480728044);
            Object objI7 = lVarV.I();
            if (objI7 == companion.a()) {
                objI7 = new wn0.l() { // from class: com.fourthline.vision.internal.k8
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return T1.CameraXDocumentScanner$lambda$11$lambda$10(p1Var, (j3.i) obj);
                    }
                };
                lVarV.B(objI7);
            }
            lVarV.l();
            G6.VisionXComposable(recordingType, x11, interfaceC4264qRememberCameraXEngine, debugModeEnabled, aVar, aVar2, lVar4, (wn0.l) objI7, content, lVarV, ((i13 << 12) & 234881024) | 12582912);
            lVar3 = lVarV;
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVar3.o(480750402);
            boolean zK = lVar3.K(config) | lVar3.K(x11);
            Object objI8 = lVar3.I();
            if (zK || objI8 == companion.a()) {
                objI8 = new b(config, x11, null);
                lVar3.B(objI8);
            }
            lVar3.l();
            Function0.g(h0Var, (wn0.p) objI8, lVar3, 6);
            lVar3.o(480754732);
            boolean zK2 = lVar3.K(x11);
            Object objI9 = lVar3.I();
            if (zK2 || objI9 == companion.a()) {
                objI9 = new wn0.l() { // from class: com.fourthline.vision.internal.l8
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return T1.CameraXDocumentScanner$lambda$14$lambda$13(x11, (Lifecycle.a) obj);
                    }
                };
                lVar3.B(objI9);
            }
            lVar3.l();
            AbstractC4251o0.OnLifecycleEvent((wn0.l) objI9, lVar3, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.m8
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return T1.CameraXDocumentScanner$lambda$15(config, documentDetectionAreaProvider, controls, callback, content, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E5 CameraXDocumentScanner$lambda$1(p020r2.p1<E5> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXDocumentScanner$lambda$11$lambda$10(p020r2.p1 p1Var, j3.i rect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p1Var.setValue(new E5((int) rect.o(), (int) rect.h()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXDocumentScanner$lambda$14$lambda$13(X1 x11, Lifecycle.a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event == Lifecycle.a.ON_PAUSE) {
            x11.stop();
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXDocumentScanner$lambda$15(DocumentScannerConfig documentScannerConfig, wn0.a aVar, Flow flow, wn0.l lVar, wn0.p pVar, int i11, p020r2.l lVar2, int i12) {
        CameraXDocumentScanner(documentScannerConfig, aVar, flow, lVar, pVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXDocumentScanner$lambda$9$lambda$8(wn0.l lVar, EnumC4241m4 VisionXComposable) {
        DocumentScannerError documentScannerError;
        p013kotlin.jvm.internal.s.k(VisionXComposable, "$this$VisionXComposable");
        int i11 = c.$EnumSwitchMapping$0[VisionXComposable.ordinal()];
        if (i11 == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("handled differently");
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        lVar.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
        return jn0.h0.f84049a;
    }
}
