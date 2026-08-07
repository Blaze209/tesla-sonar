package p014n4;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w4.d;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln4/c1;", "", "<init>", "()V", "Ln4/e0$d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Ln4/e0$d;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "(Landroid/graphics/Typeface;Ln4/e0$d;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f92894a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/e0$a;", "setting", "", "a", "(Ln4/e0$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<e0.a, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f92896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f92896c = dVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(e0.a aVar) {
            return CoreConstants.SINGLE_QUOTE_CHAR + aVar.getAxisName() + "' " + aVar.c(this.f92896c);
        }
    }

    private c1() {
    }

    private final String b(e0.d dVar, Context context) {
        return y4.a.e(dVar.b(), null, null, null, 0, null, new a(w4.a.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, e0.d variationSettings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.b().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(variationSettings, context));
        return paint.getTypeface();
    }
}
