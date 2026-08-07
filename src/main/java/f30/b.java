package f30;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf30/b;", "", "<init>", "()V", "", "cardNumber", "Lcom/stripe/android/model/h;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/h;", "", "b", "(Ljava/lang/String;)Z", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f63902a = new b();

    private b() {
    }

    @jn0.e
    public static final com.stripe.android.model.h a(String cardNumber) {
        return (cardNumber == null || p013kotlin.text.t.y0(cardNumber)) ? com.stripe.android.model.h.Unknown : com.stripe.android.model.h.INSTANCE.a(new h30.f.Unvalidated(cardNumber).getNormalized());
    }

    public final boolean b(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        int length = cardNumber.length() - 1;
        int i11 = 0;
        boolean z11 = true;
        while (-1 < length) {
            char cCharAt = cardNumber.charAt(length);
            if (!Character.isDigit(cCharAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(cCharAt);
            boolean z12 = !z11;
            if (!z11) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i11 += numericValue;
            length--;
            z11 = z12;
        }
        return i11 % 10 == 0;
    }
}
