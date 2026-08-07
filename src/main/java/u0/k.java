package u0;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f115235a;

    public k(@NonNull p pVar) {
        this.f115235a = pVar;
    }

    @NonNull
    public o1 a() {
        androidx.camera.core.f.c cVar = new androidx.camera.core.f.c();
        Size[] sizeArrG = this.f115235a.g();
        ArrayList arrayList = new ArrayList();
        if (sizeArrG != null && sizeArrG.length > 0) {
            arrayList.add(new Pair<>(35, sizeArrG));
        }
        cVar.o(arrayList);
        return cVar.d();
    }
}
