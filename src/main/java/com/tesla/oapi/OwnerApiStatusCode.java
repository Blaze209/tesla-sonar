package com.tesla.oapi;

import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010 R\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b#\u0010 j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006&"}, d2 = {"Lcom/tesla/oapi/OwnerApiStatusCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "SOCKET_EXCEPTION", "NO_NETWORK", "UNKNOWN", InstanceID.ERROR_TIMEOUT, "SUCCESS", "NO_CONTENT", "BAD_REQUEST", "UNAUTHORIZED", "FORBIDDEN", "NOT_FOUND", "SERVER_ERROR", "MOBILE_ACCESS_DISABLED", "PRODUCT_OFFLINE", "BACKEND_DEPENDENCY_FAILURE_OR_MISSING_DATA", "UNPROCESSABLE_ENTITY", "ACCOUNT_LOCKED", "UPSTREAM_DEPENDENCY_ERROR", "TOO_MANY_REQUESTS", "SERVER_SYSTEM_WIDE_ERROR", "SERVER_MAINTENANCE", "GATEWAY_TIMEOUT", "VEHICLE_SPECIFIC_ERROR", "isSuccess", "", "()Z", "isSuccess$delegate", "Lkotlin/Lazy;", "isLocalError", "isLocalError$delegate", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum OwnerApiStatusCode {
    SOCKET_EXCEPTION(-4),
    NO_NETWORK(-3),
    UNKNOWN(-2),
    TIMEOUT(-1),
    SUCCESS(200),
    NO_CONTENT(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE),
    BAD_REQUEST(400),
    UNAUTHORIZED(HttpStatusCode.UNAUTHORIZED_401),
    FORBIDDEN(DownloaderService.STATUS_FORBIDDEN),
    NOT_FOUND(404),
    SERVER_ERROR(500),
    MOBILE_ACCESS_DISABLED(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    PRODUCT_OFFLINE(408),
    BACKEND_DEPENDENCY_FAILURE_OR_MISSING_DATA(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION),
    UNPROCESSABLE_ENTITY(HttpStatusCode.UNPROCESSABLE_ENTITY_422),
    ACCOUNT_LOCKED(423),
    UPSTREAM_DEPENDENCY_ERROR(424),
    TOO_MANY_REQUESTS(HttpStatusCode.TOO_MANY_REQUESTS_429),
    SERVER_SYSTEM_WIDE_ERROR(HttpStatusCode.BAD_GATEWAY_502),
    SERVER_MAINTENANCE(503),
    GATEWAY_TIMEOUT(504),
    VEHICLE_SPECIFIC_ERROR(540);

    private final int code;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final Lazy isSuccess = m.b(new wn0.a() { // from class: com.tesla.oapi.a
        @Override // wn0.a
        public final Object invoke() {
            return Boolean.valueOf(OwnerApiStatusCode.isSuccess_delegate$lambda$0(this.f56489a));
        }
    });

    /* JADX INFO: renamed from: isLocalError$delegate, reason: from kotlin metadata */
    private final Lazy isLocalError = m.b(new wn0.a() { // from class: com.tesla.oapi.b
        @Override // wn0.a
        public final Object invoke() {
            return Boolean.valueOf(OwnerApiStatusCode.isLocalError_delegate$lambda$1(this.f56497a));
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/OwnerApiStatusCode$Companion;", "", "<init>", "()V", "fromCode", "Lcom/tesla/oapi/OwnerApiStatusCode;", "code", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final OwnerApiStatusCode fromCode(int code) {
            for (OwnerApiStatusCode ownerApiStatusCode : OwnerApiStatusCode.values()) {
                if (ownerApiStatusCode.getCode() == code) {
                    if (ownerApiStatusCode == null) {
                        return OwnerApiStatusCode.UNKNOWN;
                    }
                    return ownerApiStatusCode;
                }
            }
            ownerApiStatusCode = null;
            if (ownerApiStatusCode == null) {
                return OwnerApiStatusCode.UNKNOWN;
            }
            return ownerApiStatusCode;
        }

        private Companion() {
        }
    }

    OwnerApiStatusCode(int i11) {
        this.code = i11;
    }

    public static EnumEntries<OwnerApiStatusCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLocalError_delegate$lambda$1(OwnerApiStatusCode ownerApiStatusCode) {
        return ownerApiStatusCode.code < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSuccess_delegate$lambda$0(OwnerApiStatusCode ownerApiStatusCode) {
        int i11 = ownerApiStatusCode.code;
        return i11 >= SUCCESS.code && i11 < BAD_REQUEST.code;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean isLocalError() {
        return ((Boolean) this.isLocalError.getValue()).booleanValue();
    }

    public final boolean isSuccess() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }
}
