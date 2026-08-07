package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.q0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001c\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/stripe/android/model/q0;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/q0$c;", "type", "<init>", "(Lcom/stripe/android/model/q0$c;)V", "", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/q0$c;", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MandateDataParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c type;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f51444b = new a(null);
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.q0$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/q0$a;", "", "<init>", "()V", "", "PARAM_CUSTOMER_ACCEPTANCE", "Ljava/lang/String;", "PARAM_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.q0$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MandateDataParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MandateDataParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new MandateDataParams((c) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MandateDataParams[] newArray(int i11) {
            return new MandateDataParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.q0$c */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/q0$c;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "code", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/stripe/android/model/q0$c$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String code;

        /* JADX INFO: renamed from: com.stripe.android.model.q0$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B+\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/stripe/android/model/q0$c$a;", "Lcom/stripe/android/model/q0$c;", "", "ipAddress", "userAgent", "", "inferFromClient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "e", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Online extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ipAddress;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String userAgent;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean inferFromClient;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Online> CREATOR = new b();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final Online f51448f = new Online(null, null, true, 3, null);

            /* JADX INFO: renamed from: com.stripe.android.model.q0$c$a$a, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/q0$c$a$a;", "", "<init>", "()V", "Lcom/stripe/android/model/q0$c$a;", "DEFAULT", "Lcom/stripe/android/model/q0$c$a;", "a", "()Lcom/stripe/android/model/q0$c$a;", "", "PARAM_INFER_FROM_CLIENT", "Ljava/lang/String;", "PARAM_IP_ADDRESS", "PARAM_USER_AGENT", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Online a() {
                    return Online.f51448f;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.q0$c$a$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<Online> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Online createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Online[] newArray(int i11) {
                    return new Online[i11];
                }
            }

            public /* synthetic */ Online(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
            }

            @Override // com.stripe.android.model.o1
            public Map<String, Object> c3() {
                if (this.inferFromClient) {
                    return p013kotlin.collections.v0.f(jn0.x.a("infer_from_client", Boolean.TRUE));
                }
                String str = this.ipAddress;
                if (str == null) {
                    str = "";
                }
                Pair pairA = jn0.x.a("ip_address", str);
                String str2 = this.userAgent;
                return p013kotlin.collections.v0.m(pairA, jn0.x.a("user_agent", str2 != null ? str2 : ""));
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Online)) {
                    return false;
                }
                Online online = (Online) other;
                return p013kotlin.jvm.internal.s.f(this.ipAddress, online.ipAddress) && p013kotlin.jvm.internal.s.f(this.userAgent, online.userAgent) && this.inferFromClient == online.inferFromClient;
            }

            public int hashCode() {
                String str = this.ipAddress;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.userAgent;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.inferFromClient);
            }

            public String toString() {
                return "Online(ipAddress=" + this.ipAddress + ", userAgent=" + this.userAgent + ", inferFromClient=" + this.inferFromClient + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.ipAddress);
                parcel.writeString(this.userAgent);
                parcel.writeInt(this.inferFromClient ? 1 : 0);
            }

            public Online(String str, String str2, boolean z11) {
                super("online", null);
                this.ipAddress = str;
                this.userAgent = str2;
                this.inferFromClient = z11;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Online(String ipAddress, String userAgent) {
                this(ipAddress, userAgent, false);
                p013kotlin.jvm.internal.s.k(ipAddress, "ipAddress");
                p013kotlin.jvm.internal.s.k(userAgent, "userAgent");
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        private c(String str) {
            this.code = str;
        }
    }

    public MandateDataParams(c type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.type = type;
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        return p013kotlin.collections.v0.f(jn0.x.a("customer_acceptance", p013kotlin.collections.v0.m(jn0.x.a("type", this.type.getCode()), jn0.x.a(this.type.getCode(), this.type.c3()))));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MandateDataParams) && p013kotlin.jvm.internal.s.f(this.type, ((MandateDataParams) other).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "MandateDataParams(type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.type, flags);
    }
}
