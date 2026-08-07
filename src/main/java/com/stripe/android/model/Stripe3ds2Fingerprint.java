package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.m1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006&"}, d2 = {"Lcom/stripe/android/model/m1;", "Landroid/os/Parcelable;", "", "source", "directoryServerName", "serverTransactionId", "Lcom/stripe/android/model/m1$b;", "directoryServerEncryption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/m1$b;)V", "Lcom/stripe/android/model/StripeIntent$a$j$b;", "sdkData", "(Lcom/stripe/android/model/StripeIntent$a$j$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "c", "b", "getServerTransactionId", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/m1$b;", "()Lcom/stripe/android/model/m1$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Stripe3ds2Fingerprint implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryServerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serverTransactionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DirectoryServerEncryption directoryServerEncryption;

    /* JADX INFO: renamed from: com.stripe.android.model.m1$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Stripe3ds2Fingerprint> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2Fingerprint createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2Fingerprint[] newArray(int i11) {
            return new Stripe3ds2Fingerprint[i11];
        }
    }

    public Stripe3ds2Fingerprint(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(directoryServerName, "directoryServerName");
        p013kotlin.jvm.internal.s.k(serverTransactionId, "serverTransactionId");
        p013kotlin.jvm.internal.s.k(directoryServerEncryption, "directoryServerEncryption");
        this.source = source;
        this.directoryServerName = directoryServerName;
        this.serverTransactionId = serverTransactionId;
        this.directoryServerEncryption = directoryServerEncryption;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2Fingerprint)) {
            return false;
        }
        Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) other;
        return p013kotlin.jvm.internal.s.f(this.source, stripe3ds2Fingerprint.source) && p013kotlin.jvm.internal.s.f(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && p013kotlin.jvm.internal.s.f(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && p013kotlin.jvm.internal.s.f(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.directoryServerName.hashCode()) * 31) + this.serverTransactionId.hashCode()) * 31) + this.directoryServerEncryption.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.source + ", directoryServerName=" + this.directoryServerName + ", serverTransactionId=" + this.serverTransactionId + ", directoryServerEncryption=" + this.directoryServerEncryption + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.source);
        parcel.writeString(this.directoryServerName);
        parcel.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(parcel, flags);
    }

    /* JADX INFO: renamed from: com.stripe.android.model.m1$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001 B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stripe/android/model/m1$b;", "Landroid/os/Parcelable;", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "keyId", "<init>", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "dsCertificateData", "rootCertsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Ljava/security/PublicKey;", "c", "()Ljava/security/PublicKey;", "Ljava/util/List;", "e", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DirectoryServerEncryption implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryServerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PublicKey directoryServerPublicKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<X509Certificate> rootCerts;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String keyId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a f51407e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f51408f = 8;
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new C0905b();

        /* JADX INFO: renamed from: com.stripe.android.model.m1$b$a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/m1$b$a;", "", "<init>", "()V", "", "", "certificatesData", "Ljava/security/cert/X509Certificate;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/util/List;", "certificateData", "c", "(Ljava/lang/String;)Ljava/security/cert/X509Certificate;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate c(String certificateData) throws CertificateException {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = certificateData.getBytes(p013kotlin.text.d.UTF_8);
                p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                p013kotlin.jvm.internal.s.i(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) certificateGenerateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List<X509Certificate> d(List<String> certificatesData) {
                List<String> list = certificatesData;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(DirectoryServerEncryption.f51407e.c((String) it.next()));
                }
                return arrayList;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.m1$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0905b implements Parcelable.Creator<DirectoryServerEncryption> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new DirectoryServerEncryption(string, publicKey, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DirectoryServerEncryption[] newArray(int i11) {
                return new DirectoryServerEncryption[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectoryServerEncryption(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
            p013kotlin.jvm.internal.s.k(directoryServerPublicKey, "directoryServerPublicKey");
            p013kotlin.jvm.internal.s.k(rootCerts, "rootCerts");
            this.directoryServerId = directoryServerId;
            this.directoryServerPublicKey = directoryServerPublicKey;
            this.rootCerts = rootCerts;
            this.keyId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getKeyId() {
            return this.keyId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<X509Certificate> e() {
            return this.rootCerts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectoryServerEncryption)) {
                return false;
            }
            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
            return p013kotlin.jvm.internal.s.f(this.directoryServerId, directoryServerEncryption.directoryServerId) && p013kotlin.jvm.internal.s.f(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && p013kotlin.jvm.internal.s.f(this.rootCerts, directoryServerEncryption.rootCerts) && p013kotlin.jvm.internal.s.f(this.keyId, directoryServerEncryption.keyId);
        }

        public int hashCode() {
            int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.directoryServerPublicKey.hashCode()) * 31) + this.rootCerts.hashCode()) * 31;
            String str = this.keyId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", directoryServerPublicKey=" + this.directoryServerPublicKey + ", rootCerts=" + this.rootCerts + ", keyId=" + this.keyId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.directoryServerId);
            parcel.writeSerializable(this.directoryServerPublicKey);
            List<X509Certificate> list = this.rootCerts;
            parcel.writeInt(list.size());
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeSerializable(it.next());
            }
            parcel.writeString(this.keyId);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
            p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
            p013kotlin.jvm.internal.s.k(dsCertificateData, "dsCertificateData");
            p013kotlin.jvm.internal.s.k(rootCertsData, "rootCertsData");
            a aVar = f51407e;
            PublicKey publicKey = aVar.c(dsCertificateData).getPublicKey();
            p013kotlin.jvm.internal.s.j(publicKey, "getPublicKey(...)");
            this(directoryServerId, publicKey, (List<? extends X509Certificate>) aVar.d(rootCertsData), str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.a.j.Use3DS2 sdkData) {
        this(sdkData.getSource(), sdkData.getServerName(), sdkData.getTransactionId(), new DirectoryServerEncryption(sdkData.getServerEncryption().getDirectoryServerId(), sdkData.getServerEncryption().getDsCertificateData(), sdkData.getServerEncryption().d(), sdkData.getServerEncryption().getKeyId()));
        p013kotlin.jvm.internal.s.k(sdkData, "sdkData");
    }
}
