package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus;", "Landroid/os/Parcelable;", "jsonValue", "", "(Ljava/lang/String;)V", "getJsonValue", "()Ljava/lang/String;", "setJsonValue", "CHOOSE_DEVICE", "Companion", "INSTITUTION_NOT_FOUND", "REQUIRES_ACCOUNT_SELECTION", "REQUIRES_CODE", "REQUIRES_CREDENTIALS", "REQUIRES_OAUTH", "REQUIRES_QUESTIONS", "REQUIRES_SELECTIONS", "UNKNOWN", "Lcom/plaid/link/result/LinkExitMetadataStatus$CHOOSE_DEVICE;", "Lcom/plaid/link/result/LinkExitMetadataStatus$INSTITUTION_NOT_FOUND;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_ACCOUNT_SELECTION;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CODE;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CREDENTIALS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_OAUTH;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_QUESTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_SELECTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$UNKNOWN;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkExitMetadataStatus implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, LinkExitMetadataStatus> map = v0.m(x.a("choose_device", CHOOSE_DEVICE.INSTANCE), x.a("institution_not_found", INSTITUTION_NOT_FOUND.INSTANCE), x.a("requires_account_selection", REQUIRES_ACCOUNT_SELECTION.INSTANCE), x.a("requires_code", REQUIRES_CODE.INSTANCE), x.a("requires_credentials", REQUIRES_CREDENTIALS.INSTANCE), x.a("requires_oauth", REQUIRES_OAUTH.INSTANCE), x.a("requires_questions", REQUIRES_QUESTIONS.INSTANCE), x.a("requires_selections", REQUIRES_SELECTIONS.INSTANCE));
    private String jsonValue;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$CHOOSE_DEVICE;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CHOOSE_DEVICE extends LinkExitMetadataStatus {
        public static final CHOOSE_DEVICE INSTANCE = new CHOOSE_DEVICE();
        public static final Parcelable.Creator<CHOOSE_DEVICE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CHOOSE_DEVICE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CHOOSE_DEVICE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return CHOOSE_DEVICE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CHOOSE_DEVICE[] newArray(int i11) {
                return new CHOOSE_DEVICE[i11];
            }
        }

        private CHOOSE_DEVICE() {
            super("choose_device", null);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$Companion;", "", "()V", "map", "", "", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "fromString", "eventName", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkExitMetadataStatus fromString(String eventName) {
            if (eventName == null || eventName.length() == 0) {
                return null;
            }
            LinkExitMetadataStatus linkExitMetadataStatus = (LinkExitMetadataStatus) LinkExitMetadataStatus.map.get(eventName);
            return linkExitMetadataStatus == null ? new UNKNOWN(eventName) : linkExitMetadataStatus;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$INSTITUTION_NOT_FOUND;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INSTITUTION_NOT_FOUND extends LinkExitMetadataStatus {
        public static final INSTITUTION_NOT_FOUND INSTANCE = new INSTITUTION_NOT_FOUND();
        public static final Parcelable.Creator<INSTITUTION_NOT_FOUND> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_FOUND> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_NOT_FOUND createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return INSTITUTION_NOT_FOUND.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_NOT_FOUND[] newArray(int i11) {
                return new INSTITUTION_NOT_FOUND[i11];
            }
        }

        private INSTITUTION_NOT_FOUND() {
            super("institution_not_found", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_ACCOUNT_SELECTION;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_ACCOUNT_SELECTION extends LinkExitMetadataStatus {
        public static final REQUIRES_ACCOUNT_SELECTION INSTANCE = new REQUIRES_ACCOUNT_SELECTION();
        public static final Parcelable.Creator<REQUIRES_ACCOUNT_SELECTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_ACCOUNT_SELECTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_ACCOUNT_SELECTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_ACCOUNT_SELECTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_ACCOUNT_SELECTION[] newArray(int i11) {
                return new REQUIRES_ACCOUNT_SELECTION[i11];
            }
        }

        private REQUIRES_ACCOUNT_SELECTION() {
            super("requires_account_selection", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CODE;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_CODE extends LinkExitMetadataStatus {
        public static final REQUIRES_CODE INSTANCE = new REQUIRES_CODE();
        public static final Parcelable.Creator<REQUIRES_CODE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_CODE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CODE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_CODE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CODE[] newArray(int i11) {
                return new REQUIRES_CODE[i11];
            }
        }

        private REQUIRES_CODE() {
            super("requires_code", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CREDENTIALS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_CREDENTIALS extends LinkExitMetadataStatus {
        public static final REQUIRES_CREDENTIALS INSTANCE = new REQUIRES_CREDENTIALS();
        public static final Parcelable.Creator<REQUIRES_CREDENTIALS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CREDENTIALS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CREDENTIALS[] newArray(int i11) {
                return new REQUIRES_CREDENTIALS[i11];
            }
        }

        private REQUIRES_CREDENTIALS() {
            super("requires_credentials", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_OAUTH;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_OAUTH extends LinkExitMetadataStatus {
        public static final REQUIRES_OAUTH INSTANCE = new REQUIRES_OAUTH();
        public static final Parcelable.Creator<REQUIRES_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_OAUTH createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_OAUTH[] newArray(int i11) {
                return new REQUIRES_OAUTH[i11];
            }
        }

        private REQUIRES_OAUTH() {
            super("requires_oauth", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_QUESTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_QUESTIONS extends LinkExitMetadataStatus {
        public static final REQUIRES_QUESTIONS INSTANCE = new REQUIRES_QUESTIONS();
        public static final Parcelable.Creator<REQUIRES_QUESTIONS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_QUESTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_QUESTIONS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_QUESTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_QUESTIONS[] newArray(int i11) {
                return new REQUIRES_QUESTIONS[i11];
            }
        }

        private REQUIRES_QUESTIONS() {
            super("requires_questions", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_SELECTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_SELECTIONS extends LinkExitMetadataStatus {
        public static final REQUIRES_SELECTIONS INSTANCE = new REQUIRES_SELECTIONS();
        public static final Parcelable.Creator<REQUIRES_SELECTIONS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REQUIRES_SELECTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_SELECTIONS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_SELECTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_SELECTIONS[] newArray(int i11) {
                return new REQUIRES_SELECTIONS[i11];
            }
        }

        private REQUIRES_SELECTIONS() {
            super("requires_selections", null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "", "rawJson", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkExitMetadataStatus {
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

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.rawJson);
        }
    }

    public /* synthetic */ LinkExitMetadataStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJsonValue() {
        return this.jsonValue;
    }

    public final void setJsonValue(String str) {
        s.k(str, "<set-?>");
        this.jsonValue = str;
    }

    private LinkExitMetadataStatus(String str) {
        this.jsonValue = str;
    }
}
