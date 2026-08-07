package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f70748d;

    private r(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.f70745a = view;
        this.f70746b = appCompatImageView;
        this.f70747c = appCompatImageView2;
        this.f70748d = appCompatTextView;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i11 = f30.z.f64259h;
        AppCompatImageView appCompatImageView = (AppCompatImageView) gb.b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = f30.z.f64281s;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) gb.b.a(view, i11);
            if (appCompatImageView2 != null) {
                i11 = f30.z.B;
                AppCompatTextView appCompatTextView = (AppCompatTextView) gb.b.a(view, i11);
                if (appCompatTextView != null) {
                    return new r(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static r b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63922t, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70745a;
    }
}
