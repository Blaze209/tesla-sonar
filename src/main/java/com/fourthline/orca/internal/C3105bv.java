package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3105bv implements Bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30716a;

    public C3105bv(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f30716a = context;
    }

    @Override // com.fourthline.orca.internal.Bp
    public List a(String filePath) {
        p013kotlin.jvm.internal.s.k(filePath, "filePath");
        return a(new PdfRenderer(ParcelFileDescriptor.open(new File(filePath), 268435456)));
    }

    private final List a(PdfRenderer pdfRenderer) {
        ArrayList arrayList = new ArrayList();
        float f11 = this.f30716a.getResources().getDisplayMetrics().density;
        int pageCount = pdfRenderer.getPageCount();
        for (int i11 = 0; i11 < pageCount; i11++) {
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i11);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * f11), (int) (pageOpenPage.getHeight() * f11), Bitmap.Config.ARGB_8888);
            pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
            arrayList.add(bitmapCreateBitmap);
            pageOpenPage.close();
        }
        pdfRenderer.close();
        return arrayList;
    }
}
