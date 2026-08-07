package jg0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ig0.y2;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f83716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f83717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f83718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f83719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f83720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f83721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f83722g;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f83716a = constraintLayout;
        this.f83717b = materialCardView;
        this.f83718c = textView;
        this.f83719d = imageView;
        this.f83720e = linearLayout;
        this.f83721f = circularProgressIndicator;
        this.f83722g = themeableLottieAnimationView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = y2.f78048e;
        MaterialCardView materialCardView = (MaterialCardView) gb.b.a(view, i11);
        if (materialCardView != null) {
            i11 = y2.f78051h;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = y2.f78052i;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null) {
                    i11 = y2.f78053j;
                    LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                    if (linearLayout != null) {
                        i11 = y2.f78055l;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
                        if (circularProgressIndicator != null) {
                            i11 = y2.f78058o;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                            if (themeableLottieAnimationView != null) {
                                return new d((ConstraintLayout) view, materialCardView, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83716a;
    }
}
