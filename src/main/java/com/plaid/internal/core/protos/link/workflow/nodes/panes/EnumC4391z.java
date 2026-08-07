package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4391z implements Internal.EnumLite {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_BUTTON_NAVIGATION(1),
    HAPTIC_TYPE_BUTTON_INPUT(2),
    HAPTIC_TYPE_BUTTON_ACTION(3),
    HAPTIC_TYPE_EVENT_SUCCESS(4),
    HAPTIC_TYPE_EVENT_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int HAPTIC_TYPE_BUTTON_ACTION_VALUE = 3;
    public static final int HAPTIC_TYPE_BUTTON_INPUT_VALUE = 2;
    public static final int HAPTIC_TYPE_BUTTON_NAVIGATION_VALUE = 1;
    public static final int HAPTIC_TYPE_EVENT_ERROR_VALUE = 5;
    public static final int HAPTIC_TYPE_EVENT_SUCCESS_VALUE = 4;
    public static final int HAPTIC_TYPE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47523b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47525a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$a */
    public class a implements Internal.EnumLiteMap<EnumC4391z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4391z.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47526a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4391z.forNumber(i11) != null;
        }
    }

    EnumC4391z(int i11) {
        this.f47525a = i11;
    }

    public static EnumC4391z forNumber(int i11) {
        if (i11 == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i11 == 1) {
            return HAPTIC_TYPE_BUTTON_NAVIGATION;
        }
        if (i11 == 2) {
            return HAPTIC_TYPE_BUTTON_INPUT;
        }
        if (i11 == 3) {
            return HAPTIC_TYPE_BUTTON_ACTION;
        }
        if (i11 == 4) {
            return HAPTIC_TYPE_EVENT_SUCCESS;
        }
        if (i11 != 5) {
            return null;
        }
        return HAPTIC_TYPE_EVENT_ERROR;
    }

    public static Internal.EnumLiteMap<EnumC4391z> internalGetValueMap() {
        return f47523b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47526a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47525a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4391z valueOf(int i11) {
        return forNumber(i11);
    }
}
