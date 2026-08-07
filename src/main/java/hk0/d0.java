package hk0;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes8.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f73001a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static /* synthetic */ Class f73002b;

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static Map b() {
        HashMap map = new HashMap();
        map.put(InquiryField.BooleanField.TYPE, Boolean.TYPE);
        map.put("byte", Byte.TYPE);
        map.put("char", Character.TYPE);
        map.put("short", Short.TYPE);
        map.put("int", Integer.TYPE);
        map.put("long", Long.TYPE);
        map.put(InquiryField.FloatField.TYPE, Float.TYPE);
        map.put("double", Double.TYPE);
        return map;
    }

    private static final Set c() throws Throwable {
        Properties properties = new Properties();
        Class clsA = f73002b;
        if (clsA == null) {
            clsA = a("freemarker.ext.beans.BeansWrapper");
            f73002b = clsA;
        }
        InputStream resourceAsStream = clsA.getResourceAsStream("unsafeMethods.txt");
        if (resourceAsStream == null) {
            return Collections.EMPTY_SET;
        }
        String str = null;
        try {
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
                HashSet hashSet = new HashSet((properties.size() * 4) / 3, 1.0f);
                Map mapB = b();
                for (String str2 : properties.keySet()) {
                    try {
                        try {
                            try {
                                hashSet.add(e(str2, mapB));
                            } catch (ClassNotFoundException e11) {
                                if (p.f73057p) {
                                    throw e11;
                                }
                            }
                        } catch (NoSuchMethodException e12) {
                            if (p.f73057p) {
                                throw e12;
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str = str2;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Could not load unsafe method ");
                        stringBuffer.append(str);
                        stringBuffer.append(" ");
                        stringBuffer.append(e.getClass().getName());
                        stringBuffer.append(" ");
                        stringBuffer.append(e.getMessage());
                        throw new RuntimeException(stringBuffer.toString());
                    }
                }
                return hashSet;
            } catch (Throwable th2) {
                resourceAsStream.close();
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    static boolean d(Method method) {
        return f73001a.contains(method);
    }

    private static Method e(String str, Map map) {
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(46, iIndexOf);
        Class clsB = mk0.a.b(str.substring(0, iLastIndexOf));
        String strSubstring = str.substring(iLastIndexOf + 1, iIndexOf);
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(iIndexOf + 1, str.length() - 1), ",");
        int iCountTokens = stringTokenizer.countTokens();
        Class<?>[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            String strNextToken = stringTokenizer.nextToken();
            Class<?> cls = (Class) map.get(strNextToken);
            clsArr[i11] = cls;
            if (cls == null) {
                clsArr[i11] = mk0.a.b(strNextToken);
            }
        }
        return clsB.getMethod(strSubstring, clsArr);
    }
}
