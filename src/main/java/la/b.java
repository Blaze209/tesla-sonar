package la;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p011ja.b0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.q;
import to0.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lla/b;", "", "T", "Luo0/b;", "Lro0/d;", "serializer", "", "", "Lja/b0;", "typeMap", "<init>", "(Lro0/d;Ljava/util/Map;)V", "value", "Ljn0/h0;", "L", "(Ljava/lang/Object;)V", "", "K", "(Ljava/lang/Object;)Ljava/util/Map;", "Lro0/q;", "s", "(Lro0/q;Ljava/lang/Object;)V", "Lto0/f;", "descriptor", "", "index", "", "H", "(Lto0/f;I)Z", "J", "w", "()V", "a", "Lro0/d;", "b", "Ljava/util/Map;", "Lyo0/c;", "c", "Lyo0/c;", "()Lyo0/c;", "serializersModule", "", DateTokenConverter.CONVERTER_KEY, "map", "e", "I", "elementIndex", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> extends uo0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b0<Object>> typeMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo0.c serializersModule;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> map;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int elementIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public b(d<T> serializer, Map<String, ? extends b0<Object>> typeMap) {
        s.k(serializer, "serializer");
        s.k(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = yo0.d.a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void L(Object value) {
        String strF = this.serializer.getDescriptor().f(this.elementIndex);
        b0<Object> b0Var = this.typeMap.get(strF);
        if (b0Var != null) {
            this.map.put(strF, b0Var instanceof p011ja.c ? ((p011ja.c) b0Var).l(value) : v.e(b0Var.i(value)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strF + ". Please provide NavType through typeMap.").toString());
    }

    @Override // uo0.b
    public boolean H(f descriptor, int index) {
        s.k(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    @Override // uo0.b
    public void J(Object value) {
        s.k(value, "value");
        L(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> K(Object value) {
        s.k(value, "value");
        super.s(this.serializer, value);
        return v0.A(this.map);
    }

    @Override // uo0.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // uo0.b, uo0.f
    public <T> void s(q<? super T> serializer, T value) {
        s.k(serializer, "serializer");
        L(value);
    }

    @Override // uo0.b, uo0.f
    public void w() {
        L(null);
    }
}
