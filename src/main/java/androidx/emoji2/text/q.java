package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8345a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private Spannable f8346b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof s5.f;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return s5.c.a(charSequence) || (charSequence instanceof s5.f);
        }
    }

    q(@NonNull Spannable spannable) {
        this.f8346b = spannable;
    }

    private void a() {
        Spannable spannable = this.f8346b;
        if (!this.f8345a && c().a(spannable)) {
            this.f8346b = new SpannableString(spannable);
        }
        this.f8345a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f8346b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f8346b.charAt(i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream chars() {
        return a.a(this.f8346b);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream codePoints() {
        return a.b(this.f8346b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f8346b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f8346b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f8346b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        return (T[]) this.f8346b.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f8346b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f8346b.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f8346b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        a();
        this.f8346b.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i11, int i12) {
        return this.f8346b.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f8346b.toString();
    }

    q(@NonNull CharSequence charSequence) {
        this.f8346b = new SpannableString(charSequence);
    }
}
