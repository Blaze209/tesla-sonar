package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum N implements Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);

    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47307b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47309a;

    public class a implements Internal.EnumLiteMap<N> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return N.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47310a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return N.forNumber(i11) != null;
        }
    }

    N(int i11) {
        this.f47309a = i11;
    }

    public static N forNumber(int i11) {
        if (i11 == 0) {
            return SEARCH_BEHAVIOR_UNKNOWN;
        }
        if (i11 == 1) {
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        if (i11 == 2) {
            return SEARCH_BEHAVIOR_PANE_SEARCH_API;
        }
        if (i11 != 3) {
            return null;
        }
        return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
    }

    public static Internal.EnumLiteMap<N> internalGetValueMap() {
        return f47307b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47310a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47309a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static N valueOf(int i11) {
        return forNumber(i11);
    }
}
