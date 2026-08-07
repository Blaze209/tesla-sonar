package androidx.compose.animation;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p015o1.q;
import p019p1.AnimationResult;
import p019p1.r1;
import p020r2.p1;
import p020r2.s3;
import w4.r;
import wn0.p;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001CB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/R*\u00105\u001a\u00020\f2\u0006\u00101\u001a\u00020\f8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010/\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R/\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/animation/m;", "Lo1/q;", "Lp1/i;", "Lw4/r;", "animationSpec", "Ld3/c;", "alignment", "Lkotlin/Function2;", "Ljn0/h0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lp1/i;Ld3/c;Lwn0/p;)V", "Lw4/b;", "default", "H2", "(J)J", "j2", "()V", "h2", "Lz3/k0;", "Lz3/h0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "targetSize", "x2", "n", "Lp1/i;", "A2", "()Lp1/i;", "E2", "(Lp1/i;)V", "o", "Ld3/c;", "y2", "()Ld3/c;", "C2", "(Ld3/c;)V", "p", "Lwn0/p;", "B2", "()Lwn0/p;", "F2", "(Lwn0/p;)V", "q", "J", "lookaheadSize", "value", "r", "G2", "(J)V", "lookaheadConstraints", "", "s", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/m$a;", "<set-?>", "t", "Lr2/p1;", "z2", "()Landroidx/compose/animation/m$a;", "D2", "(Landroidx/compose/animation/m$a;)V", "animData", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private p019p1.i<r> animationSpec;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private d3.c alignment;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super r, h0> listener;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = f.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = w4.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p1 animData = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.animation.m$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/m$a;", "", "Lp1/a;", "Lw4/r;", "Lp1/n;", "anim", "startSize", "<init>", "(Lp1/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp1/a;", "()Lp1/a;", "b", "J", "()J", "c", "(J)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AnimData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p019p1.a<r, p019p1.n> anim;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private long startSize;

        public /* synthetic */ AnimData(p019p1.a aVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, j11);
        }

        public final p019p1.a<r, p019p1.n> a() {
            return this.anim;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        public final void c(long j11) {
            this.startSize = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return s.f(this.anim, animData.anim) && r.e(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + r.h(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) r.i(this.startSize)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private AnimData(p019p1.a<r, p019p1.n> aVar, long j11) {
            this.anim = aVar;
            this.startSize = j11;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4138n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ AnimData f4139o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f4140p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ m f4141q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AnimData animData, long j11, m mVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4139o = animData;
            this.f4140p = j11;
            this.f4141q = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f4139o, this.f4140p, this.f4141q, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            p<r, r, h0> pVarB2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4138n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a<r, p019p1.n> aVarA = this.f4139o.a();
                r rVarB = r.b(this.f4140p);
                p019p1.i<r> iVarA2 = this.f4141q.A2();
                this.f4138n = 1;
                bVar = this;
                obj = p019p1.a.f(aVarA, rVarB, iVarA2, null, null, bVar, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                bVar = this;
            }
            AnimationResult animationResult = (AnimationResult) obj;
            if (animationResult.getEndReason() == p019p1.e.Finished && (pVarB2 = bVar.f4141q.B2()) != 0) {
                pVarB2.invoke(r.b(bVar.f4139o.getStartSize()), animationResult.b().getValue());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f4146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f4147h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, int i11, int i12, k0 k0Var, w0 w0Var) {
            super(1);
            this.f4143d = j11;
            this.f4144e = i11;
            this.f4145f = i12;
            this.f4146g = k0Var;
            this.f4147h = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.j(aVar, this.f4147h, m.this.getAlignment().a(this.f4143d, w4.s.a(this.f4144e, this.f4145f), this.f4146g.getLayoutDirection()), BitmapDescriptorFactory.HUE_RED, 2, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public m(p019p1.i<r> iVar, d3.c cVar, p<? super r, ? super r, h0> pVar) {
        this.animationSpec = iVar;
        this.alignment = cVar;
        this.listener = pVar;
    }

    private final void G2(long j11) {
        this.lookaheadConstraints = j11;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long H2(long j11) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j11;
    }

    public final p019p1.i<r> A2() {
        return this.animationSpec;
    }

    public final p<r, r, h0> B2() {
        return this.listener;
    }

    public final void C2(d3.c cVar) {
        this.alignment = cVar;
    }

    public final void D2(AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void E2(p019p1.i<r> iVar) {
        this.animationSpec = iVar;
    }

    public final void F2(p<? super r, ? super r, h0> pVar) {
        this.listener = pVar;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0;
        long jF;
        if (k0Var.d1()) {
            G2(j11);
            w0VarX0 = h0Var.x0(j11);
        } else {
            w0VarX0 = h0Var.x0(H2(j11));
        }
        w0 w0Var = w0VarX0;
        long jA = w4.s.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
        if (k0Var.d1()) {
            this.lookaheadSize = jA;
            jF = jA;
        } else {
            jF = w4.c.f(j11, x2(f.d(this.lookaheadSize) ? this.lookaheadSize : jA));
        }
        int iG = r.g(jF);
        int iF = r.f(jF);
        return k0.N1(k0Var, iG, iF, null, new c(jA, iG, iF, k0Var, w0Var), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        super.h2();
        this.lookaheadSize = f.c();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.d.c
    public void j2() {
        super.j2();
        D2(null);
    }

    public final long x2(long targetSize) {
        AnimData animDataZ2 = z2();
        if (animDataZ2 != null) {
            boolean z11 = (r.e(targetSize, animDataZ2.a().m().getPackedValue()) || animDataZ2.a().p()) ? false : true;
            if (!r.e(targetSize, animDataZ2.a().k().getPackedValue()) || z11) {
                animDataZ2.c(animDataZ2.a().m().getPackedValue());
                BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new b(animDataZ2, targetSize, this, null), 3, null);
            }
        } else {
            animDataZ2 = new AnimData(new p019p1.a(r.b(targetSize), r1.j(r.INSTANCE), r.b(w4.s.a(1, 1)), null, 8, null), targetSize, null);
        }
        D2(animDataZ2);
        return animDataZ2.a().m().getPackedValue();
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final d3.c getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData z2() {
        return (AnimData) this.animData.getValue();
    }
}
