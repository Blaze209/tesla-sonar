package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.OnVisionScannerEffect;
import com.fourthline.vision.VisionScannerEffect;
import com.fourthline.vision.VisionScannerEvent;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerControl;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z2 {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieScannerConfig f38110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l f38111d;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.Z2$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0639a extends p013kotlin.jvm.internal.p implements wn0.l {
            C0639a(Object obj) {
                super(1, obj, Z2.class, "onPermissionDenied", "onPermissionDenied(Lkotlin/jvm/functions/Function1;Lcom/fourthline/vision/internal/VisionPermission;)V", 1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t6) obj);
                return jn0.h0.f84049a;
            }

            public final void invoke(t6 p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                Z2.onPermissionDenied((wn0.l) this.receiver, p11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, SelfieScannerConfig selfieScannerConfig, wn0.l<? super SelfieScannerEvent, jn0.h0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38109b = context;
            this.f38110c = selfieScannerConfig;
            this.f38111d = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f38109b, this.f38110c, this.f38111d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f38108a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            AbstractC4278s0.checkVisionPermissions(this.f38109b, this.f38110c.getRecordingType(), new C0639a(this.f38111d));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class b implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f38112a;

        b(p020r2.p1<k3.n3> p1Var) {
            this.f38112a = p1Var;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m90invoke58bKbWc(((k3.n3) obj).getValues());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m90invoke58bKbWc(float[] VisionView) {
            p013kotlin.jvm.internal.s.k(VisionView, "$this$VisionView");
            this.f38112a.setValue(k3.n3.a(VisionView));
        }
    }

    static final class c implements wn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f38113a;

        c(p020r2.p1<k3.n3> p1Var) {
            this.f38113a = p1Var;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            return k3.n3.a(m91invokesQKQjiQ());
        }

        /* JADX INFO: renamed from: invoke-sQKQjiQ, reason: not valid java name */
        public final float[] m91invokesQKQjiQ() {
            return ((k3.n3) this.f38113a.getValue()).getValues();
        }
    }

    public static final class d implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f38114a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f38115a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.Z2$d$a$a, reason: collision with other inner class name */
            public static final class C0640a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f38116a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f38117b;

                public C0640a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38116a = obj;
                    this.f38117b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f38115a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0640a c0640a;
                if (continuation instanceof C0640a) {
                    c0640a = (C0640a) continuation;
                    int i11 = c0640a.f38117b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0640a.f38117b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0640a = new C0640a(continuation);
                    }
                } else {
                    c0640a = new C0640a(continuation);
                }
                Object obj2 = c0640a.f38116a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0640a.f38117b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f38115a;
                    if (!(((SelfieScannerControl) obj) instanceof SelfieScannerControl.RestartScanner)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VisionScannerEvent.RestartScanner restartScanner = VisionScannerEvent.RestartScanner.INSTANCE;
                    c0640a.f38117b = 1;
                    if (flowCollector.emit(restartScanner, c0640a) == coroutine_suspended) {
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

        public d(Flow flow) {
            this.f38114a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f38114a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public static final class e implements SelfieScannerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f38119a;

        e(wn0.l<? super SelfieScannerEvent, jn0.h0> lVar) {
            this.f38119a = lVar;
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onFail(SelfieScannerError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f38119a.invoke(new SelfieScannerEvent.OnFail(error));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onStepUpdate(SelfieScannerStep step) {
            p013kotlin.jvm.internal.s.k(step, "step");
            this.f38119a.invoke(new SelfieScannerEvent.OnStepUpdate(step));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onSuccess(SelfieScannerResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f38119a.invoke(new SelfieScannerEvent.OnSuccess(result));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onWarnings(List<? extends SelfieScannerWarning> warnings) {
            p013kotlin.jvm.internal.s.k(warnings, "warnings");
            this.f38119a.invoke(new SelfieScannerEvent.OnWarnings(warnings));
        }
    }

    public static final class f implements OnVisionScannerEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SelfieScannerConfig f38120a;

        f(SelfieScannerConfig selfieScannerConfig) {
            this.f38120a = selfieScannerConfig;
        }

        @Override // com.fourthline.vision.OnVisionScannerEffect
        public void onVisionScannerEffect(VisionScannerEffect effect) {
            wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback;
            SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent onLivenessStepUpdate;
            p013kotlin.jvm.internal.s.k(effect, "effect");
            SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = this.f38120a.getInternalConfig().getRandomnessLiveness();
            if (randomnessLiveness == null || (callback = randomnessLiveness.getCallback()) == null) {
                return;
            }
            if (effect instanceof VisionScannerEffect.OnHeadMoved) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved(((VisionScannerEffect.OnHeadMoved) effect).getMetadata());
            } else if (effect instanceof VisionScannerEffect.OnLivenessStepCountUpdate) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate(((VisionScannerEffect.OnLivenessStepCountUpdate) effect).getCount());
            } else if (effect instanceof VisionScannerEffect.OnLivenessStepSuccess) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess(((VisionScannerEffect.OnLivenessStepSuccess) effect).getIndex());
            } else {
                if (!(effect instanceof VisionScannerEffect.OnLivenessStepUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(((VisionScannerEffect.OnLivenessStepUpdate) effect).getDirection());
            }
            callback.invoke(onLivenessStepUpdate);
        }
    }

    public /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t6.values().length];
            try {
                iArr[t6.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t6.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LegacySelfieScanner(final SelfieScannerConfig config, final wn0.a<j3.i> faceDetectionAreaProvider, final Flow<? extends SelfieScannerControl> controls, final wn0.l<? super SelfieScannerEvent, jn0.h0> callback, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar, final int i11) {
        int i12;
        Object obj;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(controls, "controls");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(1021675777);
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
        if ((i12 & 9363) == 9362 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1021675777, i12, -1, "com.fourthline.vision.selfie.internal.LegacySelfieScanner (LegacySelfieScannerComposable.kt:62)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(1039004820);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(k3.n3.a(k3.n3.c(null, 1, null)), null, 2, null);
                lVarV.B(objI);
            }
            p020r2.p1 p1Var = (p020r2.p1) objI;
            lVarV.l();
            lVarV.o(1039006933);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = internalDataSource(config, faceDetectionAreaProvider, new c(p1Var));
                lVarV.B(objI2);
            }
            final C4148a3 c4148a3 = (C4148a3) objI2;
            lVarV.l();
            lVarV.o(1039012699);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = buildDaggerSubcomponent(context, c4148a3, new e(callback), new f(config), new wn0.a() { // from class: com.fourthline.vision.internal.z8
                    @Override // wn0.a
                    public final Object invoke() {
                        return Z2.LegacySelfieScanner$lambda$3$lambda$2(config);
                    }
                });
                lVarV.B(objI3);
            }
            InterfaceC4276r5 interfaceC4276r5 = (InterfaceC4276r5) objI3;
            lVarV.l();
            kq.a aVarA = kq.b.a(RecordingExtensionsKt.getRequiredPermissions(config.getRecordingType()), null, lVarV, 0, 2);
            lVarV.o(1039075577);
            boolean zK = lVarV.K(context) | lVarV.K(config) | ((i12 & 7168) == 2048);
            Object objI4 = lVarV.I();
            if (zK || objI4 == companion.a()) {
                obj = null;
                objI4 = new a(context, config, callback, null);
                lVarV.B(objI4);
            } else {
                obj = null;
            }
            lVarV.l();
            Function0.g(aVarA, (wn0.p) objI4, lVarV, 0);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, obj), k3.p1.INSTANCE.a(), null, 2, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarD);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA2 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(854037215);
            if (aVarA.b()) {
                int i13 = i12;
                boolean debugModeEnabled = config.getDebugModeEnabled();
                d dVar = new d(controls);
                lVarV.o(854043592);
                boolean zK2 = lVarV.K(c4148a3);
                Object objI5 = lVarV.I();
                if (zK2 || objI5 == companion.a()) {
                    objI5 = new wn0.a() { // from class: com.fourthline.vision.internal.a9
                        @Override // wn0.a
                        public final Object invoke() {
                            return Z2.LegacySelfieScanner$lambda$9$lambda$7$lambda$6(c4148a3);
                        }
                    };
                    lVarV.B(objI5);
                }
                wn0.a aVar = (wn0.a) objI5;
                lVarV.l();
                lVarV.o(854048888);
                Object objI6 = lVarV.I();
                if (objI6 == companion.a()) {
                    objI6 = new b(p1Var);
                    lVarV.B(objI6);
                }
                lVarV.l();
                E6.VisionView(interfaceC4276r5, debugModeEnabled, true, aVar, (wn0.l) objI6, dVar, content, lVarV, ((i13 << 6) & 3670016) | 24960);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.b9
                @Override // wn0.p
                public final Object invoke(Object obj2, Object obj3) {
                    return Z2.LegacySelfieScanner$lambda$10(config, faceDetectionAreaProvider, controls, callback, content, i11, (p020r2.l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 LegacySelfieScanner$lambda$10(SelfieScannerConfig selfieScannerConfig, wn0.a aVar, Flow flow, wn0.l lVar, wn0.p pVar, int i11, p020r2.l lVar2, int i12) {
        LegacySelfieScanner(selfieScannerConfig, aVar, flow, lVar, pVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List LegacySelfieScanner$lambda$3$lambda$2(SelfieScannerConfig selfieScannerConfig) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = selfieScannerConfig.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.i LegacySelfieScanner$lambda$9$lambda$7$lambda$6(C4148a3 c4148a3) {
        return AbstractC4173d4.toComposeRect(c4148a3.contentDetectionArea());
    }

    private static final InterfaceC4276r5 buildDaggerSubcomponent(Context context, final C4148a3 c4148a3, final SelfieScannerCallback selfieScannerCallback, OnVisionScannerEffect onVisionScannerEffect, wn0.a<? extends List<Integer>> aVar) {
        return AbstractC4299v0.a().a(new L(context, C4213i4.f38402g.initFrom(c4148a3.config()), null, null, null, 28, null)).a(C4319y.f39104b.selfieCamera$fourthline_vision_release()).a().selfieBuilder().selfieModule(new C4324y4(new wn0.a() { // from class: com.fourthline.vision.internal.w8
            @Override // wn0.a
            public final Object invoke() {
                return c4148a3.config();
            }
        }, new wn0.a() { // from class: com.fourthline.vision.internal.x8
            @Override // wn0.a
            public final Object invoke() {
                return Z2.buildDaggerSubcomponent$lambda$12(selfieScannerCallback);
            }
        }, new wn0.a() { // from class: com.fourthline.vision.internal.y8
            @Override // wn0.a
            public final Object invoke() {
                return Z2.buildDaggerSubcomponent$lambda$13(c4148a3);
            }
        }, c4148a3, onVisionScannerEffect, aVar)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerCallback buildDaggerSubcomponent$lambda$12(SelfieScannerCallback selfieScannerCallback) {
        return selfieScannerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4234l4 buildDaggerSubcomponent$lambda$13(C4148a3 c4148a3) {
        return c4148a3;
    }

    private static final C4148a3 internalDataSource(SelfieScannerConfig selfieScannerConfig, wn0.a<j3.i> aVar, wn0.a<k3.n3> aVar2) {
        return new C4148a3(selfieScannerConfig, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied(wn0.l<? super SelfieScannerEvent, jn0.h0> lVar, t6 t6Var) {
        SelfieScannerError selfieScannerError;
        int i11 = g.$EnumSwitchMapping$0[t6Var.ordinal()];
        if (i11 == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        lVar.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
    }
}
