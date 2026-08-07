package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v1.d0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b \u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lv1/d0;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/j;", "crossAxisAlignment", "Lv1/q;", "flowLayoutData", "<init>", "(FZLandroidx/compose/foundation/layout/j;Lv1/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "g", "(F)V", "b", "Z", "()Z", "f", "(Z)V", "c", "Landroidx/compose/foundation/layout/j;", "()Landroidx/compose/foundation/layout/j;", "e", "(Landroidx/compose/foundation/layout/j;)V", "Lv1/q;", "()Lv1/q;", "setFlowLayoutData", "(Lv1/q;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RowColumnParentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private float weight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean fill;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private androidx.compose.foundation.layout.j crossAxisAlignment;

    public RowColumnParentData(float f11, boolean z11, androidx.compose.foundation.layout.j jVar, q qVar) {
        this.weight = f11;
        this.fill = z11;
        this.crossAxisAlignment = jVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.foundation.layout.j getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    public final q c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public final void e(androidx.compose.foundation.layout.j jVar) {
        this.crossAxisAlignment = jVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && p013kotlin.jvm.internal.s.f(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && p013kotlin.jvm.internal.s.f(null, null);
    }

    public final void f(boolean z11) {
        this.fill = z11;
    }

    public final void g(float f11) {
        this.weight = f11;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        androidx.compose.foundation.layout.j jVar = this.crossAxisAlignment;
        return (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + ((Object) null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ RowColumnParentData(float f11, boolean z11, androidx.compose.foundation.layout.j jVar, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : jVar, (i11 & 8) != 0 ? null : qVar);
    }
}
