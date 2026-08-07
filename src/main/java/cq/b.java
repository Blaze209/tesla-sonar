package cq;

import android.content.Context;
import dq.f;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f58900a;

    public b(InputStream inputStream) {
        this.f58900a = inputStream;
    }

    @Override // cq.a
    public PdfDocument a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.newDocument(f.b(this.f58900a), str);
    }
}
