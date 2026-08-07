package b90;

import android.text.SpannableString;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b90.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, d2 = {"Lb90/d;", "", "Landroid/text/SpannableString;", "primaryText", "secondaryText", "", "placeId", "<init>", "(Landroid/text/SpannableString;Landroid/text/SpannableString;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/text/SpannableString;", "b", "()Landroid/text/SpannableString;", "c", "Ljava/lang/String;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AutocompletePrediction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpannableString primaryText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpannableString secondaryText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeId;

    public AutocompletePrediction(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        s.k(primaryText, "primaryText");
        s.k(secondaryText, "secondaryText");
        s.k(placeId, "placeId");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.placeId = placeId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpannableString getPrimaryText() {
        return this.primaryText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SpannableString getSecondaryText() {
        return this.secondaryText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompletePrediction)) {
            return false;
        }
        AutocompletePrediction autocompletePrediction = (AutocompletePrediction) other;
        return s.f(this.primaryText, autocompletePrediction.primaryText) && s.f(this.secondaryText, autocompletePrediction.secondaryText) && s.f(this.placeId, autocompletePrediction.placeId);
    }

    public int hashCode() {
        return (((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.placeId.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.primaryText;
        SpannableString spannableString2 = this.secondaryText;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + this.placeId + ")";
    }
}
