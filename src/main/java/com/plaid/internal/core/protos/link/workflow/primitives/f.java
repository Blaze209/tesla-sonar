package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum f implements Internal.EnumLite {
    ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN(0),
    ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER(2),
    UNRECOGNIZED(-1);

    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER_VALUE = 2;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47560b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47562a;

    public class a implements Internal.EnumLiteMap<f> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return f.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47563a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return f.forNumber(i11) != null;
        }
    }

    f(int i11) {
        this.f47562a = i11;
    }

    public static f forNumber(int i11) {
        if (i11 == 0) {
            return ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN;
        }
        if (i11 != 2) {
            return null;
        }
        return ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER;
    }

    public static Internal.EnumLiteMap<f> internalGetValueMap() {
        return f47560b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47563a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47562a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static f valueOf(int i11) {
        return forNumber(i11);
    }
}
