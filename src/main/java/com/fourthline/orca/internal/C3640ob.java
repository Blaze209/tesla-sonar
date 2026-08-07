package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.compose.DocumentScannerControl;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.document.compose.DocumentScannerInternalConfig;
import com.fourthline.vision.internal.VisionDocumentScannerFeatureConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3640ob implements InterfaceC3302gf, CoroutineScope {
    public static final a B = new a(null);
    public static final int C = 8;
    private Job A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f34137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f34138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f34139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3212eb f34140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3298gb f34141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3425jb f34142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3921uz f34143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4066yD f34144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ED f34145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC2931Re f34146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ND f34147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC3354ho f34148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC4044xs f34149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC3019Za f34150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final DocumentScannerInternalConfig f34151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Pair f34152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DocumentScannerStep f34157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private DocumentScannerStepWarning f34158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DocumentScannerStepResult f34159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final MutableSharedFlow f34160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Flow f34161y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final wn0.l f34162z;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentValidationError.values().length];
            try {
                iArr[DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentValidationError.DOCUMENT_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentValidationError.DOCUMENT_TYPE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentValidationError.NATIONALITY_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentValidationError.PERSON_NOT_ADULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentValidationError.MRZ_NOT_VALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentValidationError.MRZ_NOT_DETECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentValidationError.PHOTO_DETECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DocumentValidationError.PHOTO_NOT_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34163a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2973Va f34165c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$c$a */
        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3640ob f34166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2973Va f34167b;

            a(C3640ob c3640ob, C2973Va c2973Va) {
                this.f34166a = c3640ob;
                this.f34167b = c2973Va;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    if (fd2 instanceof FD.a) {
                        this.f34166a.a(new InterfaceC2937Ta.a.d(((FD.a) fd2).a()));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f34166a.a(this.f34167b);
                    }
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2973Va c2973Va, Continuation continuation) {
            super(2, continuation);
            this.f34165c = c2973Va;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new c(this.f34165c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f34163a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L46
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L32
            L1e:
                jn0.t.b(r6)
                com.fourthline.orca.internal.ob r6 = com.fourthline.orca.internal.C3640ob.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3640ob.f(r6)
                com.fourthline.orca.internal.Va r1 = r5.f34165c
                r5.f34163a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.ob$c$a r1 = new com.fourthline.orca.internal.ob$c$a
                com.fourthline.orca.internal.ob r3 = com.fourthline.orca.internal.C3640ob.this
                com.fourthline.orca.internal.Va r4 = r5.f34165c
                r1.<init>(r3, r4)
                r5.f34163a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3640ob.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$d */
    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34168a;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34168a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3640ob.this.f34160x;
                DocumentScannerControl.MoveToNextStep moveToNextStep = DocumentScannerControl.MoveToNextStep.INSTANCE;
                this.f34168a = 1;
                if (mutableSharedFlow.emit(moveToNextStep, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$e */
    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34170a;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34170a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3640ob.this.f34160x;
                DocumentScannerControl.StartScanner startScanner = DocumentScannerControl.StartScanner.INSTANCE;
                this.f34170a = 1;
                if (mutableSharedFlow.emit(startScanner, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$f */
    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34172a;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34172a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3640ob.this.f34160x;
                DocumentScannerControl.TakeSnapshot takeSnapshot = DocumentScannerControl.TakeSnapshot.INSTANCE;
                this.f34172a = 1;
                if (mutableSharedFlow.emit(takeSnapshot, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$g */
    static final class g extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34174a;

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34174a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3640ob.this.f34160x;
                DocumentScannerControl.RestartScanner restartScanner = DocumentScannerControl.RestartScanner.INSTANCE;
                this.f34174a = 1;
                if (mutableSharedFlow.emit(restartScanner, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$h */
    static final class h extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34176a;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34176a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3640ob.this.f34160x;
                DocumentScannerControl.ResetCurrentStep resetCurrentStep = DocumentScannerControl.ResetCurrentStep.INSTANCE;
                this.f34176a = 1;
                if (mutableSharedFlow.emit(resetCurrentStep, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$i */
    static final class i extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34178a;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34178a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f34178a = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C3640ob.this.f34158v = null;
            C3640ob.this.i().a(C3425jb.b(C3640ob.this.k(), C3640ob.this.f34157u, C3640ob.this.f34152p, false, C3640ob.this.f34156t && C3640ob.this.f34155s, C3640ob.this.f().h(), 4, null));
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$j */
    static final class j extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34180a;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34180a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3640ob c3640ob = C3640ob.this;
                this.f34180a = 1;
                if (c3640ob.a(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$k */
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34183b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34185d;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34183b = obj;
            this.f34185d |= Integer.MIN_VALUE;
            return C3640ob.this.a(this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$l */
    /* synthetic */ class l extends p013kotlin.jvm.internal.p implements wn0.a {
        l(Object obj) {
            super(0, obj, C3640ob.class, "onDocumentReadyPrimaryButtonClicked", "onDocumentReadyPrimaryButtonClicked()V", 0);
        }

        public final void a() {
            ((C3640ob) this.receiver).r();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$m */
    /* synthetic */ class m extends p013kotlin.jvm.internal.p implements wn0.a {
        m(Object obj) {
            super(0, obj, C3640ob.class, "onDocumentReadySecondaryButtonClicked", "onDocumentReadySecondaryButtonClicked()V", 0);
        }

        public final void a() {
            ((C3640ob) this.receiver).s();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$n */
    static final class n extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f34188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(wn0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f34188c = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3640ob.this.new n(this.f34188c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34186a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3640ob.this.i().a(C3425jb.b(C3640ob.this.k(), C3640ob.this.f34157u, C3640ob.this.f34152p, true, false, false, 24, null));
                this.f34186a = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f34188c.invoke();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ob$o */
    static final class o extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3921uz f34190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3640ob f34191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DocumentScannerStepResult f34192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(InterfaceC3921uz interfaceC3921uz, C3640ob c3640ob, DocumentScannerStepResult documentScannerStepResult, Continuation continuation) {
            super(2, continuation);
            this.f34190b = interfaceC3921uz;
            this.f34191c = c3640ob;
            this.f34192d = documentScannerStepResult;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f34190b, this.f34191c, this.f34192d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34189a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3921uz interfaceC3921uz = this.f34190b;
                C3640ob c3640ob = this.f34191c;
                InterfaceC3019Za interfaceC3019Za = c3640ob.f34150n;
                C3640ob c3640ob2 = this.f34191c;
                Gz gzA = interfaceC3019Za.a(c3640ob2, this.f34192d, c3640ob2.f34140d.a(), c3640ob2.f34157u);
                this.f34189a = 1;
                obj = interfaceC3921uz.a(c3640ob, gzA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            InterfaceC3921uz.b bVar = (InterfaceC3921uz.b) obj;
            if (bVar == InterfaceC3921uz.b.MoveToTheNextStep) {
                InterfaceC3019Za interfaceC3019Za2 = this.f34191c.f34150n;
                C3640ob c3640ob3 = this.f34191c;
                interfaceC3019Za2.a(c3640ob3, bVar, c3640ob3.f34157u);
                if (this.f34191c.f34140d.o()) {
                    this.f34191c.m();
                } else {
                    final C3640ob c3640ob4 = this.f34191c;
                    c3640ob4.a(this.f34192d, new wn0.a() { // from class: com.fourthline.orca.internal.l91
                        @Override // wn0.a
                        public final Object invoke() {
                            return C3640ob.o.a(c3640ob4);
                        }
                    });
                }
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(C3640ob c3640ob) {
            c3640ob.m();
            return jn0.h0.f84049a;
        }
    }

    public C3640ob(Is presenter, C2874Gc effectHandler, InterfaceC3212eb repository, InterfaceC3298gb resultRepository, C3425jb stateProvider, InterfaceC3921uz stepConfirmationHandler, InterfaceC4066yD videoRecordingHandler, ED viewCompletionHandler, InterfaceC2931Re documentErrorHandler, ND viewNavigator, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, InterfaceC3019Za featurePilotHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(stepConfirmationHandler, "stepConfirmationHandler");
        p013kotlin.jvm.internal.s.k(videoRecordingHandler, "videoRecordingHandler");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(documentErrorHandler, "documentErrorHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(featurePilotHandler, "featurePilotHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f34137a = coroutineScope;
        this.f34138b = presenter;
        this.f34139c = effectHandler;
        this.f34140d = repository;
        this.f34141e = resultRepository;
        this.f34142f = stateProvider;
        this.f34143g = stepConfirmationHandler;
        this.f34144h = videoRecordingHandler;
        this.f34145i = viewCompletionHandler;
        this.f34146j = documentErrorHandler;
        this.f34147k = viewNavigator;
        this.f34148l = analytics;
        this.f34149m = popupHandler;
        this.f34150n = featurePilotHandler;
        this.f34151o = new DocumentScannerInternalConfig(repository.h(), repository.f(), new VisionDocumentScannerFeatureConfig(false, false, VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist, featurePilotHandler instanceof Ey ? (Ey) featurePilotHandler : null, 3, null));
        this.f34153q = true;
        this.f34154r = true;
        this.f34156t = true;
        this.f34157u = stateProvider.r();
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34160x = mutableSharedFlowMutableSharedFlow$default;
        this.f34161y = mutableSharedFlowMutableSharedFlow$default;
        this.f34162z = new wn0.l() { // from class: com.fourthline.orca.internal.h91
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3640ob.a(this.f32238a, (DocumentScannerEvent) obj);
            }
        };
    }

    private final void A() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(null), 3, null);
        B();
    }

    private final void B() {
        b();
        this.f34143g.reset();
        this.f34142f.j();
        this.f34154r = true;
        DocumentScannerStep documentScannerStepR = this.f34142f.r();
        this.f34157u = documentScannerStepR;
        this.f34152p = null;
        this.f34138b.a(C3425jb.b(this.f34142f, documentScannerStepR, null, false, this.f34156t && this.f34155s, false, 20, null));
    }

    private final void D() {
        Job job = this.A;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.A = BuildersKt__Builders_commonKt.launch$default(this, null, null, new i(null), 3, null);
    }

    private final void E() {
        if (e().getShouldStartAutomatically()) {
            this.f34138b.a(new wn0.l() { // from class: com.fourthline.orca.internal.f91
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3640ob.c(this.f31647a, (InterfaceC3004Wa) obj);
                }
            });
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new j(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2937Ta F() {
        return InterfaceC2937Ta.d.f27880a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2937Ta G() {
        return InterfaceC2937Ta.d.f27880a;
    }

    private final void H() {
        DocumentScannerStep documentScannerStepCopy$default = DocumentScannerStep.copy$default(this.f34157u, 0, null, false, false, 7, null);
        this.f34157u = documentScannerStepCopy$default;
        this.f34138b.a(C3425jb.b(this.f34142f, documentScannerStepCopy$default, this.f34152p, false, this.f34156t && this.f34155s, f().h(), 4, null));
    }

    private final void n() {
        if (this.f34153q) {
            this.f34153q = false;
            x();
        }
    }

    private final void o() {
        this.f34138b.a(this.f34142f.g());
    }

    private final void p() {
        this.f34148l.track(new C2932Sa.a.e(this.f34157u));
        DocumentScannerStepResult documentScannerStepResult = this.f34159w;
        if (documentScannerStepResult != null) {
            c(documentScannerStepResult);
            return;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentScannerStepResult + " must not be null."))).toString());
    }

    private final void q() {
        this.f34148l.track(new C2932Sa.a.g(this.f34157u));
        InterfaceC3004Wa interfaceC3004WaF = f();
        InterfaceC3004Wa.b bVar = interfaceC3004WaF instanceof InterfaceC3004Wa.b ? (InterfaceC3004Wa.b) interfaceC3004WaF : null;
        if ((bVar != null ? bVar.t() : null) != null) {
            o();
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(null), 3, null);
        this.f34142f.j();
        this.f34138b.a(new wn0.l() { // from class: com.fourthline.orca.internal.a91
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3640ob.b(this.f30322a, (InterfaceC3004Wa) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2937Ta t() {
        return new InterfaceC2937Ta.c(p013kotlin.collections.v.e("android.permission.CAMERA"));
    }

    private final void u() {
        this.f34138b.a(this.f34142f.t());
    }

    private final void v() {
        if (this.f34153q) {
            this.f34153q = false;
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2937Ta w() {
        return InterfaceC2937Ta.b.f27878a;
    }

    private final void x() {
        this.f34148l.track(new C2932Sa.a.l(this.f34157u));
        C();
    }

    private final void y() {
        this.f34156t = false;
        this.f34138b.a(this.f34142f.d(false));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(null), 3, null);
    }

    public final void C() {
        this.f34142f.j();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new h(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f34137a.getCoroutineContext();
    }

    public final wn0.l l() {
        return this.f34162z;
    }

    public final Job m() {
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
    }

    public final void z() {
        this.f34155s = false;
        this.f34154r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa b(C3640ob c3640ob, InterfaceC3004Wa present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3640ob.f34142f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa c(C3640ob c3640ob, InterfaceC3004Wa present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3640ob.f34142f.getInitialState();
    }

    private final void d() {
        this.f34138b.a(new wn0.l() { // from class: com.fourthline.orca.internal.d91
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3640ob.a(this.f31084a, (InterfaceC3004Wa) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3004Wa f() {
        return (InterfaceC3004Wa) this.f34138b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l(C3640ob c3640ob) {
        c3640ob.f34148l.track(C2932Sa.a.d.f27759a);
        c3640ob.f34139c.a(new wn0.a() { // from class: com.fourthline.orca.internal.c91
            @Override // wn0.a
            public final Object invoke() {
                return C3640ob.w();
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(C3640ob c3640ob) {
        c3640ob.b(DocumentScannerError.UNKNOWN);
        return jn0.h0.f84049a;
    }

    public final DocumentScannerConfig e() {
        DocumentScannerConfig documentScannerConfigT = this.f34140d.t();
        documentScannerConfigT.setInternalConfig(this.f34151o);
        return documentScannerConfigT;
    }

    public final DocumentType g() {
        return this.f34140d.t().getType();
    }

    public final C2874Gc h() {
        return this.f34139c;
    }

    public final Is i() {
        return this.f34138b;
    }

    public final Flow j() {
        return this.f34161y;
    }

    public final C3425jb k() {
        return this.f34142f;
    }

    private final void b(DocumentScannerStepResult documentScannerStepResult) {
        b();
        DocumentValidationError documentValidationErrorA = this.f34150n.a(documentScannerStepResult);
        if (documentValidationErrorA != null) {
            a(documentValidationErrorA);
        } else {
            a(documentScannerStepResult);
        }
    }

    private final void c(DocumentScannerStepResult documentScannerStepResult) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new o(this.f34143g, this, documentScannerStepResult, null), 3, null);
    }

    private final void d(final DocumentScannerStepResult documentScannerStepResult) {
        this.f34153q = true;
        this.f34148l.track(new C2932Sa.a.f(this.f34157u));
        this.f34138b.a(new wn0.l() { // from class: com.fourthline.orca.internal.b91
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3640ob.a(this.f30583a, documentScannerStepResult, (InterfaceC3004Wa) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(C3640ob c3640ob) {
        c3640ob.A();
        return jn0.h0.f84049a;
    }

    private final void c() {
        this.f34154r = false;
        a(InterfaceC2937Ta.a.C0518a.f27873a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3640ob c3640ob, DocumentScannerEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof DocumentScannerEvent.OnFail) {
            c3640ob.a(((DocumentScannerEvent.OnFail) event).getError());
        } else if (event instanceof DocumentScannerEvent.OnStepFail) {
            c3640ob.a(((DocumentScannerEvent.OnStepFail) event).getError());
        } else if (event instanceof DocumentScannerEvent.OnStepSuccess) {
            c3640ob.b(((DocumentScannerEvent.OnStepSuccess) event).getResult());
        } else if (event instanceof DocumentScannerEvent.OnStepUpdate) {
            c3640ob.a(((DocumentScannerEvent.OnStepUpdate) event).getStep());
        } else if (event instanceof DocumentScannerEvent.OnStepsCountUpdate) {
            c3640ob.a(((DocumentScannerEvent.OnStepsCountUpdate) event).getCount());
        } else if (event instanceof DocumentScannerEvent.OnSuccess) {
            c3640ob.a(((DocumentScannerEvent.OnSuccess) event).getResult());
        } else {
            if (!(event instanceof DocumentScannerEvent.OnWarnings)) {
                throw new NoWhenBranchMatchedException();
            }
            c3640ob.a(((DocumentScannerEvent.OnWarnings) event).getWarnings());
        }
        return jn0.h0.f84049a;
    }

    private final void b(DocumentScannerError documentScannerError) {
        this.f34139c.a(new wn0.a() { // from class: com.fourthline.orca.internal.j91
            @Override // wn0.a
            public final Object invoke() {
                return C3640ob.F();
            }
        });
        this.f34146j.handleRecoverableError(new AbstractC3502l8.e(documentScannerError), "document_scanner", new wn0.a() { // from class: com.fourthline.orca.internal.k91
            @Override // wn0.a
            public final Object invoke() {
                return C3640ob.n(this.f32937a);
            }
        });
    }

    private final void b() {
        Job job = this.A;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC2968Ua event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC2968Ua.i) {
            y();
            return;
        }
        if (event instanceof InterfaceC2968Ua.f) {
            v();
            return;
        }
        if (event instanceof InterfaceC2968Ua.a) {
            n();
            return;
        }
        if (event instanceof InterfaceC2968Ua.c) {
            q();
            return;
        }
        if (event instanceof InterfaceC2968Ua.h) {
            a(((InterfaceC2968Ua.h) event).a());
            return;
        }
        if (event instanceof InterfaceC2968Ua.g) {
            a(((InterfaceC2968Ua.g) event).a());
            return;
        }
        if (event instanceof InterfaceC2968Ua.e) {
            u();
        } else if (event instanceof InterfaceC2968Ua.d) {
            a(((InterfaceC2968Ua.d) event).a());
        } else {
            if (!(event instanceof InterfaceC2968Ua.b)) {
                throw new NoWhenBranchMatchedException();
            }
            o();
        }
    }

    private final void a(Bitmap bitmap) {
        this.f34148l.track(C2932Sa.a.k.f27769a);
        this.f34138b.a(this.f34142f.a(bitmap));
    }

    private final void a(boolean z11) {
        this.f34148l.track(C2932Sa.a.j.f27768a);
        d();
        if (z11) {
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation continuation) {
        k kVar;
        C3640ob c3640ob;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f34185d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f34185d = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.f34183b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f34185d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long jB = this.f34140d.i().b();
            kVar.f34182a = this;
            kVar.f34185d = 1;
            if (DelayKt.delay(jB, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3640ob = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3640ob = (C3640ob) kVar.f34182a;
            jn0.t.b(obj);
        }
        c3640ob.f34149m.a(InterfaceC3004Wa.a.f29494a, new l(c3640ob), new m(c3640ob));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(C3640ob c3640ob, InterfaceC3004Wa present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        InterfaceC3004Wa interfaceC3004WaF = c3640ob.f();
        if (!(interfaceC3004WaF instanceof InterfaceC3004Wa.c.a)) {
            return present;
        }
        InterfaceC3004Wa.c.a aVar = (InterfaceC3004Wa.c.a) interfaceC3004WaF;
        return aVar.a((15871 & 1) != 0 ? aVar.f29510a : null, (15871 & 2) != 0 ? aVar.f29511b : null, (15871 & 4) != 0 ? aVar.f29512c : null, (15871 & 8) != 0 ? aVar.f29513d : true, (15871 & 16) != 0 ? aVar.f29514e : null, (15871 & 32) != 0 ? aVar.f29515f : null, (15871 & 64) != 0 ? aVar.f29516g : null, (15871 & 128) != 0 ? aVar.f29517h : null, (15871 & 256) != 0 ? aVar.f29518i : null, (15871 & 512) != 0 ? aVar.f29519j : null, (15871 & 1024) != 0 ? aVar.f29520k : null, (15871 & 2048) != 0 ? aVar.f29521l : false, (15871 & 4096) != 0 ? aVar.f29522m : false, (15871 & PKIFailureInfo.certRevoked) != 0 ? aVar.f29523n : null);
    }

    private final void a(Map map) {
        if (p013kotlin.jvm.internal.s.f(map.get("android.permission.CAMERA"), Boolean.TRUE)) {
            this.f34148l.track(C2932Sa.a.c.f27758a);
            E();
        } else {
            if (!map.isEmpty()) {
                this.f34148l.track(C2932Sa.a.b.f27757a);
                this.f34146j.handleRecoverableError(new AbstractC3502l8.c(p013kotlin.collections.v.m1(map.keySet())), "document_scanner", new wn0.a() { // from class: com.fourthline.orca.internal.i91
                    @Override // wn0.a
                    public final Object invoke() {
                        return C3640ob.l(this.f32455a);
                    }
                });
                return;
            }
            throw new IllegalStateException("Developer error");
        }
    }

    private final void a(int i11) {
        this.f34152p = jn0.x.a(0, Integer.valueOf(i11));
    }

    private final void a(DocumentScannerStep documentScannerStep) {
        Pair pair = this.f34152p;
        Pair pairD = pair != null ? Pair.d(pair, Integer.valueOf(documentScannerStep.getIndex()), null, 2, null) : null;
        this.f34152p = pairD;
        this.f34155s = true;
        this.f34156t = true;
        this.f34157u = documentScannerStep;
        this.f34138b.a(C3425jb.b(this.f34142f, documentScannerStep, pairD, false, true, f().h(), 4, null));
    }

    private final void a(List list) {
        if (!list.contains(DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED) && !list.contains(DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE)) {
            if (this.f34158v == null) {
                DocumentScannerStepWarning documentScannerStepWarning = (DocumentScannerStepWarning) p013kotlin.collections.v.q0(list);
                this.f34158v = documentScannerStepWarning;
                this.f34138b.a(this.f34142f.a(this.f34157u, documentScannerStepWarning));
                D();
                return;
            }
            return;
        }
        if (this.f34157u.isAutoDetectAvailable()) {
            H();
        }
    }

    private final void a(DocumentScannerStepError documentScannerStepError) {
        AbstractC3989wg.a("Should not happen!", new wn0.a() { // from class: com.fourthline.orca.internal.g91
            @Override // wn0.a
            public final Object invoke() {
                return C3640ob.m(this.f31960a);
            }
        });
    }

    private final void a(final DocumentScannerStepResult documentScannerStepResult) {
        this.f34159w = documentScannerStepResult;
        if (this.f34140d.o()) {
            a(documentScannerStepResult, new wn0.a() { // from class: com.fourthline.orca.internal.e91
                @Override // wn0.a
                public final Object invoke() {
                    return C3640ob.a(this.f31361a, documentScannerStepResult);
                }
            });
        } else {
            c(documentScannerStepResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3640ob c3640ob, DocumentScannerStepResult documentScannerStepResult) {
        c3640ob.d(documentScannerStepResult);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3004Wa a(C3640ob c3640ob, DocumentScannerStepResult documentScannerStepResult, InterfaceC3004Wa present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3640ob.f34142f.b(documentScannerStepResult.getImage().getCropped());
    }

    private final void a(DocumentValidationError documentValidationError) {
        AbstractC3641oc abstractC3641oc;
        z();
        this.f34139c.a(new wn0.a() { // from class: com.fourthline.orca.internal.y81
            @Override // wn0.a
            public final Object invoke() {
                return C3640ob.G();
            }
        });
        switch (b.$EnumSwitchMapping$0[documentValidationError.ordinal()]) {
            case 1:
                abstractC3641oc = AbstractC3641oc.e.f34198a;
                break;
            case 2:
                abstractC3641oc = AbstractC3641oc.a.f34194a;
                break;
            case 3:
                abstractC3641oc = AbstractC3641oc.d.f34197a;
                break;
            case 4:
                abstractC3641oc = AbstractC3641oc.g.f34200a;
                break;
            case 5:
                abstractC3641oc = AbstractC3641oc.i.f34202a;
                break;
            case 6:
                abstractC3641oc = AbstractC3641oc.j.f34203a;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(("Orca doesn't support " + documentValidationError + " error").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f34146j.handleError(new AbstractC3502l8.d(abstractC3641oc), "document_scanner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job a(DocumentScannerStepResult documentScannerStepResult, wn0.a aVar) {
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new n(aVar, null), 3, null);
    }

    private final void a(DocumentScannerError documentScannerError) {
        this.f34155s = false;
        b();
        if (documentScannerError == DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED) {
            this.f34139c.a(new wn0.a() { // from class: com.fourthline.orca.internal.z81
                @Override // wn0.a
                public final Object invoke() {
                    return C3640ob.t();
                }
            });
        } else if (this.f34154r) {
            b(documentScannerError);
        }
    }

    private final void a(DocumentScannerResult documentScannerResult) {
        this.f34155s = false;
        b();
        C2973Va c2973VaA = this.f34150n.a(documentScannerResult);
        this.f34141e.a(c2973VaA);
        this.f34148l.track(C2932Sa.a.m.f27772a);
        a(c2973VaA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C2973Va c2973Va) {
        VideoRecording videoRecording = c2973Va.a().getVideoRecording();
        if (videoRecording != null) {
            this.f34144h.a(videoRecording);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(c2973Va, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC2937Ta.a aVar) {
        this.f34147k.a(aVar);
    }
}
