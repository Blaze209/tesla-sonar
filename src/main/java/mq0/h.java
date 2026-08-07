package mq0;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Modifier;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static h f92466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static h f92467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static h f92468l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f92469a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f92470b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f92471c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f92472d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f92473e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f92474f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f92475g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f92476h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f92477i;

    static {
        h hVar = new h();
        f92466j = hVar;
        hVar.f92469a = true;
        hVar.f92470b = false;
        hVar.f92471c = false;
        hVar.f92472d = false;
        hVar.f92473e = true;
        hVar.f92474f = false;
        hVar.f92475g = false;
        hVar.f92477i = 0;
        h hVar2 = new h();
        f92467k = hVar2;
        hVar2.f92469a = true;
        hVar2.f92470b = true;
        hVar2.f92471c = false;
        hVar2.f92472d = false;
        hVar2.f92473e = false;
        f92466j.f92477i = 1;
        h hVar3 = new h();
        f92468l = hVar3;
        hVar3.f92469a = false;
        hVar3.f92470b = true;
        hVar3.f92471c = false;
        hVar3.f92472d = true;
        hVar3.f92473e = false;
        hVar3.f92476h = false;
        hVar3.f92477i = 2;
    }

    h() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f92470b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f92471c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i11]));
        }
    }

    String d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    String e(int i11) {
        if (!this.f92472d) {
            return "";
        }
        String string = Modifier.toString(i11);
        if (string.length() == 0) {
            return "";
        }
        return string + " ";
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f92473e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f92469a);
    }

    String h(Class cls, String str, boolean z11) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z11 ? i(str).replace(CoreConstants.DOLLAR, CoreConstants.DOT) : str.replace(CoreConstants.DOLLAR, CoreConstants.DOT);
        }
        Class<?> componentType = cls.getComponentType();
        return h(componentType, componentType.getName(), z11) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    String i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
