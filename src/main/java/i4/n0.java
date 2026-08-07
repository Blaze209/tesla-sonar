package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Li4/n0;", "", "Li4/d0;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Li4/d0;Li4/d0;Li4/d0;Li4/d0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Li4/d0;", DateTokenConverter.CONVERTER_KEY, "()Li4/d0;", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle style;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle focusedStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle hoveredStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle pressedStyle;

    public n0() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return p013kotlin.jvm.internal.s.f(this.style, n0Var.style) && p013kotlin.jvm.internal.s.f(this.focusedStyle, n0Var.focusedStyle) && p013kotlin.jvm.internal.s.f(this.hoveredStyle, n0Var.hoveredStyle) && p013kotlin.jvm.internal.s.f(this.pressedStyle, n0Var.pressedStyle);
    }

    public int hashCode() {
        SpanStyle d0Var = this.style;
        int iHashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        SpanStyle d0Var2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31;
        SpanStyle d0Var3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (d0Var3 != null ? d0Var3.hashCode() : 0)) * 31;
        SpanStyle d0Var4 = this.pressedStyle;
        return iHashCode3 + (d0Var4 != null ? d0Var4.hashCode() : 0);
    }

    public n0(SpanStyle d0Var, SpanStyle d0Var2, SpanStyle d0Var3, SpanStyle d0Var4) {
        this.style = d0Var;
        this.focusedStyle = d0Var2;
        this.hoveredStyle = d0Var3;
        this.pressedStyle = d0Var4;
    }

    public /* synthetic */ n0(SpanStyle d0Var, SpanStyle d0Var2, SpanStyle d0Var3, SpanStyle d0Var4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d0Var, (i11 & 2) != 0 ? null : d0Var2, (i11 & 4) != 0 ? null : d0Var3, (i11 & 8) != 0 ? null : d0Var4);
    }
}
