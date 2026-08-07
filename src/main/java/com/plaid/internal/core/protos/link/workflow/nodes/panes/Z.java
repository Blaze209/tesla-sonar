package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum Z implements Internal.EnumLite {
    WEBVIEW_FALLBACK_BACKGROUND_DEFAULT(0),
    WEBVIEW_FALLBACK_BACKGROUND_LIGHT(1),
    WEBVIEW_FALLBACK_BACKGROUND_DARK(2),
    WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT(3),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_BACKGROUND_DARK_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_DEFAULT_VALUE = 0;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_LIGHT_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT_VALUE = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47437b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47439a;

    public class a implements Internal.EnumLiteMap<Z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return Z.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47440a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return Z.forNumber(i11) != null;
        }
    }

    Z(int i11) {
        this.f47439a = i11;
    }

    public static Z forNumber(int i11) {
        if (i11 == 0) {
            return WEBVIEW_FALLBACK_BACKGROUND_DEFAULT;
        }
        if (i11 == 1) {
            return WEBVIEW_FALLBACK_BACKGROUND_LIGHT;
        }
        if (i11 == 2) {
            return WEBVIEW_FALLBACK_BACKGROUND_DARK;
        }
        if (i11 != 3) {
            return null;
        }
        return WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT;
    }

    public static Internal.EnumLiteMap<Z> internalGetValueMap() {
        return f47437b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47440a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47439a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Z valueOf(int i11) {
        return forNumber(i11);
    }
}
