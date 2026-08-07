package androidx.compose.ui.draw;

import b4.b1;
import b4.e1;
import b4.f1;
import b4.k;
import ezvcard.property.Gender;
import h3.i;
import jn0.h0;
import k3.g3;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.t;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 RB\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\u0002018VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/a;", "Landroidx/compose/ui/d$c;", "Lh3/c;", "Lb4/e1;", "Lh3/b;", "Lh3/d;", "cacheDrawScope", "Lkotlin/Function1;", "Lh3/i;", "block", "<init>", "(Lh3/d;Lwn0/l;)V", "Lm3/c;", "contentDrawScope", "z2", "(Lm3/c;)Lh3/i;", "Ljn0/h0;", "i2", "()V", "A0", "g1", "t1", Gender.FEMALE, "(Lm3/c;)V", "n", "Lh3/d;", "", "o", "Z", "isCacheValid", "Landroidx/compose/ui/draw/e;", "p", "Landroidx/compose/ui/draw/e;", "cachedGraphicsContext", "value", "q", "Lwn0/l;", "x2", "()Lwn0/l;", "A2", "(Lwn0/l;)V", "Lw4/d;", "getDensity", "()Lw4/d;", "density", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "Lj3/m;", "b", "()J", "size", "Lk3/g3;", "y2", "()Lk3/g3;", "graphicsContext", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a extends androidx.compose.ui.d.c implements h3.c, e1, h3.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final h3.d cacheDrawScope;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isCacheValid;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private e cachedGraphicsContext;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l<? super h3.d, i> block;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk3/g3;", "b", "()Lk3/g3;"}, k = 3, mv = {1, 8, 0})
    static final class C0119a extends u implements wn0.a<g3> {
        C0119a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g3 invoke() {
            return a.this.y2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h3.d f5311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h3.d dVar) {
            super(0);
            this.f5311d = dVar;
        }

        public final void b() {
            a.this.x2().invoke(this.f5311d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public a(h3.d dVar, l<? super h3.d, i> lVar) {
        this.cacheDrawScope = dVar;
        this.block = lVar;
        dVar.y(this);
        dVar.F(new C0119a());
    }

    private final i z2(m3.c contentDrawScope) {
        if (!this.isCacheValid) {
            h3.d dVar = this.cacheDrawScope;
            dVar.D(null);
            dVar.B(contentDrawScope);
            f1.a(this, new b(dVar));
            if (dVar.getDrawResult() == null) {
                y3.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.isCacheValid = true;
        }
        i drawResult = this.cacheDrawScope.getDrawResult();
        s.h(drawResult);
        return drawResult;
    }

    @Override // b4.r
    public void A0() {
        t1();
    }

    public final void A2(l<? super h3.d, i> lVar) {
        this.block = lVar;
        t1();
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        z2(cVar).a().invoke(cVar);
    }

    @Override // h3.b
    public long b() {
        return w4.s.d(k.h(this, b1.a(128)).e());
    }

    @Override // b4.e1
    public void g1() {
        t1();
    }

    @Override // h3.b
    public w4.d getDensity() {
        return k.i(this);
    }

    @Override // h3.b
    public t getLayoutDirection() {
        return k.l(this);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        super.i2();
        e eVar = this.cachedGraphicsContext;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // h3.c
    public void t1() {
        e eVar = this.cachedGraphicsContext;
        if (eVar != null) {
            eVar.d();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.D(null);
        b4.s.a(this);
    }

    public final l<h3.d, i> x2() {
        return this.block;
    }

    public final g3 y2() {
        e eVar = this.cachedGraphicsContext;
        if (eVar == null) {
            eVar = new e();
            this.cachedGraphicsContext = eVar;
        }
        if (eVar.getGraphicsContext() == null) {
            eVar.e(k.j(this));
        }
        return eVar;
    }
}
