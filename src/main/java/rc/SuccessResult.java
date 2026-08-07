package rc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: rc.r, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\r\u0010.R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\u001e\u0010.¨\u00060"}, d2 = {"Lrc/r;", "Lrc/j;", "Lec/n;", "image", "Lrc/g;", "request", "Lgc/h;", "dataSource", "Lmc/d$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Lec/n;Lrc/g;Lgc/h;Lmc/d$b;Ljava/lang/String;ZZ)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "a", "Lec/n;", "getImage", "()Lec/n;", "b", "Lrc/g;", "getRequest", "()Lrc/g;", "c", "Lgc/h;", "()Lgc/h;", DateTokenConverter.CONVERTER_KEY, "Lmc/d$b;", "getMemoryCacheKey", "()Lmc/d$b;", "e", "Ljava/lang/String;", "getDiskCacheKey", "f", "Z", "()Z", "g", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuccessResult implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ec.n image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImageRequest request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final gc.h dataSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final mc.d.Key memoryCacheKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSampled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPlaceholderCached;

    public SuccessResult(ec.n nVar, ImageRequest imageRequest, gc.h hVar, mc.d.Key key, String str, boolean z11, boolean z12) {
        this.image = nVar;
        this.request = imageRequest;
        this.dataSource = hVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z11;
        this.isPlaceholderCached = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final gc.h getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) other;
        return p013kotlin.jvm.internal.s.f(this.image, successResult.image) && p013kotlin.jvm.internal.s.f(this.request, successResult.request) && this.dataSource == successResult.dataSource && p013kotlin.jvm.internal.s.f(this.memoryCacheKey, successResult.memoryCacheKey) && p013kotlin.jvm.internal.s.f(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached;
    }

    @Override // rc.j
    public ec.n getImage() {
        return this.image;
    }

    @Override // rc.j
    public ImageRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iHashCode = ((((this.image.hashCode() * 31) + this.request.hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        mc.d.Key key = this.memoryCacheKey;
        int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.diskCacheKey;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSampled)) * 31) + Boolean.hashCode(this.isPlaceholderCached);
    }

    public String toString() {
        return "SuccessResult(image=" + this.image + ", request=" + this.request + ", dataSource=" + this.dataSource + ", memoryCacheKey=" + this.memoryCacheKey + ", diskCacheKey=" + this.diskCacheKey + ", isSampled=" + this.isSampled + ", isPlaceholderCached=" + this.isPlaceholderCached + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
