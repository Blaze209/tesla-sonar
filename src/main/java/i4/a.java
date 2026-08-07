package i4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.t3;
import k3.w0;
import k3.z3;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J*\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J,\u0010=\u001a\u00020\u00182\u0006\u00109\u001a\u0002032\u0006\u0010;\u001a\u00020:2\b\b\u0001\u0010<\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020-2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u00108J\u001d\u0010E\u001a\u0002032\u0006\u00106\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010IJ\u0017\u0010K\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010IJ\u0017\u0010L\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010IJ\u0017\u0010M\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010IJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bU\u0010OJ\u001f\u0010W\u001a\u00020%2\u0006\u00106\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u0006H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020Y2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020Y2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010[JH\u0010g\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010f\u001a\u00020eH\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010hJP\u0010l\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020%2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010f\u001a\u00020eH\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010mR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0014\u001a\u0004\bq\u0010rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010s\u001a\u0004\bt\u0010uR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010\u0019\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR$\u0010\u0083\u0001\u001a\u00020|8\u0000X\u0081\u0004¢\u0006\u0015\n\u0004\b}\u0010~\u0012\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0088\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u0084\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bZ\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008d\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0016\u0010\u008e\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b}\u0010\u008a\u0001R\u0016\u0010\u008f\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bv\u0010\u008a\u0001R\u0017\u0010\u0091\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R\u0017\u0010\u0093\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008a\u0001R\u0016\u0010\u0095\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010uR\u0015\u0010\u0096\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010rR \u0010\u009b\u0001\u001a\u00030\u0097\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009a\u0001\u0010\u0082\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, d2 = {"Li4/a;", "Li4/o;", "Lq4/d;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Lq4/d;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lj4/i0;", "", "Ls4/b;", "G", "(Lj4/i0;)[Ls4/b;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "I", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Lk3/j1;", "canvas", "Ljn0/h0;", "J", "(Lk3/j1;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "E", "(IILandroid/text/TextUtils$TruncateAt;IIIII)Lj4/i0;", "", "vertical", "m", "(F)I", "Lj3/g;", "position", "k", "(J)I", "Lj3/i;", "rect", "Li4/g0;", "granularity", "Li4/k0;", "inclusionStrategy", "Li4/p0;", "h", "(Lj3/i;ILi4/k0;)J", "offset", "C", "(I)Lj3/i;", "range", "", "array", "arrayStart", "o", "(J[FI)V", "start", "end", "Lk3/t3;", "w", "(II)Lk3/t3;", "q", IntegerTokenConverter.CONVERTER_KEY, "(I)J", "lineIndex", "n", "(I)F", "u", "a", Gender.FEMALE, "c", "b", "(I)I", "visibleEnd", "l", "(IZ)I", "t", "(I)Z", "A", "usePrimaryDirection", "x", "(IZ)F", "Lt4/i;", "g", "(I)Lt4/i;", "B", "Lk3/p1;", "color", "Lk3/e4;", "shadow", "Lt4/k;", "textDecoration", "Lm3/g;", "drawStyle", "Lk3/b1;", "blendMode", "s", "(Lk3/j1;JLk3/e4;Lt4/k;Lm3/g;I)V", "Lk3/h1;", "brush", "alpha", "p", "(Lk3/j1;Lk3/h1;FLk3/e4;Lt4/k;Lm3/g;I)V", "Lq4/d;", "getParagraphIntrinsics", "()Lq4/d;", "getMaxLines", "()I", "Z", "getEllipsis", "()Z", DateTokenConverter.CONVERTER_KEY, "getConstraints-msEJaDk", "()J", "e", "Lj4/i0;", "layout", "", "f", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "Ljava/util/List;", "D", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "maxIntrinsicWidth", "minIntrinsicWidth", "j", "firstBaseline", "z", "lastBaseline", "v", "didExceedMaxLines", "lineCount", "Lq4/i;", "H", "()Lq4/i;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q4.d paragraphIntrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean ellipsis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j4.i0 layout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<j3.i> placeholderRects;

    /* JADX INFO: renamed from: i4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class C1576a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75595a;

        static {
            int[] iArr = new int[t4.i.values().length];
            try {
                iArr[t4.i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t4.i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75595a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/RectF;", "segmentBounds", "area", "", "a", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<RectF, RectF, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f75596c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k0 k0Var) {
            super(2);
            this.f75596c = k0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f75596c.a(z3.f(rectF), z3.f(rectF2)));
        }
    }

    public /* synthetic */ a(q4.d dVar, int i11, boolean z11, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i11, z11, j11);
    }

    private final j4.i0 E(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        return new j4.i0(this.charSequence, getWidth(), H(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, BitmapDescriptorFactory.HUE_RED, q4.c.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    private final s4.b[] G(j4.i0 i0Var) {
        if (!(i0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = i0Var.G();
        p013kotlin.jvm.internal.s.i(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!I((Spanned) charSequenceG, s4.b.class)) {
            return null;
        }
        CharSequence charSequenceG2 = i0Var.G();
        p013kotlin.jvm.internal.s.i(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (s4.b[]) ((Spanned) charSequenceG2).getSpans(0, i0Var.G().length(), s4.b.class);
    }

    private final boolean I(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void J(j1 canvas) {
        Canvas canvasD = k3.f0.d(canvas);
        if (v()) {
            canvasD.save();
            canvasD.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
        }
        this.layout.M(canvasD);
        if (v()) {
            canvasD.restore();
        }
    }

    @Override // i4.o
    public int A(int offset) {
        return this.layout.q(offset);
    }

    @Override // i4.o
    public t4.i B(int offset) {
        return this.layout.L(offset) ? t4.i.Rtl : t4.i.Ltr;
    }

    @Override // i4.o
    public j3.i C(int offset) {
        if (offset >= 0 && offset < this.charSequence.length()) {
            RectF rectFC = this.layout.c(offset);
            return new j3.i(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // i4.o
    public List<j3.i> D() {
        return this.placeholderRects;
    }

    public float F(int lineIndex) {
        return this.layout.k(lineIndex);
    }

    public final q4.i H() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // i4.o
    public float a(int lineIndex) {
        return this.layout.w(lineIndex);
    }

    @Override // i4.o
    public int b(int lineIndex) {
        return this.layout.v(lineIndex);
    }

    @Override // i4.o
    public float c(int lineIndex) {
        return this.layout.l(lineIndex);
    }

    @Override // i4.o
    public float d() {
        return this.paragraphIntrinsics.d();
    }

    @Override // i4.o
    public int e() {
        return this.layout.getLineCount();
    }

    @Override // i4.o
    public float f() {
        return this.paragraphIntrinsics.f();
    }

    @Override // i4.o
    public t4.i g(int offset) {
        return this.layout.z(this.layout.q(offset)) == 1 ? t4.i.Ltr : t4.i.Rtl;
    }

    @Override // i4.o
    public float getHeight() {
        return this.layout.f();
    }

    @Override // i4.o
    public float getWidth() {
        return w4.b.l(this.constraints);
    }

    @Override // i4.o
    public long h(j3.i rect, int granularity, k0 inclusionStrategy) {
        int[] iArrC = this.layout.C(z3.c(rect), i4.b.r(granularity), new b(inclusionStrategy));
        return iArrC == null ? p0.INSTANCE.a() : q0.b(iArrC[0], iArrC[1]);
    }

    @Override // i4.o
    public long i(int offset) {
        k4.h hVarI = this.layout.I();
        return q0.b(k4.g.b(hVarI, offset), k4.g.a(hVarI, offset));
    }

    @Override // i4.o
    public float j() {
        return F(0);
    }

    @Override // i4.o
    public int k(long position) {
        return this.layout.y(this.layout.r((int) j3.g.n(position)), j3.g.m(position));
    }

    @Override // i4.o
    public int l(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.x(lineIndex) : this.layout.p(lineIndex);
    }

    @Override // i4.o
    public int m(float vertical) {
        return this.layout.r((int) vertical);
    }

    @Override // i4.o
    public float n(int lineIndex) {
        return this.layout.t(lineIndex);
    }

    @Override // i4.o
    public void o(long range, float[] array, int arrayStart) {
        this.layout.a(p0.l(range), p0.k(range), array, arrayStart);
    }

    @Override // i4.o
    public void p(j1 canvas, h1 brush, float alpha, Shadow shadow, t4.k textDecoration, m3.g drawStyle, int blendMode) {
        int backingBlendMode = H().getBackingBlendMode();
        q4.i iVarH = H();
        iVarH.e(brush, j3.n.a(getWidth(), getHeight()), alpha);
        iVarH.h(shadow);
        iVarH.i(textDecoration);
        iVarH.g(drawStyle);
        iVarH.d(blendMode);
        J(canvas);
        H().d(backingBlendMode);
    }

    @Override // i4.o
    public j3.i q(int offset) {
        if (offset >= 0 && offset <= this.charSequence.length()) {
            float fB = j4.i0.B(this.layout, offset, false, 2, null);
            int iQ = this.layout.q(offset);
            return new j3.i(fB, this.layout.w(iQ), fB, this.layout.l(iQ));
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']').toString());
    }

    @Override // i4.o
    public void s(j1 canvas, long color, Shadow shadow, t4.k textDecoration, m3.g drawStyle, int blendMode) {
        int backingBlendMode = H().getBackingBlendMode();
        q4.i iVarH = H();
        iVarH.f(color);
        iVarH.h(shadow);
        iVarH.i(textDecoration);
        iVarH.g(drawStyle);
        iVarH.d(blendMode);
        J(canvas);
        H().d(backingBlendMode);
    }

    @Override // i4.o
    public boolean t(int lineIndex) {
        return this.layout.K(lineIndex);
    }

    @Override // i4.o
    public float u(int lineIndex) {
        return this.layout.u(lineIndex);
    }

    @Override // i4.o
    public boolean v() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // i4.o
    public t3 w(int start, int end) {
        if (start >= 0 && start <= end && end <= this.charSequence.length()) {
            Path path = new Path();
            this.layout.F(start, end, path);
            return w0.c(path);
        }
        throw new IllegalArgumentException(("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
    }

    @Override // i4.o
    public float x(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? j4.i0.B(this.layout, offset, false, 2, null) : j4.i0.E(this.layout, offset, false, 2, null);
    }

    @Override // i4.o
    public float z() {
        return F(e() - 1);
    }

    private a(q4.d dVar, int i11, boolean z11, long j11) {
        a aVar;
        List<j3.i> listM;
        j3.i iVar;
        float fX;
        float fK;
        int iB;
        float fW;
        float fB;
        float fK2;
        this.paragraphIntrinsics = dVar;
        this.maxLines = i11;
        this.ellipsis = z11;
        this.constraints = j11;
        if (w4.b.m(j11) != 0 || w4.b.n(j11) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = dVar.getStyle();
        this.charSequence = i4.b.l(style, z11) ? i4.b.j(dVar.getCharSequence()) : dVar.getCharSequence();
        int iM = i4.b.m(style.B());
        boolean zK = t4.j.k(style.B(), t4.j.INSTANCE.c());
        int iO = i4.b.o(style.x().getHyphens());
        int iN = i4.b.n(t4.f.g(style.t()));
        int iP = i4.b.p(t4.f.h(style.t()));
        int iQ = i4.b.q(t4.f.i(style.t()));
        TextUtils.TruncateAt truncateAt = z11 ? TextUtils.TruncateAt.END : null;
        j4.i0 i0VarE = E(iM, zK ? 1 : 0, truncateAt, i11, iO, iN, iP, iQ);
        if (!z11 || i0VarE.f() <= w4.b.k(j11) || i11 <= 1) {
            aVar = this;
            aVar.layout = i0VarE;
        } else {
            int iK = i4.b.k(i0VarE, w4.b.k(j11));
            if (iK < 0 || iK == i11) {
                aVar = this;
            } else {
                int iF = bo0.n.f(iK, 1);
                aVar = this;
                i0VarE = aVar.E(iM, zK ? 1 : 0, truncateAt, iF, iO, iN, iP, iQ);
            }
            aVar.layout = i0VarE;
        }
        aVar.H().e(style.i(), j3.n.a(aVar.getWidth(), aVar.getHeight()), style.f());
        s4.b[] bVarArrG = aVar.G(aVar.layout);
        if (bVarArrG != null) {
            Iterator itA = p013kotlin.jvm.internal.c.a(bVarArrG);
            while (itA.hasNext()) {
                ((s4.b) itA.next()).c(j3.n.a(aVar.getWidth(), aVar.getHeight()));
            }
        }
        CharSequence charSequence = aVar.charSequence;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z12 = false;
            Object[] spans = spanned.getSpans(0, charSequence.length(), l4.j.class);
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i12 = 0;
            while (i12 < length) {
                l4.j jVar = (l4.j) spans[i12];
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iQ2 = aVar.layout.q(spanStart);
                boolean z13 = iQ2 >= aVar.maxLines ? true : z12;
                boolean z14 = (aVar.layout.n(iQ2) <= 0 || spanEnd <= aVar.layout.o(iQ2)) ? z12 : true;
                boolean z15 = spanEnd > aVar.layout.p(iQ2) ? true : z12;
                if (z14 || z15 || z13) {
                    iVar = null;
                } else {
                    int i13 = C1576a.f75595a[aVar.B(spanStart).ordinal()];
                    if (i13 == 1) {
                        fX = aVar.x(spanStart, true);
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fX = aVar.x(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fX;
                    j4.i0 i0Var = aVar.layout;
                    switch (jVar.getVerticalAlign()) {
                        case 0:
                            fK = i0Var.k(iQ2);
                            iB = jVar.b();
                            fW = fK - iB;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 1:
                            fW = i0Var.w(iQ2);
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 2:
                            fK = i0Var.l(iQ2);
                            iB = jVar.b();
                            fW = fK - iB;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 3:
                            fW = ((i0Var.w(iQ2) + i0Var.l(iQ2)) - jVar.b()) / 2;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 4:
                            fB = jVar.a().ascent;
                            fK2 = i0Var.k(iQ2);
                            fW = fB + fK2;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 5:
                            fK = jVar.a().descent + i0Var.k(iQ2);
                            iB = jVar.b();
                            fW = fK - iB;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fK2 = i0Var.k(iQ2);
                            fW = fB + fK2;
                            iVar = new j3.i(fX, fW, fD, jVar.b() + fW);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(iVar);
                i12++;
                z12 = false;
            }
            listM = arrayList;
        } else {
            listM = p013kotlin.collections.v.m();
        }
        aVar.placeholderRects = listM;
    }
}
