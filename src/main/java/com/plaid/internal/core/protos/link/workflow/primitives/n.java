package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum n implements Internal.EnumLite {
    IOS_SDK_POPUP_BEHAVIOR_UNKNOWN(0),
    IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_SDK_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47586b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47588a;

    public class a implements Internal.EnumLiteMap<n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return n.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47589a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return n.forNumber(i11) != null;
        }
    }

    n(int i11) {
        this.f47588a = i11;
    }

    public static n forNumber(int i11) {
        if (i11 == 0) {
            return IOS_SDK_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i11 == 1) {
            return IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i11 == 2) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i11 == 3) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i11 == 4) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i11 != 5) {
            return null;
        }
        return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<n> internalGetValueMap() {
        return f47586b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47589a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47588a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n valueOf(int i11) {
        return forNumber(i11);
    }
}
