package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.ui.platform.z0;
import b4.e1;
import b4.f1;
import b4.i;
import b4.k;
import b4.s1;
import b4.t1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import g4.y;
import i3.j;
import i3.r;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p015o1.x;
import p021s1.m;
import p021s1.o;
import p021s1.s;
import p021s1.v;
import p021s1.z;
import q1.n0;
import v3.PointerInputChange;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BO\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\"\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J@\u0010)\u001a\u00020\u00182.\u0010(\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&\u0012\u0006\u0012\u0004\u0018\u00010'0#H\u0096@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103JU\u00104\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u0010\u001aJ\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010>J*\u0010D\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020\u0018*\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010P\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u00103R\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR*\u0010p\u001a\u0016\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR4\u0010r\u001a \b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010o\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/gestures/b;", "Lb4/e1;", "Lb4/h;", "Li3/j;", "Lt3/e;", "Lb4/s1;", "Ls1/x;", "state", "Lq1/n0;", "overscrollEffect", "Ls1/m;", "flingBehavior", "Ls1/p;", "orientation", "", "enabled", "reverseDirection", "Lu1/l;", "interactionSource", "Ls1/d;", "bringIntoViewSpec", "<init>", "(Ls1/x;Lq1/n0;Ls1/m;Ls1/p;ZZLu1/l;Ls1/d;)V", "Ljn0/h0;", "f3", "()V", "d3", "b3", "Lv3/m;", "event", "Lw4/r;", "size", "c3", "(Lv3/m;J)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a$b;", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "M2", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3/g;", "startedPosition", "Q2", "(J)V", "Lw4/y;", "velocity", "R2", "V2", "()Z", "e3", "(Ls1/x;Ls1/p;Lq1/n0;ZZLs1/m;Lu1/l;Ls1/d;)V", "h2", "g1", "Landroidx/compose/ui/focus/k;", "focusProperties", "y1", "(Landroidx/compose/ui/focus/k;)V", "Lt3/b;", "B1", "(Landroid/view/KeyEvent;)Z", "s0", "pointerEvent", "Lv3/o;", "pass", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "Lg4/y;", "G0", "(Lg4/y;)V", "y", "Lq1/n0;", "z", "Ls1/m;", "A", "Z", "c2", "shouldAutoInvalidate", "Lu3/b;", "B", "Lu3/b;", "nestedScrollDispatcher", "Ls1/v;", "C", "Ls1/v;", "scrollableContainerNode", "Ls1/g;", "D", "Ls1/g;", "defaultFlingBehavior", "Ls1/z;", "E", "Ls1/z;", "scrollingLogic", "Landroidx/compose/foundation/gestures/e;", Gender.FEMALE, "Landroidx/compose/foundation/gestures/e;", "nestedScrollConnection", "Ls1/f;", "G", "Ls1/f;", "contentInViewNode", "Ls1/s;", "H", "Ls1/s;", "scrollConfig", "", "I", "Lwn0/p;", "scrollByAction", "J", "scrollByOffsetAction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f extends androidx.compose.foundation.gestures.b implements e1, b4.h, j, t3.e, s1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final u3.b nestedScrollDispatcher;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final v scrollableContainerNode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final p021s1.g defaultFlingBehavior;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final z scrollingLogic;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.e nestedScrollConnection;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final p021s1.f contentInViewNode;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private s scrollConfig;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private p<? super Float, ? super Float, Boolean> scrollByAction;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private p<? super j3.g, ? super Continuation<? super j3.g>, ? extends Object> scrollByOffsetAction;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private n0 overscrollEffect;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private m flingBehavior;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz3/v;", "it", "Ljn0/h0;", "a", "(Lz3/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<z3.v, h0> {
        a() {
            super(1);
        }

        public final void a(z3.v vVar) {
            f.this.contentInViewNode.R2(vVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z3.v vVar) {
            a(vVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4422n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4423o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<l<? super androidx.compose.foundation.gestures.a.b, h0>, Continuation<? super h0>, Object> f4424p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ z f4425q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a$b;", "it", "Ljn0/h0;", "a", "(Landroidx/compose/foundation/gestures/a$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<androidx.compose.foundation.gestures.a.b, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f4426c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ z f4427d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, z zVar) {
                super(1);
                this.f4426c = oVar;
                this.f4427d = zVar;
            }

            public final void a(androidx.compose.foundation.gestures.a.b bVar) {
                this.f4426c.a(this.f4427d.x(bVar.getDelta()), u3.e.INSTANCE.c());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.foundation.gestures.a.b bVar) {
                a(bVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l<? super androidx.compose.foundation.gestures.a.b, h0>, ? super Continuation<? super h0>, ? extends Object> pVar, z zVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4424p = pVar;
            this.f4425q = zVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o oVar, Continuation<? super h0> continuation) {
            return ((b) create(oVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f4424p, this.f4425q, continuation);
            bVar.f4423o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4422n;
            if (i11 == 0) {
                t.b(obj);
                o oVar = (o) this.f4423o;
                p<l<? super androidx.compose.foundation.gestures.a.b, h0>, Continuation<? super h0>, Object> pVar = this.f4424p;
                a aVar = new a(oVar, this.f4425q);
                this.f4422n = 1;
                if (pVar.invoke(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4428n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f4430p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f4430p = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(this.f4430p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4428n;
            if (i11 == 0) {
                t.b(obj);
                z zVar = f.this.scrollingLogic;
                long j11 = this.f4430p;
                this.f4428n = 1;
                if (zVar.q(j11, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4431n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f4433p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4434n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f4435o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ long f4436p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4436p = j11;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o oVar, Continuation<? super h0> continuation) {
                return ((a) create(oVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f4436p, continuation);
                aVar.f4435o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4434n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ((o) this.f4435o).b(this.f4436p, u3.e.INSTANCE.c());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f4433p = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new d(this.f4433p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4431n;
            if (i11 == 0) {
                t.b(obj);
                z zVar = f.this.scrollingLogic;
                q1.h0 h0Var = q1.h0.UserInput;
                a aVar = new a(this.f4433p, null);
                this.f4431n = 1;
                if (zVar.v(h0Var, aVar, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1", f = "Scrollable.kt", i = {}, l = {549}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4437n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f4439p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4440n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f4441o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ long f4442p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4442p = j11;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o oVar, Continuation<? super h0> continuation) {
                return ((a) create(oVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f4442p, continuation);
                aVar.f4441o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4440n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ((o) this.f4441o).b(this.f4442p, u3.e.INSTANCE.c());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f4439p = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new e(this.f4439p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4437n;
            if (i11 == 0) {
                t.b(obj);
                z zVar = f.this.scrollingLogic;
                q1.h0 h0Var = q1.h0.UserInput;
                a aVar = new a(this.f4439p, null);
                this.f4437n = 1;
                if (zVar.v(h0Var, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class C0097f extends u implements p<Float, Float, Boolean> {

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4444n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f4445o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ float f4446p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ float f4447q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, float f11, float f12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4445o = fVar;
                this.f4446p = f11;
                this.f4447q = f12;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f4445o, this.f4446p, this.f4447q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4444n;
                if (i11 == 0) {
                    t.b(obj);
                    z zVar = this.f4445o.scrollingLogic;
                    long jA = j3.h.a(this.f4446p, this.f4447q);
                    this.f4444n = 1;
                    if (androidx.compose.foundation.gestures.d.j(zVar, jA, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        C0097f() {
            super(2);
        }

        public final Boolean a(float f11, float f12) {
            BuildersKt__Builders_commonKt.launch$default(f.this.X1(), null, null, new a(f.this, f11, f12, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f11, Float f12) {
            return a(f11.floatValue(), f12.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj3/g;", "offset", "<anonymous>", "(Lj3/g;)Lj3/g;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<j3.g, Continuation<? super j3.g>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4448n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ long f4449o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        public final Object a(long j11, Continuation<? super j3.g> continuation) {
            return ((g) create(j3.g.d(j11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = f.this.new g(continuation);
            gVar.f4449o = ((j3.g) obj).getPackedValue();
            return gVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(j3.g gVar, Continuation<? super j3.g> continuation) {
            return a(gVar.getPackedValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4448n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            long j11 = this.f4449o;
            z zVar = f.this.scrollingLogic;
            this.f4448n = 1;
            Object objJ = androidx.compose.foundation.gestures.d.j(zVar, j11, this);
            return objJ == coroutine_suspended ? coroutine_suspended : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<h0> {
        h() {
            super(0);
        }

        public final void b() {
            f.this.defaultFlingBehavior.f(x.c((w4.d) i.a(f.this, z0.g())));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public f(p021s1.x xVar, n0 n0Var, m mVar, p021s1.p pVar, boolean z11, boolean z12, u1.l lVar, p021s1.d dVar) {
        super(androidx.compose.foundation.gestures.d.f4396a, z11, lVar, pVar);
        this.overscrollEffect = n0Var;
        this.flingBehavior = mVar;
        u3.b bVar = new u3.b();
        this.nestedScrollDispatcher = bVar;
        this.scrollableContainerNode = (v) x2(new v(z11));
        p021s1.g gVar = new p021s1.g(x.c(androidx.compose.foundation.gestures.d.f4399d), null, 2, null);
        this.defaultFlingBehavior = gVar;
        n0 n0Var2 = this.overscrollEffect;
        m mVar2 = this.flingBehavior;
        z zVar = new z(xVar, n0Var2, mVar2 == null ? gVar : mVar2, pVar, z12, bVar);
        this.scrollingLogic = zVar;
        androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(zVar, z11);
        this.nestedScrollConnection = eVar;
        p021s1.f fVar = (p021s1.f) x2(new p021s1.f(pVar, zVar, z12, dVar));
        this.contentInViewNode = fVar;
        x2(u3.d.a(eVar, bVar));
        x2(r.a());
        x2(new androidx.compose.foundation.relocation.f(fVar));
        x2(new q1.z(new a()));
    }

    private final void b3() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void c3(v3.m event, long size) {
        List<PointerInputChange> listC = event.c();
        int size2 = listC.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (listC.get(i11).p()) {
                return;
            }
        }
        s sVar = this.scrollConfig;
        p013kotlin.jvm.internal.s.h(sVar);
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new e(sVar.a(k.i(this), event, size), null), 3, null);
        List<PointerInputChange> listC2 = event.c();
        int size3 = listC2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            listC2.get(i12).a();
        }
    }

    private final void d3() {
        this.scrollByAction = new C0097f();
        this.scrollByOffsetAction = new g(null);
    }

    private final void f3() {
        f1.a(this, new h());
    }

    @Override // t3.e
    public boolean B1(KeyEvent event) {
        long jA;
        if (!getEnabled()) {
            return false;
        }
        long jA2 = t3.d.a(event);
        t3.a.Companion companion = t3.a.INSTANCE;
        if ((!t3.a.q(jA2, companion.k()) && !t3.a.q(t3.d.a(event), companion.l())) || !t3.c.e(t3.d.b(event), t3.c.INSTANCE.a()) || t3.d.e(event)) {
            return false;
        }
        if (this.scrollingLogic.p()) {
            int iF = w4.r.f(this.contentInViewNode.getViewportSize());
            jA = j3.h.a(BitmapDescriptorFactory.HUE_RED, t3.a.q(t3.d.a(event), companion.l()) ? iF : -iF);
        } else {
            int iG = w4.r.g(this.contentInViewNode.getViewportSize());
            jA = j3.h.a(t3.a.q(t3.d.a(event), companion.l()) ? iG : -iG, BitmapDescriptorFactory.HUE_RED);
        }
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new d(jA, null), 3, null);
        return true;
    }

    @Override // b4.s1
    public void G0(y yVar) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            d3();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.scrollByAction;
        if (pVar != null) {
            g4.v.V(yVar, null, pVar, 1, null);
        }
        p<? super j3.g, ? super Continuation<? super j3.g>, ? extends Object> pVar2 = this.scrollByOffsetAction;
        if (pVar2 != null) {
            g4.v.W(yVar, pVar2);
        }
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object M2(p<? super l<? super androidx.compose.foundation.gestures.a.b, h0>, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        z zVar = this.scrollingLogic;
        Object objV = zVar.v(q1.h0.UserInput, new b(pVar, zVar, null), continuation);
        return objV == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objV : h0.f84049a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void Q2(long startedPosition) {
    }

    @Override // androidx.compose.foundation.gestures.b
    public void R2(long velocity) {
        BuildersKt__Builders_commonKt.launch$default(this.nestedScrollDispatcher.e(), null, null, new c(velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    /* JADX INFO: renamed from: V2 */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.w();
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void e3(p021s1.x state, p021s1.p orientation, n0 overscrollEffect, boolean enabled, boolean reverseDirection, m flingBehavior, u1.l interactionSource, p021s1.d bringIntoViewSpec) {
        boolean z11;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.a(enabled);
            this.scrollableContainerNode.y2(enabled);
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        boolean zC = this.scrollingLogic.C(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.U2(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        X2(androidx.compose.foundation.gestures.d.f4396a, enabled, interactionSource, this.scrollingLogic.p() ? p021s1.p.Vertical : p021s1.p.Horizontal, zC);
        if (z12) {
            b3();
            t1.b(this);
        }
    }

    @Override // b4.e1
    public void g1() {
        f3();
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        f3();
        this.scrollConfig = p021s1.b.a(this);
    }

    @Override // androidx.compose.foundation.gestures.b, b4.p1
    public void q0(v3.m pointerEvent, v3.o pass, long bounds) {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (N2().invoke(listC.get(i11)).booleanValue()) {
                super.q0(pointerEvent, pass, bounds);
                break;
            }
        }
        if (pass == v3.o.Main && v3.p.i(pointerEvent.getType(), v3.p.INSTANCE.f())) {
            c3(pointerEvent, bounds);
        }
    }

    @Override // t3.e
    public boolean s0(KeyEvent event) {
        return false;
    }

    @Override // i3.j
    public void y1(androidx.compose.ui.focus.k focusProperties) {
        focusProperties.r(false);
    }
}
