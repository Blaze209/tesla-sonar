package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.io.Serializable;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0005\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/c;", "", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/d;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+¨\u0006,"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/c$a;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Lcom/stripe/android/stripe3ds2/security/k;", "messageTransformer", "", "sdkReferenceId", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "acsUrl", "Lcom/stripe/android/stripe3ds2/transaction/c$a$b;", "keys", "<init>", "(Lcom/stripe/android/stripe3ds2/security/k;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/a;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/c$a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/stripe3ds2/security/k;", "c", "()Lcom/stripe/android/stripe3ds2/security/k;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/transactions/a;", "getCreqData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/a;", "e", "Lcom/stripe/android/stripe3ds2/transaction/c$a$b;", "()Lcom/stripe/android/stripe3ds2/transaction/c$a$b;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Serializable, Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new C1076a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.security.k messageTransformer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sdkReferenceId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChallengeRequestData creqData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsUrl;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Keys keys;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1076a implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Config createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Config((com.stripe.android.stripe3ds2.security.k) parcel.readSerializable(), parcel.readString(), ChallengeRequestData.CREATOR.createFromParcel(parcel), parcel.readString(), Keys.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/c$a$b;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "sdkPrivateKeyEncoded", "acsPublicKeyEncoded", "<init>", "([B[B)V", "keys", "", "c", "(Lcom/stripe/android/stripe3ds2/transaction/c$a$b;)Z", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "[B", "b", "()[B", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Keys implements Serializable, Parcelable {
            public static final Parcelable.Creator<Keys> CREATOR = new C1077a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final byte[] sdkPrivateKeyEncoded;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final byte[] acsPublicKeyEncoded;

            /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1077a implements Parcelable.Creator<Keys> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Keys createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Keys(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Keys[] newArray(int i11) {
                    return new Keys[i11];
                }
            }

            public Keys(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                s.k(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                s.k(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.sdkPrivateKeyEncoded = sdkPrivateKeyEncoded;
                this.acsPublicKeyEncoded = acsPublicKeyEncoded;
            }

            private final boolean c(Keys keys) {
                return Arrays.equals(this.sdkPrivateKeyEncoded, keys.sdkPrivateKeyEncoded) && Arrays.equals(this.acsPublicKeyEncoded, keys.acsPublicKeyEncoded);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final byte[] getAcsPublicKeyEncoded() {
                return this.acsPublicKeyEncoded;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final byte[] getSdkPrivateKeyEncoded() {
                return this.sdkPrivateKeyEncoded;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (other instanceof Keys) {
                    return c((Keys) other);
                }
                return false;
            }

            public int hashCode() {
                return v80.c.b(this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.sdkPrivateKeyEncoded) + ", acsPublicKeyEncoded=" + Arrays.toString(this.acsPublicKeyEncoded) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeByteArray(this.sdkPrivateKeyEncoded);
                parcel.writeByteArray(this.acsPublicKeyEncoded);
            }
        }

        public Config(com.stripe.android.stripe3ds2.security.k messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            s.k(messageTransformer, "messageTransformer");
            s.k(sdkReferenceId, "sdkReferenceId");
            s.k(creqData, "creqData");
            s.k(acsUrl, "acsUrl");
            s.k(keys, "keys");
            this.messageTransformer = messageTransformer;
            this.sdkReferenceId = sdkReferenceId;
            this.creqData = creqData;
            this.acsUrl = acsUrl;
            this.keys = keys;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAcsUrl() {
            return this.acsUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Keys getKeys() {
            return this.keys;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.stripe.android.stripe3ds2.security.k getMessageTransformer() {
            return this.messageTransformer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSdkReferenceId() {
            return this.sdkReferenceId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return s.f(this.messageTransformer, config.messageTransformer) && s.f(this.sdkReferenceId, config.sdkReferenceId) && s.f(this.creqData, config.creqData) && s.f(this.acsUrl, config.acsUrl) && s.f(this.keys, config.keys);
        }

        public int hashCode() {
            return (((((((this.messageTransformer.hashCode() * 31) + this.sdkReferenceId.hashCode()) * 31) + this.creqData.hashCode()) * 31) + this.acsUrl.hashCode()) * 31) + this.keys.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.messageTransformer + ", sdkReferenceId=" + this.sdkReferenceId + ", creqData=" + this.creqData + ", acsUrl=" + this.acsUrl + ", keys=" + this.keys + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeSerializable(this.messageTransformer);
            parcel.writeString(this.sdkReferenceId);
            this.creqData.writeToParcel(parcel, flags);
            parcel.writeString(this.acsUrl);
            this.keys.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/c$b;", "Ljava/io/Serializable;", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/stripe3ds2/transaction/c;", "I2", "(Lr80/c;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/stripe3ds2/transaction/c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends Serializable {
        c I2(r80.c errorReporter, CoroutineContext workContext);
    }

    Object a(ChallengeRequestData aVar, Continuation<? super d> continuation);
}
