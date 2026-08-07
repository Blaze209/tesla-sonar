package com.tesla.oapi.auth;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tesla/oapi/auth/UnauthorizedTokenRefreshException;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnauthorizedTokenRefreshException extends Throwable {
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public UnauthorizedTokenRefreshException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UnauthorizedTokenRefreshException copy$default(UnauthorizedTokenRefreshException unauthorizedTokenRefreshException, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unauthorizedTokenRefreshException.message;
        }
        return unauthorizedTokenRefreshException.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final UnauthorizedTokenRefreshException copy(String message) {
        return new UnauthorizedTokenRefreshException(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnauthorizedTokenRefreshException) && s.f(this.message, ((UnauthorizedTokenRefreshException) other).message);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "UnauthorizedTokenRefreshException(message=" + this.message + ")";
    }

    public /* synthetic */ UnauthorizedTokenRefreshException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public UnauthorizedTokenRefreshException(String str) {
        super(str);
        this.message = str;
    }
}
