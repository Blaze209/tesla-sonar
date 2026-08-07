package s5;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class f implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f110169d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f110170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f110171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f110172c;

    public a a() {
        return this.f110171b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f110170a;
        if (c.a(spannable)) {
            return d.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f110170a.charAt(i11);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f110170a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f110170a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f110170a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f110172c.getSpans(i11, i12, cls) : (T[]) this.f110170a.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f110170a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f110170a.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f110172c.removeSpan(obj);
        } else {
            this.f110170a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f110172c.setSpan(obj, i11, i12, i13);
        } else {
            this.f110170a.setSpan(obj, i11, i12, i13);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return this.f110170a.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f110170a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f110173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f110174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f110175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f110176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f110177e;

        /* JADX INFO: renamed from: s5.f$a$a, reason: collision with other inner class name */
        public static class C2338a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f110178a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f110180c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f110181d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f110179b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C2338a(TextPaint textPaint) {
                this.f110178a = textPaint;
            }

            public a a() {
                return new a(this.f110178a, this.f110179b, this.f110180c, this.f110181d);
            }

            public C2338a b(int i11) {
                this.f110180c = i11;
                return this;
            }

            public C2338a c(int i11) {
                this.f110181d = i11;
                return this;
            }

            public C2338a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f110179b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f110177e = e.a(textPaint).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f110177e = null;
            }
            this.f110173a = textPaint;
            this.f110174b = textDirectionHeuristic;
            this.f110175c = i11;
            this.f110176d = i12;
        }

        public boolean a(a aVar) {
            if (this.f110175c != aVar.b() || this.f110176d != aVar.c() || this.f110173a.getTextSize() != aVar.e().getTextSize() || this.f110173a.getTextScaleX() != aVar.e().getTextScaleX() || this.f110173a.getTextSkewX() != aVar.e().getTextSkewX() || this.f110173a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f110173a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f110173a.getFlags() != aVar.e().getFlags() || !this.f110173a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f110173a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f110173a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f110175c;
        }

        public int c() {
            return this.f110176d;
        }

        public TextDirectionHeuristic d() {
            return this.f110174b;
        }

        public TextPaint e() {
            return this.f110173a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f110174b == aVar.d();
        }

        public int hashCode() {
            return u5.c.b(Float.valueOf(this.f110173a.getTextSize()), Float.valueOf(this.f110173a.getTextScaleX()), Float.valueOf(this.f110173a.getTextSkewX()), Float.valueOf(this.f110173a.getLetterSpacing()), Integer.valueOf(this.f110173a.getFlags()), this.f110173a.getTextLocales(), this.f110173a.getTypeface(), Boolean.valueOf(this.f110173a.isElegantTextHeight()), this.f110174b, Integer.valueOf(this.f110175c), Integer.valueOf(this.f110176d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f110173a.getTextSize());
            sb2.append(", textScaleX=" + this.f110173a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f110173a.getTextSkewX());
            int i11 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f110173a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f110173a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f110173a.getTextLocales());
            sb2.append(", typeface=" + this.f110173a.getTypeface());
            if (i11 >= 26) {
                sb2.append(", variationSettings=" + this.f110173a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f110174b);
            sb2.append(", breakStrategy=" + this.f110175c);
            sb2.append(", hyphenationFrequency=" + this.f110176d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f110173a = params.getTextPaint();
            this.f110174b = params.getTextDirection();
            this.f110175c = params.getBreakStrategy();
            this.f110176d = params.getHyphenationFrequency();
            this.f110177e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
