package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum L implements Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);

    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47299b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47301a;

    public class a implements Internal.EnumLiteMap<L> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return L.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47302a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return L.forNumber(i11) != null;
        }
    }

    L(int i11) {
        this.f47301a = i11;
    }

    public static L forNumber(int i11) {
        if (i11 == 0) {
            return SDK_ENCRYPTION_SCHEME_UNKNOWN;
        }
        if (i11 == 1) {
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        if (i11 != 2) {
            return null;
        }
        return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
    }

    public static Internal.EnumLiteMap<L> internalGetValueMap() {
        return f47299b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47302a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47301a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static L valueOf(int i11) {
        return forNumber(i11);
    }
}
