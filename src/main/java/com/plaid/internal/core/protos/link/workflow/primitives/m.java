package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum m implements Internal.EnumLite {
    ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB(1),
    ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB(2),
    ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER(3),
    UNRECOGNIZED(-1);

    public static final int ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB_VALUE = 2;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER_VALUE = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB_VALUE = 1;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47582b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47584a;

    public class a implements Internal.EnumLiteMap<m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return m.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47585a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return m.forNumber(i11) != null;
        }
    }

    m(int i11) {
        this.f47584a = i11;
    }

    public static m forNumber(int i11) {
        if (i11 == 0) {
            return ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i11 == 1) {
            return ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB;
        }
        if (i11 == 2) {
            return ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB;
        }
        if (i11 != 3) {
            return null;
        }
        return ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER;
    }

    public static Internal.EnumLiteMap<m> internalGetValueMap() {
        return f47582b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47585a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47584a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static m valueOf(int i11) {
        return forNumber(i11);
    }
}
