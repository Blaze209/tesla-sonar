package p014n4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.y3;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Ln4/s;", "Ln4/q$b;", "Ln4/m0;", "platformFontLoader", "Ln4/n0;", "platformResolveInterceptor", "Ln4/f1;", "typefaceRequestCache", "Ln4/x;", "fontListFontFamilyTypefaceAdapter", "Ln4/l0;", "platformFamilyTypefaceAdapter", "<init>", "(Ln4/m0;Ln4/n0;Ln4/f1;Ln4/x;Ln4/l0;)V", "Ln4/e1;", "typefaceRequest", "Lr2/y3;", "", "h", "(Ln4/e1;)Lr2/y3;", "Ln4/q;", "fontFamily", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "a", "(Ln4/q;Ln4/f0;II)Lr2/y3;", "Ln4/m0;", "g", "()Ln4/m0;", "b", "Ln4/n0;", "c", "Ln4/f1;", DateTokenConverter.CONVERTER_KEY, "Ln4/x;", "e", "Ln4/l0;", "Lkotlin/Function1;", "f", "Lwn0/l;", "createDefaultTypeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0 platformFontLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n0 platformResolveInterceptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f1 typefaceRequestCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x fontListFontFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l0 platformFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<TypefaceRequest, Object> createDefaultTypeface;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/e1;", "it", "", "a", "(Ln4/e1;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<TypefaceRequest, Object> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TypefaceRequest typefaceRequest) {
            return s.this.h(TypefaceRequest.b(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: renamed from: n4.s$b, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Ln4/g1;", "Ljn0/h0;", "onAsyncCompletion", "a", "(Lwn0/l;)Ln4/g1;"}, k = 3, mv = {1, 8, 0})
    static final class Function1 extends u implements l<l<? super g1, ? extends h0>, g1> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TypefaceRequest f93019d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Function1(TypefaceRequest typefaceRequest) {
            super(1);
            this.f93019d = typefaceRequest;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g1 invoke(l<? super g1, h0> lVar) {
            g1 g1VarA = s.this.fontListFontFamilyTypefaceAdapter.a(this.f93019d, s.this.getPlatformFontLoader(), lVar, s.this.createDefaultTypeface);
            if (g1VarA != null) {
                return g1VarA;
            }
            g1 g1VarA2 = s.this.platformFamilyTypefaceAdapter.a(this.f93019d, s.this.getPlatformFontLoader(), lVar, s.this.createDefaultTypeface);
            if (g1VarA2 != null) {
                return g1VarA2;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public s(m0 m0Var, n0 n0Var, f1 f1Var, x xVar, l0 l0Var) {
        this.platformFontLoader = m0Var;
        this.platformResolveInterceptor = n0Var;
        this.typefaceRequestCache = f1Var;
        this.fontListFontFamilyTypefaceAdapter = xVar;
        this.platformFamilyTypefaceAdapter = l0Var;
        this.createDefaultTypeface = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y3<Object> h(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.c(typefaceRequest, new Function1(typefaceRequest));
    }

    @Override // n4.q.b
    public y3<Object> a(q fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return h(new TypefaceRequest(this.platformResolveInterceptor.b(fontFamily), this.platformResolveInterceptor.a(fontWeight), this.platformResolveInterceptor.c(fontStyle), this.platformResolveInterceptor.d(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m0 getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s(m0 m0Var, n0 n0Var, f1 f1Var, x xVar, l0 l0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0Var, (i11 & 2) != 0 ? n0.INSTANCE.a() : n0Var, (i11 & 4) != 0 ? t.b() : f1Var, (i11 & 8) != 0 ? new x(t.a(), null, 2, 0 == true ? 1 : 0) : xVar, (i11 & 16) != 0 ? new l0() : l0Var);
    }
}
