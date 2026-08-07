package jg0;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ig0.y2;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f83703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f83704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f83705c;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.f83703a = constraintLayout;
        this.f83704b = themeableLottieAnimationView;
        this.f83705c = materialCardView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = y2.f78044a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
        if (themeableLottieAnimationView != null) {
            i11 = y2.f78048e;
            MaterialCardView materialCardView = (MaterialCardView) gb.b.a(view, i11);
            if (materialCardView != null) {
                return new b((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83703a;
    }
}
