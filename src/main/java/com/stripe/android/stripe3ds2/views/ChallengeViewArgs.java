package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u00105R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:R\u0014\u0010=\u001a\u00020;8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010<¨\u0006>"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/m;", "Landroid/os/Parcelable;", "Lcom/stripe/android/stripe3ds2/transactions/b;", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lq80/m;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/c$b;", "creqExecutorFactory", "", "timeoutMins", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/b;Lcom/stripe/android/stripe3ds2/transactions/a;Lq80/m;Lcom/stripe/android/stripe3ds2/transaction/c$a;Lcom/stripe/android/stripe3ds2/transaction/c$b;ILcom/stripe/android/stripe3ds2/transaction/n;)V", "Landroid/os/Bundle;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/stripe3ds2/transactions/b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/stripe3ds2/transactions/b;", "b", "Lcom/stripe/android/stripe3ds2/transactions/a;", "()Lcom/stripe/android/stripe3ds2/transactions/a;", "c", "Lq80/m;", "h", "()Lq80/m;", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "()Lcom/stripe/android/stripe3ds2/transaction/c$a;", "e", "Lcom/stripe/android/stripe3ds2/transaction/c$b;", "()Lcom/stripe/android/stripe3ds2/transaction/c$b;", "f", "I", "g", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "Lt80/q;", "()Lt80/q;", "sdkTransactionId", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallengeViewArgs implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChallengeResponseData cresData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChallengeRequestData creqData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q80.m uiCustomization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.stripe3ds2.transaction.c.Config creqExecutorConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.stripe3ds2.transaction.c.b creqExecutorFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int timeoutMins;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final IntentData intentData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/m$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "extras", "Lcom/stripe/android/stripe3ds2/views/m;", "a", "(Landroid/os/Bundle;)Lcom/stripe/android/stripe3ds2/views/m;", "", "EXTRA_ARGS", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeViewArgs a(Bundle extras) {
            p013kotlin.jvm.internal.s.k(extras, "extras");
            Object objA = q5.c.a(extras, "extra_args", ChallengeViewArgs.class);
            if (objA != null) {
                return (ChallengeViewArgs) objA;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.m$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ChallengeViewArgs> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeViewArgs createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), (q80.m) parcel.readParcelable(ChallengeViewArgs.class.getClassLoader()), com.stripe.android.stripe3ds2.transaction.c.Config.CREATOR.createFromParcel(parcel), (com.stripe.android.stripe3ds2.transaction.c.b) parcel.readSerializable(), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeViewArgs[] newArray(int i11) {
            return new ChallengeViewArgs[i11];
        }
    }

    public ChallengeViewArgs(ChallengeResponseData cresData, ChallengeRequestData creqData, q80.m uiCustomization, com.stripe.android.stripe3ds2.transaction.c.Config creqExecutorConfig, com.stripe.android.stripe3ds2.transaction.c.b creqExecutorFactory, int i11, IntentData intentData) {
        p013kotlin.jvm.internal.s.k(cresData, "cresData");
        p013kotlin.jvm.internal.s.k(creqData, "creqData");
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        p013kotlin.jvm.internal.s.k(creqExecutorConfig, "creqExecutorConfig");
        p013kotlin.jvm.internal.s.k(creqExecutorFactory, "creqExecutorFactory");
        p013kotlin.jvm.internal.s.k(intentData, "intentData");
        this.cresData = cresData;
        this.creqData = creqData;
        this.uiCustomization = uiCustomization;
        this.creqExecutorConfig = creqExecutorConfig;
        this.creqExecutorFactory = creqExecutorFactory;
        this.timeoutMins = i11;
        this.intentData = intentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChallengeRequestData getCreqData() {
        return this.creqData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.stripe.android.stripe3ds2.transaction.c.Config getCreqExecutorConfig() {
        return this.creqExecutorConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.stripe.android.stripe3ds2.transaction.c.b getCreqExecutorFactory() {
        return this.creqExecutorFactory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChallengeResponseData getCresData() {
        return this.cresData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final IntentData getIntentData() {
        return this.intentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeViewArgs)) {
            return false;
        }
        ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) other;
        return p013kotlin.jvm.internal.s.f(this.cresData, challengeViewArgs.cresData) && p013kotlin.jvm.internal.s.f(this.creqData, challengeViewArgs.creqData) && p013kotlin.jvm.internal.s.f(this.uiCustomization, challengeViewArgs.uiCustomization) && p013kotlin.jvm.internal.s.f(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && p013kotlin.jvm.internal.s.f(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins && p013kotlin.jvm.internal.s.f(this.intentData, challengeViewArgs.intentData);
    }

    public final t80.q f() {
        return this.creqData.getSdkTransId();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTimeoutMins() {
        return this.timeoutMins;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q80.m getUiCustomization() {
        return this.uiCustomization;
    }

    public int hashCode() {
        return (((((((((((this.cresData.hashCode() * 31) + this.creqData.hashCode()) * 31) + this.uiCustomization.hashCode()) * 31) + this.creqExecutorConfig.hashCode()) * 31) + this.creqExecutorFactory.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public final Bundle i() {
        return q5.d.b(jn0.x.a("extra_args", this));
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.cresData + ", creqData=" + this.creqData + ", uiCustomization=" + this.uiCustomization + ", creqExecutorConfig=" + this.creqExecutorConfig + ", creqExecutorFactory=" + this.creqExecutorFactory + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.cresData.writeToParcel(parcel, flags);
        this.creqData.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.uiCustomization, flags);
        this.creqExecutorConfig.writeToParcel(parcel, flags);
        parcel.writeSerializable(this.creqExecutorFactory);
        parcel.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(parcel, flags);
    }
}
