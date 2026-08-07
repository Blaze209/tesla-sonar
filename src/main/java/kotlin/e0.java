package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j3.g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p021s1.i;
import p021s1.n;
import v3.PointerInputChange;
import v3.f0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lv3/f0;", "Lb2/n0;", "observer", "Ljn0/h0;", "c", "(Lv3/f0;Lb2/n0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    @p013kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f15504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f0 f15505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0 f15506q;

        /* JADX INFO: renamed from: b2.e0$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        static final class C0283a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15507n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f0 f15508o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ n0 f15509p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0283a(f0 f0Var, n0 n0Var, Continuation<? super C0283a> continuation) {
                super(2, continuation);
                this.f15508o = f0Var;
                this.f15509p = n0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0283a(this.f15508o, this.f15509p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f15507n;
                if (i11 == 0) {
                    t.b(obj);
                    f0 f0Var = this.f15508o;
                    n0 n0Var = this.f15509p;
                    this.f15507n = 1;
                    if (e0.e(f0Var, n0Var, this) == coroutine_suspended) {
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
                return ((C0283a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15510n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f0 f15511o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ n0 f15512p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f0 f0Var, n0 n0Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f15511o = f0Var;
                this.f15512p = n0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f15511o, this.f15512p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f15510n;
                if (i11 == 0) {
                    t.b(obj);
                    f0 f0Var = this.f15511o;
                    n0 n0Var = this.f15512p;
                    this.f15510n = 1;
                    if (e0.d(f0Var, n0Var, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, n0 n0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15505p = f0Var;
            this.f15506q = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f15505p, this.f15506q, continuation);
            aVar.f15504o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15503n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15504o;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C0283a(this.f15505p, this.f15506q, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new b(this.f15505p, this.f15506q, null), 1, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<g, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f15513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0 n0Var) {
            super(1);
            this.f15513c = n0Var;
        }

        public final void a(long j11) {
            this.f15513c.c(j11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g gVar) {
            a(gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f15514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n0 n0Var) {
            super(0);
            this.f15514c = n0Var;
        }

        public final void b() {
            this.f15514c.onStop();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f15515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n0 n0Var) {
            super(0);
            this.f15515c = n0Var;
        }

        public final void b() {
            this.f15515c.onCancel();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv3/x;", "<anonymous parameter 0>", "Lj3/g;", "offset", "Ljn0/h0;", "a", "(Lv3/x;J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements p<PointerInputChange, g, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f15516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0 n0Var) {
            super(2);
            this.f15516c = n0Var;
        }

        public final void a(PointerInputChange pointerInputChange, long j11) {
            this.f15516c.b(j11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange, g gVar) {
            a(pointerInputChange, gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    static final class f extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f15517n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f15518o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f15519p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0 f15520q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n0 n0Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f15520q = n0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((f) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f15520q, continuation);
            fVar.f15519p = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f15518o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.f15517n
                v3.x r1 = (v3.PointerInputChange) r1
                java.lang.Object r4 = r13.f15519p
                v3.c r4 = (v3.c) r4
                jn0.t.b(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f15519p
                v3.c r1 = (v3.c) r1
                jn0.t.b(r14)
                r7 = r13
                goto L45
            L2c:
                jn0.t.b(r14)
                java.lang.Object r14 = r13.f15519p
                r4 = r14
                v3.c r4 = (v3.c) r4
                r13.f15519p = r4
                r13.f15518o = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = p021s1.a0.e(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                v3.x r14 = (v3.PointerInputChange) r14
                b2.n0 r4 = r7.f15520q
                long r5 = r14.getPosition()
                r4.a(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.f15519p = r4
                r7.f15517n = r1
                r7.f15518o = r2
                r14 = 0
                java.lang.Object r14 = v3.c.w1(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                v3.m r14 = (v3.m) r14
                java.util.List r14 = r14.c()
                int r5 = r14.size()
                r6 = 0
            L6b:
                if (r6 >= r5) goto L8b
                java.lang.Object r8 = r14.get(r6)
                v3.x r8 = (v3.PointerInputChange) r8
                long r9 = r8.getId()
                long r11 = r1.getId()
                boolean r9 = v3.w.d(r9, r11)
                if (r9 == 0) goto L88
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L88
                goto L52
            L88:
                int r6 = r6 + 1
                goto L6b
            L8b:
                b2.n0 r14 = r7.f15520q
                r14.d()
                jn0.h0 r14 = jn0.h0.f84049a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.e0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(f0 f0Var, n0 n0Var, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(f0Var, n0Var, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(f0 f0Var, n0 n0Var, Continuation<? super h0> continuation) {
        Object objD = i.d(f0Var, new b(n0Var), new c(n0Var), new d(n0Var), new e(n0Var), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(f0 f0Var, n0 n0Var, Continuation<? super h0> continuation) {
        Object objD = n.d(f0Var, new f(n0Var, null), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }
}
