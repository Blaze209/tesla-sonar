package hf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import gf.f;
import gf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f72634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f72635b;

    private b(@NonNull View view, @NonNull MaterialButton materialButton) {
        this.f72634a = view;
        this.f72635b = materialButton;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = f.f68812m;
        MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
        if (materialButton != null) {
            return new b(view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f68828c, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f72634a;
    }
}
