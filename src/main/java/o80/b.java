package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f96846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f96847b;

    private b(@NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView) {
        this.f96846a = frameLayout;
        this.f96847b = fragmentContainerView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = n80.d.f93649r;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) gb.b.a(view, i11);
        if (fragmentContainerView != null) {
            return new b((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93659b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f96846a;
    }
}
