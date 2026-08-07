package zj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CropImageView f128393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CropImageView f128394b;

    private a(@NonNull CropImageView cropImageView, @NonNull CropImageView cropImageView2) {
        this.f128393a = cropImageView;
        this.f128394b = cropImageView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CropImageView cropImageView = (CropImageView) view;
        return new a(cropImageView, cropImageView);
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(t.f21151a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView getRoot() {
        return this.f128393a;
    }
}
