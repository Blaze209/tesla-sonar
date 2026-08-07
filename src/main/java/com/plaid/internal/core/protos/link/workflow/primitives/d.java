package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum d implements Internal.EnumLite {
    VAULT_NONE(0),
    VAULT_VGS(1),
    UNRECOGNIZED(-1);

    public static final int VAULT_NONE_VALUE = 0;
    public static final int VAULT_VGS_VALUE = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47555b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47557a;

    public class a implements Internal.EnumLiteMap<d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return d.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47558a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return d.forNumber(i11) != null;
        }
    }

    d(int i11) {
        this.f47557a = i11;
    }

    public static d forNumber(int i11) {
        if (i11 == 0) {
            return VAULT_NONE;
        }
        if (i11 != 1) {
            return null;
        }
        return VAULT_VGS;
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
        return f47555b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47558a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47557a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d valueOf(int i11) {
        return forNumber(i11);
    }
}
