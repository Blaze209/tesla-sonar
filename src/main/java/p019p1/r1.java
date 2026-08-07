package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w4.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010-\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b \u00100\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0006*\u0002018F¢\u0006\u0006\u001a\u0004\b\u0016\u00102\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0006*\u0002038F¢\u0006\u0006\u001a\u0004\b#\u00104\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0006*\u0002058F¢\u0006\u0006\u001a\u0004\b&\u00106\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u0006*\u0002078F¢\u0006\u0006\u001a\u0004\b\u001a\u00108\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u0006*\u0002098F¢\u0006\u0006\u001a\u0004\b\u0013\u0010:\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u0006*\u00020;8F¢\u0006\u0006\u001a\u0004\b*\u0010<\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u0006*\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"T", "Lp1/q;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lp1/p1;", "a", "(Lwn0/l;Lwn0/l;)Lp1/p1;", "", "start", "stop", "fraction", "k", "(FFF)F", "Lp1/m;", "Lp1/p1;", "FloatToVector", "", "b", "IntToVector", "Lw4/h;", "c", "DpToVector", "Lw4/j;", "Lp1/n;", DateTokenConverter.CONVERTER_KEY, "DpOffsetToVector", "Lj3/m;", "e", "SizeToVector", "Lj3/g;", "f", "OffsetToVector", "Lw4/n;", "g", "IntOffsetToVector", "Lw4/r;", "h", "IntSizeToVector", "Lj3/i;", "Lp1/p;", IntegerTokenConverter.CONVERTER_KEY, "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/l;)Lp1/p1;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/r;)Lp1/p1;", "Lj3/i$a;", "(Lj3/i$a;)Lp1/p1;", "Lw4/h$a;", "(Lw4/h$a;)Lp1/p1;", "Lw4/j$a;", "(Lw4/j$a;)Lp1/p1;", "Lj3/m$a;", "(Lj3/m$a;)Lp1/p1;", "Lj3/g$a;", "(Lj3/g$a;)Lp1/p1;", "Lw4/n$a;", "(Lw4/n$a;)Lp1/p1;", "Lw4/r$a;", "j", "(Lw4/r$a;)Lp1/p1;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p1<Float, p019p1.m> f100583a = a(e.f100596c, f.f100597c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p1<Integer, p019p1.m> f100584b = a(k.f100602c, l.f100603c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p1<w4.h, p019p1.m> f100585c = a(c.f100594c, d.f100595c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p1<w4.j, p019p1.n> f100586d = a(a.f100592c, b.f100593c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p1<j3.m, p019p1.n> f100587e = a(q.f100608c, r.f100609c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p1<j3.g, p019p1.n> f100588f = a(m.f100604c, n.f100605c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p1<w4.n, p019p1.n> f100589g = a(g.f100598c, h.f100599c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p1<w4.r, p019p1.n> f100590h = a(i.f100600c, j.f100601c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p1<j3.i, p019p1.p> f100591i = a(o.f100606c, p.f100607c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/j;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<w4.j, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f100592c = new a();

        a() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(w4.j.e(j11), w4.j.f(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(w4.j jVar) {
            return a(jVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lw4/j;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<p019p1.n, w4.j> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f100593c = new b();

        b() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return w4.i.a(w4.h.g(nVar.getV1()), w4.h.g(nVar.getV2()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.j invoke(p019p1.n nVar) {
            return w4.j.a(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/h;", "it", "Lp1/m;", "a", "(F)Lp1/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<w4.h, p019p1.m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f100594c = new c();

        c() {
            super(1);
        }

        public final p019p1.m a(float f11) {
            return new p019p1.m(f11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.m invoke(w4.h hVar) {
            return a(hVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/m;", "it", "Lw4/h;", "a", "(Lp1/m;)F"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<p019p1.m, w4.h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f100595c = new d();

        d() {
            super(1);
        }

        public final float a(p019p1.m mVar) {
            return w4.h.g(mVar.getValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.h invoke(p019p1.m mVar) {
            return w4.h.d(a(mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/m;", "a", "(F)Lp1/m;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<Float, p019p1.m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f100596c = new e();

        e() {
            super(1);
        }

        public final p019p1.m a(float f11) {
            return new p019p1.m(f11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.m invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/m;", "it", "", "a", "(Lp1/m;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<p019p1.m, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f100597c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(p019p1.m mVar) {
            return Float.valueOf(mVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/n;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.l<w4.n, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f100598c = new g();

        g() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(w4.n.h(j11), w4.n.i(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(w4.n nVar) {
            return a(nVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lw4/n;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.l<p019p1.n, w4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f100599c = new h();

        h() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return w4.o.a(Math.round(nVar.getV1()), Math.round(nVar.getV2()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(p019p1.n nVar) {
            return w4.n.b(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<w4.r, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f100600c = new i();

        i() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(w4.r.g(j11), w4.r.f(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(w4.r rVar) {
            return a(rVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lw4/r;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.l<p019p1.n, w4.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f100601c = new j();

        j() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return s.a(bo0.n.f(Math.round(nVar.getV1()), 0), bo0.n.f(Math.round(nVar.getV2()), 0));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.r invoke(p019p1.n nVar) {
            return w4.r.b(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/m;", "a", "(I)Lp1/m;"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements wn0.l<Integer, p019p1.m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f100602c = new k();

        k() {
            super(1);
        }

        public final p019p1.m a(int i11) {
            return new p019p1.m(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/m;", "it", "", "a", "(Lp1/m;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class l extends u implements wn0.l<p019p1.m, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f100603c = new l();

        l() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(p019p1.m mVar) {
            return Integer.valueOf((int) mVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class m extends u implements wn0.l<j3.g, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f100604c = new m();

        m() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(j3.g.m(j11), j3.g.n(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(j3.g gVar) {
            return a(gVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lj3/g;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends u implements wn0.l<p019p1.n, j3.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f100605c = new n();

        n() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return j3.h.a(nVar.getV1(), nVar.getV2());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ j3.g invoke(p019p1.n nVar) {
            return j3.g.d(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/i;", "it", "Lp1/p;", "a", "(Lj3/i;)Lp1/p;"}, k = 3, mv = {1, 8, 0})
    static final class o extends u implements wn0.l<j3.i, p019p1.p> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f100606c = new o();

        o() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p019p1.p invoke(j3.i iVar) {
            return new p019p1.p(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/p;", "it", "Lj3/i;", "a", "(Lp1/p;)Lj3/i;"}, k = 3, mv = {1, 8, 0})
    static final class p extends u implements wn0.l<p019p1.p, j3.i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f100607c = new p();

        p() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j3.i invoke(p019p1.p pVar) {
            return new j3.i(pVar.getV1(), pVar.getV2(), pVar.getV3(), pVar.getV4());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/m;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class q extends u implements wn0.l<j3.m, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f100608c = new q();

        q() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(j3.m.k(j11), j3.m.i(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(j3.m mVar) {
            return a(mVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lj3/m;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class r extends u implements wn0.l<p019p1.n, j3.m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f100609c = new r();

        r() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return j3.n.a(nVar.getV1(), nVar.getV2());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ j3.m invoke(p019p1.n nVar) {
            return j3.m.c(a(nVar));
        }
    }

    public static final <T, V extends p019p1.q> p1<T, V> a(wn0.l<? super T, ? extends V> lVar, wn0.l<? super V, ? extends T> lVar2) {
        return new q1(lVar, lVar2);
    }

    public static final p1<j3.g, p019p1.n> b(j3.g.Companion companion) {
        return f100588f;
    }

    public static final p1<j3.i, p019p1.p> c(j3.i.Companion companion) {
        return f100591i;
    }

    public static final p1<j3.m, p019p1.n> d(j3.m.Companion companion) {
        return f100587e;
    }

    public static final p1<Float, p019p1.m> e(p013kotlin.jvm.internal.l lVar) {
        return f100583a;
    }

    public static final p1<Integer, p019p1.m> f(p013kotlin.jvm.internal.r rVar) {
        return f100584b;
    }

    public static final p1<w4.h, p019p1.m> g(w4.h.Companion companion) {
        return f100585c;
    }

    public static final p1<w4.j, p019p1.n> h(w4.j.Companion companion) {
        return f100586d;
    }

    public static final p1<w4.n, p019p1.n> i(w4.n.Companion companion) {
        return f100589g;
    }

    public static final p1<w4.r, p019p1.n> j(w4.r.Companion companion) {
        return f100590h;
    }

    public static final float k(float f11, float f12, float f13) {
        return (f11 * (1 - f13)) + (f12 * f13);
    }
}
