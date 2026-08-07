package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0010\u001a\u00020\f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b&\u0010#R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R&\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R&\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R&\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0017\u00107\u001a\u0002038\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lg20/k;", "", "<init>", "()V", "", "", "", "Lg20/i;", "schemaRegistry", "", "schemas", "stateMachine", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/util/List;Lg20/i;)V", "", "k", "b", "(Lg20/i;)V", "identifier", "", "l", "(Ljava/lang/String;)Z", "Lo20/f;", "event", "Lg20/m;", "m", "(Lo20/f;)Lg20/m;", "h", "(Lo20/f;)Ljava/util/List;", "Lg20/h;", "Lr20/b;", "g", "(Lg20/h;)Ljava/util/List;", "c", "(Lg20/h;)Z", "e", "(Lg20/h;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/HashMap;", "a", "Ljava/util/HashMap;", "identifierToStateMachine", "stateMachineToIdentifier", "eventSchemaToStateMachine", "eventSchemaToEntitiesGenerator", "eventSchemaToPayloadUpdater", "f", "eventSchemaToAfterTrackCallback", "eventSchemaToFilter", "eventSchemaToEventsBefore", "Lg20/l;", "Lg20/l;", "j", "()Lg20/l;", "trackerState", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f67133k = k.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, i> identifierToStateMachine = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<i, String> stateMachineToIdentifier = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToStateMachine = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToEntitiesGenerator = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToPayloadUpdater = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToAfterTrackCallback = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToFilter = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, List<i>> eventSchemaToEventsBefore = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l trackerState = new l();

    private final void d(Map<String, List<i>> schemaRegistry, List<String> schemas, i stateMachine) {
        for (String str : schemas) {
            List<i> linkedList = schemaRegistry.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                schemaRegistry.put(str, linkedList);
            }
            linkedList.add(stateMachine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List stateMachines, h event) {
        s.k(stateMachines, "$stateMachines");
        s.k(event, "$event");
        Iterator it = stateMachines.iterator();
        while (it.hasNext()) {
            ((i) it.next()).i(event);
        }
    }

    private final void k(Map<String, ? extends List<i>> schemaRegistry, List<String> schemas, i stateMachine) {
        Iterator<String> it = schemas.iterator();
        while (it.hasNext()) {
            List<i> list = schemaRegistry.get(it.next());
            if (list != null) {
                list.remove(stateMachine);
            }
        }
    }

    public final synchronized void b(i stateMachine) {
        try {
            s.k(stateMachine, "stateMachine");
            i iVar = this.identifierToStateMachine.get(stateMachine.getIdentifier());
            if (iVar != null) {
                if (s.f(stateMachine.getClass(), iVar.getClass())) {
                    return;
                } else {
                    l(stateMachine.getIdentifier());
                }
            }
            this.identifierToStateMachine.put(stateMachine.getIdentifier(), stateMachine);
            this.stateMachineToIdentifier.put(stateMachine, stateMachine.getIdentifier());
            d(this.eventSchemaToStateMachine, stateMachine.c(), stateMachine);
            d(this.eventSchemaToEntitiesGenerator, stateMachine.j(), stateMachine);
            d(this.eventSchemaToPayloadUpdater, stateMachine.k(), stateMachine);
            d(this.eventSchemaToAfterTrackCallback, stateMachine.l(), stateMachine);
            d(this.eventSchemaToFilter, stateMachine.g(), stateMachine);
            d(this.eventSchemaToEventsBefore, stateMachine.d(), stateMachine);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean c(h event) {
        int i11;
        Map<String, Object> mapH;
        try {
            s.k(event, "event");
            LinkedList<i> linkedList = new LinkedList();
            List<i> list = this.eventSchemaToPayloadUpdater.get(event.getSchema());
            if (list != null) {
                linkedList.addAll(list);
            }
            List<i> list2 = this.eventSchemaToPayloadUpdater.get(Marker.ANY_MARKER);
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            i11 = 0;
            for (i iVar : linkedList) {
                String str = this.stateMachineToIdentifier.get(iVar);
                if (str != null && (mapH = iVar.h(event, event.getState().a(str))) != null && !event.a(mapH)) {
                    i11++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i11 == 0;
    }

    public final synchronized void e(final h event) {
        try {
            s.k(event, "event");
            String schema = event.getSchema();
            if (schema == null) {
                schema = event.getName();
            }
            final LinkedList linkedList = new LinkedList();
            List<i> list = this.eventSchemaToAfterTrackCallback.get(schema);
            if (list != null) {
                linkedList.addAll(list);
            }
            List<i> list2 = this.eventSchemaToAfterTrackCallback.get(Marker.ANY_MARKER);
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            if (!linkedList.isEmpty()) {
                z10.g.d(f67133k, new Runnable() { // from class: g20.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.f(linkedList, event);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized List<r20.b> g(h event) {
        LinkedList linkedList;
        List<r20.b> listE;
        try {
            s.k(event, "event");
            String schema = event.getSchema();
            if (schema == null) {
                schema = event.getName();
            }
            linkedList = new LinkedList();
            LinkedList<i> linkedList2 = new LinkedList();
            List<i> list = this.eventSchemaToEntitiesGenerator.get(schema);
            if (list != null) {
                linkedList2.addAll(list);
            }
            List<i> list2 = this.eventSchemaToEntitiesGenerator.get(Marker.ANY_MARKER);
            if (list2 != null) {
                linkedList2.addAll(list2);
            }
            for (i iVar : linkedList2) {
                String str = this.stateMachineToIdentifier.get(iVar);
                if (str != null && (listE = iVar.e(event, event.getState().a(str))) != null) {
                    linkedList.addAll(listE);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedList;
    }

    public final synchronized List<o20.f> h(o20.f event) {
        LinkedList linkedList;
        List<o20.f> listM;
        try {
            s.k(event, "event");
            linkedList = new LinkedList();
            if (event instanceof o20.c) {
                LinkedList<i> linkedList2 = new LinkedList();
                List<i> list = this.eventSchemaToEventsBefore.get(((o20.c) event).getSchema());
                if (list != null) {
                    linkedList2.addAll(list);
                }
                List<i> list2 = this.eventSchemaToEventsBefore.get(Marker.ANY_MARKER);
                if (list2 != null) {
                    linkedList2.addAll(list2);
                }
                for (i iVar : linkedList2) {
                    if (this.stateMachineToIdentifier.get(iVar) != null && (listM = iVar.m(event)) != null) {
                        linkedList.addAll(listM);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedList;
    }

    public final synchronized boolean i(h event) {
        try {
            s.k(event, "event");
            String schema = event.getSchema();
            if (schema == null) {
                schema = event.getName();
            }
            LinkedList<i> linkedList = new LinkedList();
            List<i> list = this.eventSchemaToFilter.get(schema);
            if (list != null) {
                linkedList.addAll(list);
            }
            List<i> list2 = this.eventSchemaToFilter.get(Marker.ANY_MARKER);
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            for (i iVar : linkedList) {
                String str = this.stateMachineToIdentifier.get(iVar);
                if (str != null && s.f(iVar.b(event, event.getState().a(str)), Boolean.FALSE)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final l getTrackerState() {
        return this.trackerState;
    }

    public final synchronized boolean l(String identifier) {
        s.k(identifier, "identifier");
        i iVarRemove = this.identifierToStateMachine.remove(identifier);
        if (iVarRemove == null) {
            return false;
        }
        this.stateMachineToIdentifier.remove(iVarRemove);
        this.trackerState.e(identifier);
        k(this.eventSchemaToStateMachine, iVarRemove.c(), iVarRemove);
        k(this.eventSchemaToEntitiesGenerator, iVarRemove.j(), iVarRemove);
        k(this.eventSchemaToPayloadUpdater, iVarRemove.k(), iVarRemove);
        k(this.eventSchemaToAfterTrackCallback, iVarRemove.l(), iVarRemove);
        k(this.eventSchemaToFilter, iVarRemove.g(), iVarRemove);
        k(this.eventSchemaToEventsBefore, iVarRemove.d(), iVarRemove);
        return true;
    }

    public final synchronized m m(o20.f event) {
        try {
            s.k(event, "event");
            if (event instanceof o20.c) {
                LinkedList<i> linkedList = new LinkedList();
                List<i> list = this.eventSchemaToStateMachine.get(((o20.c) event).getSchema());
                if (list != null) {
                    linkedList.addAll(list);
                }
                List<i> list2 = this.eventSchemaToStateMachine.get(Marker.ANY_MARKER);
                if (list2 != null) {
                    linkedList.addAll(list2);
                }
                for (i iVar : linkedList) {
                    String str = this.stateMachineToIdentifier.get(iVar);
                    g gVar = new g(event, str != null ? this.trackerState.c(str) : null, iVar);
                    if (str != null) {
                        this.trackerState.d(str, gVar);
                    }
                    gVar.a();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.trackerState.b();
    }
}
