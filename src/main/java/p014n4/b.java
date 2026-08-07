package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Ln4/b;", "Ln4/p;", "Ln4/z;", "loadingStrategy", "Ln4/b$a;", "typefaceLoader", "Ln4/e0$d;", "variationSettings", "<init>", "(ILn4/b$a;Ln4/e0$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "I", "()I", "c", "Ln4/b$a;", DateTokenConverter.CONVERTER_KEY, "()Ln4/b$a;", "Ln4/e0$d;", "e", "()Ln4/e0$d;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int loadingStrategy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a typefaceLoader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0.d variationSettings;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ln4/b$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ln4/b;", "font", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Ln4/b;)Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Ln4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        Typeface a(Context context, b font);

        Object b(Context context, b bVar, Continuation<? super Typeface> continuation);
    }

    public /* synthetic */ b(int i11, a aVar, e0.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, aVar, dVar);
    }

    @Override // p014n4.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getTypefaceLoader() {
        return this.typefaceLoader;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0.d getVariationSettings() {
        return this.variationSettings;
    }

    private b(int i11, a aVar, e0.d dVar) {
        this.loadingStrategy = i11;
        this.typefaceLoader = aVar;
        this.variationSettings = dVar;
    }
}
