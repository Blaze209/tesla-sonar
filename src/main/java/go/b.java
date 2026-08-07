package go;

import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0012"}, d2 = {"Lgo/b;", "Lcom/facebook/imagepipeline/request/a;", "Lcom/facebook/imagepipeline/request/ImageRequestBuilder;", "builder", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "Lgo/a;", "cacheControl", "<init>", "(Lcom/facebook/imagepipeline/request/ImageRequestBuilder;Lcom/facebook/react/bridge/ReadableMap;Lgo/a;)V", "B", "Lcom/facebook/react/bridge/ReadableMap;", "C", "()Lcom/facebook/react/bridge/ReadableMap;", "Lgo/a;", "()Lgo/a;", "D", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.facebook.imagepipeline.request.a {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final ReadableMap headers;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final a cacheControl;

    /* JADX INFO: renamed from: go.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgo/b$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequestBuilder;", "builder", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "Lgo/a;", "cacheControl", "Lgo/b;", "b", "(Lcom/facebook/imagepipeline/request/ImageRequestBuilder;Lcom/facebook/react/bridge/ReadableMap;Lgo/a;)Lgo/b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b c(Companion companion, ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap, a aVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar = a.DEFAULT;
            }
            return companion.b(imageRequestBuilder, readableMap, aVar);
        }

        public final b a(ImageRequestBuilder builder, ReadableMap readableMap) {
            s.k(builder, "builder");
            return c(this, builder, readableMap, null, 4, null);
        }

        public final b b(ImageRequestBuilder builder, ReadableMap headers, a cacheControl) {
            s.k(builder, "builder");
            s.k(cacheControl, "cacheControl");
            return new b(builder, headers, cacheControl, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageRequestBuilder, readableMap, aVar);
    }

    public static final b A(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        return INSTANCE.a(imageRequestBuilder, readableMap);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final a getCacheControl() {
        return this.cacheControl;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final ReadableMap getHeaders() {
        return this.headers;
    }

    private b(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap, a aVar) {
        super(imageRequestBuilder);
        this.headers = readableMap;
        this.cacheControl = aVar;
    }
}
