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
public final class o implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f70739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f70741c;

    private o(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.f70739a = linearLayout;
        this.f70740b = appCompatImageView;
        this.f70741c = appCompatTextView;
    }

    @NonNull
    public static o a(@NonNull View view) {
        int i11 = f30.z.f64281s;
        AppCompatImageView appCompatImageView = (AppCompatImageView) gb.b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = f30.z.U;
            AppCompatTextView appCompatTextView = (AppCompatTextView) gb.b.a(view, i11);
            if (appCompatTextView != null) {
                return new o((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static o c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63919q, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f70739a;
    }
}
