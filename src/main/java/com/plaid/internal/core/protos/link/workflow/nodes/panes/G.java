package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum G implements Internal.EnumLite {
    UI_EXPERIENCE_DEFAULT(0),
    UI_EXPERIENCE_SPINNER_ONLY(1),
    UNRECOGNIZED(-1);

    public static final int UI_EXPERIENCE_DEFAULT_VALUE = 0;
    public static final int UI_EXPERIENCE_SPINNER_ONLY_VALUE = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47283b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47285a;

    public class a implements Internal.EnumLiteMap<G> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return G.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47286a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return G.forNumber(i11) != null;
        }
    }

    G(int i11) {
        this.f47285a = i11;
    }

    public static G forNumber(int i11) {
        if (i11 == 0) {
            return UI_EXPERIENCE_DEFAULT;
        }
        if (i11 != 1) {
            return null;
        }
        return UI_EXPERIENCE_SPINNER_ONLY;
    }

    public static Internal.EnumLiteMap<G> internalGetValueMap() {
        return f47283b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47286a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47285a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static G valueOf(int i11) {
        return forNumber(i11);
    }
}
