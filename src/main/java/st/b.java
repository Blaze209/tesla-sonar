package st;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f111776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f111777b;

    public b(float f11, @NonNull c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f111776a;
            f11 += ((b) cVar).f111777b;
        }
        this.f111776a = cVar;
        this.f111777b = f11;
    }

    @Override // st.c
    public float a(@NonNull RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.f111776a.a(rectF) + this.f111777b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f111776a.equals(bVar.f111776a) && this.f111777b == bVar.f111777b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111776a, Float.valueOf(this.f111777b)});
    }
}
