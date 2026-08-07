package rc;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ec.Extras;
import p013kotlin.Metadata;
import sc.Size;

/* JADX INFO: renamed from: rc.n, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b,\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b0\u00108R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b2\u0010;¨\u0006<"}, d2 = {"Lrc/n;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsc/g;", "size", "Lsc/f;", "scale", "Lsc/c;", "precision", "", "diskCacheKey", "Lokio/o;", "fileSystem", "Lrc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lec/l;", "extras", "<init>", "(Landroid/content/Context;Lsc/g;Lsc/f;Lsc/c;Ljava/lang/String;Lokio/o;Lrc/c;Lrc/c;Lrc/c;Lec/l;)V", "a", "(Landroid/content/Context;Lsc/g;Lsc/f;Lsc/c;Ljava/lang/String;Lokio/o;Lrc/c;Lrc/c;Lrc/c;Lec/l;)Lrc/n;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lsc/g;", "k", "()Lsc/g;", "Lsc/f;", "j", "()Lsc/f;", DateTokenConverter.CONVERTER_KEY, "Lsc/c;", IntegerTokenConverter.CONVERTER_KEY, "()Lsc/c;", "e", "Ljava/lang/String;", "f", "Lokio/o;", "g", "()Lokio/o;", "Lrc/c;", "getMemoryCachePolicy", "()Lrc/c;", "h", "Lec/l;", "()Lec/l;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Options {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Size size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc.f scale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc.c precision;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final okio.o fileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final c memoryCachePolicy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c diskCachePolicy;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final c networkCachePolicy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Extras extras;

    public Options(Context context, Size size, sc.f fVar, sc.c cVar, String str, okio.o oVar, c cVar2, c cVar3, c cVar4, Extras lVar) {
        this.context = context;
        this.size = size;
        this.scale = fVar;
        this.precision = cVar;
        this.diskCacheKey = str;
        this.fileSystem = oVar;
        this.memoryCachePolicy = cVar2;
        this.diskCachePolicy = cVar3;
        this.networkCachePolicy = cVar4;
        this.extras = lVar;
    }

    public static /* synthetic */ Options b(Options options, Context context, Size size, sc.f fVar, sc.c cVar, String str, okio.o oVar, c cVar2, c cVar3, c cVar4, Extras lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = options.context;
        }
        if ((i11 & 2) != 0) {
            size = options.size;
        }
        if ((i11 & 4) != 0) {
            fVar = options.scale;
        }
        if ((i11 & 8) != 0) {
            cVar = options.precision;
        }
        if ((i11 & 16) != 0) {
            str = options.diskCacheKey;
        }
        if ((i11 & 32) != 0) {
            oVar = options.fileSystem;
        }
        if ((i11 & 64) != 0) {
            cVar2 = options.memoryCachePolicy;
        }
        if ((i11 & 128) != 0) {
            cVar3 = options.diskCachePolicy;
        }
        if ((i11 & 256) != 0) {
            cVar4 = options.networkCachePolicy;
        }
        if ((i11 & 512) != 0) {
            lVar = options.extras;
        }
        c cVar5 = cVar4;
        Extras lVar2 = lVar;
        c cVar6 = cVar2;
        c cVar7 = cVar3;
        String str2 = str;
        okio.o oVar2 = oVar;
        return options.a(context, size, fVar, cVar, str2, oVar2, cVar6, cVar7, cVar5, lVar2);
    }

    public final Options a(Context context, Size size, sc.f scale, sc.c precision, String diskCacheKey, okio.o fileSystem, c memoryCachePolicy, c diskCachePolicy, c networkCachePolicy, Extras extras) {
        return new Options(context, size, scale, precision, diskCacheKey, fileSystem, memoryCachePolicy, diskCachePolicy, networkCachePolicy, extras);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options options = (Options) other;
        return p013kotlin.jvm.internal.s.f(this.context, options.context) && p013kotlin.jvm.internal.s.f(this.size, options.size) && this.scale == options.scale && this.precision == options.precision && p013kotlin.jvm.internal.s.f(this.diskCacheKey, options.diskCacheKey) && p013kotlin.jvm.internal.s.f(this.fileSystem, options.fileSystem) && this.memoryCachePolicy == options.memoryCachePolicy && this.diskCachePolicy == options.diskCachePolicy && this.networkCachePolicy == options.networkCachePolicy && p013kotlin.jvm.internal.s.f(this.extras, options.extras);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final okio.o getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public int hashCode() {
        int iHashCode = ((((((this.context.hashCode() * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31;
        String str = this.diskCacheKey;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileSystem.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.extras.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final sc.c getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final sc.f getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    public String toString() {
        return "Options(context=" + this.context + ", size=" + this.size + ", scale=" + this.scale + ", precision=" + this.precision + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", extras=" + this.extras + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
