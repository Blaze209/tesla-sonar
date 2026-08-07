package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum m implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<m> internalValueMap = new Internal.EnumLiteMap<m>() { // from class: com.google.api.m.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m findValueByNumber(int i11) {
            return m.forNumber(i11);
        }
    };
    private final int value;

    private static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Internal.EnumVerifier f43337a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return m.forNumber(i11) != null;
        }
    }

    m(int i11) {
        this.value = i11;
    }

    public static m forNumber(int i11) {
        if (i11 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return EARLY_ACCESS;
        }
        if (i11 == 2) {
            return ALPHA;
        }
        if (i11 == 3) {
            return BETA;
        }
        if (i11 == 4) {
            return GA;
        }
        if (i11 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static Internal.EnumLiteMap<m> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f43337a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static m valueOf(int i11) {
        return forNumber(i11);
    }
}
