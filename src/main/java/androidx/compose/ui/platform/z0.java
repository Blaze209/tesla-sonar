package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\"\u0010\u0012\"\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b%\u0010\u0012\"\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b(\u0010\u0012\"&\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0010\u0012\u0004\b,\u0010\u0018\u001a\u0004\b+\u0010\u0012\"\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b/\u0010\u0012\"\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b2\u0010\u0012\"\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002040\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002070\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b8\u0010\u0012\"(\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u0010\u0012\u0004\b<\u0010\u0018\u001a\u0004\b;\u0010\u0012\"\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012\"\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010\u0010\u001a\u0004\bD\u0010\u0012\"\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010\u0010\u001a\u0004\bG\u0010\u0012\"\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010\u0010\u001a\u0004\bJ\u0010\u0012\"\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020L0\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\bM\u0010\u0012\"\"\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010\u0010\u001a\u0004\b?\u0010\u0012\" \u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bC\u0010\u0012\"\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0S8F¢\u0006\u0006\u001a\u0004\bF\u0010T¨\u0006V"}, d2 = {"Lb4/j1;", "owner", "Landroidx/compose/ui/platform/x2;", "uriHandler", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lb4/j1;Landroidx/compose/ui/platform/x2;Lwn0/p;Lr2/l;I)V", "", "name", "", "w", "(Ljava/lang/String;)Ljava/lang/Void;", "Lr2/g2;", "Landroidx/compose/ui/platform/i;", "Lr2/g2;", "c", "()Lr2/g2;", "LocalAccessibilityManager", "Le3/g;", "b", DateTokenConverter.CONVERTER_KEY, "getLocalAutofill$annotations", "()V", "LocalAutofill", "Le3/l;", "e", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/x0;", "f", "LocalClipboardManager", "Lk3/g3;", "j", "LocalGraphicsContext", "Lw4/d;", "g", "LocalDensity", "Li3/f;", "h", "LocalFocusManager", "Ln4/p$b;", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Ln4/q$b;", IntegerTokenConverter.CONVERTER_KEY, "LocalFontFamilyResolver", "Lr3/a;", "k", "LocalHapticFeedback", "Ls3/b;", "l", "LocalInputModeManager", "Lw4/t;", "m", "LocalLayoutDirection", "Lo4/q0;", "r", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/r2;", "n", "q", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/u2;", "o", "s", "LocalTextToolbar", "p", "t", "LocalUriHandler", "Landroidx/compose/ui/platform/e3;", "u", "LocalViewConfiguration", "Landroidx/compose/ui/platform/m3;", "v", "LocalWindowInfo", "Lv3/u;", "LocalPointerIconService", "", "LocalProvidableScrollCaptureInProgress", "Lr2/u;", "()Lr2/u;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2<androidx.compose.ui.platform.i> f6089a = p020r2.w.f(a.f6109c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p020r2.g2<e3.g> f6090b = p020r2.w.f(b.f6110c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p020r2.g2<e3.l> f6091c = p020r2.w.f(c.f6111c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p020r2.g2<x0> f6092d = p020r2.w.f(d.f6112c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p020r2.g2<k3.g3> f6093e = p020r2.w.f(i.f6117c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p020r2.g2<w4.d> f6094f = p020r2.w.f(e.f6113c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p020r2.g2<i3.f> f6095g = p020r2.w.f(f.f6114c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p020r2.g2<n4.p.b> f6096h = p020r2.w.f(h.f6116c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p020r2.g2<n4.q.b> f6097i = p020r2.w.f(g.f6115c);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p020r2.g2<r3.a> f6098j = p020r2.w.f(j.f6118c);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p020r2.g2<s3.b> f6099k = p020r2.w.f(k.f6119c);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p020r2.g2<w4.t> f6100l = p020r2.w.f(l.f6120c);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p020r2.g2<o4.q0> f6101m = p020r2.w.f(p.f6124c);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p020r2.g2<r2> f6102n = p020r2.w.f(o.f6123c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final p020r2.g2<u2> f6103o = p020r2.w.f(q.f6125c);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p020r2.g2<x2> f6104p = p020r2.w.f(r.f6126c);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p020r2.g2<e3> f6105q = p020r2.w.f(s.f6127c);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p020r2.g2<m3> f6106r = p020r2.w.f(t.f6128c);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p020r2.g2<v3.u> f6107s = p020r2.w.f(m.f6121c);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p020r2.g2<Boolean> f6108t = p020r2.w.d(null, n.f6122c, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/i;", "b", "()Landroidx/compose/ui/platform/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<androidx.compose.ui.platform.i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6109c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.i invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le3/g;", "b", "()Le3/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<e3.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f6110c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e3.g invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le3/l;", "b", "()Le3/l;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<e3.l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f6111c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e3.l invoke() {
            z0.w("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/x0;", "b", "()Landroidx/compose/ui/platform/x0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<x0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f6112c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x0 invoke() {
            z0.w("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/d;", "b", "()Lw4/d;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<w4.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f6113c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w4.d invoke() {
            z0.w("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li3/f;", "b", "()Li3/f;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<i3.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f6114c = new f();

        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i3.f invoke() {
            z0.w("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln4/q$b;", "b", "()Ln4/q$b;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<n4.q.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f6115c = new g();

        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n4.q.b invoke() {
            z0.w("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln4/p$b;", "b", "()Ln4/p$b;"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<n4.p.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f6116c = new h();

        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n4.p.b invoke() {
            z0.w("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk3/g3;", "b", "()Lk3/g3;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<k3.g3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f6117c = new i();

        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k3.g3 invoke() {
            z0.w("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr3/a;", "b", "()Lr3/a;"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<r3.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f6118c = new j();

        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r3.a invoke() {
            z0.w("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls3/b;", "b", "()Ls3/b;"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.a<s3.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f6119c = new k();

        k() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s3.b invoke() {
            z0.w("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/t;", "b", "()Lw4/t;"}, k = 3, mv = {1, 8, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.a<w4.t> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f6120c = new l();

        l() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w4.t invoke() {
            z0.w("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv3/u;", "b", "()Lv3/u;"}, k = 3, mv = {1, 8, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.a<v3.u> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f6121c = new m();

        m() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v3.u invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f6122c = new n();

        n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/r2;", "b", "()Landroidx/compose/ui/platform/r2;"}, k = 3, mv = {1, 8, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.a<r2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f6123c = new o();

        o() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r2 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo4/q0;", "b", "()Lo4/q0;"}, k = 3, mv = {1, 8, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.a<o4.q0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f6124c = new p();

        p() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o4.q0 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/u2;", "b", "()Landroidx/compose/ui/platform/u2;"}, k = 3, mv = {1, 8, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f6125c = new q();

        q() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u2 invoke() {
            z0.w("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/x2;", "b", "()Landroidx/compose/ui/platform/x2;"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<x2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f6126c = new r();

        r() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x2 invoke() {
            z0.w("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/e3;", "b", "()Landroidx/compose/ui/platform/e3;"}, k = 3, mv = {1, 8, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.a<e3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f6127c = new s();

        s() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e3 invoke() {
            z0.w("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/m3;", "b", "()Landroidx/compose/ui/platform/m3;"}, k = 3, mv = {1, 8, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.a<m3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f6128c = new t();

        t() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m3 invoke() {
            z0.w("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class u extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b4.j1 f6129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x2 f6130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f6131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(b4.j1 j1Var, x2 x2Var, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar, int i11) {
            super(2);
            this.f6129c = j1Var;
            this.f6130d = x2Var;
            this.f6131e = pVar;
            this.f6132f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            z0.a(this.f6129c, this.f6130d, this.f6131e, lVar, p020r2.k2.a(this.f6132f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(b4.j1 j1Var, x2 x2Var, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(874662829);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(j1Var) : lVarV.K(j1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? lVarV.n(x2Var) : lVarV.K(x2Var) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(874662829, i12, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            p020r2.w.b(new p020r2.h2[]{f6089a.d(j1Var.getAccessibilityManager()), f6090b.d(j1Var.getAutofill()), f6091c.d(j1Var.getAutofillTree()), f6092d.d(j1Var.getClipboardManager()), f6094f.d(j1Var.getDensity()), f6095g.d(j1Var.getFocusOwner()), f6096h.e(j1Var.getFontLoader()), f6097i.e(j1Var.getFontFamilyResolver()), f6098j.d(j1Var.getHapticFeedBack()), f6099k.d(j1Var.getInputModeManager()), f6100l.d(j1Var.getLayoutDirection()), f6101m.d(j1Var.getTextInputService()), f6102n.d(j1Var.getSoftwareKeyboardController()), f6103o.d(j1Var.getTextToolbar()), f6104p.d(x2Var), f6105q.d(j1Var.getViewConfiguration()), f6106r.d(j1Var.getWindowInfo()), f6107s.d(j1Var.getPointerIconService()), f6093e.d(j1Var.getGraphicsContext())}, pVar, lVarV, ((i12 >> 3) & 112) | p020r2.h2.f106566i);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new u(j1Var, x2Var, pVar, i11));
        }
    }

    public static final p020r2.g2<androidx.compose.ui.platform.i> c() {
        return f6089a;
    }

    public static final p020r2.g2<e3.g> d() {
        return f6090b;
    }

    public static final p020r2.g2<e3.l> e() {
        return f6091c;
    }

    public static final p020r2.g2<x0> f() {
        return f6092d;
    }

    public static final p020r2.g2<w4.d> g() {
        return f6094f;
    }

    public static final p020r2.g2<i3.f> h() {
        return f6095g;
    }

    public static final p020r2.g2<n4.q.b> i() {
        return f6097i;
    }

    public static final p020r2.g2<k3.g3> j() {
        return f6093e;
    }

    public static final p020r2.g2<r3.a> k() {
        return f6098j;
    }

    public static final p020r2.g2<s3.b> l() {
        return f6099k;
    }

    public static final p020r2.g2<w4.t> m() {
        return f6100l;
    }

    public static final p020r2.g2<v3.u> n() {
        return f6107s;
    }

    public static final p020r2.g2<Boolean> o() {
        return f6108t;
    }

    public static final p020r2.u<Boolean> p() {
        return f6108t;
    }

    public static final p020r2.g2<r2> q() {
        return f6102n;
    }

    public static final p020r2.g2<o4.q0> r() {
        return f6101m;
    }

    public static final p020r2.g2<u2> s() {
        return f6103o;
    }

    public static final p020r2.g2<x2> t() {
        return f6104p;
    }

    public static final p020r2.g2<e3> u() {
        return f6105q;
    }

    public static final p020r2.g2<m3> v() {
        return f6106r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void w(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
