package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4387v implements Internal.EnumLite {
    NONE(0),
    BUTTON_ONE_TAP(1),
    BUTTON_TWO_TAP(2),
    BUTTON_THREE_TAP(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_ONE_TAP_VALUE = 1;
    public static final int BUTTON_THREE_TAP_VALUE = 3;
    public static final int BUTTON_TWO_TAP_VALUE = 2;
    public static final int NONE_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47511b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47513a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$a */
    public class a implements Internal.EnumLiteMap<EnumC4387v> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4387v.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47514a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4387v.forNumber(i11) != null;
        }
    }

    EnumC4387v(int i11) {
        this.f47513a = i11;
    }

    public static EnumC4387v forNumber(int i11) {
        if (i11 == 0) {
            return NONE;
        }
        if (i11 == 1) {
            return BUTTON_ONE_TAP;
        }
        if (i11 == 2) {
            return BUTTON_TWO_TAP;
        }
        if (i11 != 3) {
            return null;
        }
        return BUTTON_THREE_TAP;
    }

    public static Internal.EnumLiteMap<EnumC4387v> internalGetValueMap() {
        return f47511b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47514a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47513a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4387v valueOf(int i11) {
        return forNumber(i11);
    }
}
