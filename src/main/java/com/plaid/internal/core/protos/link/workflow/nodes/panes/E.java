package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum E implements Internal.EnumLite {
    NOTE_TYPE_DEFAULT(0),
    NOTE_TYPE_INFO(1),
    NOTE_TYPE_WARNING(2),
    NOTE_TYPE_ERROR(3),
    NOTE_TYPE_SUCCESS(4),
    NOTE_TYPE_PROMINENT(5),
    UNRECOGNIZED(-1);

    public static final int NOTE_TYPE_DEFAULT_VALUE = 0;
    public static final int NOTE_TYPE_ERROR_VALUE = 3;
    public static final int NOTE_TYPE_INFO_VALUE = 1;
    public static final int NOTE_TYPE_PROMINENT_VALUE = 5;
    public static final int NOTE_TYPE_SUCCESS_VALUE = 4;
    public static final int NOTE_TYPE_WARNING_VALUE = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47258b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47260a;

    public class a implements Internal.EnumLiteMap<E> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return E.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47261a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return E.forNumber(i11) != null;
        }
    }

    E(int i11) {
        this.f47260a = i11;
    }

    public static E forNumber(int i11) {
        if (i11 == 0) {
            return NOTE_TYPE_DEFAULT;
        }
        if (i11 == 1) {
            return NOTE_TYPE_INFO;
        }
        if (i11 == 2) {
            return NOTE_TYPE_WARNING;
        }
        if (i11 == 3) {
            return NOTE_TYPE_ERROR;
        }
        if (i11 == 4) {
            return NOTE_TYPE_SUCCESS;
        }
        if (i11 != 5) {
            return null;
        }
        return NOTE_TYPE_PROMINENT;
    }

    public static Internal.EnumLiteMap<E> internalGetValueMap() {
        return f47258b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47261a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47260a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static E valueOf(int i11) {
        return forNumber(i11);
    }
}
