package n2;

import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import k3.p1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p020r2.Function0;
import p020r2.n3;
import p020r2.y3;
import q1.c0;
import q1.d0;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H'ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Ln2/c;", "Lq1/c0;", "", "bounded", "Lw4/h;", "radius", "Lr2/y3;", "Lk3/p1;", "color", "<init>", "(ZFLr2/y3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/j;", "interactionSource", "Lq1/d0;", "b", "(Lu1/j;Lr2/l;I)Lq1/d0;", "Ln2/d;", "rippleAlpha", "Landroidx/compose/material/ripple/d;", "c", "(Lu1/j;ZFLr2/y3;Lr2/y3;Lr2/l;I)Landroidx/compose/material/ripple/d;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", Gender.FEMALE, "Lr2/y3;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y3<p1> color;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92657n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f92658o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.j f92659p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.ripple.d f92660q;

        /* JADX INFO: renamed from: n2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C1979a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material.ripple.d f92661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f92662b;

            C1979a(androidx.compose.material.ripple.d dVar, CoroutineScope coroutineScope) {
                this.f92661a = dVar;
                this.f92662b = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(u1.i iVar, Continuation<? super h0> continuation) {
                if (iVar instanceof u1.n.b) {
                    this.f92661a.b((u1.n.b) iVar, this.f92662b);
                } else if (iVar instanceof u1.n.c) {
                    this.f92661a.d(((u1.n.c) iVar).getPress());
                } else if (iVar instanceof u1.n.a) {
                    this.f92661a.d(((u1.n.a) iVar).getPress());
                } else {
                    this.f92661a.e(iVar, this.f92662b);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u1.j jVar, androidx.compose.material.ripple.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f92659p = jVar;
            this.f92660q = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f92659p, this.f92660q, continuation);
            aVar.f92658o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92657n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f92658o;
                Flow<u1.i> flowC = this.f92659p.c();
                C1979a c1979a = new C1979a(this.f92660q, coroutineScope);
                this.f92657n = 1;
                if (flowC.collect(c1979a, this) == coroutine_suspended) {
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

    public /* synthetic */ c(boolean z11, float f11, y3 y3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, y3Var);
    }

    @Override // q1.c0
    @jn0.e
    public final d0 b(u1.j jVar, p020r2.l lVar, int i11) {
        long jB;
        lVar.o(988743187);
        if (p020r2.o.J()) {
            p020r2.o.S(988743187, i11, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        m mVar = (m) lVar.U(n.d());
        if (this.color.getValue().getValue() != 16) {
            lVar.o(-303571590);
            lVar.l();
            jB = this.color.getValue().getValue();
        } else {
            lVar.o(-303521246);
            jB = mVar.b(lVar, 0);
            lVar.l();
        }
        y3<p1> y3VarO = n3.o(p1.l(jB), lVar, 0);
        y3<RippleAlpha> y3VarO2 = n3.o(mVar.a(lVar, 0), lVar, 0);
        int i12 = i11 & 14;
        androidx.compose.material.ripple.d dVarC = c(jVar, this.bounded, this.radius, y3VarO, y3VarO2, lVar, i12 | ((i11 << 12) & 458752));
        boolean zK = lVar.K(dVarC) | (((i12 ^ 6) > 4 && lVar.n(jVar)) || (i11 & 6) == 4);
        Object objI = lVar.I();
        if (zK || objI == p020r2.l.INSTANCE.a()) {
            objI = new a(jVar, dVarC, null);
            lVar.B(objI);
        }
        Function0.f(dVarC, jVar, (wn0.p) objI, lVar, (i11 << 3) & 112);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return dVarC;
    }

    public abstract androidx.compose.material.ripple.d c(u1.j jVar, boolean z11, float f11, y3<p1> y3Var, y3<RippleAlpha> y3Var2, p020r2.l lVar, int i11);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return this.bounded == cVar.bounded && w4.h.i(this.radius, cVar.radius) && s.f(this.color, cVar.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + w4.h.j(this.radius)) * 31) + this.color.hashCode();
    }

    private c(boolean z11, float f11, y3<p1> y3Var) {
        this.bounded = z11;
        this.radius = f11;
        this.color = y3Var;
    }
}
