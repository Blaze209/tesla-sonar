package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import androidx.work.a0;
import androidx.work.c0;
import androidx.work.d0;
import androidx.work.s0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.android.gms.maps.model.UrlTileProvider;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class p implements TileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected UrlTileProvider f49246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f49247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f49248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f49249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f49250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f49251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f49252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f49253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f49254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f49255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f49256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Context f49257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f49258m;

    class a extends UrlTileProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f49259a;

        public a(int i11, int i12, String str) {
            super(i11, i12);
            this.f49259a = str;
        }

        @Override // com.google.android.gms.maps.model.UrlTileProvider
        public URL getTileUrl(int i11, int i12, int i13) {
            if (p.this.f49253h) {
                i12 = ((1 << i13) - i12) - 1;
            }
            String strReplace = this.f49259a.replace("{x}", Integer.toString(i11)).replace("{y}", Integer.toString(i12)).replace("{z}", Integer.toString(i13));
            p pVar = p.this;
            int i14 = pVar.f49250e;
            if (i14 > 0 && i13 > i14) {
                return null;
            }
            int i15 = pVar.f49252g;
            if (i15 > 0 && i13 < i15) {
                return null;
            }
            try {
                return new URL(strReplace);
            } catch (MalformedURLException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public p(int i11, boolean z11, String str, int i12, int i13, int i14, boolean z12, String str2, int i15, boolean z13, Context context, boolean z14) {
        this.f49246a = new a(i11, i11, str);
        this.f49248c = i11;
        this.f49249d = z11;
        this.f49247b = str;
        this.f49250e = i12;
        this.f49251f = i13;
        this.f49252g = i14;
        this.f49253h = z12;
        this.f49254i = str2;
        this.f49255j = i15;
        this.f49256k = z13;
        this.f49257l = context;
        this.f49258m = z14;
    }

    byte[] a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e11) {
            e11.printStackTrace();
            return byteArray;
        }
    }

    void b(int i11, int i12, int i13) {
        String strE = e(i11, i12, i13);
        if ((System.currentTimeMillis() - new File(strE).lastModified()) / 1000 > this.f49255j) {
            Log.d("urlTile", "Refreshing");
            s0.e(this.f49257l.getApplicationContext()).c(strE, androidx.work.l.KEEP, new c0.a(MapTileWorker.class).j(new androidx.work.e.a().d(a0.CONNECTED).b()).a(strE).n(new androidx.work.g.a().k(ImagesContract.URL, g(i11, i12, i13).toString()).k("filename", strE).i("maxAge", this.f49255j).a()).b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    byte[] c(int i11, int i12, int i13) throws Throwable {
        ?? r11;
        Throwable th2;
        ?? r12;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        URL urlG = g(i11, i12, i13);
        try {
            try {
                InputStream inputStream2 = ((URLConnection) FirebasePerfUrlConnection.instrument(urlG.openConnection())).getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i14 = inputStream2.read(bArr, 0, 16384);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e11) {
                        e = e11;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    byteArrayOutputStream = null;
                    inputStream = inputStream2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return null;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                    byteArrayOutputStream = null;
                    inputStream = inputStream2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    r11 = 0;
                    th2 = th3;
                    r12 = inputStream2;
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (r11 == 0) {
                        throw th2;
                    }
                    try {
                        r11.close();
                        throw th2;
                    } catch (Exception unused6) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                r12 = urlG;
                r11 = i13;
            }
        } catch (IOException e15) {
            e = e15;
            inputStream = null;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return null;
        } catch (OutOfMemoryError e16) {
            e = e16;
            inputStream = null;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return null;
        } catch (Throwable th5) {
            r11 = 0;
            th2 = th5;
            r12 = 0;
        }
    }

    Bitmap d() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        return bitmapCreateBitmap;
    }

    String e(int i11, int i12, int i13) {
        if (this.f49254i == null) {
            return null;
        }
        return this.f49254i + '/' + i13 + "/" + i11 + "/" + i12;
    }

    byte[] f(int i11, int i12, int i13) throws Throwable {
        byte[] bArrC;
        if (this.f49254i != null) {
            bArrC = i(i11, i12, i13);
            if (bArrC != null) {
                Log.d("urlTile", "tile cache HIT for " + i13 + "/" + i11 + "/" + i12);
            } else {
                Log.d("urlTile", "tile cache MISS for " + i13 + "/" + i11 + "/" + i12);
            }
            if (bArrC != null && !this.f49256k) {
                b(i11, i12, i13);
            }
        } else {
            bArrC = null;
        }
        if (bArrC != null || this.f49256k || this.f49254i == null) {
            if (bArrC == null && !this.f49256k) {
                Log.d("urlTile", "Normal fetch");
                bArrC = c(i11, i12, i13);
                if (bArrC == null) {
                    Log.d("urlTile", "tile fetch TIMEOUT / FAIL for " + i13 + "/" + i11 + "/" + i12);
                }
            }
            return bArrC;
        }
        String strE = e(i11, i12, i13);
        c0 c0VarB = new c0.a(MapTileWorker.class).j(new androidx.work.e.a().d(a0.CONNECTED).b()).a(strE).n(new androidx.work.g.a().k(ImagesContract.URL, g(i11, i12, i13).toString()).k("filename", strE).i("maxAge", -1).a()).b();
        s0 s0VarE = s0.e(this.f49257l.getApplicationContext());
        com.google.common.util.concurrent.s<d0.b.c> result = s0VarE.c(strE, androidx.work.l.KEEP, c0VarB).getResult();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            result.get(1L, timeUnit);
            Thread.sleep(500L);
            Log.d("urlTile: ", s0VarE.f(strE).get(1L, timeUnit).get(0).toString());
            if (this.f49254i != null) {
                bArrC = i(i11, i12, i13);
                if (bArrC != null) {
                    Log.d("urlTile", "tile cache fetch HIT for " + i13 + "/" + i11 + "/" + i12);
                } else {
                    Log.d("urlTile", "tile cache fetch MISS for " + i13 + "/" + i11 + "/" + i12);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return bArrC;
    }

    protected URL g(int i11, int i12, int i13) {
        return this.f49246a.getTileUrl(i11, i12, i13);
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i11, int i12, int i13) throws Throwable {
        byte[] bArrJ;
        int i14;
        if (!this.f49258m) {
            return this.f49246a.getTile(i11, i12, i13);
        }
        int i15 = this.f49250e;
        if (i15 <= 0) {
            i15 = Integer.MAX_VALUE;
        }
        if (this.f49248c != 256 || !this.f49249d || (i14 = i13 + 1) > this.f49251f || i14 > i15) {
            bArrJ = null;
        } else {
            Log.d("urlTile", "pullTilesFromHigherZoom");
            bArrJ = h(i11, i12, i13);
        }
        if (i13 > this.f49251f) {
            Log.d("urlTile", "scaleLowerZoomTile");
            bArrJ = j(i11, i12, i13, this.f49251f);
        }
        if (bArrJ == null && i13 <= i15) {
            Log.d("urlTile", "getTileImage");
            bArrJ = f(i11, i12, i13);
        }
        if (bArrJ == null && this.f49254i != null && this.f49256k) {
            Log.d("urlTile", "findLowerZoomTileForScaling");
            int i16 = this.f49251f;
            int iMax = Math.max(this.f49252g, i13 - 3);
            for (int i17 = i13 > i16 ? i16 - 1 : i13 - 1; i17 >= iMax; i17--) {
                bArrJ = j(i11, i12, i13, i17);
                if (bArrJ != null) {
                    break;
                }
            }
        }
        if (bArrJ == null) {
            return null;
        }
        int i18 = this.f49248c;
        return new Tile(i18, i18, bArrJ);
    }

    byte[] h(int i11, int i12, int i13) throws Throwable {
        Bitmap bitmapD = d();
        Canvas canvas = new Canvas(bitmapD);
        Paint paint = new Paint();
        int i14 = i11 * 2;
        int i15 = i12 * 2;
        int i16 = i13 + 1;
        byte[] bArrF = f(i14, i15, i16);
        int i17 = i15 + 1;
        byte[] bArrF2 = f(i14, i17, i16);
        int i18 = i14 + 1;
        byte[] bArrF3 = f(i18, i15, i16);
        byte[] bArrF4 = f(i18, i17, i16);
        if (bArrF == null || bArrF2 == null || bArrF3 == null || bArrF4 == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, bArrF.length);
        canvas.drawBitmap(bitmapDecodeByteArray, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        bitmapDecodeByteArray.recycle();
        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrF2, 0, bArrF2.length);
        canvas.drawBitmap(bitmapDecodeByteArray2, BitmapDescriptorFactory.HUE_RED, 256.0f, paint);
        bitmapDecodeByteArray2.recycle();
        Bitmap bitmapDecodeByteArray3 = BitmapFactory.decodeByteArray(bArrF3, 0, bArrF3.length);
        canvas.drawBitmap(bitmapDecodeByteArray3, 256.0f, BitmapDescriptorFactory.HUE_RED, paint);
        bitmapDecodeByteArray3.recycle();
        Bitmap bitmapDecodeByteArray4 = BitmapFactory.decodeByteArray(bArrF4, 0, bArrF4.length);
        canvas.drawBitmap(bitmapDecodeByteArray4, 256.0f, 256.0f, paint);
        bitmapDecodeByteArray4.recycle();
        byte[] bArrA = a(bitmapD);
        bitmapD.recycle();
        return bArrA;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    byte[] i(int i11, int i12, int i13) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ?? r11;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String strE = e(i11, i12, i13);
        if (strE == null) {
            return null;
        }
        File file = new File(strE);
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i14 = fileInputStream2.read(bArr, 0, 16384);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream2.flush();
                        if (this.f49255j == 0) {
                            file.setLastModified(System.currentTimeMillis());
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            fileInputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    byteArrayOutputStream2 = null;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                    byteArrayOutputStream2 = null;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th2 = th3;
                    r11 = fileInputStream2;
                    if (r11 != 0) {
                        try {
                            r11.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th2;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th2;
                    } catch (Exception unused6) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                r11 = strE;
            }
        } catch (IOException e15) {
            e = e15;
            fileInputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (OutOfMemoryError e16) {
            e = e16;
            fileInputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (Throwable th5) {
            byteArrayOutputStream = null;
            th2 = th5;
            r11 = 0;
        }
    }

    byte[] j(int i11, int i12, int i13, int i14) throws Throwable {
        int i15 = i13 - i14;
        int i16 = 1 << i15;
        int i17 = i11 >> i15;
        int i18 = i12 >> i15;
        int i19 = i13 - i15;
        int i21 = i11 % i16;
        int i22 = i12 % i16;
        Bitmap bitmapD = d();
        Canvas canvas = new Canvas(bitmapD);
        Paint paint = new Paint();
        byte[] bArrF = f(i17, i18, i19);
        if (bArrF == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, bArrF.length);
        int i23 = this.f49248c / i16;
        int i24 = i21 * i23;
        int i25 = i22 * i23;
        canvas.drawBitmap(bitmapDecodeByteArray, new Rect(i24, i25, i24 + i23, i23 + i25), new Rect(0, 0, 512, 512), paint);
        bitmapDecodeByteArray.recycle();
        byte[] bArrA = a(bitmapD);
        bitmapD.recycle();
        return bArrA;
    }

    public void k() {
    }

    public void l(boolean z11) {
        this.f49249d = z11;
    }

    public void m(boolean z11) {
        this.f49253h = z11;
    }

    public void n(int i11) {
        this.f49251f = i11;
    }

    public void o(int i11) {
        this.f49250e = i11;
    }

    public void p(int i11) {
        this.f49252g = i11;
    }

    public void q(boolean z11) {
        this.f49256k = z11;
    }

    public void r(int i11) {
        this.f49255j = i11;
    }

    public void s(String str) {
        this.f49254i = str;
    }

    public void t(int i11) {
        if (this.f49248c != i11) {
            this.f49246a = new a(i11, i11, this.f49247b);
        }
        this.f49248c = i11;
    }

    public void u(String str) {
        if (this.f49247b != str) {
            int i11 = this.f49248c;
            this.f49246a = new a(i11, i11, str);
        }
        this.f49247b = str;
    }
}
