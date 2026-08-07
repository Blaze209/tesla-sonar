package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f96852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f96853b;

    private d(@NonNull FrameLayout frameLayout, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f96852a = frameLayout;
        this.f96853b = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = n80.d.f93653v;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
        if (circularProgressIndicator != null) {
            return new d((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93661d, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f96852a;
    }
}
