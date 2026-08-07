package hf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import gf.f;
import gf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f72636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f72637b;

    private c(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.f72636a = linearLayout;
        this.f72637b = appCompatTextView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = f.f68825z;
        AppCompatTextView appCompatTextView = (AppCompatTextView) gb.b.a(view, i11);
        if (appCompatTextView != null) {
            return new c((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(g.f68829d, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f72636a;
    }
}
