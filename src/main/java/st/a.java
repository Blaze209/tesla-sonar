package st;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111775a;

    public a(float f11) {
        this.f111775a = f11;
    }

    @Override // st.c
    public float a(@NonNull RectF rectF) {
        return this.f111775a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f111775a == ((a) obj).f111775a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f111775a)});
    }
}
