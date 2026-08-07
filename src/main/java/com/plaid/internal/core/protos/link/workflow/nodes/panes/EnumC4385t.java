package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4385t implements Internal.EnumLite {
    DISCLAIMER_TEXT_PLACEMENT_UNKNOWN(0),
    DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS(1),
    DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS(2),
    UNRECOGNIZED(-1);

    public static final int DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS_VALUE = 1;
    public static final int DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS_VALUE = 2;
    public static final int DISCLAIMER_TEXT_PLACEMENT_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47501b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47503a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$a */
    public class a implements Internal.EnumLiteMap<EnumC4385t> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4385t.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47504a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4385t.forNumber(i11) != null;
        }
    }

    EnumC4385t(int i11) {
        this.f47503a = i11;
    }

    public static EnumC4385t forNumber(int i11) {
        if (i11 == 0) {
            return DISCLAIMER_TEXT_PLACEMENT_UNKNOWN;
        }
        if (i11 == 1) {
            return DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS;
        }
        if (i11 != 2) {
            return null;
        }
        return DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS;
    }

    public static Internal.EnumLiteMap<EnumC4385t> internalGetValueMap() {
        return f47501b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47504a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47503a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4385t valueOf(int i11) {
        return forNumber(i11);
    }
}
