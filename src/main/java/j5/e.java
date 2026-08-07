package j5;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    static class a {
        static int a(TypedArray typedArray, int i11) {
            return typedArray.getType(i11);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f82642a;

        public c(d[] dVarArr) {
            this.f82642a = dVarArr;
        }

        public d[] a() {
            return this.f82642a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f82643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f82644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f82645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f82646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f82647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f82648f;

        public d(String str, int i11, boolean z11, String str2, int i12, int i13) {
            this.f82643a = str;
            this.f82644b = i11;
            this.f82645c = z11;
            this.f82646d = str2;
            this.f82647e = i12;
            this.f82648f = i13;
        }

        public String a() {
            return this.f82643a;
        }

        public int b() {
            return this.f82648f;
        }

        public int c() {
            return this.f82647e;
        }

        public String d() {
            return this.f82646d;
        }

        public int e() {
            return this.f82644b;
        }

        public boolean f() {
            return this.f82645c;
        }
    }

    /* JADX INFO: renamed from: j5.e$e, reason: collision with other inner class name */
    public static final class C1726e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r5.e f82649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r5.e f82650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f82651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f82652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f82653e;

        public C1726e(r5.e eVar, r5.e eVar2, int i11, int i12, String str) {
            this.f82649a = eVar;
            this.f82650b = eVar2;
            this.f82652d = i11;
            this.f82651c = i12;
            this.f82653e = str;
        }

        public r5.e a() {
            return this.f82650b;
        }

        public int b() {
            return this.f82652d;
        }

        public r5.e c() {
            return this.f82649a;
        }

        public String d() {
            return this.f82653e;
        }

        public int e() {
            return this.f82651c;
        }
    }

    private static int a(TypedArray typedArray, int i11) {
        return a.a(typedArray, i11);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < typedArrayObtainTypedArray.length(); i12++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i11)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), h5.g.f70824h);
        String string = typedArrayObtainAttributes.getString(h5.g.f70825i);
        String string2 = typedArrayObtainAttributes.getString(h5.g.f70830n);
        String string3 = typedArrayObtainAttributes.getString(h5.g.f70831o);
        String string4 = typedArrayObtainAttributes.getString(h5.g.f70827k);
        int resourceId = typedArrayObtainAttributes.getResourceId(h5.g.f70826j, 0);
        int integer = typedArrayObtainAttributes.getInteger(h5.g.f70828l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(h5.g.f70829m, 500);
        String string5 = typedArrayObtainAttributes.getString(h5.g.f70832p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C1726e(new r5.e(string, string2, string3, listC), string4 != null ? new r5.e(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), h5.g.f70833q);
        int i11 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(h5.g.f70842z) ? h5.g.f70842z : h5.g.f70835s, 400);
        boolean z11 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(h5.g.f70840x) ? h5.g.f70840x : h5.g.f70836t, 0);
        int i12 = typedArrayObtainAttributes.hasValue(h5.g.A) ? h5.g.A : h5.g.f70837u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(h5.g.f70841y) ? h5.g.f70841y : h5.g.f70838v);
        int i13 = typedArrayObtainAttributes.getInt(i12, 0);
        int i14 = typedArrayObtainAttributes.hasValue(h5.g.f70839w) ? h5.g.f70839w : h5.g.f70834r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i14, 0);
        String string2 = typedArrayObtainAttributes.getString(i14);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z11, string, i13, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
