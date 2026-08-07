package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f116220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f116221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Pi2CircleMaskView f116222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f116223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f116224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f116225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f116226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2ProgressArcView f116227h;

    private b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f116220a = view;
        this.f116221b = view2;
        this.f116222c = pi2CircleMaskView;
        this.f116223d = themeableLottieAnimationView;
        this.f116224e = imageView;
        this.f116225f = view3;
        this.f116226g = view4;
        this.f116227h = pi2ProgressArcView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = w0.f114278d;
        View viewA3 = gb.b.a(view, i11);
        if (viewA3 != null) {
            i11 = w0.f114285k;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) gb.b.a(view, i11);
            if (pi2CircleMaskView != null) {
                i11 = w0.f114292r;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                if (themeableLottieAnimationView != null) {
                    i11 = w0.f114293s;
                    ImageView imageView = (ImageView) gb.b.a(view, i11);
                    if (imageView != null && (viewA = gb.b.a(view, (i11 = w0.f114297w))) != null && (viewA2 = gb.b.a(view, (i11 = w0.f114299y))) != null) {
                        i11 = w0.L;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) gb.b.a(view, i11);
                        if (pi2ProgressArcView != null) {
                            return new b(view, viewA3, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewA, viewA2, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(x0.f114314b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f116220a;
    }
}
