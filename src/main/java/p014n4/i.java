package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001a\u0010\u001e\u0082\u0001\u0001 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Ln4/i;", "Ln4/b;", "Ln4/f0;", "weight", "Ln4/b0;", "style", "Ln4/e0$d;", "variationSettings", "<init>", "(Ln4/f0;ILn4/e0$d;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "g", "e", "Ln4/f0;", "a", "()Ln4/f0;", "I", "c", "()I", "", "Z", "didInitWithContext", "h", "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "typeface", "Ln4/a;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FontWeight weight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean didInitWithContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Typeface typeface;

    public /* synthetic */ i(FontWeight fontWeight, int i11, e0.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i11, dVar);
    }

    @Override // p014n4.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // p014n4.p
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = f(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void h(Typeface typeface) {
        this.typeface = typeface;
    }

    private i(FontWeight fontWeight, int i11, e0.d dVar) {
        super(z.INSTANCE.b(), j.f92956a, dVar, null);
        this.weight = fontWeight;
        this.style = i11;
    }
}
