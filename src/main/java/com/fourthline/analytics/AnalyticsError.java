package com.fourthline.analytics;

import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/analytics/AnalyticsError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "DatadogNotImported", "InvalidTenantId", "Lcom/fourthline/analytics/AnalyticsError$DatadogNotImported;", "Lcom/fourthline/analytics/AnalyticsError$InvalidTenantId;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnalyticsError extends Throwable {

    @e
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/fourthline/analytics/AnalyticsError$DatadogNotImported;", "Lcom/fourthline/analytics/AnalyticsError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fourthline/analytics/AnalyticsError$DatadogNotImported;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Throwable;", "getCause", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatadogNotImported extends AnalyticsError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatadogNotImported(String message, Throwable th2) {
            super(message, th2, null);
            s.k(message, "message");
            this.message = message;
            this.cause = th2;
        }

        public static /* synthetic */ DatadogNotImported copy$default(DatadogNotImported datadogNotImported, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = datadogNotImported.message;
            }
            if ((i11 & 2) != 0) {
                th2 = datadogNotImported.cause;
            }
            return datadogNotImported.copy(str, th2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final DatadogNotImported copy(String message, Throwable cause) {
            s.k(message, "message");
            return new DatadogNotImported(message, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatadogNotImported)) {
                return false;
            }
            DatadogNotImported datadogNotImported = (DatadogNotImported) other;
            return s.f(this.message, datadogNotImported.message) && s.f(this.cause, datadogNotImported.cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DatadogNotImported(message=" + this.message + ", cause=" + this.cause + ")";
        }

        public /* synthetic */ DatadogNotImported(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/fourthline/analytics/AnalyticsError$InvalidTenantId;", "Lcom/fourthline/analytics/AnalyticsError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fourthline/analytics/AnalyticsError$InvalidTenantId;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Throwable;", "getCause", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidTenantId extends AnalyticsError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidTenantId(String message, Throwable th2) {
            super(message, th2, null);
            s.k(message, "message");
            this.message = message;
            this.cause = th2;
        }

        public static /* synthetic */ InvalidTenantId copy$default(InvalidTenantId invalidTenantId, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = invalidTenantId.message;
            }
            if ((i11 & 2) != 0) {
                th2 = invalidTenantId.cause;
            }
            return invalidTenantId.copy(str, th2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final InvalidTenantId copy(String message, Throwable cause) {
            s.k(message, "message");
            return new InvalidTenantId(message, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidTenantId)) {
                return false;
            }
            InvalidTenantId invalidTenantId = (InvalidTenantId) other;
            return s.f(this.message, invalidTenantId.message) && s.f(this.cause, invalidTenantId.cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidTenantId(message=" + this.message + ", cause=" + this.cause + ")";
        }

        public /* synthetic */ InvalidTenantId(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }
    }

    public /* synthetic */ AnalyticsError(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    private AnalyticsError(String str, Throwable th2) {
        super(str, th2);
    }
}
