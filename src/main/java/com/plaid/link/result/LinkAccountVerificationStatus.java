package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus;", "Landroid/os/Parcelable;", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "AUTOMATICALLY_VERIFIED", "Companion", "MANUALLY_VERIFIED", "PENDING_AUTOMATIC_VERIFICATION", "PENDING_MANUAL_VERIFICATION", "UNKNOWN", "VERIFICATION_EXPIRED", "VERIFICATION_FAILED", "Lcom/plaid/link/result/LinkAccountVerificationStatus$AUTOMATICALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$MANUALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_AUTOMATIC_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_MANUAL_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_EXPIRED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_FAILED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkAccountVerificationStatus implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, LinkAccountVerificationStatus> map;
    private final String json;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$AUTOMATICALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTOMATICALLY_VERIFIED extends LinkAccountVerificationStatus {
        public static final AUTOMATICALLY_VERIFIED INSTANCE = new AUTOMATICALLY_VERIFIED();
        public static final Parcelable.Creator<AUTOMATICALLY_VERIFIED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AUTOMATICALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTOMATICALLY_VERIFIED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return AUTOMATICALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTOMATICALLY_VERIFIED[] newArray(int i11) {
                return new AUTOMATICALLY_VERIFIED[i11];
            }
        }

        private AUTOMATICALLY_VERIFIED() {
            super("automatically_verified", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$Companion;", "", "()V", "map", "", "", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "convert", InquiryField.StringField.TYPE, "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccountVerificationStatus convert(String string) {
            if (string == null) {
                return null;
            }
            LinkAccountVerificationStatus linkAccountVerificationStatus = (LinkAccountVerificationStatus) LinkAccountVerificationStatus.map.get(string);
            return linkAccountVerificationStatus == null ? new UNKNOWN(string) : linkAccountVerificationStatus;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$MANUALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MANUALLY_VERIFIED extends LinkAccountVerificationStatus {
        public static final MANUALLY_VERIFIED INSTANCE = new MANUALLY_VERIFIED();
        public static final Parcelable.Creator<MANUALLY_VERIFIED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MANUALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MANUALLY_VERIFIED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return MANUALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MANUALLY_VERIFIED[] newArray(int i11) {
                return new MANUALLY_VERIFIED[i11];
            }
        }

        private MANUALLY_VERIFIED() {
            super("manually_verified", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_AUTOMATIC_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PENDING_AUTOMATIC_VERIFICATION extends LinkAccountVerificationStatus {
        public static final PENDING_AUTOMATIC_VERIFICATION INSTANCE = new PENDING_AUTOMATIC_VERIFICATION();
        public static final Parcelable.Creator<PENDING_AUTOMATIC_VERIFICATION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PENDING_AUTOMATIC_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_AUTOMATIC_VERIFICATION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_AUTOMATIC_VERIFICATION[] newArray(int i11) {
                return new PENDING_AUTOMATIC_VERIFICATION[i11];
            }
        }

        private PENDING_AUTOMATIC_VERIFICATION() {
            super("pending_automatic_verification", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_MANUAL_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PENDING_MANUAL_VERIFICATION extends LinkAccountVerificationStatus {
        public static final PENDING_MANUAL_VERIFICATION INSTANCE = new PENDING_MANUAL_VERIFICATION();
        public static final Parcelable.Creator<PENDING_MANUAL_VERIFICATION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PENDING_MANUAL_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_MANUAL_VERIFICATION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return PENDING_MANUAL_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_MANUAL_VERIFICATION[] newArray(int i11) {
                return new PENDING_MANUAL_VERIFICATION[i11];
            }
        }

        private PENDING_MANUAL_VERIFICATION() {
            super("pending_manual_verification", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "", "rawJson", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRawJson", "()Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkAccountVerificationStatus {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String rawJson;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String rawJson) {
            super(rawJson, null);
            s.k(rawJson, "rawJson");
            this.rawJson = rawJson;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!s.f(UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            s.i(other, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN");
            return s.f(this.rawJson, ((UNKNOWN) other).rawJson);
        }

        public final String getRawJson() {
            return this.rawJson;
        }

        public int hashCode() {
            return this.rawJson.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.rawJson);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_EXPIRED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFICATION_EXPIRED extends LinkAccountVerificationStatus {
        public static final VERIFICATION_EXPIRED INSTANCE = new VERIFICATION_EXPIRED();
        public static final Parcelable.Creator<VERIFICATION_EXPIRED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFICATION_EXPIRED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_EXPIRED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return VERIFICATION_EXPIRED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_EXPIRED[] newArray(int i11) {
                return new VERIFICATION_EXPIRED[i11];
            }
        }

        private VERIFICATION_EXPIRED() {
            super("verification_expired", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_FAILED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFICATION_FAILED extends LinkAccountVerificationStatus {
        public static final VERIFICATION_FAILED INSTANCE = new VERIFICATION_FAILED();
        public static final Parcelable.Creator<VERIFICATION_FAILED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFICATION_FAILED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_FAILED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return VERIFICATION_FAILED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_FAILED[] newArray(int i11) {
                return new VERIFICATION_FAILED[i11];
            }
        }

        private VERIFICATION_FAILED() {
            super("verification_failed", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    static {
        PENDING_AUTOMATIC_VERIFICATION pending_automatic_verification = PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
        Pair pairA = x.a(pending_automatic_verification.getJson(), pending_automatic_verification);
        PENDING_MANUAL_VERIFICATION pending_manual_verification = PENDING_MANUAL_VERIFICATION.INSTANCE;
        Pair pairA2 = x.a(pending_manual_verification.getJson(), pending_manual_verification);
        AUTOMATICALLY_VERIFIED automatically_verified = AUTOMATICALLY_VERIFIED.INSTANCE;
        Pair pairA3 = x.a(automatically_verified.getJson(), automatically_verified);
        MANUALLY_VERIFIED manually_verified = MANUALLY_VERIFIED.INSTANCE;
        Pair pairA4 = x.a(manually_verified.getJson(), manually_verified);
        VERIFICATION_EXPIRED verification_expired = VERIFICATION_EXPIRED.INSTANCE;
        Pair pairA5 = x.a(verification_expired.getJson(), verification_expired);
        VERIFICATION_FAILED verification_failed = VERIFICATION_FAILED.INSTANCE;
        map = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, x.a(verification_failed.getJson(), verification_failed));
    }

    public /* synthetic */ LinkAccountVerificationStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    private LinkAccountVerificationStatus(String str) {
        this.json = str;
    }
}
