package jx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes5.dex */
public class f extends hx.d {
    public f(GoogleMap googleMap, InputStream inputStream, Context context, gx.d dVar, gx.e eVar, gx.f fVar, gx.b bVar, hx.h.b bVar2) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("KML InputStream cannot be null");
        }
        n nVar = new n(googleMap, context, dVar, eVar, fVar, bVar, bVar2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(1024);
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                HashMap<String, Bitmap> map = new HashMap<>();
                j jVarF = null;
                while (nextEntry != null) {
                    if (jVarF == null && nextEntry.getName().toLowerCase().endsWith(".kml")) {
                        jVarF = f(zipInputStream);
                    } else {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zipInputStream);
                        if (bitmapDecodeStream != null) {
                            map.put(nextEntry.getName(), bitmapDecodeStream);
                        } else {
                            Log.w("KmlLayer", "Unsupported KMZ contents file type: " + nextEntry.getName());
                        }
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (jVarF == null) {
                    throw new IllegalArgumentException("KML not found in InputStream");
                }
                nVar.A0(jVarF.e(), jVarF.d(), jVarF.c(), jVarF.a(), jVarF.b(), map);
            } else {
                bufferedInputStream.reset();
                j jVarF2 = f(bufferedInputStream);
                nVar.z0(jVarF2.e(), jVarF2.d(), jVarF2.c(), jVarF2.a(), jVarF2.b());
                nVar = nVar;
            }
            c(nVar);
            inputStream.close();
            bufferedInputStream.close();
            zipInputStream.close();
        } catch (Throwable th2) {
            inputStream.close();
            bufferedInputStream.close();
            zipInputStream.close();
            throw th2;
        }
    }

    private static XmlPullParser e(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    private static j f(InputStream inputStream) throws XmlPullParserException, IOException {
        j jVar = new j(e(inputStream));
        jVar.f();
        return jVar;
    }

    @Override // hx.d
    public Iterable<b> b() {
        return super.b();
    }

    public void d() {
        super.a();
    }
}
