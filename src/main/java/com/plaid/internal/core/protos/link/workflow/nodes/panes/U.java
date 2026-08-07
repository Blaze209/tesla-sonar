package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum U implements Internal.EnumLite {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_LEFT(1),
    TEXT_ALIGNMENT_CENTER(2),
    TEXT_ALIGNMENT_RIGHT(3),
    TEXT_ALIGNMENT_JUSTIFIED(4),
    UNRECOGNIZED(-1);

    public static final int TEXT_ALIGNMENT_CENTER_VALUE = 2;
    public static final int TEXT_ALIGNMENT_JUSTIFIED_VALUE = 4;
    public static final int TEXT_ALIGNMENT_LEFT_VALUE = 1;
    public static final int TEXT_ALIGNMENT_RIGHT_VALUE = 3;
    public static final int TEXT_ALIGNMENT_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47387b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47389a;

    public class a implements Internal.EnumLiteMap<U> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return U.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47390a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return U.forNumber(i11) != null;
        }
    }

    U(int i11) {
        this.f47389a = i11;
    }

    public static U forNumber(int i11) {
        if (i11 == 0) {
            return TEXT_ALIGNMENT_UNKNOWN;
        }
        if (i11 == 1) {
            return TEXT_ALIGNMENT_LEFT;
        }
        if (i11 == 2) {
            return TEXT_ALIGNMENT_CENTER;
        }
        if (i11 == 3) {
            return TEXT_ALIGNMENT_RIGHT;
        }
        if (i11 != 4) {
            return null;
        }
        return TEXT_ALIGNMENT_JUSTIFIED;
    }

    public static Internal.EnumLiteMap<U> internalGetValueMap() {
        return f47387b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47390a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47389a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static U valueOf(int i11) {
        return forNumber(i11);
    }
}
