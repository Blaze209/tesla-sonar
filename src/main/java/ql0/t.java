package ql0;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class t implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f105679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<a> f105680b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f105681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f105682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f105684d;

        a(@NonNull Object obj, int i11, int i12, int i13) {
            this.f105681a = obj;
            this.f105682b = i11;
            this.f105683c = i12;
            this.f105684d = i13;
        }
    }

    static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public t() {
        this("");
    }

    private void e(int i11, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z11 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z11) {
                    for (int i12 = 0; i12 < length; i12++) {
                        Object obj = spans[i12];
                        i(obj, spanned.getSpanStart(obj) + i11, spanned.getSpanEnd(obj) + i11, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i13 = length - 1; i13 >= 0; i13--) {
                    Object obj2 = spans[i13];
                    i(obj2, spanned.getSpanStart(obj2) + i11, spanned.getSpanEnd(obj2) + i11, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    static boolean g(int i11, int i12, int i13) {
        return i13 > i12 && i12 >= 0 && i13 <= i11;
    }

    public static void j(@NonNull t tVar, Object obj, int i11, int i12) {
        if (obj == null || !g(tVar.length(), i11, i12)) {
            return;
        }
        k(tVar, obj, i11, i12);
    }

    private static void k(@NonNull t tVar, Object obj, int i11, int i12) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                tVar.i(obj, i11, i12, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                k(tVar, obj2, i11, i12);
            }
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t append(char c11) {
        this.f105679a.append(c11);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t append(@NonNull CharSequence charSequence) {
        e(length(), charSequence);
        this.f105679a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t append(CharSequence charSequence, int i11, int i12) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i11, i12);
        e(length(), charSequenceSubSequence);
        this.f105679a.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f105679a.charAt(i11);
    }

    @NonNull
    public t d(@NonNull String str) {
        this.f105679a.append(str);
        return this;
    }

    @NonNull
    public List<a> f(int i11, int i12) {
        int i13;
        int length = length();
        if (!g(length, i11, i12)) {
            return Collections.EMPTY_LIST;
        }
        if (i11 == 0 && length == i12) {
            ArrayList arrayList = new ArrayList(this.f105680b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.f105680b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i14 = next.f105682b;
            if ((i14 >= i11 && i14 < i12) || (((i13 = next.f105683c) <= i12 && i13 > i11) || (i14 < i11 && i13 > i12))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.f105679a.charAt(length() - 1);
    }

    @NonNull
    public t i(@NonNull Object obj, int i11, int i12, int i13) {
        this.f105680b.push(new a(obj, i11, i12, i13));
        return this;
    }

    @NonNull
    public SpannableStringBuilder l() {
        b bVar = new b(this.f105679a);
        for (a aVar : this.f105680b) {
            bVar.setSpan(aVar.f105681a, aVar.f105682b, aVar.f105683c, aVar.f105684d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f105679a.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        List<a> listF = f(i11, i12);
        if (listF.isEmpty()) {
            return this.f105679a.subSequence(i11, i12);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f105679a.subSequence(i11, i12));
        int length = spannableStringBuilder.length();
        for (a aVar : listF) {
            int iMax = Math.max(0, aVar.f105682b - i11);
            spannableStringBuilder.setSpan(aVar.f105681a, iMax, Math.min(length, (aVar.f105683c - aVar.f105682b) + iMax), aVar.f105684d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f105679a.toString();
    }

    public t(@NonNull CharSequence charSequence) {
        this.f105680b = new ArrayDeque(8);
        this.f105679a = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
