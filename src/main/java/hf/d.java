package hf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import gf.f;
import gf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f72638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f72639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f72640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f72641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f72642e;

    private d(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f72638a = view;
        this.f72639b = materialButton;
        this.f72640c = progressBar;
        this.f72641d = textView;
        this.f72642e = textView2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = f.f68802c;
        MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
        if (materialButton != null) {
            i11 = f.f68813n;
            ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
            if (progressBar != null) {
                i11 = f.f68823x;
                TextView textView = (TextView) gb.b.a(view, i11);
                if (textView != null) {
                    i11 = f.f68824y;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        return new d(view, materialButton, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f68830e, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f72638a;
    }
}
