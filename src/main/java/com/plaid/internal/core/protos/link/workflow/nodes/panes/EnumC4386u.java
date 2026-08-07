package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4386u implements Internal.EnumLite {
    FLEX_DIRECTION_ROW(0),
    FLEX_DIRECTION_COLUMN(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN_REVERSE(3),
    UNRECOGNIZED(-1);

    public static final int FLEX_DIRECTION_COLUMN_REVERSE_VALUE = 3;
    public static final int FLEX_DIRECTION_COLUMN_VALUE = 1;
    public static final int FLEX_DIRECTION_ROW_REVERSE_VALUE = 2;
    public static final int FLEX_DIRECTION_ROW_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47506b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47508a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$a */
    public class a implements Internal.EnumLiteMap<EnumC4386u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4386u.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47509a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4386u.forNumber(i11) != null;
        }
    }

    EnumC4386u(int i11) {
        this.f47508a = i11;
    }

    public static EnumC4386u forNumber(int i11) {
        if (i11 == 0) {
            return FLEX_DIRECTION_ROW;
        }
        if (i11 == 1) {
            return FLEX_DIRECTION_COLUMN;
        }
        if (i11 == 2) {
            return FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i11 != 3) {
            return null;
        }
        return FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public static Internal.EnumLiteMap<EnumC4386u> internalGetValueMap() {
        return f47506b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47509a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47508a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4386u valueOf(int i11) {
        return forNumber(i11);
    }
}
