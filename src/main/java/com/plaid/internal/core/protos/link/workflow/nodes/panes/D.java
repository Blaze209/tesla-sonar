package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum D implements Internal.EnumLite {
    NOTE_SIZE_32(0),
    NOTE_SIZE_24(1),
    NOTE_SIZE_20(2),
    UNRECOGNIZED(-1);

    public static final int NOTE_SIZE_20_VALUE = 2;
    public static final int NOTE_SIZE_24_VALUE = 1;
    public static final int NOTE_SIZE_32_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47254b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47256a;

    public class a implements Internal.EnumLiteMap<D> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return D.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47257a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return D.forNumber(i11) != null;
        }
    }

    D(int i11) {
        this.f47256a = i11;
    }

    public static D forNumber(int i11) {
        if (i11 == 0) {
            return NOTE_SIZE_32;
        }
        if (i11 == 1) {
            return NOTE_SIZE_24;
        }
        if (i11 != 2) {
            return null;
        }
        return NOTE_SIZE_20;
    }

    public static Internal.EnumLiteMap<D> internalGetValueMap() {
        return f47254b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47257a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47256a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static D valueOf(int i11) {
        return forNumber(i11);
    }
}
