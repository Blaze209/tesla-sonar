package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4384s implements Internal.EnumLite {
    CONTENT_JUSTIFY_UNKNOWN(0),
    CONTENT_JUSTIFY_CENTER(1),
    CONTENT_JUSTIFY_SPACE_BETWEEN(2),
    CONTENT_JUSTIFY_SPACE_AROUND(3),
    CONTENT_JUSTIFY_SPACE_EVENLY(4),
    CONTENT_JUSTIFY_START(5),
    UNRECOGNIZED(-1);

    public static final int CONTENT_JUSTIFY_CENTER_VALUE = 1;
    public static final int CONTENT_JUSTIFY_SPACE_AROUND_VALUE = 3;
    public static final int CONTENT_JUSTIFY_SPACE_BETWEEN_VALUE = 2;
    public static final int CONTENT_JUSTIFY_SPACE_EVENLY_VALUE = 4;
    public static final int CONTENT_JUSTIFY_START_VALUE = 5;
    public static final int CONTENT_JUSTIFY_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47496b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47498a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$a */
    public class a implements Internal.EnumLiteMap<EnumC4384s> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4384s.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47499a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4384s.forNumber(i11) != null;
        }
    }

    EnumC4384s(int i11) {
        this.f47498a = i11;
    }

    public static EnumC4384s forNumber(int i11) {
        if (i11 == 0) {
            return CONTENT_JUSTIFY_UNKNOWN;
        }
        if (i11 == 1) {
            return CONTENT_JUSTIFY_CENTER;
        }
        if (i11 == 2) {
            return CONTENT_JUSTIFY_SPACE_BETWEEN;
        }
        if (i11 == 3) {
            return CONTENT_JUSTIFY_SPACE_AROUND;
        }
        if (i11 == 4) {
            return CONTENT_JUSTIFY_SPACE_EVENLY;
        }
        if (i11 != 5) {
            return null;
        }
        return CONTENT_JUSTIFY_START;
    }

    public static Internal.EnumLiteMap<EnumC4384s> internalGetValueMap() {
        return f47496b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47499a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47498a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4384s valueOf(int i11) {
        return forNumber(i11);
    }
}
