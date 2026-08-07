package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum c implements Internal.EnumLite {
    CARD_COLLECT_NO_ERROR(0),
    CARD_COLLECT_INTERNAL_SERVICE_ERROR(1),
    CARD_COLLECT_INVALID_CARD_DETAILS(2),
    UNRECOGNIZED(-1);

    public static final int CARD_COLLECT_INTERNAL_SERVICE_ERROR_VALUE = 1;
    public static final int CARD_COLLECT_INVALID_CARD_DETAILS_VALUE = 2;
    public static final int CARD_COLLECT_NO_ERROR_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47551b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47553a;

    public class a implements Internal.EnumLiteMap<c> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return c.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47554a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return c.forNumber(i11) != null;
        }
    }

    c(int i11) {
        this.f47553a = i11;
    }

    public static c forNumber(int i11) {
        if (i11 == 0) {
            return CARD_COLLECT_NO_ERROR;
        }
        if (i11 == 1) {
            return CARD_COLLECT_INTERNAL_SERVICE_ERROR;
        }
        if (i11 != 2) {
            return null;
        }
        return CARD_COLLECT_INVALID_CARD_DETAILS;
    }

    public static Internal.EnumLiteMap<c> internalGetValueMap() {
        return f47551b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47554a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47553a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static c valueOf(int i11) {
        return forNumber(i11);
    }
}
