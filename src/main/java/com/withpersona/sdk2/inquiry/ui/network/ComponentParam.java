package com.withpersona.sdk2.inquiry.ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@p013kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Landroid/os/Parcelable;", "<init>", "()V", "Adapter", DateTokenConverter.CONVERTER_KEY, "e", "b", "c", "a", "f", "g", "h", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$f;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$g;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$h;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ComponentParam implements Parcelable {

    @p013kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter extends com.squareup.moshi.h<ComponentParam> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Adapter f58716a = new Adapter();

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f58717a;

            static {
                int[] iArr = new int[nh0.a.values().length];
                try {
                    iArr[nh0.a.NotRequested.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nh0.a.NotSupported.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[nh0.a.Failed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[nh0.a.Success.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f58717a = iArr;
            }
        }

        private Adapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        @com.squareup.moshi.f
        public ComponentParam fromJson(k reader) {
            s.k(reader, "reader");
            return null;
        }

        @Override // com.squareup.moshi.h
        @x
        public void toJson(r writer, ComponentParam value) {
            String str;
            s.k(writer, "writer");
            if (value instanceof d) {
                writer.G0(((d) value).getValue());
                return;
            }
            if (value instanceof e) {
                writer.c();
                Iterator<String> it = ((e) value).a().iterator();
                while (it.hasNext()) {
                    writer.G0(it.next());
                }
                writer.t();
                return;
            }
            if (value instanceof a) {
                writer.o();
                a aVar = (a) value;
                String street1 = aVar.getStreet1();
                if (street1 != null) {
                    writer.b0("street_1");
                    writer.G0(street1);
                }
                String street2 = aVar.getStreet2();
                if (street2 != null) {
                    writer.b0("street_2");
                    writer.G0(street2);
                }
                String city = aVar.getCity();
                if (city != null) {
                    writer.b0("city");
                    writer.G0(city);
                }
                String subdivision = aVar.getSubdivision();
                if (subdivision != null) {
                    writer.b0("subdivision");
                    writer.G0(subdivision);
                }
                String postalCode = aVar.getPostalCode();
                if (postalCode != null) {
                    writer.b0(PlaceTypes.POSTAL_CODE);
                    writer.G0(postalCode);
                }
                writer.C();
                return;
            }
            if (value instanceof b) {
                writer.J0(((b) value).getValue());
                return;
            }
            if (value instanceof c) {
                writer.G0(new BigDecimal(((c) value).getValue().doubleValue()).toPlainString());
                return;
            }
            if (value instanceof f) {
                writer.G0(((f) value).getSignatureImageString());
                return;
            }
            if (!(value instanceof g)) {
                if (!(value instanceof h)) {
                    if (value != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f84049a;
                    return;
                }
                writer.o();
                h hVar = (h) value;
                String country = hVar.getCountry();
                if (country != null) {
                    writer.b0("idb_country");
                    writer.G0(country);
                }
                String type = hVar.getType();
                if (type != null) {
                    writer.b0("idb_type");
                    writer.G0(type);
                }
                String value2 = hVar.getValue();
                if (value2 != null) {
                    writer.b0("idb_value");
                    writer.G0(value2);
                }
                writer.C();
                return;
            }
            writer.o();
            g gVar = (g) value;
            nh0.a chipAuthenticationStatus = gVar.getChipAuthenticationStatus();
            if (chipAuthenticationStatus != null) {
                writer.b0("caFlag");
                int i11 = a.f58717a[chipAuthenticationStatus.ordinal()];
                if (i11 == 1) {
                    str = "notRequested";
                } else if (i11 == 2) {
                    str = "notSupported";
                } else if (i11 == 3) {
                    str = "failed";
                } else {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "success";
                }
                writer.G0(str);
            }
            String dg1 = gVar.getDg1();
            if (dg1 != null) {
                writer.b0("dg1");
                writer.G0(dg1);
            }
            String dg2 = gVar.getDg2();
            if (dg2 != null) {
                writer.b0("dg2");
                writer.G0(dg2);
            }
            String sod = gVar.getSod();
            if (sod != null) {
                writer.b0("sod");
                writer.G0(sod);
            }
            writer.C();
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "street1", "street2", "city", "subdivision", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "e", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ComponentParam {
        public static final Parcelable.Creator<a> CREATOR = new C1200a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String street1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String street2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String city;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String subdivision;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String postalCode;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1200a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.postalCode = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStreet1() {
            return this.street1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStreet2() {
            return this.street2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubdivision() {
            return this.subdivision;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.street1);
            dest.writeString(this.street2);
            dest.writeString(this.city);
            dest.writeString(this.subdivision);
            dest.writeString(this.postalCode);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ComponentParam {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean value;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new b(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(boolean z11) {
            super(null);
            this.value = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeInt(this.value ? 1 : 0);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/Number;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/Number;", "()Ljava/lang/Number;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends ComponentParam {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Number value;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new c((Number) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Number value) {
            super(null);
            s.k(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Number getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeSerializable(this.value);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ComponentParam {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String value) {
            super(null);
            s.k(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.value);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "", "value", "<init>", "(Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ComponentParam {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> value;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new e(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<String> value) {
            super(null);
            s.k(value, "value");
            this.value = value;
        }

        public final List<String> a() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeStringList(this.value);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$f;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "signatureImageString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends ComponentParam {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String signatureImageString;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        public f(String str) {
            super(null);
            this.signatureImageString = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSignatureImageString() {
            return this.signatureImageString;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.signatureImageString);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$g;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "dg1", "dg2", "sod", "Lnh0/a;", "chipAuthenticationStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnh0/a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Lnh0/a;", "()Lnh0/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends ComponentParam {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String dg1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String dg2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String sod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final nh0.a chipAuthenticationStatus;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : nh0.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g(String str, String str2, String str3, nh0.a aVar) {
            super(null);
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final nh0.a getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDg1() {
            return this.dg1;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDg2() {
            return this.dg2;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSod() {
            return this.sod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.dg1);
            dest.writeString(this.dg2);
            dest.writeString(this.sod);
            nh0.a aVar = this.chipAuthenticationStatus;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", PlaceTypes.COUNTRY, "type", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getType", "c", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends ComponentParam {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String country;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String value;

        @p013kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new h(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i11) {
                return new h[i11];
            }
        }

        public h(String str, String str2, String str3) {
            super(null);
            this.country = str;
            this.type = str2;
            this.value = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.country);
            dest.writeString(this.type);
            dest.writeString(this.value);
        }
    }

    public /* synthetic */ ComponentParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComponentParam() {
    }
}
