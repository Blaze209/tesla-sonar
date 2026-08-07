package androidx.compose.foundation;

import b4.p1;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/i;", "Lb4/p1;", "Landroidx/compose/ui/d$c;", "Lu1/l;", "interactionSource", "<init>", "(Lu1/l;)V", "Ljn0/h0;", "z2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "A2", "B2", "()V", "C2", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "i2", "n", "Lu1/l;", "Lu1/g;", "o", "Lu1/g;", "hoverInteraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends androidx.compose.ui.d.c implements p1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private u1.l interactionSource;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private u1.g hoverInteraction;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {111}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4454n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4455o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f4456p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4458r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4456p = obj;
            this.f4458r |= Integer.MIN_VALUE;
            return i.this.z2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {119}, m = "emitExit", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4459n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f4460o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4462q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4460o = obj;
            this.f4462q |= Integer.MIN_VALUE;
            return i.this.A2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4463n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4463n;
            if (i11 == 0) {
                t.b(obj);
                i iVar = i.this;
                this.f4463n = 1;
                if (iVar.z2(this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4465n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4465n;
            if (i11 == 0) {
                t.b(obj);
                i iVar = i.this;
                this.f4465n = 1;
                if (iVar.A2(this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public i(u1.l lVar) {
        this.interactionSource = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A2(Continuation<? super h0> continuation) {
        b bVar;
        i iVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f4462q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f4462q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f4460o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f4462q;
        if (i12 == 0) {
            t.b(obj);
            u1.g gVar = this.hoverInteraction;
            if (gVar != null) {
                u1.h hVar = new u1.h(gVar);
                u1.l lVar = this.interactionSource;
                bVar.f4459n = this;
                bVar.f4462q = 1;
                if (lVar.a(hVar, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = this;
            }
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iVar = (i) bVar.f4459n;
        t.b(obj);
        iVar.hoverInteraction = null;
        return h0.f84049a;
    }

    private final void B2() {
        u1.g gVar = this.hoverInteraction;
        if (gVar != null) {
            this.interactionSource.b(new u1.h(gVar));
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z2(Continuation<? super h0> continuation) {
        a aVar;
        i iVar;
        u1.g gVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f4458r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f4458r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f4456p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f4458r;
        if (i12 == 0) {
            t.b(obj);
            if (this.hoverInteraction == null) {
                u1.g gVar2 = new u1.g();
                u1.l lVar = this.interactionSource;
                aVar.f4454n = this;
                aVar.f4455o = gVar2;
                aVar.f4458r = 1;
                if (lVar.a(gVar2, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = this;
                gVar = gVar2;
            }
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gVar = (u1.g) aVar.f4455o;
        iVar = (i) aVar.f4454n;
        t.b(obj);
        iVar.hoverInteraction = gVar;
        return h0.f84049a;
    }

    public final void C2(u1.l interactionSource) {
        if (s.f(this.interactionSource, interactionSource)) {
            return;
        }
        B2();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        B2();
    }

    @Override // b4.p1
    public void q0(v3.m pointerEvent, v3.o pass, long bounds) {
        if (pass == v3.o.Main) {
            int type = pointerEvent.getType();
            v3.p.Companion companion = v3.p.INSTANCE;
            if (v3.p.i(type, companion.a())) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new c(null), 3, null);
            } else if (v3.p.i(type, companion.b())) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // b4.p1
    public void y0() {
        B2();
    }
}
