package ca0;

import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ca0.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n¨\u0006 "}, d2 = {"Lca0/a;", "", "", "left", "top", "right", "bottom", "<init>", "(ZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Lca0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getLeft", "getTop", "getRight", "getBottom", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SafeAreaViewEdges {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SafeAreaViewEdges ZERO = new SafeAreaViewEdges(false, false, false, false);
    private final boolean bottom;
    private final boolean left;
    private final boolean right;
    private final boolean top;

    /* JADX INFO: renamed from: ca0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lca0/a$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lca0/a;", "fromProp", "(Lcom/facebook/react/bridge/ReadableMap;)Lca0/a;", "ZERO", "Lca0/a;", "getZERO", "()Lca0/a;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SafeAreaViewEdges fromProp(ReadableMap map) {
            if (map != null) {
                return new SafeAreaViewEdges(map.getBoolean("left"), map.getBoolean("top"), map.getBoolean("right"), map.getBoolean("bottom"));
            }
            return null;
        }

        public final SafeAreaViewEdges getZERO() {
            return SafeAreaViewEdges.ZERO;
        }

        private Companion() {
        }
    }

    public SafeAreaViewEdges(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.left = z11;
        this.top = z12;
        this.right = z13;
        this.bottom = z14;
    }

    public static /* synthetic */ SafeAreaViewEdges copy$default(SafeAreaViewEdges safeAreaViewEdges, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = safeAreaViewEdges.left;
        }
        if ((i11 & 2) != 0) {
            z12 = safeAreaViewEdges.top;
        }
        if ((i11 & 4) != 0) {
            z13 = safeAreaViewEdges.right;
        }
        if ((i11 & 8) != 0) {
            z14 = safeAreaViewEdges.bottom;
        }
        return safeAreaViewEdges.copy(z11, z12, z13, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBottom() {
        return this.bottom;
    }

    public final SafeAreaViewEdges copy(boolean left, boolean top, boolean right, boolean bottom) {
        return new SafeAreaViewEdges(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaViewEdges)) {
            return false;
        }
        SafeAreaViewEdges safeAreaViewEdges = (SafeAreaViewEdges) other;
        return this.left == safeAreaViewEdges.left && this.top == safeAreaViewEdges.top && this.right == safeAreaViewEdges.right && this.bottom == safeAreaViewEdges.bottom;
    }

    public final boolean getBottom() {
        return this.bottom;
    }

    public final boolean getLeft() {
        return this.left;
    }

    public final boolean getRight() {
        return this.right;
    }

    public final boolean getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.left) * 31) + Boolean.hashCode(this.top)) * 31) + Boolean.hashCode(this.right)) * 31) + Boolean.hashCode(this.bottom);
    }

    public String toString() {
        return "SafeAreaViewEdges(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }
}
