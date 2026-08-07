package com.th3rdwave.safeareacontext;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.th3rdwave.safeareacontext.n, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/th3rdwave/safeareacontext/n;", "", "Lcom/th3rdwave/safeareacontext/a;", "insets", "Lcom/th3rdwave/safeareacontext/o;", "mode", "Lcom/th3rdwave/safeareacontext/m;", "edges", "<init>", "(Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/o;Lcom/th3rdwave/safeareacontext/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/th3rdwave/safeareacontext/a;", "b", "()Lcom/th3rdwave/safeareacontext/a;", "Lcom/th3rdwave/safeareacontext/o;", "c", "()Lcom/th3rdwave/safeareacontext/o;", "Lcom/th3rdwave/safeareacontext/m;", "()Lcom/th3rdwave/safeareacontext/m;", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SafeAreaViewLocalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdgeInsets insets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o mode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SafeAreaViewEdges edges;

    public SafeAreaViewLocalData(EdgeInsets insets, o mode, SafeAreaViewEdges edges) {
        s.k(insets, "insets");
        s.k(mode, "mode");
        s.k(edges, "edges");
        this.insets = insets;
        this.mode = mode;
        this.edges = edges;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EdgeInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getMode() {
        return this.mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaViewLocalData)) {
            return false;
        }
        SafeAreaViewLocalData safeAreaViewLocalData = (SafeAreaViewLocalData) other;
        return s.f(this.insets, safeAreaViewLocalData.insets) && this.mode == safeAreaViewLocalData.mode && s.f(this.edges, safeAreaViewLocalData.edges);
    }

    public int hashCode() {
        return (((this.insets.hashCode() * 31) + this.mode.hashCode()) * 31) + this.edges.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.insets + ", mode=" + this.mode + ", edges=" + this.edges + ")";
    }
}
