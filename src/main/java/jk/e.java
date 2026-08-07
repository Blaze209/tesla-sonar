package jk;

import ch.qos.logback.core.joran.action.Action;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ljk/e;", "", "<init>", "()V", "Ljk/d;", Action.KEY_ATTRIBUTE, "", "", "b", "(Ljk/d;)Ljava/util/List;", "a", "(Ljk/d;)Ljava/lang/String;", "c", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f83923a = new e();

    private e() {
    }

    public static final String a(d key) {
        s.k(key, "key");
        try {
            if (!(key instanceof f)) {
                return f83923a.c(key);
            }
            List<d> listD = ((f) key).d();
            s.j(listD, "getCacheKeys(...)");
            e eVar = f83923a;
            d dVar = listD.get(0);
            s.j(dVar, "get(...)");
            return eVar.c(dVar);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static final List<String> b(d key) {
        s.k(key, "key");
        try {
            if (!(key instanceof f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.b() ? key.a() : f83923a.c(key));
                return arrayList;
            }
            List<d> listD = ((f) key).d();
            s.j(listD, "getCacheKeys(...)");
            ArrayList arrayList2 = new ArrayList(listD.size());
            int size = listD.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = f83923a;
                d dVar = listD.get(i11);
                s.j(dVar, "get(...)");
                arrayList2.add(eVar.c(dVar));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    private final String c(d key) {
        String strA = key.a();
        s.j(strA, "getUriString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        s.j(charsetForName, "forName(...)");
        byte[] bytes = strA.getBytes(charsetForName);
        s.j(bytes, "getBytes(...)");
        String strA2 = xk.b.a(bytes);
        s.j(strA2, "makeSHA1HashBase64(...)");
        return strA2;
    }
}
