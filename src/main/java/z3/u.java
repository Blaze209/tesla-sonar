package z3;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ]\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lz3/u;", "Lz3/k0;", "Lz3/r;", "intrinsicMeasureScope", "Lw4/t;", "layoutDirection", "<init>", "(Lz3/r;Lw4/t;)V", "Lw4/h;", "", "i1", "(F)I", "Lw4/v;", "Q1", "(J)I", "p", "(J)F", "", "x", "(F)F", "w", "(I)F", "Lj3/m;", "Lw4/k;", "o", "(J)J", "O1", "m1", "C", "E", "(F)J", "s", Snapshot.WIDTH, Snapshot.HEIGHT, "", "Lz3/a;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "Ljn0/h0;", "rulers", "Lz3/w0$a;", "placementBlock", "Lz3/j0;", "Y", "(IILjava/util/Map;Lwn0/l;Lwn0/l;)Lz3/j0;", "a", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "getDensity", "()F", "density", "M1", "fontScale", "", "d1", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements k0, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w4.t layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r f126789b;

    public u(r rVar, w4.t tVar) {
        this.layoutDirection = tVar;
        this.f126789b = rVar;
    }

    @Override // w4.d
    public long C(long j11) {
        return this.f126789b.C(j11);
    }

    @Override // w4.l
    public long E(float f11) {
        return this.f126789b.E(f11);
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.f126789b.getFontScale();
    }

    @Override // w4.d
    public float O1(float f11) {
        return this.f126789b.O1(f11);
    }

    @Override // w4.d
    public int Q1(long j11) {
        return this.f126789b.Q1(j11);
    }

    @Override // z3.k0
    public j0 Y(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super c1, jn0.h0> rulers, wn0.l<? super w0.a, jn0.h0> placementBlock) {
        boolean z11 = false;
        int iF = bo0.n.f(width, 0);
        int iF2 = bo0.n.f(height, 0);
        if ((iF & (-16777216)) == 0 && ((-16777216) & iF2) == 0) {
            z11 = true;
        }
        if (!z11) {
            y3.a.b("Size(" + iF + " x " + iF2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(iF, iF2, alignmentLines, rulers);
    }

    @Override // z3.r
    public boolean d1() {
        return this.f126789b.d1();
    }

    @Override // w4.d
    public float getDensity() {
        return this.f126789b.getDensity();
    }

    @Override // z3.r
    public w4.t getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // w4.d
    public int i1(float f11) {
        return this.f126789b.i1(f11);
    }

    @Override // w4.d
    public float m1(long j11) {
        return this.f126789b.m1(j11);
    }

    @Override // w4.d
    public long o(long j11) {
        return this.f126789b.o(j11);
    }

    @Override // w4.l
    public float p(long j11) {
        return this.f126789b.p(j11);
    }

    @Override // w4.d
    public long s(float f11) {
        return this.f126789b.s(f11);
    }

    @Override // w4.d
    public float w(int i11) {
        return this.f126789b.w(i11);
    }

    @Override // w4.d
    public float x(float f11) {
        return this.f126789b.x(f11);
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"z3/u$a", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "getWidth", "()I", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "q", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "g", "()Lwn0/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f126790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f126791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<z3.a, Integer> f126792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<c1, jn0.h0> f126793d;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i11, int i12, Map<z3.a, Integer> map, wn0.l<? super c1, jn0.h0> lVar) {
            this.f126790a = i11;
            this.f126791b = i12;
            this.f126792c = map;
            this.f126793d = lVar;
        }

        @Override // z3.j0
        public wn0.l<c1, jn0.h0> g() {
            return this.f126793d;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getF126791b() {
            return this.f126791b;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getF126790a() {
            return this.f126790a;
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.f126792c;
        }

        @Override // z3.j0
        public void k() {
        }
    }
}
