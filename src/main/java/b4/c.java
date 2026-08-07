package b4;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.HashSet;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J*\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bG\u0010FJ\u001f\u0010K\u001a\u0004\u0018\u00010I*\u00020H2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bT\u0010PJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u0013R\u0016\u0010g\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR:\u0010t\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030m0lj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030m`n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u001c\u0010Q\u001a\u00020\u007f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0089\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0086\u0001*\b\u0012\u0004\u0012\u00028\u00000m8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Lb4/c;", "Lb4/b0;", "Lb4/r;", "Lb4/s1;", "Lb4/p1;", "La4/h;", "La4/k;", "Lb4/m1;", "Lb4/a0;", "Lb4/t;", "Li3/c;", "Li3/j;", "Li3/n;", "Lb4/k1;", "Lh3/b;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/ui/d$b;", "element", "<init>", "(Landroidx/compose/ui/d$b;)V", "Ljn0/h0;", "D2", "()V", "", "duringAttach", "A2", "(Z)V", "E2", "La4/j;", "G2", "(La4/j;)V", "h2", "i2", "A0", "B2", "F2", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "Lg4/y;", "G0", "(Lg4/y;)V", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "R1", "()Z", "b0", "Lw4/d;", "", "parentData", "G", "(Lw4/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "size", "D", "(J)V", "K", "Li3/o;", "focusState", "y", "(Li3/o;)V", "Landroidx/compose/ui/focus/k;", "focusProperties", "y1", "(Landroidx/compose/ui/focus/k;)V", "", "toString", "()Ljava/lang/String;", "value", "Landroidx/compose/ui/d$b;", "y2", "()Landroidx/compose/ui/d$b;", "C2", "o", "Z", "invalidateCache", "La4/a;", "p", "La4/a;", "_providedValues", "Ljava/util/HashSet;", "La4/c;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "z2", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "r", "Lz3/v;", "lastOnPlacedCoordinates", "getDensity", "()Lw4/d;", "density", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "Lj3/m;", "b", "()J", "La4/g;", "d0", "()La4/g;", "providedValues", "T", "I", "(La4/c;)Ljava/lang/Object;", "current", "u0", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends androidx.compose.ui.d.c implements b0, r, s1, p1, a4.h, a4.k, m1, a0, t, i3.c, i3.j, i3.n, k1, h3.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.d.b element;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private a4.a _providedValues;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private HashSet<a4.c<?>> readValues;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private z3.v lastOnPlacedCoordinates;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        a() {
            super(0);
        }

        public final void b() {
            c.this.F2();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b4/c$b", "Lb4/j1$b;", "Ljn0/h0;", "l", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements j1.b {
        b() {
        }

        @Override // b4.j1.b
        public void l() {
            if (c.this.lastOnPlacedCoordinates == null) {
                c cVar = c.this;
                cVar.K(k.h(cVar, b1.a(128)));
            }
        }
    }

    /* JADX INFO: renamed from: b4.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class C0305c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d.b f16034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f16035d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0305c(androidx.compose.ui.d.b bVar, c cVar) {
            super(0);
            this.f16034c = bVar;
            this.f16035d = cVar;
        }

        public final void b() {
            ((h3.g) this.f16034c).k(this.f16035d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        d() {
            super(0);
        }

        public final void b() {
            androidx.compose.ui.d.b element = c.this.getElement();
            p013kotlin.jvm.internal.s.i(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((a4.d) element).h(c.this);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    public c(androidx.compose.ui.d.b bVar) {
        r2(c1.f(bVar));
        this.element = bVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void A2(boolean duringAttach) {
        if (!getIsAttached()) {
            y3.a.b("initializeModifier called on unattached node");
        }
        androidx.compose.ui.d.b bVar = this.element;
        if ((b1.a(32) & getKindSet()) != 0) {
            if (bVar instanceof a4.d) {
                v2(new a());
            }
            if (bVar instanceof a4.j) {
                G2((a4.j) bVar);
            }
        }
        if ((b1.a(4) & getKindSet()) != 0) {
            if (bVar instanceof h3.g) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                e0.a(this);
            }
        }
        if ((b1.a(2) & getKindSet()) != 0) {
            if (b4.d.e(this)) {
                z0 coordinator = getCoordinator();
                p013kotlin.jvm.internal.s.h(coordinator);
                ((c0) coordinator).H3(this);
                coordinator.X2();
            }
            if (!duringAttach) {
                e0.a(this);
                k.m(this).F0();
            }
        }
        if (bVar instanceof z3.z0) {
            ((z3.z0) bVar).e(k.m(this));
        }
        if ((b1.a(128) & getKindSet()) != 0) {
            if ((bVar instanceof z3.r0) && b4.d.e(this)) {
                k.m(this).F0();
            }
            if (bVar instanceof z3.q0) {
                this.lastOnPlacedCoordinates = null;
                if (b4.d.e(this)) {
                    k.n(this).t(new b());
                }
            }
        }
        if ((b1.a(256) & getKindSet()) != 0 && (bVar instanceof z3.p0) && b4.d.e(this)) {
            k.m(this).F0();
        }
        if (bVar instanceof i3.m) {
            ((i3.m) bVar).f().e().b(this);
        }
        if ((b1.a(16) & getKindSet()) != 0 && (bVar instanceof v3.e0)) {
            ((v3.e0) bVar).getPointerInputFilter().f(getCoordinator());
        }
        if ((b1.a(8) & getKindSet()) != 0) {
            k.n(this).x();
        }
    }

    private final void D2() {
        if (!getIsAttached()) {
            y3.a.b("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.d.b bVar = this.element;
        if ((b1.a(32) & getKindSet()) != 0) {
            if (bVar instanceof a4.j) {
                k.n(this).getModifierLocalManager().d(this, ((a4.j) bVar).getKey());
            }
            if (bVar instanceof a4.d) {
                ((a4.d) bVar).h(b4.d.f16042a);
            }
        }
        if ((b1.a(8) & getKindSet()) != 0) {
            k.n(this).x();
        }
        if (bVar instanceof i3.m) {
            ((i3.m) bVar).f().e().t(this);
        }
    }

    private final void E2() {
        androidx.compose.ui.d.b bVar = this.element;
        if (bVar instanceof h3.g) {
            k.n(this).getSnapshotObserver().i(this, b4.d.f16043b, new C0305c(bVar, this));
        }
        this.invalidateCache = false;
    }

    private final void G2(a4.j<?> element) {
        a4.a aVar = this._providedValues;
        if (aVar != null && aVar.a(element.getKey())) {
            aVar.c(element);
            k.n(this).getModifierLocalManager().f(this, element.getKey());
        } else {
            this._providedValues = new a4.a(element);
            if (b4.d.e(this)) {
                k.n(this).getModifierLocalManager().a(this, element.getKey());
            }
        }
    }

    @Override // b4.r
    public void A0() {
        this.invalidateCache = true;
        s.a(this);
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z3.b0) bVar).B(rVar, qVar, i11);
    }

    public final void B2() {
        this.invalidateCache = true;
        s.a(this);
    }

    public final void C2(androidx.compose.ui.d.b bVar) {
        if (getIsAttached()) {
            D2();
        }
        this.element = bVar;
        r2(c1.f(bVar));
        if (getIsAttached()) {
            A2(false);
        }
    }

    @Override // b4.a0
    public void D(long size) {
        androidx.compose.ui.d.b bVar = this.element;
        if (bVar instanceof z3.r0) {
            ((z3.r0) bVar).D(size);
        }
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        h3.h hVar = (h3.h) bVar;
        if (this.invalidateCache && (bVar instanceof h3.g)) {
            E2();
        }
        hVar.F(cVar);
    }

    public final void F2() {
        if (getIsAttached()) {
            this.readValues.clear();
            k.n(this).getSnapshotObserver().i(this, b4.d.f16044c, new d());
        }
    }

    @Override // b4.m1
    public Object G(w4.d dVar, Object obj) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((z3.t0) bVar).G(dVar, obj);
    }

    @Override // b4.s1
    public void G0(g4.y yVar) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        g4.l lVarL = ((g4.n) bVar).l();
        p013kotlin.jvm.internal.s.i(yVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((g4.l) yVar).d(lVarL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t2.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t2.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // a4.h, a4.k
    public <T> T I(a4.c<T> cVar) {
        x0 nodes;
        this.readValues.add(cVar);
        int iA = b1.a(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = getNode().getParent();
        g0 g0VarM = k.m(this);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        ?? G = parent;
                        ?? bVar = 0;
                        while (G != 0) {
                            if (G instanceof a4.h) {
                                a4.h hVar = (a4.h) G;
                                if (hVar.d0().a(cVar)) {
                                    return (T) hVar.d0().b(cVar);
                                }
                            } else if ((G.getKindSet() & iA) != 0 && (G instanceof m)) {
                                androidx.compose.ui.d.c delegate = ((m) G).getDelegate();
                                int i11 = 0;
                                G = G;
                                bVar = bVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            bVar = bVar;
                                            G = delegate;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (G != 0) {
                                                bVar.b(G);
                                                G = 0;
                                            }
                                            bVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    G = G;
                                    bVar = bVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            G = k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @Override // b4.a0
    public void K(z3.v coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        androidx.compose.ui.d.b bVar = this.element;
        if (bVar instanceof z3.q0) {
            ((z3.q0) bVar).K(coordinates);
        }
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z3.b0) bVar).M(rVar, qVar, i11);
    }

    @Override // b4.t
    public void P(z3.v coordinates) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((z3.p0) bVar).P(coordinates);
    }

    @Override // b4.p1
    public boolean R1() {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((v3.e0) bVar).getPointerInputFilter().c();
    }

    @Override // h3.b
    public long b() {
        return w4.s.d(k.h(this, b1.a(128)).e());
    }

    @Override // b4.p1
    public boolean b0() {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((v3.e0) bVar).getPointerInputFilter().a();
    }

    @Override // b4.b0
    public z3.j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z3.b0) bVar).c(k0Var, h0Var, j11);
    }

    @Override // a4.h
    public a4.g d0() {
        a4.a aVar = this._providedValues;
        return aVar != null ? aVar : a4.i.a();
    }

    @Override // h3.b
    public w4.d getDensity() {
        return k.m(this).getDensity();
    }

    @Override // h3.b
    public w4.t getLayoutDirection() {
        return k.m(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        A2(true);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        D2();
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z3.b0) bVar).n(rVar, qVar, i11);
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z3.b0) bVar).q(rVar, qVar, i11);
    }

    @Override // b4.p1
    public void q0(v3.m pointerEvent, v3.o pass, long bounds) {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v3.e0) bVar).getPointerInputFilter().e(pointerEvent, pass, bounds);
    }

    public String toString() {
        return this.element.toString();
    }

    @Override // b4.k1
    public boolean u0() {
        return getIsAttached();
    }

    @Override // i3.c
    public void y(i3.o focusState) {
        androidx.compose.ui.d.b bVar = this.element;
        if (!(bVar instanceof i3.b)) {
            y3.a.b("onFocusEvent called on wrong node");
        }
        ((i3.b) bVar).y(focusState);
    }

    @Override // b4.p1
    public void y0() {
        androidx.compose.ui.d.b bVar = this.element;
        p013kotlin.jvm.internal.s.i(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v3.e0) bVar).getPointerInputFilter().d();
    }

    @Override // i3.j
    public void y1(androidx.compose.ui.focus.k focusProperties) {
        androidx.compose.ui.d.b bVar = this.element;
        if (!(bVar instanceof i3.h)) {
            y3.a.b("applyFocusProperties called on wrong node");
        }
        ((i3.h) bVar).d(new i3.g(focusProperties));
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final androidx.compose.ui.d.b getElement() {
        return this.element;
    }

    public final HashSet<a4.c<?>> z2() {
        return this.readValues;
    }
}
