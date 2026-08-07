package com.plaid.link.event;

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
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:>\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001@FGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lcom/plaid/link/event/LinkEventName;", "Landroid/os/Parcelable;", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "toString", "AUTO_SELECT_SAVED_INSTITUTION", "AUTO_SUBMIT_PHONE", "BANK_INCOME_INSIGHTS_COMPLETED", "CLOSE_OAUTH", "CONNECT_NEW_INSTITUTION", "Companion", "ERROR", "EXIT", "FAIL_OAUTH", "HANDOFF", "IDENTITY_MATCH_FAILED", "IDENTITY_MATCH_PASSED", "IDENTITY_VERIFICATION_CLOSE_UI", "IDENTITY_VERIFICATION_CREATE_SESSION", "IDENTITY_VERIFICATION_FAIL_SESSION", "IDENTITY_VERIFICATION_FAIL_STEP", "IDENTITY_VERIFICATION_OPEN_UI", "IDENTITY_VERIFICATION_PASS_SESSION", "IDENTITY_VERIFICATION_PASS_STEP", "IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION", "IDENTITY_VERIFICATION_PENDING_REVIEW_STEP", "IDENTITY_VERIFICATION_RESUME_SESSION", "IDENTITY_VERIFICATION_RESUME_UI", "IDENTITY_VERIFICATION_START_STEP", "ISSUE_FOLLOWED", "LAYER_AUTOFILL_NOT_AVAILABLE", "LAYER_NOT_AVAILABLE", "LAYER_READY", "MATCHED_SELECT_INSTITUTION", "MATCHED_SELECT_VERIFY_METHOD", "OPEN", "OPEN_MY_PLAID", "OPEN_OAUTH", "PLAID_CHECK_PANE", "PROFILE_ELIGIBILITY_CHECK_READY", "REMEMBER_ME_DISABLED", "REMEMBER_ME_ENABLED", "REMEMBER_ME_HOLDOUT", "SEARCH_INSTITUTION", "SELECT_ACCOUNT", "SELECT_AUTH_TYPE", "SELECT_BRAND", "SELECT_DEGRADED_INSTITUTION", "SELECT_DOWN_INSTITUTION", "SELECT_FILTERED_INSTITUTION", "SELECT_INSTITUTION", "SKIP_SUBMIT_EMAIL", "SKIP_SUBMIT_PHONE", "SUBMIT_ACCOUNT_NUMBER", "SUBMIT_CREDENTIALS", "SUBMIT_DOCUMENTS", "SUBMIT_DOCUMENTS_ERROR", "SUBMIT_DOCUMENTS_SUCCESS", "SUBMIT_EMAIL", "SUBMIT_MFA", "SUBMIT_OTP", "SUBMIT_PHONE", "SUBMIT_ROUTING_NUMBER", "TRANSITION_VIEW", "UNKNOWN", "VERIFY_PHONE", "VIEW_DATA_TYPES", "Lcom/plaid/link/event/LinkEventName$AUTO_SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$AUTO_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventName$CLOSE_OAUTH;", "Lcom/plaid/link/event/LinkEventName$CONNECT_NEW_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$ERROR;", "Lcom/plaid/link/event/LinkEventName$EXIT;", "Lcom/plaid/link/event/LinkEventName$FAIL_OAUTH;", "Lcom/plaid/link/event/LinkEventName$HANDOFF;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_FAILED;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_PASSED;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CLOSE_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CREATE_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_OPEN_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_START_STEP;", "Lcom/plaid/link/event/LinkEventName$ISSUE_FOLLOWED;", "Lcom/plaid/link/event/LinkEventName$LAYER_AUTOFILL_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName$LAYER_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName$LAYER_READY;", "Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_VERIFY_METHOD;", "Lcom/plaid/link/event/LinkEventName$OPEN;", "Lcom/plaid/link/event/LinkEventName$OPEN_MY_PLAID;", "Lcom/plaid/link/event/LinkEventName$OPEN_OAUTH;", "Lcom/plaid/link/event/LinkEventName$PLAID_CHECK_PANE;", "Lcom/plaid/link/event/LinkEventName$PROFILE_ELIGIBILITY_CHECK_READY;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_DISABLED;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_ENABLED;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_HOLDOUT;", "Lcom/plaid/link/event/LinkEventName$SEARCH_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventName$SELECT_DEGRADED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_DOWN_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_FILTERED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_ACCOUNT_NUMBER;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_CREDENTIALS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_MFA;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_OTP;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_ROUTING_NUMBER;", "Lcom/plaid/link/event/LinkEventName$TRANSITION_VIEW;", "Lcom/plaid/link/event/LinkEventName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventName$VIEW_DATA_TYPES;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkEventName implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, LinkEventName> map;
    private final String json;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$AUTO_SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTO_SELECT_SAVED_INSTITUTION extends LinkEventName {
        public static final AUTO_SELECT_SAVED_INSTITUTION INSTANCE = new AUTO_SELECT_SAVED_INSTITUTION();
        public static final Parcelable.Creator<AUTO_SELECT_SAVED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AUTO_SELECT_SAVED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTO_SELECT_SAVED_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return AUTO_SELECT_SAVED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTO_SELECT_SAVED_INSTITUTION[] newArray(int i11) {
                return new AUTO_SELECT_SAVED_INSTITUTION[i11];
            }
        }

        private AUTO_SELECT_SAVED_INSTITUTION() {
            super("AUTO_SELECT_SAVED_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$AUTO_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTO_SUBMIT_PHONE extends LinkEventName {
        public static final AUTO_SUBMIT_PHONE INSTANCE = new AUTO_SUBMIT_PHONE();
        public static final Parcelable.Creator<AUTO_SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AUTO_SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTO_SUBMIT_PHONE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return AUTO_SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTO_SUBMIT_PHONE[] newArray(int i11) {
                return new AUTO_SUBMIT_PHONE[i11];
            }
        }

        private AUTO_SUBMIT_PHONE() {
            super("AUTO_SUBMIT_PHONE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BANK_INCOME_INSIGHTS_COMPLETED extends LinkEventName {
        public static final BANK_INCOME_INSIGHTS_COMPLETED INSTANCE = new BANK_INCOME_INSIGHTS_COMPLETED();
        public static final Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_INCOME_INSIGHTS_COMPLETED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_INCOME_INSIGHTS_COMPLETED[] newArray(int i11) {
                return new BANK_INCOME_INSIGHTS_COMPLETED[i11];
            }
        }

        private BANK_INCOME_INSIGHTS_COMPLETED() {
            super("BANK_INCOME_INSIGHTS_COMPLETED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$CLOSE_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CLOSE_OAUTH extends LinkEventName {
        public static final CLOSE_OAUTH INSTANCE = new CLOSE_OAUTH();
        public static final Parcelable.Creator<CLOSE_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CLOSE_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CLOSE_OAUTH createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return CLOSE_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CLOSE_OAUTH[] newArray(int i11) {
                return new CLOSE_OAUTH[i11];
            }
        }

        private CLOSE_OAUTH() {
            super("CLOSE_OAUTH", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$CONNECT_NEW_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CONNECT_NEW_INSTITUTION extends LinkEventName {
        public static final CONNECT_NEW_INSTITUTION INSTANCE = new CONNECT_NEW_INSTITUTION();
        public static final Parcelable.Creator<CONNECT_NEW_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CONNECT_NEW_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONNECT_NEW_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return CONNECT_NEW_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONNECT_NEW_INSTITUTION[] newArray(int i11) {
                return new CONNECT_NEW_INSTITUTION[i11];
            }
        }

        private CONNECT_NEW_INSTITUTION() {
            super("CONNECT_NEW_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$Companion;", "", "()V", "map", "", "", "Lcom/plaid/link/event/LinkEventName;", "fromString", InquiryField.StringField.TYPE, "fromString$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkEventName fromString$link_sdk_release(String string) {
            s.k(string, "string");
            LinkEventName linkEventName = (LinkEventName) LinkEventName.map.get(string);
            return linkEventName == null ? new UNKNOWN(string) : linkEventName;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$ERROR;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ERROR extends LinkEventName {
        public static final ERROR INSTANCE = new ERROR();
        public static final Parcelable.Creator<ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ERROR[] newArray(int i11) {
                return new ERROR[i11];
            }
        }

        private ERROR() {
            super("ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$EXIT;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EXIT extends LinkEventName {
        public static final EXIT INSTANCE = new EXIT();
        public static final Parcelable.Creator<EXIT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EXIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EXIT createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return EXIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EXIT[] newArray(int i11) {
                return new EXIT[i11];
            }
        }

        private EXIT() {
            super("EXIT", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$FAIL_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FAIL_OAUTH extends LinkEventName {
        public static final FAIL_OAUTH INSTANCE = new FAIL_OAUTH();
        public static final Parcelable.Creator<FAIL_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FAIL_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FAIL_OAUTH createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return FAIL_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FAIL_OAUTH[] newArray(int i11) {
                return new FAIL_OAUTH[i11];
            }
        }

        private FAIL_OAUTH() {
            super("FAIL_OAUTH", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$HANDOFF;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HANDOFF extends LinkEventName {
        public static final HANDOFF INSTANCE = new HANDOFF();
        public static final Parcelable.Creator<HANDOFF> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HANDOFF> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HANDOFF createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return HANDOFF.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HANDOFF[] newArray(int i11) {
                return new HANDOFF[i11];
            }
        }

        private HANDOFF() {
            super("HANDOFF", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_FAILED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_MATCH_FAILED extends LinkEventName {
        public static final IDENTITY_MATCH_FAILED INSTANCE = new IDENTITY_MATCH_FAILED();
        public static final Parcelable.Creator<IDENTITY_MATCH_FAILED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_MATCH_FAILED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_MATCH_FAILED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_MATCH_FAILED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_MATCH_FAILED[] newArray(int i11) {
                return new IDENTITY_MATCH_FAILED[i11];
            }
        }

        private IDENTITY_MATCH_FAILED() {
            super("IDENTITY_MATCH_FAILED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_PASSED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_MATCH_PASSED extends LinkEventName {
        public static final IDENTITY_MATCH_PASSED INSTANCE = new IDENTITY_MATCH_PASSED();
        public static final Parcelable.Creator<IDENTITY_MATCH_PASSED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_MATCH_PASSED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_MATCH_PASSED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_MATCH_PASSED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_MATCH_PASSED[] newArray(int i11) {
                return new IDENTITY_MATCH_PASSED[i11];
            }
        }

        private IDENTITY_MATCH_PASSED() {
            super("IDENTITY_MATCH_PASSED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CLOSE_UI;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_CLOSE_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_CLOSE_UI INSTANCE = new IDENTITY_VERIFICATION_CLOSE_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CLOSE_UI createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CLOSE_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_CLOSE_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_CLOSE_UI() {
            super("IDENTITY_VERIFICATION_CLOSE_UI", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CREATE_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_CREATE_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_CREATE_SESSION INSTANCE = new IDENTITY_VERIFICATION_CREATE_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CREATE_SESSION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CREATE_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_CREATE_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_CREATE_SESSION() {
            super("IDENTITY_VERIFICATION_CREATE_SESSION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_FAIL_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_FAIL_SESSION INSTANCE = new IDENTITY_VERIFICATION_FAIL_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_SESSION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_FAIL_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_SESSION() {
            super("IDENTITY_VERIFICATION_FAIL_SESSION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_STEP;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_FAIL_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_FAIL_STEP INSTANCE = new IDENTITY_VERIFICATION_FAIL_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_STEP createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_FAIL_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_STEP() {
            super("IDENTITY_VERIFICATION_FAIL_STEP", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_OPEN_UI;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_OPEN_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_OPEN_UI INSTANCE = new IDENTITY_VERIFICATION_OPEN_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_OPEN_UI createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_OPEN_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_OPEN_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_OPEN_UI() {
            super("IDENTITY_VERIFICATION_OPEN_UI", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PASS_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PASS_SESSION INSTANCE = new IDENTITY_VERIFICATION_PASS_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_SESSION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PASS_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_PASS_SESSION() {
            super("IDENTITY_VERIFICATION_PASS_SESSION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_STEP;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PASS_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PASS_STEP INSTANCE = new IDENTITY_VERIFICATION_PASS_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_STEP createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PASS_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_PASS_STEP() {
            super("IDENTITY_VERIFICATION_PASS_STEP", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION INSTANCE = new IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION() {
            super("IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_STEP;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PENDING_REVIEW_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP INSTANCE = new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_PENDING_REVIEW_STEP() {
            super("IDENTITY_VERIFICATION_PENDING_REVIEW_STEP", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_RESUME_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_RESUME_SESSION INSTANCE = new IDENTITY_VERIFICATION_RESUME_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_SESSION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_RESUME_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_SESSION() {
            super("IDENTITY_VERIFICATION_RESUME_SESSION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_UI;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_RESUME_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_RESUME_UI INSTANCE = new IDENTITY_VERIFICATION_RESUME_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_UI createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_RESUME_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_UI() {
            super("IDENTITY_VERIFICATION_RESUME_UI", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_START_STEP;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_START_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_START_STEP INSTANCE = new IDENTITY_VERIFICATION_START_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_START_STEP createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_START_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_START_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_START_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_START_STEP() {
            super("IDENTITY_VERIFICATION_START_STEP", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$ISSUE_FOLLOWED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ISSUE_FOLLOWED extends LinkEventName {
        public static final ISSUE_FOLLOWED INSTANCE = new ISSUE_FOLLOWED();
        public static final Parcelable.Creator<ISSUE_FOLLOWED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ISSUE_FOLLOWED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ISSUE_FOLLOWED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return ISSUE_FOLLOWED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ISSUE_FOLLOWED[] newArray(int i11) {
                return new ISSUE_FOLLOWED[i11];
            }
        }

        private ISSUE_FOLLOWED() {
            super("ISSUE_FOLLOWED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_AUTOFILL_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_AUTOFILL_NOT_AVAILABLE extends LinkEventName {
        public static final LAYER_AUTOFILL_NOT_AVAILABLE INSTANCE = new LAYER_AUTOFILL_NOT_AVAILABLE();
        public static final Parcelable.Creator<LAYER_AUTOFILL_NOT_AVAILABLE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_AUTOFILL_NOT_AVAILABLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_AUTOFILL_NOT_AVAILABLE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_AUTOFILL_NOT_AVAILABLE[] newArray(int i11) {
                return new LAYER_AUTOFILL_NOT_AVAILABLE[i11];
            }
        }

        private LAYER_AUTOFILL_NOT_AVAILABLE() {
            super("LAYER_AUTOFILL_NOT_AVAILABLE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_NOT_AVAILABLE extends LinkEventName {
        public static final LAYER_NOT_AVAILABLE INSTANCE = new LAYER_NOT_AVAILABLE();
        public static final Parcelable.Creator<LAYER_NOT_AVAILABLE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_NOT_AVAILABLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_NOT_AVAILABLE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return LAYER_NOT_AVAILABLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_NOT_AVAILABLE[] newArray(int i11) {
                return new LAYER_NOT_AVAILABLE[i11];
            }
        }

        private LAYER_NOT_AVAILABLE() {
            super("LAYER_NOT_AVAILABLE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_READY;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_READY extends LinkEventName {
        public static final LAYER_READY INSTANCE = new LAYER_READY();
        public static final Parcelable.Creator<LAYER_READY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_READY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_READY createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return LAYER_READY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LAYER_READY[] newArray(int i11) {
                return new LAYER_READY[i11];
            }
        }

        private LAYER_READY() {
            super("LAYER_READY", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_SELECT_INSTITUTION extends LinkEventName {
        public static final MATCHED_SELECT_INSTITUTION INSTANCE = new MATCHED_SELECT_INSTITUTION();
        public static final Parcelable.Creator<MATCHED_SELECT_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_INSTITUTION[] newArray(int i11) {
                return new MATCHED_SELECT_INSTITUTION[i11];
            }
        }

        private MATCHED_SELECT_INSTITUTION() {
            super("MATCHED_SELECT_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_VERIFY_METHOD;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_SELECT_VERIFY_METHOD extends LinkEventName {
        public static final MATCHED_SELECT_VERIFY_METHOD INSTANCE = new MATCHED_SELECT_VERIFY_METHOD();
        public static final Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_VERIFY_METHOD createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_VERIFY_METHOD[] newArray(int i11) {
                return new MATCHED_SELECT_VERIFY_METHOD[i11];
            }
        }

        private MATCHED_SELECT_VERIFY_METHOD() {
            super("MATCHED_SELECT_VERIFY_METHOD", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN extends LinkEventName {
        public static final OPEN INSTANCE = new OPEN();
        public static final Parcelable.Creator<OPEN> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return OPEN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN[] newArray(int i11) {
                return new OPEN[i11];
            }
        }

        private OPEN() {
            super("OPEN", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN_MY_PLAID;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN_MY_PLAID extends LinkEventName {
        public static final OPEN_MY_PLAID INSTANCE = new OPEN_MY_PLAID();
        public static final Parcelable.Creator<OPEN_MY_PLAID> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN_MY_PLAID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_MY_PLAID createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return OPEN_MY_PLAID.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_MY_PLAID[] newArray(int i11) {
                return new OPEN_MY_PLAID[i11];
            }
        }

        private OPEN_MY_PLAID() {
            super("OPEN_MY_PLAID", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN_OAUTH extends LinkEventName {
        public static final OPEN_OAUTH INSTANCE = new OPEN_OAUTH();
        public static final Parcelable.Creator<OPEN_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_OAUTH createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return OPEN_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_OAUTH[] newArray(int i11) {
                return new OPEN_OAUTH[i11];
            }
        }

        private OPEN_OAUTH() {
            super("OPEN_OAUTH", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$PLAID_CHECK_PANE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PLAID_CHECK_PANE extends LinkEventName {
        public static final PLAID_CHECK_PANE INSTANCE = new PLAID_CHECK_PANE();
        public static final Parcelable.Creator<PLAID_CHECK_PANE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PLAID_CHECK_PANE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PLAID_CHECK_PANE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return PLAID_CHECK_PANE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PLAID_CHECK_PANE[] newArray(int i11) {
                return new PLAID_CHECK_PANE[i11];
            }
        }

        private PLAID_CHECK_PANE() {
            super("PLAID_CHECK_PANE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$PROFILE_ELIGIBILITY_CHECK_READY;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PROFILE_ELIGIBILITY_CHECK_READY extends LinkEventName {
        public static final PROFILE_ELIGIBILITY_CHECK_READY INSTANCE = new PROFILE_ELIGIBILITY_CHECK_READY();
        public static final Parcelable.Creator<PROFILE_ELIGIBILITY_CHECK_READY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PROFILE_ELIGIBILITY_CHECK_READY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PROFILE_ELIGIBILITY_CHECK_READY createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PROFILE_ELIGIBILITY_CHECK_READY[] newArray(int i11) {
                return new PROFILE_ELIGIBILITY_CHECK_READY[i11];
            }
        }

        private PROFILE_ELIGIBILITY_CHECK_READY() {
            super("PROFILE_ELIGIBILITY_CHECK_READY", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_DISABLED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_DISABLED extends LinkEventName {
        public static final REMEMBER_ME_DISABLED INSTANCE = new REMEMBER_ME_DISABLED();
        public static final Parcelable.Creator<REMEMBER_ME_DISABLED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_DISABLED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_DISABLED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_DISABLED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_DISABLED[] newArray(int i11) {
                return new REMEMBER_ME_DISABLED[i11];
            }
        }

        private REMEMBER_ME_DISABLED() {
            super("REMEMBER_ME_DISABLED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_ENABLED;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_ENABLED extends LinkEventName {
        public static final REMEMBER_ME_ENABLED INSTANCE = new REMEMBER_ME_ENABLED();
        public static final Parcelable.Creator<REMEMBER_ME_ENABLED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_ENABLED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_ENABLED createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_ENABLED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_ENABLED[] newArray(int i11) {
                return new REMEMBER_ME_ENABLED[i11];
            }
        }

        private REMEMBER_ME_ENABLED() {
            super("REMEMBER_ME_ENABLED", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_HOLDOUT;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_HOLDOUT extends LinkEventName {
        public static final REMEMBER_ME_HOLDOUT INSTANCE = new REMEMBER_ME_HOLDOUT();
        public static final Parcelable.Creator<REMEMBER_ME_HOLDOUT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_HOLDOUT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_HOLDOUT createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_HOLDOUT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REMEMBER_ME_HOLDOUT[] newArray(int i11) {
                return new REMEMBER_ME_HOLDOUT[i11];
            }
        }

        private REMEMBER_ME_HOLDOUT() {
            super("REMEMBER_ME_HOLDOUT", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SEARCH_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SEARCH_INSTITUTION extends LinkEventName {
        public static final SEARCH_INSTITUTION INSTANCE = new SEARCH_INSTITUTION();
        public static final Parcelable.Creator<SEARCH_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SEARCH_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SEARCH_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SEARCH_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SEARCH_INSTITUTION[] newArray(int i11) {
                return new SEARCH_INSTITUTION[i11];
            }
        }

        private SEARCH_INSTITUTION() {
            super("SEARCH_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_ACCOUNT extends LinkEventName {
        public static final SELECT_ACCOUNT INSTANCE = new SELECT_ACCOUNT();
        public static final Parcelable.Creator<SELECT_ACCOUNT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_ACCOUNT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_ACCOUNT createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_ACCOUNT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_ACCOUNT[] newArray(int i11) {
                return new SELECT_ACCOUNT[i11];
            }
        }

        private SELECT_ACCOUNT() {
            super("SELECT_ACCOUNT", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_AUTH_TYPE extends LinkEventName {
        public static final SELECT_AUTH_TYPE INSTANCE = new SELECT_AUTH_TYPE();
        public static final Parcelable.Creator<SELECT_AUTH_TYPE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_AUTH_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_AUTH_TYPE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_AUTH_TYPE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_AUTH_TYPE[] newArray(int i11) {
                return new SELECT_AUTH_TYPE[i11];
            }
        }

        private SELECT_AUTH_TYPE() {
            super("SELECT_AUTH_TYPE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_BRAND extends LinkEventName {
        public static final SELECT_BRAND INSTANCE = new SELECT_BRAND();
        public static final Parcelable.Creator<SELECT_BRAND> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_BRAND> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_BRAND createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_BRAND.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_BRAND[] newArray(int i11) {
                return new SELECT_BRAND[i11];
            }
        }

        private SELECT_BRAND() {
            super("SELECT_BRAND", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_DEGRADED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_DEGRADED_INSTITUTION extends LinkEventName {
        public static final SELECT_DEGRADED_INSTITUTION INSTANCE = new SELECT_DEGRADED_INSTITUTION();
        public static final Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DEGRADED_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_DEGRADED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DEGRADED_INSTITUTION[] newArray(int i11) {
                return new SELECT_DEGRADED_INSTITUTION[i11];
            }
        }

        private SELECT_DEGRADED_INSTITUTION() {
            super("SELECT_DEGRADED_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_DOWN_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_DOWN_INSTITUTION extends LinkEventName {
        public static final SELECT_DOWN_INSTITUTION INSTANCE = new SELECT_DOWN_INSTITUTION();
        public static final Parcelable.Creator<SELECT_DOWN_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_DOWN_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DOWN_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_DOWN_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DOWN_INSTITUTION[] newArray(int i11) {
                return new SELECT_DOWN_INSTITUTION[i11];
            }
        }

        private SELECT_DOWN_INSTITUTION() {
            super("SELECT_DOWN_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_FILTERED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_FILTERED_INSTITUTION extends LinkEventName {
        public static final SELECT_FILTERED_INSTITUTION INSTANCE = new SELECT_FILTERED_INSTITUTION();
        public static final Parcelable.Creator<SELECT_FILTERED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_FILTERED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_FILTERED_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_FILTERED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_FILTERED_INSTITUTION[] newArray(int i11) {
                return new SELECT_FILTERED_INSTITUTION[i11];
            }
        }

        private SELECT_FILTERED_INSTITUTION() {
            super("SELECT_FILTERED_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_INSTITUTION extends LinkEventName {
        public static final SELECT_INSTITUTION INSTANCE = new SELECT_INSTITUTION();
        public static final Parcelable.Creator<SELECT_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_INSTITUTION createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_INSTITUTION[] newArray(int i11) {
                return new SELECT_INSTITUTION[i11];
            }
        }

        private SELECT_INSTITUTION() {
            super("SELECT_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SKIP_SUBMIT_EMAIL extends LinkEventName {
        public static final SKIP_SUBMIT_EMAIL INSTANCE = new SKIP_SUBMIT_EMAIL();
        public static final Parcelable.Creator<SKIP_SUBMIT_EMAIL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SKIP_SUBMIT_EMAIL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SKIP_SUBMIT_EMAIL createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SKIP_SUBMIT_EMAIL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SKIP_SUBMIT_EMAIL[] newArray(int i11) {
                return new SKIP_SUBMIT_EMAIL[i11];
            }
        }

        private SKIP_SUBMIT_EMAIL() {
            super("SKIP_SUBMIT_EMAIL", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SKIP_SUBMIT_PHONE extends LinkEventName {
        public static final SKIP_SUBMIT_PHONE INSTANCE = new SKIP_SUBMIT_PHONE();
        public static final Parcelable.Creator<SKIP_SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SKIP_SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SKIP_SUBMIT_PHONE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SKIP_SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SKIP_SUBMIT_PHONE[] newArray(int i11) {
                return new SKIP_SUBMIT_PHONE[i11];
            }
        }

        private SKIP_SUBMIT_PHONE() {
            super("SKIP_SUBMIT_PHONE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_ACCOUNT_NUMBER;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_ACCOUNT_NUMBER extends LinkEventName {
        public static final SUBMIT_ACCOUNT_NUMBER INSTANCE = new SUBMIT_ACCOUNT_NUMBER();
        public static final Parcelable.Creator<SUBMIT_ACCOUNT_NUMBER> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_ACCOUNT_NUMBER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ACCOUNT_NUMBER createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_ACCOUNT_NUMBER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ACCOUNT_NUMBER[] newArray(int i11) {
                return new SUBMIT_ACCOUNT_NUMBER[i11];
            }
        }

        private SUBMIT_ACCOUNT_NUMBER() {
            super("SUBMIT_ACCOUNT_NUMBER", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_CREDENTIALS;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_CREDENTIALS extends LinkEventName {
        public static final SUBMIT_CREDENTIALS INSTANCE = new SUBMIT_CREDENTIALS();
        public static final Parcelable.Creator<SUBMIT_CREDENTIALS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_CREDENTIALS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_CREDENTIALS[] newArray(int i11) {
                return new SUBMIT_CREDENTIALS[i11];
            }
        }

        private SUBMIT_CREDENTIALS() {
            super("SUBMIT_CREDENTIALS", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS extends LinkEventName {
        public static final SUBMIT_DOCUMENTS INSTANCE = new SUBMIT_DOCUMENTS();
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS[] newArray(int i11) {
                return new SUBMIT_DOCUMENTS[i11];
            }
        }

        private SUBMIT_DOCUMENTS() {
            super("SUBMIT_DOCUMENTS", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_ERROR extends LinkEventName {
        public static final SUBMIT_DOCUMENTS_ERROR INSTANCE = new SUBMIT_DOCUMENTS_ERROR();
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS_ERROR createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS_ERROR[] newArray(int i11) {
                return new SUBMIT_DOCUMENTS_ERROR[i11];
            }
        }

        private SUBMIT_DOCUMENTS_ERROR() {
            super("SUBMIT_DOCUMENTS_ERROR", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_SUCCESS extends LinkEventName {
        public static final SUBMIT_DOCUMENTS_SUCCESS INSTANCE = new SUBMIT_DOCUMENTS_SUCCESS();
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS_SUCCESS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS_SUCCESS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS_SUCCESS createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS_SUCCESS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_DOCUMENTS_SUCCESS[] newArray(int i11) {
                return new SUBMIT_DOCUMENTS_SUCCESS[i11];
            }
        }

        private SUBMIT_DOCUMENTS_SUCCESS() {
            super("SUBMIT_DOCUMENTS_SUCCESS", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_EMAIL extends LinkEventName {
        public static final SUBMIT_EMAIL INSTANCE = new SUBMIT_EMAIL();
        public static final Parcelable.Creator<SUBMIT_EMAIL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_EMAIL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_EMAIL createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_EMAIL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_EMAIL[] newArray(int i11) {
                return new SUBMIT_EMAIL[i11];
            }
        }

        private SUBMIT_EMAIL() {
            super("SUBMIT_EMAIL", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_MFA;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_MFA extends LinkEventName {
        public static final SUBMIT_MFA INSTANCE = new SUBMIT_MFA();
        public static final Parcelable.Creator<SUBMIT_MFA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_MFA createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_MFA[] newArray(int i11) {
                return new SUBMIT_MFA[i11];
            }
        }

        private SUBMIT_MFA() {
            super("SUBMIT_MFA", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_OTP;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_OTP extends LinkEventName {
        public static final SUBMIT_OTP INSTANCE = new SUBMIT_OTP();
        public static final Parcelable.Creator<SUBMIT_OTP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_OTP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_OTP createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_OTP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_OTP[] newArray(int i11) {
                return new SUBMIT_OTP[i11];
            }
        }

        private SUBMIT_OTP() {
            super("SUBMIT_OTP", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_PHONE extends LinkEventName {
        public static final SUBMIT_PHONE INSTANCE = new SUBMIT_PHONE();
        public static final Parcelable.Creator<SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_PHONE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_PHONE[] newArray(int i11) {
                return new SUBMIT_PHONE[i11];
            }
        }

        private SUBMIT_PHONE() {
            super("SUBMIT_PHONE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_ROUTING_NUMBER;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_ROUTING_NUMBER extends LinkEventName {
        public static final SUBMIT_ROUTING_NUMBER INSTANCE = new SUBMIT_ROUTING_NUMBER();
        public static final Parcelable.Creator<SUBMIT_ROUTING_NUMBER> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_ROUTING_NUMBER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ROUTING_NUMBER createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_ROUTING_NUMBER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ROUTING_NUMBER[] newArray(int i11) {
                return new SUBMIT_ROUTING_NUMBER[i11];
            }
        }

        private SUBMIT_ROUTING_NUMBER() {
            super("SUBMIT_ROUTING_NUMBER", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$TRANSITION_VIEW;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TRANSITION_VIEW extends LinkEventName {
        public static final TRANSITION_VIEW INSTANCE = new TRANSITION_VIEW();
        public static final Parcelable.Creator<TRANSITION_VIEW> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TRANSITION_VIEW> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TRANSITION_VIEW createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return TRANSITION_VIEW.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TRANSITION_VIEW[] newArray(int i11) {
                return new TRANSITION_VIEW[i11];
            }
        }

        private TRANSITION_VIEW() {
            super("TRANSITION_VIEW", null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/plaid/link/event/LinkEventName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventName;", "", "rawJson", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRawJson", "()Ljava/lang/String;", "setRawJson", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkEventName {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private String rawJson;

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

        public final String getRawJson() {
            return this.rawJson;
        }

        public final void setRawJson(String str) {
            s.k(str, "<set-?>");
            this.rawJson = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.rawJson);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFY_PHONE extends LinkEventName {
        public static final VERIFY_PHONE INSTANCE = new VERIFY_PHONE();
        public static final Parcelable.Creator<VERIFY_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFY_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFY_PHONE createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return VERIFY_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFY_PHONE[] newArray(int i11) {
                return new VERIFY_PHONE[i11];
            }
        }

        private VERIFY_PHONE() {
            super("VERIFY_PHONE", null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/event/LinkEventName$VIEW_DATA_TYPES;", "Lcom/plaid/link/event/LinkEventName;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VIEW_DATA_TYPES extends LinkEventName {
        public static final VIEW_DATA_TYPES INSTANCE = new VIEW_DATA_TYPES();
        public static final Parcelable.Creator<VIEW_DATA_TYPES> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VIEW_DATA_TYPES> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VIEW_DATA_TYPES createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return VIEW_DATA_TYPES.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VIEW_DATA_TYPES[] newArray(int i11) {
                return new VIEW_DATA_TYPES[i11];
            }
        }

        private VIEW_DATA_TYPES() {
            super("VIEW_DATA_TYPES", null);
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
        BANK_INCOME_INSIGHTS_COMPLETED bank_income_insights_completed = BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
        Pair pairA = x.a(bank_income_insights_completed.getJson(), bank_income_insights_completed);
        CLOSE_OAUTH close_oauth = CLOSE_OAUTH.INSTANCE;
        Pair pairA2 = x.a(close_oauth.getJson(), close_oauth);
        ERROR error = ERROR.INSTANCE;
        Pair pairA3 = x.a(error.getJson(), error);
        EXIT exit = EXIT.INSTANCE;
        Pair pairA4 = x.a(exit.getJson(), exit);
        FAIL_OAUTH fail_oauth = FAIL_OAUTH.INSTANCE;
        Pair pairA5 = x.a(fail_oauth.getJson(), fail_oauth);
        HANDOFF handoff = HANDOFF.INSTANCE;
        Pair pairA6 = x.a(handoff.getJson(), handoff);
        IDENTITY_MATCH_PASSED identity_match_passed = IDENTITY_MATCH_PASSED.INSTANCE;
        Pair pairA7 = x.a(identity_match_passed.getJson(), identity_match_passed);
        IDENTITY_MATCH_FAILED identity_match_failed = IDENTITY_MATCH_FAILED.INSTANCE;
        Pair pairA8 = x.a(identity_match_failed.getJson(), identity_match_failed);
        IDENTITY_VERIFICATION_START_STEP identity_verification_start_step = IDENTITY_VERIFICATION_START_STEP.INSTANCE;
        Pair pairA9 = x.a(identity_verification_start_step.getJson(), identity_verification_start_step);
        IDENTITY_VERIFICATION_PASS_STEP identity_verification_pass_step = IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
        Pair pairA10 = x.a(identity_verification_pass_step.getJson(), identity_verification_pass_step);
        IDENTITY_VERIFICATION_FAIL_STEP identity_verification_fail_step = IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
        Pair pairA11 = x.a(identity_verification_fail_step.getJson(), identity_verification_fail_step);
        IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION identity_verification_pending_review_session = IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION.INSTANCE;
        Pair pairA12 = x.a(identity_verification_pending_review_session.getJson(), identity_verification_pending_review_session);
        IDENTITY_VERIFICATION_PENDING_REVIEW_STEP identity_verification_pending_review_step = IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
        Pair pairA13 = x.a(identity_verification_pending_review_step.getJson(), identity_verification_pending_review_step);
        IDENTITY_VERIFICATION_CREATE_SESSION identity_verification_create_session = IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
        Pair pairA14 = x.a(identity_verification_create_session.getJson(), identity_verification_create_session);
        IDENTITY_VERIFICATION_RESUME_SESSION identity_verification_resume_session = IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
        Pair pairA15 = x.a(identity_verification_resume_session.getJson(), identity_verification_resume_session);
        IDENTITY_VERIFICATION_PASS_SESSION identity_verification_pass_session = IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
        Pair pairA16 = x.a(identity_verification_pass_session.getJson(), identity_verification_pass_session);
        IDENTITY_VERIFICATION_FAIL_SESSION identity_verification_fail_session = IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
        Pair pairA17 = x.a(identity_verification_fail_session.getJson(), identity_verification_fail_session);
        IDENTITY_VERIFICATION_OPEN_UI identity_verification_open_ui = IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
        Pair pairA18 = x.a(identity_verification_open_ui.getJson(), identity_verification_open_ui);
        IDENTITY_VERIFICATION_RESUME_UI identity_verification_resume_ui = IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
        Pair pairA19 = x.a(identity_verification_resume_ui.getJson(), identity_verification_resume_ui);
        IDENTITY_VERIFICATION_CLOSE_UI identity_verification_close_ui = IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
        Pair pairA20 = x.a(identity_verification_close_ui.getJson(), identity_verification_close_ui);
        ISSUE_FOLLOWED issue_followed = ISSUE_FOLLOWED.INSTANCE;
        Pair pairA21 = x.a(issue_followed.getJson(), issue_followed);
        MATCHED_SELECT_INSTITUTION matched_select_institution = MATCHED_SELECT_INSTITUTION.INSTANCE;
        Pair pairA22 = x.a(matched_select_institution.getJson(), matched_select_institution);
        MATCHED_SELECT_VERIFY_METHOD matched_select_verify_method = MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
        Pair pairA23 = x.a(matched_select_verify_method.getJson(), matched_select_verify_method);
        OPEN open = OPEN.INSTANCE;
        Pair pairA24 = x.a(open.getJson(), open);
        OPEN_MY_PLAID open_my_plaid = OPEN_MY_PLAID.INSTANCE;
        Pair pairA25 = x.a(open_my_plaid.getJson(), open_my_plaid);
        OPEN_OAUTH open_oauth = OPEN_OAUTH.INSTANCE;
        Pair pairA26 = x.a(open_oauth.getJson(), open_oauth);
        PROFILE_ELIGIBILITY_CHECK_READY profile_eligibility_check_ready = PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE;
        Pair pairA27 = x.a(profile_eligibility_check_ready.getJson(), profile_eligibility_check_ready);
        SEARCH_INSTITUTION search_institution = SEARCH_INSTITUTION.INSTANCE;
        Pair pairA28 = x.a(search_institution.getJson(), search_institution);
        SELECT_ACCOUNT select_account = SELECT_ACCOUNT.INSTANCE;
        Pair pairA29 = x.a(select_account.getJson(), select_account);
        SELECT_AUTH_TYPE select_auth_type = SELECT_AUTH_TYPE.INSTANCE;
        Pair pairA30 = x.a(select_auth_type.getJson(), select_auth_type);
        SELECT_BRAND select_brand = SELECT_BRAND.INSTANCE;
        Pair pairA31 = x.a(select_brand.getJson(), select_brand);
        SELECT_DEGRADED_INSTITUTION select_degraded_institution = SELECT_DEGRADED_INSTITUTION.INSTANCE;
        Pair pairA32 = x.a(select_degraded_institution.getJson(), select_degraded_institution);
        SELECT_FILTERED_INSTITUTION select_filtered_institution = SELECT_FILTERED_INSTITUTION.INSTANCE;
        Pair pairA33 = x.a(select_filtered_institution.getJson(), select_filtered_institution);
        SELECT_DOWN_INSTITUTION select_down_institution = SELECT_DOWN_INSTITUTION.INSTANCE;
        Pair pairA34 = x.a(select_down_institution.getJson(), select_down_institution);
        SELECT_INSTITUTION select_institution = SELECT_INSTITUTION.INSTANCE;
        Pair pairA35 = x.a(select_institution.getJson(), select_institution);
        SUBMIT_CREDENTIALS submit_credentials = SUBMIT_CREDENTIALS.INSTANCE;
        Pair pairA36 = x.a(submit_credentials.getJson(), submit_credentials);
        SUBMIT_MFA submit_mfa = SUBMIT_MFA.INSTANCE;
        Pair pairA37 = x.a(submit_mfa.getJson(), submit_mfa);
        SUBMIT_ROUTING_NUMBER submit_routing_number = SUBMIT_ROUTING_NUMBER.INSTANCE;
        Pair pairA38 = x.a(submit_routing_number.getJson(), submit_routing_number);
        SUBMIT_ACCOUNT_NUMBER submit_account_number = SUBMIT_ACCOUNT_NUMBER.INSTANCE;
        Pair pairA39 = x.a(submit_account_number.getJson(), submit_account_number);
        SUBMIT_DOCUMENTS submit_documents = SUBMIT_DOCUMENTS.INSTANCE;
        Pair pairA40 = x.a(submit_documents.getJson(), submit_documents);
        SUBMIT_DOCUMENTS_SUCCESS submit_documents_success = SUBMIT_DOCUMENTS_SUCCESS.INSTANCE;
        Pair pairA41 = x.a(submit_documents_success.getJson(), submit_documents_success);
        SUBMIT_DOCUMENTS_ERROR submit_documents_error = SUBMIT_DOCUMENTS_ERROR.INSTANCE;
        Pair pairA42 = x.a(submit_documents_error.getJson(), submit_documents_error);
        VIEW_DATA_TYPES view_data_types = VIEW_DATA_TYPES.INSTANCE;
        Pair pairA43 = x.a(view_data_types.getJson(), view_data_types);
        SUBMIT_EMAIL submit_email = SUBMIT_EMAIL.INSTANCE;
        Pair pairA44 = x.a(submit_email.getJson(), submit_email);
        SUBMIT_OTP submit_otp = SUBMIT_OTP.INSTANCE;
        Pair pairA45 = x.a(submit_otp.getJson(), submit_otp);
        SUBMIT_PHONE submit_phone = SUBMIT_PHONE.INSTANCE;
        Pair pairA46 = x.a(submit_phone.getJson(), submit_phone);
        AUTO_SUBMIT_PHONE auto_submit_phone = AUTO_SUBMIT_PHONE.INSTANCE;
        Pair pairA47 = x.a(auto_submit_phone.getJson(), auto_submit_phone);
        SKIP_SUBMIT_EMAIL skip_submit_email = SKIP_SUBMIT_EMAIL.INSTANCE;
        Pair pairA48 = x.a(skip_submit_email.getJson(), skip_submit_email);
        SKIP_SUBMIT_PHONE skip_submit_phone = SKIP_SUBMIT_PHONE.INSTANCE;
        Pair pairA49 = x.a(skip_submit_phone.getJson(), skip_submit_phone);
        VERIFY_PHONE verify_phone = VERIFY_PHONE.INSTANCE;
        Pair pairA50 = x.a(verify_phone.getJson(), verify_phone);
        CONNECT_NEW_INSTITUTION connect_new_institution = CONNECT_NEW_INSTITUTION.INSTANCE;
        Pair pairA51 = x.a(connect_new_institution.getJson(), connect_new_institution);
        REMEMBER_ME_ENABLED remember_me_enabled = REMEMBER_ME_ENABLED.INSTANCE;
        Pair pairA52 = x.a(remember_me_enabled.getJson(), remember_me_enabled);
        REMEMBER_ME_DISABLED remember_me_disabled = REMEMBER_ME_DISABLED.INSTANCE;
        Pair pairA53 = x.a(remember_me_disabled.getJson(), remember_me_disabled);
        REMEMBER_ME_HOLDOUT remember_me_holdout = REMEMBER_ME_HOLDOUT.INSTANCE;
        Pair pairA54 = x.a(remember_me_holdout.getJson(), remember_me_holdout);
        TRANSITION_VIEW transition_view = TRANSITION_VIEW.INSTANCE;
        Pair pairA55 = x.a(transition_view.getJson(), transition_view);
        LAYER_AUTOFILL_NOT_AVAILABLE layer_autofill_not_available = LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE;
        Pair pairA56 = x.a(layer_autofill_not_available.getJson(), layer_autofill_not_available);
        LAYER_READY layer_ready = LAYER_READY.INSTANCE;
        Pair pairA57 = x.a(layer_ready.getJson(), layer_ready);
        LAYER_NOT_AVAILABLE layer_not_available = LAYER_NOT_AVAILABLE.INSTANCE;
        Pair pairA58 = x.a(layer_not_available.getJson(), layer_not_available);
        PLAID_CHECK_PANE plaid_check_pane = PLAID_CHECK_PANE.INSTANCE;
        Pair pairA59 = x.a(plaid_check_pane.getJson(), plaid_check_pane);
        AUTO_SELECT_SAVED_INSTITUTION auto_select_saved_institution = AUTO_SELECT_SAVED_INSTITUTION.INSTANCE;
        map = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, pairA25, pairA26, pairA27, pairA28, pairA29, pairA30, pairA31, pairA32, pairA33, pairA34, pairA35, pairA36, pairA37, pairA38, pairA39, pairA40, pairA41, pairA42, pairA43, pairA44, pairA45, pairA46, pairA47, pairA48, pairA49, pairA50, pairA51, pairA52, pairA53, pairA54, pairA55, pairA56, pairA57, pairA58, pairA59, x.a(auto_select_saved_institution.getJson(), auto_select_saved_institution));
    }

    public /* synthetic */ LinkEventName(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    public String toString() {
        return this.json;
    }

    private LinkEventName(String str) {
        this.json = str;
    }
}
