package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum W implements Internal.EnumLite {
    URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION(0),
    URL_BEHAVIOR_PREFER_UNIVERSAL_LINK(1),
    UNRECOGNIZED(-1);

    public static final int URL_BEHAVIOR_PREFER_UNIVERSAL_LINK_VALUE = 1;
    public static final int URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION_VALUE = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47429b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47431a;

    public class a implements Internal.EnumLiteMap<W> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return W.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47432a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return W.forNumber(i11) != null;
        }
    }

    W(int i11) {
        this.f47431a = i11;
    }

    public static W forNumber(int i11) {
        if (i11 == 0) {
            return URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION;
        }
        if (i11 != 1) {
            return null;
        }
        return URL_BEHAVIOR_PREFER_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<W> internalGetValueMap() {
        return f47429b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47432a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47431a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static W valueOf(int i11) {
        return forNumber(i11);
    }
}
