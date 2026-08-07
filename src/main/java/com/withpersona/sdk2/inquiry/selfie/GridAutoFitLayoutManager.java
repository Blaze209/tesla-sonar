package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "columnWidth", "<init>", "(Landroid/content/Context;I)V", "w3", "(Landroid/content/Context;I)I", "newColumnWidth", "Ljn0/h0;", "x3", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$x;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$c0;", "state", "d1", "(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$c0;)V", "V", "I", "", "W", "Z", "columnWidthChanged", "X", "lastTotalSpace", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GridAutoFitLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private int columnWidth;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private boolean columnWidthChanged;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private int lastTotalSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridAutoFitLayoutManager(Context context, int i11) {
        super(context, 1);
        s.k(context, "context");
        this.columnWidthChanged = true;
        x3(w3(context, i11));
    }

    private final int w3(Context context, int columnWidth) {
        return columnWidth <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : columnWidth;
    }

    private final void x3(int newColumnWidth) {
        if (newColumnWidth <= 0 || newColumnWidth == this.columnWidth) {
            return;
        }
        this.columnWidth = newColumnWidth;
        this.columnWidthChanged = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.x recycler, RecyclerView.c0 state) {
        int iC0;
        int iI0;
        s.k(state, "state");
        if (r2() == 1) {
            iC0 = t0() - k0();
            iI0 = j0();
        } else {
            iC0 = c0() - l0();
            iI0 = i0();
        }
        int i11 = iC0 - iI0;
        if ((this.columnWidthChanged && this.columnWidth > 0) || i11 != this.lastTotalSpace) {
            u3(n.f(1, i11 / this.columnWidth));
            this.columnWidthChanged = false;
            this.lastTotalSpace = i11;
        }
        super.d1(recycler, state);
    }
}
