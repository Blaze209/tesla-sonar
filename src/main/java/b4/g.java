package b4;

import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\ba\u0018\u0000 .2\u00020\u0001:\u0001/R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lb4/g;", "", "Lz3/i0;", "getMeasurePolicy", "()Lz3/i0;", "g", "(Lz3/i0;)V", "measurePolicy", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "c", "(Lw4/t;)V", "layoutDirection", "Lw4/d;", "getDensity", "()Lw4/d;", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)V", "density", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)V", "modifier", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "j", "(Landroidx/compose/ui/platform/e3;)V", "viewConfiguration", "Lr2/x;", "getCompositionLocalMap", "()Lr2/x;", "h", "(Lr2/x;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "e", "(I)V", "getCompositeKeyHash$annotations", "()V", "compositeKeyHash", "m1", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16054a;

    /* JADX INFO: renamed from: b4.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R)\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R)\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0013R)\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0013R2\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0012\u0012\u0004\b)\u0010\u0003\u001a\u0004\b\u0006\u0010\u0013¨\u0006+"}, d2 = {"Lb4/g$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Lb4/g;", "b", "Lwn0/a;", "a", "()Lwn0/a;", "Constructor", "c", "getVirtualConstructor", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/d;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "()Lwn0/p;", "SetModifier", "Lw4/d;", "e", "getSetDensity", "SetDensity", "Lr2/x;", "f", "SetResolvedCompositionLocals", "Lz3/i0;", "g", "SetMeasurePolicy", "Lw4/t;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/e3;", IntegerTokenConverter.CONVERTER_KEY, "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash$annotations", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16054a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final wn0.a<g> Constructor = g0.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final wn0.a<g> VirtualConstructor = h.f16071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, androidx.compose.ui.d, jn0.h0> SetModifier = e.f16068c;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, w4.d, jn0.h0> SetDensity = b.f16065c;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, p020r2.x, jn0.h0> SetResolvedCompositionLocals = f.f16069c;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, z3.i0, jn0.h0> SetMeasurePolicy = d.f16067c;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, w4.t, jn0.h0> SetLayoutDirection = c.f16066c;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, e3, jn0.h0> SetViewConfiguration = C0307g.f16070c;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final wn0.p<g, Integer, jn0.h0> SetCompositeKeyHash = C0306a.f16064c;

        /* JADX INFO: renamed from: b4.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "", "it", "Ljn0/h0;", "a", "(Lb4/g;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C0306a extends p013kotlin.jvm.internal.u implements wn0.p<g, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0306a f16064c = new C0306a();

            C0306a() {
                super(2);
            }

            public final void a(g gVar, int i11) {
                gVar.e(i11);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, Integer num) {
                a(gVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$b */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Lw4/d;", "it", "Ljn0/h0;", "a", "(Lb4/g;Lw4/d;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.p<g, w4.d, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f16065c = new b();

            b() {
                super(2);
            }

            public final void a(g gVar, w4.d dVar) {
                gVar.d(dVar);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, w4.d dVar) {
                a(gVar, dVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$c */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Lw4/t;", "it", "Ljn0/h0;", "a", "(Lb4/g;Lw4/t;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.p<g, w4.t, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f16066c = new c();

            c() {
                super(2);
            }

            public final void a(g gVar, w4.t tVar) {
                gVar.c(tVar);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, w4.t tVar) {
                a(gVar, tVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$d */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Lz3/i0;", "it", "Ljn0/h0;", "a", "(Lb4/g;Lz3/i0;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.p<g, z3.i0, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f16067c = new d();

            d() {
                super(2);
            }

            public final void a(g gVar, z3.i0 i0Var) {
                gVar.g(i0Var);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, z3.i0 i0Var) {
                a(gVar, i0Var);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Landroidx/compose/ui/d;", "it", "Ljn0/h0;", "a", "(Lb4/g;Landroidx/compose/ui/d;)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends p013kotlin.jvm.internal.u implements wn0.p<g, androidx.compose.ui.d, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f16068c = new e();

            e() {
                super(2);
            }

            public final void a(g gVar, androidx.compose.ui.d dVar) {
                gVar.i(dVar);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, androidx.compose.ui.d dVar) {
                a(gVar, dVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$f */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Lr2/x;", "it", "Ljn0/h0;", "a", "(Lb4/g;Lr2/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class f extends p013kotlin.jvm.internal.u implements wn0.p<g, p020r2.x, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f16069c = new f();

            f() {
                super(2);
            }

            public final void a(g gVar, p020r2.x xVar) {
                gVar.h(xVar);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, p020r2.x xVar) {
                a(gVar, xVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$g, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g;", "Landroidx/compose/ui/platform/e3;", "it", "Ljn0/h0;", "a", "(Lb4/g;Landroidx/compose/ui/platform/e3;)V"}, k = 3, mv = {1, 8, 0})
        static final class C0307g extends p013kotlin.jvm.internal.u implements wn0.p<g, e3, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0307g f16070c = new C0307g();

            C0307g() {
                super(2);
            }

            public final void a(g gVar, e3 e3Var) {
                gVar.j(e3Var);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g gVar, e3 e3Var) {
                a(gVar, e3Var);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b4.g$a$h */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb4/g0;", "b", "()Lb4/g0;"}, k = 3, mv = {1, 8, 0})
        static final class h extends p013kotlin.jvm.internal.u implements wn0.a<g0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f16071c = new h();

            h() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g0 invoke() {
                return new g0(true, 0, 2, null);
            }
        }

        private Companion() {
        }

        public final wn0.a<g> a() {
            return Constructor;
        }

        public final wn0.p<g, Integer, jn0.h0> b() {
            return SetCompositeKeyHash;
        }

        public final wn0.p<g, z3.i0, jn0.h0> c() {
            return SetMeasurePolicy;
        }

        public final wn0.p<g, androidx.compose.ui.d, jn0.h0> d() {
            return SetModifier;
        }

        public final wn0.p<g, p020r2.x, jn0.h0> e() {
            return SetResolvedCompositionLocals;
        }
    }

    void c(w4.t tVar);

    void d(w4.d dVar);

    void e(int i11);

    void g(z3.i0 i0Var);

    void h(p020r2.x xVar);

    void i(androidx.compose.ui.d dVar);

    void j(e3 e3Var);
}
