package com.swmansion.rnscreens;

import com.facebook.react.fabric.FabricUIManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/o;", "", "<init>", "()V", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Ljn0/h0;", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "cleanupExpiredMountingCoordinators", "invalidateNative", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.swmansion.rnscreens.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/o$a;", "", "<init>", "()V", "", "tag", "Lcom/swmansion/rnscreens/t;", "view", "Ljn0/h0;", "addScreenToMap", "(ILcom/swmansion/rnscreens/t;)V", "removeScreenFromMap", "(I)V", "clearMapOnInvalidate", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addScreenToMap(int tag, t view) {
            p013kotlin.jvm.internal.s.k(view, "view");
        }

        public final void clearMapOnInvalidate() {
        }

        public final void removeScreenFromMap(int tag) {
        }

        private Companion() {
        }
    }

    public final void cleanupExpiredMountingCoordinators() {
    }

    public final void invalidateNative() {
    }

    public final void nativeAddMutationsListener(FabricUIManager fabricUIManager) {
        p013kotlin.jvm.internal.s.k(fabricUIManager, "fabricUIManager");
    }
}
