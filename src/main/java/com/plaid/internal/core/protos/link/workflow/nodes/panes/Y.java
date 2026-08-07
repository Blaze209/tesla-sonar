package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum Y implements Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);

    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47433b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47435a;

    public class a implements Internal.EnumLiteMap<Y> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return Y.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47436a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return Y.forNumber(i11) != null;
        }
    }

    Y(int i11) {
        this.f47435a = i11;
    }

    public static Y forNumber(int i11) {
        if (i11 == 0) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
        }
        if (i11 == 1) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        if (i11 != 2) {
            return null;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
    }

    public static Internal.EnumLiteMap<Y> internalGetValueMap() {
        return f47433b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47436a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47435a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Y valueOf(int i11) {
        return forNumber(i11);
    }
}
