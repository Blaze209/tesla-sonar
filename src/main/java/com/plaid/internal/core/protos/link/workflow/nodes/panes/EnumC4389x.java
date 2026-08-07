package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4389x implements Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);

    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47517b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47519a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$a */
    public class a implements Internal.EnumLiteMap<EnumC4389x> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4389x.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47520a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4389x.forNumber(i11) != null;
        }
    }

    EnumC4389x(int i11) {
        this.f47519a = i11;
    }

    public static EnumC4389x forNumber(int i11) {
        if (i11 == 0) {
            return GRID_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i11 != 1) {
            return null;
        }
        return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    public static Internal.EnumLiteMap<EnumC4389x> internalGetValueMap() {
        return f47517b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47520a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47519a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4389x valueOf(int i11) {
        return forNumber(i11);
    }
}
