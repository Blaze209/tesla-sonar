package androidx.compose.foundation.lazy;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Lb4/s0;", "Landroidx/compose/foundation/lazy/b;", "", "fraction", "Lr2/y3;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLr2/y3;Lr2/y3;Ljava/lang/String;)V", "o", "()Landroidx/compose/foundation/lazy/b;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/foundation/lazy/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", Gender.FEMALE, "getFraction", "()F", "c", "Lr2/y3;", "getWidthState", "()Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "getHeightState", "e", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ParentSizeElement extends s0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y3<Integer> widthState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3<Integer> heightState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    public /* synthetic */ ParentSizeElement(float f11, y3 y3Var, y3 y3Var2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, (i11 & 2) != 0 ? null : y3Var, (i11 & 4) != 0 ? null : y3Var2, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) other;
        return this.fraction == parentSizeElement.fraction && s.f(this.widthState, parentSizeElement.widthState) && s.f(this.heightState, parentSizeElement.heightState);
    }

    public int hashCode() {
        y3<Integer> y3Var = this.widthState;
        int iHashCode = (y3Var != null ? y3Var.hashCode() : 0) * 31;
        y3<Integer> y3Var2 = this.heightState;
        return ((iHashCode + (y3Var2 != null ? y3Var2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b i() {
        return new b(this.fraction, this.widthState, this.heightState);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(b node) {
        node.x2(this.fraction);
        node.z2(this.widthState);
        node.y2(this.heightState);
    }

    public ParentSizeElement(float f11, y3<Integer> y3Var, y3<Integer> y3Var2, String str) {
        this.fraction = f11;
        this.widthState = y3Var;
        this.heightState = y3Var2;
        this.inspectorName = str;
    }
}
