package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum F implements Internal.EnumLite {
    OAUTH_SUBMISSION_METHOD_UNKNOWN(0),
    OAUTH_SUBMISSION_METHOD_POLLING(1),
    OAUTH_SUBMISSION_METHOD_REDIRECT(2),
    UNRECOGNIZED(-1);

    public static final int OAUTH_SUBMISSION_METHOD_POLLING_VALUE = 1;
    public static final int OAUTH_SUBMISSION_METHOD_REDIRECT_VALUE = 2;
    public static final int OAUTH_SUBMISSION_METHOD_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47264b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47266a;

    public class a implements Internal.EnumLiteMap<F> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return F.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47267a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return F.forNumber(i11) != null;
        }
    }

    F(int i11) {
        this.f47266a = i11;
    }

    public static F forNumber(int i11) {
        if (i11 == 0) {
            return OAUTH_SUBMISSION_METHOD_UNKNOWN;
        }
        if (i11 == 1) {
            return OAUTH_SUBMISSION_METHOD_POLLING;
        }
        if (i11 != 2) {
            return null;
        }
        return OAUTH_SUBMISSION_METHOD_REDIRECT;
    }

    public static Internal.EnumLiteMap<F> internalGetValueMap() {
        return f47264b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47267a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47266a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static F valueOf(int i11) {
        return forNumber(i11);
    }
}
