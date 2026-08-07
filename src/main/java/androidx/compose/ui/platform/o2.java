package androidx.compose.ui.platform;

import android.graphics.Rect;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/o2;", "", "Lg4/p;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Lg4/p;Landroid/graphics/Rect;)V", "a", "Lg4/p;", "b", "()Lg4/p;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g4.p semanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rect adjustedBounds;

    public o2(g4.p pVar, Rect rect) {
        this.semanticsNode = pVar;
        this.adjustedBounds = rect;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g4.p getSemanticsNode() {
        return this.semanticsNode;
    }
}
