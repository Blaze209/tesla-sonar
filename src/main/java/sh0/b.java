package sh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.ui.WorkflowViewStub;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f111165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WorkflowViewStub f111166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f111167c;

    private b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WorkflowViewStub workflowViewStub, @NonNull FloatingActionButton floatingActionButton) {
        this.f111165a = coordinatorLayout;
        this.f111166b = workflowViewStub;
        this.f111167c = floatingActionButton;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = rh0.a.f108252a;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) gb.b.a(view, i11);
        if (workflowViewStub != null) {
            i11 = rh0.a.f108253b;
            FloatingActionButton floatingActionButton = (FloatingActionButton) gb.b.a(view, i11);
            if (floatingActionButton != null) {
                return new b((CoordinatorLayout) view, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(rh0.b.f108257b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f111165a;
    }
}
