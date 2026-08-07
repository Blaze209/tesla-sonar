package vi;

import bo0.n;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: vi.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B\u0081\u0001\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R)\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R)\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lvi/d;", "", "", "Lkotlin/Pair;", "", "cmcdObject", "cmcdRequest", "cmcdSession", "cmcdStatus", "", "mode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "I", "f", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CMCDProps {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, Object>> cmcdObject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, Object>> cmcdRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, Object>> cmcdSession;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, Object>> cmcdStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mode;

    /* JADX INFO: renamed from: vi.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lvi/d$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableArray;", "array", "", "Lkotlin/Pair;", "", "b", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/d;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/d;", "PROP_CMCD_OBJECT", "Ljava/lang/String;", "PROP_CMCD_REQUEST", "PROP_CMCD_SESSION", "PROP_CMCD_STATUS", "PROP_CMCD_MODE", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: vi.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C2556a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f119406a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f119406a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0051  */
        private final List<Pair<String, Object>> b(ReadableArray array) {
            Object objValueOf;
            if (array == null) {
                return v.m();
            }
            bo0.j jVarW = n.w(0, array.size());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                ReadableMap map = array.getMap(((s0) it).nextInt());
                Pair pair = null;
                String string = map != null ? map.getString(Action.KEY_ATTRIBUTE) : null;
                ReadableType type = map != null ? map.getType("value") : null;
                int i11 = type == null ? -1 : C2556a.f119406a[type.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 && map != null) {
                        objValueOf = map.getString("value");
                    } else {
                        objValueOf = null;
                    }
                } else if (map != null) {
                    objValueOf = Double.valueOf(map.getDouble("value"));
                } else {
                    objValueOf = null;
                }
                if (string != null && objValueOf != null) {
                    pair = new Pair(string, objValueOf);
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return arrayList;
        }

        public final CMCDProps a(ReadableMap src) {
            if (src == null) {
                return null;
            }
            return new CMCDProps(b(src.getArray("object")), b(src.getArray("request")), b(src.getArray("session")), b(src.getArray(PermissionsResponse.STATUS_KEY)), xi.b.e(src, "mode", 1));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CMCDProps(List<? extends Pair<String, ? extends Object>> cmcdObject, List<? extends Pair<String, ? extends Object>> cmcdRequest, List<? extends Pair<String, ? extends Object>> cmcdSession, List<? extends Pair<String, ? extends Object>> cmcdStatus, int i11) {
        s.k(cmcdObject, "cmcdObject");
        s.k(cmcdRequest, "cmcdRequest");
        s.k(cmcdSession, "cmcdSession");
        s.k(cmcdStatus, "cmcdStatus");
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.mode = i11;
    }

    public final List<Pair<String, Object>> a() {
        return this.cmcdObject;
    }

    public final List<Pair<String, Object>> b() {
        return this.cmcdRequest;
    }

    public final List<Pair<String, Object>> c() {
        return this.cmcdSession;
    }

    public final List<Pair<String, Object>> d() {
        return this.cmcdStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CMCDProps)) {
            return false;
        }
        CMCDProps cMCDProps = (CMCDProps) other;
        return s.f(this.cmcdObject, cMCDProps.cmcdObject) && s.f(this.cmcdRequest, cMCDProps.cmcdRequest) && s.f(this.cmcdSession, cMCDProps.cmcdSession) && s.f(this.cmcdStatus, cMCDProps.cmcdStatus) && this.mode == cMCDProps.mode;
    }

    public int hashCode() {
        return (((((((this.cmcdObject.hashCode() * 31) + this.cmcdRequest.hashCode()) * 31) + this.cmcdSession.hashCode()) * 31) + this.cmcdStatus.hashCode()) * 31) + Integer.hashCode(this.mode);
    }

    public String toString() {
        return "CMCDProps(cmcdObject=" + this.cmcdObject + ", cmcdRequest=" + this.cmcdRequest + ", cmcdSession=" + this.cmcdSession + ", cmcdStatus=" + this.cmcdStatus + ", mode=" + this.mode + ")";
    }
}
