package c80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f30.d0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.w1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z80.p0;

/* JADX INFO: renamed from: c80.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006'"}, d2 = {"Lc80/h;", "", "", "cvc", "Lcom/stripe/android/model/h;", "cardBrand", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/h;)V", "f", "(Ljava/lang/String;)Lc80/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "Lz80/p0;", "c", "Lz80/p0;", "cvcTextFieldConfig", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "isValid", "I", AnnotatedPrivateKey.LABEL, "Li90/w1$c;", "Li90/w1$c;", "()Li90/w1$c;", "cvcIcon", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CvcState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 cvcTextFieldConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w1.Trailing cvcIcon;

    public CvcState(String cvc, com.stripe.android.model.h cardBrand) {
        s.k(cvc, "cvc");
        s.k(cardBrand, "cardBrand");
        this.cvc = cvc;
        this.cardBrand = cardBrand;
        p0 p0Var = new p0();
        this.cvcTextFieldConfig = p0Var;
        this.isValid = p0Var.c(cardBrand, cvc, cardBrand.getMaxCvcLength()).isValid();
        this.label = cardBrand == com.stripe.android.model.h.AmericanExpress ? d0.f63941d0 : d0.f63947g0;
        this.cvcIcon = new w1.Trailing(cardBrand.getCvcIcon(), null, false, null, 10, null);
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
    public final w1.Trailing getCvcIcon() {
        return this.cvcIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcState)) {
            return false;
        }
        CvcState cvcState = (CvcState) other;
        return s.f(this.cvc, cvcState.cvc) && this.cardBrand == cvcState.cardBrand;
    }

    public final CvcState f(String cvc) {
        s.k(cvc, "cvc");
        return cvc.length() > this.cardBrand.getMaxCvcLength() ? this : new CvcState(cvc, this.cardBrand);
    }

    public int hashCode() {
        return (this.cvc.hashCode() * 31) + this.cardBrand.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.cvc + ", cardBrand=" + this.cardBrand + ")";
    }
}
