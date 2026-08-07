package so;

import com.facebook.react.uimanager.w;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: so.k, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lso/k;", "", "", "horizontal", "vertical", "<init>", "(FF)V", "c", "()Lso/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "()F", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CornerRadii {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float horizontal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float vertical;

    public CornerRadii(float f11, float f12) {
        this.horizontal = f11;
        this.vertical = f12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getVertical() {
        return this.vertical;
    }

    public final CornerRadii c() {
        return new CornerRadii(w.h(this.horizontal), w.h(this.vertical));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CornerRadii)) {
            return false;
        }
        CornerRadii cornerRadii = (CornerRadii) other;
        return Float.compare(this.horizontal, cornerRadii.horizontal) == 0 && Float.compare(this.vertical, cornerRadii.vertical) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontal) * 31) + Float.hashCode(this.vertical);
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }
}
