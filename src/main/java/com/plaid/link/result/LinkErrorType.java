package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0010\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000f\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/plaid/link/result/LinkErrorType;", "Landroid/os/Parcelable;", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "toString", "API_ERROR", "ASSET_REPORT_ERROR", "BANK_TRANSFER_ERROR", "Companion", "DEPOSIT_SWITCH_ERROR", "INSTITUTION_ERROR", "INTERNAL_ERROR_TYPE", "INVALID_INPUT", "INVALID_REQUEST", "ITEM_ERROR", "OAUTH_ERROR", "PAYMENT_ERROR", "RATE_LIMIT_EXCEEDED", "RECAPTCHA_ERROR", "SANDBOX_ERROR", "UNKNOWN", "Lcom/plaid/link/result/LinkErrorType$API_ERROR;", "Lcom/plaid/link/result/LinkErrorType$ASSET_REPORT_ERROR;", "Lcom/plaid/link/result/LinkErrorType$BANK_TRANSFER_ERROR;", "Lcom/plaid/link/result/LinkErrorType$DEPOSIT_SWITCH_ERROR;", "Lcom/plaid/link/result/LinkErrorType$INSTITUTION_ERROR;", "Lcom/plaid/link/result/LinkErrorType$INTERNAL_ERROR_TYPE;", "Lcom/plaid/link/result/LinkErrorType$INVALID_INPUT;", "Lcom/plaid/link/result/LinkErrorType$INVALID_REQUEST;", "Lcom/plaid/link/result/LinkErrorType$ITEM_ERROR;", "Lcom/plaid/link/result/LinkErrorType$OAUTH_ERROR;", "Lcom/plaid/link/result/LinkErrorType$PAYMENT_ERROR;", "Lcom/plaid/link/result/LinkErrorType$RATE_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorType$RECAPTCHA_ERROR;", "Lcom/plaid/link/result/LinkErrorType$SANDBOX_ERROR;", "Lcom/plaid/link/result/LinkErrorType$UNKNOWN;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkErrorType implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Map<String, LinkErrorType>> jsonToObject$delegate = m.b(LinkErrorType$Companion$jsonToObject$2.INSTANCE);
    private final String json;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$API_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class API_ERROR extends LinkErrorType {
        public static final API_ERROR INSTANCE = new API_ERROR();
        public static final Parcelable.Creator<API_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<API_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final API_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return API_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final API_ERROR[] newArray(int i11) {
                return new API_ERROR[i11];
            }
        }

        private API_ERROR() {
            super("API_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$ASSET_REPORT_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ASSET_REPORT_ERROR extends LinkErrorType {
        public static final ASSET_REPORT_ERROR INSTANCE = new ASSET_REPORT_ERROR();
        public static final Parcelable.Creator<ASSET_REPORT_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ASSET_REPORT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ASSET_REPORT_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return ASSET_REPORT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ASSET_REPORT_ERROR[] newArray(int i11) {
                return new ASSET_REPORT_ERROR[i11];
            }
        }

        private ASSET_REPORT_ERROR() {
            super("ASSET_REPORT_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$BANK_TRANSFER_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BANK_TRANSFER_ERROR extends LinkErrorType {
        public static final BANK_TRANSFER_ERROR INSTANCE = new BANK_TRANSFER_ERROR();
        public static final Parcelable.Creator<BANK_TRANSFER_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_TRANSFER_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return BANK_TRANSFER_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_TRANSFER_ERROR[] newArray(int i11) {
                return new BANK_TRANSFER_ERROR[i11];
            }
        }

        private BANK_TRANSFER_ERROR() {
            super("BANK_TRANSFER_ERROR", null);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$Companion;", "", "()V", "jsonToObject", "", "", "Lcom/plaid/link/result/LinkErrorType;", "getJsonToObject", "()Ljava/util/Map;", "jsonToObject$delegate", "Lkotlin/Lazy;", "convert", "json", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, LinkErrorType> getJsonToObject() {
            return (Map) LinkErrorType.jsonToObject$delegate.getValue();
        }

        public final LinkErrorType convert(String json) {
            LinkErrorType unknown = getJsonToObject().get(json);
            if (unknown == null) {
                if (json == null) {
                    json = "";
                }
                unknown = new UNKNOWN(json);
            }
            return unknown;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$DEPOSIT_SWITCH_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DEPOSIT_SWITCH_ERROR extends LinkErrorType {
        public static final DEPOSIT_SWITCH_ERROR INSTANCE = new DEPOSIT_SWITCH_ERROR();
        public static final Parcelable.Creator<DEPOSIT_SWITCH_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSIT_SWITCH_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return DEPOSIT_SWITCH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSIT_SWITCH_ERROR[] newArray(int i11) {
                return new DEPOSIT_SWITCH_ERROR[i11];
            }
        }

        private DEPOSIT_SWITCH_ERROR() {
            super("DEPOSIT_SWITCH_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INSTITUTION_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INSTITUTION_ERROR extends LinkErrorType {
        public static final INSTITUTION_ERROR INSTANCE = new INSTITUTION_ERROR();
        public static final Parcelable.Creator<INSTITUTION_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INSTITUTION_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return INSTITUTION_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_ERROR[] newArray(int i11) {
                return new INSTITUTION_ERROR[i11];
            }
        }

        private INSTITUTION_ERROR() {
            super("INSTITUTION_ERROR", null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INTERNAL_ERROR_TYPE;", "Lcom/plaid/link/result/LinkErrorType;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INTERNAL_ERROR_TYPE extends LinkErrorType {
        public static final Parcelable.Creator<INTERNAL_ERROR_TYPE> CREATOR = new Creator();
        private final String name;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INTERNAL_ERROR_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR_TYPE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new INTERNAL_ERROR_TYPE(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR_TYPE[] newArray(int i11) {
                return new INTERNAL_ERROR_TYPE[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR_TYPE(String name) {
            super(name, null);
            s.k(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INVALID_INPUT;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INVALID_INPUT extends LinkErrorType {
        public static final INVALID_INPUT INSTANCE = new INVALID_INPUT();
        public static final Parcelable.Creator<INVALID_INPUT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INVALID_INPUT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_INPUT createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return INVALID_INPUT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_INPUT[] newArray(int i11) {
                return new INVALID_INPUT[i11];
            }
        }

        private INVALID_INPUT() {
            super("INVALID_INPUT", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INVALID_REQUEST;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INVALID_REQUEST extends LinkErrorType {
        public static final INVALID_REQUEST INSTANCE = new INVALID_REQUEST();
        public static final Parcelable.Creator<INVALID_REQUEST> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INVALID_REQUEST> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_REQUEST createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return INVALID_REQUEST.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_REQUEST[] newArray(int i11) {
                return new INVALID_REQUEST[i11];
            }
        }

        private INVALID_REQUEST() {
            super("INVALID_REQUEST", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$ITEM_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ITEM_ERROR extends LinkErrorType {
        public static final ITEM_ERROR INSTANCE = new ITEM_ERROR();
        public static final Parcelable.Creator<ITEM_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ITEM_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ITEM_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return ITEM_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ITEM_ERROR[] newArray(int i11) {
                return new ITEM_ERROR[i11];
            }
        }

        private ITEM_ERROR() {
            super("ITEM_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$OAUTH_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OAUTH_ERROR extends LinkErrorType {
        public static final OAUTH_ERROR INSTANCE = new OAUTH_ERROR();
        public static final Parcelable.Creator<OAUTH_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OAUTH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return OAUTH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH_ERROR[] newArray(int i11) {
                return new OAUTH_ERROR[i11];
            }
        }

        private OAUTH_ERROR() {
            super("OAUTH_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$PAYMENT_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PAYMENT_ERROR extends LinkErrorType {
        public static final PAYMENT_ERROR INSTANCE = new PAYMENT_ERROR();
        public static final Parcelable.Creator<PAYMENT_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PAYMENT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PAYMENT_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return PAYMENT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PAYMENT_ERROR[] newArray(int i11) {
                return new PAYMENT_ERROR[i11];
            }
        }

        private PAYMENT_ERROR() {
            super("PAYMENT_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$RATE_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RATE_LIMIT_EXCEEDED extends LinkErrorType {
        public static final RATE_LIMIT_EXCEEDED INSTANCE = new RATE_LIMIT_EXCEEDED();
        public static final Parcelable.Creator<RATE_LIMIT_EXCEEDED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RATE_LIMIT_EXCEEDED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RATE_LIMIT_EXCEEDED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return RATE_LIMIT_EXCEEDED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RATE_LIMIT_EXCEEDED[] newArray(int i11) {
                return new RATE_LIMIT_EXCEEDED[i11];
            }
        }

        private RATE_LIMIT_EXCEEDED() {
            super("RATE_LIMIT_EXCEEDED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$RECAPTCHA_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RECAPTCHA_ERROR extends LinkErrorType {
        public static final RECAPTCHA_ERROR INSTANCE = new RECAPTCHA_ERROR();
        public static final Parcelable.Creator<RECAPTCHA_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RECAPTCHA_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return RECAPTCHA_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA_ERROR[] newArray(int i11) {
                return new RECAPTCHA_ERROR[i11];
            }
        }

        private RECAPTCHA_ERROR() {
            super("RECAPTCHA_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$SANDBOX_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SANDBOX_ERROR extends LinkErrorType {
        public static final SANDBOX_ERROR INSTANCE = new SANDBOX_ERROR();
        public static final Parcelable.Creator<SANDBOX_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SANDBOX_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SANDBOX_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SANDBOX_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SANDBOX_ERROR[] newArray(int i11) {
                return new SANDBOX_ERROR[i11];
            }
        }

        private SANDBOX_ERROR() {
            super("SANDBOX_ERROR", null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$UNKNOWN;", "Lcom/plaid/link/result/LinkErrorType;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkErrorType {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;

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
        public UNKNOWN(String name) {
            super(name, null);
            s.k(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
        }
    }

    public /* synthetic */ LinkErrorType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    public String toString() {
        return this.json;
    }

    private LinkErrorType(String str) {
        this.json = str;
    }

    public /* synthetic */ LinkErrorType(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}
