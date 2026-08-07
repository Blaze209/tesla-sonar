package q70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.n0;
import io0.e;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lw70/j;", "", "c", "(Lw70/j;)Ljava/lang/String;", "", "f", "(Lw70/j;)Ljava/util/Map;", "e", "Lio0/b;", "", DateTokenConverter.CONVERTER_KEY, "(J)F", "asSeconds", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final String c(j jVar) {
        if (jVar instanceof j.c) {
            return "google_pay";
        }
        if (jVar instanceof j.d) {
            return "link";
        }
        if (jVar instanceof j.e) {
            return ((j.e) jVar).getPaymentMethodCreateParams().i();
        }
        if (jVar instanceof j.Saved) {
            PaymentMethod.p pVar = ((j.Saved) jVar).getPaymentMethod().type;
            if (pVar != null) {
                return pVar.code;
            }
            return null;
        }
        if (jVar instanceof j.ExternalPaymentMethod) {
            return ((j.ExternalPaymentMethod) jVar).getType();
        }
        if (jVar == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(long j11) {
        return (float) io0.b.H(j11, e.SECONDS);
    }

    public static final String e(j jVar) {
        if (jVar instanceof j.d) {
            return "wallet";
        }
        if (jVar instanceof j.e.USBankAccount) {
            j.e.USBankAccount.InstantDebitsInfo instantDebits = ((j.e.USBankAccount) jVar).getInstantDebits();
            if (instantDebits != null) {
                return instantDebits.getLinkMode() == n0.LinkCardBrand ? "link_card_brand" : "instant_debits";
            }
            return null;
        }
        boolean z11 = true;
        if (!(jVar instanceof j.c ? true : jVar instanceof j.e ? true : jVar instanceof j.Saved ? true : jVar instanceof j.ExternalPaymentMethod) && jVar != null) {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> f(j jVar) {
        return s90.b.a(v0.m(x.a("selected_lpm", c(jVar)), x.a("link_context", e(jVar))));
    }
}
