package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f70772b;

    private y(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.f70771a = view;
        this.f70772b = recyclerView;
    }

    @NonNull
    public static y a(@NonNull View view) {
        int i11 = f30.z.f64272n0;
        RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
        if (recyclerView != null) {
            return new y(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static y b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.B, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70771a;
    }
}
