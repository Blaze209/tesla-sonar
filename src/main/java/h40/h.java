package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f70691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f70692b;

    private h(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f70691a = linearLayout;
        this.f70692b = recyclerView;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = f30.z.f64253e;
        RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
        if (recyclerView != null) {
            return new h((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63910h, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f70691a;
    }
}
