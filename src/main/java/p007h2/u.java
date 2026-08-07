package p007h2;

import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlin.n0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p021s1.i;
import p021s1.n;
import v3.PointerInputChange;
import v3.f0;
import v3.k0;
import v3.m;
import v3.o0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\"\u001a\u00020\u0002*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "", "Ljn0/h0;", "updateTouchMode", "k", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", "Lh2/h;", "mouseSelectionObserver", "Lb2/n0;", "textDragObserver", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;Lh2/h;Lb2/n0;)Landroidx/compose/ui/d;", "Lv3/c;", "observer", "Lv3/m;", "down", "j", "(Lv3/c;Lb2/n0;Lv3/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh2/d;", "clicksCounter", "h", "(Lv3/c;Lh2/h;Lh2/d;Lv3/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lv3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "Lv3/x;", "change1", "change2", "f", "(Landroidx/compose/ui/platform/e3;Lv3/x;Lv3/x;)Z", "g", "(Lv3/m;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {425}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f70368o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70369p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70368o = obj;
            this.f70369p |= Integer.MIN_VALUE;
            return u.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1}, l = {158, 181}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70370n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70371o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f70372p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f70373q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70372p = obj;
            this.f70373q |= Integer.MIN_VALUE;
            return u.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "it", "Ljn0/h0;", "a", "(Lv3/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements l<PointerInputChange, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p007h2.h f70374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p007h2.h hVar) {
            super(1);
            this.f70374c = hVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f70374c.c(pointerInputChange.getPosition())) {
                pointerInputChange.a();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "it", "Ljn0/h0;", "a", "(Lv3/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements l<PointerInputChange, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p007h2.h f70375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f70376d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p007h2.h hVar, s sVar) {
            super(1);
            this.f70375c = hVar;
            this.f70376d = sVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f70375c.d(pointerInputChange.getPosition(), this.f70376d)) {
                pointerInputChange.a();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70377n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f70378o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p007h2.h f70379p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0 f70380q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {105, 111, 113}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70381n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f70382o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p007h2.h f70383p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p007h2.d f70384q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ n0 f70385r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p007h2.h hVar, p007h2.d dVar, n0 n0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f70383p = hVar;
                this.f70384q = dVar;
                this.f70385r = n0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f70383p, this.f70384q, this.f70385r, continuation);
                aVar.f70382o = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
            
                if (p007h2.u.h(r1, r2, r4, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
            
                if (p007h2.u.j(r1, r3, r10, r9) == r0) goto L32;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f70381n
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    jn0.t.b(r10)
                    goto L8a
                L1f:
                    java.lang.Object r1 = r9.f70382o
                    v3.c r1 = (v3.c) r1
                    jn0.t.b(r10)
                    goto L3a
                L27:
                    jn0.t.b(r10)
                    java.lang.Object r10 = r9.f70382o
                    r1 = r10
                    v3.c r1 = (v3.c) r1
                    r9.f70382o = r1
                    r9.f70381n = r4
                    java.lang.Object r10 = p007h2.u.a(r1, r9)
                    if (r10 != r0) goto L3a
                    goto L89
                L3a:
                    v3.m r10 = (v3.m) r10
                    boolean r4 = p007h2.u.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L77
                    int r4 = r10.getButtons()
                    boolean r4 = v3.q.b(r4)
                    if (r4 == 0) goto L77
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L56:
                    if (r7 >= r6) goto L68
                    java.lang.Object r8 = r4.get(r7)
                    v3.x r8 = (v3.PointerInputChange) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L65
                    goto L77
                L65:
                    int r7 = r7 + 1
                    goto L56
                L68:
                    h2.h r2 = r9.f70383p
                    h2.d r4 = r9.f70384q
                    r9.f70382o = r5
                    r9.f70381n = r3
                    java.lang.Object r10 = p007h2.u.c(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L8a
                    goto L89
                L77:
                    boolean r3 = p007h2.u.g(r10)
                    if (r3 != 0) goto L8a
                    b2.n0 r3 = r9.f70385r
                    r9.f70382o = r5
                    r9.f70381n = r2
                    java.lang.Object r10 = p007h2.u.d(r1, r3, r10, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    jn0.h0 r10 = jn0.h0.f84049a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: h2.u.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p007h2.h hVar, n0 n0Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f70379p = hVar;
            this.f70380q = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f70379p, this.f70380q, continuation);
            eVar.f70378o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70377n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f70378o;
                a aVar = new a(this.f70379p, new p007h2.d(f0Var.getViewConfiguration()), this.f70380q, null);
                this.f70377n = 1;
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
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((e) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {124, 128}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70386n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70387o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f70388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f70389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70390r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70389q = obj;
            this.f70390r |= Integer.MIN_VALUE;
            return u.j(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "it", "Ljn0/h0;", "a", "(Lv3/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements l<PointerInputChange, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f70391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n0 n0Var) {
            super(1);
            this.f70391c = n0Var;
        }

        public final void a(PointerInputChange pointerInputChange) {
            this.f70391c.b(v3.n.h(pointerInputChange));
            pointerInputChange.a();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f70393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<Boolean, h0> f70394p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {93}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        static final class a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70395n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f70396o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l<Boolean, h0> f70397p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super Boolean, h0> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f70397p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f70397p, continuation);
                aVar.f70396o = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f70395n
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f70396o
                    v3.c r1 = (v3.c) r1
                    jn0.t.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    jn0.t.b(r5)
                    java.lang.Object r5 = r4.f70396o
                    v3.c r5 = (v3.c) r5
                    r1 = r5
                L23:
                    v3.o r5 = v3.o.Initial
                    r4.f70396o = r1
                    r4.f70395n = r2
                    java.lang.Object r5 = r1.S0(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    v3.m r5 = (v3.m) r5
                    wn0.l<java.lang.Boolean, jn0.h0> r3 = r4.f70397p
                    boolean r5 = p007h2.u.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: h2.u.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(l<? super Boolean, h0> lVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f70394p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f70394p, continuation);
            hVar.f70393o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70392n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f70393o;
                a aVar = new a(this.f70394p, null);
                this.f70392n = 1;
                if (f0Var.z0(aVar, this) == coroutine_suspended) {
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
            return ((h) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:19:0x0050->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(v3.c r7, p013kotlin.coroutines.Continuation<? super v3.m> r8) {
        /*
            boolean r0 = r8 instanceof h2.u.a
            if (r0 == 0) goto L13
            r0 = r8
            h2.u$a r0 = (h2.u.a) r0
            int r1 = r0.f70369p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70369p = r1
            goto L18
        L13:
            h2.u$a r0 = new h2.u$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f70368o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70369p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f70367n
            v3.c r7 = (v3.c) r7
            jn0.t.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            jn0.t.b(r8)
        L38:
            v3.o r8 = v3.o.Main
            r0.f70367n = r7
            r0.f70369p = r3
            java.lang.Object r8 = r7.S0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            v3.m r8 = (v3.m) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            v3.x r6 = (v3.PointerInputChange) r6
            boolean r6 = v3.n.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p007h2.u.e(v3.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(e3 e3Var, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return j3.g.k(j3.g.q(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < i.h(e3Var, pointerInputChange.getType());
    }

    public static final boolean g(m mVar) {
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!k0.g(listC.get(i11).getType(), k0.INSTANCE.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(v3.c r7, p007h2.h r8, p007h2.d r9, v3.m r10, p013kotlin.coroutines.Continuation<? super jn0.h0> r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007h2.u.h(v3.c, h2.h, h2.d, v3.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, p007h2.h hVar, n0 n0Var) {
        return o0.c(dVar, hVar, n0Var, new e(hVar, n0Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(v3.c r8, kotlin.n0 r9, v3.m r10, p013kotlin.coroutines.Continuation<? super jn0.h0> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007h2.u.j(v3.c, b2.n0, v3.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, l<? super Boolean, h0> lVar) {
        return o0.d(dVar, 8675309, new h(lVar, null));
    }
}
