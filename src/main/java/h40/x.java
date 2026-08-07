package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f70767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f70768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f70769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f70770e;

    private x(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull AppCompatImageView appCompatImageView) {
        this.f70766a = view;
        this.f70767b = textView;
        this.f70768c = textView2;
        this.f70769d = textView3;
        this.f70770e = appCompatImageView;
    }

    @NonNull
    public static x a(@NonNull View view) {
        int i11 = f30.z.A;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = f30.z.X;
            TextView textView2 = (TextView) gb.b.a(view, i11);
            if (textView2 != null) {
                i11 = f30.z.f64254e0;
                TextView textView3 = (TextView) gb.b.a(view, i11);
                if (textView3 != null) {
                    i11 = f30.z.f64266k0;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) gb.b.a(view, i11);
                    if (appCompatImageView != null) {
                        return new x(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static x b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.A, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70766a;
    }
}
