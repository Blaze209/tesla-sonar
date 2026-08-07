package x5;

import android.content.Context;
import androidx.core.uwb.exceptions.UwbHardwareNotAvailableException;
import androidx.core.uwb.exceptions.UwbServiceNotAvailableException;
import androidx.core.uwb.exceptions.UwbSystemCallbackException;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Landroid/content/Context;)Z", "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "Lcom/google/android/gms/common/api/ApiException;", "e", "b", "(Lcom/google/android/gms/common/api/ApiException;)V", "uwb_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final void a(Context context) throws UwbHardwareNotAvailableException {
        s.k(context, "context");
        if (!c(context)) {
            throw new UwbHardwareNotAvailableException("UWB Hardware is not available on this device.");
        }
    }

    public static final void b(ApiException e11) throws UwbSystemCallbackException, UwbServiceNotAvailableException {
        s.k(e11, "e");
        switch (e11.getStatusCode()) {
            case UwbStatusCodes.SERVICE_NOT_AVAILABLE /* 42000 */:
                throw new UwbServiceNotAvailableException("UWB Service is not available.");
            case UwbStatusCodes.NULL_RANGING_DEVICE /* 42001 */:
            case 42004:
            default:
                throw new RuntimeException("Unexpected error. This indicates that the library is not up-to-date with the service backend.");
            case UwbStatusCodes.INVALID_API_CALL /* 42002 */:
                throw new IllegalArgumentException("Illegal api call was received.");
            case UwbStatusCodes.RANGING_ALREADY_STARTED /* 42003 */:
                throw new IllegalStateException("Ranging has already started for the clientSessionScope.");
            case UwbStatusCodes.UWB_SYSTEM_CALLBACK_FAILURE /* 42005 */:
                throw new UwbSystemCallbackException("UWB backend system resulted in an error.");
        }
    }

    public static final boolean c(Context context) {
        s.k(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.uwb");
    }
}
