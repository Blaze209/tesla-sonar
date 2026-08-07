package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum f implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final Internal.EnumLiteMap<f> internalValueMap = new Internal.EnumLiteMap<f>() { // from class: com.google.api.f.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f findValueByNumber(int i11) {
            return f.forNumber(i11);
        }
    };
    private final int value;

    private static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Internal.EnumVerifier f43336a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return f.forNumber(i11) != null;
        }
    }

    f(int i11) {
        this.value = i11;
    }

    public static f forNumber(int i11) {
        if (i11 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return ADDED;
        }
        if (i11 == 2) {
            return REMOVED;
        }
        if (i11 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static Internal.EnumLiteMap<f> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f43336a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static f valueOf(int i11) {
        return forNumber(i11);
    }
}
