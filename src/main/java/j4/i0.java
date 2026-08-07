package j4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u0010*J\u001d\u00104\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b:\u00109J\u0015\u0010;\u001a\u00020\b2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b;\u0010*J\u0015\u0010<\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b<\u0010.J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b=\u0010*J%\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DJ9\u0010J\u001a\u0004\u0018\u00010\u00182\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\b2\u0018\u0010I\u001a\u0014\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u000f0H¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020B2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ-\u0010S\u001a\u00020B2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010M\u001a\u00020L2\u0006\u0010R\u001a\u00020\b¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020E2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020B2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bN\u0010`\u001a\u0004\ba\u0010\\R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bU\u0010`\u001a\u0004\bb\u0010\\R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010g\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bc\u0010\\R\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR \u0010r\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u0017\u0010v\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\ba\u0010s\u001a\u0004\bt\u0010uR \u0010y\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010s\u0012\u0004\bx\u0010q\u001a\u0004\bw\u0010uR \u0010}\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bz\u0010s\u0012\u0004\b|\u0010q\u001a\u0004\b{\u0010uR\u0014\u0010~\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010\u007f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010CR\u0015\u0010\u0080\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010`R\u0019\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010sR \u0010\u0088\u0001\u001a\f\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0087\u0001R\u0016\u0010F\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u008a\u0001R\u001b\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bz\u0010\u008e\u0001R\u0013\u0010\u0091\u0001\u001a\u00020h8F¢\u0006\u0007\u001a\u0005\bs\u0010\u0090\u0001R\u0014\u0010\u0094\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0012\u0010\u0095\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bi\u0010u¨\u0006\u0096\u0001"}, d2 = {"Lj4/i0;", "", "", "charSequence", "", Snapshot.WIDTH, "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Lj4/s;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILj4/s;)V", "line", "g", "(I)F", "lineIndex", "t", "u", "w", "l", "k", "s", "v", "(I)I", "p", "x", "K", "(I)Z", "o", "n", "vertical", "r", "horizontal", "y", "(IF)I", "offset", "upstream", "A", "(IZ)F", "D", "q", "L", "z", "start", "end", "Landroid/graphics/Path;", "dest", "Ljn0/h0;", Gender.FEMALE, "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "C", "(Landroid/graphics/RectF;ILwn0/p;)[I", "", "array", "b", "(I[F)V", "startOffset", "endOffset", "arrayStart", "a", "(II[FI)V", "c", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", Gender.MALE, "(Landroid/graphics/Canvas;)V", "J", "()Z", "Landroid/text/TextPaint;", "H", "()Landroid/text/TextPaint;", "Z", "h", "e", DateTokenConverter.CONVERTER_KEY, "Lj4/s;", "getLayoutIntrinsics", "()Lj4/s;", "didExceedMaxLines", "Lk4/h;", "f", "Lk4/h;", "backingWordIterator", "Landroid/text/Layout;", "Landroid/text/Layout;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "m", "()I", "lineCount", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "j", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Ll4/h;", "[Ll4/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Lj4/r;", "Lj4/r;", "backingLayoutHelper", "()Lj4/r;", "layoutHelper", "()Lk4/h;", "wordIterator", "G", "()Ljava/lang/CharSequence;", "text", Snapshot.HEIGHT, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s layoutIntrinsics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private k4.h backingWordIterator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final l4.h[] lineHeightSpans;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private r backingLayoutHelper;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public i0(CharSequence charSequence, float f11, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12, float f12, float f13, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, s sVar) {
        TextPaint textPaint2;
        int i19;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        this.textPaint = textPaint;
        this.includePadding = z11;
        this.fallbackLineSpacing = z12;
        this.layoutIntrinsics = sVar;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = k0.k(i12);
        Layout.Alignment alignmentA = g0.f82507a.a(i11);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, l4.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = sVar.a();
            double d11 = f11;
            int iCeil = (int) Math.ceil(d11);
            if (metricsA == null || sVar.b() > f11 || z14) {
                this.isBoringLayout = false;
                d0 d0Var = d0.f82481a;
                int length2 = charSequence.length();
                int iCeil2 = (int) Math.ceil(d11);
                textPaint2 = textPaint;
                i19 = i13;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                layoutA = d0Var.a(charSequence, textPaint2, iCeil, 0, length2, textDirectionHeuristic, alignmentA, i19, truncateAt, iCeil2, f12, f13, i18, z11, z12, i14, i15, i16, i17, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                textPaint2 = textPaint;
                i19 = i13;
                layoutA = g.f82506a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z11, z12, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.layout = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i19);
            this.lineCount = iMin;
            int i21 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i19 && (layoutA.getEllipsisCount(i21) > 0 || layoutA.getLineEnd(i21) != charSequence.length())) ? true : z13;
            long jL = k0.l(this);
            l4.h[] hVarArrJ = k0.j(this);
            this.lineHeightSpans = hVarArrJ;
            long jI = hVarArrJ != null ? k0.i(hVarArrJ) : k0.f82534b;
            this.topPadding = Math.max(l0.c(jL), l0.c(jI));
            this.bottomPadding = Math.max(l0.b(jL), l0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = k0.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.lastLineExtra = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) s(i21)) : z13;
            this.lastLineFontMetrics = fontMetricsIntH;
            this.leftPadding = l4.d.b(layoutA, i21, null, 2, null);
            this.rightPadding = l4.d.d(layoutA, i21, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(i0 i0Var, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return i0Var.A(i11, z11);
    }

    public static /* synthetic */ float E(i0 i0Var, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return i0Var.D(i11, z11);
    }

    private final float g(int line) {
        return line == this.lineCount + (-1) ? this.leftPadding + this.rightPadding : BitmapDescriptorFactory.HUE_RED;
    }

    private final r j() {
        r rVar = this.backingLayoutHelper;
        if (rVar != null) {
            p013kotlin.jvm.internal.s.h(rVar);
            return rVar;
        }
        r rVar2 = new r(this.layout);
        this.backingLayoutHelper = rVar2;
        return rVar2;
    }

    public final float A(int offset, boolean upstream) {
        return j().c(offset, true, upstream) + g(q(offset));
    }

    public final int[] C(RectF rect, int granularity, wn0.p<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? d.f82480a.c(this, rect, granularity, inclusionStrategy) : j0.d(this, this.layout, j(), rect, granularity, inclusionStrategy);
    }

    public final float D(int offset, boolean upstream) {
        return j().c(offset, false, upstream) + g(q(offset));
    }

    public final void F(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(BitmapDescriptorFactory.HUE_RED, this.topPadding);
    }

    public final CharSequence G() {
        return this.layout.getText();
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final k4.h I() {
        k4.h hVar = this.backingWordIterator;
        if (hVar != null) {
            return hVar;
        }
        k4.h hVar2 = new k4.h(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = hVar2;
        return hVar2;
    }

    public final boolean J() {
        if (this.isBoringLayout) {
            g gVar = g.f82506a;
            Layout layout = this.layout;
            p013kotlin.jvm.internal.s.i(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return gVar.b((BoringLayout) layout);
        }
        d0 d0Var = d0.f82481a;
        Layout layout2 = this.layout;
        p013kotlin.jvm.internal.s.i(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return d0Var.c((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean K(int lineIndex) {
        return k0.m(this.layout, lineIndex);
    }

    public final boolean L(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void M(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i11 = this.topPadding;
            if (i11 != 0) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, i11);
            }
            h0 h0Var = k0.f82533a;
            h0Var.a(canvas);
            this.layout.draw(h0Var);
            int i12 = this.topPadding;
            if (i12 != 0) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (-1) * i12);
            }
        }
    }

    public final void a(int startOffset, int endOffset, float[] array, int arrayStart) {
        float fD;
        float fE;
        int length = G().length();
        if (startOffset < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (startOffset >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (endOffset <= startOffset) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (endOffset > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (array.length - arrayStart < (endOffset - startOffset) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iQ = q(startOffset);
        int iQ2 = q(endOffset - 1);
        o oVar = new o(this);
        if (iQ > iQ2) {
            return;
        }
        while (true) {
            int iV = v(iQ);
            int iP = p(iQ);
            int iMin = Math.min(endOffset, iP);
            float fW = w(iQ);
            float fL = l(iQ);
            boolean z11 = z(iQ) == 1;
            for (int iMax = Math.max(startOffset, iV); iMax < iMin; iMax++) {
                boolean zL = L(iMax);
                if (z11 && !zL) {
                    fD = oVar.b(iMax);
                    fE = oVar.c(iMax + 1);
                } else if (z11 && zL) {
                    fE = oVar.d(iMax);
                    fD = oVar.e(iMax + 1);
                } else if (z11 || !zL) {
                    fD = oVar.d(iMax);
                    fE = oVar.e(iMax + 1);
                } else {
                    fE = oVar.b(iMax);
                    fD = oVar.c(iMax + 1);
                }
                array[arrayStart] = fD;
                array[arrayStart + 1] = fW;
                array[arrayStart + 2] = fE;
                array[arrayStart + 3] = fL;
                arrayStart += 4;
            }
            if (iQ == iQ2) {
                return;
            } else {
                iQ++;
            }
        }
    }

    public final void b(int lineIndex, float[] array) {
        float fD;
        float fE;
        int iV = v(lineIndex);
        int iP = p(lineIndex);
        if (array.length < (iP - iV) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        o oVar = new o(this);
        int i11 = 0;
        boolean z11 = z(lineIndex) == 1;
        while (iV < iP) {
            boolean zL = L(iV);
            if (z11 && !zL) {
                fD = oVar.b(iV);
                fE = oVar.c(iV + 1);
            } else if (z11 && zL) {
                fE = oVar.d(iV);
                fD = oVar.e(iV + 1);
            } else if (zL) {
                fE = oVar.b(iV);
                fD = oVar.c(iV + 1);
            } else {
                fD = oVar.d(iV);
                fE = oVar.e(iV + 1);
            }
            array[i11] = fD;
            array[i11 + 1] = fE;
            i11 += 2;
            iV++;
        }
    }

    public final RectF c(int offset) {
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(offset);
        float fW = w(iQ);
        float fL = l(iQ);
        boolean z11 = z(iQ) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z11 || zIsRtlCharAt) {
            if (z11 && zIsRtlCharAt) {
                fA = D(offset, false);
                fA2 = D(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(offset, false);
                fA2 = A(offset + 1, true);
            } else {
                fD = D(offset, false);
                fD2 = D(offset + 1, true);
            }
            float f11 = fA;
            fD = fA2;
            fD2 = f11;
        } else {
            fD = A(offset, false);
            fD2 = A(offset + 1, true);
        }
        return new RectF(fD, fW, fD2, fL);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int f() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final float k(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : w(line) - this.lastLineFontMetrics.ascent);
    }

    public final float l(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int n(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int o(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int p(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int q(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int r(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float s(int lineIndex) {
        return l(lineIndex) - w(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : BitmapDescriptorFactory.HUE_RED);
    }

    public final float u(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : BitmapDescriptorFactory.HUE_RED);
    }

    public final int v(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float w(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int x(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? j().e(lineIndex) : this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex);
    }

    public final int y(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * g(line)));
    }

    public final int z(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public /* synthetic */ i0(CharSequence charSequence, float f11, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12, float f12, float f13, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, s sVar, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        s sVar2;
        int i21 = (i19 & 8) != 0 ? 0 : i11;
        TextUtils.TruncateAt truncateAt2 = (i19 & 16) != 0 ? null : truncateAt;
        int i22 = (i19 & 32) != 0 ? 2 : i12;
        float f14 = (i19 & 64) != 0 ? 1.0f : f12;
        float f15 = (i19 & 128) != 0 ? 0.0f : f13;
        boolean z13 = (i19 & 256) != 0 ? false : z11;
        boolean z14 = (i19 & 512) != 0 ? true : z12;
        int i23 = (i19 & 1024) != 0 ? Integer.MAX_VALUE : i13;
        int i24 = (i19 & 2048) != 0 ? 0 : i14;
        int i25 = (i19 & 4096) != 0 ? 0 : i15;
        int i26 = (i19 & PKIFailureInfo.certRevoked) != 0 ? 0 : i16;
        int i27 = (i19 & 16384) != 0 ? 0 : i17;
        int i28 = (32768 & i19) != 0 ? 0 : i18;
        int[] iArr3 = (65536 & i19) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i19) != 0 ? null : iArr2;
        if ((i19 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            sVar2 = new s(charSequence2, textPaint2, i22);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            sVar2 = sVar;
        }
        this(charSequence2, f11, textPaint2, i21, truncateAt2, i22, f14, f15, z13, z14, i23, i24, i25, i26, i27, i28, iArr3, iArr4, sVar2);
    }
}
