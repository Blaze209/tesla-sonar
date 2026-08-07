package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionScannerEvent;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.compose.SelfieScannerControl;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
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
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4221j5 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SelfieScannerConfig f38453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f38454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4242m5 f38455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4264q f38456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.f.a f38457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l f38458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.p f38459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f38460h;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0642a {
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

        /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a$b */
        public static final class b implements Flow {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f38461a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a$b$a, reason: collision with other inner class name */
            public static final class C0643a implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f38462a;

                /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a$b$a$a, reason: collision with other inner class name */
                public static final class C0644a extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f38463a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f38464b;

                    public C0644a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f38463a = obj;
                        this.f38464b |= Integer.MIN_VALUE;
                        return C0643a.this.emit(null, this);
                    }
                }

                public C0643a(FlowCollector flowCollector) {
                    this.f38462a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C0644a c0644a;
                    if (continuation instanceof C0644a) {
                        c0644a = (C0644a) continuation;
                        int i11 = c0644a.f38464b;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0644a.f38464b = i11 - Integer.MIN_VALUE;
                        } else {
                            c0644a = new C0644a(continuation);
                        }
                    } else {
                        c0644a = new C0644a(continuation);
                    }
                    Object obj2 = c0644a.f38463a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c0644a.f38464b;
                    if (i12 == 0) {
                        jn0.t.b(obj2);
                        FlowCollector flowCollector = this.f38462a;
                        if (!(((SelfieScannerControl) obj) instanceof SelfieScannerControl.RestartScanner)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VisionScannerEvent.RestartScanner restartScanner = VisionScannerEvent.RestartScanner.INSTANCE;
                        c0644a.f38464b = 1;
                        if (flowCollector.emit(restartScanner, c0644a) == coroutine_suspended) {
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

            public b(Flow flow) {
                this.f38461a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f38461a.collect(new C0643a(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
            }
        }

        a(SelfieScannerConfig selfieScannerConfig, Flow<? extends SelfieScannerControl> flow, C4242m5 c4242m5, InterfaceC4264q interfaceC4264q, androidx.camera.core.f.a aVar, wn0.l<? super SelfieScannerEvent, jn0.h0> lVar, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar, p020r2.p1<E5> p1Var) {
            this.f38453a = selfieScannerConfig;
            this.f38454b = flow;
            this.f38455c = c4242m5;
            this.f38456d = interfaceC4264q;
            this.f38457e = aVar;
            this.f38458f = lVar;
            this.f38459g = pVar;
            this.f38460h = p1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 invoke$lambda$2$lambda$1(wn0.l lVar, EnumC4241m4 VisionXComposable) {
            SelfieScannerError selfieScannerError;
            p013kotlin.jvm.internal.s.k(VisionXComposable, "$this$VisionXComposable");
            int i11 = C0642a.$EnumSwitchMapping$0[VisionXComposable.ordinal()];
            if (i11 == 1) {
                selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("handled differently");
                }
                selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
            }
            lVar.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 invoke$lambda$4$lambda$3(p020r2.p1 p1Var, j3.i rect) {
            p013kotlin.jvm.internal.s.k(rect, "rect");
            AbstractC4221j5.CameraXSelfieScanner$lambda$2(p1Var, new E5((int) rect.o(), (int) rect.h()));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        public final void invoke(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1169455704, i11, -1, "com.fourthline.visionx.selfie.CameraXSelfieScanner.<anonymous> (SelfieScannerComposable.kt:69)");
            }
            RecordingType recordingType = this.f38453a.getRecordingType();
            boolean debugModeEnabled = this.f38453a.getDebugModeEnabled();
            b bVar = new b(this.f38454b);
            C4242m5 c4242m5 = this.f38455c;
            InterfaceC4264q interfaceC4264q = this.f38456d;
            androidx.camera.core.f.a aVar = this.f38457e;
            lVar.o(648301341);
            boolean zN = lVar.n(this.f38458f);
            final wn0.l lVar2 = this.f38458f;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.vision.internal.na
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC4221j5.a.invoke$lambda$2$lambda$1(lVar2, (EnumC4241m4) obj);
                    }
                };
                lVar.B(objI);
            }
            wn0.l lVar3 = (wn0.l) objI;
            lVar.l();
            lVar.o(648322393);
            final p020r2.p1 p1Var = this.f38460h;
            Object objI2 = lVar.I();
            if (objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.vision.internal.oa
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC4221j5.a.invoke$lambda$4$lambda$3(p1Var, (j3.i) obj);
                    }
                };
                lVar.B(objI2);
            }
            lVar.l();
            G6.VisionXComposable(recordingType, c4242m5, interfaceC4264q, debugModeEnabled, aVar, bVar, lVar3, (wn0.l) objI2, this.f38459g, lVar, 12582912);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
    }

    public static final void CameraXSelfieScanner(final SelfieScannerConfig config, final wn0.a<j3.i> faceDetectionAreaProvider, final Flow<? extends SelfieScannerControl> controls, final wn0.l<? super SelfieScannerEvent, jn0.h0> callback, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar, final int i11) {
        int i12;
        InterfaceC4264q interfaceC4264q;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(controls, "controls");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-326649677);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(config) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(faceDetectionAreaProvider) ? 32 : 16;
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
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-326649677, i13, -1, "com.fourthline.visionx.selfie.CameraXSelfieScanner (SelfieScannerComposable.kt:38)");
            }
            lVarV.o(775569247);
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
            lVarV.o(775574352);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new C4310w4(context, coroutineScope);
                lVarV.B(objI3);
            }
            C4310w4 c4310w4 = (C4310w4) objI3;
            lVarV.l();
            c0.p DEFAULT_FRONT_CAMERA = c0.p.f18376c;
            p013kotlin.jvm.internal.s.j(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            InterfaceC4264q interfaceC4264qRememberCameraXEngine = J.rememberCameraXEngine(DEFAULT_FRONT_CAMERA, config.getInternalConfig().getPreferredVideoRecordingBitrate(), lVarV, 0);
            lVarV.o(775587472);
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                interfaceC4264q = interfaceC4264qRememberCameraXEngine;
                objI4 = c4310w4.stateMachine(interfaceC4264q, c4310w4.motionDataManager(config.getIncludeMotionData()), new wn0.a() { // from class: com.fourthline.vision.internal.ka
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC4221j5.CameraXSelfieScanner$lambda$1(p1Var);
                    }
                }, faceDetectionAreaProvider, config, callback);
                lVarV.B(objI4);
            } else {
                interfaceC4264q = interfaceC4264qRememberCameraXEngine;
            }
            C4242m5 c4242m5 = (C4242m5) objI4;
            lVarV.l();
            lVarV.o(775602036);
            Object objI5 = lVarV.I();
            if (objI5 == companion.a()) {
                objI5 = c4310w4.analyzer(interfaceC4264q.getCoordinates().getAnalyzerTargetCoordinateSystem(), c4242m5);
                lVarV.B(objI5);
            }
            androidx.camera.core.f.a aVar = (androidx.camera.core.f.a) objI5;
            lVarV.l();
            lVarV.o(775607491);
            boolean z11 = (i13 & 7168) == 2048;
            Object objI6 = lVarV.I();
            if (z11 || objI6 == companion.a()) {
                objI6 = new wn0.a() { // from class: com.fourthline.vision.internal.la
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC4221j5.CameraXSelfieScanner$lambda$8$lambda$7(callback);
                    }
                };
                lVarV.B(objI6);
            }
            lVarV.l();
            T3.PlayServicesGate((wn0.a) objI6, z2.c.e(-1169455704, true, new a(config, controls, c4242m5, interfaceC4264q, aVar, callback, content, p1Var), lVarV, 54), lVarV, 48);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.ma
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4221j5.CameraXSelfieScanner$lambda$9(config, faceDetectionAreaProvider, controls, callback, content, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E5 CameraXSelfieScanner$lambda$1(p020r2.p1<E5> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CameraXSelfieScanner$lambda$2(p020r2.p1<E5> p1Var, E5 e11) {
        p1Var.setValue(e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXSelfieScanner$lambda$8$lambda$7(wn0.l lVar) {
        lVar.invoke(new SelfieScannerEvent.OnFail(SelfieScannerError.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraXSelfieScanner$lambda$9(SelfieScannerConfig selfieScannerConfig, wn0.a aVar, Flow flow, wn0.l lVar, wn0.p pVar, int i11, p020r2.l lVar2, int i12) {
        CameraXSelfieScanner(selfieScannerConfig, aVar, flow, lVar, pVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }
}
