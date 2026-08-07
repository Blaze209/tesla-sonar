package yp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.barteksc.pdfviewer.e;

/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f125732b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f125733a;

    public a(e eVar) {
        this.f125733a = eVar;
    }

    private void a(int i11) {
        this.f125733a.O(i11);
    }

    private void b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f125733a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Log.w(f125732b, "No activity found for URI: " + str);
    }

    @Override // yp.b
    public void d(aq.a aVar) {
        String uri = aVar.a().getUri();
        Integer destPageIdx = aVar.a().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            b(uri);
        } else if (destPageIdx != null) {
            a(destPageIdx.intValue());
        }
    }
}
