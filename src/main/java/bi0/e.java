package bi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ThemeableLottieAnimationView f17430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f17431b;

    private e(@NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView2) {
        this.f17430a = themeableLottieAnimationView;
        this.f17431b = themeableLottieAnimationView2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
        return new e(themeableLottieAnimationView, themeableLottieAnimationView);
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n.f125552e, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ThemeableLottieAnimationView getRoot() {
        return this.f17430a;
    }
}
