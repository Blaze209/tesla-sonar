package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum b0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47447b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47449a;

    public class a implements Internal.EnumLiteMap<b0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return b0.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47450a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return b0.forNumber(i11) != null;
        }
    }

    b0(int i11) {
        this.f47449a = i11;
    }

    public static b0 forNumber(int i11) {
        if (i11 == 0) {
            return WEBVIEW_FALLBACK_MODE_UNKNOWN;
        }
        if (i11 == 1) {
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        if (i11 != 2) {
            return null;
        }
        return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
    }

    public static Internal.EnumLiteMap<b0> internalGetValueMap() {
        return f47447b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47450a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47449a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static b0 valueOf(int i11) {
        return forNumber(i11);
    }
}
