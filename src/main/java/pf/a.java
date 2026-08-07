package pf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f102179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f102180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f102181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f102182d;

    private a(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f102179a = linearLayout;
        this.f102180b = view;
        this.f102181c = textView;
        this.f102182d = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = of.a.f97239e;
        View viewA = gb.b.a(view, i11);
        if (viewA != null) {
            i11 = of.a.f97249o;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = of.a.f97250p;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    return new a((LinearLayout) view, viewA, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(of.b.f97255a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102179a;
    }
}
