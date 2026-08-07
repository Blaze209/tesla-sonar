package t60;

import com.stripe.android.paymentsheet.y;
import java.util.Map;
import p010i90.IdentifierSpec;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import z80.EmailSpec;
import z80.NameSpec;
import z80.PhoneSpec;
import z80.o2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lt60/a;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/stripe/android/paymentsheet/y$d;", "configuration", "Lcom/stripe/android/paymentsheet/y$d$b;", "collectionMode", "(Lcom/stripe/android/paymentsheet/y$d;)Lcom/stripe/android/paymentsheet/y$d$b;", "", "Li90/g0;", "", "initialValues", "Li90/d0;", "formElement", "(Ljava/util/Map;)Li90/d0;", "", "isAllowed", "(Lcom/stripe/android/paymentsheet/y$d;)Z", "isRequired", "Name", "Phone", "Email", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a {
    Name { // from class: t60.a.b
        @Override // t60.a
        public y.BillingDetailsCollectionConfiguration.b collectionMode(y.BillingDetailsCollectionConfiguration configuration) {
            s.k(configuration, "configuration");
            return configuration.getName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t60.a
        public d0 formElement(Map<IdentifierSpec, String> initialValues) {
            s.k(initialValues, "initialValues");
            return new NameSpec((IdentifierSpec) null, (o2) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)).f(initialValues);
        }
    },
    Phone { // from class: t60.a.c
        @Override // t60.a
        public y.BillingDetailsCollectionConfiguration.b collectionMode(y.BillingDetailsCollectionConfiguration configuration) {
            s.k(configuration, "configuration");
            return configuration.getPhone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t60.a
        public d0 formElement(Map<IdentifierSpec, String> initialValues) {
            s.k(initialValues, "initialValues");
            return new PhoneSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)).e(initialValues);
        }
    },
    Email { // from class: t60.a.a
        @Override // t60.a
        public y.BillingDetailsCollectionConfiguration.b collectionMode(y.BillingDetailsCollectionConfiguration configuration) {
            s.k(configuration, "configuration");
            return configuration.getEmail();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t60.a
        public d0 formElement(Map<IdentifierSpec, String> initialValues) {
            s.k(initialValues, "initialValues");
            return new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)).e(initialValues);
        }
    };

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public abstract y.BillingDetailsCollectionConfiguration.b collectionMode(y.BillingDetailsCollectionConfiguration configuration);

    public abstract d0 formElement(Map<IdentifierSpec, String> initialValues);

    public final boolean isAllowed(y.BillingDetailsCollectionConfiguration configuration) {
        s.k(configuration, "configuration");
        return collectionMode(configuration) != y.BillingDetailsCollectionConfiguration.b.Never;
    }

    public final boolean isRequired(y.BillingDetailsCollectionConfiguration configuration) {
        s.k(configuration, "configuration");
        return collectionMode(configuration) == y.BillingDetailsCollectionConfiguration.b.Always;
    }
}
