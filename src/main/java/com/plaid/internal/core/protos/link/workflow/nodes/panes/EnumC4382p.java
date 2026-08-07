package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4382p implements Internal.EnumLite {
    BUTTON_PLACEMENT_UNKNOWN(0),
    BUTTON_PLACEMENT_FOOTER(1),
    BUTTON_PLACEMENT_CONTENT_END(2),
    UNRECOGNIZED(-1);

    public static final int BUTTON_PLACEMENT_CONTENT_END_VALUE = 2;
    public static final int BUTTON_PLACEMENT_FOOTER_VALUE = 1;
    public static final int BUTTON_PLACEMENT_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47486b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47488a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$a */
    public class a implements Internal.EnumLiteMap<EnumC4382p> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4382p.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47489a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4382p.forNumber(i11) != null;
        }
    }

    EnumC4382p(int i11) {
        this.f47488a = i11;
    }

    public static EnumC4382p forNumber(int i11) {
        if (i11 == 0) {
            return BUTTON_PLACEMENT_UNKNOWN;
        }
        if (i11 == 1) {
            return BUTTON_PLACEMENT_FOOTER;
        }
        if (i11 != 2) {
            return null;
        }
        return BUTTON_PLACEMENT_CONTENT_END;
    }

    public static Internal.EnumLiteMap<EnumC4382p> internalGetValueMap() {
        return f47486b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47489a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47488a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4382p valueOf(int i11) {
        return forNumber(i11);
    }
}
