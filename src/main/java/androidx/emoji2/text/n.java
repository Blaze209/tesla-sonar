package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Class<?> f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<a> f8336b;

    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f8337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f8338b = new AtomicInteger(0);

        a(Object obj) {
            this.f8337a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        final void a() {
            this.f8338b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f8337a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f8337a).beforeTextChanged(charSequence, i11, i12, i13);
        }

        final void c() {
            this.f8338b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f8338b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f8337a).onSpanAdded(spannable, obj, i11, i12);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            if (this.f8338b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i15 = i11;
                    i16 = i13;
                } else {
                    if (i11 > i12) {
                        i11 = 0;
                    }
                    if (i13 > i14) {
                        i15 = i11;
                        i16 = 0;
                    } else {
                        i15 = i11;
                        i16 = i13;
                    }
                }
                ((SpanWatcher) this.f8337a).onSpanChanged(spannable, obj, i15, i12, i16, i14);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f8338b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f8337a).onSpanRemoved(spannable, obj, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f8337a).onTextChanged(charSequence, i11, i12, i13);
        }
    }

    n(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i11, int i12) {
        super(charSequence, i11, i12);
        this.f8336b = new ArrayList();
        u5.h.h(cls, "watcherClass cannot be null");
        this.f8335a = cls;
    }

    private void b() {
        for (int i11 = 0; i11 < this.f8336b.size(); i11++) {
            this.f8336b.get(i11).a();
        }
    }

    private void d() {
        for (int i11 = 0; i11 < this.f8336b.size(); i11++) {
            this.f8336b.get(i11).onTextChanged(this, 0, length(), length());
        }
    }

    private a e(Object obj) {
        for (int i11 = 0; i11 < this.f8336b.size(); i11++) {
            a aVar = this.f8336b.get(i11);
            if (aVar.f8337a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean f(@NonNull Class<?> cls) {
        return this.f8335a == cls;
    }

    private boolean g(Object obj) {
        return obj != null && f(obj.getClass());
    }

    private void h() {
        for (int i11 = 0; i11 < this.f8336b.size(); i11++) {
            this.f8336b.get(i11).c();
        }
    }

    public void a() {
        b();
    }

    public void c() {
        h();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarE;
        if (g(obj) && (aVarE = e(obj)) != null) {
            obj = aVarE;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarE;
        if (g(obj) && (aVarE = e(obj)) != null) {
            obj = aVarE;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarE;
        if (g(obj) && (aVarE = e(obj)) != null) {
            obj = aVarE;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i11, int i12, @NonNull Class<T> cls) {
        if (!f(cls)) {
            return (T[]) super.getSpans(i11, i12, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i11, i12, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            tArr[i13] = aVarArr[i13].f8337a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        if (cls == null || f(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarE;
        if (g(obj)) {
            aVarE = e(obj);
            if (aVarE != null) {
                obj = aVarE;
            }
        } else {
            aVarE = null;
        }
        super.removeSpan(obj);
        if (aVarE != null) {
            this.f8336b.remove(aVarE);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        if (g(obj)) {
            a aVar = new a(obj);
            this.f8336b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i11, i12, i13);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i11, int i12) {
        return new n(this.f8335a, this, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence) {
        b();
        super.replace(i11, i12, charSequence);
        h();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        b();
        super.replace(i11, i12, charSequence, i13, i14);
        h();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i11) {
        super.append(charSequence, obj, i11);
        return this;
    }
}
