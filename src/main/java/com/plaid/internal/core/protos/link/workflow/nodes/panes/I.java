package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum I implements Internal.EnumLite {
    PANE_BRANDING_UNKNOWN(0),
    PANE_BRANDING_DEFAULT(1),
    PANE_BRANDING_PLAID_AS_FIRST_PARTY(2),
    UNRECOGNIZED(-1);

    public static final int PANE_BRANDING_DEFAULT_VALUE = 1;
    public static final int PANE_BRANDING_PLAID_AS_FIRST_PARTY_VALUE = 2;
    public static final int PANE_BRANDING_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47291b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47293a;

    public class a implements Internal.EnumLiteMap<I> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return I.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47294a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return I.forNumber(i11) != null;
        }
    }

    I(int i11) {
        this.f47293a = i11;
    }

    public static I forNumber(int i11) {
        if (i11 == 0) {
            return PANE_BRANDING_UNKNOWN;
        }
        if (i11 == 1) {
            return PANE_BRANDING_DEFAULT;
        }
        if (i11 != 2) {
            return null;
        }
        return PANE_BRANDING_PLAID_AS_FIRST_PARTY;
    }

    public static Internal.EnumLiteMap<I> internalGetValueMap() {
        return f47291b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47294a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47293a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static I valueOf(int i11) {
        return forNumber(i11);
    }
}
