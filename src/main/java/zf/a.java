package zf;

import ag.c;
import ag.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import hg.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f128132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private tf.b f128133e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<String> f128129a = new i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f128130b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f128131c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f128134f = ".ttf";

    public a(Drawable.Callback callback, tf.b bVar) {
        this.f128133e = bVar;
        if (callback instanceof View) {
            this.f128132d = ((View) callback).getContext().getAssets();
        } else {
            e.c("LottieDrawable must be inside of a view for images to work.");
            this.f128132d = null;
        }
    }

    private Typeface a(c cVar) {
        Typeface typefaceCreateFromAsset;
        String strA = cVar.a();
        Typeface typeface = this.f128131c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        String strC = cVar.c();
        String strB = cVar.b();
        tf.b bVar = this.f128133e;
        if (bVar != null) {
            typefaceCreateFromAsset = bVar.b(strA, strC, strB);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f128133e.a(strA);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        tf.b bVar2 = this.f128133e;
        if (bVar2 != null && typefaceCreateFromAsset == null) {
            String strD = bVar2.d(strA, strC, strB);
            if (strD == null) {
                strD = this.f128133e.c(strA);
            }
            if (strD != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f128132d, strD);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f128132d, "fonts/" + strA + this.f128134f);
        }
        this.f128131c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        int i11;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i11 = 3;
        } else if (zContains) {
            i11 = 2;
        } else {
            i11 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }

    public Typeface b(c cVar) {
        this.f128129a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f128130b.get(this.f128129a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f128130b.put(this.f128129a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f128134f = str;
    }

    public void d(tf.b bVar) {
        this.f128133e = bVar;
    }
}
