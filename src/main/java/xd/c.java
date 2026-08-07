package xd;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import ke.FieldState;
import ke.p;
import le.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import ud.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lxd/c;", "", "<init>", "()V", "", "holderName", "Lke/j;", "b", "(Ljava/lang/String;)Lke/j;", "bankAccountNumber", "a", "sortCode", DateTokenConverter.CONVERTER_KEY, EContextPaymentMethod.SHOPPER_EMAIL, "c", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f123269a = new c();

    private c() {
    }

    public final FieldState<String> a(String bankAccountNumber) {
        s.k(bankAccountNumber, "bankAccountNumber");
        return bankAccountNumber.length() == 8 ? new FieldState<>(bankAccountNumber, p.b.f85976a) : new FieldState<>(bankAccountNumber, new p.Invalid(h.f116140a, false, 2, null));
    }

    public final FieldState<String> b(String holderName) {
        s.k(holderName, "holderName");
        return t.y0(holderName) ? new FieldState<>(holderName, new p.Invalid(h.f116144e, false, 2, null)) : new FieldState<>(holderName, p.b.f85976a);
    }

    public final FieldState<String> c(String shopperEmail) {
        s.k(shopperEmail, "shopperEmail");
        return i.f89954a.b(shopperEmail) ? new FieldState<>(shopperEmail, p.b.f85976a) : new FieldState<>(shopperEmail, new p.Invalid(h.f116145f, false, 2, null));
    }

    public final FieldState<String> d(String sortCode) {
        s.k(sortCode, "sortCode");
        return sortCode.length() == 6 ? new FieldState<>(sortCode, p.b.f85976a) : new FieldState<>(sortCode, new p.Invalid(h.f116146g, false, 2, null));
    }
}
