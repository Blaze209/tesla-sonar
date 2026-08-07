package g80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: g80.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002\r#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lg80/a;", "Landroid/os/Parcelable;", "", "id", "ephemeralKeySecret", "customerSessionClientSecret", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lg80/a$c;", "permissions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lg80/a$c;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lg80/a$c;)Lg80/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "c", "t2", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "e", "Lg80/a$c;", "()Lg80/a$c;", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomerState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ephemeralKeySecret;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerSessionClientSecret;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentMethod> paymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Permissions permissions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67472g = 8;
    public static final Parcelable.Creator<CustomerState> CREATOR = new b();

    /* JADX INFO: renamed from: g80.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg80/a$a;", "", "<init>", "()V", "Lcom/stripe/android/model/h0$d;", "customer", "", "Lcom/stripe/android/model/v0$p;", "supportedSavedPaymentMethodTypes", "", "customerSessionClientSecret", "Lg80/a;", "a", "(Lcom/stripe/android/model/h0$d;Ljava/util/List;Ljava/lang/String;)Lg80/a;", "customerId", "Lcom/stripe/android/paymentsheet/y$i$b;", "accessType", "Lcom/stripe/android/model/v0;", "paymentMethods", "b", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$i$b;Ljava/util/List;)Lg80/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomerState a(ElementsSession.Customer customer, List<? extends PaymentMethod.p> supportedSavedPaymentMethodTypes, String customerSessionClientSecret) {
            boolean isPaymentMethodRemoveEnabled;
            s.k(customer, "customer");
            s.k(supportedSavedPaymentMethodTypes, "supportedSavedPaymentMethodTypes");
            s.k(customerSessionClientSecret, "customerSessionClientSecret");
            ElementsSession.Customer.Components.c mobilePaymentElement = customer.getSession().getComponents().getMobilePaymentElement();
            if (mobilePaymentElement instanceof ElementsSession.Customer.Components.c.Enabled) {
                isPaymentMethodRemoveEnabled = ((ElementsSession.Customer.Components.c.Enabled) mobilePaymentElement).getIsPaymentMethodRemoveEnabled();
            } else {
                if (!(mobilePaymentElement instanceof ElementsSession.Customer.Components.c.C0896a)) {
                    throw new NoWhenBranchMatchedException();
                }
                isPaymentMethodRemoveEnabled = false;
            }
            String customerId = customer.getSession().getCustomerId();
            String apiKey = customer.getSession().getApiKey();
            List<PaymentMethod> listA = customer.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (v.g0(supportedSavedPaymentMethodTypes, ((PaymentMethod) obj).type)) {
                    arrayList.add(obj);
                }
            }
            return new CustomerState(customerId, apiKey, customerSessionClientSecret, arrayList, new Permissions(isPaymentMethodRemoveEnabled, true));
        }

        public final CustomerState b(String customerId, y.i.LegacyCustomerEphemeralKey accessType, List<PaymentMethod> paymentMethods) {
            s.k(customerId, "customerId");
            s.k(accessType, "accessType");
            s.k(paymentMethods, "paymentMethods");
            return new CustomerState(customerId, accessType.getEphemeralKeySecret(), null, paymentMethods, new Permissions(true, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: g80.a$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CustomerState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerState createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(CustomerState.class.getClassLoader()));
            }
            return new CustomerState(string, string2, string3, arrayList, Permissions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerState[] newArray(int i11) {
            return new CustomerState[i11];
        }
    }

    /* JADX INFO: renamed from: g80.a$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg80/a$c;", "Landroid/os/Parcelable;", "", "canRemovePaymentMethods", "canRemoveDuplicates", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "b", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Permissions implements Parcelable {
        public static final Parcelable.Creator<Permissions> CREATOR = new C1388a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemovePaymentMethods;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemoveDuplicates;

        /* JADX INFO: renamed from: g80.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1388a implements Parcelable.Creator<Permissions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Permissions createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Permissions(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Permissions[] newArray(int i11) {
                return new Permissions[i11];
            }
        }

        public Permissions(boolean z11, boolean z12) {
            this.canRemovePaymentMethods = z11;
            this.canRemoveDuplicates = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanRemoveDuplicates() {
            return this.canRemoveDuplicates;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Permissions)) {
                return false;
            }
            Permissions permissions = (Permissions) other;
            return this.canRemovePaymentMethods == permissions.canRemovePaymentMethods && this.canRemoveDuplicates == permissions.canRemoveDuplicates;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.canRemovePaymentMethods) * 31) + Boolean.hashCode(this.canRemoveDuplicates);
        }

        public String toString() {
            return "Permissions(canRemovePaymentMethods=" + this.canRemovePaymentMethods + ", canRemoveDuplicates=" + this.canRemoveDuplicates + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(this.canRemovePaymentMethods ? 1 : 0);
            parcel.writeInt(this.canRemoveDuplicates ? 1 : 0);
        }
    }

    public CustomerState(String id2, String ephemeralKeySecret, String str, List<PaymentMethod> paymentMethods, Permissions permissions) {
        s.k(id2, "id");
        s.k(ephemeralKeySecret, "ephemeralKeySecret");
        s.k(paymentMethods, "paymentMethods");
        s.k(permissions, "permissions");
        this.id = id2;
        this.ephemeralKeySecret = ephemeralKeySecret;
        this.customerSessionClientSecret = str;
        this.paymentMethods = paymentMethods;
        this.permissions = permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerState b(CustomerState customerState, String str, String str2, String str3, List list, Permissions permissions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = customerState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = customerState.ephemeralKeySecret;
        }
        if ((i11 & 4) != 0) {
            str3 = customerState.customerSessionClientSecret;
        }
        if ((i11 & 8) != 0) {
            list = customerState.paymentMethods;
        }
        if ((i11 & 16) != 0) {
            permissions = customerState.permissions;
        }
        Permissions permissions2 = permissions;
        String str4 = str3;
        return customerState.a(str, str2, str4, list, permissions2);
    }

    public final CustomerState a(String id2, String ephemeralKeySecret, String customerSessionClientSecret, List<PaymentMethod> paymentMethods, Permissions permissions) {
        s.k(id2, "id");
        s.k(ephemeralKeySecret, "ephemeralKeySecret");
        s.k(paymentMethods, "paymentMethods");
        s.k(permissions, "permissions");
        return new CustomerState(id2, ephemeralKeySecret, customerSessionClientSecret, paymentMethods, permissions);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEphemeralKeySecret() {
        return this.ephemeralKeySecret;
    }

    public final List<PaymentMethod> d() {
        return this.paymentMethods;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Permissions getPermissions() {
        return this.permissions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerState)) {
            return false;
        }
        CustomerState customerState = (CustomerState) other;
        return s.f(this.id, customerState.id) && s.f(this.ephemeralKeySecret, customerState.ephemeralKeySecret) && s.f(this.customerSessionClientSecret, customerState.customerSessionClientSecret) && s.f(this.paymentMethods, customerState.paymentMethods) && s.f(this.permissions, customerState.permissions);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31;
        String str = this.customerSessionClientSecret;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentMethods.hashCode()) * 31) + this.permissions.hashCode();
    }

    /* JADX INFO: renamed from: t2, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public String toString() {
        return "CustomerState(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", paymentMethods=" + this.paymentMethods + ", permissions=" + this.permissions + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.ephemeralKeySecret);
        parcel.writeString(this.customerSessionClientSecret);
        List<PaymentMethod> list = this.paymentMethods;
        parcel.writeInt(list.size());
        Iterator<PaymentMethod> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        this.permissions.writeToParcel(parcel, flags);
    }
}
