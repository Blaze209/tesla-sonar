package g2;

import b4.b0;
import b4.e0;
import b4.r;
import b4.s1;
import b4.t1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import g4.y;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.p1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.q;
import t4.t;
import w4.v;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001fBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u001dJ@\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u001e*\u00020-H\u0016¢\u0006\u0004\b.\u0010/J&\u00106\u001a\u000205*\u0002002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010<J#\u0010?\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010<J#\u0010@\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010<J\u0013\u0010B\u001a\u00020\u001e*\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010DR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010IR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010U\u001a\u0010\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u000f\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010 R\u0018\u0010X\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010^\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z\u0012\u0004\u0012\u00020\r\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Lg2/k;", "Landroidx/compose/ui/d$c;", "Lb4/b0;", "Lb4/r;", "Lb4/s1;", "", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lk3/s1;", "overrideColor", "<init>", "(Ljava/lang/String;Li4/r0;Ln4/q$b;IZIILk3/s1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/d;", "density", "Lg2/f;", "H2", "(Lw4/d;)Lg2/f;", "updatedText", "J2", "(Ljava/lang/String;)Z", "Ljn0/h0;", "E2", "()V", "I2", "color", "K2", "(Lk3/s1;Li4/r0;)Z", "M2", "L2", "(Li4/r0;IIZLn4/q$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "F2", "(ZZZ)V", "Lg4/y;", "G0", "(Lg4/y;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "Ljava/lang/String;", "o", "Li4/r0;", "p", "Ln4/q$b;", "I", "r", "Z", "s", "t", "u", "Lk3/s1;", "", "Lz3/a;", "v", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "w", "Lg2/f;", "_layoutCache", "Lkotlin/Function1;", "", "Li4/m0;", "x", "Lwn0/l;", "semanticsTextLayoutResult", "Lg2/k$a;", "y", "Lg2/k$a;", "textSubstitution", "G2", "()Lg2/f;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends androidx.compose.ui.d.c implements b0, r, s1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private q.b fontFamilyResolver;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private k3.s1 overrideColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Map<z3.a, Integer> baselineCache;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private g2.f _layoutCache;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private TextSubstitution textSubstitution;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li4/m0;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<List<TextLayoutResult>, Boolean> {
        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<TextLayoutResult> list) {
            g2.f fVarG2 = k.this.G2();
            TextStyle textStyle = k.this.style;
            k3.s1 s1Var = k.this.overrideColor;
            TextLayoutResult textLayoutResultO = fVarG2.o(textStyle.L((16609105 & 1) != 0 ? p1.INSTANCE.j() : s1Var != null ? s1Var.a() : p1.INSTANCE.j(), (16609105 & 2) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? p1.INSTANCE.j() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? t4.j.INSTANCE.g() : 0, (16609105 & 65536) != 0 ? t4.l.INSTANCE.f() : 0, (16609105 & 131072) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16609105 & PKIFailureInfo.badCertTemplate) != 0 ? t4.f.INSTANCE.b() : 0, (16609105 & PKIFailureInfo.badSenderNonce) != 0 ? t4.e.INSTANCE.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
            if (textLayoutResultO != null) {
                list.add(textLayoutResultO);
            } else {
                textLayoutResultO = null;
            }
            return Boolean.valueOf(textLayoutResultO != null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/d;", "updatedText", "", "a", "(Li4/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<i4.d, Boolean> {
        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i4.d dVar) {
            k.this.J2(dVar.getText());
            k.this.I2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            if (k.this.textSubstitution == null) {
                return Boolean.FALSE;
            }
            TextSubstitution textSubstitution = k.this.textSubstitution;
            if (textSubstitution != null) {
                textSubstitution.e(z11);
            }
            k.this.I2();
            return Boolean.TRUE;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            k.this.E2();
            k.this.I2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f67116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(w0 w0Var) {
            super(1);
            this.f67116c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f67116c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ k(String str, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13, k3.s1 s1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i11, z11, i12, i13, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        this.textSubstitution = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g2.f G2() {
        if (this._layoutCache == null) {
            this._layoutCache = new g2.f(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        g2.f fVar = this._layoutCache;
        s.h(fVar);
        return fVar;
    }

    private final g2.f H2(w4.d density) {
        g2.f layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null && textSubstitution.getIsShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.m(density);
            return layoutCache;
        }
        g2.f fVarG2 = G2();
        fVarG2.m(density);
        return fVarG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        t1.b(this);
        e0.b(this);
        b4.s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J2(String updatedText) {
        h0 h0Var;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution == null) {
            TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
            g2.f fVar = new g2.f(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            fVar.m(G2().getDensity());
            textSubstitution2.d(fVar);
            this.textSubstitution = textSubstitution2;
            return true;
        }
        if (s.f(updatedText, textSubstitution.getSubstitution())) {
            return false;
        }
        textSubstitution.f(updatedText);
        g2.f layoutCache = textSubstitution.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.p(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        return h0Var != null;
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).k(rVar.getLayoutDirection());
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        if (getIsAttached()) {
            g2.f fVarH2 = H2(cVar);
            o paragraph = fVarH2.getParagraph();
            if (paragraph == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            }
            j1 j1VarA = cVar.getDrawContext().a();
            boolean didOverflow = fVarH2.getDidOverflow();
            if (didOverflow) {
                float fG = w4.r.g(fVarH2.getLayoutSize());
                float f11 = w4.r.f(fVarH2.getLayoutSize());
                j1VarA.u();
                j1.l(j1VarA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fG, f11, 0, 16, null);
            }
            try {
                t4.k kVarC = this.style.C();
                if (kVarC == null) {
                    kVarC = t4.k.INSTANCE.c();
                }
                t4.k kVar = kVarC;
                Shadow shadowZ = this.style.z();
                if (shadowZ == null) {
                    shadowZ = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowZ;
                m3.g gVarK = this.style.k();
                if (gVarK == null) {
                    gVarK = m3.j.f90966a;
                }
                m3.g gVar = gVarK;
                h1 h1VarI = this.style.i();
                if (h1VarI != null) {
                    o.r(paragraph, j1VarA, h1VarI, this.style.f(), shadow, kVar, gVar, 0, 64, null);
                } else {
                    k3.s1 s1Var = this.overrideColor;
                    long jA = s1Var != null ? s1Var.a() : p1.INSTANCE.j();
                    if (jA == 16) {
                        jA = this.style.j() != 16 ? this.style.j() : p1.INSTANCE.a();
                    }
                    o.y(paragraph, j1VarA, jA, shadow, kVar, gVar, 0, 32, null);
                }
            } finally {
                if (didOverflow) {
                    j1VarA.o();
                }
            }
        }
    }

    public final void F2(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged || layoutChanged) {
            G2().p(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                t1.b(this);
            }
            if (textChanged || layoutChanged) {
                e0.b(this);
                b4.s.a(this);
            }
            if (drawChanged) {
                b4.s.a(this);
            }
        }
    }

    @Override // b4.s1
    public void G0(y yVar) {
        l bVar = this.semanticsTextLayoutResult;
        if (bVar == null) {
            bVar = new b();
            this.semanticsTextLayoutResult = bVar;
        }
        g4.v.r0(yVar, new i4.d(this.text, null, null, 6, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            g4.v.o0(yVar, textSubstitution.getIsShowingSubstitution());
            g4.v.v0(yVar, new i4.d(textSubstitution.getSubstitution(), null, null, 6, null));
        }
        g4.v.x0(yVar, null, new c(), 1, null);
        g4.v.D0(yVar, null, new d(), 1, null);
        g4.v.d(yVar, null, new e(), 1, null);
        g4.v.u(yVar, null, bVar, 1, null);
    }

    public final boolean K2(k3.s1 color, TextStyle style) {
        boolean zF = s.f(color, this.overrideColor);
        this.overrideColor = color;
        return (zF && style.H(this.style)) ? false : true;
    }

    public final boolean L2(TextStyle style, int minLines, int maxLines, boolean softWrap, q.b fontFamilyResolver, int overflow) {
        boolean z11 = !this.style.I(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z11 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z11 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z11 = true;
        }
        if (!s.f(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z11 = true;
        }
        if (t.e(this.overflow, overflow)) {
            return z11;
        }
        this.overflow = overflow;
        return true;
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).j(rVar.getLayoutDirection());
    }

    public final boolean M2(String text) {
        if (s.f(this.text, text)) {
            return false;
        }
        this.text = text;
        E2();
        return true;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        g2.f fVarH2 = H2(k0Var);
        boolean zH = fVarH2.h(j11, k0Var.getLayoutDirection());
        fVarH2.d();
        o paragraph = fVarH2.getParagraph();
        s.h(paragraph);
        long layoutSize = fVarH2.getLayoutSize();
        if (zH) {
            e0.a(this);
            Map<z3.a, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(z3.b.a(), Integer.valueOf(Math.round(paragraph.j())));
            linkedHashMap.put(z3.b.b(), Integer.valueOf(Math.round(paragraph.z())));
            this.baselineCache = linkedHashMap;
        }
        w0 w0VarX0 = h0Var.x0(w4.b.INSTANCE.b(w4.r.g(layoutSize), w4.r.g(layoutSize), w4.r.f(layoutSize), w4.r.f(layoutSize)));
        int iG = w4.r.g(layoutSize);
        int iF = w4.r.f(layoutSize);
        Map<z3.a, Integer> map = this.baselineCache;
        s.h(map);
        return k0Var.b1(iG, iF, map, new f(w0VarX0));
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).f(i11, rVar.getLayoutDirection());
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).f(i11, rVar.getLayoutDirection());
    }

    private k(String str, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13, k3.s1 s1Var) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.overrideColor = s1Var;
    }

    /* JADX INFO: renamed from: g2.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lg2/k$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Lg2/f;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLg2/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", DateTokenConverter.CONVERTER_KEY, "Lg2/f;", "()Lg2/f;", "(Lg2/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextSubstitution {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String original;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String substitution;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private g2.f layoutCache;

        public TextSubstitution(String str, String str2, boolean z11, g2.f fVar) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z11;
            this.layoutCache = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g2.f getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void d(g2.f fVar) {
            this.layoutCache = fVar;
        }

        public final void e(boolean z11) {
            this.isShowingSubstitution = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return s.f(this.original, textSubstitution.original) && s.f(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && s.f(this.layoutCache, textSubstitution.layoutCache);
        }

        public final void f(String str) {
            this.substitution = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            g2.f fVar = this.layoutCache;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z11, g2.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : fVar);
        }
    }
}
