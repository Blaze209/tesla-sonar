package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4379m implements Internal.EnumLite {
    BACKGROUND_DISPLAY_MODE_UNKNOWN(0),
    BACKGROUND_DISPLAY_MODE_SHIMMER(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_DISPLAY_MODE_SHIMMER_VALUE = 1;
    public static final int BACKGROUND_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47469b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47471a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$a */
    public class a implements Internal.EnumLiteMap<EnumC4379m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4379m.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47472a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4379m.forNumber(i11) != null;
        }
    }

    EnumC4379m(int i11) {
        this.f47471a = i11;
    }

    public static EnumC4379m forNumber(int i11) {
        if (i11 == 0) {
            return BACKGROUND_DISPLAY_MODE_UNKNOWN;
        }
        if (i11 != 1) {
            return null;
        }
        return BACKGROUND_DISPLAY_MODE_SHIMMER;
    }

    public static Internal.EnumLiteMap<EnumC4379m> internalGetValueMap() {
        return f47469b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47472a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47471a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4379m valueOf(int i11) {
        return forNumber(i11);
    }
}
