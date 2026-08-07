package com.github.barteksc.pdfviewer;

import android.os.AsyncTask;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class c extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39222a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<e> f39223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PdfiumCore f39224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private cq.a f39226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f39227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f39228g;

    c(cq.a aVar, String str, int[] iArr, e eVar, PdfiumCore pdfiumCore) {
        this.f39226e = aVar;
        this.f39227f = iArr;
        this.f39223b = new WeakReference<>(eVar);
        this.f39225d = str;
        this.f39224c = pdfiumCore;
    }

    private Size b(e eVar) {
        return new Size(eVar.getWidth(), eVar.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            e eVar = this.f39223b.get();
            if (eVar == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f39228g = new g(this.f39224c, this.f39226e.a(eVar.getContext(), this.f39224c, this.f39225d), eVar.getPageFitPolicy(), b(eVar), this.f39227f, eVar.H(), eVar.M(), eVar.getSpacingPx(), eVar.D(), eVar.G(), eVar.I());
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th2) {
        e eVar = this.f39223b.get();
        if (eVar != null) {
            if (th2 != null) {
                eVar.T(th2);
            } else {
                if (this.f39222a) {
                    return;
                }
                eVar.S(this.f39228g);
            }
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        this.f39222a = true;
    }
}
