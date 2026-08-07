package we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import ve.d;
import ve.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f121707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f121708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f121709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f121710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f121711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f121712f;

    private b(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ImageView imageView, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f121707a = view;
        this.f121708b = materialButton;
        this.f121709c = imageView;
        this.f121710d = linearProgressIndicator;
        this.f121711e = textView;
        this.f121712f = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = d.f119058b;
        MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
        if (materialButton != null) {
            i11 = d.f119059c;
            ImageView imageView = (ImageView) gb.b.a(view, i11);
            if (imageView != null) {
                i11 = d.f119061e;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) gb.b.a(view, i11);
                if (linearProgressIndicator != null) {
                    i11 = d.f119062f;
                    TextView textView = (TextView) gb.b.a(view, i11);
                    if (textView != null) {
                        i11 = d.f119063g;
                        TextView textView2 = (TextView) gb.b.a(view, i11);
                        if (textView2 != null) {
                            return new b(view, materialButton, imageView, linearProgressIndicator, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(e.f119066b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f121707a;
    }
}
