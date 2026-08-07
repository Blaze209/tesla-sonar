package com.fourthline.core.location;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\n\u000b\f\rB\u0013\b\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0014\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/fourthline/core/location/LocationProviderError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "description", "", "(Ljava/lang/String;)V", "LocationServicesNotEnabled", "LocationPermissionsNotGranted", "AnotherRequestInProgress", "Unknown", "Lcom/fourthline/core/location/LocationProviderError$AnotherRequestInProgress;", "Lcom/fourthline/core/location/LocationProviderError$LocationPermissionsNotGranted;", "Lcom/fourthline/core/location/LocationProviderError$LocationServicesNotEnabled;", "Lcom/fourthline/core/location/LocationProviderError$Unknown;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LocationProviderError extends IllegalStateException {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/core/location/LocationProviderError$AnotherRequestInProgress;", "Lcom/fourthline/core/location/LocationProviderError;", "requestName", "", "<init>", "(Ljava/lang/String;)V", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnotherRequestInProgress extends LocationProviderError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnotherRequestInProgress(String requestName) {
            super(requestName + " is in progress.", (DefaultConstructorMarker) null);
            s.k(requestName, "requestName");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/core/location/LocationProviderError$LocationPermissionsNotGranted;", "Lcom/fourthline/core/location/LocationProviderError;", "<init>", "()V", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationPermissionsNotGranted extends LocationProviderError {
        public static final LocationPermissionsNotGranted INSTANCE = new LocationPermissionsNotGranted();

        private LocationPermissionsNotGranted() {
            super("Location permissions are not granted.", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/core/location/LocationProviderError$LocationServicesNotEnabled;", "Lcom/fourthline/core/location/LocationProviderError;", "<init>", "()V", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationServicesNotEnabled extends LocationProviderError {
        public static final LocationServicesNotEnabled INSTANCE = new LocationServicesNotEnabled();

        private LocationServicesNotEnabled() {
            super("Location services are not enabled.", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/core/location/LocationProviderError$Unknown;", "Lcom/fourthline/core/location/LocationProviderError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/fourthline/core/location/LocationProviderError$Unknown;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getCause", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends LocationProviderError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        public Unknown(Throwable th2) {
            super(th2, (DefaultConstructorMarker) null);
            this.cause = th2;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = unknown.cause;
            }
            return unknown.copy(th2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Unknown copy(Throwable cause) {
            return new Unknown(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && s.f(this.cause, ((Unknown) other).cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.cause + ")";
        }
    }

    public /* synthetic */ LocationProviderError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public /* synthetic */ LocationProviderError(Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2);
    }

    private LocationProviderError(Throwable th2) {
        super(th2);
    }

    private LocationProviderError(String str) {
        super(str);
    }
}
