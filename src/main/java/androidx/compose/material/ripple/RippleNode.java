package androidx.compose.material.ripple;

import androidx.collection.i0;
import b4.a0;
import b4.h;
import b4.k;
import b4.r;
import b4.s;
import ezvcard.property.Gender;
import j3.m;
import jn0.h0;
import jn0.t;
import k3.s1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n2.RippleAlpha;
import n2.f;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import u1.i;
import u1.j;
import u1.n;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010$R*\u0010J\u001a\u00020*2\u0006\u0010E\u001a\u00020*8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00104R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010S\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/d$c;", "Lb4/h;", "Lb4/r;", "Lb4/a0;", "Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "<init>", "(Lu1/j;ZFLk3/s1;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/n;", "pressInteraction", "Ljn0/h0;", "I2", "(Lu1/n;)V", "Lu1/i;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "K2", "(Lu1/i;Lkotlinx/coroutines/CoroutineScope;)V", "Lw4/r;", "size", "D", "(J)V", "h2", "()V", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "Lm3/f;", "D2", "(Lm3/f;)V", "Lu1/n$b;", "Lj3/m;", "", "targetRadius", "C2", "(Lu1/n$b;JF)V", "J2", "(Lu1/n$b;)V", "n", "Lu1/j;", "o", "Z", "E2", "()Z", "p", "Lk3/s1;", "q", "Lwn0/a;", "F2", "()Lwn0/a;", "r", "c2", "shouldAutoInvalidate", "Landroidx/compose/material/ripple/e;", "s", "Landroidx/compose/material/ripple/e;", "stateLayer", "t", "<set-?>", "u", "J", "H2", "()J", "rippleSize", "v", "hasValidSize", "Landroidx/collection/i0;", "w", "Landroidx/collection/i0;", "pendingInteractions", "Lk3/p1;", "G2", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RippleNode extends androidx.compose.ui.d.c implements h, r, a0 {
    private final s1 color;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private e stateLayer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean hasValidSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final i0<n> pendingInteractions;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5082n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f5083o;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C0113a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RippleNode f5085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f5086b;

            C0113a(RippleNode rippleNode, CoroutineScope coroutineScope) {
                this.f5085a = rippleNode;
                this.f5086b = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super h0> continuation) {
                if (!(iVar instanceof n)) {
                    this.f5085a.K2(iVar, this.f5086b);
                } else if (this.f5085a.hasValidSize) {
                    this.f5085a.I2((n) iVar);
                } else {
                    this.f5085a.pendingInteractions.g(iVar);
                }
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = RippleNode.this.new a(continuation);
            aVar.f5083o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5082n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f5083o;
                Flow<i> flowC = RippleNode.this.interactionSource.c();
                C0113a c0113a = new C0113a(RippleNode.this, coroutineScope);
                this.f5082n = 1;
                if (flowC.collect(c0113a, this) == coroutine_suspended) {
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

    public /* synthetic */ RippleNode(j jVar, boolean z11, float f11, s1 s1Var, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z11, f11, s1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(n pressInteraction) {
        if (pressInteraction instanceof n.b) {
            C2((n.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof n.c) {
            J2(((n.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof n.a) {
            J2(((n.a) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(i interaction, CoroutineScope scope) {
        e eVar = this.stateLayer;
        if (eVar == null) {
            eVar = new e(this.bounded, this.rippleAlpha);
            s.a(this);
            this.stateLayer = eVar;
        }
        eVar.c(interaction, scope);
    }

    public abstract void C2(n.b interaction, long size, float targetRadius);

    @Override // b4.a0
    public void D(long size) {
        this.hasValidSize = true;
        w4.d dVarI = k.i(this);
        this.rippleSize = w4.s.d(size);
        this.targetRadius = Float.isNaN(this.radius) ? f.a(dVarI, this.bounded, this.rippleSize) : dVarI.O1(this.radius);
        i0<n> i0Var = this.pendingInteractions;
        Object[] objArr = i0Var.content;
        int i11 = i0Var._size;
        for (int i12 = 0; i12 < i11; i12++) {
            I2((n) objArr[i12]);
        }
        this.pendingInteractions.h();
    }

    public abstract void D2(m3.f fVar);

    /* JADX INFO: renamed from: E2, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        cVar.M0();
        e eVar = this.stateLayer;
        if (eVar != null) {
            eVar.b(cVar, this.targetRadius, G2());
        }
        D2(cVar);
    }

    protected final wn0.a<RippleAlpha> F2() {
        return this.rippleAlpha;
    }

    public final long G2() {
        return this.color.a();
    }

    /* JADX INFO: renamed from: H2, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    public abstract void J2(n.b interaction);

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new a(null), 3, null);
    }

    private RippleNode(j jVar, boolean z11, float f11, s1 s1Var, wn0.a<RippleAlpha> aVar) {
        this.interactionSource = jVar;
        this.bounded = z11;
        this.radius = f11;
        this.color = s1Var;
        this.rippleAlpha = aVar;
        this.rippleSize = m.INSTANCE.b();
        this.pendingInteractions = new i0<>(0, 1, null);
    }
}
