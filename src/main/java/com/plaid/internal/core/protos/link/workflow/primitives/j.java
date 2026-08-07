package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum j implements Internal.EnumLite {
    NULLABLE_BOOL_UNKNOWN(0),
    NULLABLE_BOOL_UNDEFINED(1),
    NULLABLE_BOOL_TRUE(2),
    NULLABLE_BOOL_FALSE(3),
    UNRECOGNIZED(-1);

    public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
    public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
    public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
    public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47576b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47578a;

    public class a implements Internal.EnumLiteMap<j> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return j.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47579a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return j.forNumber(i11) != null;
        }
    }

    j(int i11) {
        this.f47578a = i11;
    }

    public static j forNumber(int i11) {
        if (i11 == 0) {
            return NULLABLE_BOOL_UNKNOWN;
        }
        if (i11 == 1) {
            return NULLABLE_BOOL_UNDEFINED;
        }
        if (i11 == 2) {
            return NULLABLE_BOOL_TRUE;
        }
        if (i11 != 3) {
            return null;
        }
        return NULLABLE_BOOL_FALSE;
    }

    public static Internal.EnumLiteMap<j> internalGetValueMap() {
        return f47576b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47579a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47578a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static j valueOf(int i11) {
        return forNumber(i11);
    }
}
