package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.i1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0003\u001f'(B'\b\u0007\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/stripe/android/model/i1;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/model/i1$c;", "items", "Lcom/stripe/android/model/i1$d;", "shipping", "<init>", "(Ljava/util/List;Lcom/stripe/android/model/i1$d;)V", "", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Lcom/stripe/android/model/i1$d;", "getShipping", "()Lcom/stripe/android/model/i1$d;", "c", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SourceOrderParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Item> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shipping shipping;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f51230c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51231d = 8;
    public static final Parcelable.Creator<SourceOrderParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.i1$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/i1$a;", "", "<init>", "()V", "", "PARAM_ITEMS", "Ljava/lang/String;", "PARAM_SHIPPING", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.i1$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SourceOrderParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SourceOrderParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                }
            }
            return new SourceOrderParams(arrayList, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SourceOrderParams[] newArray(int i11) {
            return new SourceOrderParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.i1$c, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0002!)BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(¨\u00063"}, d2 = {"Lcom/stripe/android/model/i1$c;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/i1$c$c;", "type", "", "amount", "", "currency", "description", "parent", "quantity", "<init>", "(Lcom/stripe/android/model/i1$c$c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/i1$c$c;", "getType", "()Lcom/stripe/android/model/i1$c$c;", "b", "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getCurrency", DateTokenConverter.CONVERTER_KEY, "getDescription", "e", "getParent", "f", "getQuantity", "g", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC0900c type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer quantity;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final a f51234g = new a(null);
        public static final Parcelable.Creator<Item> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.i1$c$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/i1$c$a;", "", "<init>", "()V", "", "PARAM_AMOUNT", "Ljava/lang/String;", "PARAM_CURRENCY", "PARAM_DESCRIPTION", "PARAM_PARENT", "PARAM_QUANTITY", "PARAM_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.i1$c$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Item createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Item(parcel.readInt() == 0 ? null : EnumC0900c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Item[] newArray(int i11) {
                return new Item[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.i1$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/i1$c$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC0900c {
            Sku("sku"),
            Tax("tax"),
            Shipping("shipping");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String code;

            EnumC0900c(String str) {
                this.code = str;
            }

            public static EnumEntries<EnumC0900c> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }
        }

        public Item() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapI = p013kotlin.collections.v0.i();
            Integer num = this.amount;
            Map mapF = num != null ? p013kotlin.collections.v0.f(jn0.x.a("amount", Integer.valueOf(num.intValue()))) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            Map mapR = p013kotlin.collections.v0.r(mapI, mapF);
            String str = this.currency;
            Map mapF2 = str != null ? p013kotlin.collections.v0.f(jn0.x.a("currency", str)) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            Map mapR2 = p013kotlin.collections.v0.r(mapR, mapF2);
            String str2 = this.description;
            Map mapF3 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("description", str2)) : null;
            if (mapF3 == null) {
                mapF3 = p013kotlin.collections.v0.i();
            }
            Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF3);
            String str3 = this.parent;
            Map mapF4 = str3 != null ? p013kotlin.collections.v0.f(jn0.x.a("parent", str3)) : null;
            if (mapF4 == null) {
                mapF4 = p013kotlin.collections.v0.i();
            }
            Map mapR4 = p013kotlin.collections.v0.r(mapR3, mapF4);
            Integer num2 = this.quantity;
            Map mapF5 = num2 != null ? p013kotlin.collections.v0.f(jn0.x.a("quantity", Integer.valueOf(num2.intValue()))) : null;
            if (mapF5 == null) {
                mapF5 = p013kotlin.collections.v0.i();
            }
            Map mapR5 = p013kotlin.collections.v0.r(mapR4, mapF5);
            EnumC0900c enumC0900c = this.type;
            Map mapF6 = enumC0900c != null ? p013kotlin.collections.v0.f(jn0.x.a("type", enumC0900c.getCode())) : null;
            if (mapF6 == null) {
                mapF6 = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapR5, mapF6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.type == item.type && p013kotlin.jvm.internal.s.f(this.amount, item.amount) && p013kotlin.jvm.internal.s.f(this.currency, item.currency) && p013kotlin.jvm.internal.s.f(this.description, item.description) && p013kotlin.jvm.internal.s.f(this.parent, item.parent) && p013kotlin.jvm.internal.s.f(this.quantity, item.quantity);
        }

        public int hashCode() {
            EnumC0900c enumC0900c = this.type;
            int iHashCode = (enumC0900c == null ? 0 : enumC0900c.hashCode()) * 31;
            Integer num = this.amount;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.parent;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.quantity;
            return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.type + ", amount=" + this.amount + ", currency=" + this.currency + ", description=" + this.description + ", parent=" + this.parent + ", quantity=" + this.quantity + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            EnumC0900c enumC0900c = this.type;
            if (enumC0900c == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(enumC0900c.name());
            }
            Integer num = this.amount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.currency);
            parcel.writeString(this.description);
            parcel.writeString(this.parent);
            Integer num2 = this.quantity;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
        }

        public Item(EnumC0900c enumC0900c, Integer num, String str, String str2, String str3, Integer num2) {
            this.type = enumC0900c;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.parent = str3;
            this.quantity = num2;
        }

        public /* synthetic */ Item(EnumC0900c enumC0900c, Integer num, String str, String str2, String str3, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : enumC0900c, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num2);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.i1$d, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001 B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0011¨\u0006."}, d2 = {"Lcom/stripe/android/model/i1$d;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", "carrier", "name", "phone", "trackingNumber", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/b;", "getAddress", "()Lcom/stripe/android/model/b;", "b", "Ljava/lang/String;", "getCarrier", "c", "getName", DateTokenConverter.CONVERTER_KEY, "getPhone", "e", "getTrackingNumber", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shipping implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carrier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String trackingNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final a f51241f = new a(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.i1$d$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/i1$d$a;", "", "<init>", "()V", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.i1$d$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Shipping> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Shipping createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            p013kotlin.jvm.internal.s.k(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.ADDRESS, this.address.c3()));
            String str = this.carrier;
            Map mapF2 = str != null ? p013kotlin.collections.v0.f(jn0.x.a("carrier", str)) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            Map mapR = p013kotlin.collections.v0.r(mapF, mapF2);
            String str2 = this.name;
            Map mapF3 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("name", str2)) : null;
            if (mapF3 == null) {
                mapF3 = p013kotlin.collections.v0.i();
            }
            Map mapR2 = p013kotlin.collections.v0.r(mapR, mapF3);
            String str3 = this.phone;
            Map mapF4 = str3 != null ? p013kotlin.collections.v0.f(jn0.x.a("phone", str3)) : null;
            if (mapF4 == null) {
                mapF4 = p013kotlin.collections.v0.i();
            }
            Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF4);
            String str4 = this.trackingNumber;
            Map mapF5 = str4 != null ? p013kotlin.collections.v0.f(jn0.x.a("tracking_number", str4)) : null;
            if (mapF5 == null) {
                mapF5 = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapR3, mapF5);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) other;
            return p013kotlin.jvm.internal.s.f(this.address, shipping.address) && p013kotlin.jvm.internal.s.f(this.carrier, shipping.carrier) && p013kotlin.jvm.internal.s.f(this.name, shipping.name) && p013kotlin.jvm.internal.s.f(this.phone, shipping.phone) && p013kotlin.jvm.internal.s.f(this.trackingNumber, shipping.trackingNumber);
        }

        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + this.carrier + ", name=" + this.name + ", phone=" + this.phone + ", trackingNumber=" + this.trackingNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.address.writeToParcel(parcel, flags);
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SourceOrderParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapI;
        Map mapI2 = p013kotlin.collections.v0.i();
        List<Item> list = this.items;
        if (list != null) {
            List<Item> list2 = list;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Item) it.next()).c3());
            }
            mapI = p013kotlin.collections.v0.f(jn0.x.a("items", arrayList));
        } else {
            mapI = null;
        }
        if (mapI == null) {
            mapI = p013kotlin.collections.v0.i();
        }
        Map mapR = p013kotlin.collections.v0.r(mapI2, mapI);
        Shipping shipping = this.shipping;
        Map mapF = shipping != null ? p013kotlin.collections.v0.f(jn0.x.a("shipping", shipping.c3())) : null;
        if (mapF == null) {
            mapF = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(mapR, mapF);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceOrderParams)) {
            return false;
        }
        SourceOrderParams sourceOrderParams = (SourceOrderParams) other;
        return p013kotlin.jvm.internal.s.f(this.items, sourceOrderParams.items) && p013kotlin.jvm.internal.s.f(this.shipping, sourceOrderParams.shipping);
    }

    public int hashCode() {
        List<Item> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Shipping shipping = this.shipping;
        return iHashCode + (shipping != null ? shipping.hashCode() : 0);
    }

    public String toString() {
        return "SourceOrderParams(items=" + this.items + ", shipping=" + this.shipping + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Item> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, flags);
        }
    }

    public SourceOrderParams(List<Item> list, Shipping shipping) {
        this.items = list;
        this.shipping = shipping;
    }

    public /* synthetic */ SourceOrderParams(List list, Shipping shipping, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : shipping);
    }
}
