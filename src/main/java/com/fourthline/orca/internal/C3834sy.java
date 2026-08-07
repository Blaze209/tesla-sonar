package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerControl;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3834sy implements InterfaceC3302gf, CoroutineScope {
    public static final a C = new a(null);
    public static final int D = 8;
    private Job A;
    private Job B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f35428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f35429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3791ry f35430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f35431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ND f35432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ED f35433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3663oy f35434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2931Re f35435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4044xs f35436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3354ho f35437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SelfieScannerInternalConfig.RandomnessLiveness f35438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SelfieScannerInternalConfig f35439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SelfieScannerStep f35440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SelfieScannerError f35441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SelfieScannerWarning f35442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Pair f35444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final MutableSharedFlow f35445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Flow f35446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final wn0.l f35447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Job f35448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Job f35450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Job f35451y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Job f35452z;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$c */
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l {
        c(Object obj) {
            super(1, obj, C3834sy.class, "onRandomnessLivenessEvent", "onRandomnessLivenessEvent(Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;)V", 0);
        }

        public final void a(SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3834sy) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$e */
    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35458a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation continuation) {
            super(2, continuation);
            this.f35460c = i11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new e(this.f35460c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Integer> sessionRandomnessLivenessSteps;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35458a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3834sy.this.g().a(new wn0.a() { // from class: com.fourthline.orca.internal.cd1
                    @Override // wn0.a
                    public final Object invoke() {
                        return C3834sy.e.a();
                    }
                });
                final Pair pair = C3834sy.this.f35444r;
                if (pair != null) {
                    final C3834sy c3834sy = C3834sy.this;
                    int i12 = this.f35460c;
                    c3834sy.f35444r = Pair.d(pair, Boxing.boxInt(i12 + 1), null, 2, null);
                    SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c3834sy.f35438l;
                    if (randomnessLiveness != null && (sessionRandomnessLivenessSteps = randomnessLiveness.getSessionRandomnessLivenessSteps()) != null) {
                        final int iIntValue = sessionRandomnessLivenessSteps.get(i12).intValue();
                        c3834sy.h().a(new wn0.l() { // from class: com.fourthline.orca.internal.dd1
                            @Override // wn0.l
                            public final Object invoke(Object obj2) {
                                return C3834sy.e.a(c3834sy, iIntValue, pair, (InterfaceC3491ky) obj2);
                            }
                        });
                        this.f35458a = 1;
                        if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C3834sy.this.f35452z = null;
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final InterfaceC3364hy a() {
            return new InterfaceC3364hy.d(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(C3834sy c3834sy, int i11, Pair pair, InterfaceC3491ky interfaceC3491ky) {
            Pair pair2 = c3834sy.f35444r;
            Integer numValueOf = pair2 != null ? Integer.valueOf(Iz.a(pair2)) : null;
            Pair pair3 = c3834sy.f35444r;
            return p013kotlin.jvm.internal.s.f(numValueOf, pair3 != null ? Integer.valueOf(Iz.b(pair3)) : null) ? c3834sy.f35430d.b(i11) : c3834sy.f35430d.a(i11, pair);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$f */
    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, Continuation continuation) {
            super(2, continuation);
            this.f35463c = i11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new f(this.f35463c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35461a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Job job = C3834sy.this.f35452z;
                if (job != null) {
                    this.f35461a = 1;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            Pair pair = C3834sy.this.f35444r;
            if (pair != null) {
                C3834sy c3834sy = C3834sy.this;
                int i12 = this.f35463c;
                c3834sy.a(c3834sy.f35430d.a(pair, i12));
                c3834sy.d(i12);
                c3834sy.f35451y = null;
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$g */
    static final class g extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35464a;

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
            return C3834sy.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35464a;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = C3834sy.this.f35445s;
                SelfieScannerControl.RestartScanner restartScanner = SelfieScannerControl.RestartScanner.INSTANCE;
                this.f35464a = 1;
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$h */
    static final class h extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35466a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, Continuation continuation) {
            super(2, continuation);
            this.f35468c = i11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new h(this.f35468c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35466a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f35466a = 1;
                if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            InterfaceC3791ry interfaceC3791ry = C3834sy.this.f35430d;
            C3834sy.this.h().a(interfaceC3791ry.a(this.f35468c));
            C3834sy.this.d(this.f35468c);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$i */
    static final class i extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35469a;

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
            return C3834sy.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35469a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f35469a = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C3834sy.this.f35442p = null;
            final InterfaceC3791ry interfaceC3791ry = C3834sy.this.f35430d;
            C3834sy.this.h().a(new wn0.l() { // from class: com.fourthline.orca.internal.ed1
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return C3834sy.i.a(interfaceC3791ry, (InterfaceC3491ky) obj2);
                }
            });
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(InterfaceC3791ry interfaceC3791ry, InterfaceC3491ky interfaceC3491ky) {
            return interfaceC3791ry.a(interfaceC3491ky);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$j */
    static final class j extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35471a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3491ky.b.InterfaceC0573b f35473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC3491ky.b.InterfaceC0573b interfaceC0573b, Continuation continuation) {
            super(2, continuation);
            this.f35473c = interfaceC0573b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(InterfaceC3491ky.b.InterfaceC0573b interfaceC0573b, InterfaceC3491ky interfaceC3491ky) {
            return interfaceC0573b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky b(C3834sy c3834sy, InterfaceC3491ky interfaceC3491ky) {
            return c3834sy.f35430d.i();
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new j(this.f35473c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r7) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f35471a
                r2 = 1000(0x3e8, double:4.94E-321)
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L20
                if (r1 == r5) goto L1c
                if (r1 != r4) goto L14
                jn0.t.b(r8)
                goto L55
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                jn0.t.b(r8)
                goto L3c
            L20:
                jn0.t.b(r8)
                com.fourthline.orca.internal.sy r8 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.Is r8 = r8.h()
                com.fourthline.orca.internal.sy r1 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.fd1 r6 = new com.fourthline.orca.internal.fd1
                r6.<init>()
                r8.a(r6)
                r7.f35471a = r5
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r2, r7)
                if (r8 != r0) goto L3c
                goto L54
            L3c:
                com.fourthline.orca.internal.sy r8 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.Is r8 = r8.h()
                com.fourthline.orca.internal.sy r1 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.gd1 r5 = new com.fourthline.orca.internal.gd1
                r5.<init>()
                r8.a(r5)
                r7.f35471a = r4
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r2, r7)
                if (r8 != r0) goto L55
            L54:
                return r0
            L55:
                com.fourthline.orca.internal.sy r8 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.Is r8 = r8.h()
                com.fourthline.orca.internal.ky$b$b r0 = r7.f35473c
                com.fourthline.orca.internal.hd1 r1 = new com.fourthline.orca.internal.hd1
                r1.<init>()
                r8.a(r1)
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3834sy.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(C3834sy c3834sy, InterfaceC3491ky interfaceC3491ky) {
            return c3834sy.f35430d.q();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$k */
    static final class k extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35474a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3491ky.b.a f35476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC3491ky.b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f35476c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(InterfaceC3491ky.b.a aVar, InterfaceC3491ky interfaceC3491ky) {
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new k(this.f35476c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35474a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Is isH = C3834sy.this.h();
                final C3834sy c3834sy = C3834sy.this;
                isH.a(new wn0.l() { // from class: com.fourthline.orca.internal.id1
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return C3834sy.k.a(c3834sy, (InterfaceC3491ky) obj2);
                    }
                });
                this.f35474a = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            Is isH2 = C3834sy.this.h();
            final InterfaceC3491ky.b.a aVar = this.f35476c;
            isH2.a(new wn0.l() { // from class: com.fourthline.orca.internal.jd1
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return C3834sy.k.a(aVar, (InterfaceC3491ky) obj2);
                }
            });
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3491ky a(C3834sy c3834sy, InterfaceC3491ky interfaceC3491ky) {
            return c3834sy.f35430d.q();
        }
    }

    public C3834sy(Is presenter, C2874Gc effectHandler, InterfaceC3791ry uiStateProvider, boolean z11, ND viewNavigator, ED viewCompletionHandler, InterfaceC3663oy repository, InterfaceC2931Re selfieErrorHandler, InterfaceC4044xs popupHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(uiStateProvider, "uiStateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(selfieErrorHandler, "selfieErrorHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f35427a = coroutineScope;
        this.f35428b = presenter;
        this.f35429c = effectHandler;
        this.f35430d = uiStateProvider;
        this.f35431e = z11;
        this.f35432f = viewNavigator;
        this.f35433g = viewCompletionHandler;
        this.f35434h = repository;
        this.f35435i = selfieErrorHandler;
        this.f35436j = popupHandler;
        this.f35437k = analytics;
        this.f35438l = d();
        this.f35439m = new SelfieScannerInternalConfig(repository.h(), repository.f(), this.f35438l);
        this.f35440n = SelfieScannerStep.SELFIE;
        this.f35443q = true;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35445s = mutableSharedFlowMutableSharedFlow$default;
        this.f35446t = mutableSharedFlowMutableSharedFlow$default;
        this.f35447u = new wn0.l() { // from class: com.fourthline.orca.internal.yc1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3834sy.a(this.f36981a, (SelfieScannerEvent) obj);
            }
        };
    }

    private final void A() {
        this.f35435i.handleRecoverableError(AbstractC3397ip.c.f32575a, "selfie_scanner", new wn0.a() { // from class: com.fourthline.orca.internal.vc1
            @Override // wn0.a
            public final Object invoke() {
                return C3834sy.i(this.f36075a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3364hy B() {
        return InterfaceC3364hy.b.f32384a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC3364hy C() {
        return new InterfaceC3364hy.d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC3364hy D() {
        return new InterfaceC3364hy.d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(InterfaceC3491ky.b.InterfaceC0573b interfaceC0573b, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return interfaceC0573b;
    }

    private final boolean k() {
        return this.f35438l != null;
    }

    private final void l() {
        InterfaceC3491ky interfaceC3491kyF = f();
        if (interfaceC3491kyF instanceof InterfaceC3491ky.a) {
            u();
            return;
        }
        if (!(interfaceC3491kyF instanceof InterfaceC3491ky.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("There is no negative button in this state (" + f() + ")");
    }

    private final void m() {
        this.f35428b.a(this.f35430d.g());
    }

    private final void n() {
        this.f35437k.track(new C3321gy.a.e(this.f35440n));
        SelfieScannerResult selfieScannerResultA = this.f35434h.a();
        if (selfieScannerResultA == null) {
            throw new IllegalStateException("selfieScannerResult is missing from repository");
        }
        a(selfieScannerResultA);
    }

    private final void o() {
        this.f35437k.track(new C3321gy.a.g(this.f35440n));
        InterfaceC3491ky interfaceC3491kyF = f();
        InterfaceC3491ky.a.C0572a c0572a = interfaceC3491kyF instanceof InterfaceC3491ky.a.C0572a ? (InterfaceC3491ky.a.C0572a) interfaceC3491kyF : null;
        if ((c0572a != null ? c0572a.t() : null) != null) {
            m();
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3364hy p() {
        return new InterfaceC3364hy.c(p013kotlin.collections.v.e("android.permission.CAMERA"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC3364hy q() {
        return new InterfaceC3364hy.d(null, 1, 0 == true ? 1 : 0);
    }

    private final void r() {
        this.f35428b.a(this.f35430d.f());
        Job job = this.f35450x;
        if (job != null) {
            job.start();
        }
    }

    private final void s() {
        x();
    }

    private final void t() {
        InterfaceC3491ky interfaceC3491kyF = f();
        if (interfaceC3491kyF instanceof InterfaceC3491ky.a) {
            n();
            return;
        }
        if (!(interfaceC3491kyF instanceof InterfaceC3491ky.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("There is no positive button in this state (" + f() + ")");
    }

    private final void u() {
        SelfieScannerError selfieScannerError = this.f35441o;
        if (selfieScannerError != null) {
            this.f35437k.track(new C3321gy.a.j(this.f35440n, selfieScannerError));
        }
        y();
    }

    private final void v() {
        this.f35437k.track(C3321gy.a.h.f32126a);
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC3364hy w() {
        return new InterfaceC3364hy.d(null, 1, 0 == true ? 1 : 0);
    }

    private final void x() {
        b();
        this.f35440n = SelfieScannerStep.SELFIE;
        this.f35443q = true;
        a(d());
        this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.oc1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3834sy.b(this.f34212a, (InterfaceC3491ky) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        if (!this.f35439m.getCameraX()) {
            a(InterfaceC3364hy.a.d.f32383a);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(null), 3, null);
            x();
        }
    }

    private final void z() {
        Job job = this.B;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.B = BuildersKt__Builders_commonKt.launch$default(this, null, null, new i(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f35427a.getCoroutineContext();
    }

    public final Flow i() {
        return this.f35446t;
    }

    public final wn0.l j() {
        return this.f35447u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(InterfaceC3491ky.b.a aVar, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return aVar;
    }

    private final void c(int i11) {
        this.f35451y = BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(i11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i11) {
        a(BuildersKt__Builders_commonKt.launch$default(this, null, CoroutineStart.LAZY, new h(i11, null), 1, null));
    }

    private final InterfaceC3491ky f() {
        return (InterfaceC3491ky) this.f35428b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(C3834sy c3834sy) {
        c3834sy.f35437k.track(C3321gy.a.d.f32122a);
        c3834sy.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.pc1
            @Override // wn0.a
            public final Object invoke() {
                return C3834sy.B();
            }
        });
        return jn0.h0.f84049a;
    }

    public final SelfieScannerConfig e() {
        SelfieScannerConfig selfieScannerConfigC = this.f35434h.c();
        selfieScannerConfigC.setInternalConfig(this.f35439m);
        return selfieScannerConfigC;
    }

    public final C2874Gc g() {
        return this.f35429c;
    }

    public final Is h() {
        return this.f35428b;
    }

    private final void b(int i11) {
        a((Job) null);
        this.f35452z = BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(i11, null), 3, null);
    }

    private final void c() {
        this.f35443q = false;
        a(InterfaceC3364hy.a.C0567a.f32378a);
    }

    private final SelfieScannerInternalConfig.RandomnessLiveness d() {
        List listA;
        Aw awB = this.f35434h.b();
        if (awB == null || (listA = awB.a(2)) == null) {
            return null;
        }
        return new SelfieScannerInternalConfig.RandomnessLiveness(listA, new c(this));
    }

    private final void b(final SelfieScannerResult selfieScannerResult) {
        b();
        if (!k()) {
            this.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.tc1
                @Override // wn0.a
                public final Object invoke() {
                    return C3834sy.w();
                }
            });
        }
        this.f35434h.a(selfieScannerResult);
        this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.uc1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3834sy.a(this.f35880a, selfieScannerResult, (InterfaceC3491ky) obj);
            }
        });
        if (this.f35431e) {
            this.f35437k.track(new C3321gy.a.f(this.f35440n));
        } else {
            a(selfieScannerResult);
        }
    }

    private final void a(SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness) {
        this.f35438l = randomnessLiveness;
        this.f35439m = SelfieScannerInternalConfig.copy$default(this.f35439m, false, null, randomnessLiveness, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky b(C3834sy c3834sy, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return (InterfaceC3491ky) c3834sy.f35430d.getInitialState();
    }

    public final void b() {
        Job job = this.B;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f35448v;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3834sy c3834sy, SelfieScannerEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof SelfieScannerEvent.OnFail) {
            c3834sy.a(((SelfieScannerEvent.OnFail) event).getError());
        } else if (event instanceof SelfieScannerEvent.OnStepUpdate) {
            c3834sy.a(((SelfieScannerEvent.OnStepUpdate) event).getStep());
        } else if (event instanceof SelfieScannerEvent.OnSuccess) {
            c3834sy.b(((SelfieScannerEvent.OnSuccess) event).getResult());
        } else {
            if (!(event instanceof SelfieScannerEvent.OnWarnings)) {
                throw new NoWhenBranchMatchedException();
            }
            c3834sy.a(((SelfieScannerEvent.OnWarnings) event).getWarnings());
        }
        return jn0.h0.f84049a;
    }

    private final void b(SelfieScannerError selfieScannerError) {
        b();
        this.f35435i.handleError(new AbstractC3397ip.d(selfieScannerError), "selfie_scanner");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3405iy event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3405iy.f) {
            t();
            return;
        }
        if (event instanceof InterfaceC3405iy.a) {
            l();
            return;
        }
        if (event instanceof InterfaceC3405iy.c) {
            o();
            return;
        }
        if (event instanceof InterfaceC3405iy.h) {
            v();
            return;
        }
        if (event instanceof InterfaceC3405iy.g) {
            a(((InterfaceC3405iy.g) event).a());
            return;
        }
        if (event instanceof InterfaceC3405iy.d) {
            a(((InterfaceC3405iy.d) event).a());
        } else if (event instanceof InterfaceC3405iy.b) {
            m();
        } else {
            if (!(event instanceof InterfaceC3405iy.e)) {
                throw new NoWhenBranchMatchedException();
            }
            r();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$d */
    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35453a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieScannerResult f35455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SelfieScannerResult selfieScannerResult, Continuation continuation) {
            super(2, continuation);
            this.f35455c = selfieScannerResult;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3834sy.this.new d(this.f35455c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
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
                int r1 = r5.f35453a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L4b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L37
            L1e:
                jn0.t.b(r6)
                com.fourthline.orca.internal.sy r6 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3834sy.f(r6)
                com.fourthline.orca.internal.jy r1 = new com.fourthline.orca.internal.jy
                com.fourthline.vision.selfie.SelfieScannerResult r4 = r5.f35455c
                r1.<init>(r4)
                r5.f35453a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L37
                goto L4a
            L37:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.sy$d$a r1 = new com.fourthline.orca.internal.sy$d$a
                com.fourthline.orca.internal.sy r3 = com.fourthline.orca.internal.C3834sy.this
                com.fourthline.vision.selfie.SelfieScannerResult r4 = r5.f35455c
                r1.<init>(r3, r4)
                r5.f35453a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3834sy.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$d$a */
        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3834sy f35456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SelfieScannerResult f35457b;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.sy$d$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0613a extends p013kotlin.jvm.internal.p implements wn0.a {
                C0613a(Object obj) {
                    super(0, obj, C3834sy.class, "restart", "restart()V", 0);
                }

                public final void a() {
                    ((C3834sy) this.receiver).y();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return jn0.h0.f84049a;
                }
            }

            a(C3834sy c3834sy, SelfieScannerResult selfieScannerResult) {
                this.f35456a = c3834sy;
                this.f35457b = selfieScannerResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [wn0.a] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    Object c0613a = null;
                    if (fd2 instanceof FD.a) {
                        C3834sy c3834sy = this.f35456a;
                        Object objA = ((FD.a) fd2).a();
                        InterfaceC3919ux interfaceC3919ux = (InterfaceC3919ux) (objA instanceof InterfaceC3919ux ? objA : null);
                        if (interfaceC3919ux == null) {
                            throw new IllegalStateException((objA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        c3834sy.a(new InterfaceC3364hy.a.c(interfaceC3919ux, this.f35457b));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FD.b bVar = (FD.b) fd2;
                        Ds.c cVar = new Ds.c(bVar.a(), "selfie_scanner", null, 4, null);
                        Bo boA = bVar.a();
                        if (boA instanceof AbstractC3397ip.b) {
                            c0613a = new C0613a(this.f35456a);
                        } else if ((boA instanceof ZD.a) || (boA instanceof ZD.c)) {
                            final C3834sy c3834sy2 = this.f35456a;
                            final SelfieScannerResult selfieScannerResult = this.f35457b;
                            c0613a = new wn0.a() { // from class: com.fourthline.orca.internal.bd1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return C3834sy.d.a.a(c3834sy2, selfieScannerResult);
                                }
                            };
                        }
                        InterfaceC4044xs.a.a(this.f35456a.f35436j, cVar, c0613a, null, 4, null);
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C3834sy c3834sy, SelfieScannerResult selfieScannerResult) {
                c3834sy.a(selfieScannerResult);
                return jn0.h0.f84049a;
            }
        }
    }

    private final void a(Map map) {
        if (p013kotlin.jvm.internal.s.f(map.get("android.permission.CAMERA"), Boolean.TRUE)) {
            this.f35437k.track(C3321gy.a.c.f32121a);
        } else {
            this.f35437k.track(C3321gy.a.b.f32120a);
            A();
        }
    }

    private final void a(SelfieScannerStep selfieScannerStep) {
        b();
        this.f35440n = selfieScannerStep;
        this.f35441o = null;
        int i11 = b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()];
        if (i11 == 1) {
            this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.qc1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3834sy.a(this.f34805a, (InterfaceC3491ky) obj);
                }
            });
            return;
        }
        if (i11 == 2) {
            if (k()) {
                return;
            }
            a(this.f35430d.k());
        } else {
            if (i11 == 3) {
                if (k()) {
                    return;
                }
                a(this.f35430d.e());
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(C3834sy c3834sy, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3834sy.f35430d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(SelfieScannerResult selfieScannerResult) {
        this.f35437k.track(C3321gy.a.k.f32130a);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(selfieScannerResult, null), 3, null);
    }

    private final void a(final InterfaceC3491ky.b.a aVar) {
        Job job = this.f35448v;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.zc1
            @Override // wn0.a
            public final Object invoke() {
                return C3834sy.D();
            }
        });
        if (!(f() instanceof InterfaceC3491ky.b.a)) {
            this.f35448v = BuildersKt__Builders_commonKt.launch$default(this, null, null, new k(aVar, null), 3, null);
        } else {
            this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.ad1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3834sy.a(aVar, (InterfaceC3491ky) obj);
                }
            });
        }
    }

    private final void a(Bitmap bitmap) {
        this.f35437k.track(C3321gy.a.i.f32127a);
        this.f35428b.a(this.f35430d.a(bitmap));
    }

    private final void a(List list) {
        if (this.f35442p == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SelfieScannerWarning) obj) != SelfieScannerWarning.DEVICE_NOT_STEADY) {
                    arrayList.add(obj);
                }
            }
            final SelfieScannerWarning selfieScannerWarning = (SelfieScannerWarning) p013kotlin.collections.v.q0(arrayList);
            if (selfieScannerWarning != null) {
                this.f35442p = selfieScannerWarning;
                this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.rc1
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return C3834sy.a(this.f35044a, selfieScannerWarning, (InterfaceC3491ky) obj2);
                    }
                });
            }
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(C3834sy c3834sy, SelfieScannerWarning selfieScannerWarning, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3834sy.f35430d.a(selfieScannerWarning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent randomnessLivenessEvent) {
        if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved) {
            a(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved) randomnessLivenessEvent).getMetadata());
            return;
        }
        if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate) {
            a(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate) randomnessLivenessEvent).getCount());
        } else if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess) {
            b(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess) randomnessLivenessEvent).getIndex());
        } else {
            if (!(randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate) randomnessLivenessEvent).getDirection());
        }
    }

    private final void a(HeadMetadata headMetadata) {
        InterfaceC3791ry interfaceC3791ry = this.f35430d;
        Job job = this.f35451y;
        if ((job == null || job.isCompleted()) && this.f35452z == null) {
            Integer direction = headMetadata.getDirection();
            if (direction != null) {
                this.f35449w = direction.intValue();
            }
            this.f35428b.a(interfaceC3791ry.a(direction, headMetadata.getYaw(), headMetadata.getPitch()));
        }
    }

    private final void a(int i11) {
        this.f35444r = jn0.x.a(0, Integer.valueOf(i11));
    }

    private final void a(Job job) {
        Job job2 = this.f35450x;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f35450x = job;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InterfaceC3491ky.b.InterfaceC0573b interfaceC0573b) {
        Job job = this.A;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        InterfaceC3491ky interfaceC3491kyF = f();
        if (interfaceC3491kyF instanceof InterfaceC3491ky.b.c) {
            this.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.wc1
                @Override // wn0.a
                public final Object invoke() {
                    return C3834sy.C();
                }
            });
            this.A = BuildersKt__Builders_commonKt.launch$default(this, null, null, new j(interfaceC0573b, null), 3, null);
        } else if (interfaceC3491kyF instanceof InterfaceC3491ky.b.InterfaceC0573b) {
            this.f35428b.a(new wn0.l() { // from class: com.fourthline.orca.internal.xc1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3834sy.a(interfaceC0573b, (InterfaceC3491ky) obj);
                }
            });
        }
    }

    private final void a(SelfieScannerError selfieScannerError) {
        b();
        this.f35441o = selfieScannerError;
        if (selfieScannerError == SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED) {
            this.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.nc1
                @Override // wn0.a
                public final Object invoke() {
                    return C3834sy.p();
                }
            });
        } else if (this.f35443q) {
            this.f35429c.a(new wn0.a() { // from class: com.fourthline.orca.internal.sc1
                @Override // wn0.a
                public final Object invoke() {
                    return C3834sy.q();
                }
            });
            b(selfieScannerError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491ky a(C3834sy c3834sy, SelfieScannerResult selfieScannerResult, InterfaceC3491ky present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3834sy.f35430d.a(selfieScannerResult.getImage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3364hy.a aVar) {
        this.f35432f.a(aVar);
        s();
    }
}
