package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.util.ArrayList;
import java.util.List;
import k3.Shadow;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.TextGeometricTransform;
import t4.TextIndent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\".\u0010\u001c\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a0\u0019\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\".\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001e\u0010\u001f\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b%\u0010\u0015\u0012\u0004\b&\u0010\u001f\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0015\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0015\"&\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b/\u0010\u0017\"&\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b2\u0010\u0017\"&\u00107\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u0010\u0017\" \u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0015\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0015\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0015\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0015\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0015\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0015\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0015\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010O\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010O\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0015\" \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0015\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010]\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010`\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010b\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010d\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010f\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010h\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010j\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010l\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u0000*\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010n\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010p\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010r\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00020s8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010t¨\u0006u"}, d2 = {"La3/j;", "T", "Original", "Saveable", "value", "saver", "La3/l;", "scope", "", "y", "(Ljava/lang/Object;La3/j;La3/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "Li4/n;", "a", "(Lwn0/p;Lwn0/l;)Li4/n;", "x", "(Ljava/lang/Object;)Ljava/lang/Object;", "Li4/d;", "La3/j;", "h", "()La3/j;", "AnnotatedStringSaver", "", "Li4/d$c;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Li4/v0;", DateTokenConverter.CONVERTER_KEY, "VerbatimTtsAnnotationSaver", "Li4/u0;", "e", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Li4/h$b;", "f", "LinkSaver", "Li4/h$a;", "g", "ClickableSaver", "Li4/u;", IntegerTokenConverter.CONVERTER_KEY, "ParagraphStyleSaver", "Li4/d0;", "v", "SpanStyleSaver", "Li4/n0;", "j", "w", "TextLinkStylesSaver", "Lt4/k;", "k", "TextDecorationSaver", "Lt4/o;", "l", "TextGeometricTransformSaver", "Lt4/q;", "m", "TextIndentSaver", "Ln4/f0;", "n", "FontWeightSaver", "Lt4/a;", "o", "BaselineShiftSaver", "Li4/p0;", "p", "TextRangeSaver", "Lk3/e4;", "q", "ShadowSaver", "Lk3/p1;", "r", "Li4/n;", "ColorSaver", "Lw4/v;", "s", "TextUnitSaver", "Lj3/g;", "t", "OffsetSaver", "Lp4/e;", "u", "LocaleListSaver", "Lp4/d;", "LocaleSaver", "Lt4/k$a;", "(Lt4/k$a;)La3/j;", "Saver", "Lt4/o$a;", "(Lt4/o$a;)La3/j;", "Lt4/q$a;", "(Lt4/q$a;)La3/j;", "Ln4/f0$a;", "(Ln4/f0$a;)La3/j;", "Lt4/a$a;", "(Lt4/a$a;)La3/j;", "Li4/p0$a;", "(Li4/p0$a;)La3/j;", "Lk3/e4$a;", "(Lk3/e4$a;)La3/j;", "Lk3/p1$a;", "(Lk3/p1$a;)La3/j;", "Lw4/v$a;", "(Lw4/v$a;)La3/j;", "Lj3/g$a;", "(Lj3/g$a;)La3/j;", "Lp4/e$a;", "(Lp4/e$a;)La3/j;", "Lp4/d$a;", "(Lp4/d$a;)La3/j;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a3.j<i4.d, Object> f75599a = a3.k.a(a.f75621c, b.f75623c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a3.j<List<i4.d.Range<? extends Object>>, Object> f75600b = a3.k.a(c.f75625c, d.f75627c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a3.j<i4.d.Range<? extends Object>, Object> f75601c = a3.k.a(e.f75629c, f.f75632c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a3.j<VerbatimTtsAnnotation, Object> f75602d = a3.k.a(r0.f75658c, s0.f75660c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a3.j<UrlAnnotation, Object> f75603e = a3.k.a(p0.f75654c, q0.f75656c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a3.j<i4.h.b, Object> f75604f = a3.k.a(o.f75651c, p.f75653c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a3.j<i4.h.a, Object> f75605g = a3.k.a(i.f75639c, j.f75641c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a3.j<ParagraphStyle, Object> f75606h = a3.k.a(x.f75666c, y.f75667c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a3.j<SpanStyle, Object> f75607i = a3.k.a(b0.f75624c, C1577c0.f75626c);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a3.j<i4.n0, Object> f75608j = a3.k.a(j0.f75642c, k0.f75644c);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a3.j<t4.k, Object> f75609k = a3.k.a(d0.f75628c, e0.f75631c);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a3.j<TextGeometricTransform, Object> f75610l = a3.k.a(f0.f75634c, g0.f75636c);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a3.j<TextIndent, Object> f75611m = a3.k.a(h0.f75638c, i0.f75640c);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a3.j<FontWeight, Object> f75612n = a3.k.a(m.f75647c, n.f75649c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a3.j<t4.a, Object> f75613o = a3.k.a(g.f75635c, h.f75637c);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a3.j<i4.p0, Object> f75614p = a3.k.a(l0.f75646c, m0.f75648c);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a3.j<Shadow, Object> f75615q = a3.k.a(z.f75668c, a0.f75622c);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final i4.n<p1, Object> f75616r = a(k.f75643c, l.f75645c);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final i4.n<w4.v, Object> f75617s = a(n0.f75650c, o0.f75652c);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final i4.n<j3.g, Object> f75618t = a(v.f75664c, w.f75665c);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a3.j<LocaleList, Object> f75619u = a3.k.a(q.f75655c, r.f75657c);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a3.j<p4.d, Object> f75620v = a3.k.a(s.f75659c, t.f75661c);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/d;", "it", "", "a", "(La3/l;Li4/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.d, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75621c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, i4.d dVar) {
            return p013kotlin.collections.v.h(c0.x(dVar.getText()), c0.y(dVar.g(), c0.f75600b, lVar), c0.y(dVar.e(), c0.f75600b, lVar), c0.y(dVar.b(), c0.f75600b, lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lk3/e4;", "b", "(Ljava/lang/Object;)Lk3/e4;"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, Shadow> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f75622c = new a0();

        a0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shadow invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            a3.j<p1, Object> jVarL = c0.l(p1.INSTANCE);
            Boolean bool = Boolean.FALSE;
            p1 p1VarA = ((!p013kotlin.jvm.internal.s.f(obj2, bool) || (jVarL instanceof i4.n)) && obj2 != null) ? jVarL.a(obj2) : null;
            p013kotlin.jvm.internal.s.h(p1VarA);
            long value = p1VarA.getValue();
            Object obj3 = list.get(1);
            a3.j<j3.g, Object> jVarK = c0.k(j3.g.INSTANCE);
            j3.g gVarA = ((!p013kotlin.jvm.internal.s.f(obj3, bool) || (jVarK instanceof i4.n)) && obj3 != null) ? jVarK.a(obj3) : null;
            p013kotlin.jvm.internal.s.h(gVarA);
            long packedValue = gVarA.getPackedValue();
            Object obj4 = list.get(2);
            Float f11 = obj4 != null ? (Float) obj4 : null;
            p013kotlin.jvm.internal.s.h(f11);
            return new Shadow(value, packedValue, f11.floatValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/d;", "b", "(Ljava/lang/Object;)Li4/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f75623c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.d invoke(Object obj) {
            List list;
            List list2;
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list3 = (List) obj;
            Object obj2 = list3.get(1);
            a3.j jVar = c0.f75600b;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = ((!p013kotlin.jvm.internal.s.f(obj2, bool) || (jVar instanceof i4.n)) && obj2 != null) ? (List) jVar.a(obj2) : null;
            Object obj3 = list3.get(2);
            a3.j jVar2 = c0.f75600b;
            List list6 = ((!p013kotlin.jvm.internal.s.f(obj3, bool) || (jVar2 instanceof i4.n)) && obj3 != null) ? (List) jVar2.a(obj3) : null;
            Object obj4 = list3.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            p013kotlin.jvm.internal.s.h(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj5 = list3.get(3);
            a3.j jVar3 = c0.f75600b;
            if ((!p013kotlin.jvm.internal.s.f(obj5, bool) || (jVar3 instanceof i4.n)) && obj5 != null) {
                list4 = (List) jVar3.a(obj5);
            }
            return new i4.d(str, list, list2, list4);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/d0;", "it", "", "a", "(La3/l;Li4/d0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, SpanStyle, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f75624c = new b0();

        b0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, SpanStyle d0Var) {
            p1 p1VarL = p1.l(d0Var.g());
            p1.Companion companion = p1.INSTANCE;
            Object objY = c0.y(p1VarL, c0.l(companion), lVar);
            w4.v vVarB = w4.v.b(d0Var.getFontSize());
            w4.v.Companion companion2 = w4.v.INSTANCE;
            return p013kotlin.collections.v.h(objY, c0.y(vVarB, c0.u(companion2), lVar), c0.y(d0Var.getFontWeight(), c0.n(FontWeight.INSTANCE), lVar), c0.x(d0Var.getFontStyle()), c0.x(d0Var.getFontSynthesis()), c0.x(-1), c0.x(d0Var.getFontFeatureSettings()), c0.y(w4.v.b(d0Var.getLetterSpacing()), c0.u(companion2), lVar), c0.y(d0Var.getBaselineShift(), c0.q(t4.a.INSTANCE), lVar), c0.y(d0Var.getTextGeometricTransform(), c0.s(TextGeometricTransform.INSTANCE), lVar), c0.y(d0Var.getLocaleList(), c0.p(LocaleList.INSTANCE), lVar), c0.y(p1.l(d0Var.getBackground()), c0.l(companion), lVar), c0.y(d0Var.getTextDecoration(), c0.r(t4.k.INSTANCE), lVar), c0.y(d0Var.getShadow(), c0.m(Shadow.INSTANCE), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La3/l;", "", "Li4/d$c;", "", "it", "a", "(La3/l;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, List<? extends i4.d.Range<? extends Object>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f75625c = new c();

        c() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, List<? extends i4.d.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c0.y(list.get(i11), c0.f75601c, lVar));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: i4.c0$c0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/d0;", "b", "(Ljava/lang/Object;)Li4/d0;"}, k = 3, mv = {1, 8, 0})
    static final class C1577c0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, SpanStyle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1577c0 f75626c = new C1577c0();

        C1577c0() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 i4.d0, still in use, count: 2, list:
              (r1v1 i4.d0) from 0x00d8: MOVE (r16v2 i4.d0) = (r1v1 i4.d0) (LINE:217)
              (r1v1 i4.d0) from 0x00d0: MOVE (r16v7 i4.d0) = (r1v1 i4.d0) (LINE:209)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.c0.C1577c0.invoke(java.lang.Object):i4.d0");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Li4/d$c;", "b", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<Object, List<? extends i4.d.Range<? extends Object>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f75627c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<i4.d.Range<? extends Object>> invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = list.get(i11);
                a3.j jVar = c0.f75601c;
                i4.d.Range range = null;
                if ((!p013kotlin.jvm.internal.s.f(obj2, Boolean.FALSE) || (jVar instanceof i4.n)) && obj2 != null) {
                    range = (i4.d.Range) jVar.a(obj2);
                }
                p013kotlin.jvm.internal.s.h(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lt4/k;", "it", "", "a", "(La3/l;Lt4/k;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class d0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, t4.k, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f75628c = new d0();

        d0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, t4.k kVar) {
            return Integer.valueOf(kVar.getMask());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/d$c;", "", "it", "a", "(La3/l;Li4/d$c;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.d.Range<? extends Object>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f75629c = new e();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75630a;

            static {
                int[] iArr = new int[i4.f.values().length];
                try {
                    iArr[i4.f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i4.f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i4.f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i4.f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i4.f.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[i4.f.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[i4.f.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f75630a = iArr;
            }
        }

        e() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, i4.d.Range<? extends Object> range) {
            i4.f fVar;
            Object objY;
            Object objE = range.e();
            if (objE instanceof ParagraphStyle) {
                fVar = i4.f.Paragraph;
            } else if (objE instanceof SpanStyle) {
                fVar = i4.f.Span;
            } else if (objE instanceof VerbatimTtsAnnotation) {
                fVar = i4.f.VerbatimTts;
            } else if (objE instanceof UrlAnnotation) {
                fVar = i4.f.Url;
            } else if (objE instanceof i4.h.b) {
                fVar = i4.f.Link;
            } else {
                fVar = objE instanceof i4.h.a ? i4.f.Clickable : i4.f.String;
            }
            switch (a.f75630a[fVar.ordinal()]) {
                case 1:
                    Object objE2 = range.e();
                    p013kotlin.jvm.internal.s.i(objE2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objY = c0.y((ParagraphStyle) objE2, c0.i(), lVar);
                    break;
                case 2:
                    Object objE3 = range.e();
                    p013kotlin.jvm.internal.s.i(objE3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objY = c0.y((SpanStyle) objE3, c0.v(), lVar);
                    break;
                case 3:
                    Object objE4 = range.e();
                    p013kotlin.jvm.internal.s.i(objE4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objY = c0.y((VerbatimTtsAnnotation) objE4, c0.f75602d, lVar);
                    break;
                case 4:
                    Object objE5 = range.e();
                    p013kotlin.jvm.internal.s.i(objE5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objY = c0.y((UrlAnnotation) objE5, c0.f75603e, lVar);
                    break;
                case 5:
                    Object objE6 = range.e();
                    p013kotlin.jvm.internal.s.i(objE6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objY = c0.y((i4.h.b) objE6, c0.f75604f, lVar);
                    break;
                case 6:
                    Object objE7 = range.e();
                    p013kotlin.jvm.internal.s.i(objE7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objY = c0.y((i4.h.a) objE7, c0.f75605g, lVar);
                    break;
                case 7:
                    objY = c0.x(range.e());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return p013kotlin.collections.v.h(c0.x(fVar), objY, c0.x(Integer.valueOf(range.f())), c0.x(Integer.valueOf(range.d())), c0.x(range.getTag()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lt4/k;", "b", "(Ljava/lang/Object;)Lt4/k;"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, t4.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f75631c = new e0();

        e0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t4.k invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            return new t4.k(((Integer) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/d$c;", "b", "(Ljava/lang/Object;)Li4/d$c;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.d.Range<? extends Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f75632c = new f();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75633a;

            static {
                int[] iArr = new int[i4.f.values().length];
                try {
                    iArr[i4.f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i4.f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i4.f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i4.f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i4.f.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[i4.f.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[i4.f.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f75633a = iArr;
            }
        }

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.d.Range<? extends Object> invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle uVarA = null;
            i4.f fVar = obj2 != null ? (i4.f) obj2 : null;
            p013kotlin.jvm.internal.s.h(fVar);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            p013kotlin.jvm.internal.s.h(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            p013kotlin.jvm.internal.s.h(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            p013kotlin.jvm.internal.s.h(str);
            switch (a.f75633a[fVar.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    a3.j<ParagraphStyle, Object> jVarI = c0.i();
                    if ((!p013kotlin.jvm.internal.s.f(obj6, Boolean.FALSE) || (jVarI instanceof i4.n)) && obj6 != null) {
                        uVarA = jVarI.a(obj6);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    a3.j<SpanStyle, Object> jVarV = c0.v();
                    if ((!p013kotlin.jvm.internal.s.f(obj7, Boolean.FALSE) || (jVarV instanceof i4.n)) && obj7 != null) {
                        uVarA = jVarV.a(obj7);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    a3.j jVar = c0.f75602d;
                    if ((!p013kotlin.jvm.internal.s.f(obj8, Boolean.FALSE) || (jVar instanceof i4.n)) && obj8 != null) {
                        uVarA = (VerbatimTtsAnnotation) jVar.a(obj8);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    a3.j jVar2 = c0.f75603e;
                    if ((!p013kotlin.jvm.internal.s.f(obj9, Boolean.FALSE) || (jVar2 instanceof i4.n)) && obj9 != null) {
                        uVarA = (UrlAnnotation) jVar2.a(obj9);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    a3.j jVar3 = c0.f75604f;
                    if ((!p013kotlin.jvm.internal.s.f(obj10, Boolean.FALSE) || (jVar3 instanceof i4.n)) && obj10 != null) {
                        uVarA = (i4.h.b) jVar3.a(obj10);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    a3.j jVar4 = c0.f75605g;
                    if ((!p013kotlin.jvm.internal.s.f(obj11, Boolean.FALSE) || (jVar4 instanceof i4.n)) && obj11 != null) {
                        uVarA = (i4.h.a) jVar4.a(obj11);
                    }
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    uVarA = obj12 != null ? (String) obj12 : null;
                    p013kotlin.jvm.internal.s.h(uVarA);
                    return new i4.d.Range<>(uVarA, iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lt4/o;", "it", "", "a", "(La3/l;Lt4/o;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class f0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, TextGeometricTransform, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f75634c = new f0();

        f0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, TextGeometricTransform textGeometricTransform) {
            return p013kotlin.collections.v.h(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lt4/a;", "it", "", "a", "(La3/l;F)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, t4.a, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f75635c = new g();

        g() {
            super(2);
        }

        public final Object a(a3.l lVar, float f11) {
            return Float.valueOf(f11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(a3.l lVar, t4.a aVar) {
            return a(lVar, aVar.getMultiplier());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lt4/o;", "b", "(Ljava/lang/Object;)Lt4/o;"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, TextGeometricTransform> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f75636c = new g0();

        g0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextGeometricTransform invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lt4/a;", "b", "(Ljava/lang/Object;)Lt4/a;"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<Object, t4.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f75637c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t4.a invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Float");
            return t4.a.b(t4.a.c(((Float) obj).floatValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lt4/q;", "it", "", "a", "(La3/l;Lt4/q;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, TextIndent, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f75638c = new h0();

        h0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, TextIndent textIndent) {
            w4.v vVarB = w4.v.b(textIndent.getFirstLine());
            w4.v.Companion companion = w4.v.INSTANCE;
            return p013kotlin.collections.v.h(c0.y(vVarB, c0.u(companion), lVar), c0.y(w4.v.b(textIndent.getRestLine()), c0.u(companion), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/h$a;", "it", "", "a", "(La3/l;Li4/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.h.a, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f75639c = new i();

        i() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, i4.h.a aVar) {
            return p013kotlin.collections.v.h(c0.x(aVar.getTag()), c0.y(aVar.getStyles(), c0.w(), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lt4/q;", "b", "(Ljava/lang/Object;)Lt4/q;"}, k = 3, mv = {1, 8, 0})
    static final class i0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, TextIndent> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f75640c = new i0();

        i0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextIndent invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            w4.v.Companion companion = w4.v.INSTANCE;
            a3.j<w4.v, Object> jVarU = c0.u(companion);
            Boolean bool = Boolean.FALSE;
            w4.v vVarA = null;
            w4.v vVarA2 = ((!p013kotlin.jvm.internal.s.f(obj2, bool) || (jVarU instanceof i4.n)) && obj2 != null) ? jVarU.a(obj2) : null;
            p013kotlin.jvm.internal.s.h(vVarA2);
            long packedValue = vVarA2.getPackedValue();
            Object obj3 = list.get(1);
            a3.j<w4.v, Object> jVarU2 = c0.u(companion);
            if ((!p013kotlin.jvm.internal.s.f(obj3, bool) || (jVarU2 instanceof i4.n)) && obj3 != null) {
                vVarA = jVarU2.a(obj3);
            }
            p013kotlin.jvm.internal.s.h(vVarA);
            return new TextIndent(packedValue, vVarA.getPackedValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/h$a;", "b", "(Ljava/lang/Object;)Li4/h$a;"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.h.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f75641c = new j();

        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.h.a invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            p013kotlin.jvm.internal.s.h(str);
            Object obj3 = list.get(1);
            a3.j<i4.n0, Object> jVarW = c0.w();
            return new i4.h.a(str, ((!p013kotlin.jvm.internal.s.f(obj3, Boolean.FALSE) || (jVarW instanceof i4.n)) && obj3 != null) ? jVarW.a(obj3) : null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/n0;", "it", "", "a", "(La3/l;Li4/n0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class j0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.n0, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f75642c = new j0();

        j0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, i4.n0 n0Var) {
            return p013kotlin.collections.v.h(c0.y(n0Var.getStyle(), c0.v(), lVar), c0.y(n0Var.getFocusedStyle(), c0.v(), lVar), c0.y(n0Var.getHoveredStyle(), c0.v(), lVar), c0.y(n0Var.getPressedStyle(), c0.v(), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lk3/p1;", "it", "", "a", "(La3/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, p1, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f75643c = new k();

        k() {
            super(2);
        }

        public final Object a(a3.l lVar, long j11) {
            return j11 == 16 ? Boolean.FALSE : Integer.valueOf(r1.k(j11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(a3.l lVar, p1 p1Var) {
            return a(lVar, p1Var.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/n0;", "b", "(Ljava/lang/Object;)Li4/n0;"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.n0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f75644c = new k0();

        k0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.n0 invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            a3.j<SpanStyle, Object> jVarV = c0.v();
            Boolean bool = Boolean.FALSE;
            SpanStyle d0VarA = null;
            SpanStyle d0VarA2 = ((!p013kotlin.jvm.internal.s.f(obj2, bool) || (jVarV instanceof i4.n)) && obj2 != null) ? jVarV.a(obj2) : null;
            Object obj3 = list.get(1);
            a3.j<SpanStyle, Object> jVarV2 = c0.v();
            SpanStyle d0VarA3 = ((!p013kotlin.jvm.internal.s.f(obj3, bool) || (jVarV2 instanceof i4.n)) && obj3 != null) ? jVarV2.a(obj3) : null;
            Object obj4 = list.get(2);
            a3.j<SpanStyle, Object> jVarV3 = c0.v();
            SpanStyle d0VarA4 = ((!p013kotlin.jvm.internal.s.f(obj4, bool) || (jVarV3 instanceof i4.n)) && obj4 != null) ? jVarV3.a(obj4) : null;
            Object obj5 = list.get(3);
            a3.j<SpanStyle, Object> jVarV4 = c0.v();
            if ((!p013kotlin.jvm.internal.s.f(obj5, bool) || (jVarV4 instanceof i4.n)) && obj5 != null) {
                d0VarA = jVarV4.a(obj5);
            }
            return new i4.n0(d0VarA2, d0VarA3, d0VarA4, d0VarA);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lk3/p1;", "b", "(Ljava/lang/Object;)Lk3/p1;"}, k = 3, mv = {1, 8, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<Object, p1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f75645c = new l();

        l() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1 invoke(Object obj) {
            long jB;
            if (p013kotlin.jvm.internal.s.f(obj, Boolean.FALSE)) {
                jB = p1.INSTANCE.j();
            } else {
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
                jB = r1.b(((Integer) obj).intValue());
            }
            return p1.l(jB);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/p0;", "it", "", "a", "(La3/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class l0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.p0, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f75646c = new l0();

        l0() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(a3.l lVar, long j11) {
            return p013kotlin.collections.v.h(c0.x(Integer.valueOf(i4.p0.n(j11))), c0.x(Integer.valueOf(i4.p0.i(j11))));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(a3.l lVar, i4.p0 p0Var) {
            return a(lVar, p0Var.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Ln4/f0;", "it", "", "a", "(La3/l;Ln4/f0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, FontWeight, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f75647c = new m();

        m() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.k());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/p0;", "b", "(Ljava/lang/Object;)Li4/p0;"}, k = 3, mv = {1, 8, 0})
    static final class m0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.p0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f75648c = new m0();

        m0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.p0 invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            p013kotlin.jvm.internal.s.h(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            p013kotlin.jvm.internal.s.h(num2);
            return i4.p0.b(i4.q0.b(iIntValue, num2.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ln4/f0;", "b", "(Ljava/lang/Object;)Ln4/f0;"}, k = 3, mv = {1, 8, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.l<Object, FontWeight> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f75649c = new n();

        n() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FontWeight invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lw4/v;", "it", "", "a", "(La3/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class n0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, w4.v, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f75650c = new n0();

        n0() {
            super(2);
        }

        public final Object a(a3.l lVar, long j11) {
            return w4.v.e(j11, w4.v.INSTANCE.a()) ? Boolean.FALSE : p013kotlin.collections.v.h(c0.x(Float.valueOf(w4.v.h(j11))), c0.x(w4.x.d(w4.v.g(j11))));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(a3.l lVar, w4.v vVar) {
            return a(lVar, vVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/h$b;", "it", "", "a", "(La3/l;Li4/h$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, i4.h.b, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f75651c = new o();

        o() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, i4.h.b bVar) {
            return p013kotlin.collections.v.h(c0.x(bVar.getUrl()), c0.y(bVar.getStyles(), c0.w(), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lw4/v;", "b", "(Ljava/lang/Object;)Lw4/v;"}, k = 3, mv = {1, 8, 0})
    static final class o0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, w4.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f75652c = new o0();

        o0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w4.v invoke(Object obj) {
            if (p013kotlin.jvm.internal.s.f(obj, Boolean.FALSE)) {
                return w4.v.b(w4.v.INSTANCE.a());
            }
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            p013kotlin.jvm.internal.s.h(f11);
            float fFloatValue = f11.floatValue();
            Object obj3 = list.get(1);
            w4.x xVar = obj3 != null ? (w4.x) obj3 : null;
            p013kotlin.jvm.internal.s.h(xVar);
            return w4.v.b(w4.w.a(fFloatValue, xVar.getType()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/h$b;", "b", "(Ljava/lang/Object;)Li4/h$b;"}, k = 3, mv = {1, 8, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.l<Object, i4.h.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f75653c = new p();

        p() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i4.h.b invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i4.n0 n0VarA = null;
            String str = obj2 != null ? (String) obj2 : null;
            p013kotlin.jvm.internal.s.h(str);
            Object obj3 = list.get(1);
            a3.j<i4.n0, Object> jVarW = c0.w();
            if ((!p013kotlin.jvm.internal.s.f(obj3, Boolean.FALSE) || (jVarW instanceof i4.n)) && obj3 != null) {
                n0VarA = jVarW.a(obj3);
            }
            return new i4.h.b(str, n0VarA, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/u0;", "it", "", "a", "(La3/l;Li4/u0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class p0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, UrlAnnotation, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f75654c = new p0();

        p0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, UrlAnnotation urlAnnotation) {
            return c0.x(urlAnnotation.getUrl());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lp4/e;", "it", "", "a", "(La3/l;Lp4/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, LocaleList, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f75655c = new q();

        q() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, LocaleList localeList) {
            List<p4.d> listH = localeList.h();
            ArrayList arrayList = new ArrayList(listH.size());
            int size = listH.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c0.y(listH.get(i11), c0.o(p4.d.INSTANCE), lVar));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/u0;", "b", "(Ljava/lang/Object;)Li4/u0;"}, k = 3, mv = {1, 8, 0})
    static final class q0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, UrlAnnotation> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f75656c = new q0();

        q0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            p013kotlin.jvm.internal.s.h(str);
            return new UrlAnnotation(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp4/e;", "b", "(Ljava/lang/Object;)Lp4/e;"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<Object, LocaleList> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f75657c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = list.get(i11);
                a3.j<p4.d, Object> jVarO = c0.o(p4.d.INSTANCE);
                p4.d dVarA = null;
                if ((!p013kotlin.jvm.internal.s.f(obj2, Boolean.FALSE) || (jVarO instanceof i4.n)) && obj2 != null) {
                    dVarA = jVarO.a(obj2);
                }
                p013kotlin.jvm.internal.s.h(dVarA);
                arrayList.add(dVarA);
            }
            return new LocaleList(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/v0;", "it", "", "a", "(La3/l;Li4/v0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class r0 extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, VerbatimTtsAnnotation, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f75658c = new r0();

        r0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return c0.x(verbatimTtsAnnotation.getVerbatim());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lp4/d;", "it", "", "a", "(La3/l;Lp4/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, p4.d, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f75659c = new s();

        s() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, p4.d dVar) {
            return dVar.d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/v0;", "b", "(Ljava/lang/Object;)Li4/v0;"}, k = 3, mv = {1, 8, 0})
    static final class s0 extends p013kotlin.jvm.internal.u implements wn0.l<Object, VerbatimTtsAnnotation> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f75660c = new s0();

        s0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            p013kotlin.jvm.internal.s.h(str);
            return new VerbatimTtsAnnotation(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp4/d;", "b", "(Ljava/lang/Object;)Lp4/d;"}, k = 3, mv = {1, 8, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.l<Object, p4.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f75661c = new t();

        t() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p4.d invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            return new p4.d((String) obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"i4/c0$u", "Li4/n;", "La3/l;", "value", "b", "(La3/l;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u<Original, Saveable> implements i4.n<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.p<a3.l, Original, Saveable> f75662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l<Saveable, Original> f75663b;

        /* JADX WARN: Multi-variable type inference failed */
        u(wn0.p<? super a3.l, ? super Original, ? extends Saveable> pVar, wn0.l<? super Saveable, ? extends Original> lVar) {
            this.f75662a = pVar;
            this.f75663b = lVar;
        }

        @Override // a3.j
        public Original a(Saveable value) {
            return this.f75663b.invoke(value);
        }

        @Override // a3.j
        public Saveable b(a3.l lVar, Original original) {
            return this.f75662a.invoke(lVar, original);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lj3/g;", "it", "", "a", "(La3/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, j3.g, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f75664c = new v();

        v() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(a3.l lVar, long j11) {
            return j3.g.j(j11, j3.g.INSTANCE.b()) ? Boolean.FALSE : p013kotlin.collections.v.h(c0.x(Float.valueOf(j3.g.m(j11))), c0.x(Float.valueOf(j3.g.n(j11))));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(a3.l lVar, j3.g gVar) {
            return a(lVar, gVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lj3/g;", "b", "(Ljava/lang/Object;)Lj3/g;"}, k = 3, mv = {1, 8, 0})
    static final class w extends p013kotlin.jvm.internal.u implements wn0.l<Object, j3.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f75665c = new w();

        w() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j3.g invoke(Object obj) {
            if (p013kotlin.jvm.internal.s.f(obj, Boolean.FALSE)) {
                return j3.g.d(j3.g.INSTANCE.b());
            }
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            p013kotlin.jvm.internal.s.h(f11);
            float fFloatValue = f11.floatValue();
            Object obj3 = list.get(1);
            Float f12 = obj3 != null ? (Float) obj3 : null;
            p013kotlin.jvm.internal.s.h(f12);
            return j3.g.d(j3.h.a(fFloatValue, f12.floatValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li4/u;", "it", "", "a", "(La3/l;Li4/u;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class x extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, ParagraphStyle, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f75666c = new x();

        x() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, ParagraphStyle uVar) {
            return p013kotlin.collections.v.h(c0.x(t4.j.h(uVar.getTextAlign())), c0.x(t4.l.g(uVar.getTextDirection())), c0.y(w4.v.b(uVar.getLineHeight()), c0.u(w4.v.INSTANCE), lVar), c0.y(uVar.getTextIndent(), c0.t(TextIndent.INSTANCE), lVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li4/u;", "b", "(Ljava/lang/Object;)Li4/u;"}, k = 3, mv = {1, 8, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.l<Object, ParagraphStyle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f75667c = new y();

        y() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ParagraphStyle invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextIndent textIndentA = null;
            t4.j jVar = obj2 != null ? (t4.j) obj2 : null;
            p013kotlin.jvm.internal.s.h(jVar);
            int value = jVar.getValue();
            Object obj3 = list.get(1);
            t4.l lVar = obj3 != null ? (t4.l) obj3 : null;
            p013kotlin.jvm.internal.s.h(lVar);
            int value2 = lVar.getValue();
            Object obj4 = list.get(2);
            a3.j<w4.v, Object> jVarU = c0.u(w4.v.INSTANCE);
            Boolean bool = Boolean.FALSE;
            w4.v vVarA = ((!p013kotlin.jvm.internal.s.f(obj4, bool) || (jVarU instanceof i4.n)) && obj4 != null) ? jVarU.a(obj4) : null;
            p013kotlin.jvm.internal.s.h(vVarA);
            long packedValue = vVarA.getPackedValue();
            Object obj5 = list.get(3);
            a3.j<TextIndent, Object> jVarT = c0.t(TextIndent.INSTANCE);
            if ((!p013kotlin.jvm.internal.s.f(obj5, bool) || (jVarT instanceof i4.n)) && obj5 != null) {
                textIndentA = jVarT.a(obj5);
            }
            return new ParagraphStyle(value, value2, packedValue, textIndentA, null, null, 0, 0, null, DownloaderService.STATUS_HTTP_EXCEPTION, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lk3/e4;", "it", "", "a", "(La3/l;Lk3/e4;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class z extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, Shadow, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f75668c = new z();

        z() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, Shadow e4Var) {
            return p013kotlin.collections.v.h(c0.y(p1.l(e4Var.getColor()), c0.l(p1.INSTANCE), lVar), c0.y(j3.g.d(e4Var.getOffset()), c0.k(j3.g.INSTANCE), lVar), c0.x(Float.valueOf(e4Var.getBlurRadius())));
        }
    }

    private static final <Original, Saveable> i4.n<Original, Saveable> a(wn0.p<? super a3.l, ? super Original, ? extends Saveable> pVar, wn0.l<? super Saveable, ? extends Original> lVar) {
        return new u(pVar, lVar);
    }

    public static final a3.j<i4.d, Object> h() {
        return f75599a;
    }

    public static final a3.j<ParagraphStyle, Object> i() {
        return f75606h;
    }

    public static final a3.j<i4.p0, Object> j(i4.p0.Companion companion) {
        return f75614p;
    }

    public static final a3.j<j3.g, Object> k(j3.g.Companion companion) {
        return f75618t;
    }

    public static final a3.j<p1, Object> l(p1.Companion companion) {
        return f75616r;
    }

    public static final a3.j<Shadow, Object> m(Shadow.Companion aVar) {
        return f75615q;
    }

    public static final a3.j<FontWeight, Object> n(FontWeight.Companion companion) {
        return f75612n;
    }

    public static final a3.j<p4.d, Object> o(p4.d.Companion companion) {
        return f75620v;
    }

    public static final a3.j<LocaleList, Object> p(LocaleList.Companion companion) {
        return f75619u;
    }

    public static final a3.j<t4.a, Object> q(t4.a.Companion companion) {
        return f75613o;
    }

    public static final a3.j<t4.k, Object> r(t4.k.Companion companion) {
        return f75609k;
    }

    public static final a3.j<TextGeometricTransform, Object> s(TextGeometricTransform.Companion companion) {
        return f75610l;
    }

    public static final a3.j<TextIndent, Object> t(TextIndent.Companion companion) {
        return f75611m;
    }

    public static final a3.j<w4.v, Object> u(w4.v.Companion companion) {
        return f75617s;
    }

    public static final a3.j<SpanStyle, Object> v() {
        return f75607i;
    }

    public static final a3.j<i4.n0, Object> w() {
        return f75608j;
    }

    public static final <T extends a3.j<Original, Saveable>, Original, Saveable> Object y(Original original, T t11, a3.l lVar) {
        Object objB;
        return (original == null || (objB = t11.b(lVar, original)) == null) ? Boolean.FALSE : objB;
    }

    public static final <T> T x(T t11) {
        return t11;
    }
}
