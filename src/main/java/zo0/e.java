package zo0;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f128469c = Logger.getLogger("net.sf.scuba");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f128470d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection<b> f128471a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f128472b = 0;

    static {
        HashMap map = new HashMap();
        f128470d = map;
        map.put("javax.smartcardio.CardTerminal", "net.sf.scuba.smartcards.TerminalCardService");
        map.put("sun.security.smartcardio.TerminalImpl", "net.sf.scuba.smartcards.TerminalCardService");
        map.put("android.nfc.tech.IsoDep", "net.sf.scuba.smartcards.IsoDepCardService");
    }

    public void a(b bVar) {
        Collection<b> collection = this.f128471a;
        if (collection == null || bVar == null) {
            return;
        }
        collection.add(bVar);
    }

    public Collection<b> b() {
        return Collections.unmodifiableCollection(this.f128471a);
    }

    public abstract boolean c(Exception exc);

    protected void d(a aVar) {
        Collection<b> collection = this.f128471a;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Iterator<b> it = this.f128471a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    public abstract void e();

    public abstract j f(f fVar);
}
