package h0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f70085a;

    public e() {
        this(false);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NonNull Size size, @NonNull Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f70085a ? iSignum * (-1) : iSignum;
    }

    public e(boolean z11) {
        this.f70085a = z11;
    }
}
