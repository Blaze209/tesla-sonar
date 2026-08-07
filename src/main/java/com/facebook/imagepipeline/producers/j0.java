package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import expo.modules.contacts.Columns;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends l0 implements q1<um.k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class<?> f21850d = j0.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f21851e = {Columns.ID, "_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f21852f = {"_data"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Rect f21853g = new Rect(0, 0, 512, KyberEngine.KyberPolyBytes);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Rect f21854h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f21855c;

    public j0(Executor executor, sk.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f21855c = contentResolver;
    }

    private um.k g(Uri uri, om.f fVar) {
        Cursor cursorQuery;
        um.k kVarJ;
        if (fVar == null || (cursorQuery = this.f21855c.query(uri, f21851e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (kVarJ = j(fVar, cursorQuery.getLong(cursorQuery.getColumnIndex(Columns.ID)))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                kVarJ.O0(i(cursorQuery.getString(columnIndex)));
            }
            return kVarJ;
        } finally {
            cursorQuery.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return fn.f.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e11) {
            qk.a.l(f21850d, e11, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private um.k j(om.f fVar, long j11) {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iK = k(fVar);
        if (iK == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f21855c, j11, iK, f21852f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) pk.k.g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }

    private static int k(om.f fVar) {
        Rect rect = f21854h;
        if (r1.b(rect.width(), rect.height(), fVar)) {
            return 3;
        }
        Rect rect2 = f21853g;
        return r1.b(rect2.width(), rect2.height(), fVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.q1
    public boolean b(om.f fVar) {
        Rect rect = f21853g;
        return r1.b(rect.width(), rect.height(), fVar);
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a aVar) {
        Uri uriV = aVar.v();
        if (xk.e.j(uriV)) {
            return g(uriV, aVar.r());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
