package n70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import f30.d0;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: n70.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u001f"}, d2 = {"Ln70/g;", "", "Lx30/c;", "displayName", "Lcom/stripe/android/model/v0;", "paymentMethod", "", "isCbcEligible", "<init>", "(Lx30/c;Lcom/stripe/android/model/v0;Z)V", "f", "()Z", "a", "()Lx30/c;", "c", "e", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lx30/c;", "b", "Lcom/stripe/android/model/v0;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/v0;", "Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisplayableSavedPaymentMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCbcEligible;

    /* JADX INFO: renamed from: n70.g$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93414a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.SepaDebit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.p.USBankAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93414a = iArr;
        }
    }

    public DisplayableSavedPaymentMethod(x30.c displayName, PaymentMethod paymentMethod, boolean z11) {
        p013kotlin.jvm.internal.s.k(displayName, "displayName");
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        this.displayName = displayName;
        this.paymentMethod = paymentMethod;
        this.isCbcEligible = z11;
    }

    public final x30.c a() {
        com.stripe.android.model.h hVarB;
        String str;
        PaymentMethod.p pVar = this.paymentMethod.type;
        int i11 = pVar == null ? -1 : a.f93414a[pVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                int i12 = x.f93506c;
                PaymentMethod.SepaDebit sepaDebit = this.paymentMethod.sepaDebit;
                return x30.d.g(i12, new Object[]{sepaDebit != null ? sepaDebit.last4 : null}, null, 4, null);
            }
            if (i11 != 3) {
                return x30.d.f("", new Object[0]);
            }
            int i13 = x.f93506c;
            PaymentMethod.USBankAccount uSBankAccount = this.paymentMethod.usBankAccount;
            return x30.d.g(i13, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
        }
        PaymentMethod.Card card = this.paymentMethod.card;
        if (card == null || (str = card.displayBrand) == null || (hVarB = com.stripe.android.model.h.INSTANCE.b(str)) == null) {
            PaymentMethod.Card card2 = this.paymentMethod.card;
            hVarB = card2 != null ? card2.brand : null;
        }
        int i14 = d0.f63935a0;
        String displayName = hVarB != null ? hVarB.getDisplayName() : null;
        PaymentMethod.Card card3 = this.paymentMethod.card;
        return x30.d.g(i14, new Object[]{displayName, card3 != null ? card3.last4 : null}, null, 4, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x30.c getDisplayName() {
        return this.displayName;
    }

    public final x30.c c() {
        return x30.d.g(x.N, new Object[]{a()}, null, 4, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final x30.c e() {
        return x30.d.g(x.f93507c0, new Object[]{a()}, null, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayableSavedPaymentMethod)) {
            return false;
        }
        DisplayableSavedPaymentMethod displayableSavedPaymentMethod = (DisplayableSavedPaymentMethod) other;
        return p013kotlin.jvm.internal.s.f(this.displayName, displayableSavedPaymentMethod.displayName) && p013kotlin.jvm.internal.s.f(this.paymentMethod, displayableSavedPaymentMethod.paymentMethod) && this.isCbcEligible == displayableSavedPaymentMethod.isCbcEligible;
    }

    public final boolean f() {
        PaymentMethod.Card.Networks networks;
        Set<String> setA;
        PaymentMethod.Card card = this.paymentMethod.card;
        return this.isCbcEligible && (card != null && (networks = card.networks) != null && (setA = networks.a()) != null && setA.size() > 1);
    }

    public int hashCode() {
        return (((this.displayName.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + Boolean.hashCode(this.isCbcEligible);
    }

    public String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.displayName + ", paymentMethod=" + this.paymentMethod + ", isCbcEligible=" + this.isCbcEligible + ")";
    }
}
