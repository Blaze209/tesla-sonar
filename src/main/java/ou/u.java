package ou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f100020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f100021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100022d;

    class a extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f100023h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar, CharSequence charSequence, d dVar) {
            super(uVar, charSequence);
            this.f100023h = dVar;
        }

        @Override // ou.u.b
        int e(int i11) {
            return i11 + 1;
        }

        @Override // ou.u.b
        int f(int i11) {
            return this.f100023h.c(this.f100024c, i11);
        }
    }

    private static abstract class b extends ou.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f100024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f100025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f100026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f100027f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100028g;

        b(u uVar, CharSequence charSequence) {
            this.f100025d = uVar.f100019a;
            this.f100026e = uVar.f100020b;
            this.f100028g = uVar.f100022d;
            this.f100024c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ou.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i11 = this.f100027f;
            while (true) {
                int i12 = this.f100027f;
                if (i12 == -1) {
                    return b();
                }
                int iF = f(i12);
                if (iF == -1) {
                    iF = this.f100024c.length();
                    this.f100027f = -1;
                } else {
                    this.f100027f = e(iF);
                }
                int i13 = this.f100027f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f100027f = i14;
                    if (i14 > this.f100024c.length()) {
                        this.f100027f = -1;
                    }
                } else {
                    while (i11 < iF && this.f100025d.e(this.f100024c.charAt(i11))) {
                        i11++;
                    }
                    while (iF > i11 && this.f100025d.e(this.f100024c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f100026e || i11 != iF) {
                        int i15 = this.f100028g;
                        if (i15 == 1) {
                            iF = this.f100024c.length();
                            this.f100027f = -1;
                            while (iF > i11 && this.f100025d.e(this.f100024c.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.f100028g = i15 - 1;
                        }
                        return this.f100024c.subSequence(i11, iF).toString();
                    }
                    i11 = this.f100027f;
                }
            }
        }

        abstract int e(int i11);

        abstract int f(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        Iterator<String> a(u uVar, CharSequence charSequence);
    }

    private u(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static /* synthetic */ Iterator a(d dVar, u uVar, CharSequence charSequence) {
        return new a(uVar, charSequence, dVar);
    }

    public static u e(char c11) {
        return f(d.d(c11));
    }

    public static u f(final d dVar) {
        p.m(dVar);
        return new u(new c() { // from class: ou.t
            @Override // ou.u.c
            public final Iterator a(u uVar, CharSequence charSequence) {
                return u.a(dVar, uVar, charSequence);
            }
        });
    }

    private Iterator<String> h(CharSequence charSequence) {
        return this.f100021c.a(this, charSequence);
    }

    public List<String> g(CharSequence charSequence) {
        p.m(charSequence);
        Iterator<String> itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add(itH.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private u(c cVar, boolean z11, d dVar, int i11) {
        this.f100021c = cVar;
        this.f100020b = z11;
        this.f100019a = dVar;
        this.f100022d = i11;
    }
}
