package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f70669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f70670b;

    private e(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.f70669a = linearLayout;
        this.f70670b = appCompatTextView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i11 = f30.z.U;
        AppCompatTextView appCompatTextView = (AppCompatTextView) gb.b.a(view, i11);
        if (appCompatTextView != null) {
            return new e((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63907e, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f70669a;
    }
}
