package i4;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: i4.b0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Li4/b0;", "", "Li4/z;", "spanStyle", "Li4/y;", "paragraphStyle", "<init>", "(Li4/z;Li4/y;)V", "", "includeFontPadding", "(Z)V", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Li4/z;", "b", "()Li4/z;", "Li4/y;", "()Li4/y;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlatformTextStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final z spanStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformParagraphStyle paragraphSyle;

    public PlatformTextStyle(z zVar, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = zVar;
        this.paragraphSyle = platformParagraphStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PlatformParagraphStyle getParagraphSyle() {
        return this.paragraphSyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getSpanStyle() {
        return this.spanStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return p013kotlin.jvm.internal.s.f(this.paragraphSyle, platformTextStyle.paragraphSyle) && p013kotlin.jvm.internal.s.f(this.spanStyle, platformTextStyle.spanStyle);
    }

    public int hashCode() {
        z zVar = this.spanStyle;
        int iHashCode = (zVar != null ? zVar.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphSyle;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphSyle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public PlatformTextStyle(boolean z11) {
        this(null, new PlatformParagraphStyle(z11));
    }
}
