package fu;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f66581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f66582b;

    c(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f66581a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f66582b = str;
    }

    @Override // fu.u
    @NonNull
    final File a() {
        return this.f66581a;
    }

    @Override // fu.u
    @NonNull
    final String b() {
        return this.f66582b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f66581a.equals(uVar.a()) && this.f66582b.equals(uVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f66581a.hashCode() ^ 1000003) * 1000003) ^ this.f66582b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f66581a.toString() + ", splitId=" + this.f66582b + "}";
    }
}
