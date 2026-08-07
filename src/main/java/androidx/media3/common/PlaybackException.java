package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.teslamotors.plugins.ble.Peripheral;
import java.util.Objects;
import s7.j;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9012d = q0.N0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9013e = q0.N0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9014f = q0.N0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9015g = q0.N0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f9016h = q0.N0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f9017i = q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f9020c;

    public PlaybackException(String str, Throwable th2, int i11, Bundle bundle) {
        this(str, th2, i11, bundle, j.f110429a.elapsedRealtime());
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static PlaybackException d(Bundle bundle) {
        return new PlaybackException(bundle);
    }

    private static Throwable e(Bundle bundle) {
        String string = bundle.getString(f9015g);
        String string2 = bundle.getString(f9016h);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            return thB == null ? a(string2) : thB;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    public static String g(int i11) {
        if (i11 == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i11 == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i11 == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i11 == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i11 == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i11 == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i11 == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i11) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case -109:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case -108:
                return "ERROR_CODE_SETUP_REQUIRED";
            case -107:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case -106:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case -105:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case -104:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case -103:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case -102:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
                switch (i11) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i11) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i11) {
                                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i11) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            case 4006:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i11) {
                                                    case 5001:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case 5002:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case 5003:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case 5004:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    default:
                                                        switch (i11) {
                                                            case Peripheral.COMMAND_TIMEOUT_DURATION_MS /* 6000 */:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case 6001:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case 6002:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case 6003:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case 6004:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case 6005:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case 6006:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case 6007:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case 6008:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                return i11 >= 1000000 ? "custom error code" : "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static Bundle h(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f9017i);
        return bundle2 != null ? bundle2 : Bundle.EMPTY;
    }

    public boolean c(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f9018a == playbackException.f9018a && Objects.equals(getMessage(), playbackException.getMessage()) && this.f9019b == playbackException.f9019b) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return g(this.f9018a);
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9012d, this.f9018a);
        bundle.putLong(f9013e, this.f9019b);
        bundle.putString(f9014f, getMessage());
        bundle.putBundle(f9017i, this.f9020c);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f9015g, cause.getClass().getName());
            bundle.putString(f9016h, cause.getMessage());
        }
        return bundle;
    }

    protected PlaybackException(Bundle bundle) {
        this(bundle.getString(f9014f), e(bundle), bundle.getInt(f9012d, 1000), h(bundle), bundle.getLong(f9013e, SystemClock.elapsedRealtime()));
    }

    protected PlaybackException(String str, Throwable th2, int i11, Bundle bundle, long j11) {
        super(str, th2);
        this.f9018a = i11;
        this.f9020c = bundle;
        this.f9019b = j11;
    }
}
