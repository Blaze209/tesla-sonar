package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum n0 implements Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);

    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47478b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47480a;

    public class a implements Internal.EnumLiteMap<n0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return n0.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47481a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return n0.forNumber(i11) != null;
        }
    }

    n0(int i11) {
        this.f47480a = i11;
    }

    public static n0 forNumber(int i11) {
        if (i11 == 0) {
            return BACK_STACK_BEHAVIOR_UNKNOWN;
        }
        if (i11 == 1) {
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        if (i11 != 2) {
            return null;
        }
        return BACK_STACK_BEHAVIOR_TRANSIENT;
    }

    public static Internal.EnumLiteMap<n0> internalGetValueMap() {
        return f47478b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47481a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47480a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n0 valueOf(int i11) {
        return forNumber(i11);
    }
}
