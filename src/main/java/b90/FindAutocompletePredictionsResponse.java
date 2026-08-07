package b90;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b90.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb90/f;", "", "", "Lb90/d;", "autocompletePredictions", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FindAutocompletePredictionsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AutocompletePrediction> autocompletePredictions;

    public FindAutocompletePredictionsResponse(List<AutocompletePrediction> autocompletePredictions) {
        s.k(autocompletePredictions, "autocompletePredictions");
        this.autocompletePredictions = autocompletePredictions;
    }

    public final List<AutocompletePrediction> a() {
        return this.autocompletePredictions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FindAutocompletePredictionsResponse) && s.f(this.autocompletePredictions, ((FindAutocompletePredictionsResponse) other).autocompletePredictions);
    }

    public int hashCode() {
        return this.autocompletePredictions.hashCode();
    }

    public String toString() {
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + this.autocompletePredictions + ")";
    }
}
