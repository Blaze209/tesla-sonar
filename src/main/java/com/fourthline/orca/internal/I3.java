package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f26183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f26184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26185c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26186a;

        static {
            int[] iArr = new int[c.values().length];
            f26186a = iArr;
            try {
                iArr[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26186a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26186a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f26188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26189c;

        b(String str, c cVar, String str2) {
            this.f26187a = str;
            this.f26188b = cVar;
            this.f26189c = str2;
        }
    }

    enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    enum d {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum e {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    interface f {
        boolean a(p pVar, Vw.L l11);
    }

    static class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f26213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f26214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f26215e;

        g(int i11, int i12, boolean z11, boolean z12, String str) {
            this.f26211a = i11;
            this.f26212b = i12;
            this.f26213c = z11;
            this.f26214d = z12;
            this.f26215e = str;
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            int i11;
            int i12;
            String strG = (this.f26214d && this.f26215e == null) ? l11.g() : this.f26215e;
            Vw.J j11 = l11.f29262b;
            if (j11 != null) {
                Iterator it = j11.getChildren().iterator();
                i11 = 0;
                i12 = 0;
                while (it.hasNext()) {
                    Vw.L l12 = (Vw.L) ((Vw.N) it.next());
                    if (l12 == l11) {
                        i11 = i12;
                    }
                    if (strG == null || l12.g().equals(strG)) {
                        i12++;
                    }
                }
            } else {
                i11 = 0;
                i12 = 1;
            }
            int i13 = this.f26213c ? i11 + 1 : i12 - i11;
            int i14 = this.f26211a;
            if (i14 == 0) {
                return i13 == this.f26212b;
            }
            int i15 = i13 - this.f26212b;
            return i15 % i14 == 0 && (Integer.signum(i15) == 0 || Integer.signum(i13 - this.f26212b) == Integer.signum(this.f26211a));
        }

        public String toString() {
            String str = this.f26213c ? "" : "last-";
            return this.f26214d ? String.format(Locale.US, "nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f26211a), Integer.valueOf(this.f26212b), this.f26215e) : String.format(Locale.US, "nth-%schild(%dn%+d)", str, Integer.valueOf(this.f26211a), Integer.valueOf(this.f26212b));
        }
    }

    static class h implements f {
        h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            return !(l11 instanceof Vw.J) || ((Vw.J) l11).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    enum i {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Map f26241z = new HashMap();

        static {
            for (i iVar : values()) {
                if (iVar != UNSUPPORTED) {
                    f26241z.put(iVar.name().replace('_', CoreConstants.DASH_CHAR), iVar);
                }
            }
        }

        public static i a(String str) {
            i iVar = (i) f26241z.get(str);
            return iVar != null ? iVar : UNSUPPORTED;
        }
    }

    static class k implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26243a;

        k(String str) {
            this.f26243a = str;
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            return false;
        }

        public String toString() {
            return this.f26243a;
        }
    }

    static class l implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f26244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26245b;

        public l(boolean z11, String str) {
            this.f26244a = z11;
            this.f26245b = str;
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            int i11;
            String strG = (this.f26244a && this.f26245b == null) ? l11.g() : this.f26245b;
            Vw.J j11 = l11.f29262b;
            if (j11 != null) {
                Iterator it = j11.getChildren().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    Vw.L l12 = (Vw.L) ((Vw.N) it.next());
                    if (strG == null || l12.g().equals(strG)) {
                        i11++;
                    }
                }
            } else {
                i11 = 1;
            }
            return i11 == 1;
        }

        public String toString() {
            return this.f26244a ? String.format("only-of-type <%s>", this.f26245b) : "only-child";
        }
    }

    static class m implements f {
        m() {
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            return l11.f29262b == null;
        }

        public String toString() {
            return "root";
        }
    }

    static class n implements f {
        n() {
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            return pVar != null && l11 == pVar.f26249a;
        }

        public String toString() {
            return "target";
        }
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r f26246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DA f26247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final t f26248c;

        o(r rVar, DA da2, t tVar) {
            this.f26246a = rVar;
            this.f26247b = da2;
            this.f26248c = tVar;
        }

        public String toString() {
            return this.f26246a + " {...} (src=" + this.f26248c + ")";
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Vw.L f26249a;

        p() {
        }

        public String toString() {
            Vw.L l11 = this.f26249a;
            return l11 != null ? String.format("<%s id=\"%s\">", l11.g(), this.f26249a.f29252c) : "";
        }
    }

    public enum t {
        Document,
        RenderOptions
    }

    I3(t tVar, Ww ww2) {
        this(e.screen, tVar, ww2);
    }

    private static List b(J3 j11) {
        String strM;
        ArrayList arrayList = new ArrayList();
        while (!j11.c() && (strM = j11.m()) != null) {
            try {
                arrayList.add(e.valueOf(strM));
            } catch (IllegalArgumentException unused) {
            }
            if (!j11.p()) {
                break;
            }
        }
        return arrayList;
    }

    private q c(J3 j11) {
        q qVar = new q();
        while (!j11.c()) {
            try {
                if (!j11.a("<!--") && !j11.a("-->")) {
                    if (!j11.a('@')) {
                        if (!b(qVar, j11)) {
                            break;
                        }
                    } else {
                        a(qVar, j11);
                    }
                }
            } catch (H3 e11) {
                e11.getMessage();
                return qVar;
            }
        }
        return qVar;
    }

    private void d(J3 j11) {
        int i11 = 0;
        while (!j11.c()) {
            int iIntValue = j11.e().intValue();
            if (iIntValue == 59 && i11 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i11++;
            } else if (iIntValue == 125 && i11 > 0 && (i11 = i11 - 1) == 0) {
                return;
            }
        }
    }

    q a(String str) {
        J3 j11 = new J3(str);
        j11.q();
        return c(j11);
    }

    static class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f26242a;

        j(List list) {
            this.f26242a = list;
        }

        @Override // com.fourthline.orca.internal.I3.f
        public boolean a(p pVar, Vw.L l11) {
            Iterator it = this.f26242a.iterator();
            while (it.hasNext()) {
                if (I3.a(pVar, (r) it.next(), l11)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.f26242a + ")";
        }

        int a() {
            Iterator it = this.f26242a.iterator();
            int i11 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i12 = ((r) it.next()).f26252b;
                if (i12 > i11) {
                    i11 = i12;
                }
            }
            return i11;
        }
    }

    I3(e eVar, t tVar, Ww ww2) {
        this.f26185c = false;
        this.f26183a = eVar;
        this.f26184b = tVar;
    }

    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f26251a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26252b = 0;

        r() {
        }

        void a(s sVar) {
            if (this.f26251a == null) {
                this.f26251a = new ArrayList();
            }
            this.f26251a.add(sVar);
        }

        void b() {
            this.f26252b++;
        }

        void c() {
            this.f26252b += 1000000;
        }

        boolean d() {
            List list = this.f26251a;
            return list == null || list.isEmpty();
        }

        int e() {
            List list = this.f26251a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f26251a.iterator();
            while (it.hasNext()) {
                sb2.append((s) it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f26252b);
            sb2.append(']');
            return sb2.toString();
        }

        s a(int i11) {
            return (s) this.f26251a.get(i11);
        }

        void a() {
            this.f26252b += 1000;
        }
    }

    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d f26253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f26254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f26255c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f26256d = null;

        s(d dVar, String str) {
            this.f26253a = dVar == null ? d.DESCENDANT : dVar;
            this.f26254b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f26255c == null) {
                this.f26255c = new ArrayList();
            }
            this.f26255c.add(new b(str, cVar, str2));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            d dVar = this.f26253a;
            if (dVar == d.CHILD) {
                sb2.append("> ");
            } else if (dVar == d.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f26254b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb2.append(str);
            List<b> list = this.f26255c;
            if (list != null) {
                for (b bVar : list) {
                    sb2.append('[');
                    sb2.append(bVar.f26187a);
                    int i11 = a.f26186a[bVar.f26188b.ordinal()];
                    if (i11 == 1) {
                        sb2.append('=');
                        sb2.append(bVar.f26189c);
                    } else if (i11 == 2) {
                        sb2.append("~=");
                        sb2.append(bVar.f26189c);
                    } else if (i11 == 3) {
                        sb2.append("|=");
                        sb2.append(bVar.f26189c);
                    }
                    sb2.append(']');
                }
            }
            List<f> list2 = this.f26256d;
            if (list2 != null) {
                for (f fVar : list2) {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(fVar);
                }
            }
            return sb2.toString();
        }

        void a(f fVar) {
            if (this.f26256d == null) {
                this.f26256d = new ArrayList();
            }
            this.f26256d.add(fVar);
        }
    }

    static boolean a(String str, e eVar) {
        J3 j11 = new J3(str);
        j11.q();
        return a(b(j11), eVar);
    }

    private boolean b(q qVar, J3 j11) throws H3 {
        List listZ = j11.z();
        if (listZ == null || listZ.isEmpty()) {
            return false;
        }
        if (j11.a(CoreConstants.CURLY_LEFT)) {
            j11.q();
            DA daA = a(j11);
            j11.q();
            Iterator it = listZ.iterator();
            while (it.hasNext()) {
                qVar.a(new o((r) it.next(), daA, this.f26184b));
            }
            return true;
        }
        throw new H3("Malformed rule block: expected '{'");
    }

    private static void a(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f26250a = null;

        void a(o oVar) {
            if (this.f26250a == null) {
                this.f26250a = new LinkedList();
            }
            ListIterator listIterator = this.f26250a.listIterator();
            while (listIterator.hasNext()) {
                int iNextIndex = listIterator.nextIndex();
                if (((o) listIterator.next()).f26246a.f26252b > oVar.f26246a.f26252b) {
                    this.f26250a.add(iNextIndex, oVar);
                    return;
                }
            }
            this.f26250a.add(oVar);
        }

        public boolean b() {
            List list = this.f26250a;
            return list == null || list.isEmpty();
        }

        public String toString() {
            if (this.f26250a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f26250a.iterator();
            while (it.hasNext()) {
                sb2.append(((o) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }

        public void a(q qVar) {
            if (qVar.f26250a == null) {
                return;
            }
            if (this.f26250a == null) {
                this.f26250a = new LinkedList();
            }
            Iterator it = qVar.f26250a.iterator();
            while (it.hasNext()) {
                a((o) it.next());
            }
        }

        public List a() {
            return this.f26250a;
        }

        public void a(t tVar) {
            List list = this.f26250a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((o) it.next()).f26248c == tVar) {
                    it.remove();
                }
            }
        }
    }

    private static boolean a(List list, e eVar) {
        if (list.size() == 0) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2 == e.all || eVar2 == eVar) {
                return true;
            }
        }
        return false;
    }

    private void a(q qVar, J3 j11) throws H3 {
        String strV = j11.v();
        j11.q();
        if (strV != null) {
            if (!this.f26185c && strV.equals("media")) {
                List listB = b(j11);
                if (j11.a(CoreConstants.CURLY_LEFT)) {
                    j11.q();
                    if (a(listB, this.f26183a)) {
                        this.f26185c = true;
                        qVar.a(c(j11));
                        this.f26185c = false;
                    } else {
                        c(j11);
                    }
                    if (!j11.c() && !j11.a(CoreConstants.CURLY_RIGHT)) {
                        throw new H3("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new H3("Invalid @media rule: missing rule set");
                }
            } else if (!this.f26185c && strV.equals("import")) {
                String strA = j11.A();
                if (strA == null) {
                    strA = j11.t();
                }
                if (strA != null) {
                    j11.q();
                    b(j11);
                    if (!j11.c() && !j11.a(';')) {
                        throw new H3("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new H3("Invalid @import rule: expected string or url()");
                }
            } else {
                a("Ignoring @%s rule", strV);
                d(j11);
            }
            j11.q();
            return;
        }
        throw new H3("Invalid '@' rule");
    }

    public static List b(String str) {
        J3 j11 = new J3(str);
        ArrayList arrayList = null;
        while (!j11.c()) {
            String strK = j11.k();
            if (strK != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strK);
                j11.q();
            }
        }
        return arrayList;
    }

    private DA a(J3 j11) throws H3 {
        DA da2 = new DA();
        do {
            String strV = j11.v();
            j11.q();
            if (j11.a(CoreConstants.COLON_CHAR)) {
                j11.q();
                String strX = j11.x();
                if (strX != null) {
                    j11.q();
                    if (j11.a('!')) {
                        j11.q();
                        if (j11.a("important")) {
                            j11.q();
                        } else {
                            throw new H3("Malformed rule set: found unexpected '!'");
                        }
                    }
                    j11.a(';');
                    DA.a(da2, strV, strX, false);
                    j11.q();
                    if (j11.c()) {
                        break;
                    }
                } else {
                    throw new H3("Expected property value");
                }
            } else {
                throw new H3("Expected ':'");
            }
        } while (!j11.a(CoreConstants.CURLY_RIGHT));
        return da2;
    }

    static boolean a(p pVar, r rVar, Vw.L l11) {
        if (rVar.e() == 1) {
            return a(pVar, rVar.a(0), l11);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj = l11.f29262b; obj != null; obj = ((Vw.N) obj).f29262b) {
            arrayList.add(obj);
        }
        Collections.reverse(arrayList);
        return a(pVar, rVar, rVar.e() - 1, arrayList, arrayList.size() - 1, l11);
    }

    private static boolean a(p pVar, r rVar, int i11, List list, int i12, Vw.L l11) {
        s sVarA = rVar.a(i11);
        if (!a(pVar, sVarA, l11)) {
            return false;
        }
        d dVar = sVarA.f26253a;
        if (dVar == d.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 >= 0) {
                if (a(pVar, rVar, i11 - 1, list, i12)) {
                    return true;
                }
                i12--;
            }
            return false;
        }
        if (dVar == d.CHILD) {
            return a(pVar, rVar, i11 - 1, list, i12);
        }
        int iA = a(list, i12, l11);
        if (iA <= 0) {
            return false;
        }
        return a(pVar, rVar, i11 - 1, list, i12, (Vw.L) l11.f29262b.getChildren().get(iA - 1));
    }

    private static boolean a(p pVar, r rVar, int i11, List list, int i12) {
        s sVarA = rVar.a(i11);
        Vw.L l11 = (Vw.L) list.get(i12);
        if (!a(pVar, sVarA, l11)) {
            return false;
        }
        d dVar = sVarA.f26253a;
        if (dVar == d.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 > 0) {
                i12--;
                if (a(pVar, rVar, i11 - 1, list, i12)) {
                    return true;
                }
            }
            return false;
        }
        if (dVar == d.CHILD) {
            return a(pVar, rVar, i11 - 1, list, i12 - 1);
        }
        int iA = a(list, i12, l11);
        if (iA <= 0) {
            return false;
        }
        return a(pVar, rVar, i11 - 1, list, i12, (Vw.L) l11.f29262b.getChildren().get(iA - 1));
    }

    private static int a(List list, int i11, Vw.L l11) {
        int i12 = 0;
        if (i11 < 0) {
            return 0;
        }
        Object obj = list.get(i11);
        Vw.J j11 = l11.f29262b;
        if (obj != j11) {
            return -1;
        }
        Iterator it = j11.getChildren().iterator();
        while (it.hasNext()) {
            if (((Vw.N) it.next()) == l11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    private static boolean a(p pVar, s sVar, Vw.L l11) {
        List list;
        String str = sVar.f26254b;
        if (str != null && !str.equals(l11.g().toLowerCase(Locale.US))) {
            return false;
        }
        List list2 = sVar.f26255c;
        if (list2 != null) {
            int size = list2.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) sVar.f26255c.get(i11);
                String str2 = bVar.f26187a;
                str2.getClass();
                if (!str2.equals("id")) {
                    if (!str2.equals(Action.CLASS_ATTRIBUTE) || (list = l11.f29256g) == null || !list.contains(bVar.f26189c)) {
                        return false;
                    }
                } else if (!bVar.f26189c.equals(l11.f29252c)) {
                    return false;
                }
            }
        }
        List list3 = sVar.f26256d;
        if (list3 == null) {
            return true;
        }
        int size2 = list3.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (!((f) sVar.f26256d.get(i12)).a(pVar, l11)) {
                return false;
            }
        }
        return true;
    }
}
