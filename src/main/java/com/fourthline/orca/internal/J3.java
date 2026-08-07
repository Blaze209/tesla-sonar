package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class J3 extends SA {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f26424e = Pattern.compile("(?s)/\\*.*?\\*/");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26425a;

        static {
            int[] iArr = new int[I3.i.values().length];
            f26425a = iArr;
            try {
                iArr[I3.i.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26425a[I3.i.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26425a[I3.i.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26425a[I3.i.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26425a[I3.i.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26425a[I3.i.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26425a[I3.i.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26425a[I3.i.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26425a[I3.i.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26425a[I3.i.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26425a[I3.i.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26425a[I3.i.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26425a[I3.i.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26425a[I3.i.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26425a[I3.i.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26425a[I3.i.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26425a[I3.i.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26425a[I3.i.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f26425a[I3.i.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26425a[I3.i.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26425a[I3.i.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26425a[I3.i.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26425a[I3.i.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26425a[I3.i.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26427b;

        b(int i11, int i12) {
            this.f26426a = i11;
            this.f26427b = i12;
        }
    }

    public J3(String str) {
        super(f26424e.matcher(str).replaceAll(""));
    }

    private int B() {
        int i11;
        if (c()) {
            return this.f27737b;
        }
        int i12 = this.f27737b;
        int iCharAt = this.f27736a.charAt(i12);
        if (iCharAt == 45) {
            iCharAt = a();
        }
        if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 45 && iCharAt != 95 && iCharAt < 128)) {
            i11 = i12;
        } else {
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && ((iA < 48 || iA > 57) && iA != 45 && iA != 95 && iA < 128))) {
                    break;
                }
                iA = a();
            }
            i11 = this.f27737b;
        }
        this.f27737b = i12;
        return i11;
    }

    private int c(int i11) {
        if (i11 >= 48 && i11 <= 57) {
            return i11 - 48;
        }
        if (i11 >= 65 && i11 <= 70) {
            return i11 - 55;
        }
        if (i11 < 97 || i11 > 102) {
            return -1;
        }
        return i11 - 87;
    }

    private b r() {
        Yh yhA;
        b bVar;
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        int i12 = 1;
        if (a("odd")) {
            bVar = new b(2, 1);
        } else {
            if (a("even")) {
                bVar = new b(2, 0);
            } else {
                int i13 = (!a('+') && a(CoreConstants.DASH_CHAR)) ? -1 : 1;
                Yh yhA2 = Yh.a(this.f27736a, this.f27737b, this.f27738c, false);
                if (yhA2 != null) {
                    this.f27737b = yhA2.a();
                }
                if (a('n') || a('N')) {
                    if (yhA2 == null) {
                        yhA2 = new Yh(1L, this.f27737b);
                    }
                    q();
                    boolean zA = a('+');
                    if (!zA && (zA = a(CoreConstants.DASH_CHAR))) {
                        i12 = -1;
                    }
                    if (zA) {
                        q();
                        yhA = Yh.a(this.f27736a, this.f27737b, this.f27738c, false);
                        if (yhA == null) {
                            this.f27737b = i11;
                            return null;
                        }
                        this.f27737b = yhA.a();
                        int i14 = i12;
                        i12 = i13;
                        i13 = i14;
                    } else {
                        int i15 = i12;
                        i12 = i13;
                        i13 = i15;
                        yhA = null;
                    }
                } else {
                    yhA = yhA2;
                    yhA2 = null;
                }
                bVar = new b(yhA2 == null ? 0 : i12 * yhA2.b(), yhA != null ? i13 * yhA.b() : 0);
            }
        }
        q();
        if (a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return bVar;
        }
        this.f27737b = i11;
        return null;
    }

    private String s() {
        if (c()) {
            return null;
        }
        String strJ = j();
        return strJ != null ? strJ : v();
    }

    private List u() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        ArrayList arrayList = null;
        do {
            String strV = v();
            if (strV == null) {
                this.f27737b = i11;
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strV);
            q();
        } while (p());
        if (a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return arrayList;
        }
        this.f27737b = i11;
        return null;
    }

    private List y() {
        List list;
        List list2;
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        List listZ = z();
        if (listZ == null) {
            this.f27737b = i11;
            return null;
        }
        if (!a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            this.f27737b = i11;
            return null;
        }
        Iterator it = listZ.iterator();
        while (it.hasNext() && (list = ((I3.r) it.next()).f26251a) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext() && (list2 = ((I3.s) it2.next()).f26256d) != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((I3.f) it3.next()) instanceof I3.j) {
                        return null;
                    }
                }
            }
        }
        return listZ;
    }

    public String A() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        if (!a("url(")) {
            return null;
        }
        q();
        String strT = t();
        if (strT == null) {
            strT = w();
        }
        if (strT == null) {
            this.f27737b = i11;
            return null;
        }
        q();
        if (c() || a(")")) {
            return strT;
        }
        this.f27737b = i11;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    boolean a(I3.r rVar) throws H3 {
        I3.d dVar;
        I3.s sVar;
        I3.c cVar;
        String strS;
        if (c()) {
            return false;
        }
        int i11 = this.f27737b;
        if (rVar.d()) {
            dVar = null;
        } else if (a('>')) {
            dVar = I3.d.CHILD;
            q();
        } else if (a('+')) {
            dVar = I3.d.FOLLOWS;
            q();
        } else {
            dVar = null;
        }
        if (a('*')) {
            sVar = new I3.s(dVar, null);
        } else {
            String strV = v();
            if (strV != null) {
                I3.s sVar2 = new I3.s(dVar, strV);
                rVar.b();
                sVar = sVar2;
            } else {
                sVar = null;
            }
        }
        while (!c()) {
            if (!a(CoreConstants.DOT)) {
                if (!a('#')) {
                    if (!a('[')) {
                        if (!a(CoreConstants.COLON_CHAR)) {
                            break;
                        }
                        if (sVar == null) {
                            sVar = new I3.s(dVar, null);
                        }
                        a(rVar, sVar);
                    } else {
                        if (sVar == null) {
                            sVar = new I3.s(dVar, null);
                        }
                        q();
                        String strV2 = v();
                        if (strV2 == null) {
                            throw new H3("Invalid attribute simpleSelectors");
                        }
                        q();
                        if (a('=')) {
                            cVar = I3.c.EQUALS;
                        } else if (a("~=")) {
                            cVar = I3.c.INCLUDES;
                        } else {
                            cVar = a("|=") ? I3.c.DASHMATCH : null;
                        }
                        if (cVar != null) {
                            q();
                            strS = s();
                            if (strS == null) {
                                throw new H3("Invalid attribute simpleSelectors");
                            }
                            q();
                        } else {
                            strS = null;
                        }
                        if (!a(']')) {
                            throw new H3("Invalid attribute simpleSelectors");
                        }
                        if (cVar == null) {
                            cVar = I3.c.EXISTS;
                        }
                        sVar.a(strV2, cVar, strS);
                        rVar.a();
                    }
                } else {
                    if (sVar == null) {
                        sVar = new I3.s(dVar, null);
                    }
                    String strV3 = v();
                    if (strV3 == null) {
                        throw new H3("Invalid \"#id\" simpleSelectors");
                    }
                    sVar.a("id", I3.c.EQUALS, strV3);
                    rVar.c();
                }
            } else {
                if (sVar == null) {
                    sVar = new I3.s(dVar, null);
                }
                String strV4 = v();
                if (strV4 == null) {
                    throw new H3("Invalid \".class\" simpleSelectors");
                }
                sVar.a(Action.CLASS_ATTRIBUTE, I3.c.EQUALS, strV4);
                rVar.a();
            }
        }
        if (sVar != null) {
            rVar.a(sVar);
            return true;
        }
        this.f27737b = i11;
        return false;
    }

    public String t() {
        int iC;
        if (c()) {
            return null;
        }
        char cCharAt = this.f27736a.charAt(this.f27737b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f27737b++;
        int iIntValue = e().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = e().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = e().intValue();
                    } else {
                        int iC2 = c(iIntValue);
                        if (iC2 != -1) {
                            for (int i11 = 1; i11 <= 5 && (iC = c((iIntValue = e().intValue()))) != -1; i11++) {
                                iC2 = (iC2 * 16) + iC;
                            }
                            sb2.append((char) iC2);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = e().intValue();
        }
        return sb2.toString();
    }

    public String v() {
        int iB = B();
        int i11 = this.f27737b;
        if (iB == i11) {
            return null;
        }
        String strSubstring = this.f27736a.substring(i11, iB);
        this.f27737b = iB;
        return strSubstring;
    }

    String w() {
        char cCharAt;
        int iC;
        StringBuilder sb2 = new StringBuilder();
        while (!c() && (cCharAt = this.f27736a.charAt(this.f27737b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !b((int) cCharAt) && !Character.isISOControl((int) cCharAt)) {
            this.f27737b++;
            if (cCharAt == '\\') {
                if (!c()) {
                    String str = this.f27736a;
                    int i11 = this.f27737b;
                    this.f27737b = i11 + 1;
                    cCharAt = str.charAt(i11);
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                        int iC2 = c((int) cCharAt);
                        if (iC2 != -1) {
                            for (int i12 = 1; i12 <= 5 && !c() && (iC = c((int) this.f27736a.charAt(this.f27737b))) != -1; i12++) {
                                this.f27737b++;
                                iC2 = (iC2 * 16) + iC;
                            }
                            sb2.append((char) iC2);
                        }
                    }
                }
            }
            sb2.append(cCharAt);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String x() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        int iCharAt = this.f27736a.charAt(i11);
        int i12 = i11;
        while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !a(iCharAt)) {
            if (!b(iCharAt)) {
                i12 = this.f27737b + 1;
            }
            iCharAt = a();
        }
        if (this.f27737b > i11) {
            return this.f27736a.substring(i11, i12);
        }
        this.f27737b = i11;
        return null;
    }

    public List z() {
        if (c()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        I3.r rVar = new I3.r();
        while (!c() && a(rVar)) {
            if (p()) {
                arrayList.add(rVar);
                rVar = new I3.r();
            }
        }
        if (!rVar.d()) {
            arrayList.add(rVar);
        }
        return arrayList;
    }

    private void a(I3.r rVar, I3.s sVar) throws H3 {
        I3.f gVar;
        I3.f fVar;
        I3.f fVar2;
        String strV = v();
        if (strV != null) {
            I3.i iVarA = I3.i.a(strV);
            switch (a.f26425a[iVarA.ordinal()]) {
                case 1:
                    I3.f gVar2 = new I3.g(0, 1, true, false, null);
                    rVar.a();
                    fVar2 = gVar2;
                    fVar = fVar2;
                    sVar.a(fVar);
                    return;
                case 2:
                    gVar = new I3.g(0, 1, false, false, null);
                    rVar.a();
                    fVar = gVar;
                    sVar.a(fVar);
                    return;
                case 3:
                    I3.f lVar = new I3.l(false, null);
                    rVar.a();
                    fVar = lVar;
                    sVar.a(fVar);
                    return;
                case 4:
                    gVar = new I3.g(0, 1, true, true, sVar.f26254b);
                    rVar.a();
                    fVar = gVar;
                    sVar.a(fVar);
                    return;
                case 5:
                    I3.f gVar3 = new I3.g(0, 1, false, true, sVar.f26254b);
                    rVar.a();
                    fVar = gVar3;
                    sVar.a(fVar);
                    return;
                case 6:
                    I3.f lVar2 = new I3.l(true, sVar.f26254b);
                    rVar.a();
                    fVar = lVar2;
                    sVar.a(fVar);
                    return;
                case 7:
                    I3.f mVar = new I3.m();
                    rVar.a();
                    fVar = mVar;
                    sVar.a(fVar);
                    return;
                case 8:
                    I3.f hVar = new I3.h();
                    rVar.a();
                    fVar = hVar;
                    sVar.a(fVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z11 = iVarA == I3.i.nth_child || iVarA == I3.i.nth_of_type;
                    boolean z12 = iVarA == I3.i.nth_of_type || iVarA == I3.i.nth_last_of_type;
                    b bVarR = r();
                    if (bVarR != null) {
                        gVar = new I3.g(bVarR.f26426a, bVarR.f26427b, z11, z12, sVar.f26254b);
                        rVar.a();
                        fVar = gVar;
                        sVar.a(fVar);
                        return;
                    }
                    throw new H3("Invalid or missing parameter section for pseudo class: " + strV);
                case 13:
                    List listY = y();
                    if (listY != null) {
                        I3.j jVar = new I3.j(listY);
                        rVar.f26252b = jVar.a();
                        fVar2 = jVar;
                        fVar = fVar2;
                        sVar.a(fVar);
                        return;
                    }
                    throw new H3("Invalid or missing parameter section for pseudo class: " + strV);
                case 14:
                    I3.f nVar = new I3.n();
                    rVar.a();
                    fVar = nVar;
                    sVar.a(fVar);
                    return;
                case 15:
                    u();
                    I3.f kVar = new I3.k(strV);
                    rVar.a();
                    fVar = kVar;
                    sVar.a(fVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    I3.f kVar2 = new I3.k(strV);
                    rVar.a();
                    fVar = kVar2;
                    sVar.a(fVar);
                    return;
                default:
                    throw new H3("Unsupported pseudo class: " + strV);
            }
        }
        throw new H3("Invalid pseudo class");
    }
}
