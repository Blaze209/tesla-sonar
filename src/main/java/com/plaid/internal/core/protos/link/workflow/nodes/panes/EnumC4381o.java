package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4381o implements Internal.EnumLite {
    BANNER_TYPE_DEFAULT(0),
    BANNER_TYPE_NEUTRAL(1),
    BANNER_TYPE_POSITIVE(2),
    BANNER_TYPE_WARNING(3),
    BANNER_TYPE_NEGATIVE(4),
    BANNER_TYPE_INFO(5),
    BANNER_TYPE_PROMINENT(6),
    UNRECOGNIZED(-1);

    public static final int BANNER_TYPE_DEFAULT_VALUE = 0;
    public static final int BANNER_TYPE_INFO_VALUE = 5;
    public static final int BANNER_TYPE_NEGATIVE_VALUE = 4;
    public static final int BANNER_TYPE_NEUTRAL_VALUE = 1;
    public static final int BANNER_TYPE_POSITIVE_VALUE = 2;
    public static final int BANNER_TYPE_PROMINENT_VALUE = 6;
    public static final int BANNER_TYPE_WARNING_VALUE = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47482b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47484a;

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$a */
    public class a implements Internal.EnumLiteMap<EnumC4381o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return EnumC4381o.forNumber(i11);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$b */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47485a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return EnumC4381o.forNumber(i11) != null;
        }
    }

    EnumC4381o(int i11) {
        this.f47484a = i11;
    }

    public static EnumC4381o forNumber(int i11) {
        switch (i11) {
            case 0:
                return BANNER_TYPE_DEFAULT;
            case 1:
                return BANNER_TYPE_NEUTRAL;
            case 2:
                return BANNER_TYPE_POSITIVE;
            case 3:
                return BANNER_TYPE_WARNING;
            case 4:
                return BANNER_TYPE_NEGATIVE;
            case 5:
                return BANNER_TYPE_INFO;
            case 6:
                return BANNER_TYPE_PROMINENT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC4381o> internalGetValueMap() {
        return f47482b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f47485a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47484a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4381o valueOf(int i11) {
        return forNumber(i11);
    }
}
