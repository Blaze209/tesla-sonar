package w70;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: w70.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\u0015R6\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lw70/g;", "", "", "drawableResourceId", "", AnnotatedPrivateKey.LABEL, "lightThemeIconUrl", "darkThemeIconUrl", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/drawable/Drawable;", "imageLoader", "Lkotlinx/coroutines/CoroutineScope;", "delegateDrawableScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "delegateDrawableDispatcher", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn0/p;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)V", "e", "()Landroid/graphics/drawable/Drawable;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getDrawableResourceId$annotations", "()V", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "getImageLoader$paymentsheet_release", "()Lwn0/p;", "f", "Lkotlinx/coroutines/CoroutineScope;", "g", "Lkotlinx/coroutines/CoroutineDispatcher;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int drawableResourceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lightThemeIconUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String darkThemeIconUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.p<PaymentOption, Continuation<? super Drawable>, Object> imageLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoroutineScope delegateDrawableScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoroutineDispatcher delegateDrawableDispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOption(int i11, String label, String str, String str2, wn0.p<? super PaymentOption, ? super Continuation<? super Drawable>, ? extends Object> imageLoader, CoroutineScope delegateDrawableScope, CoroutineDispatcher delegateDrawableDispatcher) {
        s.k(label, "label");
        s.k(imageLoader, "imageLoader");
        s.k(delegateDrawableScope, "delegateDrawableScope");
        s.k(delegateDrawableDispatcher, "delegateDrawableDispatcher");
        this.drawableResourceId = i11;
        this.label = label;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.imageLoader = imageLoader;
        this.delegateDrawableScope = delegateDrawableScope;
        this.delegateDrawableDispatcher = delegateDrawableDispatcher;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    public final Drawable e() {
        return new b(new ShapeDrawable(), this.imageLoader, this, this.delegateDrawableScope, this.delegateDrawableDispatcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) other;
        return this.drawableResourceId == paymentOption.drawableResourceId && s.f(this.label, paymentOption.label) && s.f(this.lightThemeIconUrl, paymentOption.lightThemeIconUrl) && s.f(this.darkThemeIconUrl, paymentOption.darkThemeIconUrl) && s.f(this.imageLoader, paymentOption.imageLoader) && s.f(this.delegateDrawableScope, paymentOption.delegateDrawableScope) && s.f(this.delegateDrawableDispatcher, paymentOption.delegateDrawableDispatcher);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.drawableResourceId) * 31) + this.label.hashCode()) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.imageLoader.hashCode()) * 31) + this.delegateDrawableScope.hashCode()) * 31) + this.delegateDrawableDispatcher.hashCode();
    }

    public String toString() {
        return "PaymentOption(drawableResourceId=" + this.drawableResourceId + ", label=" + this.label + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", imageLoader=" + this.imageLoader + ", delegateDrawableScope=" + this.delegateDrawableScope + ", delegateDrawableDispatcher=" + this.delegateDrawableDispatcher + ")";
    }

    public /* synthetic */ PaymentOption(int i11, String str, String str2, String str3, wn0.p pVar, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, pVar, (i12 & 32) != 0 ? GlobalScope.INSTANCE : coroutineScope, (i12 & 64) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}
