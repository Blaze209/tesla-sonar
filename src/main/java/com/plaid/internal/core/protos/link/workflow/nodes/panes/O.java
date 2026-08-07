package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum O implements Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);

    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47311b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47313a;

    public class a implements Internal.EnumLiteMap<O> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return O.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47314a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return O.forNumber(i11) != null;
        }
    }

    O(int i11) {
        this.f47313a = i11;
    }

    public static O forNumber(int i11) {
        if (i11 == 0) {
            return SELECTION_LIST_BEHAVIOR_UNKNOWN;
        }
        if (i11 == 1) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        if (i11 == 2) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
        }
        if (i11 == 3) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
        }
        if (i11 == 4) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
        }
        if (i11 != 5) {
            return null;
        }
        return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
    }

    public static Internal.EnumLiteMap<O> internalGetValueMap() {
        return f47311b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47314a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47313a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static O valueOf(int i11) {
        return forNumber(i11);
    }
}
