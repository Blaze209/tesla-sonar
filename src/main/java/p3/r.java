package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import k3.h1;
import k3.i4;
import k3.j4;
import k3.v3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b&\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b-\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010/R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00101R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b6\u00101R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b7\u0010!R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b8\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b9\u00101R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b:\u00101R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b;\u00101R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b<\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Lp3/r;", "Lp3/p;", "", "name", "", "Lp3/h;", "pathData", "Lk3/v3;", "pathFillType", "Lk3/h1;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lk3/i4;", "strokeLineCap", "Lk3/j4;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILk3/h1;FLk3/h1;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "I", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Lk3/h1;", "()Lk3/h1;", Gender.FEMALE, "()F", "f", "j", "g", "k", "o", "l", "m", "n", "r", "p", "q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<h> pathData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pathFillType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h1 fill;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float fillAlpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h1 stroke;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineCap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineJoin;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineMiter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float trimPathStart;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float trimPathEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float trimPathOffset;

    public /* synthetic */ r(String str, List list, int i11, h1 h1Var, float f11, h1 h1Var2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i11, h1Var, f11, h1Var2, f12, f13, i12, i13, f14, f15, f16, f17);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h1 getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && r.class == other.getClass()) {
            r rVar = (r) other;
            return s.f(this.name, rVar.name) && s.f(this.fill, rVar.fill) && this.fillAlpha == rVar.fillAlpha && s.f(this.stroke, rVar.stroke) && this.strokeAlpha == rVar.strokeAlpha && this.strokeLineWidth == rVar.strokeLineWidth && i4.e(this.strokeLineCap, rVar.strokeLineCap) && j4.e(this.strokeLineJoin, rVar.strokeLineJoin) && this.strokeLineMiter == rVar.strokeLineMiter && this.trimPathStart == rVar.trimPathStart && this.trimPathEnd == rVar.trimPathEnd && this.trimPathOffset == rVar.trimPathOffset && v3.d(this.pathFillType, rVar.pathFillType) && s.f(this.pathData, rVar.pathData);
        }
        return false;
    }

    public final List<h> h() {
        return this.pathData;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        h1 h1Var = this.fill;
        int iHashCode2 = (((iHashCode + (h1Var != null ? h1Var.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        h1 h1Var2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (h1Var2 != null ? h1Var2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + i4.f(this.strokeLineCap)) * 31) + j4.f(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + v3.e(this.pathFillType);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h1 getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, List<? extends h> list, int i11, h1 h1Var, float f11, h1 h1Var2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i11;
        this.fill = h1Var;
        this.fillAlpha = f11;
        this.stroke = h1Var2;
        this.strokeAlpha = f12;
        this.strokeLineWidth = f13;
        this.strokeLineCap = i12;
        this.strokeLineJoin = i13;
        this.strokeLineMiter = f14;
        this.trimPathStart = f15;
        this.trimPathEnd = f16;
        this.trimPathOffset = f17;
    }
}
