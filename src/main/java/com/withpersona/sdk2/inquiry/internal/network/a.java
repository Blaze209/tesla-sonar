package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/a$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String debugMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InternalErrorInfo cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, InternalErrorInfo cause) {
            super(null);
            s.k(cause, "cause");
            this.debugMessage = str;
            this.cause = cause;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InternalErrorInfo getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return s.f(this.debugMessage, error.debugMessage) && s.f(this.cause, error.cause);
        }

        public int hashCode() {
            String str = this.debugMessage;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.cause.hashCode();
        }

        public String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", cause=" + this.cause + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a$b;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStep", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "c", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep nextStep;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fallbackSessionToken;

        public /* synthetic */ Success(String str, NextStep nextStep, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, nextStep, (i11 & 4) != 0 ? null : str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return s.f(this.inquiryId, success.inquiryId) && s.f(this.nextStep, success.nextStep) && s.f(this.fallbackSessionToken, success.fallbackSessionToken);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.nextStep.hashCode()) * 31;
            String str = this.fallbackSessionToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", nextStep=" + this.nextStep + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String inquiryId, NextStep nextStep, String str) {
            super(null);
            s.k(inquiryId, "inquiryId");
            s.k(nextStep, "nextStep");
            this.inquiryId = inquiryId;
            this.nextStep = nextStep;
            this.fallbackSessionToken = str;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
