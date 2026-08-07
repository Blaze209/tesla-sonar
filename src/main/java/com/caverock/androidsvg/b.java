package com.caverock.androidsvg;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f21183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f21184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21185c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21187b;

        static {
            int[] iArr = new int[j.values().length];
            f21187b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21187b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21187b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21187b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21187b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21187b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21187b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21187b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21187b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21187b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21187b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21187b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21187b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21187b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21187b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21187b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21187b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21187b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21187b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21187b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21187b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21187b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21187b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21187b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f21186a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21186a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21186a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.b$b, reason: collision with other inner class name */
    private static class C0424b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f21189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21190c;

        C0424b(String str, c cVar, String str2) {
            this.f21188a = str;
            this.f21189b = cVar;
            this.f21190c = str2;
        }
    }

    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private static class d extends com.caverock.androidsvg.i.C0428i {

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21192b;

            a(int i11, int i12) {
                this.f21191a = i11;
                this.f21192b = i12;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i11) {
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

        private a D() {
            com.caverock.androidsvg.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            if (!f(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                return null;
            }
            A();
            int i12 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i13 = (!f('+') && f(CoreConstants.DASH_CHAR)) ? -1 : 1;
                    com.caverock.androidsvg.c cVarC2 = com.caverock.androidsvg.c.c(this.f21496a, this.f21497b, this.f21498c, false);
                    if (cVarC2 != null) {
                        this.f21497b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new com.caverock.androidsvg.c(1L, this.f21497b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f(CoreConstants.DASH_CHAR))) {
                            i12 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = com.caverock.androidsvg.c.c(this.f21496a, this.f21497b, this.f21498c, false);
                            if (cVarC == null) {
                                this.f21497b = i11;
                                return null;
                            }
                            this.f21497b = cVarC.a();
                            int i14 = i12;
                            i12 = i13;
                            i13 = i14;
                        } else {
                            int i15 = i12;
                            i12 = i13;
                            i13 = i15;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i12 * cVarC2.d(), cVarC != null ? i13 * cVarC.d() : 0);
                }
            }
            A();
            if (f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                return aVar;
            }
            this.f21497b = i11;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        private List<String> G() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            if (!f(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f21497b = i11;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                return arrayList;
            }
            this.f21497b = i11;
            return null;
        }

        private List<s> K() {
            List<t> list;
            List<g> list2;
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            if (!f(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                return null;
            }
            A();
            List<s> listL = L();
            if (listL == null) {
                this.f21497b = i11;
                return null;
            }
            if (!f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                this.f21497b = i11;
                return null;
            }
            Iterator<s> it = listL.iterator();
            while (it.hasNext() && (list = it.next().f21208a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f21213d) != null) {
                    Iterator<g> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<s> L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        private void O(s sVar, t tVar) throws com.caverock.androidsvg.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new com.caverock.androidsvg.a("Invalid pseudo class");
            }
            j jVarFromString = j.fromString(strH);
            a aVar = null;
            switch (a.f21187b[jVarFromString.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f21211b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f21211b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f21211b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z11 = jVarFromString == j.nth_child || jVarFromString == j.nth_of_type;
                    boolean z12 = jVarFromString == j.nth_of_type || jVarFromString == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new com.caverock.androidsvg.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f21191a, aVarD.f21192b, z11, z12, tVar.f21211b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List<s> listK = K();
                    if (listK == null) {
                        throw new com.caverock.androidsvg.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.f21209b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    g oVar = new o(aVar);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
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
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new com.caverock.androidsvg.a("Unsupported pseudo class: " + strH);
            }
        }

        private int P() {
            int i11;
            if (h()) {
                return this.f21497b;
            }
            int i12 = this.f21497b;
            int iCharAt = this.f21496a.charAt(i12);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i11 = i12;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i11 = this.f21497b;
            }
            this.f21497b = i12;
            return i11;
        }

        String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f21496a.charAt(this.f21497b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f21497b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i11++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb2.toString();
        }

        String H() {
            int iP = P();
            int i11 = this.f21497b;
            if (iP == i11) {
                return null;
            }
            String strSubstring = this.f21496a.substring(i11, iP);
            this.f21497b = iP;
            return strSubstring;
        }

        String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f21496a.charAt(this.f21497b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f21497b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f21496a;
                        int i11 = this.f21497b;
                        this.f21497b = i11 + 1;
                        cCharAt = str.charAt(i11);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i12 = 1; i12 <= 5 && !h() && (iC = C(this.f21496a.charAt(this.f21497b))) != -1; i12++) {
                                    this.f21497b++;
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

        String J() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            int iCharAt = this.f21496a.charAt(i11);
            int i12 = i11;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i12 = this.f21497b + 1;
                }
                iCharAt = a();
            }
            if (this.f21497b > i11) {
                return this.f21496a.substring(i11, i12);
            }
            this.f21497b = i11;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        boolean M(s sVar) throws com.caverock.androidsvg.a {
            e eVar;
            t tVar;
            c cVar;
            String strE;
            if (h()) {
                return false;
            }
            int i11 = this.f21497b;
            if (sVar.f()) {
                eVar = null;
            } else if (f('>')) {
                eVar = e.CHILD;
                A();
            } else if (f('+')) {
                eVar = e.FOLLOWS;
                A();
            } else {
                eVar = null;
            }
            if (f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strH = H();
                if (strH != null) {
                    t tVar2 = new t(eVar, strH);
                    sVar.c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!h()) {
                if (!f(CoreConstants.DOT)) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(CoreConstants.COLON_CHAR)) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new com.caverock.androidsvg.a("Invalid attribute simpleSelectors");
                            }
                            A();
                            if (f('=')) {
                                cVar = c.EQUALS;
                            } else if (g("~=")) {
                                cVar = c.INCLUDES;
                            } else {
                                cVar = g("|=") ? c.DASHMATCH : null;
                            }
                            if (cVar != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new com.caverock.androidsvg.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new com.caverock.androidsvg.a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.a(strH2, cVar, strE);
                            sVar.b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new com.caverock.androidsvg.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strH3);
                        sVar.d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new com.caverock.androidsvg.a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.a(Action.CLASS_ATTRIBUTE, c.EQUALS, strH4);
                    sVar.b();
                }
            }
            if (tVar != null) {
                sVar.a(tVar);
                return true;
            }
            this.f21497b = i11;
            return false;
        }

        String N() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f21497b = i11;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.f21497b = i11;
            return null;
        }
    }

    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum f {
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

    private interface g {
        boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var);
    }

    private static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f21198e;

        h(int i11, int i12, boolean z11, boolean z12, String str) {
            this.f21194a = i11;
            this.f21195b = i12;
            this.f21196c = z11;
            this.f21197d = z12;
            this.f21198e = str;
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            int i11;
            int i12;
            String strM = (this.f21197d && this.f21198e == null) ? l0Var.m() : this.f21198e;
            com.caverock.androidsvg.g.j0 j0Var = l0Var.f21350b;
            if (j0Var != null) {
                Iterator<com.caverock.androidsvg.g.n0> it = j0Var.getChildren().iterator();
                i11 = 0;
                i12 = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.g.l0 l0Var2 = (com.caverock.androidsvg.g.l0) it.next();
                    if (l0Var2 == l0Var) {
                        i11 = i12;
                    }
                    if (strM == null || l0Var2.m().equals(strM)) {
                        i12++;
                    }
                }
            } else {
                i11 = 0;
                i12 = 1;
            }
            int i13 = this.f21196c ? i11 + 1 : i12 - i11;
            int i14 = this.f21194a;
            if (i14 == 0) {
                return i13 == this.f21195b;
            }
            int i15 = this.f21195b;
            return (i13 - i15) % i14 == 0 && (Integer.signum(i13 - i15) == 0 || Integer.signum(i13 - this.f21195b) == Integer.signum(this.f21194a));
        }

        public String toString() {
            String str = this.f21196c ? "" : "last-";
            return this.f21197d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f21194a), Integer.valueOf(this.f21195b), this.f21198e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f21194a), Integer.valueOf(this.f21195b));
        }
    }

    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            return !(l0Var instanceof com.caverock.androidsvg.g.j0) || ((com.caverock.androidsvg.g.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private enum j {
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

        private static final Map<String, j> cache = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    cache.put(jVar.name().replace('_', CoreConstants.DASH_CHAR), jVar);
                }
            }
        }

        public static j fromString(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    private static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<s> f21199a;

        k(List<s> list) {
            this.f21199a = list;
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            Iterator<s> it = this.f21199a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator<s> it = this.f21199a.iterator();
            int i11 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i12 = it.next().f21209b;
                if (i12 > i11) {
                    i11 = i12;
                }
            }
            return i11;
        }

        public String toString() {
            return "not(" + this.f21199a + ")";
        }
    }

    private static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21200a;

        l(String str) {
            this.f21200a = str;
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f21200a;
        }
    }

    private static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21202b;

        public m(boolean z11, String str) {
            this.f21201a = z11;
            this.f21202b = str;
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            int i11;
            String strM = (this.f21201a && this.f21202b == null) ? l0Var.m() : this.f21202b;
            com.caverock.androidsvg.g.j0 j0Var = l0Var.f21350b;
            if (j0Var != null) {
                Iterator<com.caverock.androidsvg.g.n0> it = j0Var.getChildren().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.g.l0 l0Var2 = (com.caverock.androidsvg.g.l0) it.next();
                    if (strM == null || l0Var2.m().equals(strM)) {
                        i11++;
                    }
                }
            } else {
                i11 = 1;
            }
            return i11 == 1;
        }

        public String toString() {
            return this.f21201a ? String.format("only-of-type <%s>", this.f21202b) : String.format("only-child", new Object[0]);
        }
    }

    private static class n implements g {
        private n() {
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            return l0Var.f21350b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private static class o implements g {
        private o() {
        }

        @Override // com.caverock.androidsvg.b.g
        public boolean a(q qVar, com.caverock.androidsvg.g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f21206a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f21203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.caverock.androidsvg.g.e0 f21204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u f21205c;

        p(s sVar, com.caverock.androidsvg.g.e0 e0Var, u uVar) {
            this.f21203a = sVar;
            this.f21204b = e0Var;
            this.f21205c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f21203a) + " {...} (src=" + this.f21205c + ")";
        }
    }

    static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.caverock.androidsvg.g.l0 f21206a;

        q() {
        }

        public String toString() {
            com.caverock.androidsvg.g.l0 l0Var = this.f21206a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.m(), this.f21206a.f21339c) : "";
        }
    }

    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<p> f21207a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f21207a == null) {
                this.f21207a = new ArrayList();
            }
            for (int i11 = 0; i11 < this.f21207a.size(); i11++) {
                if (this.f21207a.get(i11).f21203a.f21209b > pVar.f21203a.f21209b) {
                    this.f21207a.add(i11, pVar);
                    return;
                }
            }
            this.f21207a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f21207a == null) {
                return;
            }
            if (this.f21207a == null) {
                this.f21207a = new ArrayList(rVar.f21207a.size());
            }
            Iterator<p> it = rVar.f21207a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        List<p> c() {
            return this.f21207a;
        }

        boolean d() {
            List<p> list = this.f21207a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List<p> list = this.f21207a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f21205c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List<p> list = this.f21207a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f21207a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f21207a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    private static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f21210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f21211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<C0424b> f21212c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<g> f21213d = null;

        t(e eVar, String str) {
            this.f21210a = null;
            this.f21211b = null;
            this.f21210a = eVar == null ? e.DESCENDANT : eVar;
            this.f21211b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f21212c == null) {
                this.f21212c = new ArrayList();
            }
            this.f21212c.add(new C0424b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f21213d == null) {
                this.f21213d = new ArrayList();
            }
            this.f21213d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f21210a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f21211b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb2.append(str);
            List<C0424b> list = this.f21212c;
            if (list != null) {
                for (C0424b c0424b : list) {
                    sb2.append('[');
                    sb2.append(c0424b.f21188a);
                    int i11 = a.f21186a[c0424b.f21189b.ordinal()];
                    if (i11 == 1) {
                        sb2.append('=');
                        sb2.append(c0424b.f21190c);
                    } else if (i11 == 2) {
                        sb2.append("~=");
                        sb2.append(c0424b.f21190c);
                    } else if (i11 == 3) {
                        sb2.append("|=");
                        sb2.append(c0424b.f21190c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f21213d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    enum u {
        Document,
        RenderOptions
    }

    b(u uVar) {
        this(f.screen, uVar);
    }

    private static int a(List<com.caverock.androidsvg.g.j0> list, int i11, com.caverock.androidsvg.g.l0 l0Var) {
        int i12 = 0;
        if (i11 < 0) {
            return 0;
        }
        com.caverock.androidsvg.g.j0 j0Var = list.get(i11);
        com.caverock.androidsvg.g.j0 j0Var2 = l0Var.f21350b;
        if (j0Var != j0Var2) {
            return -1;
        }
        Iterator<com.caverock.androidsvg.g.n0> it = j0Var2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == l0Var) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List<f> list, f fVar) {
        for (f fVar2 : list) {
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws com.caverock.androidsvg.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new com.caverock.androidsvg.a("Invalid '@' rule");
        }
        if (!this.f21185c && strH.equals("media")) {
            List<f> listH = h(dVar);
            if (!dVar.f(CoreConstants.CURLY_LEFT)) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f21183a)) {
                this.f21185c = true;
                rVar.b(j(dVar));
                this.f21185c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f(CoreConstants.CURLY_RIGHT)) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f21185c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new com.caverock.androidsvg.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new com.caverock.androidsvg.a("Invalid @media rule: expected '}' at end of rule set");
            }
            com.caverock.androidsvg.g.k();
        }
        dVar.A();
    }

    public static List<String> f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    private com.caverock.androidsvg.g.e0 g(d dVar) throws com.caverock.androidsvg.a {
        com.caverock.androidsvg.g.e0 e0Var = new com.caverock.androidsvg.g.e0();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(CoreConstants.COLON_CHAR)) {
                throw new com.caverock.androidsvg.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new com.caverock.androidsvg.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new com.caverock.androidsvg.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            com.caverock.androidsvg.i.S0(e0Var, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f(CoreConstants.CURLY_RIGHT));
        return e0Var;
    }

    private static List<f> h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws com.caverock.androidsvg.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f(CoreConstants.CURLY_LEFT)) {
            throw new com.caverock.androidsvg.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        com.caverock.androidsvg.g.e0 e0VarG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), e0VarG, this.f21184b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (com.caverock.androidsvg.a e11) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e11.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i11, List<com.caverock.androidsvg.g.j0> list, int i12, com.caverock.androidsvg.g.l0 l0Var) {
        t tVarE = sVar.e(i11);
        if (!n(qVar, tVarE, list, i12, l0Var)) {
            return false;
        }
        e eVar = tVarE.f21210a;
        if (eVar == e.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 >= 0) {
                if (m(qVar, sVar, i11 - 1, list, i12)) {
                    return true;
                }
                i12--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i11 - 1, list, i12);
        }
        int iA = a(list, i12, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i11 - 1, list, i12, (com.caverock.androidsvg.g.l0) l0Var.f21350b.getChildren().get(iA - 1));
    }

    static boolean l(q qVar, s sVar, com.caverock.androidsvg.g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.f21350b; obj != null; obj = ((com.caverock.androidsvg.g.n0) obj).f21350b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l0Var) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l0Var);
    }

    private static boolean m(q qVar, s sVar, int i11, List<com.caverock.androidsvg.g.j0> list, int i12) {
        t tVarE = sVar.e(i11);
        com.caverock.androidsvg.g.l0 l0Var = (com.caverock.androidsvg.g.l0) list.get(i12);
        if (!n(qVar, tVarE, list, i12, l0Var)) {
            return false;
        }
        e eVar = tVarE.f21210a;
        if (eVar == e.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 > 0) {
                i12--;
                if (m(qVar, sVar, i11 - 1, list, i12)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i11 - 1, list, i12 - 1);
        }
        int iA = a(list, i12, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i11 - 1, list, i12, (com.caverock.androidsvg.g.l0) l0Var.f21350b.getChildren().get(iA - 1));
    }

    private static boolean n(q qVar, t tVar, List<com.caverock.androidsvg.g.j0> list, int i11, com.caverock.androidsvg.g.l0 l0Var) {
        List<String> list2;
        String str = tVar.f21211b;
        if (str != null && !str.equals(l0Var.m().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0424b> list3 = tVar.f21212c;
        if (list3 != null) {
            for (C0424b c0424b : list3) {
                String str2 = c0424b.f21188a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0424b.f21190c.equals(l0Var.f21339c)) {
                        return false;
                    }
                } else if (!str2.equals(Action.CLASS_ATTRIBUTE) || (list2 = l0Var.f21343g) == null || !list2.contains(c0424b.f21190c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f21213d;
        if (list4 == null) {
            return true;
        }
        Iterator<g> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i11 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
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

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    b(f fVar, u uVar) {
        this.f21185c = false;
        this.f21183a = fVar;
        this.f21184b = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<t> f21208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21209b;

        private s() {
            this.f21208a = null;
            this.f21209b = 0;
        }

        void a(t tVar) {
            if (this.f21208a == null) {
                this.f21208a = new ArrayList();
            }
            this.f21208a.add(tVar);
        }

        void b() {
            this.f21209b += 1000;
        }

        void c() {
            this.f21209b++;
        }

        void d() {
            this.f21209b += 1000000;
        }

        t e(int i11) {
            return this.f21208a.get(i11);
        }

        boolean f() {
            List<t> list = this.f21208a;
            return list == null || list.isEmpty();
        }

        int g() {
            List<t> list = this.f21208a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<t> it = this.f21208a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f21209b);
            sb2.append(']');
            return sb2.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
