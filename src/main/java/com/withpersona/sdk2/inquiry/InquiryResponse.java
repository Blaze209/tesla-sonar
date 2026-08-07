package com.withpersona.sdk2.inquiry;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import zi0.CollectedData;
import zi0.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "", "<init>", "()V", "Complete", "Cancel", "Error", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InquiryResponse {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "inquiryId", "", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInquiryId", "()Ljava/lang/String;", "getSessionToken", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel extends InquiryResponse {
        private final String inquiryId;
        private final String sessionToken;

        public Cancel(String str, String str2) {
            super(null);
            this.inquiryId = str;
            this.sessionToken = str2;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "", "inquiryId", PermissionsResponse.STATUS_KEY, "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "Lzi0/a;", "collectedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lzi0/a;)V", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "getStatus", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "Lzi0/a;", "getCollectedData", "()Lzi0/a;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Complete extends InquiryResponse {
        private final CollectedData collectedData;
        private final Map<String, InquiryField> fields;
        private final String inquiryId;
        private final String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(String inquiryId, String status, Map<String, ? extends InquiryField> fields, CollectedData collectedData) {
            super(null);
            s.k(inquiryId, "inquiryId");
            s.k(status, "status");
            s.k(fields, "fields");
            this.inquiryId = inquiryId;
            this.status = status;
            this.fields = fields;
            this.collectedData = collectedData;
        }

        public final CollectedData getCollectedData() {
            return this.collectedData;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "", "debugMessage", "Lzi0/d;", "errorCode", "cause", "<init>", "(Ljava/lang/String;Lzi0/d;Ljava/lang/String;)V", "Ljava/lang/String;", "getDebugMessage", "()Ljava/lang/String;", "Lzi0/d;", "getErrorCode", "()Lzi0/d;", "getCause", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends InquiryResponse {
        private final String cause;
        private final String debugMessage;
        private final d errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String debugMessage, d errorCode, String str) {
            super(null);
            s.k(debugMessage, "debugMessage");
            s.k(errorCode, "errorCode");
            this.debugMessage = debugMessage;
            this.errorCode = errorCode;
            this.cause = str;
        }

        public final String getCause() {
            return this.cause;
        }

        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final d getErrorCode() {
            return this.errorCode;
        }
    }

    public /* synthetic */ InquiryResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InquiryResponse() {
    }
}
