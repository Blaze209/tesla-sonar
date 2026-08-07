package n2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Ln2/i;", "", "<init>", "()V", "Ln2/h;", "indicationInstance", "Ln2/k;", "rippleHostView", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ln2/h;Ln2/k;)V", "b", "(Ln2/h;)Ln2/k;", "a", "(Ln2/k;)Ln2/h;", "c", "(Ln2/h;)V", "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<h, k> indicationToHostMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<k, h> hostToIndicationMap = new LinkedHashMap();

    public final h a(k rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }

    public final k b(h indicationInstance) {
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void c(h indicationInstance) {
        k kVar = this.indicationToHostMap.get(indicationInstance);
        if (kVar != null) {
            this.hostToIndicationMap.remove(kVar);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void d(h indicationInstance, k rippleHostView) {
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }
}
