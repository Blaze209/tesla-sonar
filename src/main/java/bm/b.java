package bm;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lbm/b;", "INFO", "", "", "id", "callerContext", "Lbm/b$a;", "extraData", "Ljn0/h0;", "C", "(Ljava/lang/String;Ljava/lang/Object;Lbm/b$a;)V", "imageInfo", "p", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "n", "(Ljava/lang/String;)V", "", "throwable", "B", "(Ljava/lang/String;Ljava/lang/Throwable;Lbm/b$a;)V", "t", "(Ljava/lang/String;Lbm/b$a;)V", "a", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b<INFO> {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0007R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010)\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lbm/b$a;", "", "<init>", "()V", "", "", "a", "Ljava/util/Map;", "componentExtras", "b", "shortcutExtras", "c", "datasourceExtras", DateTokenConverter.CONVERTER_KEY, "imageExtras", "e", "imageSourceExtras", "f", "Ljava/lang/Object;", "callerContext", "Landroid/net/Uri;", "g", "Landroid/net/Uri;", "mainUri", "", "h", "I", "viewportWidth", IntegerTokenConverter.CONVERTER_KEY, "viewportHeight", "j", "scaleType", "", "k", "Ljava/lang/Float;", "focusX", "l", "focusY", "", "m", "Z", "logWithHighSamplingRate", "n", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Map<String, ? extends Object> componentExtras;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public Map<String, ? extends Object> shortcutExtras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Map<String, ? extends Object> datasourceExtras;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public Map<String, ? extends Object> imageExtras;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public Map<String, ? extends Object> imageSourceExtras;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public Object callerContext;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public Uri mainUri;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int viewportWidth = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int viewportHeight = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public Object scaleType;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public Float focusX;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public Float focusY;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public boolean logWithHighSamplingRate;
    }

    void B(String id2, Throwable throwable, a extraData);

    void C(String id2, Object callerContext, a extraData);

    void c(String id2, INFO imageInfo);

    void n(String id2);

    void p(String id2, INFO imageInfo, a extraData);

    void t(String id2, a extraData);
}
