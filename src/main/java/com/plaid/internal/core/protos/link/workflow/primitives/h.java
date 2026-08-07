package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum h implements Internal.EnumLite {
    INCREMENTAL_CALLBACK_SUPPORT_NONE(0),
    INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT(1),
    UNRECOGNIZED(-1);

    public static final int INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT_VALUE = 1;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_NONE_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47568b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47570a;

    public class a implements Internal.EnumLiteMap<h> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return h.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47571a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return h.forNumber(i11) != null;
        }
    }

    h(int i11) {
        this.f47570a = i11;
    }

    public static h forNumber(int i11) {
        if (i11 == 0) {
            return INCREMENTAL_CALLBACK_SUPPORT_NONE;
        }
        if (i11 != 1) {
            return null;
        }
        return INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT;
    }

    public static Internal.EnumLiteMap<h> internalGetValueMap() {
        return f47568b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47571a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47570a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h valueOf(int i11) {
        return forNumber(i11);
    }
}
