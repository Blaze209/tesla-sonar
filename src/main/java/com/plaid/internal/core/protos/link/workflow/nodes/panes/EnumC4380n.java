package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4380n implements Internal.EnumLite {
    BANNER_APPEARANCE_NEUTRAL(0),
    BANNER_APPEARANCE_ROUNDED(1),
    UNRECOGNIZED(-1);

    public static final int BANNER_APPEARANCE_NEUTRAL_VALUE = 0;
    public static final int BANNER_APPEARANCE_ROUNDED_VALUE = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47474b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47476a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$a */
    public class a implements Internal.EnumLiteMap<EnumC4380n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4380n.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47477a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4380n.forNumber(i11) != null;
        }
    }

    EnumC4380n(int i11) {
        this.f47476a = i11;
    }

    public static EnumC4380n forNumber(int i11) {
        if (i11 == 0) {
            return BANNER_APPEARANCE_NEUTRAL;
        }
        if (i11 != 1) {
            return null;
        }
        return BANNER_APPEARANCE_ROUNDED;
    }

    public static Internal.EnumLiteMap<EnumC4380n> internalGetValueMap() {
        return f47474b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47477a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47476a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4380n valueOf(int i11) {
        return forNumber(i11);
    }
}
