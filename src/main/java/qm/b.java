package qm;

import android.graphics.Bitmap;
import um.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends com.facebook.datasource.b<tk.a<e>> {
    protected abstract void a(Bitmap bitmap);

    @Override // com.facebook.datasource.b
    public void onNewResultImpl(com.facebook.datasource.c<tk.a<e>> cVar) {
        if (cVar.isFinished()) {
            tk.a<e> result = cVar.getResult();
            try {
                a((result == null || !(result.H() instanceof um.d)) ? null : ((um.d) result.H()).t3());
            } finally {
                tk.a.C(result);
            }
        }
    }
}
