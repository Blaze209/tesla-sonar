package dh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import bh0.o2;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f60626a;

    private c(@NonNull FrameLayout frameLayout) {
        this.f60626a = frameLayout;
    }

    @NonNull
    public static c a(@NonNull View view) {
        if (view != null) {
            return new c((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o2.f17324c, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f60626a;
    }
}
