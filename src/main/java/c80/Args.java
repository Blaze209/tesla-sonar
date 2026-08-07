package c80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c80.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lc80/a;", "", "", "lastFour", "Lcom/stripe/android/model/h;", "cardBrand", "cvc", "", "isTestMode", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/h;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Args {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTestMode;

    public Args(String lastFour, com.stripe.android.model.h cardBrand, String cvc, boolean z11) {
        s.k(lastFour, "lastFour");
        s.k(cardBrand, "cardBrand");
        s.k(cvc, "cvc");
        this.lastFour = lastFour;
        this.cardBrand = cardBrand;
        this.cvc = cvc;
        this.isTestMode = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.stripe.android.model.h getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Args)) {
            return false;
        }
        Args args = (Args) other;
        return s.f(this.lastFour, args.lastFour) && this.cardBrand == args.cardBrand && s.f(this.cvc, args.cvc) && this.isTestMode == args.isTestMode;
    }

    public int hashCode() {
        return (((((this.lastFour.hashCode() * 31) + this.cardBrand.hashCode()) * 31) + this.cvc.hashCode()) * 31) + Boolean.hashCode(this.isTestMode);
    }

    public String toString() {
        return "Args(lastFour=" + this.lastFour + ", cardBrand=" + this.cardBrand + ", cvc=" + this.cvc + ", isTestMode=" + this.isTestMode + ")";
    }
}
