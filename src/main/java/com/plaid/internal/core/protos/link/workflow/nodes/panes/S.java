package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum S implements Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);

    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47367b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47369a;

    public class a implements Internal.EnumLiteMap<S> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return S.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47370a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return S.forNumber(i11) != null;
        }
    }

    S(int i11) {
        this.f47369a = i11;
    }

    public static S forNumber(int i11) {
        if (i11 == 0) {
            return TABLE_ROW_STYLE_UNKNOWN;
        }
        if (i11 == 1) {
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        if (i11 != 2) {
            return null;
        }
        return TABLE_ROW_STYLE_TRAILING_LABEL;
    }

    public static Internal.EnumLiteMap<S> internalGetValueMap() {
        return f47367b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47370a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47369a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static S valueOf(int i11) {
        return forNumber(i11);
    }
}
