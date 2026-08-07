package so;

import com.facebook.react.uimanager.LengthPercentage;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: so.i, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lso/i;", "", "", "color", "Lcom/facebook/react/uimanager/o;", "position", "<init>", "(Ljava/lang/Integer;Lcom/facebook/react/uimanager/o;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "b", "Lcom/facebook/react/uimanager/o;", "()Lcom/facebook/react/uimanager/o;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ColorStop {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LengthPercentage position;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorStop() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LengthPercentage getPosition() {
        return this.position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorStop)) {
            return false;
        }
        ColorStop colorStop = (ColorStop) other;
        return s.f(this.color, colorStop.color) && s.f(this.position, colorStop.position);
    }

    public int hashCode() {
        Integer num = this.color;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LengthPercentage lengthPercentage = this.position;
        return iHashCode + (lengthPercentage != null ? lengthPercentage.hashCode() : 0);
    }

    public String toString() {
        return "ColorStop(color=" + this.color + ", position=" + this.position + ")";
    }

    public ColorStop(Integer num, LengthPercentage lengthPercentage) {
        this.color = num;
        this.position = lengthPercentage;
    }

    public /* synthetic */ ColorStop(Integer num, LengthPercentage lengthPercentage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : lengthPercentage);
    }
}
