package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum i implements Internal.EnumLite {
    INTEGRATION_MODE_UNKNOWN(0),
    INTEGRATION_MODE_IFRAME(1),
    INTEGRATION_MODE_WEBVIEW(2),
    INTEGRATION_MODE_IOS_SDK_WEBVIEW(3),
    INTEGRATION_MODE_ANDROID_SDK_WEBVIEW(4),
    INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW(5),
    INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW(6),
    INTEGRATION_MODE_TAB_WINDOW(7),
    INTEGRATION_MODE_REDIRECT_URI(8),
    INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END(9),
    UNRECOGNIZED(-1);

    public static final int INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 6;
    public static final int INTEGRATION_MODE_ANDROID_SDK_WEBVIEW_VALUE = 4;
    public static final int INTEGRATION_MODE_IFRAME_VALUE = 1;
    public static final int INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 5;
    public static final int INTEGRATION_MODE_IOS_SDK_WEBVIEW_VALUE = 3;
    public static final int INTEGRATION_MODE_REDIRECT_URI_VALUE = 8;
    public static final int INTEGRATION_MODE_TAB_WINDOW_VALUE = 7;
    public static final int INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END_VALUE = 9;
    public static final int INTEGRATION_MODE_UNKNOWN_VALUE = 0;
    public static final int INTEGRATION_MODE_WEBVIEW_VALUE = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47572b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47574a;

    public class a implements Internal.EnumLiteMap<i> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return i.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47575a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return i.forNumber(i11) != null;
        }
    }

    i(int i11) {
        this.f47574a = i11;
    }

    public static i forNumber(int i11) {
        switch (i11) {
            case 0:
                return INTEGRATION_MODE_UNKNOWN;
            case 1:
                return INTEGRATION_MODE_IFRAME;
            case 2:
                return INTEGRATION_MODE_WEBVIEW;
            case 3:
                return INTEGRATION_MODE_IOS_SDK_WEBVIEW;
            case 4:
                return INTEGRATION_MODE_ANDROID_SDK_WEBVIEW;
            case 5:
                return INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 6:
                return INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 7:
                return INTEGRATION_MODE_TAB_WINDOW;
            case 8:
                return INTEGRATION_MODE_REDIRECT_URI;
            case 9:
                return INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<i> internalGetValueMap() {
        return f47572b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47575a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47574a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i valueOf(int i11) {
        return forNumber(i11);
    }
}
