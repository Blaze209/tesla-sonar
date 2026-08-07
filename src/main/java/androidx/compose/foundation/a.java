package androidx.compose.foundation;

import android.view.KeyEvent;
import b4.p1;
import b4.s1;
import b4.t1;
import b4.x1;
import ezvcard.property.Gender;
import g4.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.q;
import q1.e0;
import q1.t;
import q1.v;
import v3.f0;
import v3.o0;
import v3.q0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\n\b \u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0081\u0001BE\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0012*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0019J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0012H\u0004¢\u0006\u0004\b'\u0010\u0019J(\u0010.\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0019J\u0018\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b5\u00104J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u00020\u0012*\u00020 ¢\u0006\u0004\b:\u0010\"J\u0011\u0010;\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\u0012*\u00020=2\u0006\u0010?\u001a\u00020>H\u0084@ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010\f\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u0017R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010T\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010\u0017R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020d0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010s\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010CR\u0016\u0010w\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010LR\u001a\u0010}\u001a\u00020x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0011\u0010\u007f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b~\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/foundation/a;", "Lb4/m;", "Lb4/p1;", "Lt3/e;", "Li3/c;", "Lb4/s1;", "Lb4/x1;", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "U2", "()Z", "S2", "()V", "L2", "N2", "O2", "Lv3/f0;", "K2", "(Lv3/f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg4/y;", "J2", "(Lg4/y;)V", "V2", "(Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;Lwn0/a;)V", "h2", "i2", "M2", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "Lt3/b;", "event", "B1", "(Landroid/view/KeyEvent;)Z", "s0", "Li3/o;", "focusState", "y", "(Li3/o;)V", "G0", "T2", "()Ljn0/h0;", "Ls1/q;", "Lj3/g;", "offset", "R2", "(Ls1/q;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "Lu1/l;", "q", "Lq1/e0;", "r", "Ljava/lang/String;", "s", "Lg4/i;", "<set-?>", "t", "Z", "P2", "u", "Lwn0/a;", "Q2", "()Lwn0/a;", "v", "c2", "shouldAutoInvalidate", "Lq1/t;", "w", "Lq1/t;", "focusableInNonTouchMode", "Lq1/v;", "x", "Lq1/v;", "focusableNode", "Lv3/q0;", "Lv3/q0;", "pointerInputNode", "Lb4/j;", "z", "Lb4/j;", "indicationNode", "Lu1/n$b;", "A", "Lu1/n$b;", "pressInteraction", "Lu1/g;", "B", "Lu1/g;", "hoverInteraction", "", "Lt3/a;", "C", "Ljava/util/Map;", "currentKeyPressInteractions", "D", "J", "centerOffset", "E", "userProvidedInteractionSource", Gender.FEMALE, "lazilyCreateIndication", "", "G", "Ljava/lang/Object;", "P0", "()Ljava/lang/Object;", "traverseKey", "L0", "shouldMergeDescendantSemantics", "H", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a extends b4.m implements p1, t3.e, i3.c, s1, x1 {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int I = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private u1.n.b pressInteraction;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private u1.g hoverInteraction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final Map<t3.a, u1.n.b> currentKeyPressInteractions;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long centerOffset;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private u1.l userProvidedInteractionSource;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private u1.l interactionSource;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private e0 indicationNodeFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private String onClickLabel;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private g4.i role;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onClick;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t focusableInNonTouchMode;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final v focusableNode;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private q0 pointerInputNode;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private b4.j indicationNode;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            a.this.Q2().invoke();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4209n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ u1.l f4210o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.g f4211p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u1.l lVar, u1.g gVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f4210o = lVar;
            this.f4211p = gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f4210o, this.f4211p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4209n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u1.l lVar = this.f4210o;
                u1.g gVar = this.f4211p;
                this.f4209n = 1;
                if (lVar.a(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", i = {}, l = {1186}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4212n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ u1.l f4213o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.h f4214p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u1.l lVar, u1.h hVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f4213o = lVar;
            this.f4214p = hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f4213o, this.f4214p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4212n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u1.l lVar = this.f4213o;
                u1.h hVar = this.f4214p;
                this.f4212n = 1;
                if (lVar.a(hVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f4215n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f4216o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f4217p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q f4218q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f4219r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ u1.l f4220s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f4221t;

        /* JADX INFO: renamed from: androidx.compose.foundation.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1133, 1136}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
        static final class C0086a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f4222n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f4223o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a f4224p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ long f4225q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ u1.l f4226r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0086a(a aVar, long j11, u1.l lVar, Continuation<? super C0086a> continuation) {
                super(2, continuation);
                this.f4224p = aVar;
                this.f4225q = j11;
                this.f4226r = lVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0086a(this.f4224p, this.f4225q, this.f4226r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                u1.n.b bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4223o;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    if (this.f4224p.L2()) {
                        long jA = q1.k.a();
                        this.f4223o = 1;
                        if (DelayKt.delay(jA, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    jn0.t.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (u1.n.b) this.f4222n;
                    jn0.t.b(obj);
                }
                this.f4224p.pressInteraction = bVar;
                return h0.f84049a;
                u1.n.b bVar2 = new u1.n.b(this.f4225q, null);
                u1.l lVar = this.f4226r;
                this.f4222n = bVar2;
                this.f4223o = 2;
                if (lVar.a(bVar2, this) != coroutine_suspended) {
                    bVar = bVar2;
                    this.f4224p.pressInteraction = bVar;
                    return h0.f84049a;
                }
                return coroutine_suspended;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0086a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(q qVar, long j11, u1.l lVar, a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f4218q = qVar;
            this.f4219r = j11;
            this.f4220s = lVar;
            this.f4221t = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f4218q, this.f4219r, this.f4220s, this.f4221t, continuation);
            eVar.f4217p = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            if (r3.a(r2, r16) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        
            if (r4.a(r5, r16) == r1) goto L41;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {1074}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4227n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.n.b f4229p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(u1.n.b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f4229p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(this.f4229p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4227n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    u1.n.b bVar = this.f4229p;
                    this.f4227n = 1;
                    if (lVar.a(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", i = {}, l = {1085}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4230n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.n.b f4232p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(u1.n.b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f4232p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new g(this.f4232p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4230n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    u1.n.c cVar = new u1.n.c(this.f4232p);
                    this.f4230n = 1;
                    if (lVar.a(cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4233n;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4233n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            a.this.N2();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4235n;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4235n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            a.this.O2();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", f = "Clickable.kt", i = {}, l = {1042}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4237n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4238o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = a.this.new j(continuation);
            jVar.f4238o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4237n;
            if (i11 == 0) {
                jn0.t.b(obj);
                f0 f0Var = (f0) this.f4238o;
                a aVar = a.this;
                this.f4237n = 1;
                if (aVar.K2(f0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((j) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ a(u1.l lVar, e0 e0Var, boolean z11, String str, g4.i iVar, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, e0Var, z11, str, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L2() {
        return androidx.compose.foundation.d.g(this) || q1.k.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2() {
        if (this.hoverInteraction == null) {
            u1.g gVar = new u1.g();
            u1.l lVar = this.interactionSource;
            if (lVar != null) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new c(lVar, gVar, null), 3, null);
            }
            this.hoverInteraction = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2() {
        u1.g gVar = this.hoverInteraction;
        if (gVar != null) {
            u1.h hVar = new u1.h(gVar);
            u1.l lVar = this.interactionSource;
            if (lVar != null) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new d(lVar, hVar, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    private final void S2() {
        e0 e0Var;
        if (this.indicationNode == null && (e0Var = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = u1.k.a();
            }
            this.focusableNode.D2(this.interactionSource);
            u1.l lVar = this.interactionSource;
            s.h(lVar);
            b4.j jVarA = e0Var.a(lVar);
            x2(jVarA);
            this.indicationNode = jVarA;
        }
    }

    private final boolean U2() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    @Override // t3.e
    public final boolean B1(KeyEvent event) {
        S2();
        if (this.enabled && q1.k.f(event)) {
            if (this.currentKeyPressInteractions.containsKey(t3.a.n(t3.d.a(event)))) {
                return false;
            }
            u1.n.b bVar = new u1.n.b(this.centerOffset, null);
            this.currentKeyPressInteractions.put(t3.a.n(t3.d.a(event)), bVar);
            if (this.interactionSource != null) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new f(bVar, null), 3, null);
            }
            return true;
        }
        if (!this.enabled || !q1.k.b(event)) {
            return false;
        }
        u1.n.b bVarRemove = this.currentKeyPressInteractions.remove(t3.a.n(t3.d.a(event)));
        if (bVarRemove != null && this.interactionSource != null) {
            BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new g(bVarRemove, null), 3, null);
        }
        this.onClick.invoke();
        return true;
    }

    @Override // b4.s1
    public final void G0(y yVar) {
        g4.i iVar = this.role;
        if (iVar != null) {
            s.h(iVar);
            g4.v.k0(yVar, iVar.getValue());
        }
        g4.v.A(yVar, this.onClickLabel, new b());
        if (this.enabled) {
            this.focusableNode.G0(yVar);
        } else {
            g4.v.l(yVar);
        }
        J2(yVar);
    }

    public abstract Object K2(f0 f0Var, Continuation<? super h0> continuation);

    @Override // b4.s1
    /* JADX INFO: renamed from: L0 */
    public final boolean getMergeDescendants() {
        return true;
    }

    protected final void M2() {
        u1.l lVar = this.interactionSource;
        if (lVar != null) {
            u1.n.b bVar = this.pressInteraction;
            if (bVar != null) {
                lVar.b(new u1.n.a(bVar));
            }
            u1.g gVar = this.hoverInteraction;
            if (gVar != null) {
                lVar.b(new u1.h(gVar));
            }
            Iterator<T> it = this.currentKeyPressInteractions.values().iterator();
            while (it.hasNext()) {
                lVar.b(new u1.n.a((u1.n.b) it.next()));
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: P2, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final wn0.a<h0> Q2() {
        return this.onClick;
    }

    protected final Object R2(q qVar, long j11, Continuation<? super h0> continuation) {
        Object objCoroutineScope;
        u1.l lVar = this.interactionSource;
        return (lVar == null || (objCoroutineScope = CoroutineScopeKt.coroutineScope(new e(qVar, j11, lVar, this, null), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? h0.f84049a : objCoroutineScope;
    }

    protected final h0 T2() {
        q0 q0Var = this.pointerInputNode;
        if (q0Var == null) {
            return null;
        }
        q0Var.o1();
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    protected final void V2(u1.l interactionSource, e0 indicationNodeFactory, boolean enabled, String onClickLabel, g4.i role, wn0.a<h0> onClick) {
        boolean z11;
        boolean z12;
        b4.j jVar;
        if (s.f(this.userProvidedInteractionSource, interactionSource)) {
            z11 = false;
        } else {
            M2();
            this.userProvidedInteractionSource = interactionSource;
            this.interactionSource = interactionSource;
            z11 = true;
        }
        if (!s.f(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z11 = true;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                x2(this.focusableInNonTouchMode);
                x2(this.focusableNode);
            } else {
                A2(this.focusableInNonTouchMode);
                A2(this.focusableNode);
                M2();
            }
            t1.b(this);
            this.enabled = enabled;
        }
        if (!s.f(this.onClickLabel, onClickLabel)) {
            this.onClickLabel = onClickLabel;
            t1.b(this);
        }
        if (!s.f(this.role, role)) {
            this.role = role;
            t1.b(this);
        }
        this.onClick = onClick;
        if (this.lazilyCreateIndication != U2()) {
            boolean zU2 = U2();
            this.lazilyCreateIndication = zU2;
            z12 = (zU2 || this.indicationNode != null) ? z11 : true;
        }
        if (z12 && ((jVar = this.indicationNode) != null || !this.lazilyCreateIndication)) {
            if (jVar != null) {
                A2(jVar);
            }
            this.indicationNode = null;
            S2();
        }
        this.focusableNode.D2(this.interactionSource);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        if (!this.lazilyCreateIndication) {
            S2();
        }
        if (this.enabled) {
            x2(this.focusableInNonTouchMode);
            x2(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        M2();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        b4.j jVar = this.indicationNode;
        if (jVar != null) {
            A2(jVar);
        }
        this.indicationNode = null;
    }

    @Override // b4.p1
    public final void q0(v3.m pointerEvent, v3.o pass, long bounds) {
        long jB = w4.s.b(bounds);
        this.centerOffset = j3.h.a(w4.n.h(jB), w4.n.i(jB));
        S2();
        if (this.enabled && pass == v3.o.Main) {
            int type = pointerEvent.getType();
            v3.p.Companion companion = v3.p.INSTANCE;
            if (v3.p.i(type, companion.a())) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new h(null), 3, null);
            } else if (v3.p.i(type, companion.b())) {
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new i(null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (q0) x2(o0.a(new j(null)));
        }
        q0 q0Var = this.pointerInputNode;
        if (q0Var != null) {
            q0Var.q0(pointerEvent, pass, bounds);
        }
    }

    @Override // t3.e
    public final boolean s0(KeyEvent event) {
        return false;
    }

    @Override // i3.c
    public final void y(i3.o focusState) {
        if (focusState.isFocused()) {
            S2();
        }
        if (this.enabled) {
            this.focusableNode.y(focusState);
        }
    }

    @Override // b4.p1
    public final void y0() {
        u1.g gVar;
        u1.l lVar = this.interactionSource;
        if (lVar != null && (gVar = this.hoverInteraction) != null) {
            lVar.b(new u1.h(gVar));
        }
        this.hoverInteraction = null;
        q0 q0Var = this.pointerInputNode;
        if (q0Var != null) {
            q0Var.y0();
        }
    }

    private a(u1.l lVar, e0 e0Var, boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
        this.interactionSource = lVar;
        this.indicationNodeFactory = e0Var;
        this.onClickLabel = str;
        this.role = iVar;
        this.enabled = z11;
        this.onClick = aVar;
        this.focusableInNonTouchMode = new t();
        this.focusableNode = new v(this.interactionSource);
        this.currentKeyPressInteractions = new LinkedHashMap();
        this.centerOffset = j3.g.INSTANCE.c();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = U2();
        this.traverseKey = INSTANCE;
    }

    public void J2(y yVar) {
    }
}
