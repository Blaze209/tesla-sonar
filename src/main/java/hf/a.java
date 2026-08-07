package hf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import gf.f;
import gf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f72631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f72632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f72633c;

    private a(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f72631a = view;
        this.f72632b = frameLayout;
        this.f72633c = frameLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = f.f68809j;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = f.f68810k;
            FrameLayout frameLayout2 = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout2 != null) {
                return new a(view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f68827b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f72631a;
    }
}
