package r1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p021s1.n;
import v3.f0;
import v3.o0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\n\u001a\u00020\b*\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0081@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "Lr1/i;", "state", "c", "(Landroidx/compose/ui/d;Lr1/i;)Landroidx/compose/ui/d;", "Lv3/f0;", "Lkotlin/Function1;", "Lj3/g;", "Ljn0/h0;", "onDown", DateTokenConverter.CONVERTER_KEY, "(Lv3/f0;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3/c;", "Lv3/x;", "b", "(Lv3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {66}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f106360n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f106361o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106362p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106361o = obj;
            this.f106362p |= Integer.MIN_VALUE;
            return c.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1", f = "ContextMenuGestures.android.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106363n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106364o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f106365p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<j3.g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f106366c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ContextMenuState contextMenuState) {
                super(1);
                this.f106366c = contextMenuState;
            }

            public final void a(long j11) {
                this.f106366c.b(new ContextMenuState.a.Open(j11, null));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
                a(gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContextMenuState contextMenuState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f106365p = contextMenuState;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f106365p, continuation);
            bVar.f106364o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f106363n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f106364o;
                a aVar = new a(this.f106365p);
                this.f106363n = 1;
                if (c.d(f0Var, aVar, this) == coroutine_suspended) {
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
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: r1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", i = {0}, l = {53, 56}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class C2260c extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106368o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f106369p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2260c(l<? super j3.g, h0> lVar, Continuation<? super C2260c> continuation) {
            super(2, continuation);
            this.f106369p = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((C2260c) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2260c c2260c = new C2260c(this.f106369p, continuation);
            c2260c.f106368o = obj;
            return c2260c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
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
                int r1 = r7.f106367n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f106368o
                v3.c r1 = (v3.c) r1
                jn0.t.b(r8)
                goto L35
            L22:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f106368o
                r1 = r8
                v3.c r1 = (v3.c) r1
                r7.f106368o = r1
                r7.f106367n = r3
                java.lang.Object r8 = r1.c.a(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                v3.x r8 = (v3.PointerInputChange) r8
                r8.a()
                wn0.l<j3.g, jn0.h0> r4 = r7.f106369p
                long r5 = r8.getPosition()
                j3.g r8 = j3.g.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f106368o = r8
                r7.f106367n = r2
                java.lang.Object r8 = p021s1.a0.l(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                v3.x r8 = (v3.PointerInputChange) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.c.C2260c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[LOOP:0: B:21:0x005a->B:25:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(v3.c r8, p013kotlin.coroutines.Continuation<? super v3.PointerInputChange> r9) {
        /*
            boolean r0 = r9 instanceof r1.c.a
            if (r0 == 0) goto L13
            r0 = r9
            r1.c$a r0 = (r1.c.a) r0
            int r1 = r0.f106362p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106362p = r1
            goto L18
        L13:
            r1.c$a r0 = new r1.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f106361o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106362p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f106360n
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
            r0.f106360n = r8
            r0.f106362p = r3
            r9 = 0
            java.lang.Object r9 = v3.c.w1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            v3.m r9 = (v3.m) r9
            int r2 = r9.getButtons()
            boolean r2 = v3.q.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            v3.x r7 = (v3.PointerInputChange) r7
            boolean r7 = v3.n.a(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.b(v3.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, ContextMenuState contextMenuState) {
        return o0.d(dVar, d.f106370a, new b(contextMenuState, null));
    }

    public static final Object d(f0 f0Var, l<? super j3.g, h0> lVar, Continuation<? super h0> continuation) {
        Object objD = n.d(f0Var, new C2260c(lVar, null), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }
}
