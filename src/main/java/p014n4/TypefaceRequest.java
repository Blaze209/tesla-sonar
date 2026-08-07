package p014n4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: n4.e1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Ln4/e1;", "", "Ln4/q;", "fontFamily", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Ln4/q;Ln4/f0;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ln4/q;Ln4/f0;IILjava/lang/Object;)Ln4/e1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln4/q;", "c", "()Ln4/q;", "b", "Ln4/f0;", "f", "()Ln4/f0;", "I", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TypefaceRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontSynthesis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(q qVar, FontWeight fontWeight, int i11, int i12, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, fontWeight, i11, i12, obj);
    }

    public static /* synthetic */ TypefaceRequest b(TypefaceRequest typefaceRequest, q qVar, FontWeight fontWeight, int i11, int i12, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            qVar = typefaceRequest.fontFamily;
        }
        if ((i13 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i13 & 4) != 0) {
            i11 = typefaceRequest.fontStyle;
        }
        if ((i13 & 8) != 0) {
            i12 = typefaceRequest.fontSynthesis;
        }
        if ((i13 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i14 = i11;
        return typefaceRequest.a(qVar, fontWeight, i14, i12, obj3);
    }

    public final TypefaceRequest a(q fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return s.f(this.fontFamily, typefaceRequest.fontFamily) && s.f(this.fontWeight, typefaceRequest.fontWeight) && b0.f(this.fontStyle, typefaceRequest.fontStyle) && c0.h(this.fontSynthesis, typefaceRequest.fontSynthesis) && s.f(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        q qVar = this.fontFamily;
        int iHashCode = (((((((qVar == null ? 0 : qVar.hashCode()) * 31) + this.fontWeight.getWeight()) * 31) + b0.g(this.fontStyle)) * 31) + c0.i(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) b0.h(this.fontStyle)) + ", fontSynthesis=" + ((Object) c0.l(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TypefaceRequest(q qVar, FontWeight fontWeight, int i11, int i12, Object obj) {
        this.fontFamily = qVar;
        this.fontWeight = fontWeight;
        this.fontStyle = i11;
        this.fontSynthesis = i12;
        this.resourceLoaderCacheKey = obj;
    }
}
