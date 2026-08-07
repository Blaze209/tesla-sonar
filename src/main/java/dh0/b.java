package dh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import bh0.n2;
import bh0.o2;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f60623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f60624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f60625c;

    private b(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f60623a = view;
        this.f60624b = view2;
        this.f60625c = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = n2.f17312h;
        View viewA = gb.b.a(view, i11);
        if (viewA != null) {
            i11 = n2.f17315k;
            FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout != null) {
                return new b(view, viewA, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(o2.f17323b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f60623a;
    }
}
