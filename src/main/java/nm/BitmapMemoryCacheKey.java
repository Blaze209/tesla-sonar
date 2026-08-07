package nm;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.time.RealtimeSinceBootClock;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: nm.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b'\u00105R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lnm/b;", "Ljk/d;", "", "sourceString", "Lom/f;", "resizeOptions", "Lom/g;", "rotationOptions", "Lom/c;", "imageDecodeOptions", "postprocessorCacheKey", "postprocessorName", "<init>", "(Ljava/lang/String;Lom/f;Lom/g;Lom/c;Ljk/d;Ljava/lang/String;)V", "", "hashCode", "()I", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Z", "a", "()Ljava/lang/String;", "b", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getSourceString", "Lom/f;", "getResizeOptions", "()Lom/f;", "Lom/g;", "getRotationOptions", "()Lom/g;", DateTokenConverter.CONVERTER_KEY, "Lom/c;", "getImageDecodeOptions", "()Lom/c;", "e", "Ljk/d;", "getPostprocessorCacheKey", "()Ljk/d;", "f", "getPostprocessorName", "g", "Ljava/lang/Object;", "getCallerContext", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "callerContext", "h", "I", "hash", "", IntegerTokenConverter.CONVERTER_KEY, "J", "getInBitmapCacheSince", "()J", "inBitmapCacheSince", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BitmapMemoryCacheKey implements jk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final om.f resizeOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final om.g rotationOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final om.c imageDecodeOptions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final jk.d postprocessorCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postprocessorName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Object callerContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int hash;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long inBitmapCacheSince;

    public BitmapMemoryCacheKey(String sourceString, om.f fVar, om.g rotationOptions, om.c imageDecodeOptions, jk.d dVar, String str) {
        p013kotlin.jvm.internal.s.k(sourceString, "sourceString");
        p013kotlin.jvm.internal.s.k(rotationOptions, "rotationOptions");
        p013kotlin.jvm.internal.s.k(imageDecodeOptions, "imageDecodeOptions");
        this.sourceString = sourceString;
        this.resizeOptions = fVar;
        this.rotationOptions = rotationOptions;
        this.imageDecodeOptions = imageDecodeOptions;
        this.postprocessorCacheKey = dVar;
        this.postprocessorName = str;
        this.hash = (((((((((sourceString.hashCode() * 31) + (fVar != null ? fVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.inBitmapCacheSince = RealtimeSinceBootClock.get().now();
    }

    @Override // jk.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getSourceString() {
        return this.sourceString;
    }

    @Override // jk.d
    public boolean b() {
        return false;
    }

    @Override // jk.d
    public boolean c(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        String sourceString = getSourceString();
        String string = uri.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return p013kotlin.text.t.h0(sourceString, string, false, 2, null);
    }

    public final void d(Object obj) {
        this.callerContext = obj;
    }

    @Override // jk.d
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(BitmapMemoryCacheKey.class, other != null ? other.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) other;
        return p013kotlin.jvm.internal.s.f(this.sourceString, bitmapMemoryCacheKey.sourceString) && p013kotlin.jvm.internal.s.f(this.resizeOptions, bitmapMemoryCacheKey.resizeOptions) && p013kotlin.jvm.internal.s.f(this.rotationOptions, bitmapMemoryCacheKey.rotationOptions) && p013kotlin.jvm.internal.s.f(this.imageDecodeOptions, bitmapMemoryCacheKey.imageDecodeOptions) && p013kotlin.jvm.internal.s.f(this.postprocessorCacheKey, bitmapMemoryCacheKey.postprocessorCacheKey) && p013kotlin.jvm.internal.s.f(this.postprocessorName, bitmapMemoryCacheKey.postprocessorName);
    }

    @Override // jk.d
    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getHash() {
        return this.hash;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.sourceString + ", resizeOptions=" + this.resizeOptions + ", rotationOptions=" + this.rotationOptions + ", imageDecodeOptions=" + this.imageDecodeOptions + ", postprocessorCacheKey=" + this.postprocessorCacheKey + ", postprocessorName=" + this.postprocessorName + ")";
    }
}
