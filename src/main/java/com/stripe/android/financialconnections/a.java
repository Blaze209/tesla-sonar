package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.launcher.e;
import com.stripe.android.model.n0;
import i40.f;
import i40.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0003\t\f\rB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/a;", "", "Ll50/d;", "financialConnectionsSheetLauncher", "<init>", "(Ll50/d;)V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/a$b;)V", "Ll50/d;", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50135c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l50.d financialConnectionsSheetLauncher;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/a$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Li40/f;", "callback", "Lcom/stripe/android/financialconnections/a;", "a", "(Landroidx/fragment/app/Fragment;Li40/f;)Lcom/stripe/android/financialconnections/a;", "Li40/g;", "b", "(Landroidx/fragment/app/Fragment;Li40/g;)Lcom/stripe/android/financialconnections/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Fragment fragment, f callback) {
            s.k(fragment, "fragment");
            s.k(callback, "callback");
            return new a(new com.stripe.android.financialconnections.launcher.c(fragment, callback));
        }

        public final a b(Fragment fragment, g callback) {
            s.k(fragment, "fragment");
            s.k(callback, "callback");
            return new a(new e(fragment, callback));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/a$b;", "Landroid/os/Parcelable;", "", "financialConnectionsSessionClientSecret", "publishableKey", "stripeAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {
        public static final Parcelable.Creator<Configuration> CREATOR = new C0812a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String financialConnectionsSessionClientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publishableKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stripeAccountId;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0812a implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Configuration createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        public Configuration(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
            s.k(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            s.k(publishableKey, "publishableKey");
            this.financialConnectionsSessionClientSecret = financialConnectionsSessionClientSecret;
            this.publishableKey = publishableKey;
            this.stripeAccountId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFinancialConnectionsSessionClientSecret() {
            return this.financialConnectionsSessionClientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return s.f(this.financialConnectionsSessionClientSecret, configuration.financialConnectionsSessionClientSecret) && s.f(this.publishableKey, configuration.publishableKey) && s.f(this.stripeAccountId, configuration.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = ((this.financialConnectionsSessionClientSecret.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
            String str = this.stripeAccountId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Configuration(financialConnectionsSessionClientSecret=" + this.financialConnectionsSessionClientSecret + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.financialConnectionsSessionClientSecret);
            parcel.writeString(this.publishableKey);
            parcel.writeString(this.stripeAccountId);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010\rR\u0013\u0010+\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b'\u0010\r¨\u0006,"}, d2 = {"Lcom/stripe/android/financialconnections/a$c;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/a$c$b;", "initializationMode", "", "amount", "", "currency", "Lcom/stripe/android/model/n0;", "linkMode", "<init>", "(Lcom/stripe/android/financialconnections/a$c$b;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/n0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/a$c$b;", "getInitializationMode", "()Lcom/stripe/android/financialconnections/a$c$b;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "c", "Ljava/lang/String;", "getCurrency", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/n0;", "()Lcom/stripe/android/model/n0;", "paymentIntentId", "setupIntentId", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ElementsSessionContext implements Parcelable {
        public static final Parcelable.Creator<ElementsSessionContext> CREATOR = new C0813a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f50140e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b initializationMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0 linkMode;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0813a implements Parcelable.Creator<ElementsSessionContext> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ElementsSessionContext createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ElementsSessionContext((b) parcel.readParcelable(ElementsSessionContext.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? n0.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ElementsSessionContext[] newArray(int i11) {
                return new ElementsSessionContext[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/a$c$b;", "Landroid/os/Parcelable;", "a", "b", "c", "Lcom/stripe/android/financialconnections/a$c$b$a;", "Lcom/stripe/android/financialconnections/a$c$b$b;", "Lcom/stripe/android/financialconnections/a$c$b$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface b extends Parcelable {

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/a$c$b$a;", "Lcom/stripe/android/financialconnections/a$c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class C0814a implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0814a f50145a = new C0814a();
                public static final Parcelable.Creator<C0814a> CREATOR = new C0815a();

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C0815a implements Parcelable.Creator<C0814a> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C0814a createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        parcel.readInt();
                        return C0814a.f50145a;
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final C0814a[] newArray(int i11) {
                        return new C0814a[i11];
                    }
                }

                private C0814a() {
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0814a);
                }

                public int hashCode() {
                    return 1230712818;
                }

                public String toString() {
                    return "DeferredIntent";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeInt(1);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/a$c$b$b;", "Lcom/stripe/android/financialconnections/a$c$b;", "", "paymentIntentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class PaymentIntent implements b {
                public static final Parcelable.Creator<PaymentIntent> CREATOR = new C0817a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String paymentIntentId;

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$b$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C0817a implements Parcelable.Creator<PaymentIntent> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final PaymentIntent createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new PaymentIntent(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final PaymentIntent[] newArray(int i11) {
                        return new PaymentIntent[i11];
                    }
                }

                public PaymentIntent(String paymentIntentId) {
                    s.k(paymentIntentId, "paymentIntentId");
                    this.paymentIntentId = paymentIntentId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getPaymentIntentId() {
                    return this.paymentIntentId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PaymentIntent) && s.f(this.paymentIntentId, ((PaymentIntent) other).paymentIntentId);
                }

                public int hashCode() {
                    return this.paymentIntentId.hashCode();
                }

                public String toString() {
                    return "PaymentIntent(paymentIntentId=" + this.paymentIntentId + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.paymentIntentId);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$c, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/a$c$b$c;", "Lcom/stripe/android/financialconnections/a$c$b;", "", "setupIntentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SetupIntent implements b {
                public static final Parcelable.Creator<SetupIntent> CREATOR = new C0819a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String setupIntentId;

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.a$c$b$c$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C0819a implements Parcelable.Creator<SetupIntent> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final SetupIntent createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new SetupIntent(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final SetupIntent[] newArray(int i11) {
                        return new SetupIntent[i11];
                    }
                }

                public SetupIntent(String setupIntentId) {
                    s.k(setupIntentId, "setupIntentId");
                    this.setupIntentId = setupIntentId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getSetupIntentId() {
                    return this.setupIntentId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SetupIntent) && s.f(this.setupIntentId, ((SetupIntent) other).setupIntentId);
                }

                public int hashCode() {
                    return this.setupIntentId.hashCode();
                }

                public String toString() {
                    return "SetupIntent(setupIntentId=" + this.setupIntentId + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.setupIntentId);
                }
            }
        }

        public ElementsSessionContext(b initializationMode, Long l11, String str, n0 n0Var) {
            s.k(initializationMode, "initializationMode");
            this.initializationMode = initializationMode;
            this.amount = l11;
            this.currency = str;
            this.linkMode = n0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n0 getLinkMode() {
            return this.linkMode;
        }

        public final String c() {
            b bVar = this.initializationMode;
            b.PaymentIntent paymentIntent = bVar instanceof b.PaymentIntent ? (b.PaymentIntent) bVar : null;
            if (paymentIntent != null) {
                return paymentIntent.getPaymentIntentId();
            }
            return null;
        }

        public final String d() {
            b bVar = this.initializationMode;
            b.SetupIntent setupIntent = bVar instanceof b.SetupIntent ? (b.SetupIntent) bVar : null;
            if (setupIntent != null) {
                return setupIntent.getSetupIntentId();
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementsSessionContext)) {
                return false;
            }
            ElementsSessionContext elementsSessionContext = (ElementsSessionContext) other;
            return s.f(this.initializationMode, elementsSessionContext.initializationMode) && s.f(this.amount, elementsSessionContext.amount) && s.f(this.currency, elementsSessionContext.currency) && this.linkMode == elementsSessionContext.linkMode;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            int iHashCode = this.initializationMode.hashCode() * 31;
            Long l11 = this.amount;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.currency;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            n0 n0Var = this.linkMode;
            return iHashCode3 + (n0Var != null ? n0Var.hashCode() : 0);
        }

        public String toString() {
            return "ElementsSessionContext(initializationMode=" + this.initializationMode + ", amount=" + this.amount + ", currency=" + this.currency + ", linkMode=" + this.linkMode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.initializationMode, flags);
            Long l11 = this.amount;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.currency);
            n0 n0Var = this.linkMode;
            if (n0Var == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(n0Var.name());
            }
        }
    }

    public a(l50.d financialConnectionsSheetLauncher) {
        s.k(financialConnectionsSheetLauncher, "financialConnectionsSheetLauncher");
        this.financialConnectionsSheetLauncher = financialConnectionsSheetLauncher;
    }

    public final void a(Configuration configuration) {
        s.k(configuration, "configuration");
        this.financialConnectionsSheetLauncher.a(configuration, null);
    }
}
