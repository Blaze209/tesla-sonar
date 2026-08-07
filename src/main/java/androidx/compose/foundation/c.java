package androidx.compose.foundation;

import b4.e1;
import b4.f1;
import b4.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import k3.a4;
import k3.g4;
import k3.h1;
import k3.p1;
import k3.p3;
import k3.q3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/c;", "Lb4/r;", "Landroidx/compose/ui/d$c;", "Lb4/e1;", "Lk3/p1;", "color", "Lk3/h1;", "brush", "", "alpha", "Lk3/g4;", "shape", "<init>", "(JLk3/h1;FLk3/g4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lm3/c;", "Ljn0/h0;", "y2", "(Lm3/c;)V", "x2", "Lk3/p3;", "z2", "(Lm3/c;)Lk3/p3;", Gender.FEMALE, "g1", "()V", "n", "J", "getColor-0d7_KjU", "()J", "C2", "(J)V", "o", "Lk3/h1;", "getBrush", "()Lk3/h1;", "B2", "(Lk3/h1;)V", "p", "getAlpha", "()F", "a", "(F)V", "q", "Lk3/g4;", "A2", "()Lk3/g4;", "T", "(Lk3/g4;)V", "Lj3/m;", "r", "lastSize", "Lw4/t;", "s", "Lw4/t;", "lastLayoutDirection", "t", "Lk3/p3;", "lastOutline", "u", "lastShape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends androidx.compose.ui.d.c implements r, e1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private h1 brush;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private g4 shape;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lastSize;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private t lastLayoutDirection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private p3 lastOutline;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private g4 lastShape;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<p3> f4253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f4254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m3.c f4255e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<p3> n0Var, c cVar, m3.c cVar2) {
            super(0);
            this.f4253c = n0Var;
            this.f4254d = cVar;
            this.f4255e = cVar2;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, k3.p3] */
        public final void b() {
            this.f4253c.f86529a = this.f4254d.getShape().a(this.f4255e.b(), this.f4255e.getLayoutDirection(), this.f4255e);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public /* synthetic */ c(long j11, h1 h1Var, float f11, g4 g4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, h1Var, f11, g4Var);
    }

    private final void x2(m3.c cVar) {
        m3.c cVar2;
        p3 p3VarZ2 = z2(cVar);
        if (p1.r(this.color, p1.INSTANCE.j())) {
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            q3.d(cVar2, p3VarZ2, this.color, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        }
        h1 h1Var = this.brush;
        if (h1Var != null) {
            q3.b(cVar2, p3VarZ2, h1Var, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void y2(m3.c cVar) {
        if (!p1.r(this.color, p1.INSTANCE.j())) {
            m3.f.C0(cVar, this.color, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
        }
        h1 h1Var = this.brush;
        if (h1Var != null) {
            m3.f.F0(cVar, h1Var, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object, k3.p3] */
    private final p3 z2(m3.c cVar) {
        n0 n0Var = new n0();
        if (j3.m.h(cVar.b(), this.lastSize) && cVar.getLayoutDirection() == this.lastLayoutDirection && s.f(this.lastShape, this.shape)) {
            ?? r11 = this.lastOutline;
            s.h(r11);
            n0Var.f86529a = r11;
        } else {
            f1.a(this, new a(n0Var, this, cVar));
        }
        this.lastOutline = (p3) n0Var.f86529a;
        this.lastSize = cVar.b();
        this.lastLayoutDirection = cVar.getLayoutDirection();
        this.lastShape = this.shape;
        T t11 = n0Var.f86529a;
        s.h(t11);
        return (p3) t11;
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final g4 getShape() {
        return this.shape;
    }

    public final void B2(h1 h1Var) {
        this.brush = h1Var;
    }

    public final void C2(long j11) {
        this.color = j11;
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        if (this.shape == a4.a()) {
            y2(cVar);
        } else {
            x2(cVar);
        }
        cVar.M0();
    }

    public final void T(g4 g4Var) {
        this.shape = g4Var;
    }

    public final void a(float f11) {
        this.alpha = f11;
    }

    @Override // b4.e1
    public void g1() {
        this.lastSize = j3.m.INSTANCE.a();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        b4.s.a(this);
    }

    private c(long j11, h1 h1Var, float f11, g4 g4Var) {
        this.color = j11;
        this.brush = h1Var;
        this.alpha = f11;
        this.shape = g4Var;
        this.lastSize = j3.m.INSTANCE.a();
    }
}
