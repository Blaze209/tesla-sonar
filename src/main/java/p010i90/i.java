package p010i90;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import g90.c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Li90/i;", "Landroid/os/Parcelable;", "<init>", "()V", "Li90/v0;", "e", "()Li90/v0;", "phoneNumberState", "a", "b", "c", "Li90/i$a;", "Li90/i$b;", "Li90/i$c;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class i implements Parcelable {

    /* JADX INFO: renamed from: i90.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Li90/i$b;", "Li90/i;", "Lg90/c;", "", "googleApiKey", "", "autocompleteCountries", "Li90/v0;", "phoneNumberState", "Lkotlin/Function0;", "Ljn0/h0;", "onNavigation", "<init>", "(Ljava/lang/String;Ljava/util/Set;Li90/v0;Lwn0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "Li90/v0;", "e", "()Li90/v0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "()Lwn0/a;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShippingCondensed extends i implements c {
        public static final Parcelable.Creator<ShippingCondensed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String googleApiKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> autocompleteCountries;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v0 phoneNumberState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.a<h0> onNavigation;

        /* JADX INFO: renamed from: i90.i$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShippingCondensed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShippingCondensed createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                s.k(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new ShippingCondensed(string, linkedHashSet, v0.valueOf(parcel.readString()), (wn0.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShippingCondensed[] newArray(int i11) {
                return new ShippingCondensed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingCondensed(String str, Set<String> set, v0 phoneNumberState, wn0.a<h0> onNavigation) {
            super(null);
            s.k(phoneNumberState, "phoneNumberState");
            s.k(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberState = phoneNumberState;
            this.onNavigation = onNavigation;
        }

        @Override // g90.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // g90.c
        public boolean b(String str, i0 i0Var) {
            return c.a.a(this, str, i0Var);
        }

        @Override // g90.c
        public Set<String> c() {
            return this.autocompleteCountries;
        }

        @Override // g90.c
        public wn0.a<h0> d() {
            return this.onNavigation;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p010i90.i
        /* JADX INFO: renamed from: e, reason: from getter */
        public v0 getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShippingCondensed)) {
                return false;
            }
            ShippingCondensed shippingCondensed = (ShippingCondensed) other;
            return s.f(this.googleApiKey, shippingCondensed.googleApiKey) && s.f(this.autocompleteCountries, shippingCondensed.autocompleteCountries) && this.phoneNumberState == shippingCondensed.phoneNumberState && s.f(this.onNavigation, shippingCondensed.onNavigation);
        }

        public int hashCode() {
            String str = this.googleApiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Set<String> set = this.autocompleteCountries;
            return ((((iHashCode + (set != null ? set.hashCode() : 0)) * 31) + this.phoneNumberState.hashCode()) * 31) + this.onNavigation.hashCode();
        }

        public String toString() {
            return "ShippingCondensed(googleApiKey=" + this.googleApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ", phoneNumberState=" + this.phoneNumberState + ", onNavigation=" + this.onNavigation + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.googleApiKey);
            Set<String> set = this.autocompleteCountries;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
            parcel.writeString(this.phoneNumberState.name());
            parcel.writeSerializable((Serializable) this.onNavigation);
        }
    }

    /* JADX INFO: renamed from: i90.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Li90/i$c;", "Li90/i;", "Lg90/c;", "", "googleApiKey", "", "autocompleteCountries", "Li90/v0;", "phoneNumberState", "Lkotlin/Function0;", "Ljn0/h0;", "onNavigation", "<init>", "(Ljava/lang/String;Ljava/util/Set;Li90/v0;Lwn0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "Li90/v0;", "e", "()Li90/v0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "()Lwn0/a;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShippingExpanded extends i implements c {
        public static final Parcelable.Creator<ShippingExpanded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String googleApiKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> autocompleteCountries;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v0 phoneNumberState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.a<h0> onNavigation;

        /* JADX INFO: renamed from: i90.i$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShippingExpanded> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShippingExpanded createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                s.k(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new ShippingExpanded(string, linkedHashSet, v0.valueOf(parcel.readString()), (wn0.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShippingExpanded[] newArray(int i11) {
                return new ShippingExpanded[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingExpanded(String str, Set<String> set, v0 phoneNumberState, wn0.a<h0> onNavigation) {
            super(null);
            s.k(phoneNumberState, "phoneNumberState");
            s.k(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberState = phoneNumberState;
            this.onNavigation = onNavigation;
        }

        @Override // g90.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // g90.c
        public boolean b(String str, i0 i0Var) {
            return c.a.a(this, str, i0Var);
        }

        @Override // g90.c
        public Set<String> c() {
            return this.autocompleteCountries;
        }

        @Override // g90.c
        public wn0.a<h0> d() {
            return this.onNavigation;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p010i90.i
        /* JADX INFO: renamed from: e, reason: from getter */
        public v0 getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShippingExpanded)) {
                return false;
            }
            ShippingExpanded shippingExpanded = (ShippingExpanded) other;
            return s.f(this.googleApiKey, shippingExpanded.googleApiKey) && s.f(this.autocompleteCountries, shippingExpanded.autocompleteCountries) && this.phoneNumberState == shippingExpanded.phoneNumberState && s.f(this.onNavigation, shippingExpanded.onNavigation);
        }

        public int hashCode() {
            String str = this.googleApiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Set<String> set = this.autocompleteCountries;
            return ((((iHashCode + (set != null ? set.hashCode() : 0)) * 31) + this.phoneNumberState.hashCode()) * 31) + this.onNavigation.hashCode();
        }

        public String toString() {
            return "ShippingExpanded(googleApiKey=" + this.googleApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ", phoneNumberState=" + this.phoneNumberState + ", onNavigation=" + this.onNavigation + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.googleApiKey);
            Set<String> set = this.autocompleteCountries;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
            parcel.writeString(this.phoneNumberState.name());
            parcel.writeSerializable((Serializable) this.onNavigation);
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public abstract v0 getPhoneNumberState();

    /* JADX INFO: renamed from: i90.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Li90/i$a;", "Li90/i;", "Li90/v0;", "phoneNumberState", "<init>", "(Li90/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/v0;", "e", "()Li90/v0;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Normal extends i {
        public static final Parcelable.Creator<Normal> CREATOR = new C1619a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v0 phoneNumberState;

        /* JADX INFO: renamed from: i90.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1619a implements Parcelable.Creator<Normal> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Normal createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Normal(v0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Normal[] newArray(int i11) {
                return new Normal[i11];
            }
        }

        public /* synthetic */ Normal(v0 v0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? v0.HIDDEN : v0Var);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p010i90.i
        /* JADX INFO: renamed from: e, reason: from getter */
        public v0 getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Normal) && this.phoneNumberState == ((Normal) other).phoneNumberState;
        }

        public int hashCode() {
            return this.phoneNumberState.hashCode();
        }

        public String toString() {
            return "Normal(phoneNumberState=" + this.phoneNumberState + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.phoneNumberState.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Normal(v0 phoneNumberState) {
            super(null);
            s.k(phoneNumberState, "phoneNumberState");
            this.phoneNumberState = phoneNumberState;
        }
    }

    private i() {
    }
}
