package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4383q implements Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47490b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47492a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$a */
    public class a implements Internal.EnumLiteMap<EnumC4383q> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4383q.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47493a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4383q.forNumber(i11) != null;
        }
    }

    EnumC4383q(int i11) {
        this.f47492a = i11;
    }

    public static EnumC4383q forNumber(int i11) {
        if (i11 == 0) {
            return BUTTON_WEIGHT_UNKNOWN;
        }
        if (i11 == 1) {
            return BUTTON_WEIGHT_PRIMARY;
        }
        if (i11 == 2) {
            return BUTTON_WEIGHT_SECONDARY;
        }
        if (i11 != 3) {
            return null;
        }
        return BUTTON_WEIGHT_TERTIARY;
    }

    public static Internal.EnumLiteMap<EnumC4383q> internalGetValueMap() {
        return f47490b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47493a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47492a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4383q valueOf(int i11) {
        return forNumber(i11);
    }
}
