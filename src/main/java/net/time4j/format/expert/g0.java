package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f94318a;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f94319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f94320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f94321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f94322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<net.time4j.tz.k> f94323e;

        /* JADX INFO: Access modifiers changed from: private */
        public b j(net.time4j.tz.k kVar) {
            ArrayList arrayList = new ArrayList();
            List<net.time4j.tz.k> list = this.f94323e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(kVar);
            return new b(this.f94319a, this.f94320b, this.f94321c, this.f94322d, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b k(b bVar) {
            return new b(this.f94319a, bVar, this.f94321c, this.f94322d, this.f94323e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b l(b bVar) {
            return new b(this.f94319a, this.f94320b, bVar, this.f94322d, this.f94323e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b m(b bVar) {
            return new b(this.f94319a, this.f94320b, this.f94321c, bVar, this.f94323e);
        }

        private b(char c11) {
            this(c11, null, null, null, null);
        }

        private b(char c11, b bVar, b bVar2, b bVar3, List<net.time4j.tz.k> list) {
            this.f94319a = c11;
            this.f94320b = bVar;
            this.f94321c = bVar2;
            this.f94322d = bVar3;
            this.f94323e = list;
        }
    }

    g0(b bVar) {
        this.f94318a = bVar;
    }

    private void a(b bVar, StringBuilder sb2, List<String> list) {
        if (bVar == null) {
            return;
        }
        a(bVar.f94320b, sb2, list);
        if (bVar.f94323e != null) {
            list.add(sb2.toString() + bVar.f94319a);
        }
        b bVar2 = bVar.f94321c;
        sb2.append(bVar.f94319a);
        a(bVar2, sb2, list);
        sb2.deleteCharAt(sb2.length() - 1);
        a(bVar.f94322d, sb2, list);
    }

    private static b c(b bVar, String str, int i11) {
        if (bVar == null) {
            return null;
        }
        char cCharAt = str.charAt(i11);
        if (cCharAt < bVar.f94319a) {
            return c(bVar.f94320b, str, i11);
        }
        if (cCharAt > bVar.f94319a) {
            return c(bVar.f94322d, str, i11);
        }
        return i11 < str.length() + (-1) ? c(bVar.f94321c, str, i11 + 1) : bVar;
    }

    static b d(b bVar, String str, net.time4j.tz.k kVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty key cannot be inserted.");
        }
        if (kVar != null) {
            return e(bVar, str, kVar, 0);
        }
        throw new NullPointerException("Missing timezone id.");
    }

    private static b e(b bVar, String str, net.time4j.tz.k kVar, int i11) {
        char cCharAt = str.charAt(i11);
        if (bVar == null) {
            bVar = new b(cCharAt);
        }
        if (cCharAt < bVar.f94319a) {
            return bVar.k(e(bVar.f94320b, str, kVar, i11));
        }
        if (cCharAt > bVar.f94319a) {
            return bVar.m(e(bVar.f94322d, str, kVar, i11));
        }
        return i11 < str.length() + (-1) ? bVar.l(e(bVar.f94321c, str, kVar, i11 + 1)) : bVar.j(kVar);
    }

    List<net.time4j.tz.k> b(String str) {
        if (str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        b bVarC = c(this.f94318a, str, 0);
        return bVarC == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(bVarC.f94323e);
    }

    String f(CharSequence charSequence, int i11) {
        b bVar = this.f94318a;
        int length = charSequence.length();
        int i12 = i11;
        int i13 = i12;
        while (bVar != null && i12 < length) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt < bVar.f94319a) {
                bVar = bVar.f94320b;
            } else if (cCharAt > bVar.f94319a) {
                bVar = bVar.f94322d;
            } else {
                i12++;
                if (bVar.f94323e != null) {
                    i13 = i12;
                }
                bVar = bVar.f94321c;
            }
        }
        return i11 >= i13 ? "" : charSequence.subSequence(i11, i13).toString();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        a(this.f94318a, new StringBuilder(), arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(arrayList.size());
        sb2.append(",labels={");
        for (String str : arrayList) {
            sb2.append(str);
            sb2.append("=>");
            sb2.append(b(str));
            sb2.append(CoreConstants.COMMA_CHAR);
        }
        sb2.deleteCharAt(sb2.length() - 1).append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
