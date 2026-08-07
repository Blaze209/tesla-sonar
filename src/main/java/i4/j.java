package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.t3;
import k3.w0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJP\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JX\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b1\u00102J(\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J*\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020G2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020G2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010IJ\u001b\u0010K\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bM\u0010=J\u0015\u0010N\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bR\u0010QJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010QJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010QJ\u0015\u0010U\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010OJ\u001f\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bY\u0010ZR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b^\u0010\u0010\u001a\u0004\b_\u0010`R\u0017\u0010d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bJ\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010g\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\be\u0010fR\u0017\u0010i\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bM\u0010%\u001a\u0004\bh\u0010fR\u0017\u0010k\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bb\u0010\u0010\u001a\u0004\bj\u0010`R\u001f\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010t\u001a\b\u0012\u0004\u0012\u00020r0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010n\u001a\u0004\bs\u0010pR\u0014\u0010w\u001a\u00020u8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010vR\u0011\u0010x\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bm\u0010fR\u0011\u0010z\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\by\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Li4/j;", "", "Li4/k;", "intrinsics", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "maxLines", "", "ellipsis", "<init>", "(Li4/k;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "Ljn0/h0;", "H", "(I)V", "I", "lineIndex", "J", "Lk3/j1;", "canvas", "Lk3/p1;", "color", "Lk3/e4;", "shadow", "Lt4/k;", "decoration", "Lm3/g;", "drawStyle", "Lk3/b1;", "blendMode", "D", "(Lk3/j1;JLk3/e4;Lt4/k;Lm3/g;I)V", "Lk3/h1;", "brush", "", "alpha", Gender.FEMALE, "(Lk3/j1;Lk3/h1;FLk3/e4;Lt4/k;Lm3/g;I)V", "start", "end", "Lk3/t3;", "x", "(II)Lk3/t3;", "vertical", "p", "(F)I", "Lj3/g;", "position", "u", "(J)I", "Lj3/i;", "rect", "Li4/g0;", "granularity", "Li4/k0;", "inclusionStrategy", "Li4/p0;", "z", "(Lj3/i;ILi4/k0;)J", DateTokenConverter.CONVERTER_KEY, "(I)Lj3/i;", "range", "", "array", "arrayStart", "a", "(J[FI)[F", "usePrimaryDirection", IntegerTokenConverter.CONVERTER_KEY, "(IZ)F", "Lt4/i;", "v", "(I)Lt4/i;", "c", "B", "(I)J", "e", "o", "(I)I", "q", "(I)F", "r", "t", "l", "s", "visibleEnd", "n", "(IZ)I", "C", "(I)Z", "Li4/k;", "j", "()Li4/k;", "b", "getMaxLines", "()I", "Z", "f", "()Z", "didExceedMaxLines", "A", "()F", Snapshot.WIDTH, "h", Snapshot.HEIGHT, "m", "lineCount", "", "g", "Ljava/util/List;", "y", "()Ljava/util/List;", "placeholderRects", "Li4/p;", "w", "paragraphInfoList", "Li4/d;", "()Li4/d;", "annotatedString", "firstBaseline", "k", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<j3.i> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphInfo> paragraphInfoList;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "paragraphInfo", "Ljn0/h0;", "a", "(Li4/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ParagraphInfo, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f75732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float[] f75733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.l0 f75734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.k0 f75735f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, float[] fArr, p013kotlin.jvm.internal.l0 l0Var, p013kotlin.jvm.internal.k0 k0Var) {
            super(1);
            this.f75732c = j11;
            this.f75733d = fArr;
            this.f75734e = l0Var;
            this.f75735f = k0Var;
        }

        public final void a(ParagraphInfo paragraphInfo) {
            long j11 = this.f75732c;
            float[] fArr = this.f75733d;
            p013kotlin.jvm.internal.l0 l0Var = this.f75734e;
            p013kotlin.jvm.internal.k0 k0Var = this.f75735f;
            long jB = q0.b(paragraphInfo.r(paragraphInfo.getStartIndex() > p0.l(j11) ? paragraphInfo.getStartIndex() : p0.l(j11)), paragraphInfo.r(paragraphInfo.getEndIndex() < p0.k(j11) ? paragraphInfo.getEndIndex() : p0.k(j11)));
            paragraphInfo.getParagraph().o(jB, fArr, l0Var.f86527a);
            int iJ = l0Var.f86527a + (p0.j(jB) * 4);
            for (int i11 = l0Var.f86527a; i11 < iJ; i11 += 4) {
                int i12 = i11 + 1;
                float f11 = fArr[i12];
                float f12 = k0Var.f86525a;
                fArr[i12] = f11 + f12;
                int i13 = i11 + 3;
                fArr[i13] = fArr[i13] + f12;
            }
            l0Var.f86527a = iJ;
            k0Var.f86525a += paragraphInfo.getParagraph().getHeight();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(ParagraphInfo paragraphInfo) {
            a(paragraphInfo);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/p;", "paragraphInfo", "Ljn0/h0;", "a", "(Li4/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<ParagraphInfo, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t3 f75736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f75737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f75738e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t3 t3Var, int i11, int i12) {
            super(1);
            this.f75736c = t3Var;
            this.f75737d = i11;
            this.f75738e = i12;
        }

        public final void a(ParagraphInfo paragraphInfo) {
            t3.j(this.f75736c, paragraphInfo.j(paragraphInfo.getParagraph().w(paragraphInfo.r(this.f75737d), paragraphInfo.r(this.f75738e))), 0L, 2, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(ParagraphInfo paragraphInfo) {
            a(paragraphInfo);
            return jn0.h0.f84049a;
        }
    }

    public /* synthetic */ j(k kVar, long j11, int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, j11, i11, z11);
    }

    public static /* synthetic */ void G(j jVar, j1 j1Var, h1 h1Var, float f11, Shadow e4Var, t4.k kVar, m3.g gVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = Float.NaN;
        }
        jVar.F(j1Var, h1Var, f11, (i12 & 8) != 0 ? null : e4Var, (i12 & 16) != 0 ? null : kVar, (i12 & 32) != 0 ? null : gVar, (i12 & 64) != 0 ? m3.f.INSTANCE.a() : i11);
    }

    private final void H(int offset) {
        if (offset < 0 || offset >= b().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + b().length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    private final void I(int offset) {
        if (offset < 0 || offset > b().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void J(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    private final d b() {
        return this.intrinsics.getAnnotatedString();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final long B(int offset) {
        I(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == b().length() ? p013kotlin.collections.v.o(this.paragraphInfoList) : m.a(this.paragraphInfoList, offset));
        return paragraphInfo.k(paragraphInfo.getParagraph().i(paragraphInfo.r(offset)), false);
    }

    public final boolean C(int lineIndex) {
        J(lineIndex);
        return this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex)).getParagraph().t(lineIndex);
    }

    public final void D(j1 canvas, long color, Shadow shadow, t4.k decoration, m3.g drawStyle, int blendMode) {
        canvas.u();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = list.get(i11);
            paragraphInfo.getParagraph().s(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.c(BitmapDescriptorFactory.HUE_RED, paragraphInfo.getParagraph().getHeight());
        }
        canvas.o();
    }

    public final void F(j1 canvas, h1 brush, float alpha, Shadow shadow, t4.k decoration, m3.g drawStyle, int blendMode) {
        q4.b.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final float[] a(long range, float[] array, int arrayStart) {
        H(p0.l(range));
        I(p0.k(range));
        p013kotlin.jvm.internal.l0 l0Var = new p013kotlin.jvm.internal.l0();
        l0Var.f86527a = arrayStart;
        m.d(this.paragraphInfoList, range, new a(range, array, l0Var, new p013kotlin.jvm.internal.k0()));
        return array;
    }

    public final t4.i c(int offset) {
        I(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == b().length() ? p013kotlin.collections.v.o(this.paragraphInfoList) : m.a(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().B(paragraphInfo.r(offset));
    }

    public final j3.i d(int offset) {
        H(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.a(this.paragraphInfoList, offset));
        return paragraphInfo.i(paragraphInfo.getParagraph().C(paragraphInfo.r(offset)));
    }

    public final j3.i e(int offset) {
        I(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == b().length() ? p013kotlin.collections.v.o(this.paragraphInfoList) : m.a(this.paragraphInfoList, offset));
        return paragraphInfo.i(paragraphInfo.getParagraph().q(paragraphInfo.r(offset)));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float g() {
        return this.paragraphInfoList.isEmpty() ? BitmapDescriptorFactory.HUE_RED : this.paragraphInfoList.get(0).getParagraph().j();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float i(int offset, boolean usePrimaryDirection) {
        I(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == b().length() ? p013kotlin.collections.v.o(this.paragraphInfoList) : m.a(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().x(paragraphInfo.r(offset), usePrimaryDirection);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getIntrinsics() {
        return this.intrinsics;
    }

    public final float k() {
        if (this.paragraphInfoList.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) p013kotlin.collections.v.A0(this.paragraphInfoList);
        return paragraphInfo.o(paragraphInfo.getParagraph().z());
    }

    public final float l(int lineIndex) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().c(paragraphInfo.s(lineIndex)));
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int n(int lineIndex, boolean visibleEnd) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().l(paragraphInfo.s(lineIndex), visibleEnd));
    }

    public final int o(int offset) {
        int iA;
        if (offset >= b().length()) {
            iA = p013kotlin.collections.v.o(this.paragraphInfoList);
        } else {
            iA = offset < 0 ? 0 : m.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.n(paragraphInfo.getParagraph().A(paragraphInfo.r(offset)));
    }

    public final int p(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.c(this.paragraphInfoList, vertical));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.n(paragraphInfo.getParagraph().m(paragraphInfo.t(vertical)));
    }

    public final float q(int lineIndex) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().n(paragraphInfo.s(lineIndex));
    }

    public final float r(int lineIndex) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().u(paragraphInfo.s(lineIndex));
    }

    public final int s(int lineIndex) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().b(paragraphInfo.s(lineIndex)));
    }

    public final float t(int lineIndex) {
        J(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().a(paragraphInfo.s(lineIndex)));
    }

    public final int u(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(m.c(this.paragraphInfoList, j3.g.n(position)));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.m(paragraphInfo.getParagraph().k(paragraphInfo.q(position)));
    }

    public final t4.i v(int offset) {
        I(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == b().length() ? p013kotlin.collections.v.o(this.paragraphInfoList) : m.a(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().g(paragraphInfo.r(offset));
    }

    public final List<ParagraphInfo> w() {
        return this.paragraphInfoList;
    }

    public final t3 x(int start, int end) {
        if (start >= 0 && start <= end && end <= b().getText().length()) {
            if (start == end) {
                return w0.a();
            }
            t3 t3VarA = w0.a();
            m.d(this.paragraphInfoList, q0.b(start, end), new b(t3VarA, start, end));
            return t3VarA;
        }
        throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + b().getText().length() + "), or start > end!").toString());
    }

    public final List<j3.i> y() {
        return this.placeholderRects;
    }

    public final long z(j3.i rect, int granularity, k0 inclusionStrategy) {
        p0.Companion companion;
        p0.Companion companion2;
        int iC = m.c(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iC).getBottom() >= rect.getBottom() || iC == p013kotlin.collections.v.o(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iC);
            return ParagraphInfo.l(paragraphInfo, paragraphInfo.getParagraph().h(paragraphInfo.p(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iC2 = m.c(this.paragraphInfoList, rect.getBottom());
        long jA = p0.INSTANCE.a();
        while (true) {
            companion = p0.INSTANCE;
            if (!p0.g(jA, companion.a()) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iC);
            jA = ParagraphInfo.l(paragraphInfo2, paragraphInfo2.getParagraph().h(paragraphInfo2.p(rect), granularity, inclusionStrategy), false, 1, null);
            iC++;
        }
        if (p0.g(jA, companion.a())) {
            return companion.a();
        }
        long jA2 = companion.a();
        while (true) {
            companion2 = p0.INSTANCE;
            if (!p0.g(jA2, companion2.a()) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iC2);
            jA2 = ParagraphInfo.l(paragraphInfo3, paragraphInfo3.getParagraph().h(paragraphInfo3.p(rect), granularity, inclusionStrategy), false, 1, null);
            iC2--;
        }
        return p0.g(jA2, companion2.a()) ? jA : q0.b(p0.n(jA), p0.i(jA2));
    }

    private j(k kVar, long j11, int i11, boolean z11) {
        boolean z12;
        this.intrinsics = kVar;
        this.maxLines = i11;
        if (w4.b.n(j11) != 0 || w4.b.m(j11) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listE = kVar.e();
        int size = listE.size();
        int i12 = 0;
        float f11 = 0.0f;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z12 = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listE.get(i13);
            o oVarC = t.c(paragraphIntrinsicInfo.getIntrinsics(), w4.c.b(0, w4.b.l(j11), 0, w4.b.g(j11) ? bo0.n.f(w4.b.k(j11) - t.d(f11), 0) : w4.b.k(j11), 5, null), this.maxLines - i12, z11);
            float height = f11 + oVarC.getHeight();
            int iE = i12 + oVarC.e();
            arrayList.add(new ParagraphInfo(oVarC, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, iE, f11, height));
            if (oVarC.v() || (iE == this.maxLines && i13 != p013kotlin.collections.v.o(this.intrinsics.e()))) {
                z12 = true;
                i12 = iE;
                f11 = height;
                break;
            } else {
                i13++;
                i12 = iE;
                f11 = height;
            }
        }
        this.height = f11;
        this.lineCount = i12;
        this.didExceedMaxLines = z12;
        this.paragraphInfoList = arrayList;
        this.width = w4.b.l(j11);
        List<j3.i> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
            List<j3.i> listD = paragraphInfo.getParagraph().D();
            ArrayList arrayList3 = new ArrayList(listD.size());
            int size3 = listD.size();
            for (int i15 = 0; i15 < size3; i15++) {
                j3.i iVar = listD.get(i15);
                arrayList3.add(iVar != null ? paragraphInfo.i(iVar) : null);
            }
            p013kotlin.collections.v.E(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.g().size()) {
            int size4 = this.intrinsics.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = p013kotlin.collections.v.P0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }
}
