package androidx.compose.foundation.gestures;

import com.plaid.internal.EnumC4419g;
import j3.g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.j;
import p021s1.k;
import p021s1.l;
import p021s1.p;
import v3.PointerInputChange;
import w4.y;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010!\u001a\u00020\u00122.\u0010 \u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J§\u0001\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R8\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R8\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/gestures/c;", "Landroidx/compose/foundation/gestures/b;", "Ls1/l;", "state", "Lkotlin/Function1;", "Lv3/x;", "", "canDrag", "Ls1/p;", "orientation", "enabled", "Lu1/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lj3/g;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Ls1/l;Lwn0/l;Ls1/p;ZLu1/l;ZLwn0/q;Lwn0/q;Z)V", "Lw4/y;", "d3", "(J)J", "e3", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a$b;", "forEachDelta", "M2", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "Q2", "(J)V", "velocity", "R2", "V2", "()Z", "f3", "y", "Ls1/l;", "z", "Ls1/p;", "A", "Z", "B", "Lwn0/q;", "C", "D", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends androidx.compose.foundation.gestures.b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean startDragImmediately;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private q<? super CoroutineScope, ? super g, ? super Continuation<? super h0>, ? extends Object> onDragStarted;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private q<? super CoroutineScope, ? super Float, ? super Continuation<? super h0>, ? extends Object> onDragStopped;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private l state;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private p orientation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/j;", "Ljn0/h0;", "<anonymous>", "(Ls1/j;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<j, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4382n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4383o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<wn0.l<? super androidx.compose.foundation.gestures.a.b, h0>, Continuation<? super h0>, Object> f4384p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ c f4385q;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a$b;", "dragDelta", "Ljn0/h0;", "a", "(Landroidx/compose/foundation/gestures/a$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class C0094a extends u implements wn0.l<androidx.compose.foundation.gestures.a.b, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f4386c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f4387d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0094a(j jVar, c cVar) {
                super(1);
                this.f4386c = jVar;
                this.f4387d = cVar;
            }

            public final void a(androidx.compose.foundation.gestures.a.b bVar) {
                this.f4386c.a(k.h(this.f4387d.e3(bVar.getDelta()), this.f4387d.orientation));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.foundation.gestures.a.b bVar) {
                a(bVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.p<? super wn0.l<? super androidx.compose.foundation.gestures.a.b, h0>, ? super Continuation<? super h0>, ? extends Object> pVar, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4384p = pVar;
            this.f4385q = cVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, Continuation<? super h0> continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f4384p, this.f4385q, continuation);
            aVar.f4383o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4382n;
            if (i11 == 0) {
                t.b(obj);
                j jVar = (j) this.f4383o;
                wn0.p<wn0.l<? super androidx.compose.foundation.gestures.a.b, h0>, Continuation<? super h0>, Object> pVar = this.f4384p;
                C0094a c0094a = new C0094a(jVar, this.f4385q);
                this.f4382n = 1;
                if (pVar.invoke(c0094a, this) == coroutine_suspended) {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4388n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4389o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f4391q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4391q = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = c.this.new b(this.f4391q, continuation);
            bVar.f4389o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4388n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f4389o;
                q qVar = c.this.onDragStarted;
                g gVarD = g.d(this.f4391q);
                this.f4388n = 1;
                if (qVar.invoke(coroutineScope, gVarD, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C0095c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4393o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f4395q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0095c(long j11, Continuation<? super C0095c> continuation) {
            super(2, continuation);
            this.f4395q = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C0095c c0095c = c.this.new C0095c(this.f4395q, continuation);
            c0095c.f4393o = obj;
            return c0095c;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4392n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f4393o;
                q qVar = c.this.onDragStopped;
                Float fBoxFloat = Boxing.boxFloat(k.i(c.this.d3(this.f4395q), c.this.orientation));
                this.f4392n = 1;
                if (qVar.invoke(coroutineScope, fBoxFloat, this) == coroutine_suspended) {
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
            return ((C0095c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(l lVar, wn0.l<? super PointerInputChange, Boolean> lVar2, p pVar, boolean z11, u1.l lVar3, boolean z12, q<? super CoroutineScope, ? super g, ? super Continuation<? super h0>, ? extends Object> qVar, q<? super CoroutineScope, ? super Float, ? super Continuation<? super h0>, ? extends Object> qVar2, boolean z13) {
        super(lVar2, z11, lVar3, pVar);
        this.state = lVar;
        this.orientation = pVar;
        this.startDragImmediately = z12;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long d3(long j11) {
        return y.m(j11, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e3(long j11) {
        return g.s(j11, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object M2(wn0.p<? super wn0.l<? super androidx.compose.foundation.gestures.a.b, h0>, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objA = this.state.a(q1.h0.UserInput, new a(pVar, this, null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : h0.f84049a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void Q2(long startedPosition) {
        if (!getIsAttached() || s.f(this.onDragStarted, k.f109583a)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new b(startedPosition, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void R2(long velocity) {
        if (!getIsAttached() || s.f(this.onDragStopped, k.f109584b)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new C0095c(velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    /* JADX INFO: renamed from: V2, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void f3(l state, wn0.l<? super PointerInputChange, Boolean> canDrag, p orientation, boolean enabled, u1.l interactionSource, boolean startDragImmediately, q<? super CoroutineScope, ? super g, ? super Continuation<? super h0>, ? extends Object> onDragStarted, q<? super CoroutineScope, ? super Float, ? super Continuation<? super h0>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z11;
        boolean z12 = true;
        if (s.f(this.state, state)) {
            z11 = false;
        } else {
            this.state = state;
            z11 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z11 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z12 = z11;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        X2(canDrag, enabled, interactionSource, orientation, z12);
    }
}
