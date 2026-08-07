package sh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f111162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialSwitch f111163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f111164c;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialToolbar materialToolbar) {
        this.f111162a = constraintLayout;
        this.f111163b = materialSwitch;
        this.f111164c = materialToolbar;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = rh0.a.f108254c;
        MaterialSwitch materialSwitch = (MaterialSwitch) gb.b.a(view, i11);
        if (materialSwitch != null) {
            i11 = rh0.a.f108255d;
            MaterialToolbar materialToolbar = (MaterialToolbar) gb.b.a(view, i11);
            if (materialToolbar != null) {
                return new a((ConstraintLayout) view, materialSwitch, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(rh0.b.f108256a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f111162a;
    }
}
