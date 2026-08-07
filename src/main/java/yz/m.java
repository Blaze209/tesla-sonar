package yz;

import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static List<X509Certificate> a(List<a> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11) != null) {
                X509Certificate x509CertificateA = n.a(list.get(i11).a());
                if (x509CertificateA == null) {
                    throw new ParseException("Invalid X.509 certificate at position " + i11, 0);
                }
                linkedList.add(x509CertificateA);
            }
        }
        return linkedList;
    }

    public static List<a> b(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (obj == null) {
                throw new ParseException("The X.509 certificate at position " + i11 + " must not be null", 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException("The X.509 certificate at position " + i11 + " must be encoded as a Base64 string", 0);
            }
            linkedList.add(new a((String) obj));
        }
        return linkedList;
    }
}
