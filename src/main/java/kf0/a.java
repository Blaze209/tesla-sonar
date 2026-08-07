package kf0;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lkf0/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Lvc0/o0;", "b", "()Lvc0/o0;", "Lkf0/a$a;", "Lkf0/a$b;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: kf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkf0/a$a;", "Lkf0/a;", "Lkf0/c;", "code", "<init>", "(Lkf0/c;)V", "a", "Lkf0/c;", "c", "()Lkf0/c;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1836a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kf0.c code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1836a(kf0.c code) {
            super(null);
            s.k(code, "code");
            this.code = code;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final kf0.c getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkf0/a$b;", "Lkf0/a;", "", "code", "<init>", "(I)V", "a", "I", "c", "()I", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        public b(int i11) {
            super(null);
            this.code = i11;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCode() {
            return this.code;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86037a;

        static {
            int[] iArr = new int[kf0.c.values().length];
            try {
                iArr[kf0.c.ERROR_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kf0.c.ERROR_SESSION_LIMIT_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kf0.c.ERROR_MISSING_PERMISSION_UWB_RANGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kf0.c.ERROR_VEHICLE_NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kf0.c.ERROR_BLE_PEER_UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kf0.c.ERROR_VEHICLE_NOT_SELECTED_FOR_RANGING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kf0.c.ERROR_UWB_HARDWARE_NOT_AVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kf0.c.ERROR_ILLEGAL_ARGUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kf0.c.ERROR_ILLEGAL_STATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[kf0.c.ERROR_RANGING_UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[kf0.c.ERROR_RANGING_DEAD_CLIENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[kf0.c.ERROR_COROUTINE_TASK_EXECUTION_EXCEPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[kf0.c.ERROR_COROUTINE_TASK_INTERRUPTED_EXCEPTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f86037a = iArr;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        String str;
        if (this instanceof C1836a) {
            switch (c.f86037a[((C1836a) this).getCode().ordinal()]) {
                case 1:
                    return "Unknown error";
                case 2:
                    return "session exceed limit";
                case 3:
                    return "nearby device or uwb ranging permission not granted";
                case 4:
                    return "vehicle not unsupported";
                case 5:
                    return "ble peer not available";
                case 6:
                    return " vehicle not selected for ranging";
                case 7:
                    return "uwb hardware not available";
                case 8:
                    return "illegal argument";
                case 9:
                    return "illegal state";
                case 10:
                    return "ranging unknown";
                case 11:
                    return "ranging dead client";
                case 12:
                    return "coroutine task execution exception";
                case 13:
                    return "coroutine task interrupted exception";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar = (b) this;
        switch (bVar.getCode()) {
            case UwbStatusCodes.SERVICE_NOT_AVAILABLE /* 42000 */:
                str = "SERVICE_NOT_AVAILABLE";
                break;
            case UwbStatusCodes.NULL_RANGING_DEVICE /* 42001 */:
                str = "NULL_RANGING_DEVICE";
                break;
            case UwbStatusCodes.INVALID_API_CALL /* 42002 */:
                str = "INVALID_API_CALL";
                break;
            case UwbStatusCodes.RANGING_ALREADY_STARTED /* 42003 */:
                str = "RANGING_ALREADY_STARTED";
                break;
            case 42004:
                str = "MISSING_PERMISSION_UWB_RANGING";
                break;
            case UwbStatusCodes.UWB_SYSTEM_CALLBACK_FAILURE /* 42005 */:
                str = "UWB_SYSTEM_CALLBACK_FAILURE";
                break;
            default:
                str = "CommonError: " + CommonStatusCodes.getStatusCodeString(bVar.getCode());
                break;
        }
        return "UWBError " + str;
    }

    public final o0 b() {
        if (this instanceof C1836a) {
            switch (c.f86037a[((C1836a) this).getCode().ordinal()]) {
                case 1:
                    return o0.FIRAERROR_UNKNOWN;
                case 2:
                case 3:
                case 5:
                    return o0.FIRAERROR_INVALID_API_CALL;
                case 4:
                    return o0.FIRAERROR_SERVICE_VERSION_UPDATE_REQUIRED;
                case 6:
                    return o0.FIRAERROR_INVALID_ACCOUNT;
                case 7:
                    return o0.FIRAERROR_UWB_HARDWARE_NOT_AVAILABLE;
                case 8:
                    return o0.FIRAERROR_ILLEGAL_ARGUMENT;
                case 9:
                    return o0.FIRAERROR_ILLEGAL_STATE;
                case 10:
                    return o0.FIRAERROR_STATUS_ERROR;
                case 11:
                    return o0.FIRAERROR_RANGING_DEAD_CLIENT;
                case 12:
                    return o0.FIRAERROR_COROUTINE_TASK_EXECUTION_EXCEPTION;
                case 13:
                    return o0.FIRAERROR_COROUTINE_TASK_INTERRUPTED_EXCEPTION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        int code = ((b) this).getCode();
        if (code == 3) {
            return o0.FIRAERROR_SERVICE_DISABLED;
        }
        if (code == 10) {
            return o0.FIRAERROR_DEVELOPER_ERROR;
        }
        if (code == 7) {
            return o0.FIRAERROR_NETWORK_ERROR;
        }
        if (code == 8) {
            return o0.FIRAERROR_INTERNAL_ERROR;
        }
        switch (code) {
            case 13:
                return o0.FIRAERROR_ERROR;
            case 14:
                return o0.FIRAERROR_INTERRUPTED;
            case 15:
                return o0.FIRAERROR_TIMEOUT;
            case 16:
                return o0.FIRAERROR_CANCELED;
            case 17:
                return o0.FIRAERROR_API_NOT_CONNECTED;
            default:
                switch (code) {
                    case UwbStatusCodes.SERVICE_NOT_AVAILABLE /* 42000 */:
                        return o0.FIRAERROR_SERVICE_NOT_AVAILABLE;
                    case UwbStatusCodes.NULL_RANGING_DEVICE /* 42001 */:
                        return o0.FIRAERROR_NULL_RANGING_DEVICE;
                    case UwbStatusCodes.INVALID_API_CALL /* 42002 */:
                        return o0.FIRAERROR_INVALID_API_CALL;
                    default:
                        return o0.FIRAERROR_UNKNOWN;
                }
        }
    }

    private a() {
    }
}
