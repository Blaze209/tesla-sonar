package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.Bo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB)\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/Bo;", "", "message", "", "cause", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Canceled", "KycRequired", "Rejected", "TooManyAuthorizationAttempts", "TooManyResendOtpAttempts", "Unexpected", "Lcom/fourthline/orca/qes/internal/error/QesError$Canceled;", "Lcom/fourthline/orca/qes/internal/error/QesError$KycRequired;", "Lcom/fourthline/orca/qes/internal/error/QesError$Rejected;", "Lcom/fourthline/orca/qes/internal/error/QesError$TooManyAuthorizationAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError$TooManyResendOtpAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QesError extends Bo {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Canceled;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends QesError {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        public int hashCode() {
            return 930833104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$KycRequired;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KycRequired extends QesError {
        public static final int $stable = 0;
        public static final KycRequired INSTANCE = new KycRequired();

        private KycRequired() {
            super(null, null, "kyc_required", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof KycRequired);
        }

        public int hashCode() {
            return -769585699;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "KycRequired";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Rejected;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rejected extends QesError {
        public static final int $stable = 0;
        public static final Rejected INSTANCE = new Rejected();

        private Rejected() {
            super(null, null, "rejected", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Rejected);
        }

        public int hashCode() {
            return 445510325;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Rejected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$TooManyAuthorizationAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TooManyAuthorizationAttempts extends QesError {
        public static final int $stable = 0;
        public static final TooManyAuthorizationAttempts INSTANCE = new TooManyAuthorizationAttempts();

        private TooManyAuthorizationAttempts() {
            super(null, null, "too_many_authorization_attempts", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TooManyAuthorizationAttempts);
        }

        public int hashCode() {
            return 843591555;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyAuthorizationAttempts";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$TooManyResendOtpAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TooManyResendOtpAttempts extends QesError {
        public static final int $stable = 0;
        public static final TooManyResendOtpAttempts INSTANCE = new TooManyResendOtpAttempts();

        private TooManyResendOtpAttempts() {
            super(null, null, "too_many_resend_otp_attempts", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TooManyResendOtpAttempts);
        }

        public int hashCode() {
            return -147007750;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyResendOtpAttempts";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unexpected extends QesError {
        private final Throwable cause;
        private final String message;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected$Companion;", "", "<init>", "()V", "create", "Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "description", "", "cause", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Unexpected create$default(Companion companion, String str, Throwable th2, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                return companion.create(str, th2);
            }

            public final Unexpected create(String description, Throwable cause) {
                s.k(description, "description");
                return new Unexpected(description, cause, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Unexpected(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* synthetic */ Unexpected(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }

        private Unexpected(String str, Throwable th2) {
            super(str, th2, "unexpected", null);
            this.message = str;
            this.cause = th2;
        }
    }

    public /* synthetic */ QesError(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ QesError(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private QesError(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
