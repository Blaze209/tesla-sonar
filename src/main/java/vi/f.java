package vi;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\t\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lvi/f;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "drmType", "b", "f", "drmLicenseServer", "", "[Ljava/lang/String;", "()[Ljava/lang/String;", "e", "([Ljava/lang/String;)V", "drmLicenseHeader", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "h", "(Z)V", "multiDrm", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String drmType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String drmLicenseServer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String[] drmLicenseHeader = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean multiDrm;

    /* JADX INFO: renamed from: vi.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lvi/f$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/f;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/f;", "", "PROP_DRM_TYPE", "Ljava/lang/String;", "PROP_DRM_LICENSE_SERVER", "PROP_DRM_HEADERS", "PROP_DRM_HEADERS_KEY", "PROP_DRM_HEADERS_VALUE", "PROP_DRM_MULTI_DRM", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(ReadableMap src) {
            if (src != null && src.hasKey("type")) {
                f fVar = new f();
                fVar.g(xi.b.g(src, "type"));
                fVar.f(xi.b.g(src, "licenseServer"));
                fVar.h(xi.b.b(src, "multiDrm", false));
                ReadableArray readableArrayA = xi.b.a(src, "headers");
                if (fVar.getDrmType() != null && fVar.getDrmLicenseServer() != null) {
                    if (readableArrayA != null) {
                        ArrayList arrayList = new ArrayList();
                        int size = readableArrayA.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ReadableMap map = readableArrayA.getMap(i11);
                            arrayList.add(xi.b.g(map, Action.KEY_ATTRIBUTE));
                            arrayList.add(xi.b.g(map, "value"));
                        }
                        fVar.e((String[]) arrayList.toArray(new String[0]));
                    }
                    return fVar;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String[] getDrmLicenseHeader() {
        return this.drmLicenseHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDrmLicenseServer() {
        return this.drmLicenseServer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDrmType() {
        return this.drmType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getMultiDrm() {
        return this.multiDrm;
    }

    public final void e(String[] strArr) {
        s.k(strArr, "<set-?>");
        this.drmLicenseHeader = strArr;
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof f)) {
            f fVar = (f) other;
            if (s.f(this.drmType, fVar.drmType) && s.f(this.drmLicenseServer, fVar.drmLicenseServer) && this.multiDrm == fVar.multiDrm && n.d(this.drmLicenseHeader, fVar.drmLicenseHeader)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str) {
        this.drmLicenseServer = str;
    }

    public final void g(String str) {
        this.drmType = str;
    }

    public final void h(boolean z11) {
        this.multiDrm = z11;
    }
}
