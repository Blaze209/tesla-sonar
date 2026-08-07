package ca0;

import com.swmansion.rnscreens.safearea.EdgeInsets;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ca0.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lca0/b;", "", "Lcom/swmansion/rnscreens/safearea/a;", "insets", "Lca0/a;", "edges", "<init>", "(Lcom/swmansion/rnscreens/safearea/a;Lca0/a;)V", "component1", "()Lcom/swmansion/rnscreens/safearea/a;", "component2", "()Lca0/a;", "copy", "(Lcom/swmansion/rnscreens/safearea/a;Lca0/a;)Lca0/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/swmansion/rnscreens/safearea/a;", "getInsets", "Lca0/a;", "getEdges", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SafeAreaViewLocalData {
    private final SafeAreaViewEdges edges;
    private final EdgeInsets insets;

    public SafeAreaViewLocalData(EdgeInsets insets, SafeAreaViewEdges edges) {
        s.k(insets, "insets");
        s.k(edges, "edges");
        this.insets = insets;
        this.edges = edges;
    }

    public static /* synthetic */ SafeAreaViewLocalData copy$default(SafeAreaViewLocalData safeAreaViewLocalData, EdgeInsets edgeInsets, SafeAreaViewEdges safeAreaViewEdges, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            edgeInsets = safeAreaViewLocalData.insets;
        }
        if ((i11 & 2) != 0) {
            safeAreaViewEdges = safeAreaViewLocalData.edges;
        }
        return safeAreaViewLocalData.copy(edgeInsets, safeAreaViewEdges);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EdgeInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    public final SafeAreaViewLocalData copy(EdgeInsets insets, SafeAreaViewEdges edges) {
        s.k(insets, "insets");
        s.k(edges, "edges");
        return new SafeAreaViewLocalData(insets, edges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaViewLocalData)) {
            return false;
        }
        SafeAreaViewLocalData safeAreaViewLocalData = (SafeAreaViewLocalData) other;
        return s.f(this.insets, safeAreaViewLocalData.insets) && s.f(this.edges, safeAreaViewLocalData.edges);
    }

    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    public final EdgeInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.edges.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.insets + ", edges=" + this.edges + ")";
    }
}
