package t80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import java.security.KeyPair;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: t80.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001e\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*¨\u0006+"}, d2 = {"Lt80/m;", "Landroid/os/Parcelable;", "", "sdkReferenceNumber", "Ljava/security/KeyPair;", "sdkKeyPair", "Lt80/e;", "challengeParameters", "", "timeoutMins", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/String;Ljava/security/KeyPair;Lt80/e;ILcom/stripe/android/stripe3ds2/transaction/n;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/security/KeyPair;", "c", "()Ljava/security/KeyPair;", "Lt80/e;", "()Lt80/e;", "I", "e", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InitChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<InitChallengeArgs> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkReferenceNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyPair sdkKeyPair;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChallengeParameters challengeParameters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int timeoutMins;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final IntentData intentData;

    /* JADX INFO: renamed from: t80.m$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InitChallengeArgs> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InitChallengeArgs createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new InitChallengeArgs(parcel.readString(), (KeyPair) parcel.readSerializable(), ChallengeParameters.CREATOR.createFromParcel(parcel), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InitChallengeArgs[] newArray(int i11) {
            return new InitChallengeArgs[i11];
        }
    }

    public InitChallengeArgs(String sdkReferenceNumber, KeyPair sdkKeyPair, ChallengeParameters challengeParameters, int i11, IntentData intentData) {
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        p013kotlin.jvm.internal.s.k(sdkKeyPair, "sdkKeyPair");
        p013kotlin.jvm.internal.s.k(challengeParameters, "challengeParameters");
        p013kotlin.jvm.internal.s.k(intentData, "intentData");
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkKeyPair = sdkKeyPair;
        this.challengeParameters = challengeParameters;
        this.timeoutMins = i11;
        this.intentData = intentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChallengeParameters getChallengeParameters() {
        return this.challengeParameters;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IntentData getIntentData() {
        return this.intentData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final KeyPair getSdkKeyPair() {
        return this.sdkKeyPair;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTimeoutMins() {
        return this.timeoutMins;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitChallengeArgs)) {
            return false;
        }
        InitChallengeArgs initChallengeArgs = (InitChallengeArgs) other;
        return p013kotlin.jvm.internal.s.f(this.sdkReferenceNumber, initChallengeArgs.sdkReferenceNumber) && p013kotlin.jvm.internal.s.f(this.sdkKeyPair, initChallengeArgs.sdkKeyPair) && p013kotlin.jvm.internal.s.f(this.challengeParameters, initChallengeArgs.challengeParameters) && this.timeoutMins == initChallengeArgs.timeoutMins && p013kotlin.jvm.internal.s.f(this.intentData, initChallengeArgs.intentData);
    }

    public int hashCode() {
        return (((((((this.sdkReferenceNumber.hashCode() * 31) + this.sdkKeyPair.hashCode()) * 31) + this.challengeParameters.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkKeyPair=" + this.sdkKeyPair + ", challengeParameters=" + this.challengeParameters + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeSerializable(this.sdkKeyPair);
        this.challengeParameters.writeToParcel(parcel, flags);
        parcel.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(parcel, flags);
    }
}
