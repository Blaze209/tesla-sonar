package mq0;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class[] f92434e = new Class[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f92435f = new String[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Hashtable f92436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object[] f92437h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f92438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ClassLoader f92439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f92440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f92441d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f92436g = hashtable;
        hashtable.put("void", Void.TYPE);
        f92436g.put(InquiryField.BooleanField.TYPE, Boolean.TYPE);
        f92436g.put("byte", Byte.TYPE);
        f92436g.put("char", Character.TYPE);
        f92436g.put("short", Short.TYPE);
        f92436g.put("int", Integer.TYPE);
        f92436g.put("long", Long.TYPE);
        f92436g.put(InquiryField.FloatField.TYPE, Float.TYPE);
        f92436g.put("double", Double.TYPE);
        f92437h = new Object[0];
    }

    public b(String str, Class cls) {
        this.f92440c = str;
        this.f92438a = cls;
        this.f92439b = cls.getClassLoader();
    }

    static Class a(String str, ClassLoader classLoader) {
        if (str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        Class cls = (Class) f92436g.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static jq0.a b(jq0.a.InterfaceC1785a interfaceC1785a, Object obj, Object obj2) {
        return new c(interfaceC1785a, obj, obj2, f92437h);
    }

    public static jq0.a c(jq0.a.InterfaceC1785a interfaceC1785a, Object obj, Object obj2, Object obj3) {
        return new c(interfaceC1785a, obj, obj2, new Object[]{obj3});
    }

    public kq0.a d(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        int i11 = Integer.parseInt(str, 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i12 = 0; i12 < iCountTokens; i12++) {
            clsArr[i12] = a(stringTokenizer.nextToken(), this.f92439b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i13 = 0; i13 < iCountTokens2; i13++) {
            strArr[i13] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i14 = 0; i14 < iCountTokens3; i14++) {
            clsArr2[i14] = a(stringTokenizer3.nextToken(), this.f92439b);
        }
        return new e(i11, str2, cls, clsArr, strArr, clsArr2, a(str6, this.f92439b));
    }

    public kq0.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return d(str, str2, a(str3, this.f92439b), str4, str5, str6, str7);
    }

    public jq0.a.InterfaceC1785a f(String str, jq0.b bVar, int i11) {
        int i12 = this.f92441d;
        this.f92441d = i12 + 1;
        return new c.a(i12, str, bVar, g(i11, -1));
    }

    public kq0.b g(int i11, int i12) {
        return new g(this.f92438a, this.f92440c, i11);
    }
}
