package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final androidx.emoji2.text.e.j f8290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final m f8291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private androidx.emoji2.text.e.InterfaceC0167e f8292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f8294e;

    private static class a implements b<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f8295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.e.j f8296b;

        a(q qVar, androidx.emoji2.text.e.j jVar) {
            this.f8295a = qVar;
            this.f8296b = jVar;
        }

        @Override // androidx.emoji2.text.h.b
        public boolean a(@NonNull CharSequence charSequence, int i11, int i12, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.f8295a == null) {
                this.f8295a = new q(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f8295a.setSpan(this.f8296b.a(oVar), i11, i12, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q getResult() {
            return this.f8295a;
        }
    }

    private interface b<T> {
        boolean a(@NonNull CharSequence charSequence, int i11, int i12, o oVar);

        T getResult();
    }

    private static class c implements b<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8298b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8299c = -1;

        c(int i11) {
            this.f8297a = i11;
        }

        @Override // androidx.emoji2.text.h.b
        public boolean a(@NonNull CharSequence charSequence, int i11, int i12, o oVar) {
            int i13 = this.f8297a;
            if (i11 > i13 || i13 >= i12) {
                return i12 <= i13;
            }
            this.f8298b = i11;
            this.f8299c = i12;
            return false;
        }

        @Override // androidx.emoji2.text.h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c getResult() {
            return this;
        }
    }

    private static class d implements b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8300a;

        d(String str) {
            this.f8300a = str;
        }

        @Override // androidx.emoji2.text.h.b
        public boolean a(@NonNull CharSequence charSequence, int i11, int i12, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.f8300a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8301a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m.a f8302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.a f8303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f8304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f8307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f8308h;

        e(m.a aVar, boolean z11, int[] iArr) {
            this.f8302b = aVar;
            this.f8303c = aVar;
            this.f8307g = z11;
            this.f8308h = iArr;
        }

        private static boolean d(int i11) {
            return i11 == 65039;
        }

        private static boolean f(int i11) {
            return i11 == 65038;
        }

        private int g() {
            this.f8301a = 1;
            this.f8303c = this.f8302b;
            this.f8306f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f8303c.b().j() || d(this.f8305e)) {
                return true;
            }
            if (this.f8307g) {
                if (this.f8308h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f8308h, this.f8303c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i11) {
            m.a aVarA = this.f8303c.a(i11);
            int iG = 2;
            if (this.f8301a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f8301a = 2;
                    this.f8303c = aVarA;
                    this.f8306f = 1;
                }
            } else if (aVarA != null) {
                this.f8303c = aVarA;
                this.f8306f++;
            } else if (f(i11)) {
                iG = g();
            } else if (!d(i11)) {
                if (this.f8303c.b() != null) {
                    iG = 3;
                    if (this.f8306f != 1 || h()) {
                        this.f8304d = this.f8303c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f8305e = i11;
            return iG;
        }

        o b() {
            return this.f8303c.b();
        }

        o c() {
            return this.f8304d.b();
        }

        boolean e() {
            if (this.f8301a != 2 || this.f8303c.b() == null) {
                return false;
            }
            return this.f8306f > 1 || h();
        }
    }

    h(@NonNull m mVar, @NonNull androidx.emoji2.text.e.j jVar, @NonNull androidx.emoji2.text.e.InterfaceC0167e interfaceC0167e, boolean z11, int[] iArr, @NonNull Set<int[]> set) {
        this.f8290a = jVar;
        this.f8291b = mVar;
        this.f8292c = interfaceC0167e;
        this.f8293d = z11;
        this.f8294e = iArr;
        d(set);
    }

    private boolean c(CharSequence charSequence, int i11, int i12, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.f8292c.a(charSequence, i11, i12, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private void d(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            f(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private <T> T f(@NonNull CharSequence charSequence, int i11, int i12, int i13, boolean z11, b<T> bVar) {
        int iCharCount;
        e eVar = new e(this.f8291b.f(), this.f8293d, this.f8294e);
        int i14 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i11);
        loop0: while (true) {
            iCharCount = i11;
            while (true) {
                if (i11 >= i12 || i14 >= i13 || !zA) {
                    break loop0;
                }
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i11 = iCharCount;
                } else if (iA == 2) {
                    i11 += Character.charCount(iCodePointAt);
                    if (i11 < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, i11);
                    }
                } else if (iA != 3) {
                }
            }
            if (z11 || !c(charSequence, iCharCount, i11, eVar.c())) {
                zA = bVar.a(charSequence, iCharCount, i11, eVar.c());
                i14++;
            }
        }
        if (eVar.e() && i14 < i13 && zA && (z11 || !c(charSequence, iCharCount, i11, eVar.b()))) {
            bVar.a(charSequence, iCharCount, i11, eVar.b());
        }
        return bVar.getResult();
    }

    int a(@NonNull CharSequence charSequence, int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i11, i11 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanEnd(iVarArr[0]);
            }
        }
        return ((c) f(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new c(i11))).f8299c;
    }

    int b(@NonNull CharSequence charSequence, int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i11, i11 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanStart(iVarArr[0]);
            }
        }
        return ((c) f(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new c(i11))).f8298b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    CharSequence e(@NonNull CharSequence charSequence, int i11, int i12, int i13, boolean z11) throws Throwable {
        q qVar;
        CharSequence charSequence2;
        Throwable th2;
        int i14;
        int i15;
        n nVar;
        i[] iVarArr;
        int i16;
        int spanStart;
        boolean z12 = charSequence instanceof n;
        if (z12) {
            ((n) charSequence).a();
        }
        if (z12) {
            qVar = new q((Spannable) charSequence);
            if (qVar != null) {
                for (i iVar : iVarArr) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd = qVar.getSpanEnd(iVar);
                    if (spanStart != i12) {
                        qVar.removeSpan(iVar);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 == i15) {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.c();
            } else {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.c();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    qVar = new q((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((n) charSequence2).c();
                    throw th2;
                }
            } else {
                qVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i11 + (-1), i12 + 1, i.class) > i12) ? null : new q(charSequence);
            }
            if (qVar != null && (iVarArr = (i[]) qVar.getSpans(i11, i12, i.class)) != null && iVarArr.length > 0) {
                while (i16 < r5) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd2 = qVar.getSpanEnd(iVar);
                    if (spanStart != i12) {
                        qVar.removeSpan(iVar);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd2, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 == i15 && i14 < charSequence.length()) {
                if (i13 != Integer.MAX_VALUE && qVar != null) {
                    i13 -= ((i[]) qVar.getSpans(0, qVar.length(), i.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    q qVar2 = (q) f(charSequence2, i14, i15, i13, z11, new a(qVar, this.f8290a));
                    if (qVar2 == null) {
                        if (z12) {
                            nVar = (n) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = qVar2.b();
                    if (z12) {
                        ((n) charSequence2).c();
                    }
                    return spannableB;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((n) charSequence2).c();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z12) {
                return charSequence2;
            }
            nVar = (n) charSequence2;
            nVar.c();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z12) {
            throw th2;
        }
        ((n) charSequence2).c();
        throw th2;
    }
}
