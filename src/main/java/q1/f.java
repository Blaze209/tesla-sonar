package q1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.SolidColor;
import k3.b1;
import k3.g4;
import k3.h1;
import k3.i3;
import k3.j1;
import k3.j3;
import k3.k3;
import k3.l1;
import k3.o1;
import k3.p1;
import k3.p3;
import k3.q1;
import k3.t3;
import k3.x3;
import m3.Stroke;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u001a\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lq1/f;", "Lb4/m;", "Lw4/h;", "widthParameter", "Lk3/h1;", "brushParameter", "Lk3/g4;", "shapeParameter", "<init>", "(FLk3/h1;Lk3/g4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh3/d;", "brush", "Lk3/p3$a;", "outline", "", "fillArea", "", "strokeWidth", "Lh3/i;", "F2", "(Lh3/d;Lk3/h1;Lk3/p3$a;ZF)Lh3/i;", "Lk3/p3$c;", "Lj3/g;", "topLeft", "Lj3/m;", "borderSize", "G2", "(Lh3/d;Lk3/h1;Lk3/p3$c;JJZF)Lh3/i;", "Lq1/d;", "p", "Lq1/d;", "borderCache", "value", "q", Gender.FEMALE, "J2", "()F", "L2", "(F)V", Snapshot.WIDTH, "r", "Lk3/h1;", "H2", "()Lk3/h1;", "K2", "(Lk3/h1;)V", "s", "Lk3/g4;", "I2", "()Lk3/g4;", "T", "(Lk3/g4;)V", "shape", "Lh3/c;", "t", "Lh3/c;", "drawWithCacheModifierNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends b4.m {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private BorderCache borderCache;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private h1 brush;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private g4 shape;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final h3.c drawWithCacheModifierNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p3.a f104228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1 f104229d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p3.a aVar, h1 h1Var) {
            super(1);
            this.f104228c = aVar;
            this.f104229d = h1Var;
        }

        public final void a(m3.c cVar) {
            cVar.M0();
            m3.f.K1(cVar, this.f104228c.getPath(), this.f104229d, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j3.i f104230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<i3> f104231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f104232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1 f104233f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j3.i iVar, p013kotlin.jvm.internal.n0<i3> n0Var, long j11, q1 q1Var) {
            super(1);
            this.f104230c = iVar;
            this.f104231d = n0Var;
            this.f104232e = j11;
            this.f104233f = q1Var;
        }

        public final void a(m3.c cVar) {
            cVar.M0();
            float left = this.f104230c.getLeft();
            float top = this.f104230c.getTop();
            p013kotlin.jvm.internal.n0<i3> n0Var = this.f104231d;
            long j11 = this.f104232e;
            q1 q1Var = this.f104233f;
            cVar.getDrawContext().getTransform().c(left, top);
            try {
                m3.f.S1(cVar, n0Var.f86529a, 0L, j11, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, q1Var, 0, 0, 890, null);
            } finally {
                cVar.getDrawContext().getTransform().c(-left, -top);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f104234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1 f104235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f104236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f104237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f104238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f104239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f104240i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Stroke f104241j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, h1 h1Var, long j11, float f11, float f12, long j12, long j13, Stroke stroke) {
            super(1);
            this.f104234c = z11;
            this.f104235d = h1Var;
            this.f104236e = j11;
            this.f104237f = f11;
            this.f104238g = f12;
            this.f104239h = j12;
            this.f104240i = j13;
            this.f104241j = stroke;
        }

        public final void a(m3.c cVar) {
            cVar.M0();
            if (this.f104234c) {
                m3.f.B0(cVar, this.f104235d, 0L, 0L, this.f104236e, BitmapDescriptorFactory.HUE_RED, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
                return;
            }
            float fD = j3.a.d(this.f104236e);
            float f11 = this.f104237f;
            if (fD >= f11) {
                m3.f.B0(cVar, this.f104235d, this.f104239h, this.f104240i, q1.e.l(this.f104236e, f11), BitmapDescriptorFactory.HUE_RED, this.f104241j, null, 0, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, null);
                return;
            }
            float f12 = this.f104238g;
            float fK = j3.m.k(cVar.b()) - this.f104238g;
            float fI = j3.m.i(cVar.b()) - this.f104238g;
            int iA = o1.INSTANCE.a();
            h1 h1Var = this.f104235d;
            long j11 = this.f104236e;
            m3.d drawContext = cVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.a().u();
            try {
                drawContext.getTransform().a(f12, f12, fK, fI, iA);
                m3.f.B0(cVar, h1Var, 0L, 0L, j11, BitmapDescriptorFactory.HUE_RED, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
            } finally {
                drawContext.a().o();
                drawContext.f(jB);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t3 f104242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1 f104243d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t3 t3Var, h1 h1Var) {
            super(1);
            this.f104242c = t3Var;
            this.f104243d = h1Var;
        }

        public final void a(m3.c cVar) {
            cVar.M0();
            m3.f.K1(cVar, this.f104242c, this.f104243d, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh3/d;", "Lh3/i;", "a", "(Lh3/d;)Lh3/i;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<h3.d, h3.i> {
        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h3.i invoke(h3.d dVar) {
            if (dVar.O1(f.this.getWidth()) < BitmapDescriptorFactory.HUE_RED || j3.m.j(dVar.b()) <= BitmapDescriptorFactory.HUE_RED) {
                return q1.e.j(dVar);
            }
            float f11 = 2;
            float fMin = Math.min(w4.h.i(f.this.getWidth(), w4.h.INSTANCE.a()) ? 1.0f : (float) Math.ceil(dVar.O1(f.this.getWidth())), (float) Math.ceil(j3.m.j(dVar.b()) / f11));
            float f12 = fMin / f11;
            long jA = j3.h.a(f12, f12);
            long jA2 = j3.n.a(j3.m.k(dVar.b()) - fMin, j3.m.i(dVar.b()) - fMin);
            boolean z11 = f11 * fMin > j3.m.j(dVar.b());
            p3 p3VarA = f.this.getShape().a(dVar.b(), dVar.getLayoutDirection(), dVar);
            if (p3VarA instanceof p3.a) {
                f fVar = f.this;
                return fVar.F2(dVar, fVar.getBrush(), (p3.a) p3VarA, z11, fMin);
            }
            if (p3VarA instanceof p3.c) {
                f fVar2 = f.this;
                return fVar2.G2(dVar, fVar2.getBrush(), (p3.c) p3VarA, jA, jA2, z11, fMin);
            }
            if (p3VarA instanceof p3.b) {
                return q1.e.k(dVar, f.this.getBrush(), jA, jA2, z11, fMin);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ f(float f11, h1 h1Var, g4 g4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, h1Var, g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Type inference failed for: r24v3, types: [T, k3.i3] */
    public final h3.i F2(h3.d dVar, h1 h1Var, p3.a aVar, boolean z11, float f11) throws Throwable {
        int iB;
        q1 q1VarB;
        boolean z12;
        BorderCache borderCache;
        p013kotlin.jvm.internal.n0 n0Var;
        i3 i3Var;
        j1 j1Var;
        float f12;
        float f13;
        m3.d dVar2;
        long j11;
        if (z11) {
            return dVar.q(new a(aVar, h1Var));
        }
        if (h1Var instanceof SolidColor) {
            iB = j3.INSTANCE.a();
            q1VarB = q1.Companion.b(q1.INSTANCE, ((SolidColor) h1Var).getValue(), 0, 2, null);
        } else {
            iB = j3.INSTANCE.b();
            q1VarB = null;
        }
        int i11 = iB;
        j3.i bounds = aVar.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache2 = this.borderCache;
        p013kotlin.jvm.internal.s.h(borderCache2);
        t3 t3VarG = borderCache2.g();
        t3VarG.reset();
        t3.l(t3VarG, bounds, null, 2, null);
        t3VarG.s(t3VarG, aVar.getPath(), x3.INSTANCE.a());
        p013kotlin.jvm.internal.n0 n0Var2 = new p013kotlin.jvm.internal.n0();
        long jA = w4.s.a((int) Math.ceil(bounds.o()), (int) Math.ceil(bounds.h()));
        BorderCache borderCache3 = this.borderCache;
        p013kotlin.jvm.internal.s.h(borderCache3);
        i3 i3Var2 = borderCache3.imageBitmap;
        j1 j1Var2 = borderCache3.canvas;
        j3 j3VarF = i3Var2 != null ? j3.f(i3Var2.b()) : null;
        if (!(j3VarF == null ? false : j3.i(j3VarF.getValue(), j3.INSTANCE.b()))) {
            z12 = j3.h(i11, i3Var2 != null ? j3.f(i3Var2.b()) : null);
        }
        if (i3Var2 == null || j1Var2 == null || j3.m.k(dVar.b()) > i3Var2.getWidth() || j3.m.i(dVar.b()) > i3Var2.getHeight() || !z12) {
            borderCache = borderCache3;
            n0Var = n0Var2;
            i3 i3VarB = k3.b(w4.r.g(jA), w4.r.f(jA), i11, false, null, 24, null);
            borderCache.imageBitmap = i3VarB;
            j1 j1VarA = l1.a(i3VarB);
            borderCache.canvas = j1VarA;
            i3Var = i3VarB;
            j1Var = j1VarA;
        } else {
            borderCache = borderCache3;
            n0Var = n0Var2;
            j1Var = j1Var2;
            i3Var = i3Var2;
        }
        m3.a aVar2 = borderCache.canvasDrawScope;
        if (aVar2 == null) {
            aVar2 = new m3.a();
            borderCache.canvasDrawScope = aVar2;
        }
        m3.a aVar3 = aVar2;
        long jD = w4.s.d(jA);
        w4.t layoutDirection = dVar.getLayoutDirection();
        m3.a.DrawParams drawParams = aVar3.getDrawParams();
        w4.d density = drawParams.getDensity();
        w4.t layoutDirection2 = drawParams.getLayoutDirection();
        j1 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        m3.a.DrawParams drawParams2 = aVar3.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(layoutDirection);
        drawParams2.i(j1Var);
        drawParams2.l(jD);
        j1Var.u();
        long jA2 = p1.INSTANCE.a();
        b1.Companion companion = b1.INSTANCE;
        m3.f.C0(aVar3, jA2, 0L, jD, BitmapDescriptorFactory.HUE_RED, null, null, companion.a(), 58, null);
        float f14 = -bounds.getLeft();
        float f15 = -bounds.getTop();
        aVar3.getDrawContext().getTransform().c(f14, f15);
        try {
            p013kotlin.jvm.internal.n0 n0Var3 = n0Var;
            j1 j1Var3 = j1Var;
            q1 q1Var = q1VarB;
            ?? r24 = i3Var;
            f13 = f15;
            f12 = f14;
            try {
                m3.f.K1(aVar3, aVar.getPath(), h1Var, BitmapDescriptorFactory.HUE_RED, new Stroke(f11 * 2, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 52, null);
                float f16 = 1;
                float fK = (j3.m.k(aVar3.b()) + f16) / j3.m.k(aVar3.b());
                float fI = (j3.m.i(aVar3.b()) + f16) / j3.m.i(aVar3.b());
                long jJ0 = aVar3.J0();
                m3.d drawContext = aVar3.getDrawContext();
                long jB = drawContext.b();
                drawContext.a().u();
                try {
                    drawContext.getTransform().f(fK, fI, jJ0);
                    j11 = jB;
                    try {
                        m3.f.K1(aVar3, t3VarG, h1Var, BitmapDescriptorFactory.HUE_RED, null, null, companion.a(), 28, null);
                        drawContext.a().o();
                        drawContext.f(j11);
                        aVar3.getDrawContext().getTransform().c(-f12, -f13);
                        j1Var3.o();
                        m3.a.DrawParams drawParams3 = aVar3.getDrawParams();
                        drawParams3.j(density);
                        drawParams3.k(layoutDirection2);
                        drawParams3.i(canvas);
                        drawParams3.l(size);
                        r24.a();
                        n0Var3.f86529a = r24;
                        return dVar.q(new b(bounds, n0Var3, jA, q1Var));
                    } catch (Throwable th2) {
                        th = th2;
                        dVar2 = drawContext;
                        dVar2.a().o();
                        dVar2.f(j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar2 = drawContext;
                    j11 = jB;
                }
            } catch (Throwable th4) {
                th = th4;
                aVar3.getDrawContext().getTransform().c(-f12, -f13);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            f12 = f14;
            f13 = f15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h3.i G2(h3.d dVar, h1 h1Var, p3.c cVar, long j11, long j12, boolean z11, float f11) {
        if (j3.l.e(cVar.getRoundRect())) {
            return dVar.q(new c(z11, h1Var, cVar.getRoundRect().getTopLeftCornerRadius(), f11 / 2, f11, j11, j12, new Stroke(f11, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        p013kotlin.jvm.internal.s.h(borderCache);
        return dVar.q(new d(q1.e.i(borderCache.g(), cVar.getRoundRect(), f11, z11), h1Var));
    }

    /* JADX INFO: renamed from: H2, reason: from getter */
    public final h1 getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: I2, reason: from getter */
    public final g4 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void K2(h1 h1Var) {
        if (p013kotlin.jvm.internal.s.f(this.brush, h1Var)) {
            return;
        }
        this.brush = h1Var;
        this.drawWithCacheModifierNode.t1();
    }

    public final void L2(float f11) {
        if (w4.h.i(this.width, f11)) {
            return;
        }
        this.width = f11;
        this.drawWithCacheModifierNode.t1();
    }

    public final void T(g4 g4Var) {
        if (p013kotlin.jvm.internal.s.f(this.shape, g4Var)) {
            return;
        }
        this.shape = g4Var;
        this.drawWithCacheModifierNode.t1();
    }

    private f(float f11, h1 h1Var, g4 g4Var) {
        this.width = f11;
        this.brush = h1Var;
        this.shape = g4Var;
        this.drawWithCacheModifierNode = (h3.c) x2(androidx.compose.ui.draw.b.a(new e()));
    }
}
