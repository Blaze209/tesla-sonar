package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0004J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e¨\u0006 "}, d2 = {"Lcom/reactnativepagerview/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/reactnativepagerview/j;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;I)Lcom/reactnativepagerview/j;", "holder", "index", "Ljn0/h0;", "c", "(Lcom/reactnativepagerview/j;I)V", "getItemCount", "()I", "Landroid/view/View;", "child", "a", "(Landroid/view/View;I)V", "b", "(I)Landroid/view/View;", "f", "(Landroid/view/View;)V", "e", "g", "(I)V", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "childrenViews", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends RecyclerView.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<View> childrenViews = new ArrayList<>();

    public final void a(View child, int index) {
        s.k(child, "child");
        this.childrenViews.add(index, child);
        notifyItemInserted(index);
    }

    public final View b(int index) {
        View view = this.childrenViews.get(index);
        s.j(view, "get(...)");
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int index) {
        s.k(holder, "holder");
        FrameLayout frameLayoutA = holder.a();
        View viewB = b(index);
        if (frameLayoutA.getChildCount() > 0) {
            frameLayoutA.removeAllViews();
        }
        if (viewB.getParent() != null) {
            ViewParent parent = viewB.getParent();
            s.i(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(viewB);
        }
        frameLayoutA.addView(viewB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int viewType) {
        s.k(parent, "parent");
        return j.INSTANCE.a(parent);
    }

    public final void e() {
        int size = this.childrenViews.size();
        int i11 = 1;
        if (1 <= size) {
            while (true) {
                View view = this.childrenViews.get(i11 - 1);
                s.j(view, "get(...)");
                View view2 = view;
                ViewParent parent = view2.getParent();
                if ((parent != null ? parent.getParent() : null) != null) {
                    ViewParent parent2 = view2.getParent().getParent();
                    s.i(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    Object parent3 = view2.getParent();
                    s.i(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i11 == size) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        int size2 = this.childrenViews.size();
        this.childrenViews.clear();
        notifyItemRangeRemoved(0, size2);
    }

    public final void f(View child) {
        s.k(child, "child");
        int iIndexOf = this.childrenViews.indexOf(child);
        if (iIndexOf > -1) {
            g(iIndexOf);
        }
    }

    public final void g(int index) {
        if (index < 0 || index >= this.childrenViews.size()) {
            return;
        }
        this.childrenViews.remove(index);
        notifyItemRemoved(index);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.childrenViews.size();
    }
}
