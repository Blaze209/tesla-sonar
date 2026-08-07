package com.th3rdwave.safeareacontext;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.th3rdwave.safeareacontext.m, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/th3rdwave/safeareacontext/m;", "", "Lcom/th3rdwave/safeareacontext/l;", "top", "right", "bottom", "left", "<init>", "(Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/th3rdwave/safeareacontext/l;", DateTokenConverter.CONVERTER_KEY, "()Lcom/th3rdwave/safeareacontext/l;", "b", "c", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SafeAreaViewEdges {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l top;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l right;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l bottom;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l left;

    public SafeAreaViewEdges(l top, l right, l bottom, l left) {
        s.k(top, "top");
        s.k(right, "right");
        s.k(bottom, "bottom");
        s.k(left, "left");
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getTop() {
        return this.top;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaViewEdges)) {
            return false;
        }
        SafeAreaViewEdges safeAreaViewEdges = (SafeAreaViewEdges) other;
        return this.top == safeAreaViewEdges.top && this.right == safeAreaViewEdges.right && this.bottom == safeAreaViewEdges.bottom && this.left == safeAreaViewEdges.left;
    }

    public int hashCode() {
        return (((((this.top.hashCode() * 31) + this.right.hashCode()) * 31) + this.bottom.hashCode()) * 31) + this.left.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + ")";
    }
}
