package jz;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.text.ParseException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f84461a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yz.c[] f84462b = null;

    protected f() {
    }

    public static yz.c[] e(String str) throws ParseException {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(".");
        if (iIndexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i11 = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(".", i11);
        if (iIndexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i12 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(".", i12);
        if (iIndexOf3 == -1) {
            return new yz.c[]{new yz.c(strTrim.substring(0, iIndexOf)), new yz.c(strTrim.substring(i11, iIndexOf2)), new yz.c(strTrim.substring(i12))};
        }
        int i13 = iIndexOf3 + 1;
        int iIndexOf4 = strTrim.indexOf(".", i13);
        if (iIndexOf4 == -1) {
            throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
        }
        if (iIndexOf4 == -1 || strTrim.indexOf(".", iIndexOf4 + 1) == -1) {
            return new yz.c[]{new yz.c(strTrim.substring(0, iIndexOf)), new yz.c(strTrim.substring(i11, iIndexOf2)), new yz.c(strTrim.substring(i12, iIndexOf3)), new yz.c(strTrim.substring(i13, iIndexOf4)), new yz.c(strTrim.substring(iIndexOf4 + 1))};
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
    }

    public String a() {
        if (this.f84462b == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (yz.c cVar : this.f84462b) {
            if (sb2.length() > 0) {
                sb2.append(CoreConstants.DOT);
            }
            if (cVar != null) {
                sb2.append(cVar);
            }
        }
        return sb2.toString();
    }

    public s b() {
        return this.f84461a;
    }

    protected void c(yz.c... cVarArr) {
        this.f84462b = cVarArr;
    }

    protected void d(s sVar) {
        this.f84461a = sVar;
    }
}
