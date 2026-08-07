package bi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import yh0.m;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f17420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f17422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f17424e;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar) {
        this.f17420a = constraintLayout;
        this.f17421b = frameLayout;
        this.f17422c = nestedScrollView;
        this.f17423d = frameLayout2;
        this.f17424e = pi2NavigationBar;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = m.f125536b;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = m.f125537c;
            NestedScrollView nestedScrollView = (NestedScrollView) gb.b.a(view, i11);
            if (nestedScrollView != null) {
                i11 = m.f125538d;
                FrameLayout frameLayout2 = (FrameLayout) gb.b.a(view, i11);
                if (frameLayout2 != null) {
                    i11 = m.f125541g;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                    if (pi2NavigationBar != null) {
                        return new b((ConstraintLayout) view, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n.f125549b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f17420a;
    }
}
