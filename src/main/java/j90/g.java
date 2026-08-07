package j90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p009i2.q1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj90/g;", "", "Li2/q1;", "modalBottomSheetState", "Lj90/b;", "keyboardHandler", "<init>", "(Li2/q1;Lj90/b;)V", "Ljn0/h0;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj90/g$a;", "a", "c", "Li2/q1;", "b", "()Li2/q1;", "Lj90/b;", "Lj90/g$a;", "dismissalType", "", DateTokenConverter.CONVERTER_KEY, "Z", "getSkipHideAnimation", "()Z", "(Z)V", "skipHideAnimation", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83152e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1 modalBottomSheetState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j90.b keyboardHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a dismissalType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean skipHideAnimation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj90/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "Programmatically", "SwipedDownByUser", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        Programmatically,
        SwipedDownByUser;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {64}, m = "awaitDismissal", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83157n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83158o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83160q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83158o = obj;
            this.f83160q |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(g.this.getModalBottomSheetState().k());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "isVisible"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$awaitDismissal$3", f = "StripeBottomSheetState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<Boolean, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83162n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f83163o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z11, Continuation<? super Boolean> continuation) {
            return ((d) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.f83163o = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f83162n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(!this.f83163o);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {77, 80}, m = "hide", n = {"this"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83165o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83167q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83165o = obj;
            this.f83167q |= Integer.MIN_VALUE;
            return g.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$hide$2", f = "StripeBottomSheetState.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83168n;

        f(Continuation<? super f> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return g.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83168n;
            if (i11 == 0) {
                t.b(obj);
                q1 modalBottomSheetState = g.this.getModalBottomSheetState();
                this.f83168n = 1;
                if (modalBottomSheetState.i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((f) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: j90.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {53, 60}, m = "show", n = {"this"}, s = {"L$0"})
    static final class C1751g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83170n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83171o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83173q;

        C1751g(Continuation<? super C1751g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83171o = obj;
            this.f83173q |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$2", f = "StripeBottomSheetState.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83174n;

        h(Continuation<? super h> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return g.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83174n;
            if (i11 == 0) {
                t.b(obj);
                q1 modalBottomSheetState = g.this.getModalBottomSheetState();
                this.f83174n = 1;
                if (modalBottomSheetState.l(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((h) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.a<Boolean> {
        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(g.this.getModalBottomSheetState().k());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "isVisible"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$4", f = "StripeBottomSheetState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<Boolean, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83177n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f83178o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z11, Continuation<? super Boolean> continuation) {
            return ((j) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(continuation);
            jVar.f83178o = ((Boolean) obj).booleanValue();
            return jVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f83177n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(this.f83178o);
        }
    }

    public g(q1 modalBottomSheetState, j90.b keyboardHandler) {
        s.k(modalBottomSheetState, "modalBottomSheetState");
        s.k(keyboardHandler, "keyboardHandler");
        this.modalBottomSheetState = modalBottomSheetState;
        this.keyboardHandler = keyboardHandler;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super a> continuation) {
        b bVar;
        g gVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f83160q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f83160q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f83158o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f83160q;
        if (i12 == 0) {
            t.b(obj);
            Flow flowP = n3.p(new c());
            d dVar = new d(null);
            bVar.f83157n = this;
            bVar.f83160q = 1;
            if (FlowKt.first(flowP, dVar, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) bVar.f83157n;
            t.b(obj);
        }
        a aVar = gVar.dismissalType;
        return aVar == null ? a.SwipedDownByUser : aVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q1 getModalBottomSheetState() {
        return this.modalBottomSheetState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (j90.h.c(10, r6, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p013kotlin.coroutines.Continuation<? super jn0.h0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j90.g.e
            if (r0 == 0) goto L13
            r0 = r6
            j90.g$e r0 = (j90.g.e) r0
            int r1 = r0.f83167q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83167q = r1
            goto L18
        L13:
            j90.g$e r0 = new j90.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f83165o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83167q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r6)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f83164n
            j90.g r2 = (j90.g) r2
            jn0.t.b(r6)
            goto L58
        L3c:
            jn0.t.b(r6)
            boolean r6 = r5.skipHideAnimation
            if (r6 == 0) goto L46
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L46:
            j90.g$a r6 = j90.g.a.Programmatically
            r5.dismissalType = r6
            j90.b r6 = r5.keyboardHandler
            r0.f83164n = r5
            r0.f83167q = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
            goto L72
        L57:
            r2 = r5
        L58:
            i2.q1 r6 = r2.modalBottomSheetState
            boolean r6 = r6.k()
            if (r6 == 0) goto L76
            j90.g$f r6 = new j90.g$f
            r4 = 0
            r6.<init>(r4)
            r0.f83164n = r4
            r0.f83167q = r3
            r2 = 10
            java.lang.Object r6 = j90.h.a(r2, r6, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L76:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j90.g.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(boolean z11) {
        this.skipHideAnimation = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r7, r2, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j90.g.C1751g
            if (r0 == 0) goto L13
            r0 = r7
            j90.g$g r0 = (j90.g.C1751g) r0
            int r1 = r0.f83173q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83173q = r1
            goto L18
        L13:
            j90.g$g r0 = new j90.g$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f83171o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83173q
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            jn0.t.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f83170n
            j90.g r2 = (j90.g) r2
            jn0.t.b(r7)
            goto L53
        L3d:
            jn0.t.b(r7)
            j90.g$h r7 = new j90.g$h
            r7.<init>(r5)
            r0.f83170n = r6
            r0.f83173q = r4
            r2 = 10
            java.lang.Object r7 = j90.h.a(r2, r7, r0)
            if (r7 != r1) goto L52
            goto L6b
        L52:
            r2 = r6
        L53:
            j90.g$i r7 = new j90.g$i
            r7.<init>()
            kotlinx.coroutines.flow.Flow r7 = p020r2.n3.p(r7)
            j90.g$j r2 = new j90.g$j
            r2.<init>(r5)
            r0.f83170n = r5
            r0.f83173q = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r2, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j90.g.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
