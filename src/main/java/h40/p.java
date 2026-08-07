package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70742a;

    private p(@NonNull View view) {
        this.f70742a = view;
    }

    @NonNull
    public static p a(@NonNull View view) {
        if (view != null) {
            return new p(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static p b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63920r, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70742a;
    }
}
