package ge0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import fe0.b;
import fe0.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f68786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f68787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f68788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f68789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f68790e;

    private a(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.f68786a = frameLayout;
        this.f68787b = textView;
        this.f68788c = imageView;
        this.f68789d = progressBar;
        this.f68790e = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = b.f65786a;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = b.f65787b;
            ImageView imageView = (ImageView) gb.b.a(view, i11);
            if (imageView != null) {
                i11 = b.f65788c;
                ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
                if (progressBar != null) {
                    i11 = b.f65789d;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        return new a((FrameLayout) view, textView, imageView, progressBar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(c.f65790a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f68786a;
    }
}
