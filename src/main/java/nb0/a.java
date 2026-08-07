package nb0;

import ce0.TeslaCommandRequest;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import ic0.e;
import ic0.h;
import ic0.q;
import java.util.concurrent.atomic.AtomicInteger;
import ob0.RetryPolicy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b\u001a%\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lic0/h;", "sessionResult", "e", "(Lic0/h;)Lic0/h;", "Lic0/q;", "transport", "", "a", "(Lic0/q;)I", "b", "Lce0/j;", "request", "Lob0/c;", "c", "(Lic0/h;Lic0/q;Lce0/j;)Lob0/c;", "", DateTokenConverter.CONVERTER_KEY, "(Lic0/h;)Z", "isSuccess", "command-utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nb0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2000a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f93706b;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.TRANSPORT_BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f93705a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.RESULT_VEHICLE_NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_WAIT_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.RESULT_EMPTY_SESSION_INFO_SIGNATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.RESULT_INVALID_HANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.RESULT_INCORRECT_SESSION_INFO_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.RESULT_HERMES_INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.RESULT_TOKEN_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_TIMEOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_BUSY_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[h.RESULT_SESSION_INFO_RECOVERED.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[h.RESULT_SESSION_INFO_VALIDATION_FAILURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[h.RESULT_MISSING_SESSION_INFO_VALIDATION_DATA.ordinal()] = 13;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[h.RESULT_INVALID_VEHICLE_PUBLIC_KEY.ordinal()] = 14;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[h.RESULT_SERVER_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[h.RESULT_SERVER_SYSTEM_WIDE_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[h.RESULT_SERVER_MAINTENANCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[h.RESULT_NO_NETWORK.ordinal()] = 18;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[h.RESULT_TIMEOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[h.RESULT_CONNECTION_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[h.RESULT_SOCKET_EXCEPTION.ordinal()] = 21;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[h.RESULT_SOURCE_PUBLIC_KEY_NOT_FOUND.ordinal()] = 22;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_LOOKUP_FAILURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[h.RESULT_TRANSMISSION_FAILURE.ordinal()] = 24;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[h.RESULT_FORBIDDEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[h.RESULT_CONFIG_CONNECTIVITY_DISABLED.ordinal()] = 26;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[h.RESULT_APPLICATION_ERROR.ordinal()] = 27;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[h.RESULT_INVALID_MESSAGE_ERROR.ordinal()] = 28;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[h.RESULT_UNRECOGNIZED_ENUM_VALUE.ordinal()] = 29;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[h.RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE.ordinal()] = 30;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[h.RESULT_WHITELIST_FULL.ordinal()] = 31;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[h.RESULT_INTERNAL_ERROR.ordinal()] = 32;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[h.RESULT_INSUFFICIENT_PRIVILEGES.ordinal()] = 33;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[h.RESULT_TOO_MANY_REQUESTS.ordinal()] = 34;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[h.RESULT_INVALID_COMMAND_REQUEST.ordinal()] = 35;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[h.RESULT_NOT_IN_WHITELIST.ordinal()] = 36;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[h.RESULT_NOMINAL_ERROR.ordinal()] = 37;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[h.RESULT_CAR_SERVER_ERROR.ordinal()] = 38;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[h.RESULT_MOBILE_ACCESS_DISABLED.ordinal()] = 39;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_NOT_AWAKE.ordinal()] = 40;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[h.RESULT_SUCCESS.ordinal()] = 41;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[h.RESULT_NONE.ordinal()] = 42;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[h.RESULT_BLUETOOTH_DISABLED.ordinal()] = 43;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[h.RESULT_SCAN_IN_PROGRESS.ordinal()] = 44;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[h.RESULT_NO_PERIPHERALS.ordinal()] = 45;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[h.RESULT_NOT_CONNECTED.ordinal()] = 46;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[h.RESULT_NO_KEYS_CREATED.ordinal()] = 47;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[h.RESULT_PUBLIC_KEY_NOT_FOUND.ordinal()] = 48;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[h.RESULT_INVALID_STATE.ordinal()] = 49;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[h.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED.ordinal()] = 50;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[h.RESULT_SIGNED_COMMANDS_REQUIRED.ordinal()] = 51;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[h.RESULT_UNAUTHORIZED.ordinal()] = 52;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[h.RESULT_UNSUPPORTED_COMMAND.ordinal()] = 53;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[h.RESULT_UNKNOWN_ERROR.ordinal()] = 54;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[h.RESULT_BAD_PARAMETER.ordinal()] = 55;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[h.RESULT_BLE_SERVICE_DISCONNECTED.ordinal()] = 56;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[h.RESULT_MISSING_EMAIL.ordinal()] = 57;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[h.RESULT_MISSING_VIN.ordinal()] = 58;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[h.RESULT_MISSING_VEHICLE_DATA.ordinal()] = 59;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[h.RESULT_MISSING_VEHICLE_DATA_VIN.ordinal()] = 60;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[h.RESULT_MISSING_VEHICLE_DATA_API_VERSION.ordinal()] = 61;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[h.RESULT_MISSING_REQUEST_VIN.ordinal()] = 62;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[h.RESULT_VEHICLE_DATA_LOOKUP_FAILURE.ordinal()] = 63;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[h.RESULT_MESSAGE_BUILD_FAILURE.ordinal()] = 64;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[h.RESULT_MESSAGE_EVALUATION_FAILURE.ordinal()] = 65;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr2[h.RESULT_LEGACY_BLE_COMMAND_FAILURE.ordinal()] = 66;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr2[h.RESULT_UNSUPPORTED_KEY_VERSION.ordinal()] = 67;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr2[h.RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE.ordinal()] = 68;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr2[h.RESULT_EXCEPTION_THROWN.ordinal()] = 69;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr2[h.RESULT_DEPENDENT_SESSION_INFO_FAILURE.ordinal()] = 70;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr2[h.RESULT_WHITELIST_OPERATION_FAILURE.ordinal()] = 71;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr2[h.RESULT_BLE_SERVICE_NULL.ordinal()] = 72;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr2[h.RESULT_BLE_SERVICE_REMOTE_EXCEPTION.ordinal()] = 73;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr2[h.RESULT_ERROR_REQUEST_MTU_EXCEEDED.ordinal()] = 74;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr2[h.RESULT_ERROR_RESPONSE_MTU_EXCEEDED.ordinal()] = 75;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr2[h.RESULT_REQUEST_REPLACED_BY_NEW_REQUEST.ordinal()] = 76;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr2[h.RESULT_COMMAND_RESPONSE_REQUIRES_ENCRYPTION.ordinal()] = 77;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr2[h.RESULT_ACCOUNT_LOCKED.ordinal()] = 78;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr2[h.RESULT_BAD_REQUEST.ordinal()] = 79;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr2[h.RESULT_NOT_FOUND.ordinal()] = 80;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr2[h.RESULT_BACKEND_DEPENDENCY_FAILURE.ordinal()] = 81;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr2[h.RESULT_UNPROCESSABLE_ENTITY.ordinal()] = 82;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr2[h.RESULT_UPSTREAM_DEPENDENCY_ERROR.ordinal()] = 83;
            } catch (NoSuchFieldError unused84) {
            }
            f93706b = iArr2;
        }
    }

    public static final int a(q transport) {
        s.k(transport, "transport");
        return C2000a.f93705a[transport.ordinal()] == 1 ? 10 : 3;
    }

    public static final int b(q transport) {
        s.k(transport, "transport");
        if (C2000a.f93705a[transport.ordinal()] == 1) {
            return 100;
        }
        return AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
    }

    public static final RetryPolicy c(h hVar, q transport, TeslaCommandRequest teslaCommandRequest) {
        e request;
        AtomicInteger nominalRetryCount;
        s.k(transport, "transport");
        int i11 = (teslaCommandRequest == null || (nominalRetryCount = teslaCommandRequest.getNominalRetryCount()) == null) ? 3 : nominalRetryCount.get();
        boolean z11 = i11 < a(transport);
        switch (hVar == null ? -1 : C2000a.f93706b[hVar.ordinal()]) {
            case -1:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                return new RetryPolicy(false, 0, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new RetryPolicy((teslaCommandRequest == null || (request = teslaCommandRequest.getRequest()) == null || request.getLetSleep()) ? false : true, b(transport));
            case 2:
                return new RetryPolicy(z11, b(transport));
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new RetryPolicy(z11, 0, 2, null);
            case 15:
            case 16:
            case 17:
                return new RetryPolicy(i11 < 1, 0, 2, null);
            case 18:
            case 19:
            case 20:
            case 21:
                return new RetryPolicy(z11, b(transport));
        }
    }

    public static final boolean d(h hVar) {
        s.k(hVar, "<this>");
        return hVar == h.RESULT_SUCCESS;
    }

    public static final h e(h sessionResult) {
        s.k(sessionResult, "sessionResult");
        return sessionResult == h.RESULT_NOT_IN_WHITELIST ? sessionResult : h.RESULT_DEPENDENT_SESSION_INFO_FAILURE;
    }
}
