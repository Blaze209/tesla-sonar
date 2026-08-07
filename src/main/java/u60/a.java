package u60;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n0;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lu60/a;", "", "<init>", "(Ljava/lang/String;I)V", "Lu60/e;", OrcaKeys.METADATA, "", "isMetBy", "(Lu60/e;)Z", "Unsupported", "UnsupportedForSetup", "ShippingAddress", "MerchantSupportsDelayedPaymentMethods", "FinancialConnectionsSdk", "ValidUsBankVerificationMethod", "InstantDebits", "LinkCardBrand", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a {
    Unsupported { // from class: u60.a.f
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return false;
        }
    },
    UnsupportedForSetup { // from class: u60.a.g
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return !metadata.w();
        }
    },
    ShippingAddress { // from class: u60.a.e
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            if (metadata.getAllowsPaymentMethodsRequiringShippingAddress()) {
                return true;
            }
            StripeIntent stripeIntent = metadata.getStripeIntent();
            PaymentIntent paymentIntent = stripeIntent instanceof PaymentIntent ? (PaymentIntent) stripeIntent : null;
            PaymentIntent.Shipping shipping = paymentIntent != null ? paymentIntent.getShipping() : null;
            return ((shipping != null ? shipping.getName() : null) == null || shipping.getAddress().getLine1() == null || shipping.getAddress().getCountry() == null || shipping.getAddress().getPostalCode() == null) ? false : true;
        }
    },
    MerchantSupportsDelayedPaymentMethods { // from class: u60.a.d
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return metadata.getAllowsDelayedPaymentMethods();
        }
    },
    FinancialConnectionsSdk { // from class: u60.a.a
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return metadata.getFinancialConnectionsAvailable();
        }
    },
    ValidUsBankVerificationMethod { // from class: u60.a.h
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            Object obj = metadata.getStripeIntent().z2().get(PaymentMethod.p.USBankAccount.code);
            Map map = obj instanceof Map ? (Map) obj : null;
            Object obj2 = map != null ? map.get("verification_method") : null;
            return v.g0(d1.i("instant", "automatic"), obj2 instanceof String ? (String) obj2 : null) || (metadata.getStripeIntent().getClientSecret() == null);
        }
    },
    InstantDebits { // from class: u60.a.b
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return metadata.getLinkMode() != n0.LinkCardBrand && u60.b.b(metadata);
        }
    },
    LinkCardBrand { // from class: u60.a.c
        @Override // u60.a
        public boolean isMetBy(PaymentMethodMetadata metadata) {
            s.k(metadata, "metadata");
            return metadata.getLinkMode() == n0.LinkCardBrand && u60.b.b(metadata);
        }
    };

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public abstract boolean isMetBy(PaymentMethodMetadata metadata);
}
