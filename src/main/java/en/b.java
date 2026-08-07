package en;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import j5.h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import om.c;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import um.j;
import um.k;
import um.p;
import xk.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Len/b;", "Lsm/b;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "xmlResourceName", "", "b", "(Ljava/lang/String;)I", "Landroid/net/Uri;", "xmlResource", "c", "(Landroid/net/Uri;)I", "Lum/k;", "encodedImage", "length", "Lum/p;", "qualityInfo", "Lom/c;", "options", "Lum/e;", "a", "(Lum/k;ILum/p;Lom/c;)Lum/e;", "Landroid/content/res/Resources;", "", "Ljava/util/Map;", "resourceIdCache", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements sm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> resourceIdCache;

    public b(Resources resources) {
        s.k(resources, "resources");
        this.resources = resources;
        this.resourceIdCache = new ConcurrentHashMap();
    }

    private final int b(String xmlResourceName) {
        Map<String, Integer> map = this.resourceIdCache;
        Integer numValueOf = map.get(xmlResourceName);
        if (numValueOf == null) {
            Uri uri = Uri.parse(xmlResourceName);
            s.j(uri, "parse(...)");
            numValueOf = Integer.valueOf(c(uri));
            map.put(xmlResourceName, numValueOf);
        }
        return numValueOf.intValue();
    }

    private final int c(Uri xmlResource) {
        Integer numX;
        if (!e.n(xmlResource) && !e.p(xmlResource)) {
            throw new IllegalStateException(("Unsupported uri " + xmlResource).toString());
        }
        List<String> pathSegments = xmlResource.getPathSegments();
        s.j(pathSegments, "getPathSegments(...)");
        String str = (String) v.C0(pathSegments);
        if (str != null && (numX = t.x(str)) != null) {
            return numX.intValue();
        }
        throw new IllegalStateException(("Unable to read resource ID from " + xmlResource.getPath()).toString());
    }

    @Override // sm.b
    public um.e a(k encodedImage, int length, p qualityInfo, c options) {
        s.k(encodedImage, "encodedImage");
        s.k(qualityInfo, "qualityInfo");
        s.k(options, "options");
        try {
            String strE0 = encodedImage.e0();
            if (strE0 == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawableF = h.f(this.resources, b(strE0), null);
            if (drawableF != null) {
                return new j(drawableF);
            }
            return null;
        } catch (Throwable th2) {
            qk.a.n("XmlFormatDecoder", "Cannot decode xml", th2);
            return null;
        }
    }
}
