package z0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class j extends x.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f126158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f126159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<Size> f126160l;

    j(int i11, String str, List<Size> list) {
        this.f126158j = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f126159k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f126160l = list;
    }

    @Override // z0.x.b
    @NonNull
    public String c() {
        return this.f126159k;
    }

    @Override // z0.x.b
    @NonNull
    public List<Size> d() {
        return this.f126160l;
    }

    @Override // z0.x.b
    public int e() {
        return this.f126158j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.b) {
            x.b bVar = (x.b) obj;
            if (this.f126158j == bVar.e() && this.f126159k.equals(bVar.c()) && this.f126160l.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f126158j ^ 1000003) * 1000003) ^ this.f126159k.hashCode()) * 1000003) ^ this.f126160l.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f126158j + ", name=" + this.f126159k + ", typicalSizes=" + this.f126160l + "}";
    }
}
