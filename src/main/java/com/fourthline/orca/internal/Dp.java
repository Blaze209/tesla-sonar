package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Dp implements Bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25485a;

    public Dp(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f25485a = context;
    }

    @Override // com.fourthline.orca.internal.Bp
    public List a(String filePath) {
        p013kotlin.jvm.internal.s.k(filePath, "filePath");
        return a(new PdfRenderer(ParcelFileDescriptor.open(new File(filePath), 268435456)));
    }

    private final List a(PdfRenderer pdfRenderer) {
        ArrayList arrayList = new ArrayList();
        float f11 = this.f25485a.getResources().getDisplayMetrics().density;
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        p013kotlin.jvm.internal.s.j(pageOpenPage, "openPage(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * f11), (int) (pageOpenPage.getHeight() * f11), Bitmap.Config.ARGB_8888);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        arrayList.add(bitmapCreateBitmap);
        pageOpenPage.close();
        pdfRenderer.close();
        return arrayList;
    }
}
