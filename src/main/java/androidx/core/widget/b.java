package androidx.core.widget;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @Deprecated
    public static final boolean f7931k1;

    static {
        f7931k1 = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14);
}
