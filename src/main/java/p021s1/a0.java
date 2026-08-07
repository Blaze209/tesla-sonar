package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import v3.PointerInputChange;
import v3.f0;
import v3.o;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0088\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001aX\u0010\u0015\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u001b\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001d\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\"6\u0010!\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lv3/f0;", "Lkotlin/Function1;", "Lj3/g;", "Ljn0/h0;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Ls1/q;", "Lkotlin/coroutines/Continuation;", "", "onPress", "onTap", IntegerTokenConverter.CONVERTER_KEY, "(Lv3/f0;Lwn0/l;Lwn0/l;Lwn0/q;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3/c;", "g", "(Lv3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3/x;", "firstUp", "f", "(Lv3/c;Lv3/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lv3/f0;Lwn0/q;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "Lv3/o;", "pass", DateTokenConverter.CONVERTER_KEY, "(Lv3/c;ZLv3/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lv3/c;Lv3/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lwn0/q;", "NoPressGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<q, j3.g, Continuation<? super h0>, Object> f109356a = new a(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/q;", "Lj3/g;", "it", "Ljn0/h0;", "<anonymous>", "(Ls1/q;Lj3/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements q<q, j3.g, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109357n;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(q qVar, long j11, Continuation<? super h0> continuation) {
            return new a(continuation).invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(q qVar, j3.g gVar, Continuation<? super h0> continuation) {
            return a(qVar, gVar.getPackedValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109357n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109358n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109359o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f109360p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f109361q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f109362r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109361q = obj;
            this.f109362r |= Integer.MIN_VALUE;
            return a0.d(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Lv3/x;", "<anonymous>", "(Lv3/c;)Lv3/x;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
    static final class c extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super PointerInputChange>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f109363n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f109364o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f109365p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f109366q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PointerInputChange pointerInputChange, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109366q = pointerInputChange;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super PointerInputChange> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f109366q, continuation);
            cVar.f109365p = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f109364o
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.f109363n
                java.lang.Object r1 = r11.f109365p
                v3.c r1 = (v3.c) r1
                jn0.t.b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.f109365p
                v3.c r12 = (v3.c) r12
                v3.x r1 = r11.f109366q
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.e3 r1 = r12.getViewConfiguration()
                long r5 = r1.a()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.f109365p = r5
                r11.f109363n = r3
                r11.f109364o = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = p021s1.a0.e(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                v3.x r12 = (v3.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.a0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {195}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109368o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109369p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109368o = obj;
            this.f109369p |= Integer.MIN_VALUE;
            return a0.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109370n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109371o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f0 f109372p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109373q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f109374r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ r f109375s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f109376n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f109377o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f109378p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109379q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ l<j3.g, h0> f109380r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ r f109381s;

            /* JADX INFO: renamed from: s1.a0$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class C2319a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109382n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109383o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2319a(r rVar, Continuation<? super C2319a> continuation) {
                    super(2, continuation);
                    this.f109383o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2319a(this.f109383o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109382n;
                    if (i11 == 0) {
                        t.b(obj);
                        r rVar = this.f109383o;
                        this.f109382n = 1;
                        if (rVar.q(this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2319a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109384n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109385o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ r f109386p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f109387q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, r rVar, PointerInputChange pointerInputChange, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f109385o = qVar;
                    this.f109386p = rVar;
                    this.f109387q = pointerInputChange;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f109385o, this.f109386p, this.f109387q, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109384n;
                    if (i11 == 0) {
                        t.b(obj);
                        q<q, j3.g, Continuation<? super h0>, Object> qVar = this.f109385o;
                        r rVar = this.f109386p;
                        j3.g gVarD = j3.g.d(this.f109387q.getPosition());
                        this.f109384n = 1;
                        if (qVar.invoke(rVar, gVarD, this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109388n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109389o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(r rVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f109389o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f109389o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109388n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109389o.c();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109390n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109391o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(r rVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f109391o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f109391o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109390n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109391o.n();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(CoroutineScope coroutineScope, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar, r rVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109378p = coroutineScope;
                this.f109379q = qVar;
                this.f109380r = lVar;
                this.f109381s = rVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f109378p, this.f109379q, this.f109380r, this.f109381s, continuation);
                aVar.f109377o = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                if (r0 == r6) goto L18;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r3 = r16
                    java.lang.Object r6 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r3.f109376n
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L29
                    if (r0 == r8) goto L1f
                    if (r0 != r7) goto L17
                    jn0.t.b(r17)
                    r0 = r17
                    goto L79
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r3.f109377o
                    v3.c r0 = (v3.c) r0
                    jn0.t.b(r17)
                    r1 = r17
                    goto L4f
                L29:
                    jn0.t.b(r17)
                    java.lang.Object r0 = r3.f109377o
                    v3.c r0 = (v3.c) r0
                    kotlinx.coroutines.CoroutineScope r10 = r3.f109378p
                    s1.a0$e$a$a r13 = new s1.a0$e$a$a
                    s1.r r1 = r3.f109381s
                    r13.<init>(r1, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r10, r11, r12, r13, r14, r15)
                    r3.f109377o = r0
                    r3.f109376n = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = p021s1.a0.e(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L4f
                    goto L78
                L4f:
                    v3.x r1 = (v3.PointerInputChange) r1
                    r1.a()
                    wn0.q<s1.q, j3.g, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r2 = r3.f109379q
                    wn0.q r4 = p021s1.a0.c()
                    if (r2 == r4) goto L6e
                    kotlinx.coroutines.CoroutineScope r10 = r3.f109378p
                    s1.a0$e$a$b r13 = new s1.a0$e$a$b
                    wn0.q<s1.q, j3.g, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r2 = r3.f109379q
                    s1.r r4 = r3.f109381s
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r10, r11, r12, r13, r14, r15)
                L6e:
                    r3.f109377o = r9
                    r3.f109376n = r7
                    java.lang.Object r0 = p021s1.a0.l(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L79
                L78:
                    return r6
                L79:
                    v3.x r0 = (v3.PointerInputChange) r0
                    if (r0 != 0) goto L8e
                    kotlinx.coroutines.CoroutineScope r10 = r3.f109378p
                    s1.a0$e$a$c r13 = new s1.a0$e$a$c
                    s1.r r0 = r3.f109381s
                    r13.<init>(r0, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r10, r11, r12, r13, r14, r15)
                    goto Lb0
                L8e:
                    r0.a()
                    kotlinx.coroutines.CoroutineScope r4 = r3.f109378p
                    s1.a0$e$a$d r7 = new s1.a0$e$a$d
                    s1.r r1 = r3.f109381s
                    r7.<init>(r1, r9)
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                    wn0.l<j3.g, jn0.h0> r1 = r3.f109380r
                    if (r1 == 0) goto Lb0
                    long r4 = r0.getPosition()
                    j3.g r0 = j3.g.d(r4)
                    r1.invoke(r0)
                Lb0:
                    jn0.h0 r0 = jn0.h0.f84049a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: s1.a0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(f0 f0Var, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar, r rVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f109372p = f0Var;
            this.f109373q = qVar;
            this.f109374r = lVar;
            this.f109375s = rVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f109372p, this.f109373q, this.f109374r, this.f109375s, continuation);
            eVar.f109371o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109370n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f109371o;
                f0 f0Var = this.f109372p;
                a aVar = new a(coroutineScope, this.f109373q, this.f109374r, this.f109375s, null);
                this.f109370n = 1;
                if (n.d(f0Var, aVar, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f0 f109394p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109395q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f109396r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f109397s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f109398t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        static final class a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f109399n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f109400o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f109401p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            long f109402q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f109403r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f109404s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f109405t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109406u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ l<j3.g, h0> f109407v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ l<j3.g, h0> f109408w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ l<j3.g, h0> f109409x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ r f109410y;

            /* JADX INFO: renamed from: s1.a0$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2320a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109411n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109412o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2320a(r rVar, Continuation<? super C2320a> continuation) {
                    super(2, continuation);
                    this.f109412o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2320a(this.f109412o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109411n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109412o.n();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2320a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109413n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109414o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(r rVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f109414o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f109414o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109413n;
                    if (i11 == 0) {
                        t.b(obj);
                        r rVar = this.f109414o;
                        this.f109413n = 1;
                        if (rVar.q(this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109415n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109416o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ r f109417p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f109418q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, r rVar, PointerInputChange pointerInputChange, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f109416o = qVar;
                    this.f109417p = rVar;
                    this.f109418q = pointerInputChange;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f109416o, this.f109417p, this.f109418q, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109415n;
                    if (i11 == 0) {
                        t.b(obj);
                        q<q, j3.g, Continuation<? super h0>, Object> qVar = this.f109416o;
                        r rVar = this.f109417p;
                        j3.g gVarD = j3.g.d(this.f109418q.getPosition());
                        this.f109415n = 1;
                        if (qVar.invoke(rVar, gVarD, this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Lv3/x;", "<anonymous>", "(Lv3/c;)Lv3/x;"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super PointerInputChange>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109419n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f109420o;

                d(Continuation<? super d> continuation) {
                    super(2, continuation);
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(v3.c cVar, Continuation<? super PointerInputChange> continuation) {
                    return ((d) create(cVar, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    d dVar = new d(continuation);
                    dVar.f109420o = obj;
                    return dVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109419n;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        return obj;
                    }
                    t.b(obj);
                    v3.c cVar = (v3.c) this.f109420o;
                    this.f109419n = 1;
                    Object objL = a0.l(cVar, null, this, 1, null);
                    return objL == coroutine_suspended ? coroutine_suspended : objL;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109421n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109422o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(r rVar, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f109422o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f109422o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109421n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109422o.c();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: s1.a0$f$a$f, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2321f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109423n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109424o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2321f(r rVar, Continuation<? super C2321f> continuation) {
                    super(2, continuation);
                    this.f109424o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2321f(this.f109424o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109423n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109424o.n();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2321f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109425n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109426o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(r rVar, Continuation<? super g> continuation) {
                    super(2, continuation);
                    this.f109426o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new g(this.f109426o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f109425n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f109426o.n();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109427n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ r f109428o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(r rVar, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f109428o = rVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new h(this.f109428o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109427n;
                    if (i11 == 0) {
                        t.b(obj);
                        r rVar = this.f109428o;
                        this.f109427n = 1;
                        if (rVar.q(this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
            static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109429n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ q<q, j3.g, Continuation<? super h0>, Object> f109430o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ r f109431p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f109432q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, r rVar, PointerInputChange pointerInputChange, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f109430o = qVar;
                    this.f109431p = rVar;
                    this.f109432q = pointerInputChange;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new i(this.f109430o, this.f109431p, this.f109432q, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109429n;
                    if (i11 == 0) {
                        t.b(obj);
                        q<q, j3.g, Continuation<? super h0>, Object> qVar = this.f109430o;
                        r rVar = this.f109431p;
                        j3.g gVarD = j3.g.d(this.f109432q.getPosition());
                        this.f109429n = 1;
                        if (qVar.invoke(rVar, gVarD, this) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
            static final class j extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f109433n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f109434o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f109435p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ l<j3.g, h0> f109436q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ l<j3.g, h0> f109437r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ n0<PointerInputChange> f109438s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r f109439t;

                /* JADX INFO: renamed from: s1.a0$f$a$j$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class C2322a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f109440n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ r f109441o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2322a(r rVar, Continuation<? super C2322a> continuation) {
                        super(2, continuation);
                        this.f109441o = rVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new C2322a(this.f109441o, continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f109440n != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        this.f109441o.n();
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C2322a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f109442n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ r f109443o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(r rVar, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f109443o = rVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new b(this.f109443o, continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f109442n != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        this.f109443o.c();
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(CoroutineScope coroutineScope, l<? super j3.g, h0> lVar, l<? super j3.g, h0> lVar2, n0<PointerInputChange> n0Var, r rVar, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f109435p = coroutineScope;
                    this.f109436q = lVar;
                    this.f109437r = lVar2;
                    this.f109438s = n0Var;
                    this.f109439t = rVar;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                    return ((j) create(cVar, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    j jVar = new j(this.f109435p, this.f109436q, this.f109437r, this.f109438s, this.f109439t, continuation);
                    jVar.f109434o = obj;
                    return jVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f109433n;
                    if (i11 == 0) {
                        t.b(obj);
                        v3.c cVar = (v3.c) this.f109434o;
                        this.f109433n = 1;
                        obj = a0.l(cVar, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.a();
                        BuildersKt__Builders_commonKt.launch$default(this.f109435p, null, null, new C2322a(this.f109439t, null), 3, null);
                        this.f109436q.invoke(j3.g.d(pointerInputChange.getPosition()));
                        return h0.f84049a;
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.f109435p, null, null, new b(this.f109439t, null), 3, null);
                    l<j3.g, h0> lVar = this.f109437r;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(j3.g.d(this.f109438s.f86529a.getPosition()));
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(CoroutineScope coroutineScope, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar, l<? super j3.g, h0> lVar2, l<? super j3.g, h0> lVar3, r rVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109405t = coroutineScope;
                this.f109406u = qVar;
                this.f109407v = lVar;
                this.f109408w = lVar2;
                this.f109409x = lVar3;
                this.f109410y = rVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f109405t, this.f109406u, this.f109407v, this.f109408w, this.f109409x, this.f109410y, continuation);
                aVar.f109404s = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
            /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:84:0x00f3 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x010e A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:84:0x00f3 }] */
            /* JADX WARN: Code duplicated, block: B:42:0x0129  */
            /* JADX WARN: Code duplicated, block: B:49:0x015e  */
            /* JADX WARN: Code duplicated, block: B:51:0x0162  */
            /* JADX WARN: Code duplicated, block: B:53:0x0166  */
            /* JADX WARN: Code duplicated, block: B:54:0x0175  */
            /* JADX WARN: Code duplicated, block: B:57:0x018c  */
            /* JADX WARN: Code duplicated, block: B:60:0x0192  */
            /* JADX WARN: Code duplicated, block: B:62:0x0196  */
            /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
            /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:72:0x01fd  */
            /* JADX WARN: Code duplicated, block: B:75:0x0210  */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0145, code lost:
            
                if (p021s1.a0.g(r4, r19) == r6) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01f4, code lost:
            
                if (r2.o0(r0, r8, r19) == r6) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
            
                if (p021s1.a0.g(r2, r19) == r6) goto L78;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 592
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: s1.a0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(f0 f0Var, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar, l<? super j3.g, h0> lVar2, l<? super j3.g, h0> lVar3, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f109394p = f0Var;
            this.f109395q = qVar;
            this.f109396r = lVar;
            this.f109397s = lVar2;
            this.f109398t = lVar3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f109394p, this.f109395q, this.f109396r, this.f109397s, this.f109398t, continuation);
            fVar.f109393o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109392n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f109393o;
                r rVar = new r(this.f109394p);
                f0 f0Var = this.f109394p;
                a aVar = new a(coroutineScope, this.f109395q, this.f109396r, this.f109397s, this.f109398t, rVar, null);
                this.f109392n = 1;
                if (n.d(f0Var, aVar, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 320}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109444n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109445o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f109446p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109447q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109446p = obj;
            this.f109447q |= Integer.MIN_VALUE;
            return a0.k(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:19:0x005d->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(v3.c r9, boolean r10, v3.o r11, p013kotlin.coroutines.Continuation<? super v3.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof s1.a0.b
            if (r0 == 0) goto L13
            r0 = r12
            s1.a0$b r0 = (s1.a0.b) r0
            int r1 = r0.f109362r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109362r = r1
            goto L18
        L13:
            s1.a0$b r0 = new s1.a0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f109361q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109362r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f109360p
            java.lang.Object r10 = r0.f109359o
            v3.o r10 = (v3.o) r10
            java.lang.Object r11 = r0.f109358n
            v3.c r11 = (v3.c) r11
            jn0.t.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            jn0.t.b(r12)
        L42:
            r0.f109358n = r9
            r0.f109359o = r11
            r0.f109360p = r10
            r0.f109362r = r3
            java.lang.Object r12 = r9.S0(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            v3.m r12 = (v3.m) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            v3.x r7 = (v3.PointerInputChange) r7
            if (r10 == 0) goto L6c
            boolean r7 = v3.n.a(r7)
            goto L70
        L6c:
            boolean r7 = v3.n.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.a0.d(v3.c, boolean, v3.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object e(v3.c cVar, boolean z11, o oVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            oVar = o.Main;
        }
        return d(cVar, z11, oVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(v3.c cVar, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return cVar.v0(cVar.getViewConfiguration().e(), new c(pointerInputChange, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[LOOP:1: B:22:0x0066->B:26:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0068
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(v3.c r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            boolean r0 = r9 instanceof s1.a0.d
            if (r0 == 0) goto L13
            r0 = r9
            s1.a0$d r0 = (s1.a0.d) r0
            int r1 = r0.f109369p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109369p = r1
            goto L18
        L13:
            s1.a0$d r0 = new s1.a0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f109368o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109369p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f109367n
            v3.c r8 = (v3.c) r8
            jn0.t.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            jn0.t.b(r9)
        L38:
            r0.f109367n = r8
            r0.f109369p = r3
            r9 = 0
            java.lang.Object r9 = v3.c.w1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            v3.m r9 = (v3.m) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            v3.x r7 = (v3.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            v3.x r4 = (v3.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.a0.g(v3.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object h(f0 f0Var, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new e(f0Var, qVar, lVar, new r(f0Var), null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    public static final Object i(f0 f0Var, l<? super j3.g, h0> lVar, l<? super j3.g, h0> lVar2, q<? super q, ? super j3.g, ? super Continuation<? super h0>, ? extends Object> qVar, l<? super j3.g, h0> lVar3, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new f(f0Var, qVar, lVar2, lVar, lVar3, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    public static /* synthetic */ Object j(f0 f0Var, l lVar, l lVar2, q qVar, l lVar3, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        if ((i11 & 4) != 0) {
            qVar = f109356a;
        }
        if ((i11 & 8) != 0) {
            lVar3 = null;
        }
        return i(f0Var, lVar, lVar2, qVar, lVar3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[LOOP:1: B:23:0x007c->B:45:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(v3.c r17, v3.o r18, p013kotlin.coroutines.Continuation<? super v3.PointerInputChange> r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.a0.k(v3.c, v3.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object l(v3.c cVar, o oVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            oVar = o.Main;
        }
        return k(cVar, oVar, continuation);
    }
}
