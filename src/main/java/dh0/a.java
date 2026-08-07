package dh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import bh0.n2;
import bh0.o2;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f60616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f60617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f60618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f60619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f60620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f60621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Button f60622g;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Button button, @NonNull Flow flow, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button2) {
        this.f60616a = constraintLayout;
        this.f60617b = constraintLayout2;
        this.f60618c = button;
        this.f60619d = flow;
        this.f60620e = textView;
        this.f60621f = textView2;
        this.f60622g = button2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = n2.f17306b;
        Button button = (Button) gb.b.a(view, i11);
        if (button != null) {
            i11 = n2.f17307c;
            Flow flow = (Flow) gb.b.a(view, i11);
            if (flow != null) {
                i11 = n2.f17310f;
                TextView textView = (TextView) gb.b.a(view, i11);
                if (textView != null) {
                    i11 = n2.f17311g;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = n2.f17314j;
                        Button button2 = (Button) gb.b.a(view, i11);
                        if (button2 != null) {
                            return new a(constraintLayout, constraintLayout, button, flow, textView, textView2, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o2.f17322a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f60616a;
    }
}
