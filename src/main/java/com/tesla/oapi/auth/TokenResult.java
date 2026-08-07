package com.tesla.oapi.auth;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/oapi/auth/TokenResult;", "", "<init>", "()V", "RemoteSuccess", "LocalSuccess", "RemoteFailure", "LocalFailure", "Lcom/tesla/oapi/auth/TokenResult$LocalFailure;", "Lcom/tesla/oapi/auth/TokenResult$LocalSuccess;", "Lcom/tesla/oapi/auth/TokenResult$RemoteFailure;", "Lcom/tesla/oapi/auth/TokenResult$RemoteSuccess;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TokenResult {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/auth/TokenResult$LocalFailure;", "Lcom/tesla/oapi/auth/TokenResult;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalFailure extends TokenResult {
        private final Throwable exception;

        public LocalFailure(Throwable th2) {
            super(null);
            this.exception = th2;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/auth/TokenResult$LocalSuccess;", "Lcom/tesla/oapi/auth/TokenResult;", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalSuccess extends TokenResult {
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalSuccess(String token) {
            super(null);
            s.k(token, "token");
            this.token = token;
        }

        public final String getToken() {
            return this.token;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/oapi/auth/TokenResult$RemoteFailure;", "Lcom/tesla/oapi/auth/TokenResult;", "exception", "", "statusCode", "", "<init>", "(Ljava/lang/Throwable;I)V", "getException", "()Ljava/lang/Throwable;", "getStatusCode", "()I", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteFailure extends TokenResult {
        private final Throwable exception;
        private final int statusCode;

        public RemoteFailure(Throwable th2, int i11) {
            super(null);
            this.exception = th2;
            this.statusCode = i11;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/auth/TokenResult$RemoteSuccess;", "Lcom/tesla/oapi/auth/TokenResult;", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteSuccess extends TokenResult {
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteSuccess(String token) {
            super(null);
            s.k(token, "token");
            this.token = token;
        }

        public final String getToken() {
            return this.token;
        }
    }

    public /* synthetic */ TokenResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TokenResult() {
    }
}
