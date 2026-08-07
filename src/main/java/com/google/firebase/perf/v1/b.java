package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum b implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<b> internalValueMap = new Internal.EnumLiteMap<b>() { // from class: com.google.firebase.perf.v1.b.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b findValueByNumber(int i11) {
            return b.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.b$b, reason: collision with other inner class name */
    private static final class C0697b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Internal.EnumVerifier f44587a = new C0697b();

        private C0697b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return b.forNumber(i11) != null;
        }
    }

    b(int i11) {
        this.value = i11;
    }

    public static b forNumber(int i11) {
        if (i11 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i11 == 1) {
            return FOREGROUND;
        }
        if (i11 == 2) {
            return BACKGROUND;
        }
        if (i11 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static Internal.EnumLiteMap<b> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C0697b.f44587a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static b valueOf(int i11) {
        return forNumber(i11);
    }
}
