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
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f121699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f121700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f121701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f121702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f121703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f121704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f121705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f121706h;

    private a(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f121699a = view;
        this.f121700b = materialButton;
        this.f121701c = imageView;
        this.f121702d = imageView2;
        this.f121703e = linearProgressIndicator;
        this.f121704f = textView;
        this.f121705g = textView2;
        this.f121706h = textView3;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = d.f119057a;
        MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
        if (materialButton != null) {
            i11 = d.f119059c;
            ImageView imageView = (ImageView) gb.b.a(view, i11);
            if (imageView != null) {
                i11 = d.f119060d;
                ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                if (imageView2 != null) {
                    i11 = d.f119061e;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) gb.b.a(view, i11);
                    if (linearProgressIndicator != null) {
                        i11 = d.f119062f;
                        TextView textView = (TextView) gb.b.a(view, i11);
                        if (textView != null) {
                            i11 = d.f119063g;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = d.f119064h;
                                TextView textView3 = (TextView) gb.b.a(view, i11);
                                if (textView3 != null) {
                                    return new a(view, materialButton, imageView, imageView2, linearProgressIndicator, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(e.f119065a, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f121699a;
    }
}
