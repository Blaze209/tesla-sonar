package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.VisionScannerEvent;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.compose.DocumentScannerControl;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U1 {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2 f37990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l f37991d;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.U1$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0637a extends p013kotlin.jvm.internal.p implements wn0.l {
            C0637a(Object obj) {
                super(1, obj, U1.class, "onPermissionDenied", "onPermissionDenied(Lkotlin/jvm/functions/Function1;Lcom/fourthline/vision/internal/VisionPermission;)V", 1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t6) obj);
                return jn0.h0.f84049a;
            }

            public final void invoke(t6 p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                U1.onPermissionDenied((wn0.l) this.receiver, p11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, X2 x11, wn0.l<? super DocumentScannerEvent, jn0.h0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37989b = context;
            this.f37990c = x11;
            this.f37991d = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f37989b, this.f37990c, this.f37991d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f37988a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            AbstractC4278s0.checkVisionPermissions(this.f37989b, this.f37990c.config().getRecordingType(), new C0637a(this.f37991d));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f37993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2 f37994c;

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ X2 f37997c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X2 x11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f37997c = x11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f37997c, continuation);
                aVar.f37996b = obj;
                return aVar;
            }

            @Override // wn0.p
            public final Object invoke(DocumentScannerControl documentScannerControl, Continuation<? super jn0.h0> continuation) {
                return ((a) create(documentScannerControl, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f37995a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                if (p013kotlin.jvm.internal.s.f((DocumentScannerControl) this.f37996b, DocumentScannerControl.RestartScanner.INSTANCE)) {
                    this.f37997c.setShouldReloadConfigOnce(true);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Flow<? extends DocumentScannerControl> flow, X2 x11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37993b = flow;
            this.f37994c = x11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f37993b, this.f37994c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37992a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowOnEach = FlowKt.onEach(this.f37993b, new a(this.f37994c, null));
                this.f37992a = 1;
                if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class c implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f37998a;

        c(p020r2.p1<k3.n3> p1Var) {
            this.f37998a = p1Var;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m87invoke58bKbWc(((k3.n3) obj).getValues());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m87invoke58bKbWc(float[] VisionView) {
            p013kotlin.jvm.internal.s.k(VisionView, "$this$VisionView");
            this.f37998a.setValue(k3.n3.a(VisionView));
        }
    }

    static final class d implements wn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f37999a;

        d(p020r2.p1<k3.n3> p1Var) {
            this.f37999a = p1Var;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            return k3.n3.a(m88invokesQKQjiQ());
        }

        /* JADX INFO: renamed from: invoke-sQKQjiQ, reason: not valid java name */
        public final float[] m88invokesQKQjiQ() {
            return ((k3.n3) this.f37999a.getValue()).getValues();
        }
    }

    public static final class e implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f38000a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f38001a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.U1$e$a$a, reason: collision with other inner class name */
            public static final class C0638a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f38002a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f38003b;

                public C0638a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38002a = obj;
                    this.f38003b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f38001a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0638a c0638a;
                VisionScannerEvent visionScannerEvent;
                if (continuation instanceof C0638a) {
                    c0638a = (C0638a) continuation;
                    int i11 = c0638a.f38003b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0638a.f38003b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0638a = new C0638a(continuation);
                    }
                } else {
                    c0638a = new C0638a(continuation);
                }
                Object obj2 = c0638a.f38002a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0638a.f38003b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f38001a;
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
                    c0638a.f38003b = 1;
                    if (flowCollector.emit(visionScannerEvent, c0638a) == coroutine_suspended) {
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

        public e(Flow flow) {
            this.f38000a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f38000a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public static final class f implements DocumentScannerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f38005a;

        f(wn0.l<? super DocumentScannerEvent, jn0.h0> lVar) {
            this.f38005a = lVar;
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onFail(DocumentScannerError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f38005a.invoke(new DocumentScannerEvent.OnFail(error));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepFail(DocumentScannerStepError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f38005a.invoke(new DocumentScannerEvent.OnStepFail(error));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepSuccess(DocumentScannerStepResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f38005a.invoke(new DocumentScannerEvent.OnStepSuccess(result));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepUpdate(DocumentScannerStep step) {
            p013kotlin.jvm.internal.s.k(step, "step");
            this.f38005a.invoke(new DocumentScannerEvent.OnStepUpdate(step));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepsCountUpdate(int i11) {
            this.f38005a.invoke(new DocumentScannerEvent.OnStepsCountUpdate(i11));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onSuccess(DocumentScannerResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f38005a.invoke(new DocumentScannerEvent.OnSuccess(result));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onWarnings(List<? extends DocumentScannerStepWarning> warnings) {
            p013kotlin.jvm.internal.s.k(warnings, "warnings");
            this.f38005a.invoke(new DocumentScannerEvent.OnWarnings(warnings));
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

    public static final class h implements DocumentScannerDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f38006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentScannerConfig f38007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f38008c;

        h(DocumentScannerConfig documentScannerConfig, wn0.a<j3.i> aVar) {
            this.f38007b = documentScannerConfig;
            this.f38008c = aVar;
            this.f38006a = documentScannerConfig.getShouldStartAutomatically();
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public DocumentScannerConfig getConfig() {
            return this.f38007b;
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public Rect getDocumentDetectionArea() {
            return k3.z3.a((j3.i) this.f38008c.invoke());
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public boolean getShouldStartAutomatically() {
            return this.f38006a;
        }
    }

    public static final void LegacyDocumentScanner(final DocumentScannerConfig config, final wn0.a<j3.i> documentDetectionAreaProvider, final Flow<? extends DocumentScannerControl> controls, final wn0.l<? super DocumentScannerEvent, jn0.h0> callback, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar, final int i11) {
        int i12;
        Object obj;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(controls, "controls");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-1555131502);
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
        if ((i12 & 9363) == 9362 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1555131502, i12, -1, "com.fourthline.vision.document.internal.LegacyDocumentScanner (DocumentScannerComposable.kt:61)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(-263241842);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(k3.n3.a(k3.n3.c(null, 1, null)), null, 2, null);
                lVarV.B(objI);
            }
            p020r2.p1 p1Var = (p020r2.p1) objI;
            lVarV.l();
            lVarV.o(-263239866);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = proxy(config, documentDetectionAreaProvider, new d(p1Var));
                lVarV.B(objI2);
            }
            final X2 x11 = (X2) objI2;
            lVarV.l();
            lVarV.o(-263234782);
            int i13 = i12 & 7168;
            boolean zN = lVarV.n(config) | lVarV.n(controls) | (i13 == 2048);
            Object objI3 = lVarV.I();
            if (zN || objI3 == companion.a()) {
                objI3 = buildDaggerSubcomponent(context, x11, new f(callback), config.getInternalConfig().getFeatureConfig());
                lVarV.B(objI3);
            }
            InterfaceC4195g2 interfaceC4195g2 = (InterfaceC4195g2) objI3;
            lVarV.l();
            kq.a aVarA = kq.b.a(RecordingExtensionsKt.getRequiredPermissions(x11.config().getRecordingType()), null, lVarV, 0, 2);
            lVarV.o(-263183968);
            boolean zK = lVarV.K(context) | lVarV.K(x11) | (i13 == 2048);
            Object objI4 = lVarV.I();
            if (zK || objI4 == companion.a()) {
                objI4 = new a(context, x11, callback, null);
                lVarV.B(objI4);
            }
            lVarV.l();
            Function0.g(aVarA, (wn0.p) objI4, lVarV, 0);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(-263177219);
            boolean zK2 = lVarV.K(controls) | lVarV.K(x11);
            Object objI5 = lVarV.I();
            if (zK2 || objI5 == companion.a()) {
                obj = null;
                objI5 = new b(controls, x11, null);
                lVarV.B(objI5);
            } else {
                obj = null;
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI5, lVarV, 6);
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
            lVarV.o(1869698440);
            if (aVarA.b()) {
                boolean debugModeEnabled = x11.config().getDebugModeEnabled();
                e eVar = new e(controls);
                lVarV.o(1869704829);
                boolean zK3 = lVarV.K(x11);
                Object objI6 = lVarV.I();
                if (zK3 || objI6 == companion.a()) {
                    objI6 = new wn0.a() { // from class: com.fourthline.vision.internal.o8
                        @Override // wn0.a
                        public final Object invoke() {
                            return U1.LegacyDocumentScanner$lambda$9$lambda$7$lambda$6(x11);
                        }
                    };
                    lVarV.B(objI6);
                }
                wn0.a aVar = (wn0.a) objI6;
                lVarV.l();
                lVarV.o(1869710002);
                Object objI7 = lVarV.I();
                if (objI7 == companion.a()) {
                    objI7 = new c(p1Var);
                    lVarV.B(objI7);
                }
                lVarV.l();
                E6.VisionView(interfaceC4195g2, debugModeEnabled, false, aVar, (wn0.l) objI7, eVar, content, lVarV, ((i12 << 6) & 3670016) | 24960);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.p8
                @Override // wn0.p
                public final Object invoke(Object obj2, Object obj3) {
                    return U1.LegacyDocumentScanner$lambda$10(config, documentDetectionAreaProvider, controls, callback, content, i11, (p020r2.l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 LegacyDocumentScanner$lambda$10(DocumentScannerConfig documentScannerConfig, wn0.a aVar, Flow flow, wn0.l lVar, wn0.p pVar, int i11, p020r2.l lVar2, int i12) {
        LegacyDocumentScanner(documentScannerConfig, aVar, flow, lVar, pVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.i LegacyDocumentScanner$lambda$9$lambda$7$lambda$6(X2 x11) {
        return AbstractC4173d4.toComposeRect(x11.contentDetectionArea());
    }

    private static final InterfaceC4195g2 buildDaggerSubcomponent(Context context, final X2 x11, final DocumentScannerCallback documentScannerCallback, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        return AbstractC4299v0.a().a(new L(context, C4213i4.f38402g.initFrom(x11.config(), x11.getShouldStartAutomatically()), null, null, visionDocumentScannerFeatureConfig, 12, null)).a(C4319y.f39104b.documentCamera$fourthline_vision_release()).a().documentBuilder().documentModule(new C4170d1(new wn0.a() { // from class: com.fourthline.vision.internal.q8
            @Override // wn0.a
            public final Object invoke() {
                return x11.config();
            }
        }, new wn0.a() { // from class: com.fourthline.vision.internal.r8
            @Override // wn0.a
            public final Object invoke() {
                return U1.buildDaggerSubcomponent$lambda$12(documentScannerCallback);
            }
        }, new wn0.a() { // from class: com.fourthline.vision.internal.s8
            @Override // wn0.a
            public final Object invoke() {
                return U1.buildDaggerSubcomponent$lambda$13(x11);
            }
        }, x11)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerCallback buildDaggerSubcomponent$lambda$12(DocumentScannerCallback documentScannerCallback) {
        return documentScannerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4234l4 buildDaggerSubcomponent$lambda$13(X2 x11) {
        return x11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied(wn0.l<? super DocumentScannerEvent, jn0.h0> lVar, t6 t6Var) {
        DocumentScannerError documentScannerError;
        int i11 = g.$EnumSwitchMapping$0[t6Var.ordinal()];
        if (i11 == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        lVar.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
    }

    private static final X2 proxy(DocumentScannerConfig documentScannerConfig, wn0.a<j3.i> aVar, wn0.a<k3.n3> aVar2) {
        return new X2(false, new h(documentScannerConfig, aVar), aVar2, 1, null);
    }
}
