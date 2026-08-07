package com.fourthline.orca.bav.internal.error;

import com.fourthline.orca.internal.Bo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB)\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError;", "Lcom/fourthline/orca/internal/Bo;", "", "message", "", "cause", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Canceled", "InvalidStatus", "KycRequired", "Generic", "Unexpected", "Lcom/fourthline/orca/bav/internal/error/BavError$Canceled;", "Lcom/fourthline/orca/bav/internal/error/BavError$Generic;", "Lcom/fourthline/orca/bav/internal/error/BavError$InvalidStatus;", "Lcom/fourthline/orca/bav/internal/error/BavError$KycRequired;", "Lcom/fourthline/orca/bav/internal/error/BavError$Unexpected;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BavError extends Bo {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$Canceled;", "Lcom/fourthline/orca/bav/internal/error/BavError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends BavError {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        public int hashCode() {
            return 1360668624;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$Generic;", "Lcom/fourthline/orca/bav/internal/error/BavError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Generic extends BavError {
        public static final int $stable = 0;
        public static final Generic INSTANCE = new Generic();

        private Generic() {
            super(null, null, "generic", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Generic);
        }

        public int hashCode() {
            return -1694850112;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Generic";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$InvalidStatus;", "Lcom/fourthline/orca/bav/internal/error/BavError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidStatus extends BavError {
        public static final int $stable = 0;
        public static final InvalidStatus INSTANCE = new InvalidStatus();

        private InvalidStatus() {
            super(null, null, "invalid_status", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidStatus);
        }

        public int hashCode() {
            return -2086412302;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidStatus";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$KycRequired;", "Lcom/fourthline/orca/bav/internal/error/BavError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KycRequired extends BavError {
        public static final int $stable = 0;
        public static final KycRequired INSTANCE = new KycRequired();

        private KycRequired() {
            super(null, null, "kyc_required", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof KycRequired);
        }

        public int hashCode() {
            return 1162881245;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "KycRequired";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$Unexpected;", "Lcom/fourthline/orca/bav/internal/error/BavError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unexpected extends BavError {
        private final Throwable cause;
        private final String message;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/bav/internal/error/BavError$Unexpected$Companion;", "", "<init>", "()V", "create", "Lcom/fourthline/orca/bav/internal/error/BavError$Unexpected;", "description", "", "cause", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public /* synthetic */ BavError(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ BavError(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private BavError(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
