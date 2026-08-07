package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f70687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f70690d;

    private g(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.f70687a = linearLayout;
        this.f70688b = appCompatImageView;
        this.f70689c = appCompatImageView2;
        this.f70690d = appCompatTextView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i11 = f30.z.f64281s;
        AppCompatImageView appCompatImageView = (AppCompatImageView) gb.b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = f30.z.T;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) gb.b.a(view, i11);
            if (appCompatImageView2 != null) {
                i11 = f30.z.X;
                AppCompatTextView appCompatTextView = (AppCompatTextView) gb.b.a(view, i11);
                if (appCompatTextView != null) {
                    return new g((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63909g, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f70687a;
    }
}
