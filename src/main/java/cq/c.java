package cq;

import android.content.Context;
import android.net.Uri;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f58901a;

    public c(Uri uri) {
        this.f58901a = uri;
    }

    @Override // cq.a
    public PdfDocument a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.newDocument(context.getContentResolver().openFileDescriptor(this.f58901a, "r"), str);
    }
}
