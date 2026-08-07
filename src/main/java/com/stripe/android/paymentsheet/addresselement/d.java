package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.paymentsheet.addresselement.e;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Kind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/d;", "", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "activityResultLauncher", "<init>", "(Landroid/app/Application;Landroidx/activity/result/ActivityResultLauncher;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lo70/e;", "callback", "(Landroidx/fragment/app/Fragment;Lo70/e;)V", "", "publishableKey", "Lcom/stripe/android/paymentsheet/addresselement/d$b;", "configuration", "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/d$b;)V", "a", "Landroid/app/Application;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<AddressElementActivityContract.Args> activityResultLauncher;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/d$a;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "phone", "", "checkboxLabel", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/d$a$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "b", "()Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalFieldsConfiguration implements Parcelable {
        public static final Parcelable.Creator<AdditionalFieldsConfiguration> CREATOR = new C0981a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b phone;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String checkboxLabel;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0981a implements Parcelable.Creator<AdditionalFieldsConfiguration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AdditionalFieldsConfiguration createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new AdditionalFieldsConfiguration(b.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AdditionalFieldsConfiguration[] newArray(int i11) {
                return new AdditionalFieldsConfiguration[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$a$b */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "HIDDEN", "OPTIONAL", "REQUIRED", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b implements Parcelable {
            HIDDEN,
            OPTIONAL,
            REQUIRED;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            public static final Parcelable.Creator<b> CREATOR = new C0982a();

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0982a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalFieldsConfiguration() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getPhone() {
            return this.phone;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalFieldsConfiguration)) {
                return false;
            }
            AdditionalFieldsConfiguration additionalFieldsConfiguration = (AdditionalFieldsConfiguration) other;
            return this.phone == additionalFieldsConfiguration.phone && s.f(this.checkboxLabel, additionalFieldsConfiguration.checkboxLabel);
        }

        public int hashCode() {
            int iHashCode = this.phone.hashCode() * 31;
            String str = this.checkboxLabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AdditionalFieldsConfiguration(phone=" + this.phone + ", checkboxLabel=" + this.checkboxLabel + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.phone.writeToParcel(parcel, flags);
            parcel.writeString(this.checkboxLabel);
        }

        public AdditionalFieldsConfiguration(b phone, String str) {
            s.k(phone, "phone");
            this.phone = phone;
            this.checkboxLabel = str;
        }

        public /* synthetic */ AdditionalFieldsConfiguration(b bVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? b.HIDDEN : bVar, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b1\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b2\u0010\u0012R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b.\u0010+¨\u00063"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/d$b;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "Lo70/a;", PlaceTypes.ADDRESS, "", "", "allowedCountries", "buttonTitle", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "additionalFields", "title", "googlePlacesApiKey", "autocompleteCountries", "<init>", "(Lcom/stripe/android/paymentsheet/y$b;Lo70/a;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/d$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/paymentsheet/y$b;", "b", "Lo70/a;", "()Lo70/a;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "Ljava/lang/String;", "f", "e", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "()Lcom/stripe/android/paymentsheet/addresselement/d$a;", "h", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Appearance appearance;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDetails address;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> allowedCountries;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String buttonTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdditionalFieldsConfiguration additionalFields;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String googlePlacesApiKey;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> autocompleteCountries;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.d$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Configuration createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                y.Appearance appearanceCreateFromParcel = y.Appearance.CREATOR.createFromParcel(parcel);
                AddressDetails addressDetailsCreateFromParcel = parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                String string = parcel.readString();
                AdditionalFieldsConfiguration additionalFieldsConfigurationCreateFromParcel = parcel.readInt() != 0 ? AdditionalFieldsConfiguration.CREATOR.createFromParcel(parcel) : null;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new Configuration(appearanceCreateFromParcel, addressDetailsCreateFromParcel, linkedHashSet, string, additionalFieldsConfigurationCreateFromParcel, string2, string3, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        public Configuration() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdditionalFieldsConfiguration getAdditionalFields() {
            return this.additionalFields;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AddressDetails getAddress() {
            return this.address;
        }

        public final Set<String> c() {
            return this.allowedCountries;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final y.Appearance getAppearance() {
            return this.appearance;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Set<String> e() {
            return this.autocompleteCountries;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return s.f(this.appearance, configuration.appearance) && s.f(this.address, configuration.address) && s.f(this.allowedCountries, configuration.allowedCountries) && s.f(this.buttonTitle, configuration.buttonTitle) && s.f(this.additionalFields, configuration.additionalFields) && s.f(this.title, configuration.title) && s.f(this.googlePlacesApiKey, configuration.googlePlacesApiKey) && s.f(this.autocompleteCountries, configuration.autocompleteCountries);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.appearance.hashCode() * 31;
            AddressDetails addressDetails = this.address;
            int iHashCode2 = (((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.allowedCountries.hashCode()) * 31;
            String str = this.buttonTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            int iHashCode4 = (iHashCode3 + (additionalFieldsConfiguration == null ? 0 : additionalFieldsConfiguration.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.googlePlacesApiKey;
            return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.autocompleteCountries.hashCode();
        }

        public String toString() {
            return "Configuration(appearance=" + this.appearance + ", address=" + this.address + ", allowedCountries=" + this.allowedCountries + ", buttonTitle=" + this.buttonTitle + ", additionalFields=" + this.additionalFields + ", title=" + this.title + ", googlePlacesApiKey=" + this.googlePlacesApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.appearance.writeToParcel(parcel, flags);
            AddressDetails addressDetails = this.address;
            if (addressDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressDetails.writeToParcel(parcel, flags);
            }
            Set<String> set = this.allowedCountries;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            parcel.writeString(this.buttonTitle);
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            if (additionalFieldsConfiguration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                additionalFieldsConfiguration.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.googlePlacesApiKey);
            Set<String> set2 = this.autocompleteCountries;
            parcel.writeInt(set2.size());
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        }

        public Configuration(y.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set<String> autocompleteCountries) {
            s.k(appearance, "appearance");
            s.k(allowedCountries, "allowedCountries");
            s.k(autocompleteCountries, "autocompleteCountries");
            this.appearance = appearance;
            this.address = addressDetails;
            this.allowedCountries = allowedCountries;
            this.buttonTitle = str;
            this.additionalFields = additionalFieldsConfiguration;
            this.title = str2;
            this.googlePlacesApiKey = str3;
            this.autocompleteCountries = autocompleteCountries;
        }

        public /* synthetic */ Configuration(y.Appearance appearance, AddressDetails addressDetails, Set set, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set set2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new y.Appearance() : appearance, (i11 & 2) != 0 ? null : addressDetails, (i11 & 4) != 0 ? d1.d() : set, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : additionalFieldsConfiguration, (i11 & 32) != 0 ? null : str2, (i11 & 64) == 0 ? str3 : null, (i11 & 128) != 0 ? d1.i("AU", "BE", "BR", "CA", "CH", "DE", "ES", "FR", "GB", "IE", "IT", "MX", "NO", "NL", "PL", "RU", "SE", "TR", "US", "ZA") : set2);
        }
    }

    public d(Application application, ActivityResultLauncher<AddressElementActivityContract.Args> activityResultLauncher) {
        s.k(application, "application");
        s.k(activityResultLauncher, "activityResultLauncher");
        this.application = application;
        this.activityResultLauncher = activityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p017o70.e callback, e eVar) {
        s.k(callback, "$callback");
        s.h(eVar);
        callback.a(eVar);
    }

    public final void c(String publishableKey, Configuration configuration) {
        s.k(publishableKey, "publishableKey");
        s.k(configuration, "configuration");
        AddressElementActivityContract.Args aVar = new AddressElementActivityContract.Args(publishableKey, configuration);
        Context applicationContext = this.application.getApplicationContext();
        r90.b bVar = r90.b.f107376a;
        androidx.core.app.d dVarA = androidx.core.app.d.a(applicationContext, bVar.a(), bVar.b());
        s.j(dVarA, "makeCustomAnimation(...)");
        this.activityResultLauncher.c(aVar, dVarA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Fragment fragment, final p017o70.e callback) {
        s.k(fragment, "fragment");
        s.k(callback, "callback");
        Application application = fragment.requireActivity().getApplication();
        s.j(application, "getApplication(...)");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new AddressElementActivityContract(), new ActivityResultCallback() { // from class: o70.d
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.paymentsheet.addresselement.d.b(callback, (e) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(application, (ActivityResultLauncher<AddressElementActivityContract.Args>) activityResultLauncherRegisterForActivityResult);
    }
}
