package ui0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import oi0.s5;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "styles", "", "Lui0/a0;", "excludedStyleElements", "Ljn0/h0;", "m", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;)V", "", "fontName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onRemoteFontDownloaded", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/widget/TextView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lwn0/l;)V", "g", "e", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justification", "f", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f116310b;

        static {
            int[] iArr = new int[StyleElements.FontWeight.values().length];
            try {
                iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyleElements.FontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f116309a = iArr;
            int[] iArr2 = new int[StyleElements.PositionType.values().length];
            try {
                iArr2[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f116310b = iArr2;
        }
    }

    private static final int d(StyleElements.FontWeight fontWeight) {
        int i11 = a.f116309a[fontWeight.ordinal()];
        if (i11 == 1) {
            return 300;
        }
        if (i11 == 2) {
            return 400;
        }
        if (i11 == 3) {
            return 500;
        }
        if (i11 == 4) {
            return 700;
        }
        if (i11 == 5) {
            return 800;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void e(TextView textView, StyleElements.FontWeight fontWeight) {
        p013kotlin.jvm.internal.s.k(textView, "<this>");
        p013kotlin.jvm.internal.s.k(fontWeight, "fontWeight");
        Typeface typefaceCreate = Typeface.create(textView.getTypeface(), d(fontWeight), false);
        p013kotlin.jvm.internal.s.j(typefaceCreate, "create(...)");
        textView.setTypeface(typefaceCreate);
    }

    public static final void f(TextView textView, StyleElements.PositionType justification) {
        p013kotlin.jvm.internal.s.k(textView, "<this>");
        p013kotlin.jvm.internal.s.k(justification, "justification");
        int gravity = textView.getGravity() & 112;
        int i11 = a.f116310b[justification.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 8388611;
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 8388613;
        }
        textView.setGravity(i12);
        textView.setGravity((textView.getGravity() & (-113)) | gravity);
    }

    private static final void g(final TextView textView, String str, StyleElements.FontWeight fontWeight, final wn0.l<? super Typeface, h0> lVar) {
        String str2;
        Context context = textView.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Typeface typefaceA = s5.a(context, str);
        if (typefaceA != null) {
            textView.setTypeface(typefaceA);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            e(textView, fontWeight);
        }
        vi0.a aVarA = vi0.a.INSTANCE.a();
        Map<String, Map<StyleElements.FontWeight, String>> mapC = aVarA.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : mapC.entrySet()) {
            if (p013kotlin.jvm.internal.s.f(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map = (Map) p013kotlin.collections.v.p0(linkedHashMap.values());
        if (map == null || (str2 = (String) map.get(fontWeight)) == null) {
            str2 = map != null ? (String) map.get(StyleElements.FontWeight.NORMAL) : null;
        }
        if (str2 != null) {
            aVarA.d(str2, new wn0.l() { // from class: ui0.d0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return e0.h(textView, lVar, (Typeface) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(TextView textView, wn0.l lVar, Typeface it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        textView.setTypeface(it);
        lVar.invoke(it);
        return h0.f84049a;
    }

    public static final void i(final TextView textView, String str, final StyleElements.FontWeight fontWeight, wn0.l<? super Typeface, h0> onRemoteFontDownloaded) {
        p013kotlin.jvm.internal.s.k(textView, "<this>");
        p013kotlin.jvm.internal.s.k(onRemoteFontDownloaded, "onRemoteFontDownloaded");
        if (str == null) {
            new wn0.a() { // from class: ui0.c0
                @Override // wn0.a
                public final Object invoke() {
                    return e0.k(fontWeight, textView);
                }
            };
            return;
        }
        if (fontWeight == null) {
            fontWeight = StyleElements.FontWeight.NORMAL;
        }
        g(textView, str, fontWeight, onRemoteFontDownloaded);
    }

    public static /* synthetic */ void j(TextView textView, String str, StyleElements.FontWeight fontWeight, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new wn0.l() { // from class: ui0.b0
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return e0.l((Typeface) obj2);
                }
            };
        }
        i(textView, str, fontWeight, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(StyleElements.FontWeight fontWeight, TextView textView) {
        if (fontWeight == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            e(textView, fontWeight);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(Typeface it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return h0.f84049a;
    }

    public static final void m(TextView textView, TextViewStyle styles, Set<? extends a0> excludedStyleElements) {
        p013kotlin.jvm.internal.s.k(textView, "<this>");
        p013kotlin.jvm.internal.s.k(styles, "styles");
        p013kotlin.jvm.internal.s.k(excludedStyleElements, "excludedStyleElements");
        StyleElements.SizeSet marginValue = styles.getMarginValue();
        if (marginValue != null) {
            xi0.d.c(textView, marginValue);
        }
        Integer textColorValue = styles.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = styles.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = styles.getFontSizeValue();
        if (fontSizeValue != null) {
            double dDoubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) dDoubleValue);
            if (androidx.core.widget.m.c(textView) == 1) {
                int iA = androidx.core.widget.m.a(textView);
                int iB = androidx.core.widget.m.b(textView);
                int iD = (int) yh0.h.d(dDoubleValue);
                if (iA <= 0) {
                    iA = (int) yh0.h.d(12.0d);
                }
                int i11 = iB > 0 ? iB : 1;
                if (iA > iD) {
                    iA = iD;
                }
                androidx.core.widget.m.j(textView, iA, iD, i11, 0);
            }
            Double lineHeightValue = styles.getLineHeightValue();
            if (lineHeightValue != null) {
                if (excludedStyleElements.contains(a0.LineHeight)) {
                    lineHeightValue = null;
                }
                if (lineHeightValue != null) {
                    double dDoubleValue2 = lineHeightValue.doubleValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        textView.setLineSpacing((float) (yh0.h.a(dDoubleValue2) - yh0.h.a(dDoubleValue)), 1.0f);
                    }
                }
            }
        }
        Double letterSpacingValue = styles.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) textView.getTextSize())));
        }
        String fontNameValue = styles.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = styles.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        j(textView, fontNameValue, fontWeightValue, null, 4, null);
        StyleElements.PositionType justificationValue = styles.getJustificationValue();
        if (justificationValue != null) {
            f(textView, justificationValue);
        }
    }

    public static /* synthetic */ void n(TextView textView, TextViewStyle textViewStyle, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = d1.d();
        }
        m(textView, textViewStyle, set);
    }
}
