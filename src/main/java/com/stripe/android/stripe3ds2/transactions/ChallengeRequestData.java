package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import ezvcard.property.Gender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.t;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t80.q;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002\u001a.Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0086\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b1\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b9\u0010\u001dR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b5\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b?\u0010>¨\u0006A"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/a;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "messageVersion", "threeDsServerTransId", "acsTransId", "Lt80/q;", "sdkTransId", "challengeDataEntry", "Lcom/stripe/android/stripe3ds2/transactions/a$a;", "cancelReason", "challengeHtmlDataEntry", "", "Lcom/stripe/android/stripe3ds2/transactions/c;", "messageExtensions", "", "oobContinue", "shouldResendChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt80/q;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/a$a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lorg/json/JSONObject;", "j", "()Lorg/json/JSONObject;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/stripe3ds2/transactions/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt80/q;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/a$a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transactions/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "f", "b", "h", "c", DateTokenConverter.CONVERTER_KEY, "Lt80/q;", "g", "()Lt80/q;", "e", "getChallengeDataEntry", "Lcom/stripe/android/stripe3ds2/transactions/a$a;", "()Lcom/stripe/android/stripe3ds2/transactions/a$a;", "getChallengeHtmlDataEntry", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getOobContinue", "()Ljava/lang/Boolean;", "getShouldResendChallenge", "k", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallengeRequestData implements Serializable, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String threeDsServerTransId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsTransId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q sdkTransId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeDataEntry;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1080a cancelReason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeHtmlDataEntry;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MessageExtension> messageExtensions;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean oobContinue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean shouldResendChallenge;
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/a$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "UserSelected", "Reserved", "TransactionTimedOutDecoupled", "TransactionTimedOutOther", "TransactionTimedOutFirstCreq", "TransactionError", "Unknown", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC1080a {
        UserSelected("01"),
        Reserved("02"),
        TransactionTimedOutDecoupled("03"),
        TransactionTimedOutOther(WebrtcBuildVersion.webrtc_commit),
        TransactionTimedOutFirstCreq("05"),
        TransactionError("06"),
        Unknown("07");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        EnumC1080a(String str) {
            this.code = str;
        }

        public static EnumEntries<EnumC1080a> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.a$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ChallengeRequestData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            q qVarCreateFromParcel = q.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            EnumC1080a enumC1080aValueOf = parcel.readInt() == 0 ? null : EnumC1080a.valueOf(parcel.readString());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChallengeRequestData(string, string2, string3, qVarCreateFromParcel, string4, enumC1080aValueOf, string5, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeRequestData[] newArray(int i11) {
            return new ChallengeRequestData[i11];
        }
    }

    public ChallengeRequestData(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC1080a enumC1080a, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        s.k(messageVersion, "messageVersion");
        s.k(threeDsServerTransId, "threeDsServerTransId");
        s.k(acsTransId, "acsTransId");
        s.k(sdkTransId, "sdkTransId");
        this.messageVersion = messageVersion;
        this.threeDsServerTransId = threeDsServerTransId;
        this.acsTransId = acsTransId;
        this.sdkTransId = sdkTransId;
        this.challengeDataEntry = str;
        this.cancelReason = enumC1080a;
        this.challengeHtmlDataEntry = str2;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeRequestData b(ChallengeRequestData challengeRequestData, String str, String str2, String str3, q qVar, String str4, EnumC1080a enumC1080a, String str5, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = challengeRequestData.messageVersion;
        }
        if ((i11 & 2) != 0) {
            str2 = challengeRequestData.threeDsServerTransId;
        }
        if ((i11 & 4) != 0) {
            str3 = challengeRequestData.acsTransId;
        }
        if ((i11 & 8) != 0) {
            qVar = challengeRequestData.sdkTransId;
        }
        if ((i11 & 16) != 0) {
            str4 = challengeRequestData.challengeDataEntry;
        }
        if ((i11 & 32) != 0) {
            enumC1080a = challengeRequestData.cancelReason;
        }
        if ((i11 & 64) != 0) {
            str5 = challengeRequestData.challengeHtmlDataEntry;
        }
        if ((i11 & 128) != 0) {
            list = challengeRequestData.messageExtensions;
        }
        if ((i11 & 256) != 0) {
            bool = challengeRequestData.oobContinue;
        }
        if ((i11 & 512) != 0) {
            bool2 = challengeRequestData.shouldResendChallenge;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        EnumC1080a enumC1080a2 = enumC1080a;
        return challengeRequestData.a(str, str2, str3, qVar, str7, enumC1080a2, str6, list2, bool3, bool4);
    }

    public final ChallengeRequestData a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String challengeDataEntry, EnumC1080a cancelReason, String challengeHtmlDataEntry, List<MessageExtension> messageExtensions, Boolean oobContinue, Boolean shouldResendChallenge) {
        s.k(messageVersion, "messageVersion");
        s.k(threeDsServerTransId, "threeDsServerTransId");
        s.k(acsTransId, "acsTransId");
        s.k(sdkTransId, "sdkTransId");
        return new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, challengeDataEntry, cancelReason, challengeHtmlDataEntry, messageExtensions, oobContinue, shouldResendChallenge);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAcsTransId() {
        return this.acsTransId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC1080a getCancelReason() {
        return this.cancelReason;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<MessageExtension> e() {
        return this.messageExtensions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeRequestData)) {
            return false;
        }
        ChallengeRequestData challengeRequestData = (ChallengeRequestData) other;
        return s.f(this.messageVersion, challengeRequestData.messageVersion) && s.f(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && s.f(this.acsTransId, challengeRequestData.acsTransId) && s.f(this.sdkTransId, challengeRequestData.sdkTransId) && s.f(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && s.f(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && s.f(this.messageExtensions, challengeRequestData.messageExtensions) && s.f(this.oobContinue, challengeRequestData.oobContinue) && s.f(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q getSdkTransId() {
        return this.sdkTransId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.messageVersion.hashCode() * 31) + this.threeDsServerTransId.hashCode()) * 31) + this.acsTransId.hashCode()) * 31) + this.sdkTransId.hashCode()) * 31;
        String str = this.challengeDataEntry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC1080a enumC1080a = this.cancelReason;
        int iHashCode3 = (iHashCode2 + (enumC1080a == null ? 0 : enumC1080a.hashCode())) * 31;
        String str2 = this.challengeHtmlDataEntry;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final ChallengeRequestData i() {
        return b(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    public final JSONObject j() {
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            JSONObject jSONObjectPut = new JSONObject().put("messageType", "CReq").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId.getValue()).put("threeDSServerTransID", this.threeDsServerTransId).put("acsTransID", this.acsTransId);
            EnumC1080a enumC1080a = this.cancelReason;
            if (enumC1080a != null) {
                jSONObjectPut.put("challengeCancel", enumC1080a.getCode());
            }
            String str = this.challengeDataEntry;
            if (str != null) {
                jSONObjectPut.put("challengeDataEntry", str);
            }
            String str2 = this.challengeHtmlDataEntry;
            if (str2 != null) {
                jSONObjectPut.put("challengeHTMLDataEntry", str2);
            }
            JSONArray jSONArrayC = MessageExtension.INSTANCE.c(this.messageExtensions);
            if (jSONArrayC != null) {
                jSONObjectPut.put("messageExtensions", jSONArrayC);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                jSONObjectPut.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                jSONObjectPut.put("resendChallenge", bool2.booleanValue() ? "Y" : Gender.NONE);
            }
            s.h(jSONObjectPut);
            return jSONObjectPut;
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            Throwable thE = jn0.s.e(jn0.s.b(t.a(th2)));
            if (thE == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(thE);
        }
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.messageVersion + ", threeDsServerTransId=" + this.threeDsServerTransId + ", acsTransId=" + this.acsTransId + ", sdkTransId=" + this.sdkTransId + ", challengeDataEntry=" + this.challengeDataEntry + ", cancelReason=" + this.cancelReason + ", challengeHtmlDataEntry=" + this.challengeHtmlDataEntry + ", messageExtensions=" + this.messageExtensions + ", oobContinue=" + this.oobContinue + ", shouldResendChallenge=" + this.shouldResendChallenge + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.threeDsServerTransId);
        parcel.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(parcel, flags);
        parcel.writeString(this.challengeDataEntry);
        EnumC1080a enumC1080a = this.cancelReason;
        if (enumC1080a == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1080a.name());
        }
        parcel.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MessageExtension> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, q qVar, String str4, EnumC1080a enumC1080a, String str5, List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, qVar, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : enumC1080a, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : list, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2);
    }
}
