package hz;

import android.view.View;
import android.view.ViewGroup;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/view/ViewGroup;", "Ljn0/h0;", "a", "(Landroid/view/ViewGroup;)V", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void a(ViewGroup viewGroup) {
        s.k(viewGroup, "<this>");
        viewGroup.setOnHierarchyChangeListener(new a(viewGroup));
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"hz/b$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "Ljn0/h0;", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewAdded", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f73719a;

        a(ViewGroup viewGroup) {
            this.f73719a = viewGroup;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            if (parent != null) {
                parent.measure(View.MeasureSpec.makeMeasureSpec(this.f73719a.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f73719a.getMeasuredHeight(), 1073741824));
            }
            if (parent != null) {
                parent.layout(0, 0, parent.getMeasuredWidth(), parent.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
        }
    }
}
