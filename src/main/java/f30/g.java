package f30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lf30/g;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Lf30/g$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g implements Parcelable {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lf30/g$a;", "Lf30/g;", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lf30/g$a$a;", "Lf30/g$a$b;", "Lf30/g$a$c;", "Lf30/g$a$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends g {

        /* JADX INFO: renamed from: f30.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lf30/g$a$a;", "Lf30/g$a;", "", "paymentMethodId", "id", "", "productUsage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPaymentMethodId", "b", "getId$payments_core_release", "c", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AttachPaymentMethod extends a {
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new C1309a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentMethodId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: f30.g$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1309a implements Parcelable.Creator<AttachPaymentMethod> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AttachPaymentMethod(string, string2, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AttachPaymentMethod[] newArray(int i11) {
                    return new AttachPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String paymentMethodId, String id2, Set<String> productUsage) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id2;
                this.productUsage = productUsage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AttachPaymentMethod)) {
                    return false;
                }
                AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) other;
                return p013kotlin.jvm.internal.s.f(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.id, attachPaymentMethod.id) && p013kotlin.jvm.internal.s.f(this.productUsage, attachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "AttachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
        }

        /* JADX INFO: renamed from: f30.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lf30/g$a$b;", "Lf30/g$a;", "", "paymentMethodId", "id", "", "productUsage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPaymentMethodId", "b", "getId$payments_core_release", "c", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DetachPaymentMethod extends a {
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new C1310a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentMethodId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: f30.g$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1310a implements Parcelable.Creator<DetachPaymentMethod> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DetachPaymentMethod(string, string2, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DetachPaymentMethod[] newArray(int i11) {
                    return new DetachPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String paymentMethodId, String id2, Set<String> productUsage) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id2;
                this.productUsage = productUsage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DetachPaymentMethod)) {
                    return false;
                }
                DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) other;
                return p013kotlin.jvm.internal.s.f(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.id, detachPaymentMethod.id) && p013kotlin.jvm.internal.s.f(this.productUsage, detachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "DetachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
        }

        /* JADX INFO: renamed from: f30.g$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u000fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lf30/g$a$c;", "Lf30/g$a;", "Lcom/stripe/android/model/v0$p;", "type", "", "limit", "", "endingBefore", "startingAfter", "id", "", "productUsage", "<init>", "(Lcom/stripe/android/model/v0$p;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/v0$p;", "getType$payments_core_release", "()Lcom/stripe/android/model/v0$p;", "b", "Ljava/lang/Integer;", "getLimit$payments_core_release", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getEndingBefore$payments_core_release", DateTokenConverter.CONVERTER_KEY, "getStartingAfter$payments_core_release", "e", "getId$payments_core_release", "f", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GetPaymentMethods extends a {
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new C1311a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod.p type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer limit;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String endingBefore;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String startingAfter;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: f30.g$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1311a implements Parcelable.Creator<GetPaymentMethods> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    PaymentMethod.p pVarCreateFromParcel = PaymentMethod.p.CREATOR.createFromParcel(parcel);
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new GetPaymentMethods(pVarCreateFromParcel, numValueOf, string, string2, string3, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GetPaymentMethods[] newArray(int i11) {
                    return new GetPaymentMethods[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.p type, Integer num, String str, String str2, String id2, Set<String> productUsage) {
                super(null);
                p013kotlin.jvm.internal.s.k(type, "type");
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
                this.type = type;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.id = id2;
                this.productUsage = productUsage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetPaymentMethods)) {
                    return false;
                }
                GetPaymentMethods getPaymentMethods = (GetPaymentMethods) other;
                return this.type == getPaymentMethods.type && p013kotlin.jvm.internal.s.f(this.limit, getPaymentMethods.limit) && p013kotlin.jvm.internal.s.f(this.endingBefore, getPaymentMethods.endingBefore) && p013kotlin.jvm.internal.s.f(this.startingAfter, getPaymentMethods.startingAfter) && p013kotlin.jvm.internal.s.f(this.id, getPaymentMethods.id) && p013kotlin.jvm.internal.s.f(this.productUsage, getPaymentMethods.productUsage);
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Integer num = this.limit;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.endingBefore;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.startingAfter;
                return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "GetPaymentMethods(type=" + this.type + ", limit=" + this.limit + ", endingBefore=" + this.endingBefore + ", startingAfter=" + this.startingAfter + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                p013kotlin.jvm.internal.s.k(parcel, "out");
                this.type.writeToParcel(parcel, flags);
                Integer num = this.limit;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
                parcel.writeString(this.endingBefore);
                parcel.writeString(this.startingAfter);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
        }

        /* JADX INFO: renamed from: f30.g$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lf30/g$a$d;", "Lf30/g$a;", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "id", "", "productUsage", "<init>", "(Lcom/stripe/android/model/f1;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/f1;", "getShippingInformation", "()Lcom/stripe/android/model/f1;", "b", "Ljava/lang/String;", "getId$payments_core_release", "c", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateShipping extends a {
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new C1312a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShippingInformation shippingInformation;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: f30.g$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1312a implements Parcelable.Creator<UpdateShipping> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    ShippingInformation shippingInformationCreateFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateShipping(shippingInformationCreateFromParcel, string, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UpdateShipping[] newArray(int i11) {
                    return new UpdateShipping[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation, String id2, Set<String> productUsage) {
                super(null);
                p013kotlin.jvm.internal.s.k(shippingInformation, "shippingInformation");
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
                this.shippingInformation = shippingInformation;
                this.id = id2;
                this.productUsage = productUsage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateShipping)) {
                    return false;
                }
                UpdateShipping updateShipping = (UpdateShipping) other;
                return p013kotlin.jvm.internal.s.f(this.shippingInformation, updateShipping.shippingInformation) && p013kotlin.jvm.internal.s.f(this.id, updateShipping.id) && p013kotlin.jvm.internal.s.f(this.productUsage, updateShipping.productUsage);
            }

            public int hashCode() {
                return (((this.shippingInformation.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "UpdateShipping(shippingInformation=" + this.shippingInformation + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                this.shippingInformation.writeToParcel(parcel, flags);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
