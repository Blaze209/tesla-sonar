package p013kotlin.reflect.jvm.internal.impl.descriptors;

import on0.a;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Modality convertFromFlags(boolean z11, boolean z12, boolean z13) {
            if (z11) {
                return Modality.SEALED;
            }
            if (z12) {
                return Modality.ABSTRACT;
            }
            return z13 ? Modality.OPEN : Modality.FINAL;
        }

        private Companion() {
        }
    }
}
