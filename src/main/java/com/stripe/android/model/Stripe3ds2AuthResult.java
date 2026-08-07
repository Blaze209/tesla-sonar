package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.model.l1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\"(,Bm\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b%\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b(\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010\u0013¨\u00068"}, d2 = {"Lcom/stripe/android/model/l1;", "Lt30/f;", "", "id", "Lcom/stripe/android/model/l1$a;", "ares", "", "created", "source", "state", "", "liveMode", "Lcom/stripe/android/model/l1$d;", AnalyticsAttribute.Error, "fallbackRedirectUrl", "creq", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/l1$a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/l1$d;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/model/l1$a;", "()Lcom/stripe/android/model/l1$a;", "c", "Ljava/lang/Long;", "getCreated", "()Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "getSource", "e", "getState", "f", "Z", "g", "Lcom/stripe/android/model/l1$d;", "()Lcom/stripe/android/model/l1$d;", "h", IntegerTokenConverter.CONVERTER_KEY, "getCreq", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Stripe3ds2AuthResult implements t30.f {
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ares ares;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long created;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean liveMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ThreeDS2Error error;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fallbackRedirectUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String creq;

    /* JADX INFO: renamed from: com.stripe.android.model.l1$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0001$B\u0093\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u0011\u00103\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b(\u00102¨\u00065"}, d2 = {"Lcom/stripe/android/model/l1$a;", "Lt30/f;", "", "threeDSServerTransId", "acsChallengeMandated", "acsSignedContent", "acsTransId", "acsUrl", "authenticationType", "cardholderInfo", "", "Lcom/stripe/android/model/l1$c;", "messageExtension", "messageType", "messageVersion", "sdkTransId", "transStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "()Z", "isChallenge", "m", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ares implements t30.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String threeDSServerTransId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsChallengeMandated;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsSignedContent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsTransId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsUrl;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authenticationType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardholderInfo;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<MessageExtension> messageExtension;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageVersion;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sdkTransId;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transStatus;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f51358n = 8;
        public static final Parcelable.Creator<Ares> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.l1$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Ares> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Ares createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList2.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new Ares(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ares[] newArray(int i11) {
                return new Ares[i11];
            }
        }

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = list;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAcsSignedContent() {
            return this.acsSignedContent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAcsTransId() {
            return this.acsTransId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        public final boolean d() {
            return p013kotlin.jvm.internal.s.f("C", this.transStatus);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ares)) {
                return false;
            }
            Ares ares = (Ares) other;
            return p013kotlin.jvm.internal.s.f(this.threeDSServerTransId, ares.threeDSServerTransId) && p013kotlin.jvm.internal.s.f(this.acsChallengeMandated, ares.acsChallengeMandated) && p013kotlin.jvm.internal.s.f(this.acsSignedContent, ares.acsSignedContent) && p013kotlin.jvm.internal.s.f(this.acsTransId, ares.acsTransId) && p013kotlin.jvm.internal.s.f(this.acsUrl, ares.acsUrl) && p013kotlin.jvm.internal.s.f(this.authenticationType, ares.authenticationType) && p013kotlin.jvm.internal.s.f(this.cardholderInfo, ares.cardholderInfo) && p013kotlin.jvm.internal.s.f(this.messageExtension, ares.messageExtension) && p013kotlin.jvm.internal.s.f(this.messageType, ares.messageType) && p013kotlin.jvm.internal.s.f(this.messageVersion, ares.messageVersion) && p013kotlin.jvm.internal.s.f(this.sdkTransId, ares.sdkTransId) && p013kotlin.jvm.internal.s.f(this.transStatus, ares.transStatus);
        }

        public int hashCode() {
            String str = this.threeDSServerTransId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsChallengeMandated;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsSignedContent;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.acsTransId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.authenticationType;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardholderInfo;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<MessageExtension> list = this.messageExtension;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str8 = this.messageType;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageVersion;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.sdkTransId;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.transStatus;
            return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.threeDSServerTransId + ", acsChallengeMandated=" + this.acsChallengeMandated + ", acsSignedContent=" + this.acsSignedContent + ", acsTransId=" + this.acsTransId + ", acsUrl=" + this.acsUrl + ", authenticationType=" + this.authenticationType + ", cardholderInfo=" + this.cardholderInfo + ", messageExtension=" + this.messageExtension + ", messageType=" + this.messageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ", transStatus=" + this.transStatus + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsChallengeMandated);
            parcel.writeString(this.acsSignedContent);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.acsUrl);
            parcel.writeString(this.authenticationType);
            parcel.writeString(this.cardholderInfo);
            List<MessageExtension> list = this.messageExtension;
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
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
            parcel.writeString(this.transStatus);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l1$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Stripe3ds2AuthResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2AuthResult createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() == 0 ? null : Ares.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2AuthResult[] newArray(int i11) {
            return new Stripe3ds2AuthResult[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l1$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/stripe/android/model/l1$c;", "Lt30/f;", "", "name", "", "criticalityIndicator", "id", "", "data", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "Z", "c", "getId", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MessageExtension implements t30.f {
        public static final Parcelable.Creator<MessageExtension> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean criticalityIndicator;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> data;

        /* JADX INFO: renamed from: com.stripe.android.model.l1$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MessageExtension> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MessageExtension createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i11 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new MessageExtension(string, z11, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MessageExtension[] newArray(int i11) {
                return new MessageExtension[i11];
            }
        }

        public MessageExtension(String str, boolean z11, String str2, Map<String, String> map) {
            this.name = str;
            this.criticalityIndicator = z11;
            this.id = str2;
            this.data = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageExtension)) {
                return false;
            }
            MessageExtension messageExtension = (MessageExtension) other;
            return p013kotlin.jvm.internal.s.f(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && p013kotlin.jvm.internal.s.f(this.id, messageExtension.id) && p013kotlin.jvm.internal.s.f(this.data, messageExtension.data);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.criticalityIndicator)) * 31;
            String str2 = this.id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.data;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "MessageExtension(name=" + this.name + ", criticalityIndicator=" + this.criticalityIndicator + ", id=" + this.id + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeInt(this.criticalityIndicator ? 1 : 0);
            parcel.writeString(this.id);
            Map<String, String> map = this.data;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l1$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001By\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b!\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b&\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b(\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u0011¨\u00064"}, d2 = {"Lcom/stripe/android/model/l1$d;", "Lt30/f;", "", "threeDSServerTransId", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageType", "messageVersion", "sdkTransId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getThreeDSServerTransId", "b", "getAcsTransId", "c", "getDsTransId", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "getErrorMessageType", IntegerTokenConverter.CONVERTER_KEY, "getMessageType", "j", "getMessageVersion", "k", "getSdkTransId", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ThreeDS2Error implements t30.f {
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String threeDSServerTransId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acsTransId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dsTransId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorComponent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorDescription;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorDetail;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorMessageType;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageVersion;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sdkTransId;

        /* JADX INFO: renamed from: com.stripe.android.model.l1$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ThreeDS2Error> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ThreeDS2Error createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ThreeDS2Error[] newArray(int i11) {
                return new ThreeDS2Error[i11];
            }
        }

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getErrorComponent() {
            return this.errorComponent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getErrorDescription() {
            return this.errorDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getErrorDetail() {
            return this.errorDetail;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThreeDS2Error)) {
                return false;
            }
            ThreeDS2Error threeDS2Error = (ThreeDS2Error) other;
            return p013kotlin.jvm.internal.s.f(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && p013kotlin.jvm.internal.s.f(this.acsTransId, threeDS2Error.acsTransId) && p013kotlin.jvm.internal.s.f(this.dsTransId, threeDS2Error.dsTransId) && p013kotlin.jvm.internal.s.f(this.errorCode, threeDS2Error.errorCode) && p013kotlin.jvm.internal.s.f(this.errorComponent, threeDS2Error.errorComponent) && p013kotlin.jvm.internal.s.f(this.errorDescription, threeDS2Error.errorDescription) && p013kotlin.jvm.internal.s.f(this.errorDetail, threeDS2Error.errorDetail) && p013kotlin.jvm.internal.s.f(this.errorMessageType, threeDS2Error.errorMessageType) && p013kotlin.jvm.internal.s.f(this.messageType, threeDS2Error.messageType) && p013kotlin.jvm.internal.s.f(this.messageVersion, threeDS2Error.messageVersion) && p013kotlin.jvm.internal.s.f(this.sdkTransId, threeDS2Error.sdkTransId);
        }

        public int hashCode() {
            String str = this.threeDSServerTransId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsTransId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dsTransId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorComponent;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDescription;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorDetail;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.errorMessageType;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageType;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.messageVersion;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.sdkTransId;
            return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.threeDSServerTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageType=" + this.messageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.dsTransId);
            parcel.writeString(this.errorCode);
            parcel.writeString(this.errorComponent);
            parcel.writeString(this.errorDescription);
            parcel.writeString(this.errorDetail);
            parcel.writeString(this.errorMessageType);
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
        }
    }

    public Stripe3ds2AuthResult(String str, Ares ares, Long l11, String str2, String str3, boolean z11, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.id = str;
        this.ares = ares;
        this.created = l11;
        this.source = str2;
        this.state = str3;
        this.liveMode = z11;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Ares getAres() {
        return this.ares;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ThreeDS2Error getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2AuthResult)) {
            return false;
        }
        Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) other;
        return p013kotlin.jvm.internal.s.f(this.id, stripe3ds2AuthResult.id) && p013kotlin.jvm.internal.s.f(this.ares, stripe3ds2AuthResult.ares) && p013kotlin.jvm.internal.s.f(this.created, stripe3ds2AuthResult.created) && p013kotlin.jvm.internal.s.f(this.source, stripe3ds2AuthResult.source) && p013kotlin.jvm.internal.s.f(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && p013kotlin.jvm.internal.s.f(this.error, stripe3ds2AuthResult.error) && p013kotlin.jvm.internal.s.f(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && p013kotlin.jvm.internal.s.f(this.creq, stripe3ds2AuthResult.creq);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ares ares = this.ares;
        int iHashCode2 = (iHashCode + (ares == null ? 0 : ares.hashCode())) * 31;
        Long l11 = this.created;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.liveMode)) * 31;
        ThreeDS2Error threeDS2Error = this.error;
        int iHashCode6 = (iHashCode5 + (threeDS2Error == null ? 0 : threeDS2Error.hashCode())) * 31;
        String str4 = this.fallbackRedirectUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creq;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.id + ", ares=" + this.ares + ", created=" + this.created + ", source=" + this.source + ", state=" + this.state + ", liveMode=" + this.liveMode + ", error=" + this.error + ", fallbackRedirectUrl=" + this.fallbackRedirectUrl + ", creq=" + this.creq + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        Ares ares = this.ares;
        if (ares == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ares.writeToParcel(parcel, flags);
        }
        Long l11 = this.created;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.source);
        parcel.writeString(this.state);
        parcel.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threeDS2Error.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.fallbackRedirectUrl);
        parcel.writeString(this.creq);
    }
}
