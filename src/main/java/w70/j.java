package w70;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.n0;
import com.stripe.android.model.x0;
import com.stripe.android.model.y0;
import n70.u;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u000b\u0011\t\u000e\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lw70/j;", "Landroid/os/Parcelable;", "<init>", "()V", "", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "a", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "hasAcknowledgedSepaMandate", "b", "requiresConfirmation", "e", "f", "Lw70/j$b;", "Lw70/j$c;", "Lw70/j$d;", "Lw70/j$e;", "Lw70/j$f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasAcknowledgedSepaMandate;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lw70/j$a;", "", "Lcom/stripe/android/model/l$c;", "setupFutureUsage", "<init>", "(Ljava/lang/String;ILcom/stripe/android/model/l$c;)V", "Lcom/stripe/android/model/l$c;", "getSetupFutureUsage", "()Lcom/stripe/android/model/l$c;", "RequestReuse", "RequestNoReuse", "NoRequest", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        RequestReuse(ConfirmPaymentIntentParams.c.OffSession),
        RequestNoReuse(ConfirmPaymentIntentParams.c.Blank),
        NoRequest(null);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final ConfirmPaymentIntentParams.c setupFutureUsage;

        a(ConfirmPaymentIntentParams.c cVar) {
            this.setupFutureUsage = cVar;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final ConfirmPaymentIntentParams.c getSetupFutureUsage() {
            return this.setupFutureUsage;
        }
    }

    /* JADX INFO: renamed from: w70.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u0014R\u0014\u00101\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00100¨\u00062"}, d2 = {"Lw70/j$b;", "Lw70/j;", "", "type", "Lcom/stripe/android/model/v0$e;", "billingDetails", "Lx30/c;", AnnotatedPrivateKey.LABEL, "", "iconResource", "lightThemeIconUrl", "darkThemeIconUrl", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/v0$e;Lx30/c;ILjava/lang/String;Ljava/lang/String;)V", "merchantName", "", "isSetupFlow", "c", "(Ljava/lang/String;Z)Lx30/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "getType", "Lcom/stripe/android/model/v0$e;", "e", "()Lcom/stripe/android/model/v0$e;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "h", "()Lx30/c;", "I", "g", "f", IntegerTokenConverter.CONVERTER_KEY, "()Z", "requiresConfirmation", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExternalPaymentMethod extends j {
        public static final Parcelable.Creator<ExternalPaymentMethod> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod.BillingDetails billingDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c label;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResource;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lightThemeIconUrl;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String darkThemeIconUrl;

        /* JADX INFO: renamed from: w70.j$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExternalPaymentMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExternalPaymentMethod createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ExternalPaymentMethod(parcel.readString(), (PaymentMethod.BillingDetails) parcel.readParcelable(ExternalPaymentMethod.class.getClassLoader()), (x30.c) parcel.readParcelable(ExternalPaymentMethod.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExternalPaymentMethod[] newArray(int i11) {
                return new ExternalPaymentMethod[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalPaymentMethod(String type, PaymentMethod.BillingDetails eVar, x30.c label, int i11, String str, String str2) {
            super(null);
            s.k(type, "type");
            s.k(label, "label");
            this.type = type;
            this.billingDetails = eVar;
            this.label = label;
            this.iconResource = i11;
            this.lightThemeIconUrl = str;
            this.darkThemeIconUrl = str2;
        }

        @Override // w70.j
        public boolean b() {
            return false;
        }

        @Override // w70.j
        public x30.c c(String merchantName, boolean isSetupFlow) {
            s.k(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalPaymentMethod)) {
                return false;
            }
            ExternalPaymentMethod externalPaymentMethod = (ExternalPaymentMethod) other;
            return s.f(this.type, externalPaymentMethod.type) && s.f(this.billingDetails, externalPaymentMethod.billingDetails) && s.f(this.label, externalPaymentMethod.label) && this.iconResource == externalPaymentMethod.iconResource && s.f(this.lightThemeIconUrl, externalPaymentMethod.lightThemeIconUrl) && s.f(this.darkThemeIconUrl, externalPaymentMethod.darkThemeIconUrl);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getIconResource() {
            return this.iconResource;
        }

        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final x30.c getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            PaymentMethod.BillingDetails eVar = this.billingDetails;
            int iHashCode2 = (((((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.iconResource)) * 31;
            String str = this.lightThemeIconUrl;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkThemeIconUrl;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.type + ", billingDetails=" + this.billingDetails + ", label=" + this.label + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.type);
            parcel.writeParcelable(this.billingDetails, flags);
            parcel.writeParcelable(this.label, flags);
            parcel.writeInt(this.iconResource);
            parcel.writeString(this.lightThemeIconUrl);
            parcel.writeString(this.darkThemeIconUrl);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lw70/j$c;", "Lw70/j;", "<init>", "()V", "", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "()Z", "requiresConfirmation", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f121146b = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return c.f121146b;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        private c() {
            super(null);
        }

        @Override // w70.j
        public boolean b() {
            return false;
        }

        @Override // w70.j
        public x30.c c(String merchantName, boolean isSetupFlow) {
            s.k(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -61554386;
        }

        public String toString() {
            return "GooglePay";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lw70/j$d;", "Lw70/j;", "<init>", "()V", "", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "()Z", "requiresConfirmation", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f121147b = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return d.f121147b;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        private d() {
            super(null);
        }

        @Override // w70.j
        public boolean b() {
            return false;
        }

        @Override // w70.j
        public x30.c c(String merchantName, boolean isSetupFlow) {
            s.k(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -395165925;
        }

        public String toString() {
            return "Link";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u001e\u001b\t\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0004 !\"#¨\u0006$"}, d2 = {"Lw70/j$e;", "Lw70/j;", "<init>", "()V", "", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "Lcom/stripe/android/model/w0;", "f", "()Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/y0;", "h", "()Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/x0;", "g", "()Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "Lw70/j$a;", "e", "()Lw70/j$a;", "customerRequestedSave", "b", "()Z", "requiresConfirmation", "a", DateTokenConverter.CONVERTER_KEY, "Lw70/j$e$a;", "Lw70/j$e$b;", "Lw70/j$e$c;", "Lw70/j$e$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e extends j {

        /* JADX INFO: renamed from: w70.j$e$a, reason: from toString */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b0\u00101R\u001d\u00106\u001a\u00020\u000e8\u0006¢\u0006\u0012\n\u0004\b0\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0010¨\u00067"}, d2 = {"Lw70/j$e$a;", "Lw70/j$e;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/h;", "brand", "Lw70/j$a;", "customerRequestedSave", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "<init>", "(Lcom/stripe/android/model/w0;Lcom/stripe/android/model/h;Lw70/j$a;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/x0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lcom/stripe/android/model/w0;", "f", "()Lcom/stripe/android/model/w0;", "c", "Lcom/stripe/android/model/h;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/h;", DateTokenConverter.CONVERTER_KEY, "Lw70/j$a;", "e", "()Lw70/j$a;", "Lcom/stripe/android/model/y0;", "h", "()Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/x0;", "g", "()Lcom/stripe/android/model/x0;", "Ljava/lang/String;", "j", "getLast4$annotations", "()V", "last4", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Card extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.model.h brand;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final a customerRequestedSave;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 paymentMethodOptionsParams;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final x0 paymentMethodExtraParams;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final String last4;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f121148h = (x0.f51723b | y0.f51735b) | PaymentMethodCreateParams.f51643v;
            public static final Parcelable.Creator<Card> CREATOR = new C2595a();

            /* JADX INFO: renamed from: w70.j$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C2595a implements Parcelable.Creator<Card> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Card createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Card((PaymentMethodCreateParams) parcel.readParcelable(Card.class.getClassLoader()), com.stripe.android.model.h.valueOf(parcel.readString()), a.valueOf(parcel.readString()), (y0) parcel.readParcelable(Card.class.getClassLoader()), (x0) parcel.readParcelable(Card.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Card[] newArray(int i11) {
                    return new Card[i11];
                }
            }

            public /* synthetic */ Card(PaymentMethodCreateParams paymentMethodCreateParams, com.stripe.android.model.h hVar, a aVar, y0 y0Var, x0 x0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(paymentMethodCreateParams, hVar, aVar, (i11 & 8) != 0 ? null : y0Var, (i11 & 16) != 0 ? null : x0Var);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Card)) {
                    return false;
                }
                Card card = (Card) other;
                return s.f(this.paymentMethodCreateParams, card.paymentMethodCreateParams) && this.brand == card.brand && this.customerRequestedSave == card.customerRequestedSave && s.f(this.paymentMethodOptionsParams, card.paymentMethodOptionsParams) && s.f(this.paymentMethodExtraParams, card.paymentMethodExtraParams);
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: f, reason: from getter */
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: g, reason: from getter */
            public x0 getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: h, reason: from getter */
            public y0 getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            public int hashCode() {
                int iHashCode = ((((this.paymentMethodCreateParams.hashCode() * 31) + this.brand.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                y0 y0Var = this.paymentMethodOptionsParams;
                int iHashCode2 = (iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
                x0 x0Var = this.paymentMethodExtraParams;
                return iHashCode2 + (x0Var != null ? x0Var.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final com.stripe.android.model.h getBrand() {
                return this.brand;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getLast4() {
                return this.last4;
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", brand=" + this.brand + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeParcelable(this.paymentMethodCreateParams, flags);
                parcel.writeString(this.brand.name());
                parcel.writeString(this.customerRequestedSave.name());
                parcel.writeParcelable(this.paymentMethodOptionsParams, flags);
                parcel.writeParcelable(this.paymentMethodExtraParams, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(PaymentMethodCreateParams paymentMethodCreateParams, com.stripe.android.model.h brand, a customerRequestedSave, y0 y0Var, x0 x0Var) {
                super(null);
                s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.k(brand, "brand");
                s.k(customerRequestedSave, "customerRequestedSave");
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.brand = brand;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = y0Var;
                this.paymentMethodExtraParams = x0Var;
                String strB = getPaymentMethodCreateParams().b();
                this.last4 = strB == null ? "" : strB;
            }
        }

        /* JADX INFO: renamed from: w70.j$e$b, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b-\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b2\u00109¨\u0006:"}, d2 = {"Lw70/j$e$b;", "Lw70/j$e;", "Lx30/c;", AnnotatedPrivateKey.LABEL, "", "iconResource", "", "lightThemeIconUrl", "darkThemeIconUrl", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lw70/j$a;", "customerRequestedSave", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "<init>", "(Lx30/c;ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w0;Lw70/j$a;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/x0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lx30/c;", "k", "()Lx30/c;", "c", "I", "j", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "l", "e", IntegerTokenConverter.CONVERTER_KEY, "f", "Lcom/stripe/android/model/w0;", "()Lcom/stripe/android/model/w0;", "g", "Lw70/j$a;", "()Lw70/j$a;", "h", "Lcom/stripe/android/model/y0;", "()Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/x0;", "()Lcom/stripe/android/model/x0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GenericPaymentMethod extends e {
            public static final Parcelable.Creator<GenericPaymentMethod> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final x30.c label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int iconResource;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lightThemeIconUrl;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String darkThemeIconUrl;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final a customerRequestedSave;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 paymentMethodOptionsParams;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final x0 paymentMethodExtraParams;

            /* JADX INFO: renamed from: w70.j$e$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<GenericPaymentMethod> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GenericPaymentMethod createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new GenericPaymentMethod((x30.c) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), a.valueOf(parcel.readString()), (y0) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), (x0) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GenericPaymentMethod[] newArray(int i11) {
                    return new GenericPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericPaymentMethod(x30.c label, int i11, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, a customerRequestedSave, y0 y0Var, x0 x0Var) {
                super(null);
                s.k(label, "label");
                s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.k(customerRequestedSave, "customerRequestedSave");
                this.label = label;
                this.iconResource = i11;
                this.lightThemeIconUrl = str;
                this.darkThemeIconUrl = str2;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = y0Var;
                this.paymentMethodExtraParams = x0Var;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericPaymentMethod)) {
                    return false;
                }
                GenericPaymentMethod genericPaymentMethod = (GenericPaymentMethod) other;
                return s.f(this.label, genericPaymentMethod.label) && this.iconResource == genericPaymentMethod.iconResource && s.f(this.lightThemeIconUrl, genericPaymentMethod.lightThemeIconUrl) && s.f(this.darkThemeIconUrl, genericPaymentMethod.darkThemeIconUrl) && s.f(this.paymentMethodCreateParams, genericPaymentMethod.paymentMethodCreateParams) && this.customerRequestedSave == genericPaymentMethod.customerRequestedSave && s.f(this.paymentMethodOptionsParams, genericPaymentMethod.paymentMethodOptionsParams) && s.f(this.paymentMethodExtraParams, genericPaymentMethod.paymentMethodExtraParams);
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: f, reason: from getter */
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: g, reason: from getter */
            public x0 getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: h, reason: from getter */
            public y0 getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            public int hashCode() {
                int iHashCode = ((this.label.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31;
                String str = this.lightThemeIconUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.darkThemeIconUrl;
                int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.paymentMethodCreateParams.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                y0 y0Var = this.paymentMethodOptionsParams;
                int iHashCode4 = (iHashCode3 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
                x0 x0Var = this.paymentMethodExtraParams;
                return iHashCode4 + (x0Var != null ? x0Var.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getDarkThemeIconUrl() {
                return this.darkThemeIconUrl;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final int getIconResource() {
                return this.iconResource;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final x30.c getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getLightThemeIconUrl() {
                return this.lightThemeIconUrl;
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.label + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeParcelable(this.label, flags);
                parcel.writeInt(this.iconResource);
                parcel.writeString(this.lightThemeIconUrl);
                parcel.writeString(this.darkThemeIconUrl);
                parcel.writeParcelable(this.paymentMethodCreateParams, flags);
                parcel.writeString(this.customerRequestedSave.name());
                parcel.writeParcelable(this.paymentMethodOptionsParams, flags);
                parcel.writeParcelable(this.paymentMethodExtraParams, flags);
            }
        }

        /* JADX INFO: renamed from: w70.j$e$c, reason: from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&R \u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R \u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b*\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010:\u001a\u0004\u0018\u0001048\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010&\u001a\u0004\b7\u00108R \u0010?\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010&\u001a\u0004\b=\u0010\rR\u001d\u0010C\u001a\u00020\b8\u0006¢\u0006\u0012\n\u0004\b=\u0010@\u0012\u0004\bB\u0010&\u001a\u0004\bA\u0010\n¨\u0006D"}, d2 = {"Lw70/j$e$c;", "Lw70/j$e;", "Lc60/e;", "linkPaymentDetails", "Lw70/j$a;", "customerRequestedSave", "<init>", "(Lc60/e;Lw70/j$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lc60/e;", "getLinkPaymentDetails", "()Lc60/e;", "c", "Lw70/j$a;", "e", "()Lw70/j$a;", "Lcom/stripe/android/model/p$e;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/p$e;", "getPaymentDetails$annotations", "()V", "paymentDetails", "Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0;", "f", "()Lcom/stripe/android/model/w0;", "getPaymentMethodCreateParams$annotations", "paymentMethodCreateParams", "Lcom/stripe/android/model/y0$b;", "Lcom/stripe/android/model/y0$b;", "l", "()Lcom/stripe/android/model/y0$b;", "getPaymentMethodOptionsParams$annotations", "paymentMethodOptionsParams", "", "g", "Ljava/lang/Void;", "k", "()Ljava/lang/Void;", "getPaymentMethodExtraParams$annotations", "paymentMethodExtraParams", "h", "I", IntegerTokenConverter.CONVERTER_KEY, "getIconResource$annotations", "iconResource", "Ljava/lang/String;", "j", "getLabel$annotations", AnnotatedPrivateKey.LABEL, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LinkInline extends e {
            public static final Parcelable.Creator<LinkInline> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final c60.e linkPaymentDetails;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a customerRequestedSave;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final ConsumerPaymentDetails.e paymentDetails;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final y0.Card paymentMethodOptionsParams;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Void paymentMethodExtraParams;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final int iconResource;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final String label;

            /* JADX INFO: renamed from: w70.j$e$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LinkInline> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LinkInline createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new LinkInline((c60.e) parcel.readParcelable(LinkInline.class.getClassLoader()), a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LinkInline[] newArray(int i11) {
                    return new LinkInline[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkInline(c60.e linkPaymentDetails, a customerRequestedSave) {
                super(null);
                s.k(linkPaymentDetails, "linkPaymentDetails");
                s.k(customerRequestedSave, "customerRequestedSave");
                this.linkPaymentDetails = linkPaymentDetails;
                this.customerRequestedSave = customerRequestedSave;
                ConsumerPaymentDetails.e eVarA = linkPaymentDetails.getPaymentDetails();
                this.paymentDetails = eVarA;
                this.paymentMethodCreateParams = linkPaymentDetails.getPaymentMethodCreateParams();
                this.paymentMethodOptionsParams = new y0.Card(null, null, getCustomerRequestedSave().getSetupFutureUsage(), 3, null);
                this.iconResource = u.f93489u;
                this.label = "····" + eVarA.getLast4();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinkInline)) {
                    return false;
                }
                LinkInline linkInline = (LinkInline) other;
                return s.f(this.linkPaymentDetails, linkInline.linkPaymentDetails) && this.customerRequestedSave == linkInline.customerRequestedSave;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: f, reason: from getter */
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: g */
            public /* bridge */ /* synthetic */ x0 getPaymentMethodExtraParams() {
                return (x0) getPaymentMethodExtraParams();
            }

            public int hashCode() {
                return (this.linkPaymentDetails.hashCode() * 31) + this.customerRequestedSave.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final int getIconResource() {
                return this.iconResource;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public Void getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: l, reason: from getter */
            public y0.Card getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            public String toString() {
                return "LinkInline(linkPaymentDetails=" + this.linkPaymentDetails + ", customerRequestedSave=" + this.customerRequestedSave + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeParcelable(this.linkPaymentDetails, flags);
                parcel.writeString(this.customerRequestedSave.name());
            }
        }

        /* JADX INFO: renamed from: w70.j$e$d, reason: from toString */
        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+\u001aB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b8\u0010>R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b4\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\b?\u0010CR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010D\u001a\u0004\b<\u0010E¨\u0006F"}, d2 = {"Lw70/j$e$d;", "Lw70/j$e;", "", "labelResource", "", "iconResource", "Lw70/j$e$d$b;", "input", "Lz70/f;", "screenState", "Lw70/j$e$d$c;", "instantDebits", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lw70/j$a;", "customerRequestedSave", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "<init>", "(Ljava/lang/String;ILw70/j$e$d$b;Lz70/f;Lw70/j$e$d$c;Lcom/stripe/android/model/w0;Lw70/j$a;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/x0;)V", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "l", "I", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Lw70/j$e$d$b;", "j", "()Lw70/j$e$d$b;", "e", "Lz70/f;", "m", "()Lz70/f;", "f", "Lw70/j$e$d$c;", "k", "()Lw70/j$e$d$c;", "g", "Lcom/stripe/android/model/w0;", "()Lcom/stripe/android/model/w0;", "h", "Lw70/j$a;", "()Lw70/j$a;", "Lcom/stripe/android/model/y0;", "()Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/x0;", "()Lcom/stripe/android/model/x0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class USBankAccount extends e {
            public static final Parcelable.Creator<USBankAccount> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String labelResource;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int iconResource;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Input input;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final p027z70.f screenState;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InstantDebitsInfo instantDebits;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final a customerRequestedSave;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 paymentMethodOptionsParams;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final x0 paymentMethodExtraParams;

            /* JADX INFO: renamed from: w70.j$e$d$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<USBankAccount> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final USBankAccount createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new USBankAccount(parcel.readString(), parcel.readInt(), Input.CREATOR.createFromParcel(parcel), (p027z70.f) parcel.readParcelable(USBankAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : InstantDebitsInfo.CREATOR.createFromParcel(parcel), (PaymentMethodCreateParams) parcel.readParcelable(USBankAccount.class.getClassLoader()), a.valueOf(parcel.readString()), (y0) parcel.readParcelable(USBankAccount.class.getClassLoader()), (x0) parcel.readParcelable(USBankAccount.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final USBankAccount[] newArray(int i11) {
                    return new USBankAccount[i11];
                }
            }

            /* JADX INFO: renamed from: w70.j$e$d$b, reason: from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, d2 = {"Lw70/j$e$d$b;", "Landroid/os/Parcelable;", "", "name", Scopes.EMAIL, "phone", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", "saveForFutureUse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/b;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/b;", "()Lcom/stripe/android/model/b;", "e", "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Input implements Parcelable {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String name;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String email;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String phone;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Address address;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean saveForFutureUse;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final int f121180f = Address.f51073h;
                public static final Parcelable.Creator<Input> CREATOR = new a();

                /* JADX INFO: renamed from: w70.j$e$d$b$a */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Input> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Input createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new Input(parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Input[] newArray(int i11) {
                        return new Input[i11];
                    }
                }

                public Input(String name, String str, String str2, Address bVar, boolean z11) {
                    s.k(name, "name");
                    this.name = name;
                    this.email = str;
                    this.phone = str2;
                    this.address = bVar;
                    this.saveForFutureUse = z11;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Address getAddress() {
                    return this.address;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getEmail() {
                    return this.email;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getPhone() {
                    return this.phone;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final boolean getSaveForFutureUse() {
                    return this.saveForFutureUse;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Input)) {
                        return false;
                    }
                    Input input = (Input) other;
                    return s.f(this.name, input.name) && s.f(this.email, input.email) && s.f(this.phone, input.phone) && s.f(this.address, input.address) && this.saveForFutureUse == input.saveForFutureUse;
                }

                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    int iHashCode = this.name.hashCode() * 31;
                    String str = this.email;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.phone;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Address bVar = this.address;
                    return ((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.saveForFutureUse);
                }

                public String toString() {
                    return "Input(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", address=" + this.address + ", saveForFutureUse=" + this.saveForFutureUse + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.name);
                    parcel.writeString(this.email);
                    parcel.writeString(this.phone);
                    parcel.writeParcelable(this.address, flags);
                    parcel.writeInt(this.saveForFutureUse ? 1 : 0);
                }
            }

            /* JADX INFO: renamed from: w70.j$e$d$c, reason: from toString */
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lw70/j$e$d$c;", "Landroid/os/Parcelable;", "", "paymentMethodId", "Lcom/stripe/android/model/n0;", "linkMode", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/n0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPaymentMethodId", "b", "Lcom/stripe/android/model/n0;", "()Lcom/stripe/android/model/n0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class InstantDebitsInfo implements Parcelable {
                public static final Parcelable.Creator<InstantDebitsInfo> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String paymentMethodId;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final n0 linkMode;

                /* JADX INFO: renamed from: w70.j$e$d$c$a */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<InstantDebitsInfo> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final InstantDebitsInfo createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new InstantDebitsInfo(parcel.readString(), parcel.readInt() == 0 ? null : n0.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final InstantDebitsInfo[] newArray(int i11) {
                        return new InstantDebitsInfo[i11];
                    }
                }

                public InstantDebitsInfo(String paymentMethodId, n0 n0Var) {
                    s.k(paymentMethodId, "paymentMethodId");
                    this.paymentMethodId = paymentMethodId;
                    this.linkMode = n0Var;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final n0 getLinkMode() {
                    return this.linkMode;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof InstantDebitsInfo)) {
                        return false;
                    }
                    InstantDebitsInfo instantDebitsInfo = (InstantDebitsInfo) other;
                    return s.f(this.paymentMethodId, instantDebitsInfo.paymentMethodId) && this.linkMode == instantDebitsInfo.linkMode;
                }

                public int hashCode() {
                    int iHashCode = this.paymentMethodId.hashCode() * 31;
                    n0 n0Var = this.linkMode;
                    return iHashCode + (n0Var == null ? 0 : n0Var.hashCode());
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethodId=" + this.paymentMethodId + ", linkMode=" + this.linkMode + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.paymentMethodId);
                    n0 n0Var = this.linkMode;
                    if (n0Var == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(n0Var.name());
                    }
                }
            }

            public /* synthetic */ USBankAccount(String str, int i11, Input input, p027z70.f fVar, InstantDebitsInfo instantDebitsInfo, PaymentMethodCreateParams paymentMethodCreateParams, a aVar, y0 y0Var, x0 x0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, input, fVar, instantDebitsInfo, paymentMethodCreateParams, aVar, (i12 & 128) != 0 ? null : y0Var, (i12 & 256) != 0 ? null : x0Var);
            }

            @Override // w70.j.e, w70.j
            public x30.c c(String merchantName, boolean isSetupFlow) {
                s.k(merchantName, "merchantName");
                return this.screenState.getMandateText();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof USBankAccount)) {
                    return false;
                }
                USBankAccount uSBankAccount = (USBankAccount) other;
                return s.f(this.labelResource, uSBankAccount.labelResource) && this.iconResource == uSBankAccount.iconResource && s.f(this.input, uSBankAccount.input) && s.f(this.screenState, uSBankAccount.screenState) && s.f(this.instantDebits, uSBankAccount.instantDebits) && s.f(this.paymentMethodCreateParams, uSBankAccount.paymentMethodCreateParams) && this.customerRequestedSave == uSBankAccount.customerRequestedSave && s.f(this.paymentMethodOptionsParams, uSBankAccount.paymentMethodOptionsParams) && s.f(this.paymentMethodExtraParams, uSBankAccount.paymentMethodExtraParams);
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: f, reason: from getter */
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: g, reason: from getter */
            public x0 getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            @Override // w70.j.e
            /* JADX INFO: renamed from: h, reason: from getter */
            public y0 getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            public int hashCode() {
                int iHashCode = ((((((this.labelResource.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + this.input.hashCode()) * 31) + this.screenState.hashCode()) * 31;
                InstantDebitsInfo instantDebitsInfo = this.instantDebits;
                int iHashCode2 = (((((iHashCode + (instantDebitsInfo == null ? 0 : instantDebitsInfo.hashCode())) * 31) + this.paymentMethodCreateParams.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                y0 y0Var = this.paymentMethodOptionsParams;
                int iHashCode3 = (iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
                x0 x0Var = this.paymentMethodExtraParams;
                return iHashCode3 + (x0Var != null ? x0Var.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final int getIconResource() {
                return this.iconResource;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Input getInput() {
                return this.input;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final InstantDebitsInfo getInstantDebits() {
                return this.instantDebits;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getLabelResource() {
                return this.labelResource;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final p027z70.f getScreenState() {
                return this.screenState;
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.labelResource + ", iconResource=" + this.iconResource + ", input=" + this.input + ", screenState=" + this.screenState + ", instantDebits=" + this.instantDebits + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.labelResource);
                parcel.writeInt(this.iconResource);
                this.input.writeToParcel(parcel, flags);
                parcel.writeParcelable(this.screenState, flags);
                InstantDebitsInfo instantDebitsInfo = this.instantDebits;
                if (instantDebitsInfo == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    instantDebitsInfo.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.paymentMethodCreateParams, flags);
                parcel.writeString(this.customerRequestedSave.name());
                parcel.writeParcelable(this.paymentMethodOptionsParams, flags);
                parcel.writeParcelable(this.paymentMethodExtraParams, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public USBankAccount(String labelResource, int i11, Input input, p027z70.f screenState, InstantDebitsInfo instantDebitsInfo, PaymentMethodCreateParams paymentMethodCreateParams, a customerRequestedSave, y0 y0Var, x0 x0Var) {
                super(null);
                s.k(labelResource, "labelResource");
                s.k(input, "input");
                s.k(screenState, "screenState");
                s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.k(customerRequestedSave, "customerRequestedSave");
                this.labelResource = labelResource;
                this.iconResource = i11;
                this.input = input;
                this.screenState = screenState;
                this.instantDebits = instantDebitsInfo;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = y0Var;
                this.paymentMethodExtraParams = x0Var;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // w70.j
        public boolean b() {
            return false;
        }

        @Override // w70.j
        public x30.c c(String merchantName, boolean isSetupFlow) {
            s.k(merchantName, "merchantName");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public abstract a getCustomerRequestedSave();

        /* JADX INFO: renamed from: f */
        public abstract PaymentMethodCreateParams getPaymentMethodCreateParams();

        /* JADX INFO: renamed from: g */
        public abstract x0 getPaymentMethodExtraParams();

        /* JADX INFO: renamed from: h */
        public abstract y0 getPaymentMethodOptionsParams();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: w70.j$f, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/¨\u00062"}, d2 = {"Lw70/j$f;", "Lw70/j;", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lw70/j$f$b;", "walletType", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "<init>", "(Lcom/stripe/android/model/v0;Lw70/j$f$b;Lcom/stripe/android/model/y0;)V", "", "merchantName", "", "isSetupFlow", "Lx30/c;", "c", "(Ljava/lang/String;Z)Lx30/c;", "e", "(Lcom/stripe/android/model/v0;Lw70/j$f$b;Lcom/stripe/android/model/y0;)Lw70/j$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "Lw70/j$f$b;", IntegerTokenConverter.CONVERTER_KEY, "()Lw70/j$f$b;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/y0;", "g", "()Lcom/stripe/android/model/y0;", "h", "()Z", "showMandateAbovePrimaryButton", "requiresConfirmation", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Saved extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod paymentMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b walletType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 paymentMethodOptionsParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f121188e = y0.f51735b | PaymentMethod.f51534u;
        public static final Parcelable.Creator<Saved> CREATOR = new a();

        /* JADX INFO: renamed from: w70.j$f$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Saved> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Saved createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Saved((PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), (y0) parcel.readParcelable(Saved.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Saved[] newArray(int i11) {
                return new Saved[i11];
            }
        }

        /* JADX INFO: renamed from: w70.j$f$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lw70/j$f$b;", "", "Lw70/j;", "paymentSelection", "<init>", "(Ljava/lang/String;ILw70/j;)V", "Lw70/j;", "getPaymentSelection", "()Lw70/j;", "GooglePay", "Link", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b {
            GooglePay(c.f121146b),
            Link(d.f121147b);

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final j paymentSelection;

            b(j jVar) {
                this.paymentSelection = jVar;
            }

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            public final j getPaymentSelection() {
                return this.paymentSelection;
            }
        }

        /* JADX INFO: renamed from: w70.j$f$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f121192a;

            static {
                int[] iArr = new int[PaymentMethod.p.values().length];
                try {
                    iArr[PaymentMethod.p.USBankAccount.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentMethod.p.SepaDebit.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f121192a = iArr;
            }
        }

        public /* synthetic */ Saved(PaymentMethod v0Var, b bVar, y0 y0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(v0Var, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? null : y0Var);
        }

        public static /* synthetic */ Saved f(Saved saved, PaymentMethod v0Var, b bVar, y0 y0Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                v0Var = saved.paymentMethod;
            }
            if ((i11 & 2) != 0) {
                bVar = saved.walletType;
            }
            if ((i11 & 4) != 0) {
                y0Var = saved.paymentMethodOptionsParams;
            }
            return saved.e(v0Var, bVar, y0Var);
        }

        /* JADX INFO: renamed from: Z2, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // w70.j
        public boolean b() {
            PaymentMethod.p pVar = this.paymentMethod.type;
            return pVar == PaymentMethod.p.USBankAccount || pVar == PaymentMethod.p.SepaDebit;
        }

        @Override // w70.j
        public x30.c c(String merchantName, boolean isSetupFlow) {
            s.k(merchantName, "merchantName");
            PaymentMethod.p pVar = this.paymentMethod.type;
            int i11 = pVar == null ? -1 : c.f121192a[pVar.ordinal()];
            if (i11 == 1) {
                return p027z70.j.f127317a.a(merchantName, false, false, false, isSetupFlow);
            }
            if (i11 != 2) {
                return null;
            }
            return x30.d.g(w80.n.B0, new Object[]{merchantName}, null, 4, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Saved e(PaymentMethod paymentMethod, b walletType, y0 paymentMethodOptionsParams) {
            s.k(paymentMethod, "paymentMethod");
            return new Saved(paymentMethod, walletType, paymentMethodOptionsParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Saved)) {
                return false;
            }
            Saved saved = (Saved) other;
            return s.f(this.paymentMethod, saved.paymentMethod) && this.walletType == saved.walletType && s.f(this.paymentMethodOptionsParams, saved.paymentMethodOptionsParams);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final y0 getPaymentMethodOptionsParams() {
            return this.paymentMethodOptionsParams;
        }

        public final boolean h() {
            return this.paymentMethod.type == PaymentMethod.p.SepaDebit;
        }

        public int hashCode() {
            int iHashCode = this.paymentMethod.hashCode() * 31;
            b bVar = this.walletType;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            y0 y0Var = this.paymentMethodOptionsParams;
            return iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final b getWalletType() {
            return this.walletType;
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.paymentMethod + ", walletType=" + this.walletType + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.paymentMethod, flags);
            b bVar = this.walletType;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(bVar.name());
            }
            parcel.writeParcelable(this.paymentMethodOptionsParams, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(PaymentMethod paymentMethod, b bVar, y0 y0Var) {
            super(null);
            s.k(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.walletType = bVar;
            this.paymentMethodOptionsParams = y0Var;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasAcknowledgedSepaMandate() {
        return this.hasAcknowledgedSepaMandate;
    }

    public abstract boolean b();

    public abstract x30.c c(String merchantName, boolean isSetupFlow);

    public final void d(boolean z11) {
        this.hasAcknowledgedSepaMandate = z11;
    }

    private j() {
    }
}
